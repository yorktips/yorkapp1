package com.ibm.watson.developer_cloud.personality_insights.v2;

import java.util.List;

import com.ibm.watson.developer_cloud.personality_insights.v2.model.Profile;
import com.ibm.watson.developer_cloud.personality_insights.v2.model.Trait;


public class PersonalityInsightsExample {

	  public static void main(String[] args) {
	    PersonalityInsights service = new PersonalityInsights();
	    //service.setUsernameAndPassword("<username>", "<password>");
	    service.setUsernameAndPassword("a1b14481-c269-4824-88fc-8a88939eed00", "LXvc0uhcsjCb");
/*
	    {
	    	  "url": "https://gateway.watsonplatform.net/personality-insights/api",
	    	  "password": "LXvc0uhcsjCb",
	    	  "username": "a1b14481-c269-4824-88fc-8a88939eed00"
	    	}
*/	    
	    String text =
	      "Call me Ishmael. Some years ago-never mind how long "
	          + "precisely-having little or no money in my purse, and nothing "
	          + "particular to interest me on shore, I thought I would sail about "
	          + "a little and see the watery part of the world. It is a way "
	          + "I have of driving off the spleen and regulating the circulation. "
	          + "Whenever I find myself growing grim about the mouth; whenever it "
	          + "is a damp, drizzly November in my soul; whenever I find myself "
	          + "involuntarily pausing before coffin warehouses, and bringing up "
	          + "the rear of every funeral I meet; and especially whenever my "
	          + "hypos get such an upper hand of me, that it requires a strong "
	          + "moral principle to prevent me from deliberately stepping into "
	          + "the street, and methodically knocking people's hats off-then, "
	          + "I account it high time to get to sea as soon as I can.";

	    Profile profile = service.getProfile(text).execute();
	    

	    String id=profile.getId();
	    String processed_lang=profile.getProcessedLanguage();
	    String source=profile.getSource();
	    Trait trait = profile.getTree();
	    int wordCount=profile.getWordCount();
	    String workCoundMessage=profile.getWordCountMessage();

	    System.out.println("id=" + id + ";processed_lang=" + processed_lang + ";source=" + source + ";wordCount=" + wordCount + ";workCoundMessage=" + workCoundMessage);

	    List<Trait> traits1=trait.getChildren();
	    for( Trait myTrait1 : traits1 ) {	    
	    	String myCategory1=myTrait1.getCategory();
	    	String myID1=myTrait1.getId();
	    	String myName1=myTrait1.getName();
	    	Double myPercentage1=myTrait1.getPercentage();
	    	Double mySamplingError1=myTrait1.getSamplingError();
	    	System.out.println("Category1=" + myCategory1 + ";id1=" + myID1 + ";name1=" + myName1 + ";percentage1=" + myPercentage1 + ";samplingError1=" + mySamplingError1);
	    	
	    	List<Trait> myTraits2=myTrait1.getChildren();
	    	
	    	for( Trait myTrait2 : myTraits2 ) {	    
		    	String myCategory2=myTrait2.getCategory();
		    	String myID2=myTrait2.getId();
		    	String myName2=myTrait2.getName();
		    	Double myPercentage2=myTrait2.getPercentage();
		    	Double mySamplingError2=myTrait2.getSamplingError();
		    	System.out.println("Category2=" + myCategory2 + ";id2=" + myID2 + ";name2=" + myName2 + ";percentage2=" + myPercentage2 + ";samplingError2=" + mySamplingError2);
		    	
		    	List<Trait> myTraits3=myTrait2.getChildren();
		    	
		    	for( Trait myTrait3 : myTraits3 ) {	
			    	String myCategory3=myTrait3.getCategory();
			    	String myID3=myTrait3.getId();
			    	String myName3=myTrait3.getName();
			    	Double myPercentage3=myTrait3.getPercentage();
			    	Double mySamplingError3=myTrait3.getSamplingError();
			    	List<Trait> myTraits4=myTrait3.getChildren();
			    	System.out.println("Category3=" + myCategory3 + ";id3=" + myID3 + ";name3=" + myName3 + ";percentage3=" + myPercentage3 + ";samplingError3=" + mySamplingError3 );
			    	
			    	System.out.println(myTraits4);
		    	}
	    	}
	    	
	    }
	    
	    //System.out.println(profile);
	  }

}


/*
Aug 14, 2016 9:51:04 PM com.ibm.watson.developer_cloud.util.CredentialUtils getKeyUsingJNDI
INFO: JNDI watson-developer-cloud/personality_insights/credentials not found.
{
"id": "*UNKNOWN*",
"processed_lang": "en",
"source": "*UNKNOWN*",
"tree": {
  "children": [
    {
      "children": [
        {
          "category": "personality",
          "children": [
            {
              "category": "personality",
              "children": [
                {
                  "category": "personality",
                  "id": "Adventurousness",
                  "name": "Adventurousness",
                  "percentage": 0.24273567659303688,
                  "sampling_error": 0.054508355599999996
                },
                {
                  "category": "personality",
                  "id": "Artistic interests",
                  "name": "Artistic interests",
                  "percentage": 0.1043290657163104,
                  "sampling_error": 0.1105694696
                },
                {
                  "category": "personality",
                  "id": "Emotionality",
                  "name": "Emotionality",
                  "percentage": 0.8132992201380651,
                  "sampling_error": 0.0511414066
                },
                {
                  "category": "personality",
                  "id": "Imagination",
                  "name": "Imagination",
                  "percentage": 0.36161485612768607,
                  "sampling_error": 0.0687314696
                },
                {
                  "category": "personality",
                  "id": "Intellect",
                  "name": "Intellect",
                  "percentage": 0.5009869824564314,
                  "sampling_error": 0.0604259074
                },
                {
                  "category": "personality",
                  "id": "Liberalism",
                  "name": "Authority-challenging",
                  "percentage": 0.9440958312234307,
                  "sampling_error": 0.08844844119999999
                }
              ],
              "id": "Openness",
              "name": "Openness",
              "percentage": 0.7051861397046637,
              "sampling_error": 0.0653032944
            },
            {
              "category": "personality",
              "children": [
                {
                  "category": "personality",
                  "id": "Achievement striving",
                  "name": "Achievement striving",
                  "percentage": 0.47503219156488846,
                  "sampling_error": 0.1047757272
                },
                {
                  "category": "personality",
                  "id": "Cautiousness",
                  "name": "Cautiousness",
                  "percentage": 0.6962411095195775,
                  "sampling_error": 0.0969161446
                },
                {
                  "category": "personality",
                  "id": "Dutifulness",
                  "name": "Dutifulness",
                  "percentage": 0.45384312564939444,
                  "sampling_error": 0.066068398
                },
                {
                  "category": "personality",
                  "id": "Orderliness",
                  "name": "Orderliness",
                  "percentage": 0.99,
                  "sampling_error": 0.0745509562
                },
                {
                  "category": "personality",
                  "id": "Self-discipline",
                  "name": "Self-discipline",
                  "percentage": 0.6206377869026388,
                  "sampling_error": 0.0501648544
                },
                {
                  "category": "personality",
                  "id": "Self-efficacy",
                  "name": "Self-efficacy",
                  "percentage": 0.7855118958460193,
                  "sampling_error": 0.09784636840000001
                }
              ],
              "id": "Conscientiousness",
              "name": "Conscientiousness",
              "percentage": 0.7509619654135328,
              "sampling_error": 0.0815783018
            },
            {
              "category": "personality",
              "children": [
                {
                  "category": "personality",
                  "id": "Activity level",
                  "name": "Activity level",
                  "percentage": 0.13206572673240438,
                  "sampling_error": 0.0831364296
                },
                {
                  "category": "personality",
                  "id": "Assertiveness",
                  "name": "Assertiveness",
                  "percentage": 0.13130439422727444,
                  "sampling_error": 0.08850146580000001
                },
                {
                  "category": "personality",
                  "id": "Cheerfulness",
                  "name": "Cheerfulness",
                  "percentage": 0.08993348833481232,
                  "sampling_error": 0.11119159220000001
                },
                {
                  "category": "personality",
                  "id": "Excitement-seeking",
                  "name": "Excitement-seeking",
                  "percentage": 0.061898016284663605,
                  "sampling_error": 0.08486297720000001
                },
                {
                  "category": "personality",
                  "id": "Friendliness",
                  "name": "Outgoing",
                  "percentage": 0.021582900452582564,
                  "sampling_error": 0.0799469824
                },
                {
                  "category": "personality",
                  "id": "Gregariousness",
                  "name": "Gregariousness",
                  "percentage": 0.009211874520246268,
                  "sampling_error": 0.0612727814
                }
              ],
              "id": "Extraversion",
              "name": "Extraversion",
              "percentage": 0.0673936678439218,
              "sampling_error": 0.0610899574
            },
            {
              "category": "personality",
              "children": [
                {
                  "category": "personality",
                  "id": "Altruism",
                  "name": "Altruism",
                  "percentage": 0.09338041151739289,
                  "sampling_error": 0.0754516306
                },
                {
                  "category": "personality",
                  "id": "Cooperation",
                  "name": "Cooperation",
                  "percentage": 0.6156317000117122,
                  "sampling_error": 0.0840564614
                },
                {
                  "category": "personality",
                  "id": "Modesty",
                  "name": "Modesty",
                  "percentage": 0.08280068048565797,
                  "sampling_error": 0.0603121934
                },
                {
                  "category": "personality",
                  "id": "Morality",
                  "name": "Uncompromising",
                  "percentage": 0.5057874217859515,
                  "sampling_error": 0.067044696
                },
                {
                  "category": "personality",
                  "id": "Sympathy",
                  "name": "Sympathy",
                  "percentage": 0.9667826769405433,
                  "sampling_error": 0.1032267996
                },
                {
                  "category": "personality",
                  "id": "Trust",
                  "name": "Trust",
                  "percentage": 0.14365655969774646,
                  "sampling_error": 0.0615205956
                }
              ],
              "id": "Agreeableness",
              "name": "Agreeableness",
              "percentage": 0.16614363537300278,
              "sampling_error": 0.10193945
            },
            {
              "category": "personality",
              "children": [
                {
                  "category": "personality",
                  "id": "Anger",
                  "name": "Fiery",
                  "percentage": 0.7763385243499553,
                  "sampling_error": 0.0993531718
                },
                {
                  "category": "personality",
                  "id": "Anxiety",
                  "name": "Prone to worry",
                  "percentage": 0.7761378863706873,
                  "sampling_error": 0.059064681200000003
                },
                {
                  "category": "personality",
                  "id": "Depression",
                  "name": "Melancholy",
                  "percentage": 0.33827105688535825,
                  "sampling_error": 0.0633628384
                },
                {
                  "category": "personality",
                  "id": "Immoderation",
                  "name": "Immoderation",
                  "percentage": 0.6815723142187143,
                  "sampling_error": 0.057044794
                },
                {
                  "category": "personality",
                  "id": "Self-consciousness",
                  "name": "Self-consciousness",
                  "percentage": 0.8580216044727753,
                  "sampling_error": 0.061179929800000005
                },
                {
                  "category": "personality",
                  "id": "Vulnerability",
                  "name": "Susceptible to stress",
                  "percentage": 0.941266993614812,
                  "sampling_error": 0.090874675
                }
              ],
              "id": "Neuroticism",
              "name": "Emotional range",
              "percentage": 0.8900934212705964,
              "sampling_error": 0.09652001299999999
            }
          ],
          "id": "Extraversion_parent",
          "name": "Extraversion",
          "percentage": 0.0673936678439218
        }
      ],
      "id": "personality",
      "name": "Big 5"
    },
    {
      "children": [
        {
          "category": "needs",
          "children": [
            {
              "category": "needs",
              "id": "Challenge",
              "name": "Challenge",
              "percentage": 0.2371154709396367,
              "sampling_error": 0.087784926
            },
            {
              "category": "needs",
              "id": "Closeness",
              "name": "Closeness",
              "percentage": 0.05317178584318431,
              "sampling_error": 0.0866021168
            },
            {
              "category": "needs",
              "id": "Curiosity",
              "name": "Curiosity",
              "percentage": 0.06903749213008605,
              "sampling_error": 0.1251023292
            },
            {
              "category": "needs",
              "id": "Excitement",
              "name": "Excitement",
              "percentage": 0.02858786857596093,
              "sampling_error": 0.1143929704
            },
            {
              "category": "needs",
              "id": "Harmony",
              "name": "Harmony",
              "percentage": 0.7666679171146792,
              "sampling_error": 0.114680861
            },
            {
              "category": "needs",
              "id": "Ideal",
              "name": "Ideal",
              "percentage": 0.03850021769664435,
              "sampling_error": 0.1039405576
            },
            {
              "category": "needs",
              "id": "Liberty",
              "name": "Liberty",
              "percentage": 0.1511971508242999,
              "sampling_error": 0.1510055532
            },
            {
              "category": "needs",
              "id": "Love",
              "name": "Love",
              "percentage": 0.3595763983667631,
              "sampling_error": 0.1054972456
            },
            {
              "category": "needs",
              "id": "Practicality",
              "name": "Practicality",
              "percentage": 0.5357185381465674,
              "sampling_error": 0.0918414682
            },
            {
              "category": "needs",
              "id": "Self-expression",
              "name": "Self-expression",
              "percentage": 0.007484747858497035,
              "sampling_error": 0.0853109926
            },
            {
              "category": "needs",
              "id": "Stability",
              "name": "Stability",
              "percentage": 0.022806632023977973,
              "sampling_error": 0.1115643634
            },
            {
              "category": "needs",
              "id": "Structure",
              "name": "Structure",
              "percentage": 0.00982823875359894,
              "sampling_error": 0.0838920682
            }
          ],
          "id": "Self-expression_parent",
          "name": "Self-expression",
          "percentage": 0.007484747858497035
        }
      ],
      "id": "needs",
      "name": "Needs"
    },
    {
      "children": [
        {
          "category": "values",
          "children": [
            {
              "category": "values",
              "id": "Conservation",
              "name": "Conservation",
              "percentage": 0.0596056600669576,
              "sampling_error": 0.0712865342
            },
            {
              "category": "values",
              "id": "Openness to change",
              "name": "Openness to change",
              "percentage": 0.8359604610465452,
              "sampling_error": 0.06873593
            },
            {
              "category": "values",
              "id": "Hedonism",
              "name": "Hedonism",
              "percentage": 0.9744291651859416,
              "sampling_error": 0.1428667446
            },
            {
              "category": "values",
              "id": "Self-enhancement",
              "name": "Self-enhancement",
              "percentage": 0.4038628866818849,
              "sampling_error": 0.1086705544
            },
            {
              "category": "values",
              "id": "Self-transcendence",
              "name": "Self-transcendence",
              "percentage": 0.636047477500914,
              "sampling_error": 0.086691064
            }
          ],
          "id": "Hedonism_parent",
          "name": "Hedonism",
          "percentage": 0.9744291651859416
        }
      ],
      "id": "values",
      "name": "Values"
    }
  ],
  "id": "r",
  "name": "root"
},
"word_count": 142,
"word_count_message": "There were 142 words in the input. We need a minimum of 3,500, preferably 6,000 or more, to compute statistically significant estimates"
}


*/
