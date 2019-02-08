package com.bonobono.web03.service;

import java.util.List;

import org.apache.ibatis.javassist.tools.reflect.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonobono.web03.mapper.SampleMapper;
import com.bonobono.web03.vo.sample;

@Service
public class SampleService {
	
	
	@Autowired private SampleMapper sampleMapper;
	
	public List<sample> getSampleList(){
		
		return null;
				
	}
	
	public sample Getsample() {
		
		return null;
	}
	
	public int addSample(Sample sample) {
		
		return 0;
	}
	
	public int removeSample(Sample sample) {
		
		return 0;
	}
	
	public int modifySample(Sample sample) {
		
		return 0;
	}

}
