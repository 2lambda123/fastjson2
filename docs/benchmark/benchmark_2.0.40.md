## 1 EishayFuryCompatibleParse
| aliyun ecs spec | jdk version 	|	jsonb	|	fury |
|-----|-----|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	4006.293	|	4014.445 (100.2%) |
|  | jdk-11.0.19	|	3883.754	|	3776.397 (97.24%) |
|  | jdk-17.0.7	|	5154.137	|	4434.909 (86.05%) |
|  | graalvm_17.0.7+8.1	|	5403.543	|	5069.685 (93.82%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	6019.855	|	6295.064 (104.57%) |
|  | jdk-11.0.19	|	6684.56	|	7469.929 (111.75%) |
|  | jdk-17.0.7	|	7210.134	|	6896.865 (95.66%) |
|  | graalvm_17.0.7+8.1	|	6897.134	|	7966.501 (115.5%) |


### 1.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 5154.137 | 5403.543 | 4.84% |
|  aliyun_ecs.c8y.large |  jsonb | 7210.134 | 6897.134 | -4.34% |
|  aliyun_ecs.c8i.large |  fury | 4434.909 | 5069.685 | 14.31% |
|  aliyun_ecs.c8y.large |  fury | 6896.865 | 7966.501 | 15.51% |
## 2 EishayFuryCompatibleWrite
| aliyun ecs spec | jdk version 	|	jsonb	|	fury |
|-----|-----|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3231.278	|	3294.366 (101.95%) |
|  | jdk-11.0.19	|	3120.745	|	3288.301 (105.37%) |
|  | jdk-17.0.7	|	3635.834	|	3667.775 (100.88%) |
|  | graalvm_17.0.7+8.1	|	4194.937	|	4533.684 (108.08%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	4790.38	|	5981.243 (124.86%) |
|  | jdk-11.0.19	|	4495.463	|	6639.763 (147.7%) |
|  | jdk-17.0.7	|	4912.443	|	5560.853 (113.2%) |
|  | graalvm_17.0.7+8.1	|	7266.487	|	5821.005 (80.11%) |


### 2.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 3635.834 | 4194.937 | 15.38% |
|  aliyun_ecs.c8y.large |  jsonb | 4912.443 | 7266.487 | 47.92% |
|  aliyun_ecs.c8i.large |  fury | 3667.775 | 4533.684 | 23.61% |
|  aliyun_ecs.c8y.large |  fury | 5560.853 | 5821.005 | 4.68% |
## 3 EishayParseBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	5019.824	|	3417.567 (68.08%)	|	666.896 (13.29%)	|	118.009 (2.35%) |
|  | jdk-11.0.19	|	5966.696	|	3675.072 (61.59%)	|	615.569 (10.32%)	|	113.193 (1.9%) |
|  | jdk-17.0.7	|	6822.995	|	3883.387 (56.92%)	|	625.873 (9.17%)	|	126.701 (1.86%) |
|  | graalvm_17.0.7+8.1	|	8030.245	|	4491.032 (55.93%)	|	821.862 (10.23%)	|	140.427 (1.75%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	7484.333	|	4791.8 (64.02%)	|	367.222 (4.91%)	|	165.514 (2.21%) |
|  | jdk-11.0.19	|	7994.677	|	5493.386 (68.71%)	|	412.308 (5.16%)	|	153.614 (1.92%) |
|  | jdk-17.0.7	|	8997.506	|	5564.651 (61.85%)	|	389.401 (4.33%)	|	159.015 (1.77%) |
|  | graalvm_17.0.7+8.1	|	10719.7	|	6095.04 (56.86%)	|	524.262 (4.89%)	|	173.678 (1.62%) |


### 3.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 6822.995 | 8030.245 | 17.69% |
|  aliyun_ecs.c8y.large |  jsonb | 8997.506 | 10719.7 | 19.14% |
|  aliyun_ecs.c8i.large |  fastjson2UTF8Bytes | 3883.387 | 4491.032 | 15.65% |
|  aliyun_ecs.c8y.large |  fastjson2UTF8Bytes | 5564.651 | 6095.04 | 9.53% |
|  aliyun_ecs.c8i.large |  hessian | 625.873 | 821.862 | 31.31% |
|  aliyun_ecs.c8y.large |  hessian | 389.401 | 524.262 | 34.63% |
|  aliyun_ecs.c8i.large |  javaSerialize | 126.701 | 140.427 | 10.83% |
|  aliyun_ecs.c8y.large |  javaSerialize | 159.015 | 173.678 | 9.22% |
## 4 EishayParseBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf	|	fastjson2UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	7832.872	|	3675.752 (46.93%)	|	2652.356 (33.86%)	|	4134.564 (52.78%) |
|  | jdk-11.0.19	|	9285.973	|	3251.315 (35.01%)	|	2777.82 (29.91%)	|	4242.369 (45.69%) |
|  | jdk-17.0.7	|	11329.976	|	3012.174 (26.59%)	|	3510.698 (30.99%)	|	4881.718 (43.09%) |
|  | graalvm_17.0.7+8.1	|	15340.837	|	4222.94 (27.53%)	|	6162.131 (40.17%)	|	5594.401 (36.47%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	11314.041	|	5469.415 (48.34%)	|	3312.679 (29.28%)	|	5771.103 (51.01%) |
|  | jdk-11.0.19	|	12291.395	|	5416.462 (44.07%)	|	3695.871 (30.07%)	|	6312.538 (51.36%) |
|  | jdk-17.0.7	|	13538.834	|	5829.315 (43.06%)	|	4594.963 (33.94%)	|	6629.15 (48.96%) |
|  | graalvm_17.0.7+8.1	|	22555.142	|	5234.035 (23.21%)	|	8441.879 (37.43%)	|	7686.516 (34.08%) |


### 4.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 11329.976 | 15340.837 | 35.4% |
|  aliyun_ecs.c8y.large |  jsonb | 13538.834 | 22555.142 | 66.6% |
|  aliyun_ecs.c8i.large |  kryo | 3012.174 | 4222.94 | 40.2% |
|  aliyun_ecs.c8y.large |  kryo | 5829.315 | 5234.035 | -10.21% |
|  aliyun_ecs.c8i.large |  protobuf | 3510.698 | 6162.131 | 75.52% |
|  aliyun_ecs.c8y.large |  protobuf | 4594.963 | 8441.879 | 83.72% |
|  aliyun_ecs.c8i.large |  fastjson2UTF8Bytes | 4881.718 | 5594.401 | 14.6% |
|  aliyun_ecs.c8y.large |  fastjson2UTF8Bytes | 6629.15 | 7686.516 | 15.95% |
## 5 EishayParseBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3870.55	|	679.987 (17.57%)	|	114.303 (2.95%) |
|  | jdk-11.0.19	|	4514.125	|	616.234 (13.65%)	|	116.609 (2.58%) |
|  | jdk-17.0.7	|	5012.033	|	644.729 (12.86%)	|	127.039 (2.53%) |
|  | graalvm_17.0.7+8.1	|	5208.774	|	751.262 (14.42%)	|	138.45 (2.66%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	5805.387	|	406.284 (7%)	|	162.292 (2.8%) |
|  | jdk-11.0.19	|	6243.987	|	411.183 (6.59%)	|	152.706 (2.45%) |
|  | jdk-17.0.7	|	6618.81	|	420.813 (6.36%)	|	162.492 (2.46%) |
|  | graalvm_17.0.7+8.1	|	6898.367	|	553.54 (8.02%)	|	174.365 (2.53%) |


### 5.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2JSONB | 5012.033 | 5208.774 | 3.93% |
|  aliyun_ecs.c8y.large |  fastjson2JSONB | 6618.81 | 6898.367 | 4.22% |
|  aliyun_ecs.c8i.large |  hessian | 644.729 | 751.262 | 16.52% |
|  aliyun_ecs.c8y.large |  hessian | 420.813 | 553.54 | 31.54% |
|  aliyun_ecs.c8i.large |  javaSerialize | 127.039 | 138.45 | 8.98% |
|  aliyun_ecs.c8y.large |  javaSerialize | 162.492 | 174.365 | 7.31% |
## 6 EishayParseString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3156.232	|	2197.568 (69.63%)	|	1104.51 (34.99%)	|	993.265 (31.47%) |
|  | jdk-11.0.19	|	3565.629	|	1978.94 (55.5%)	|	976.647 (27.39%)	|	987.671 (27.7%) |
|  | jdk-17.0.7	|	3929.78	|	2558.402 (65.1%)	|	1010.499 (25.71%)	|	998.017 (25.4%) |
|  | graalvm_17.0.7+8.1	|	3769.891	|	3498.861 (92.81%)	|	1076.458 (28.55%)	|	1036.419 (27.49%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	4842.389	|	3339.415 (68.96%)	|	1410.688 (29.13%)	|	1435.193 (29.64%) |
|  | jdk-11.0.19	|	5424.028	|	3195.35 (58.91%)	|	1424.309 (26.26%)	|	1382.094 (25.48%) |
|  | jdk-17.0.7	|	5603.255	|	4375.119 (78.08%)	|	1406.392 (25.1%)	|	1441.561 (25.73%) |
|  | graalvm_17.0.7+8.1	|	6394.504	|	5326.377 (83.3%)	|	1493.366 (23.35%)	|	1559.694 (24.39%) |


### 6.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3929.78 | 3769.891 | -4.07% |
|  aliyun_ecs.c8y.large |  fastjson2 | 5603.255 | 6394.504 | 14.12% |
|  aliyun_ecs.c8i.large |  fastjson1 | 2558.402 | 3498.861 | 36.76% |
|  aliyun_ecs.c8y.large |  fastjson1 | 4375.119 | 5326.377 | 21.74% |
|  aliyun_ecs.c8i.large |  jackson | 1010.499 | 1076.458 | 6.53% |
|  aliyun_ecs.c8y.large |  jackson | 1406.392 | 1493.366 | 6.18% |
|  aliyun_ecs.c8i.large |  gson | 998.017 | 1036.419 | 3.85% |
|  aliyun_ecs.c8y.large |  gson | 1441.561 | 1559.694 | 8.19% |
## 7 EishayParseStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	1462.268	|	584.597 (39.98%)	|	999.062 (68.32%)	|	875.049 (59.84%) |
|  | jdk-11.0.19	|	2357.449	|	581.09 (24.65%)	|	910.231 (38.61%)	|	890.881 (37.79%) |
|  | jdk-17.0.7	|	2475.298	|	647.987 (26.18%)	|	914.675 (36.95%)	|	865.385 (34.96%) |
|  | graalvm_17.0.7+8.1	|	2597.824	|	877.447 (33.78%)	|	967.467 (37.24%)	|	947.614 (36.48%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	1909.457	|	947.439 (49.62%)	|	1353.697 (70.89%)	|	1397.458 (73.19%) |
|  | jdk-11.0.19	|	1785.747	|	948.723 (53.13%)	|	1275.473 (71.43%)	|	1304.824 (73.07%) |
|  | jdk-17.0.7	|	3900.463	|	1041.885 (26.71%)	|	1315.385 (33.72%)	|	1324.437 (33.96%) |
|  | graalvm_17.0.7+8.1	|	4259.399	|	1356.623 (31.85%)	|	1338.054 (31.41%)	|	1434.656 (33.68%) |


### 7.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2475.298 | 2597.824 | 4.95% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3900.463 | 4259.399 | 9.2% |
|  aliyun_ecs.c8i.large |  fastjson1 | 647.987 | 877.447 | 35.41% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1041.885 | 1356.623 | 30.21% |
|  aliyun_ecs.c8i.large |  jackson | 914.675 | 967.467 | 5.77% |
|  aliyun_ecs.c8y.large |  jackson | 1315.385 | 1338.054 | 1.72% |
|  aliyun_ecs.c8i.large |  gson | 865.385 | 947.614 | 9.5% |
|  aliyun_ecs.c8y.large |  gson | 1324.437 | 1434.656 | 8.32% |
## 8 EishayParseTreeString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	2068.131	|	1149.98 (55.6%)	|	1189.999 (57.54%)	|	872.194 (42.17%) |
|  | jdk-11.0.19	|	2016.168	|	1027.33 (50.95%)	|	985.831 (48.9%)	|	794.503 (39.41%) |
|  | jdk-17.0.7	|	2407.623	|	1270.902 (52.79%)	|	1115.341 (46.33%)	|	816.631 (33.92%) |
|  | graalvm_17.0.7+8.1	|	2393.561	|	1537.586 (64.24%)	|	1184.186 (49.47%)	|	1037.921 (43.36%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	2653.767	|	1408.824 (53.09%)	|	1251.507 (47.16%)	|	1214.597 (45.77%) |
|  | jdk-11.0.19	|	2592.487	|	1444.79 (55.73%)	|	1302.752 (50.25%)	|	1134.235 (43.75%) |
|  | jdk-17.0.7	|	3117.688	|	1601.847 (51.38%)	|	1388.401 (44.53%)	|	1192.316 (38.24%) |
|  | graalvm_17.0.7+8.1	|	3513.099	|	2341.334 (66.65%)	|	1736.625 (49.43%)	|	1304.306 (37.13%) |


### 8.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2407.623 | 2393.561 | -0.58% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3117.688 | 3513.099 | 12.68% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1270.902 | 1537.586 | 20.98% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1601.847 | 2341.334 | 46.16% |
|  aliyun_ecs.c8i.large |  jackson | 1115.341 | 1184.186 | 6.17% |
|  aliyun_ecs.c8y.large |  jackson | 1388.401 | 1736.625 | 25.08% |
|  aliyun_ecs.c8i.large |  gson | 816.631 | 1037.921 | 27.1% |
|  aliyun_ecs.c8y.large |  gson | 1192.316 | 1304.306 | 9.39% |
## 9 EishayParseTreeStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	1604.625	|	953.393 (59.42%)	|	1095.955 (68.3%)	|	801.218 (49.93%) |
|  | jdk-11.0.19	|	1629.338	|	883.535 (54.23%)	|	937.618 (57.55%)	|	737.218 (45.25%) |
|  | jdk-17.0.7	|	1835.609	|	1034.04 (56.33%)	|	1006.664 (54.84%)	|	753.177 (41.03%) |
|  | graalvm_17.0.7+8.1	|	1775.481	|	1284.07 (72.32%)	|	1083.2 (61.01%)	|	949.553 (53.48%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	2379.145	|	1272.706 (53.49%)	|	1122.663 (47.19%)	|	995.902 (41.86%) |
|  | jdk-11.0.19	|	2232.759	|	1244.756 (55.75%)	|	1230.619 (55.12%)	|	1068.385 (47.85%) |
|  | jdk-17.0.7	|	2615.018	|	1465.018 (56.02%)	|	1397.261 (53.43%)	|	1113.615 (42.59%) |
|  | graalvm_17.0.7+8.1	|	2800.893	|	1984.147 (70.84%)	|	1493.395 (53.32%)	|	1344.215 (47.99%) |


### 9.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 1835.609 | 1775.481 | -3.28% |
|  aliyun_ecs.c8y.large |  fastjson2 | 2615.018 | 2800.893 | 7.11% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1034.04 | 1284.07 | 24.18% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1465.018 | 1984.147 | 35.43% |
|  aliyun_ecs.c8i.large |  jackson | 1006.664 | 1083.2 | 7.6% |
|  aliyun_ecs.c8y.large |  jackson | 1397.261 | 1493.395 | 6.88% |
|  aliyun_ecs.c8i.large |  gson | 753.177 | 949.553 | 26.07% |
|  aliyun_ecs.c8y.large |  gson | 1113.615 | 1344.215 | 20.71% |
## 10 EishayParseTreeUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	2253.119	|	1047.091 (46.47%)	|	1268.693 (56.31%)	|	800.616 (35.53%) |
|  | jdk-11.0.19	|	1928.438	|	924.035 (47.92%)	|	1049.457 (54.42%)	|	789.078 (40.92%) |
|  | jdk-17.0.7	|	2416.002	|	1081.031 (44.74%)	|	1227.024 (50.79%)	|	776.757 (32.15%) |
|  | graalvm_17.0.7+8.1	|	2485.747	|	1334.818 (53.7%)	|	1169.777 (47.06%)	|	992.472 (39.93%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	2686.366	|	1131.964 (42.14%)	|	1391.747 (51.81%)	|	1088.287 (40.51%) |
|  | jdk-11.0.19	|	3081.4	|	1342.872 (43.58%)	|	1413.445 (45.87%)	|	1092.199 (35.44%) |
|  | jdk-17.0.7	|	3220.585	|	1414.442 (43.92%)	|	1610.724 (50.01%)	|	1144.371 (35.53%) |
|  | graalvm_17.0.7+8.1	|	3396.467	|	1850.144 (54.47%)	|	1769.245 (52.09%)	|	1380.327 (40.64%) |


### 10.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2416.002 | 2485.747 | 2.89% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3220.585 | 3396.467 | 5.46% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1081.031 | 1334.818 | 23.48% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1414.442 | 1850.144 | 30.8% |
|  aliyun_ecs.c8i.large |  jackson | 1227.024 | 1169.777 | -4.67% |
|  aliyun_ecs.c8y.large |  jackson | 1610.724 | 1769.245 | 9.84% |
|  aliyun_ecs.c8i.large |  gson | 776.757 | 992.472 | 27.77% |
|  aliyun_ecs.c8y.large |  gson | 1144.371 | 1380.327 | 20.62% |
## 11 EishayParseTreeUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	1663.85	|	859.703 (51.67%)	|	1135.78 (68.26%)	|	716.387 (43.06%) |
|  | jdk-11.0.19	|	1628.729	|	783.578 (48.11%)	|	915.422 (56.2%)	|	715.709 (43.94%) |
|  | jdk-17.0.7	|	1859.587	|	930.583 (50.04%)	|	1011.526 (54.4%)	|	734.636 (39.51%) |
|  | graalvm_17.0.7+8.1	|	1837.542	|	1068.823 (58.17%)	|	1189.277 (64.72%)	|	902.54 (49.12%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	2331.373	|	1035.594 (44.42%)	|	1288.0 (55.25%)	|	917.203 (39.34%) |
|  | jdk-11.0.19	|	2564.731	|	1125.43 (43.88%)	|	1421.56 (55.43%)	|	1031.218 (40.21%) |
|  | jdk-17.0.7	|	2629.211	|	1243.885 (47.31%)	|	1377.542 (52.39%)	|	1077.872 (41%) |
|  | graalvm_17.0.7+8.1	|	2675.189	|	1503.873 (56.22%)	|	1493.942 (55.84%)	|	1267.649 (47.39%) |


### 11.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 1859.587 | 1837.542 | -1.19% |
|  aliyun_ecs.c8y.large |  fastjson2 | 2629.211 | 2675.189 | 1.75% |
|  aliyun_ecs.c8i.large |  fastjson1 | 930.583 | 1068.823 | 14.86% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1243.885 | 1503.873 | 20.9% |
|  aliyun_ecs.c8i.large |  jackson | 1011.526 | 1189.277 | 17.57% |
|  aliyun_ecs.c8y.large |  jackson | 1377.542 | 1493.942 | 8.45% |
|  aliyun_ecs.c8i.large |  gson | 734.636 | 902.54 | 22.86% |
|  aliyun_ecs.c8y.large |  gson | 1077.872 | 1267.649 | 17.61% |
## 12 EishayParseUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3441.978	|	1860.507 (54.05%)	|	1212.707 (35.23%)	|	900.791 (26.17%) |
|  | jdk-11.0.19	|	2686.178	|	1684.938 (62.73%)	|	1091.59 (40.64%)	|	953.993 (35.51%) |
|  | jdk-17.0.7	|	3933.587	|	1961.016 (49.85%)	|	1103.734 (28.06%)	|	1005.074 (25.55%) |
|  | graalvm_17.0.7+8.1	|	4246.688	|	2460.261 (57.93%)	|	1182.191 (27.84%)	|	1096.604 (25.82%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	4793.682	|	2793.993 (58.28%)	|	1592.278 (33.22%)	|	1323.94 (27.62%) |
|  | jdk-11.0.19	|	5372.353	|	2674.104 (49.78%)	|	1637.39 (30.48%)	|	1355.83 (25.24%) |
|  | jdk-17.0.7	|	5546.736	|	3392.697 (61.17%)	|	1499.562 (27.04%)	|	1429.623 (25.77%) |
|  | graalvm_17.0.7+8.1	|	6209.018	|	3182.952 (51.26%)	|	1488.092 (23.97%)	|	1560.54 (25.13%) |


### 12.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3933.587 | 4246.688 | 7.96% |
|  aliyun_ecs.c8y.large |  fastjson2 | 5546.736 | 6209.018 | 11.94% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1961.016 | 2460.261 | 25.46% |
|  aliyun_ecs.c8y.large |  fastjson1 | 3392.697 | 3182.952 | -6.18% |
|  aliyun_ecs.c8i.large |  jackson | 1103.734 | 1182.191 | 7.11% |
|  aliyun_ecs.c8y.large |  jackson | 1499.562 | 1488.092 | -0.76% |
|  aliyun_ecs.c8i.large |  gson | 1005.074 | 1096.604 | 9.11% |
|  aliyun_ecs.c8y.large |  gson | 1429.623 | 1560.54 | 9.16% |
## 13 EishayParseUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	2289.121	|	549.005 (23.98%)	|	1097.293 (47.94%)	|	730.365 (31.91%) |
|  | jdk-11.0.19	|	2421.554	|	534.115 (22.06%)	|	984.021 (40.64%)	|	713.69 (29.47%) |
|  | jdk-17.0.7	|	2542.36	|	565.785 (22.25%)	|	985.877 (38.78%)	|	712.661 (28.03%) |
|  | graalvm_17.0.7+8.1	|	2149.097	|	772.425 (35.94%)	|	1057.822 (49.22%)	|	885.621 (41.21%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	1867.75	|	836.26 (44.77%)	|	1525.49 (81.68%)	|	958.867 (51.34%) |
|  | jdk-11.0.19	|	3959.868	|	859.682 (21.71%)	|	1383.277 (34.93%)	|	1046.831 (26.44%) |
|  | jdk-17.0.7	|	3962.123	|	956.435 (24.14%)	|	1354.149 (34.18%)	|	1056.907 (26.68%) |
|  | graalvm_17.0.7+8.1	|	4232.824	|	1121.039 (26.48%)	|	1392.167 (32.89%)	|	1284.104 (30.34%) |


### 13.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2542.36 | 2149.097 | -15.47% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3962.123 | 4232.824 | 6.83% |
|  aliyun_ecs.c8i.large |  fastjson1 | 565.785 | 772.425 | 36.52% |
|  aliyun_ecs.c8y.large |  fastjson1 | 956.435 | 1121.039 | 17.21% |
|  aliyun_ecs.c8i.large |  jackson | 985.877 | 1057.822 | 7.3% |
|  aliyun_ecs.c8y.large |  jackson | 1354.149 | 1392.167 | 2.81% |
|  aliyun_ecs.c8i.large |  gson | 712.661 | 885.621 | 24.27% |
|  aliyun_ecs.c8y.large |  gson | 1056.907 | 1284.104 | 21.5% |
## 14 EishayWriteBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	msgpack	|	protobuf |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	5465.825	|	998.166 (18.26%)	|	3399.888 (62.2%) |
|  | jdk-11.0.19	|	5391.333	|	1265.203 (23.47%)	|	2717.543 (50.41%) |
|  | jdk-17.0.7	|	8134.962	|	1373.996 (16.89%)	|	3289.401 (40.44%) |
|  | graalvm_17.0.7+8.1	|	9224.496	|	1477.774 (16.02%)	|	7674.729 (83.2%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	7801.075	|	1179.42 (15.12%)	|	4080.973 (52.31%) |
|  | jdk-11.0.19	|	9125.037	|	1850.821 (20.28%)	|	4216.458 (46.21%) |
|  | jdk-17.0.7	|	9380.896	|	1750.079 (18.66%)	|	5056.654 (53.9%) |
|  | graalvm_17.0.7+8.1	|	14097.154	|	2011.804 (14.27%)	|	10222.507 (72.51%) |


### 14.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 8134.962 | 9224.496 | 13.39% |
|  aliyun_ecs.c8y.large |  jsonb | 9380.896 | 14097.154 | 50.28% |
|  aliyun_ecs.c8i.large |  msgpack | 1373.996 | 1477.774 | 7.55% |
|  aliyun_ecs.c8y.large |  msgpack | 1750.079 | 2011.804 | 14.96% |
|  aliyun_ecs.c8i.large |  protobuf | 3289.401 | 7674.729 | 133.32% |
|  aliyun_ecs.c8y.large |  protobuf | 5056.654 | 10222.507 | 102.16% |
## 15 EishayWriteBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf	|	fastjson2UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	11504.149	|	3067.057 (26.66%)	|	3348.793 (29.11%)	|	4329.454 (37.63%) |
|  | jdk-11.0.19	|	12642.68	|	3879.002 (30.68%)	|	3149.864 (24.91%)	|	4745.419 (37.53%) |
|  | jdk-17.0.7	|	17071.846	|	4139.071 (24.25%)	|	3649.202 (21.38%)	|	5243.561 (30.71%) |
|  | graalvm_17.0.7+8.1	|	18626.032	|	5364.064 (28.8%)	|	7327.518 (39.34%)	|	8295.495 (44.54%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	9920.405	|	5132.401 (51.74%)	|	3938.921 (39.71%)	|	6140.282 (61.9%) |
|  | jdk-11.0.19	|	17205.386	|	5470.012 (31.79%)	|	4873.038 (28.32%)	|	7304.021 (42.45%) |
|  | jdk-17.0.7	|	19434.282	|	4760.758 (24.5%)	|	5292.072 (27.23%)	|	7796.877 (40.12%) |
|  | graalvm_17.0.7+8.1	|	34238.69	|	6482.433 (18.93%)	|	9801.347 (28.63%)	|	11953.434 (34.91%) |


### 15.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 17071.846 | 18626.032 | 9.1% |
|  aliyun_ecs.c8y.large |  jsonb | 19434.282 | 34238.69 | 76.18% |
|  aliyun_ecs.c8i.large |  kryo | 4139.071 | 5364.064 | 29.6% |
|  aliyun_ecs.c8y.large |  kryo | 4760.758 | 6482.433 | 36.16% |
|  aliyun_ecs.c8i.large |  protobuf | 3649.202 | 7327.518 | 100.8% |
|  aliyun_ecs.c8y.large |  protobuf | 5292.072 | 9801.347 | 85.21% |
|  aliyun_ecs.c8i.large |  fastjson2UTF8Bytes | 5243.561 | 8295.495 | 58.2% |
|  aliyun_ecs.c8y.large |  fastjson2UTF8Bytes | 7796.877 | 11953.434 | 53.31% |
## 16 EishayWriteBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3532.672	|	874.411 (24.75%)	|	522.23 (14.78%) |
|  | jdk-11.0.19	|	3039.853	|	826.148 (27.18%)	|	525.012 (17.27%) |
|  | jdk-17.0.7	|	3552.71	|	807.952 (22.74%)	|	531.875 (14.97%) |
|  | graalvm_17.0.7+8.1	|	4825.771	|	1146.321 (23.75%)	|	589.132 (12.21%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	4720.22	|	1198.021 (25.38%)	|	815.895 (17.29%) |
|  | jdk-11.0.19	|	5048.239	|	975.849 (19.33%)	|	905.769 (17.94%) |
|  | jdk-17.0.7	|	4742.032	|	1115.618 (23.53%)	|	794.786 (16.76%) |
|  | graalvm_17.0.7+8.1	|	6916.862	|	1242.969 (17.97%)	|	817.433 (11.82%) |


### 16.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2JSONB | 3552.71 | 4825.771 | 35.83% |
|  aliyun_ecs.c8y.large |  fastjson2JSONB | 4742.032 | 6916.862 | 45.86% |
|  aliyun_ecs.c8i.large |  hessian | 807.952 | 1146.321 | 41.88% |
|  aliyun_ecs.c8y.large |  hessian | 1115.618 | 1242.969 | 11.42% |
|  aliyun_ecs.c8i.large |  javaSerialize | 531.875 | 589.132 | 10.77% |
|  aliyun_ecs.c8y.large |  javaSerialize | 794.786 | 817.433 | 2.85% |
## 17 EishayWriteString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3445.265	|	1561.01 (45.31%)	|	2153.31 (62.5%)	|	1041.629 (30.23%) |
|  | jdk-11.0.19	|	3140.059	|	1433.575 (45.65%)	|	1961.244 (62.46%)	|	819.61 (26.1%) |
|  | jdk-17.0.7	|	3686.079	|	1539.551 (41.77%)	|	2013.667 (54.63%)	|	707.475 (19.19%) |
|  | graalvm_17.0.7+8.1	|	4967.394	|	1777.622 (35.79%)	|	2496.063 (50.25%)	|	681.991 (13.73%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	4564.29	|	2168.883 (47.52%)	|	2527.966 (55.39%)	|	1384.402 (30.33%) |
|  | jdk-11.0.19	|	4789.782	|	1991.2 (41.57%)	|	2562.181 (53.49%)	|	1154.778 (24.11%) |
|  | jdk-17.0.7	|	5286.289	|	2037.071 (38.53%)	|	2739.303 (51.82%)	|	830.33 (15.71%) |
|  | graalvm_17.0.7+8.1	|	6873.015	|	2740.83 (39.88%)	|	3189.138 (46.4%)	|	901.459 (13.12%) |


### 17.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3686.079 | 4967.394 | 34.76% |
|  aliyun_ecs.c8y.large |  fastjson2 | 5286.289 | 6873.015 | 30.02% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1539.551 | 1777.622 | 15.46% |
|  aliyun_ecs.c8y.large |  fastjson1 | 2037.071 | 2740.83 | 34.55% |
|  aliyun_ecs.c8i.large |  jackson | 2013.667 | 2496.063 | 23.96% |
|  aliyun_ecs.c8y.large |  jackson | 2739.303 | 3189.138 | 16.42% |
|  aliyun_ecs.c8i.large |  gson | 707.475 | 681.991 | -3.6% |
|  aliyun_ecs.c8y.large |  gson | 830.33 | 901.459 | 8.57% |
## 18 EishayWriteStringTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3471.855	|	2009.456 (57.88%)	|	2010.119 (57.9%)	|	1089.907 (31.39%) |
|  | jdk-11.0.19	|	2436.011	|	1747.021 (71.72%)	|	1881.429 (77.23%)	|	855.984 (35.14%) |
|  | jdk-17.0.7	|	3349.32	|	1838.637 (54.9%)	|	1656.6 (49.46%)	|	741.794 (22.15%) |
|  | graalvm_17.0.7+8.1	|	3603.306	|	2111.398 (58.6%)	|	2137.176 (59.31%)	|	718.553 (19.94%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	3777.025	|	2294.961 (60.76%)	|	2657.055 (70.35%)	|	1626.55 (43.06%) |
|  | jdk-11.0.19	|	3697.737	|	2414.817 (65.31%)	|	2546.21 (68.86%)	|	1341.26 (36.27%) |
|  | jdk-17.0.7	|	4411.755	|	2491.79 (56.48%)	|	2517.186 (57.06%)	|	889.069 (20.15%) |
|  | graalvm_17.0.7+8.1	|	4971.649	|	3308.048 (66.54%)	|	3086.4 (62.08%)	|	936.692 (18.84%) |


### 18.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3349.32 | 3603.306 | 7.58% |
|  aliyun_ecs.c8y.large |  fastjson2 | 4411.755 | 4971.649 | 12.69% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1838.637 | 2111.398 | 14.83% |
|  aliyun_ecs.c8y.large |  fastjson1 | 2491.79 | 3308.048 | 32.76% |
|  aliyun_ecs.c8i.large |  jackson | 1656.6 | 2137.176 | 29.01% |
|  aliyun_ecs.c8y.large |  jackson | 2517.186 | 3086.4 | 22.61% |
|  aliyun_ecs.c8i.large |  gson | 741.794 | 718.553 | -3.13% |
|  aliyun_ecs.c8y.large |  gson | 889.069 | 936.692 | 5.36% |
## 19 EishayWriteUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3793.983	|	1683.676 (44.38%)	|	1940.062 (51.14%)	|	933.401 (24.6%) |
|  | jdk-11.0.19	|	4154.374	|	1295.416 (31.18%)	|	1793.563 (43.17%)	|	722.345 (17.39%) |
|  | jdk-17.0.7	|	4880.024	|	1305.722 (26.76%)	|	2033.514 (41.67%)	|	663.792 (13.6%) |
|  | graalvm_17.0.7+8.1	|	7503.43	|	1582.824 (21.09%)	|	2515.569 (33.53%)	|	701.838 (9.35%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	5721.677	|	1983.53 (34.67%)	|	2551.943 (44.6%)	|	1244.735 (21.75%) |
|  | jdk-11.0.19	|	6131.9	|	1772.053 (28.9%)	|	2448.362 (39.93%)	|	1321.857 (21.56%) |
|  | jdk-17.0.7	|	6027.263	|	2020.47 (33.52%)	|	2656.329 (44.07%)	|	855.572 (14.2%) |
|  | graalvm_17.0.7+8.1	|	8910.789	|	2282.2 (25.61%)	|	3568.27 (40.04%)	|	865.879 (9.72%) |


### 19.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 4880.024 | 7503.43 | 53.76% |
|  aliyun_ecs.c8y.large |  fastjson2 | 6027.263 | 8910.789 | 47.84% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1305.722 | 1582.824 | 21.22% |
|  aliyun_ecs.c8y.large |  fastjson1 | 2020.47 | 2282.2 | 12.95% |
|  aliyun_ecs.c8i.large |  jackson | 2033.514 | 2515.569 | 23.71% |
|  aliyun_ecs.c8y.large |  jackson | 2656.329 | 3568.27 | 34.33% |
|  aliyun_ecs.c8i.large |  gson | 663.792 | 701.838 | 5.73% |
|  aliyun_ecs.c8y.large |  gson | 855.572 | 865.879 | 1.2% |
## 20 EishayWriteUTF8BytesTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	jackson |
|-----|-----|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_371	|	3786.787	|	1979.663 (52.28%) |
|  | jdk-11.0.19	|	3150.427	|	1661.181 (52.73%) |
|  | jdk-17.0.7	|	3278.717	|	1749.575 (53.36%) |
|  | graalvm_17.0.7+8.1	|	4506.512	|	2642.408 (58.64%) |
| aliyun_ecs.c8y.large | jdk1.8.0_371	|	4449.931	|	2893.686 (65.03%) |
|  | jdk-11.0.19	|	4310.864	|	2151.189 (49.9%) |
|  | jdk-17.0.7	|	4599.129	|	2683.769 (58.35%) |
|  | graalvm_17.0.7+8.1	|	6674.889	|	3402.635 (50.98%) |


### 20.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.7 | graalvm-jdk-17.0.7+8.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3278.717 | 4506.512 | 37.45% |
|  aliyun_ecs.c8y.large |  fastjson2 | 4599.129 | 6674.889 | 45.13% |
|  aliyun_ecs.c8i.large |  jackson | 1749.575 | 2642.408 | 51.03% |
|  aliyun_ecs.c8y.large |  jackson | 2683.769 | 3402.635 | 26.79% |
