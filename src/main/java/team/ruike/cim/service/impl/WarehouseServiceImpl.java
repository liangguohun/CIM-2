package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.WarehouseDao;
import team.ruike.cim.pojo.Warehouse;
import team.ruike.cim.service.WarehouseService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;
@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    private WarehouseDao warehouseDao;

    /**
     * 查询所有物料仓库
     *
     * @return
     */
    public List<Warehouse> getwarehouses(Warehouse warehouse,Pager<Warehouse> pager) {
        return warehouseDao.select(warehouse,pager.getCurrentPage(),pager.getPageSize());
    }

    /**
     * 添加物料仓库
     *
     * @param warehouse
     * @return
     */
    public int addwarehouse(Warehouse warehouse) {
        if (warehouse != null && warehouse.getUser() != null && warehouse.getUser().getUserId() > 0 && warehouse.getWarehouseName() != "") {
            return warehouseDao.add(warehouse);
        }
        return 0;
    }

    /**
     * 修改物料仓库
     *
     * @param warehouse
     * @return
     */
    public int updwarehouse(Warehouse warehouse) {
        if (warehouse != null && warehouse.getUser() != null && warehouse.getUser().getUserId() > 0 && warehouse.getWarehouseName() != "") {
            return warehouseDao.update(warehouse);
        }
        return 0;
    }

    /**
     * 查询总数
     *
     * @param warehouse
     * @return
     */
    public int count(Warehouse warehouse) {
        return warehouseDao.selectCount(warehouse);
    }
}
