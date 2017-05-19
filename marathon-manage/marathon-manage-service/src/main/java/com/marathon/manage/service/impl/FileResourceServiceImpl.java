package com.marathon.manage.service.impl;

import com.marathon.manage.mapper.ActivityFileResourceMapper;
import com.marathon.manage.pojo.ActivityFileResource;
import com.marathon.manage.service.FileResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by cui on 2017/5/19.
 */
@Service("FileResourceService")
public class FileResourceServiceImpl implements FileResourceService {

    @Autowired
    private ActivityFileResourceMapper fileResourceMapper;

    @Override
    public int addFileResource(ActivityFileResource fileResource) {
        if (fileResource.getFileResourceId() == null) {
            fileResource.setFileResourceId(UUID.randomUUID().toString());
        }
        return fileResourceMapper.insertSelective(fileResource);
    }
}
