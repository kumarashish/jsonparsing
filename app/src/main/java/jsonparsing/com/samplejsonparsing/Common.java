package jsonparsing.com.samplejsonparsing;

/**
 * Created by ashish.kumar on 08-01-2019.
 */

public class Common {
    public static String json="{\n" +
            "  \"code\":\"200\",\n" +
            "  \"message\":\"Success\",\n" +
            "  \"result\":{\n" +
            "    \"patient\":{\n" +
            "      \"name\":\"Mr. First Middle Last\",\n" +
            "      \"UMRNo.\":\"UMR0001\",\n" +
            "      \"Gender\":\"Male\",\n" +
            "      \"age\":\"32\"\n" +
            "    },\n" +
            "    \"form\":{\n" +
            "      \"formType\":\"System Examniation\",\n" +
            "      \"formName\":\"orthopaedics\",\n" +
            "      \"sections\":[{\n" +
            "        \"title\":\"test\",\n" +
            "        \"brief\":\"\",\n" +
            "        \"format\":\"normal\",\n" +
            "        \"labels\":[\n" +
            "          {\n" +
            "            \"id\":\"1\",\n" +
            "            \"widgetType\":\"text\",\n" +
            "            \"labeltext\":\"Joints being examnied\"\n" +
            "          }]\n" +
            "      },{\n" +
            "        \"title\":\"Inspection\",\n" +
            "        \"brief\":\"\",\n" +
            "        \"format\":\"normal\",\n" +
            "        \"labels\":[{\n" +
            "          \"id\":\"2\",\n" +
            "          \"widgetType\":\"radioButton\",\n" +
            "          \"labelText\":\"Gait\",\n" +
            "          \"options\":[{\n" +
            "            \"id\":\"1\",\n" +
            "            \"optionText\":\"Normal\",\n" +
            "            \"default\":\"1\",\n" +
            "            \"dependency\":[]\n" +
            "          },{\n" +
            "            \"id\":\"2\",\n" +
            "            \"optionText\":\"Abnormal\",\n" +
            "            \"default\":\"0\",\n" +
            "            \"dependency\":[{\n" +
            "              \"labels\":[{\n" +
            "                \"id\":\"23\",\n" +
            "                \"widgetType\":\"checkBox\",\n" +
            "                \"labelText\":\"Skin over Joints\",\n" +
            "                \"options\":[{\n" +
            "                  \"id\":\"24\",\n" +
            "                  \"optionText\":\"Normal\",\n" +
            "                  \"default\":\"1\",\n" +
            "                  \"dependency\":[]\n" +
            "                },{\n" +
            "                  \"id\":\"24\",\n" +
            "                  \"optionText\":\"Sinuses\",\n" +
            "                  \"default\":\"1\",\n" +
            "                  \"dependency\":[]\n" +
            "                },{\n" +
            "                  \"id\":\"25\",\n" +
            "                  \"optionText\":\"Scars\",\n" +
            "                  \"default\":\"0\",\n" +
            "                  \"dependency\":[]\n" +
            "                },{\n" +
            "                  \"id\":\"26\",\n" +
            "                  \"optionText\":\"Ulcers\",\n" +
            "                  \"default\":\"0\",\n" +
            "                  \"dependency\":[]\n" +
            "                }]\n" +
            "              }]\n" +
            "            }]\n" +
            "          }]\n" +
            "        }]\n" +
            "      },{\n" +
            "        \"title\":\"Motor system\",\n" +
            "        \"brief\":\"\",\n" +
            "        \"format\":\"tabular\",\n" +
            "        \"columns\":\"5\",\n" +
            "        \"rows\":\"5\",\n" +
            "        \"labels\":[\n" +
            "          {\n" +
            "            \"id\":\"50\",\n" +
            "            \"widgetType\":\"radio\",\n" +
            "            \"labelText\":\"Right Upper Limb_Attitude\",\n" +
            "            \"column\":\"2\",\n" +
            "            \"row\":\"2\",\n" +
            "            \"options\":[{\n" +
            "              \"id\":\"56\",\n" +
            "              \"optionText\":\"Yes\",\n" +
            "              \"default\":\"0\",\n" +
            "              \"dependency\":[]\n" +
            "              },{\n" +
            "              \"id\":\"57\",\n" +
            "              \"optionText\":\"No\",\n" +
            "              \"default\":\"1\",\n" +
            "              \"dependency\":[]\n" +
            "            }]\n" +
            "          },{\n" +
            "            \"id\":\"51\",\n" +
            "            \"widgetType\":\"radioButton\",\n" +
            "            \"labelText\":\"Right Upper Limb_tone\",\n" +
            "            \"column\":\"3\",\n" +
            "            \"row\":\"2\",\n" +
            "            \"options\":[{\n" +
            "              \"id\":\"58\",\n" +
            "              \"optionText\":\"Yes\",\n" +
            "              \"default\":\"0\",\n" +
            "              \"dependency\":[]\n" +
            "              },{\n" +
            "              \"id\":\"59\",\n" +
            "              \"optionText\":\"No\",\n" +
            "              \"default\":\"1\",\n" +
            "              \"dependency\":[]\n" +
            "            }]\n" +
            "          }]\n" +
            "      }]\n" +
            "    }\n" +
            "  }\n" +
            "}";
}
