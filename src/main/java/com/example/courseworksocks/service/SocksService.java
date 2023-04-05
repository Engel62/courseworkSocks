package com.example.courseworksocks.service;

import com.example.courseworksocks.model.Color;
import com.example.courseworksocks.model.Size;
import com.example.courseworksocks.model.Socks;

public interface SocksService {

    Socks addSocks(Socks socks, long quantity);

    Socks editSocks(Socks socks, long quantity);

    long getSocksNumByParam(Color color, Size size, int cottonMin, int cottonMax);

    boolean deleteSocks(Socks socks, long quantity);
}