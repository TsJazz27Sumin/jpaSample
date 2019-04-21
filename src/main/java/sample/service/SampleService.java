package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import sample.model.Worker;
import sample.repository.SampleJpa;

@Service
@EnableTransactionManagement
public class SampleService {

	@Autowired
	SampleJpa sampleJpa;
	
	public void Execute() {
		
		//初期登録
		sampleJpa.saveAndFlush(new Worker("0001", "k.jarrett", 73, "music"));
		
		//検索
		List<Worker> workerList = sampleJpa.findAll();
		
		//更新
		for (Worker worker : workerList){

			System.out.println(
            		String.format(
            				"id:%s name:%s age:%d department:%s",
            				worker.getId(), worker.getName(), worker.getAge(), worker.getDepartment()
            				)
            		);
			
			worker.setAge(worker.getAge() + 1);
			sampleJpa.save(worker);
		}
		sampleJpa.flush();
		
		//検索
		workerList = sampleJpa.findAll();
		
		//削除
		for (Worker worker : workerList){

			System.out.println(
            		String.format(
            				"id:%s name:%s age:%d department:%s",
            				worker.getId(), worker.getName(), worker.getAge(), worker.getDepartment()
            				)
            		);
			sampleJpa.delete(worker);
		}
		sampleJpa.flush();
		
		//検索
		workerList = sampleJpa.findAll();
		
		if(workerList.size() == 0) {
			System.out.println("count = 0");
		}
		
		
	}
}
