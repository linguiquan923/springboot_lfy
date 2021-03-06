package com.atlgq.springboot.service.impl;

import com.atlgq.springboot.mapper.EmployeeMapper;
import com.atlgq.springboot.pojo.Employee;
import com.atlgq.springboot.service.EmployeeService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeImpl implements EmployeeService
{
    @Resource
    private EmployeeMapper mapper;
    @Override
    public Integer insertEmployee(Employee employee) {
        return mapper.insertEmployee(employee);
    }

    /**
     * 将运行的方法进行缓存；以后要用相同的数据时，直接从缓存中获取，不用调用方法
     *
     * CacheManager管理多个Cache组件的，对缓存的真正CRUD操作在Cache组件中，每一个缓存组件都有自己唯一的名字；
     * 几个属性：
     *      cacheName/value；指定缓存的名字
     *      key：缓存数据使用的key；可以用它来制定。默认是使用方法参数的值，1-方法的返回值
     *          编写SpEL：#id；参数id的值 #a0 #p0 #root.args[0]
     *      keyGenerator：key的生成器；可以自己指定key的生成器的组件id
     *          key/keyGenerator：两者只能二选一
     *      cacheManager：指定缓存管理器；或者cacheResolver指定获取解析器
     *      condition：判断符合条件的情况下缓存；
     *      unless：否定缓存；当unless指定的条件为true，方法的返回值就不会被缓存；可以获取到结果进行判断
     *
     *      sync：是否使用异步缓存
     *
     * 原理：
     *      1、自动配置类：CacheAutoConfiguration
     *      2、缓存的配置类(略)
     *      3、哪个配置类默认生效
     *          SimpleCacheConfiguration
     *      4、给容器中注册了一个CacheManager：ConcurrentMapCacheManager
     *      5、可以获取和创建ConcurrentMapCache类型的缓存组件；它的作用将数据保存在ConcurrentMap中；
     *
     *      运行流程：
     *      @Cacheable：
     *      1、方法运行之前，先去查询Cache(缓存组件)，按照cacheNames指定的名字获取；
     *      （CacheManager先获取相应的缓存），第一次获取缓存如果没有缓存会先自动创建缓存
     *      2、去Cache中查找缓存的内容，使用一个key，默认就是方法的参数；
     *          key是按照某种策略生成的；默认是使用keyGenerator生成的，默认使用SimpleKeyGenerator生成key
     *              SimpleKeyGenerator生成key的策略；
     *                  如果没有参数：key=new SimpleKey();
     *                  如果有一个参数：key=参数的值
     *                  如果有多个参数：key=new SimpleKey(params)；
     *      3、没有查到缓存就调用目标方法；
     *      4、将目标方法返回的结果，放进缓存中
     *
     *      @Cache标注的方法执行之前先来检查缓存中有没有这个数据，默认按照参数的值作为key去查询缓存；
     *      如果没有缓存的话就运行并将结果放入缓存当中；以后再来调用就可以直接使用缓存中的数据；
     *
     *      核心：
     *          1）、使用CacheManager[ConcurrentMapCacheManager]按照名字得到Cache[ConcurrentMapCache]组件
     *          2）、key使用keyGenerator生成的，默认使用的是SimpleKeyGenerator
     *
     * @param id
     * @return
     */
//    @Cacheable(cacheNames = {"emp"},key = "#id",condition = "#id > 0",unless = "#result == null")

    @Cacheable(cacheNames = {"emp"},condition = "#id > 1",unless = "#a0 == 2")
    @Override
    public Employee queryEmployeeById(Integer id) {
        System.out.println("查询" + id + "....");
        return mapper.queryEmployeeById(id);
    }

    @Override
    public Integer deleteEmployeeById(Integer id) {
        return mapper.deleteEmployeeById(id);
    }

    @Override
    public Integer updateEmployeeById(Integer id, String lastName) {
        return mapper.updateEmployeeById(id,lastName);
    }
}
