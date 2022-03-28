package top.hcode.hoj.dao.group;

import top.hcode.hoj.pojo.entity.group.GroupMember;
import top.hcode.hoj.pojo.vo.GroupMemberVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: LengYun
 * @Date: 2022/3/11 13:36
 * @Description:
 */
public interface GroupMemberEntityService extends IService<GroupMember> {
    IPage<GroupMemberVo> getMemberList(int limit, int currentPage, String keyword, Integer auth, Long gid);
    IPage<GroupMemberVo> getApplyList(int limit, int currentPage, String keyword, Integer auth, Long gid);
}
