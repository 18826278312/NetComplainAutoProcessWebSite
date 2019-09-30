package com.example.mapper;

import org.springframework.stereotype.Repository;

import com.example.entity.Ticket;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface TicketMapper extends Mapper<Ticket> {
}