class AfflictionSystem:
    def __init__(self):
        self.afflictionDescriptions = {
            "cholera": """"Any of several diseases usually marked by severe vomiting and diarrhea.""",
            "common_cold": """A contagious viral illness of the structures used in breathing which cause the nose and 
            throat to be sore, swollen, and inflamed an in which there is usually much mucus and coughing and 
            sneezing.""",
            "diphtheria": """A contagious bacterial disease with fever in which the air passages become coated with a 
            membranous layer that often obstructs breathing""",
            "dysentery": """"A disease characterized by severe diarrhea with passage of mucus and blood from the 
            bowels.""",
            "hookworm_disease": """A diseased state marked by blood loss, paleness, and weakness due to hookworms in the 
            intestine""",
            "influenza": """"A very contagious virus disease with fever, exhaustion, severe aches and pains, and 
            inflammation of the respiratory tract.""",
            "malaria": """A disease caused by protozoan parasites in the red blood cells, passed from one individual to 
            another by bite of the mosquitoes, and marked by periodic attacks of chills and fever.""",
            "measles": """"A contagious disease caused by a virus and marked by fever and red spots on the skin.""",
            "mumps": """An acute contagious virus disease caused by a papillomavirus and marked by fever and by swelling 
            especially of the parotid gland.""",
            "parasite": """"An organism living in, on, or with another organism in order to obtain nutrients, grow, or 
            multiply often in a state that directly or indirectly harms the host.""",
            "pleurisy": """"Inflammation of the pleura that is typically characterized by sudden onset, painful and 
            difficult respiration, and exudation of fluid or fibrous material into the pleural cavity.""",
            "scarlet_fever": """An acute contagious febrile disease caused by hydrolytic Group A streptococci and 
            characterized by inflammation of the nose, throat, and mouth, generalized toxemia, and a red rash.""",
            "smallpox": """An acute contagious febrile disease of humans that is caused by a pox-virus, is characterized 
            by a skin eruption with pustules, sloughing, and scar formation.""",
            "syphilis": """"A chronic contagious usually venereal and often congenital disease caused by a spirochete 
            and if left untreated producing chancres, rashes, and systemic lesions with three stages continued over many 
            years.""",
            "typhoid_fever": """A communicable disease marked especially by fever, diarrhea, prostration, headache, and 
            intestinal inflammation and caused by a bacterium.""",
            "typhus": """"A severe human febrile disease that is caused by one transmitted especially by body lice and 
            is marked by high fever, stupor alternating with delirium, intense headache, and a dark red rash.""",
            "whooping_cough": """An infections respiratory disease especially of children caused by a bacterium and 
            marked by a convulsive spasmodic cough sometimes followed by a crowing intake of breath.""",
            "yellow_fever": """"An acute infections disease that is marked by symptoms (such as fever, muscle pain, and 
            headache) of sudden onset which typically resolves within a few days but are sometimes followed by more 
            serious symptoms (such as jaundice, high fever, and hemorrhage), and is caused by a calicivirus 
            transmitted especially by the yellow-fever mosquito."""
        }
        self.afflictionPresent = {
          """cholera_present""": False,
          """common_cold_present""": False,
          """diphtheria_present""": False,
          """dysentery_present""": False,
          """hookworm_disease_present""": False,
          """influenza_present""": False,
          """malaria_present""": False,
          """measles_present""": False,
          """mumps_present""": False,
          """parasite_present""": False,
          """pleurisy_present""": False,
          """scarlet_fever_present""": False,
          """smallpox_present""": False,
          """syphilis_present""": False,
          """typhoid_fever_present""": False,
          """typhus_present""": False,
          """whooping_cough_present""": False,
          """yellow_fever_present""": False
        }
        self.afflictionProgression = {
          """cholera_progression""": 0,
          """common_cold_progression""": 0,
          """diphtheria_progression""": 0,
          """dysentery_progression""": 0,
          """hookworm_disease_progression""": 0,
          """influenza_progression""": 0,
          """malaria_progression""": 0,
          """measles_progression""": 0,
          """mumps_progression""": 0,
          """parasite_progression""": 0,
          """pleurisy_progression""": 0,
          """scarlet_fever_progression""": 0,
          """smallpox_progression""": 0,
          """syphilis_progression""": 0,
          """typhoid_fever_progression""": 0,
          """typhus_progression""": 0,
          """whooping_cough_progression""": 0,
          """yellow_fever_progression""": 0
        }
