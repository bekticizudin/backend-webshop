package com.zavrsniprojekat.ZavrsniProjekat.Controller;

    import com.zavrsniprojekat.ZavrsniProjekat.Models.Start;
    import com.zavrsniprojekat.ZavrsniProjekat.Repo.StartRepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

@RestController
    public class StartController {
    @Autowired
    private StartRepo startRepo;

    @GetMapping(value = "/start")
    public List<Start> getMembers() {
        return startRepo.findAll();
    }

    }
