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




    public static String json2="{\n" +
            "    \"code\": \"200\",\n" +
            "    \"message\": \"form_details\",\n" +
            "    \"result\": {\n" +
            "        \"form\": {\n" +
            "            \"formType\": \"Past History\",\n" +
            "            \"formName\": \"Past History\",\n" +
            "            \"sections\": [\n" +
            "                {\n" +
            "                    \"title\": null,\n" +
            "                    \"brief\": null,\n" +
            "                    \"format\": null,\n" +
            "                    \"labels\": [\n" +
            "                        {\n" +
            "                            \"id\": \"1\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Similar illness\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"1\"\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"2\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"2\",\n" +
            "                            \"widgetType\": \"text\",\n" +
            "                            \"labelText\": \"Describe\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"3\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Diabetes Milletes\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"3\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"4\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Type\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Type 1\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"5\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Type 2\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"6\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"6\",\n" +
            "                                                    \"widgetType\": \"checkbox\",\n" +
            "                                                    \"labelText\": \"Medication type\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"OHA\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"7\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Insulin\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"8\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"7\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Any Complications\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Yes\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"9\",\n" +
            "                                                            \"dependency\": [\n" +
            "                                                                {\n" +
            "                                                                    \"labels\": [\n" +
            "                                                                        {\n" +
            "                                                                            \"id\": \"8\",\n" +
            "                                                                            \"widgetType\": \"checkbox\",\n" +
            "                                                                            \"labelText\": \"Like\",\n" +
            "                                                                            \"options\": [\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"Neuropathy\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"11\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"Nephropathy\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"12\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"Retinopathy\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"13\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"CAD\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"14\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"CVA\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"15\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"Others\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"16\",\n" +
            "                                                                                    \"dependency\": [\n" +
            "                                                                                        {\n" +
            "                                                                                            \"labels\": [\n" +
            "                                                                                                {\n" +
            "                                                                                                    \"id\": \"16\",\n" +
            "                                                                                                    \"widgetType\": \"text\",\n" +
            "                                                                                                    \"labelText\": \"Specify\"\n" +
            "                                                                                                }\n" +
            "                                                                                            ]\n" +
            "                                                                                        }\n" +
            "                                                                                    ]\n" +
            "                                                                                }\n" +
            "                                                                            ]\n" +
            "                                                                        },\n" +
            "                                                                        {\n" +
            "                                                                            \"id\": \"15\",\n" +
            "                                                                            \"widgetType\": \"checkbox\",\n" +
            "                                                                            \"labelText\": \"Like\",\n" +
            "                                                                            \"options\": [\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"Renal Failure\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"23\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"CAD\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"24\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"CVA\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"25\"\n" +
            "                                                                                },\n" +
            "                                                                                {\n" +
            "                                                                                    \"optionText\": \"Others\",\n" +
            "                                                                                    \"default\": \"0\",\n" +
            "                                                                                    \"id\": \"26\"\n" +
            "                                                                                }\n" +
            "                                                                            ]\n" +
            "                                                                        }\n" +
            "                                                                    ]\n" +
            "                                                                }\n" +
            "                                                            ]\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"No\",\n" +
            "                                                            \"default\": \"1\",\n" +
            "                                                            \"id\": \"10\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"4\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"17\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Tuberculosis\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"27\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"18\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Type\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Pulmonary\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"29\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Pleural\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"30\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Abdominal\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"31\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Lymphnodal\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"32\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"CNS\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"33\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Others\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"34\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"20\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"How diagnosed\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Clinical\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"35\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"AFB\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"36\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"HPE\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"37\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Radiological\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"38\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"23\",\n" +
            "                                                    \"widgetType\": \"text\",\n" +
            "                                                    \"labelText\": \"Documented any relapse\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"28\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"24\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Jaundice\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"39\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"26\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Cause of Jaundice\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Prehepatic\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"41\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Hepatic\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"42\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Obstructive\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"43\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Others\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"44\",\n" +
            "                                                            \"dependency\": [\n" +
            "                                                                {\n" +
            "                                                                    \"labels\": [\n" +
            "                                                                        {\n" +
            "                                                                            \"id\": \"27\",\n" +
            "                                                                            \"widgetType\": \"text\",\n" +
            "                                                                            \"labelText\": \"Specify\"\n" +
            "                                                                        }\n" +
            "                                                                    ]\n" +
            "                                                                }\n" +
            "                                                            ]\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"28\",\n" +
            "                                                    \"widgetType\": \"text\",\n" +
            "                                                    \"labelText\": \"Any family history of Jaundice\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"40\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"29\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Coronary artery disease\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"45\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"30\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Type\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"CSA\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"47\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"UA\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"48\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"AMI\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"49\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"31\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Management\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Medical only\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"50\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Stenting\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"51\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"CABG\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"52\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"32\",\n" +
            "                                                    \"widgetType\": \"text\",\n" +
            "                                                    \"labelText\": \"Details\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"46\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"33\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Hypothyroidism\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"53\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"35\",\n" +
            "                                                    \"widgetType\": \"radio\",\n" +
            "                                                    \"labelText\": \"Any Thyromegaly\",\n" +
            "                                                    \"options\": [\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"Yes\",\n" +
            "                                                            \"default\": \"0\",\n" +
            "                                                            \"id\": \"55\"\n" +
            "                                                        },\n" +
            "                                                        {\n" +
            "                                                            \"optionText\": \"No\",\n" +
            "                                                            \"default\": \"1\",\n" +
            "                                                            \"id\": \"56\"\n" +
            "                                                        }\n" +
            "                                                    ]\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"id\": \"36\",\n" +
            "                                                    \"widgetType\": \"text\",\n" +
            "                                                    \"labelText\": \"On what medication and dose\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"54\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"37\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Bronchial asthma\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"57\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"39\",\n" +
            "                                                    \"widgetType\": \"text\",\n" +
            "                                                    \"labelText\": \"Medications\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"58\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"40\",\n" +
            "                            \"widgetType\": \"radio\",\n" +
            "                            \"labelText\": \"Surgery\",\n" +
            "                            \"options\": [\n" +
            "                                {\n" +
            "                                    \"optionText\": \"Yes\",\n" +
            "                                    \"default\": \"0\",\n" +
            "                                    \"id\": \"59\",\n" +
            "                                    \"dependency\": [\n" +
            "                                        {\n" +
            "                                            \"labels\": [\n" +
            "                                                {\n" +
            "                                                    \"id\": \"44\",\n" +
            "                                                    \"widgetType\": \"text\",\n" +
            "                                                    \"labelText\": \"When\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"optionText\": \"No\",\n" +
            "                                    \"default\": \"1\",\n" +
            "                                    \"id\": \"60\"\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    \"requestname\": \"custom_form_recursive\"\n" +
            "}";



    public static String json3=" {\n" +
            "    \"code\": \"200\",\n" +
            "    \"message\": \"form_details\",\n" +
            "    \"result\": {\n" +
            "        \"form\": {\n" +
            "            \"formType\": \"Past History\",\n" +
            "            \"formName\": \"Past History\",\n" +
            "            \"sections\": [\n" +
            "                {\n" +
            "                    \"title\": null,\n" +
            "                    \"brief\": null,\n" +
            "                    \"format\": null,\n" +
            "                    \"labels\": [ {\n" +
            "              \"id\": \"3\",\n" +
            "              \"widgetType\": \"radio\",\n" +
            "              \"labelText\": \"Diabetes Milletes\",\n" +
            "              \"options\": [\n" +
            "                {\n" +
            "                  \"optionText\": \"Yes\",\n" +
            "                  \"default\": \"0\",\n" +
            "                  \"id\": \"3\",\n" +
            "                  \"dependency\": [\n" +
            "                    {\n" +
            "                      \"labels\": [\n" +
            "                        {\n" +
            "                          \"id\": \"4\",\n" +
            "                          \"widgetType\": \"radio\",\n" +
            "                          \"labelText\": \"Type\",\n" +
            "                          \"options\": [\n" +
            "                            {\n" +
            "                              \"optionText\": \"Type 1\",\n" +
            "                              \"default\": \"0\",\n" +
            "                              \"id\": \"5\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                              \"optionText\": \"Type 2\",\n" +
            "                              \"default\": \"0\",\n" +
            "                              \"id\": \"6\"\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                          \"id\": \"6\",\n" +
            "                          \"widgetType\": \"checkbox\",\n" +
            "                          \"labelText\": \"Medication type\",\n" +
            "                          \"options\": [\n" +
            "                            {\n" +
            "                              \"optionText\": \"OHA\",\n" +
            "                              \"default\": \"0\",\n" +
            "                              \"id\": \"7\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                              \"optionText\": \"Insulin\",\n" +
            "                              \"default\": \"0\",\n" +
            "                              \"id\": \"8\"\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                          \"id\": \"7\",\n" +
            "                          \"widgetType\": \"radio\",\n" +
            "                          \"labelText\": \"Any Complications\",\n" +
            "                          \"options\": [\n" +
            "                            {\n" +
            "                              \"optionText\": \"Yes\",\n" +
            "                              \"default\": \"0\",\n" +
            "                              \"id\": \"9\",\n" +
            "                              \"dependency\": [\n" +
            "                                {\n" +
            "                                  \"labels\": [\n" +
            "                                    {\n" +
            "                                      \"id\": \"8\",\n" +
            "                                      \"widgetType\": \"checkbox\",\n" +
            "                                      \"labelText\": \"Like\",\n" +
            "                                      \"options\": [\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"Neuropathy\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"11\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"Nephropathy\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"12\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"Retinopathy\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"13\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"CAD\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"14\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"CVA\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"15\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"Others\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"16\",\n" +
            "                                          \"dependency\": [\n" +
            "                                            {\n" +
            "                                              \"labels\": [\n" +
            "                                                {\n" +
            "                                                  \"id\": \"16\",\n" +
            "                                                  \"widgetType\": \"text\",\n" +
            "                                                  \"labelText\": \"Specify\"\n" +
            "                                                }\n" +
            "                                              ]\n" +
            "                                            }\n" +
            "                                          ]\n" +
            "                                        }\n" +
            "                                      ]\n" +
            "                                    },\n" +
            "                                    {\n" +
            "                                      \"id\": \"15\",\n" +
            "                                      \"widgetType\": \"checkbox\",\n" +
            "                                      \"labelText\": \"Like\",\n" +
            "                                      \"options\": [\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"Renal Failure\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"23\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"CAD\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"24\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"CVA\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"25\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"optionText\": \"Others\",\n" +
            "                                          \"default\": \"0\",\n" +
            "                                          \"id\": \"26\"\n" +
            "                                        }\n" +
            "                                      ]\n" +
            "                                    }\n" +
            "                                  ]\n" +
            "                                }\n" +
            "                              ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                              \"optionText\": \"No\",\n" +
            "                              \"default\": \"1\",\n" +
            "                              \"id\": \"10\"\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        }\n" +
            "                      ]\n" +
            "                    }\n" +
            "                  ]\n" +
            "                },\n" +
            "                {\n" +
            "                  \"optionText\": \"No\",\n" +
            "                  \"default\": \"1\",\n" +
            "                  \"id\": \"4\"\n" +
            "                }\n" +
            "              ]\n" +
            "            \n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    \"requestname\": \"custom_form_recursive\"\n" +
            "}";
public static String json4="{\n" +
        "  \"code\": \"200\",\n" +
        "  \"message\": \"form_details\",\n" +
        "  \"result\": {\n" +
        "    \"form\": {\n" +
        "      \"formType\": \"Past History\",\n" +
        "      \"formName\": \"Past History\",\n" +
        "      \"form_id\": \"3\",\n" +
        "      \"sections\": [\n" +
        "        {\n" +
        "          \"title\": \"\",\n" +
        "          \"brief\": \"\",\n" +
        "          \"format\": \"normal\",\n" +
        "          \"labels\": [\n" +
        "            {\n" +
        "              \"id\": \"82\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Similar Illness\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"188\",\n" +
        "                  \"label_id\": \"82\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"83\",\n" +
        "                          \"widgetType\": \"text\",\n" +
        "                          \"labelText\": \"Describe\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"189\",\n" +
        "                  \"label_id\": \"82\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"84\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Diabetes Milletes\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"190\",\n" +
        "                  \"label_id\": \"84\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"87\",\n" +
        "                          \"widgetType\": \"checkbox\",\n" +
        "                          \"labelText\": \"Medication\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"OHA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"192\",\n" +
        "                              \"label_id\": \"87\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Insulin\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"193\",\n" +
        "                              \"label_id\": \"87\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"88\",\n" +
        "                          \"widgetType\": \"checkbox\",\n" +
        "                          \"labelText\": \"Complication\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Neuropathy\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"194\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Nephropathy\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"195\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Retinopathy\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"196\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CAD\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"197\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CVA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"198\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Others\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"199\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": [\n" +
        "                                {\n" +
        "                                  \"labels\": [\n" +
        "                                    {\n" +
        "                                      \"id\": \"89\",\n" +
        "                                      \"widgetType\": \"text\",\n" +
        "                                      \"labelText\": \"Specify\"\n" +
        "                                    }\n" +
        "                                  ]\n" +
        "                                }\n" +
        "                              ]\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"191\",\n" +
        "                  \"label_id\": \"84\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"90\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Hypertension\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"200\",\n" +
        "                  \"label_id\": \"90\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"91\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Type\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Primary\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"202\",\n" +
        "                              \"label_id\": \"91\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Secondary\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"203\",\n" +
        "                              \"label_id\": \"91\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"92\",\n" +
        "                          \"widgetType\": \"checkbox\",\n" +
        "                          \"labelText\": \"Any complications\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Renal Failure\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"204\",\n" +
        "                              \"label_id\": \"92\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CAD\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"205\",\n" +
        "                              \"label_id\": \"92\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CVA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"206\",\n" +
        "                              \"label_id\": \"92\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Others...\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"207\",\n" +
        "                              \"label_id\": \"92\",\n" +
        "                              \"dependency\": [\n" +
        "                                {\n" +
        "                                  \"labels\": [\n" +
        "                                    {\n" +
        "                                      \"id\": \"93\",\n" +
        "                                      \"widgetType\": \"text\",\n" +
        "                                      \"labelText\": \"Specify\"\n" +
        "                                    }\n" +
        "                                  ]\n" +
        "                                }\n" +
        "                              ]\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"201\",\n" +
        "                  \"label_id\": \"90\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"94\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Tuberculosis\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"208\",\n" +
        "                  \"label_id\": \"94\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"95\",\n" +
        "                          \"widgetType\": \"checkbox\",\n" +
        "                          \"labelText\": \"Type\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Pulmonary\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"210\",\n" +
        "                              \"label_id\": \"95\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Pleural\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"211\",\n" +
        "                              \"label_id\": \"95\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Abdominal\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"212\",\n" +
        "                              \"label_id\": \"95\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Lymphnodal\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"213\",\n" +
        "                              \"label_id\": \"95\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CNS\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"214\",\n" +
        "                              \"label_id\": \"95\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Others....\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"215\",\n" +
        "                              \"label_id\": \"95\",\n" +
        "                              \"dependency\": [\n" +
        "                                {\n" +
        "                                  \"labels\": [\n" +
        "                                    {\n" +
        "                                      \"id\": \"96\",\n" +
        "                                      \"widgetType\": \"text\",\n" +
        "                                      \"labelText\": \"Specify\"\n" +
        "                                    }\n" +
        "                                  ]\n" +
        "                                }\n" +
        "                              ]\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"97\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Diagnosed by\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Clinical\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"216\",\n" +
        "                              \"label_id\": \"97\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"AFB\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"217\",\n" +
        "                              \"label_id\": \"97\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"HPE\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"218\",\n" +
        "                              \"label_id\": \"97\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Radiological\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"219\",\n" +
        "                              \"label_id\": \"97\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"100\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Cured\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Yes\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"220\",\n" +
        "                              \"label_id\": \"100\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"No\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"221\",\n" +
        "                              \"label_id\": \"100\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"101\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Documented\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Yes\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"222\",\n" +
        "                              \"label_id\": \"101\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"No\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"223\",\n" +
        "                              \"label_id\": \"101\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"102\",\n" +
        "                          \"widgetType\": \"text\",\n" +
        "                          \"labelText\": \"Any relapse\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"209\",\n" +
        "                  \"label_id\": \"94\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"103\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Jaundice\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"224\",\n" +
        "                  \"label_id\": \"103\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"105\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Cause\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Prehepatic\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"226\",\n" +
        "                              \"label_id\": \"105\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Hepatic\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"227\",\n" +
        "                              \"label_id\": \"105\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Obstructive\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"228\",\n" +
        "                              \"label_id\": \"105\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Others..\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"229\",\n" +
        "                              \"label_id\": \"105\",\n" +
        "                              \"dependency\": [\n" +
        "                                {\n" +
        "                                  \"labels\": [\n" +
        "                                    {\n" +
        "                                      \"id\": \"106\",\n" +
        "                                      \"widgetType\": \"text\",\n" +
        "                                      \"labelText\": \"Specify\"\n" +
        "                                    }\n" +
        "                                  ]\n" +
        "                                }\n" +
        "                              ]\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"225\",\n" +
        "                  \"label_id\": \"103\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"107\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Coronary artery disease\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"230\",\n" +
        "                  \"label_id\": \"107\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"108\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Mention type\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"CSA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"232\",\n" +
        "                              \"label_id\": \"108\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"UA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"233\",\n" +
        "                              \"label_id\": \"108\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"AMI\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"234\",\n" +
        "                              \"label_id\": \"108\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"109\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Management\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Medical Only\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"235\",\n" +
        "                              \"label_id\": \"109\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Stenting\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"236\",\n" +
        "                              \"label_id\": \"109\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CABG\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"237\",\n" +
        "                              \"label_id\": \"109\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"110\",\n" +
        "                          \"widgetType\": \"text\",\n" +
        "                          \"labelText\": \"Details\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"231\",\n" +
        "                  \"label_id\": \"107\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"111\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Hypothyroidism\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"238\",\n" +
        "                  \"label_id\": \"111\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"113\",\n" +
        "                          \"widgetType\": \"radio\",\n" +
        "                          \"labelText\": \"Any Thyromegaly\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Yes\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"240\",\n" +
        "                              \"label_id\": \"113\",\n" +
        "                              \"dependency\": [\n" +
        "                                {\n" +
        "                                  \"labels\": [\n" +
        "                                    {\n" +
        "                                      \"id\": \"114\",\n" +
        "                                      \"widgetType\": \"text\",\n" +
        "                                      \"labelText\": \"On What medication and dose\"\n" +
        "                                    }\n" +
        "                                  ]\n" +
        "                                }\n" +
        "                              ]\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"No\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"241\",\n" +
        "                              \"label_id\": \"113\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"239\",\n" +
        "                  \"label_id\": \"111\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"115\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Bronchial Asthama\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"242\",\n" +
        "                  \"label_id\": \"115\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"117\",\n" +
        "                          \"widgetType\": \"text\",\n" +
        "                          \"labelText\": \"Medication\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"243\",\n" +
        "                  \"label_id\": \"115\"\n" +
        "                }\n" +
        "              ]\n" +
        "            },\n" +
        "            {\n" +
        "              \"id\": \"118\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Surgery\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"244\",\n" +
        "                  \"label_id\": \"118\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"122\",\n" +
        "                          \"widgetType\": \"text\",\n" +
        "                          \"labelText\": \"When\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"245\",\n" +
        "                  \"label_id\": \"118\"\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ]\n" +
        "    }\n" +
        "  },\n" +
        "  \"requestname\": \"custom_form_recursive\"\n" +
        "}";


public static String json5="{\n" +
        "  \"code\": \"200\",\n" +
        "  \"message\": \"form_details\",\n" +
        "  \"result\": {\n" +
        "    \"form\": {\n" +
        "      \"formType\": \"Past History\",\n" +
        "      \"formName\": \"Past History\",\n" +
        "      \"form_id\": \"3\",\n" +
        "      \"sections\": [\n" +
        "        {\n" +
        "          \"title\": \"\",\n" +
        "          \"brief\": \"\",\n" +
        "          \"format\": \"normal\",\n" +
        "          \"labels\": [\n" +
        "            \n" +
        "           \n" +
        "            \n" +
        "           {\n" +
        "              \"id\": \"84\",\n" +
        "              \"widgetType\": \"radio\",\n" +
        "              \"labelText\": \"Diabetes Milletes\",\n" +
        "              \"options\": [\n" +
        "                {\n" +
        "                  \"optionText\": \"Yes\",\n" +
        "                  \"default\": \"0\",\n" +
        "                  \"id\": \"190\",\n" +
        "                  \"label_id\": \"84\",\n" +
        "                  \"dependency\": [\n" +
        "                    {\n" +
        "                      \"labels\": [\n" +
        "                        {\n" +
        "                          \"id\": \"87\",\n" +
        "                          \"widgetType\": \"checkbox\",\n" +
        "                          \"labelText\": \"Medication\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"OHA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"192\",\n" +
        "                              \"label_id\": \"87\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Insulin\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"193\",\n" +
        "                              \"label_id\": \"87\",\n" +
        "                              \"dependency\": []\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        },\n" +
        "                        {\n" +
        "                          \"id\": \"88\",\n" +
        "                          \"widgetType\": \"checkbox\",\n" +
        "                          \"labelText\": \"Complication\",\n" +
        "                          \"options\": [\n" +
        "                            {\n" +
        "                              \"optionText\": \"Neuropathy\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"194\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Nephropathy\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"195\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Retinopathy\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"196\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CAD\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"197\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"CVA\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"198\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": []\n" +
        "                            },\n" +
        "                            {\n" +
        "                              \"optionText\": \"Others\",\n" +
        "                              \"default\": \"0\",\n" +
        "                              \"id\": \"199\",\n" +
        "                              \"label_id\": \"88\",\n" +
        "                              \"dependency\": [\n" +
        "                                {\n" +
        "                                  \"labels\": [\n" +
        "                                    {\n" +
        "                                      \"id\": \"89\",\n" +
        "                                      \"widgetType\": \"text\",\n" +
        "                                      \"labelText\": \"Specify\"\n" +
        "                                    }\n" +
        "                                  ]\n" +
        "                                }\n" +
        "                              ]\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                },\n" +
        "                {\n" +
        "                  \"optionText\": \"No\",\n" +
        "                  \"default\": \"1\",\n" +
        "                  \"id\": \"191\",\n" +
        "                  \"label_id\": \"84\"\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ]\n" +
        "    }\n" +
        "  },\n" +
        "  \"requestname\": \"custom_form_recursive\"\n" +
        "}";
}
