package red.appl.esi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import red.appl.esi.client.*;
import red.appl.esi.client.api.*;
import red.appl.esi.client.model.*;

import java.util.List;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public GetCharactersCharacterIdOk searchSkye() {
        //var esiSearch = new SearchApi();
        var esiCharacter = new CharacterApi();

        //GetSearchOk result = null;
        GetCharactersCharacterIdOk skye = null;

        try {
            //result = esiSearch.getSearch(List.of("character"), "Skye Cloudstrike", "en-US", "tranquility", null, null, null);
            skye = esiCharacter.getCharactersCharacterId(390496187, "tranquility", null);
        } catch (ApiException e) {
            e.printStackTrace();
        }

        return skye;
    }

}
