import java.util.Dictionary;
import java.util.Hashtable;

public class AfflictionSystem {
    
    AfflictionSystem() {
        
        Dictionary<String, String> affliction_descriptions = new Hashtable<> ();
    
        affliction_descriptions.put("cholera_description",           "Any of several diseases usually marked by severe vomiting and diarrhea.");
        affliction_descriptions.put("common_cold_description",       "A contagious viral illness of the structures used in breathing which cause the nose and throat to be sore, swollen, and inflamed an in which there is usually much mucus and coughing and sneezing.");
        affliction_descriptions.put("diphtheria_description",        "A contagious bacterial disease with fever in which the air passages become coated with a membranous layer that often obstructs breathing.");
        affliction_descriptions.put("dysentery_description",         "A disease characterized by severe diarrhea with passage of mucus and blood from the bowels.");
        affliction_descriptions.put("hookworm_disease_description",  "A diseased state marked by blood loss, paleness, and weakness due to hookworms in the intestine.");
        affliction_descriptions.put("influenza_description",         "A very contagious virus disease with fever, exhaustion, severe aches and pains, and inflammation of the respiratory tract.");
        affliction_descriptions.put("malaria_description",           "A disease caused by protozoan parasites in the red blood cells, passed from one individual to another by bite of the mosquitoes, and marked by periodic attacks of chills and fever.");
        affliction_descriptions.put("measles_description",           "A contagious disease caused by a virus and marked by fever and red spots on the skin.");
        affliction_descriptions.put("mumps_description",             "An acute contagious virus disease caused by a papillomavirus and marked by fever and by swelling especially of the parotid gland.");
        affliction_descriptions.put("parasite_description",          "An organism living in, on, or with another organism in order to obtain nutrients, grow, or multiply often in a state that directly or indirectly harms the host.");
        affliction_descriptions.put("pleurisy_description",          "Inflammation of the pleura that is typically characterized by sudden onset, painful and difficult respiration, and exudation of fluid or fibrous material into the pleural cavity.");
        affliction_descriptions.put("scarlet_fever_description",     "An acute contagious febrile disease caused by hydrolytic Group A streptococci and characterized by inflammation of the nose, throat, and mouth, generalized toxemia, and a red rash.");
        affliction_descriptions.put("smallpox_description",          "An acute contagious febrile disease of humans that is caused by a pox-virus, is characterized by a skin eruption with pustules, sloughing, and scar formation.");
        affliction_descriptions.put("syphilis_description",          "A chronic contagious usually venereal and often congenital disease caused by a spirochete and if left untreated producing chancres, rashes, and systemic lesions with three stages continued over many years.");
        affliction_descriptions.put("typhoid_fever_description",     "A communicable disease marked especially by fever, diarrhea, prostration, headache, and intestinal inflammation and caused by a bacterium.");
        affliction_descriptions.put("typhus_description",            "A severe human febrile disease that is caused by one transmitted especially by body lice and is marked by high fever, stupor alternating with delirium, intense headache, and a dark red rash.");
        affliction_descriptions.put("whooping_cough_description",    "An infections respiratory disease especially of children caused by a bacterium and marked by a convulsive spasmodic cough sometimes followed by a crowing intake of breath.");
        affliction_descriptions.put("yellow_fever_description",      "An acute infections disease that is marked by symptoms (such as fever, muscle pain, and headache) of sudden onset which typically resolves within a few days but are sometimes followed by more serious symptoms (such as jaundice, high fever, and hemorrhage), and is caused by a virus transmitted especially by the yellow-fever mosquito.");
        
        Dictionary<String, Boolean> afflictions_present = new Hashtable<> ();

        afflictions_present.put("cholera_present",          false);
        afflictions_present.put("common_cold_present",      false);
        afflictions_present.put("diphtheria_present",        false);
        afflictions_present.put("dysentery_present",        false);
        afflictions_present.put("hookworm_disease_present", false);
        afflictions_present.put("influenza_present",        false);
        afflictions_present.put("malaria_present",          false);
        afflictions_present.put("measles_present",          false);
        afflictions_present.put("mumps_present",            false);
        afflictions_present.put("parasite_present",         false);
        afflictions_present.put("pleurisy_present",         false);
        afflictions_present.put("scarlet_fever_present",    false);
        afflictions_present.put("smallpox_present",         false);
        afflictions_present.put("syphilis_present",         false);
        afflictions_present.put("typhoid_fever_present",    false);
        afflictions_present.put("whooping_cough_present",   false);
        afflictions_present.put("yellow_fever_present",     false);

        Dictionary<String, Integer> afflictions_progression = new Hashtable<> ();

         
        afflictions_progression.put("cholera_present",          0);
        afflictions_progression.put("common_cold_present",      0);
        afflictions_progression.put("diphtheria_present",        0);
        afflictions_progression.put("dysentery_present",        0);
        afflictions_progression.put("hookworm_disease_present", 0);
        afflictions_progression.put("influenza_present",        0);
        afflictions_progression.put("malaria_present",          0);
        afflictions_progression.put("measles_present",          0);
        afflictions_progression.put("mumps_present",            0);
        afflictions_progression.put("parasite_present",         0);
        afflictions_progression.put("pleurisy_present",         0);
        afflictions_progression.put("scarlet_fever_present",    0);
        afflictions_progression.put("smallpox_present",         0);
        afflictions_progression.put("syphilis_present",         0);
        afflictions_progression.put("typhoid_fever_present",    0);
        afflictions_progression.put("whooping_cough_present",   0);
        afflictions_progression.put("yellow_fever_present",     0);
    
    }
}
