package cn.edu.bupt.product_service.service.impl;

import cn.edu.bupt.product_service.domain.Product;
import cn.edu.bupt.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> daoMap = new HashMap<>();

    /**
     * 模拟数据
     */
    static {
        Product p = new Product(1, "iphonex", 9999, 10);
        Product p1 = new Product(2, "冰箱", 5324, 30);
        Product p2 = new Product(3, "洗衣机", 5425, 510);
        Product p3 = new Product(4, "电视", 3456, 150);
        Product p4 = new Product(5, "电话", 7654, 160);
        Product p5 = new Product(6, "汽车", 345678, 610);
        Product p6 = new Product(7, "椅子", 6543, 106);
        Product p7 = new Product(8, "Java编程思想", 2342, 60);

        daoMap.put(p.getId(), p);
        daoMap.put(p1.getId(), p1);
        daoMap.put(p2.getId(), p2);
        daoMap.put(p3.getId(), p3);
        daoMap.put(p4.getId(), p4);
        daoMap.put(p5.getId(), p5);
        daoMap.put(p6.getId(), p6);
        daoMap.put(p7.getId(), p7);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
