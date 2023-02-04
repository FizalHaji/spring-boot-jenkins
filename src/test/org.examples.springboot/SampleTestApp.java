package org.examples.springboot;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBootAppTest {

    public static Logger logger = LoggerFactory.getLogger(SpringBootAppTest.class);

    @Test
    public void contextLoads(){
        logger.info("Test Case Executing");
        logger.info("Test Case Executing :Line 2");
        assertEquals(true, true);
    }
}