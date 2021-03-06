package com.workloadaccount.app.mapper;

import com.workloadaccount.app.entity.WorkloadRecordDO;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.util.List;

/**
 * @author
 * @description
 * @see
 * @since
 */
@Mapper
public interface WorkloadRecordDao {

    /**
     * 插入工作量统计
     * @param workloadLogDO
     */
    void insertWorkload(List<WorkloadRecordDO> workloadLogDO);

    /**
     * 获取早期的用户记录的数据
     * @param startDate
     * @param endDate
     * @param userid
     * @return
     */
    List<WorkloadRecordDO> listEarlyData(String startDate, String endDate, String userid);

    // 根据项目查数据 start
    /**
     * 查询项目下的所有用户
     * @param projectId
     * @return
     */
    List<String> listUserByProjectId(Integer projectId, String year);

    /**
     * 根据id查询工作时长
     * @param projectId
     * @return
     */
    List<WorkloadRecordDO> listWorkloadByUserAndProjectId(String userId, Integer projectId, String year);

    /**
     * 查询所有的记录的项目
     * @param workloadDate
     * @return
     */
    List<Integer> listProjectByWorkload(String workloadDate);
    // 根据项目查数据 end

    // 根据用户查工作量 start
    /**
     * 查询workload中的所有用户
     * @return
     */
    List<String> listUserByWorkload(String workloadDate);

    /**
     * 根据用户和时间获取用户的工作时间
     * @param userId
     * @param workloadDate
     * @return
     */
    List<WorkloadRecordDO> listWorkloadByUserIdAndDate(String userId, String workloadDate);
    // 根据用户查工作量 end
}
