package com.basic.boot.api.service;

import com.yjk.dsb.api.dao.SampleDao;
import com.yjk.dsb.api.model.sample.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SampleServiceImpl.
 *
 * @author yjkim@ntels.com
 */
@Service
public class SampleServiceImpl implements SampleService {
    /**
     * Logger.
     */
    private static Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);

    /**
     * SampleDao.
     */
    @Autowired
    SampleDao sampleDao;

    @Override
    public Sample getSample() {
        logger.debug("GET_SAMPLE_SERVICE_LOGIC");
        Sample sample = sampleDao.getSample();
        return sample;
    }

    @Override
    public void addSample() {

    }

    @Override
    public void modifySample() {

    }

    @Override
    public void removeSample() {

    }
}
