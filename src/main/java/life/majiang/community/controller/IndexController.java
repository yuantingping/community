package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: HelloController
 * Package: life.majiang.community.controller
 * Description:
 *
 * @Date: 2019/7/31 15:10
 * @Author: yuanting
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {

        return "index";
    }
}
