package com.yjk.dsb.api.controller.sample;

import com.yjk.dsb.api.model.ApiResponse;
import com.yjk.dsb.api.model.sample.Sample;
import com.basic.boot.api.service.SampleService;
import com.yjk.dsb.api.util.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * SampleController.
 *
 * @author yjkim@ntels.com
 */
@RestController
@RequestMapping(headers = "Accept=application/json")
public class SampleController {
    /**
     * Logger.
     */
    private static Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    SampleService sampleService;

    /**
     * MessageUtil.
     */
    @Autowired
    private MessageUtil messageUtil;

    /**
     * Sample 조회.
     * @return ApiResponse
     */
    @GetMapping(value = "/sample")
    public ApiResponse getSample() {
        logger.debug("GET_SAMPLE_STARTED");
        Sample sample = sampleService.getSample();
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setResultData(sample);
        return apiResponse;
    }

    /**
     * Sample 등록.
     * @param sample Sample 정보.
     * @return ApiResponse
     */
    @PostMapping(value = "/sample")
    public ApiResponse addSample(@RequestBody Sample sample) {
        logger.debug("SAMPLE >>> " + sample);
        if(sample.getSample() == null) {
        }
        sampleService.addSample();
        ApiResponse apiResponse = new ApiResponse();
        return apiResponse;
    }

    /**
     * Sample 수정.
     */
    @PutMapping(value = "/sample")
    public void modifySample() {
        sampleService.modifySample();
    }

    /**
     * Sample 삭제.
     */
    @DeleteMapping(value = "/sample")
    public void removeSample() {
        sampleService.removeSample();
    }
}
