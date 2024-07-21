#frozen_string_literal: true

class AfflictionSystem
	def initializor
        #definitions retrieved from the Merriam-Webster Medical Dictionary
        @affliction_descriptions = {
		  :cholera => 'Any of several diseases usually marked by severe vomiting and diarrhea.',
		  :common_cold => 'A contagious viral illness of the structures used in breathing which cause the nose and throat to be sore, swollen, and inflamed an in which there is usually much mucus and coughing and sneezing.',
		  :diptheria => 'A contagious bacterial disease with fever in which the air passages become coated with a membranous layer that often obstructs breathing',
		  :dysentary => 'A disease characterized by severe diarrhea with passage of mucus and blood from the bowels.',
		  :hookworm_disease => 'A diseased state marked by blood loss, paleness, and weakness due to hookworms in the intestine',
		  :influenza => 'A very contagious virus disease with fever, exhaustion, severe aches and pains, and inflammation of the respiratory tract.',
		  :malaria => 'A disease caused by protozoan parasites in the red blood cells, passed from one individual to another by bite of the mosquitoes, and marked by periodic attacks of chills and fever.',
		  :measles => 'A contagious disease caused by a virus and marked by fever and red spots on the skin.',
		  :mumps => 'An acute contagious virus disease caused by a paramyxovirus and marked by fever and by swelling especially of the parotid gland.',
		  :parasite => 'An organism living in, on, or with another organism in order to obtain nutrients, grow, or multiply often in a state that directly or indirectly harms the host.',
		  :pleurisy => 'Inflammation of the pleura that is typically characterized by sudden onset, painful and difficult respiration, and exudation of fluid or fibrinous material into the pleural cavity.',
		  :scarlet_fever => 'An acute contagious febrile disease caused by hemolytic Group A streptococci and characterized by inflammation of the nose, throat, and mouth, generalized toxemia, and a red rash.',
		  :smallpox => 'An acute contagious febrile disease of humans that is caused by a poxvirus, is characterized by a skin eruption with pustules, sloughing, and scar formation.',
		  :syphilis => 'A chronic contagious usually venereal and often congenital disease caused by a spirochete and if left untreated producing chancres, rashes, and systemic lesions with three stages continued over many years.',
		  :typhoid_fever => 'A communicable disease marked especially by fever, diarrhea, prostration, headache, and intestinal inflammation and caused by a bacterium.',
		  :typhus => 'A severe human febrile disease that is caused by one transmitted especially by body lice and is marked by high fever, stupor alternating with delerium, intense headache, and a dark red rash.',
		  :whooping_cough => 'An infections respiratory disease especially of children caused by a bacterium and marked by a convulsive spasmodic cough sometimes followed by a crowing intake of breath.',
		  :yellow_fever => 'An acute infections disease that is marked by symptoms (such as fever, muscle pain, and headache) of sudden onset which typically resolves within a few days but are sometimes followed by more serious symptons (such as jaundice, high fever, and hemorrhage), and is caused by a flavivirus transmitted especially by the yellow-fever mosquito.'
		}
        #used to track if affliction is currently present - might be redundant but o whale
        @affliction_present = {
          'cholera_present' => false,
          'common_cold_present' => false,
          'diptheria_present' => false,
          'dysentart_present' => false,
          'hookworm_disease_present' => false,
          'influenze_present' => false,
          'malaria_present' => false,
          'measles_present' => false,
          'mumps_present' => false,
          'parasite_present' => false,
          'pleurisy_present' => false,
          'scarlet_fever_present' => false,
          'smallpox_present' => false,
          'syphilis_presnet' => false,
          'typhoid_fever_present' => false,
          'typhus_present' => false,
          'whooping_coung_present' => false,
          'yellow_fever_present' => false
        }
		#affliction progression range from 0-100 inclusive 100 means ya dead
		@affliciton_progression = {
		  'cholera_progression' => 0,         
		  'common_cold_progression' => 0,     
		  'diptheria_progression' => 0,       
		  'dysentary_progression' => 0,       
		  'hookworm_disease_progression' => 0,
		  'influenza_progression' => 0,       
		  'malaria_progression' => 0,         
		  'measles_progression' => 0,         
		  'mumps_progression' => 0,          
		  'parasite_progression' => 0,       
		  'pleurisy_progression' => 0,       
		  'scarlet_fever_progression' => 0,   
		  'smallpox_progression' => 0,       
		  'syphilis_progression' => 0,       
		  'typhoid_fever_progression' => 0,    
		  'typhus_progression' => 0,         
		  'whooping_cough_progression' => 0,  
		  'yellow_fever_progression' => 0    
		}
	end
    #add some methods here... one that takes an affliction and will apply the penalty?
    #maybe add another that will gen a random number and a random affliction?
    #add something else where it will just roll to see if the 15.5% chance of affliction is a go -> will call subsequent funcs
end
