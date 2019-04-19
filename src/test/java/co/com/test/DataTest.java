package co.com.test;

import org.junit.Test;

import co.com.test.domains.models.StatusModel;
import reactor.core.publisher.Mono;

public class DataTest {

	@Test
	public void test() {
		
		Mono<StatusModel> a = Mono.just(new StatusModel()).then().cast(StatusModel.class);
		a.map(as -> {
			System.out.println(as.getMensaje() + " sss ");
			return as;
		}).subscribe();
	}

}
