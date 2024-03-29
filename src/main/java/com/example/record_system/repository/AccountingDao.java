package com.example.record_system.repository;

import com.example.record_system.entity.Accounting;
import com.example.record_system.vo.response.SearchAccountingResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public interface AccountingDao extends JpaRepository<Accounting, Integer> {

//    @Transactional
//    @Modifying
//    @Query(value = "SELECT a.USER_ID " +
//            "       ,b.CTG_NAM " +
//            "       ,a.THING " +
//            "       ,a.COST " +
//            "       ,a.DATE " +
//            "       ,a.YNREQUIRE " +
//            " FROM record_system.accounting a " +
//            " JOIN category b on a.USER_ID = b.USER_ID " +
//            " and a.CATEGORY_ID = b.ID " +
//            "    where  (a.DATE is NULL OR a.DATE >= :dateS) " +
//            "    and (a.DATE is NULL OR a.DATE <= :dateE) ", nativeQuery = true)
//    public List<SearchAccountingResponse> searchAccountingByConditions(
//            @Param("dateS") String dateS,
//            @Param("dateE") String dateE
//    );
    @Transactional
    @Modifying
    @Query(value = "SELECT a.USER_ID " +
            "       ,b.CTG_NAM " +
            "       ,a.THING " +
            "       ,a.COST " +
            "       ,a.DATE " +
            "       ,a.YNREQUIRE " +
            " FROM record_system.accounting a " +
            " JOIN category b on a.USER_ID = b.USER_ID " +
            " and a.CATEGORY_ID = b.ID " +
            "    where  if(:dateS !='',a.DATE >= :dateS ,1=1 )  " +
            "    and    if(:dateE !='',a.DATE <= :dateE ,1=1 ) " +
            "    and    if(:thing !='',a.THING like concat('%',:thing,'%') , 1=1) " +
            "    and    if(:cost  !='' , a.COST >= :cost ,1=1) " +
            "    and    if(:ynRequire !='', a.YNREQUIRE = :ynRequire , 1=1 ) " +
            "    and    if(:ctgId != '' , a.CATEGORY_ID = :ctgId , 1=1 ) ", nativeQuery = true)
    public List<Map<String,Objects>> searchAccountingByConditions(
            @Param("dateS") String dateS,
            @Param("dateE") String dateE,
            @Param("thing") String thing,
            @Param("cost") Integer cost,
            @Param("ynRequire") String ynRequire,
            @Param("ctgId") Integer ctgId);
}
