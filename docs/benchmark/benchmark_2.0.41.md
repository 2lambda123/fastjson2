## 1 EishayFuryCompatibleParse
| aliyun ecs spec | jdk version 	|	jsonb	|	fury |
|-----|-----|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3965.435	|	3920.94 (98.88%) |
|  | jdk-11.0.20	|	4587.45	|	3466.975 (75.58%) |
|  | jdk-17.0.8	|	5235.916	|	4471.018 (85.39%) |
|  | graalvm_17.0.8+9.1	|	5155.234	|	5186.987 (100.62%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	6165.756	|	6214.936 (100.8%) |
|  | jdk-11.0.20	|	5861.017	|	6999.071 (119.42%) |
|  | jdk-17.0.8	|	7097.373	|	7234.525 (101.93%) |
|  | graalvm_17.0.8+9.1	|	6450.415	|	7591.863 (117.7%) |
| orangepi5p | jdk1.8.0_381	|	3980.768	|	5551.498 (139.46%) |
|  | jdk-11.0.20	|	4078.231	|	4643.299 (113.86%) |
|  | jdk-17.0.8	|	4206.666	|	5211.113 (123.88%) |
|  | graalvm_17.0.8+9.1	|	4555.471	|	5541.858 (121.65%) |


### 1.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 5235.916 | 5155.234 | -1.54% |
|  aliyun_ecs.c8y.large |  jsonb | 7097.373 | 6450.415 | -9.12% |
|  orangepi5p |  jsonb | 4206.666 | 4555.471 | 8.29% |
|  aliyun_ecs.c8i.large |  fury | 4471.018 | 5186.987 | 16.01% |
|  aliyun_ecs.c8y.large |  fury | 7234.525 | 7591.863 | 4.94% |
|  orangepi5p |  fury | 5211.113 | 5541.858 | 6.35% |
## 2 EishayFuryCompatibleWrite
| aliyun ecs spec | jdk version 	|	jsonb	|	fury |
|-----|-----|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3346.14	|	3502.318 (104.67%) |
|  | jdk-11.0.20	|	3071.833	|	3633.522 (118.29%) |
|  | jdk-17.0.8	|	3671.737	|	4305.918 (117.27%) |
|  | graalvm_17.0.8+9.1	|	3870.611	|	4886.796 (126.25%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	4815.828	|	6388.251 (132.65%) |
|  | jdk-11.0.20	|	4665.752	|	5702.206 (122.21%) |
|  | jdk-17.0.8	|	4891.163	|	5698.237 (116.5%) |
|  | graalvm_17.0.8+9.1	|	7846.578	|	6032.803 (76.88%) |
| orangepi5p | jdk1.8.0_381	|	3675.994	|	4560.391 (124.06%) |
|  | jdk-11.0.20	|	3459.241	|	4722.927 (136.53%) |
|  | jdk-17.0.8	|	3317.119	|	4433.609 (133.66%) |
|  | graalvm_17.0.8+9.1	|	4041.561	|	5022.42 (124.27%) |


### 2.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 3671.737 | 3870.611 | 5.42% |
|  aliyun_ecs.c8y.large |  jsonb | 4891.163 | 7846.578 | 60.42% |
|  orangepi5p |  jsonb | 3317.119 | 4041.561 | 21.84% |
|  aliyun_ecs.c8i.large |  fury | 4305.918 | 4886.796 | 13.49% |
|  aliyun_ecs.c8y.large |  fury | 5698.237 | 6032.803 | 5.87% |
|  orangepi5p |  fury | 4433.609 | 5022.42 | 13.28% |
## 3 EishayParseBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	5045.836	|	3455.424 (68.48%)	|	663.11 (13.14%)	|	114.872 (2.28%) |
|  | jdk-11.0.20	|	5985.401	|	3708.845 (61.96%)	|	621.925 (10.39%)	|	112.136 (1.87%) |
|  | jdk-17.0.8	|	6766.218	|	3828.226 (56.58%)	|	639.246 (9.45%)	|	127.612 (1.89%) |
|  | graalvm_17.0.8+9.1	|	7916.908	|	4545.485 (57.41%)	|	788.98 (9.97%)	|	141.861 (1.79%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	7385.284	|	4758.686 (64.43%)	|	334.784 (4.53%)	|	159.808 (2.16%) |
|  | jdk-11.0.20	|	7884.713	|	5522.692 (70.04%)	|	391.908 (4.97%)	|	151.414 (1.92%) |
|  | jdk-17.0.8	|	8744.329	|	5510.313 (63.02%)	|	397.0 (4.54%)	|	156.552 (1.79%) |
|  | graalvm_17.0.8+9.1	|	9729.093	|	5877.161 (60.41%)	|	486.125 (5%)	|	172.011 (1.77%) |
| orangepi5p | jdk1.8.0_381	|	5116.632	|	3292.541 (64.35%)	|	190.047 (3.71%)	|	121.804 (2.38%) |
|  | jdk-11.0.20	|	5656.705	|	3692.082 (65.27%)	|	186.552 (3.3%)	|	119.118 (2.11%) |
|  | jdk-17.0.8	|	5885.253	|	3755.969 (63.82%)	|	196.177 (3.33%)	|	126.957 (2.16%) |
|  | graalvm_17.0.8+9.1	|	7715.222	|	3916.091 (50.76%)	|	228.529 (2.96%)	|	129.951 (1.68%) |


### 3.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 6766.218 | 7916.908 | 17.01% |
|  aliyun_ecs.c8y.large |  jsonb | 8744.329 | 9729.093 | 11.26% |
|  orangepi5p |  jsonb | 5885.253 | 7715.222 | 31.09% |
|  aliyun_ecs.c8i.large |  fastjson2UTF8Bytes | 3828.226 | 4545.485 | 18.74% |
|  aliyun_ecs.c8y.large |  fastjson2UTF8Bytes | 5510.313 | 5877.161 | 6.66% |
|  orangepi5p |  fastjson2UTF8Bytes | 3755.969 | 3916.091 | 4.26% |
|  aliyun_ecs.c8i.large |  hessian | 639.246 | 788.98 | 23.42% |
|  aliyun_ecs.c8y.large |  hessian | 397.0 | 486.125 | 22.45% |
|  orangepi5p |  hessian | 196.177 | 228.529 | 16.49% |
|  aliyun_ecs.c8i.large |  javaSerialize | 127.612 | 141.861 | 11.17% |
|  aliyun_ecs.c8y.large |  javaSerialize | 156.552 | 172.011 | 9.87% |
|  orangepi5p |  javaSerialize | 126.957 | 129.951 | 2.36% |
## 4 EishayParseBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	7883.182	|	3510.873 (44.54%)	|	3150.255 (39.96%) |
|  | jdk-11.0.20	|	9163.661	|	2997.868 (32.71%)	|	2949.751 (32.19%) |
|  | jdk-17.0.8	|	11424.159	|	3355.194 (29.37%)	|	3598.159 (31.5%) |
|  | graalvm_17.0.8+9.1	|	15614.161	|	4264.309 (27.31%)	|	6172.508 (39.53%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	10418.905	|	4839.702 (46.45%)	|	3512.56 (33.71%) |
|  | jdk-11.0.20	|	11823.884	|	5567.17 (47.08%)	|	3909.602 (33.07%) |
|  | jdk-17.0.8	|	13278.691	|	5582.336 (42.04%)	|	4608.757 (34.71%) |
|  | graalvm_17.0.8+9.1	|	19712.119	|	5212.619 (26.44%)	|	7780.292 (39.47%) |
| orangepi5p | jdk1.8.0_381	|	6586.53	|	3895.023 (59.14%)	|	2205.249 (33.48%) |
|  | jdk-11.0.20	|	7055.259	|	3673.895 (52.07%)	|	3084.073 (43.71%) |
|  | jdk-17.0.8	|	7249.72	|	3913.254 (53.98%)	|	3216.203 (44.36%) |
|  | graalvm_17.0.8+9.1	|	8983.228	|	3446.088 (38.36%)	|	5192.375 (57.8%) |


### 4.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 11424.159 | 15614.161 | 36.68% |
|  aliyun_ecs.c8y.large |  jsonb | 13278.691 | 19712.119 | 48.45% |
|  orangepi5p |  jsonb | 7249.72 | 8983.228 | 23.91% |
|  aliyun_ecs.c8i.large |  kryo | 3355.194 | 4264.309 | 27.1% |
|  aliyun_ecs.c8y.large |  kryo | 5582.336 | 5212.619 | -6.62% |
|  orangepi5p |  kryo | 3913.254 | 3446.088 | -11.94% |
|  aliyun_ecs.c8i.large |  protobuf | 3598.159 | 6172.508 | 71.55% |
|  aliyun_ecs.c8y.large |  protobuf | 4608.757 | 7780.292 | 68.82% |
|  orangepi5p |  protobuf | 3216.203 | 5192.375 | 61.44% |
## 5 EishayParseBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3835.086	|	646.775 (16.86%)	|	115.1 (3%) |
|  | jdk-11.0.20	|	2510.545	|	630.842 (25.13%)	|	117.682 (4.69%) |
|  | jdk-17.0.8	|	4994.83	|	651.922 (13.05%)	|	128.286 (2.57%) |
|  | graalvm_17.0.8+9.1	|	5240.514	|	821.367 (15.67%)	|	144.575 (2.76%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	5776.009	|	369.732 (6.4%)	|	167.166 (2.89%) |
|  | jdk-11.0.20	|	6242.197	|	359.45 (5.76%)	|	153.338 (2.46%) |
|  | jdk-17.0.8	|	6433.104	|	385.505 (5.99%)	|	158.227 (2.46%) |
|  | graalvm_17.0.8+9.1	|	6695.348	|	582.463 (8.7%)	|	173.351 (2.59%) |
| orangepi5p | jdk1.8.0_381	|	3498.794	|	181.548 (5.19%)	|	129.091 (3.69%) |
|  | jdk-11.0.20	|	3847.187	|	185.052 (4.81%)	|	117.169 (3.05%) |
|  | jdk-17.0.8	|	3931.641	|	195.59 (4.97%)	|	130.325 (3.31%) |
|  | graalvm_17.0.8+9.1	|	4595.401	|	224.66 (4.89%)	|	129.709 (2.82%) |


### 5.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2JSONB | 4994.83 | 5240.514 | 4.92% |
|  aliyun_ecs.c8y.large |  fastjson2JSONB | 6433.104 | 6695.348 | 4.08% |
|  orangepi5p |  fastjson2JSONB | 3931.641 | 4595.401 | 16.88% |
|  aliyun_ecs.c8i.large |  hessian | 651.922 | 821.367 | 25.99% |
|  aliyun_ecs.c8y.large |  hessian | 385.505 | 582.463 | 51.09% |
|  orangepi5p |  hessian | 195.59 | 224.66 | 14.86% |
|  aliyun_ecs.c8i.large |  javaSerialize | 128.286 | 144.575 | 12.7% |
|  aliyun_ecs.c8y.large |  javaSerialize | 158.227 | 173.351 | 9.56% |
|  orangepi5p |  javaSerialize | 130.325 | 129.709 | -0.47% |
## 6 EishayParseString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3180.713	|	2165.489 (68.08%)	|	1123.294 (35.32%)	|	1000.499 (31.46%) |
|  | jdk-11.0.20	|	3650.011	|	1954.595 (53.55%)	|	1005.039 (27.54%)	|	982.326 (26.91%) |
|  | jdk-17.0.8	|	3919.39	|	2648.984 (67.59%)	|	1025.148 (26.16%)	|	1012.906 (25.84%) |
|  | graalvm_17.0.8+9.1	|	4247.269	|	3525.801 (83.01%)	|	1045.527 (24.62%)	|	1094.251 (25.76%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	4813.007	|	3307.144 (68.71%)	|	1434.918 (29.81%)	|	1468.064 (30.5%) |
|  | jdk-11.0.20	|	5369.806	|	3162.461 (58.89%)	|	1355.007 (25.23%)	|	1409.842 (26.25%) |
|  | jdk-17.0.8	|	5465.733	|	4342.68 (79.45%)	|	1435.765 (26.27%)	|	1401.434 (25.64%) |
|  | graalvm_17.0.8+9.1	|	5905.752	|	5032.511 (85.21%)	|	1460.076 (24.72%)	|	1554.705 (26.33%) |
| orangepi5p | jdk1.8.0_381	|	3483.137	|	2425.96 (69.65%)	|	1067.208 (30.64%)	|	992.698 (28.5%) |
|  | jdk-11.0.20	|	3777.024	|	2304.342 (61.01%)	|	1020.391 (27.02%)	|	981.593 (25.99%) |
|  | jdk-17.0.8	|	3788.061	|	3223.803 (85.1%)	|	1078.012 (28.46%)	|	987.324 (26.06%) |
|  | graalvm_17.0.8+9.1	|	3955.535	|	3738.271 (94.51%)	|	1057.245 (26.73%)	|	1001.234 (25.31%) |


### 6.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3919.39 | 4247.269 | 8.37% |
|  aliyun_ecs.c8y.large |  fastjson2 | 5465.733 | 5905.752 | 8.05% |
|  orangepi5p |  fastjson2 | 3788.061 | 3955.535 | 4.42% |
|  aliyun_ecs.c8i.large |  fastjson1 | 2648.984 | 3525.801 | 33.1% |
|  aliyun_ecs.c8y.large |  fastjson1 | 4342.68 | 5032.511 | 15.88% |
|  orangepi5p |  fastjson1 | 3223.803 | 3738.271 | 15.96% |
|  aliyun_ecs.c8i.large |  jackson | 1025.148 | 1045.527 | 1.99% |
|  aliyun_ecs.c8y.large |  jackson | 1435.765 | 1460.076 | 1.69% |
|  orangepi5p |  jackson | 1078.012 | 1057.245 | -1.93% |
|  aliyun_ecs.c8i.large |  gson | 1012.906 | 1094.251 | 8.03% |
|  aliyun_ecs.c8y.large |  gson | 1401.434 | 1554.705 | 10.94% |
|  orangepi5p |  gson | 987.324 | 1001.234 | 1.41% |
## 7 EishayParseStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	1496.38	|	583.307 (38.98%)	|	954.307 (63.77%)	|	934.965 (62.48%) |
|  | jdk-11.0.20	|	1717.131	|	581.55 (33.87%)	|	911.462 (53.08%)	|	918.341 (53.48%) |
|  | jdk-17.0.8	|	2475.963	|	636.559 (25.71%)	|	954.19 (38.54%)	|	877.425 (35.44%) |
|  | graalvm_17.0.8+9.1	|	2806.109	|	889.1 (31.68%)	|	958.933 (34.17%)	|	945.355 (33.69%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	2054.899	|	914.349 (44.5%)	|	1321.959 (64.33%)	|	1325.781 (64.52%) |
|  | jdk-11.0.20	|	2397.499	|	934.655 (38.98%)	|	1313.784 (54.8%)	|	1346.198 (56.15%) |
|  | jdk-17.0.8	|	3882.021	|	1039.548 (26.78%)	|	1373.855 (35.39%)	|	1373.037 (35.37%) |
|  | graalvm_17.0.8+9.1	|	4215.463	|	1333.73 (31.64%)	|	1321.447 (31.35%)	|	1403.971 (33.31%) |
| orangepi5p | jdk1.8.0_381	|	2728.017	|	657.721 (24.11%)	|	1014.515 (37.19%)	|	894.044 (32.77%) |
|  | jdk-11.0.20	|	2812.401	|	650.156 (23.12%)	|	973.38 (34.61%)	|	890.349 (31.66%) |
|  | jdk-17.0.8	|	2807.143	|	743.281 (26.48%)	|	997.093 (35.52%)	|	898.79 (32.02%) |
|  | graalvm_17.0.8+9.1	|	1553.893	|	877.714 (56.48%)	|	938.969 (60.43%)	|	949.981 (61.14%) |


### 7.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2475.963 | 2806.109 | 13.33% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3882.021 | 4215.463 | 8.59% |
|  orangepi5p |  fastjson2 | 2807.143 | 1553.893 | -44.65% |
|  aliyun_ecs.c8i.large |  fastjson1 | 636.559 | 889.1 | 39.67% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1039.548 | 1333.73 | 28.3% |
|  orangepi5p |  fastjson1 | 743.281 | 877.714 | 18.09% |
|  aliyun_ecs.c8i.large |  jackson | 954.19 | 958.933 | 0.5% |
|  aliyun_ecs.c8y.large |  jackson | 1373.855 | 1321.447 | -3.81% |
|  orangepi5p |  jackson | 997.093 | 938.969 | -5.83% |
|  aliyun_ecs.c8i.large |  gson | 877.425 | 945.355 | 7.74% |
|  aliyun_ecs.c8y.large |  gson | 1373.037 | 1403.971 | 2.25% |
|  orangepi5p |  gson | 898.79 | 949.981 | 5.7% |
## 8 EishayParseTreeString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	2183.441	|	1142.959 (52.35%)	|	1176.971 (53.9%)	|	867.891 (39.75%) |
|  | jdk-11.0.20	|	1935.273	|	999.721 (51.66%)	|	983.956 (50.84%)	|	792.307 (40.94%) |
|  | jdk-17.0.8	|	2415.915	|	1208.764 (50.03%)	|	1130.652 (46.8%)	|	798.779 (33.06%) |
|  | graalvm_17.0.8+9.1	|	2389.827	|	1534.926 (64.23%)	|	1136.821 (47.57%)	|	1005.749 (42.08%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	2822.358	|	1342.905 (47.58%)	|	1216.776 (43.11%)	|	1180.515 (41.83%) |
|  | jdk-11.0.20	|	2580.489	|	1445.277 (56.01%)	|	1276.792 (49.48%)	|	1119.368 (43.38%) |
|  | jdk-17.0.8	|	3079.247	|	1556.828 (50.56%)	|	1496.028 (48.58%)	|	1174.803 (38.15%) |
|  | graalvm_17.0.8+9.1	|	3346.621	|	2293.385 (68.53%)	|	1573.476 (47.02%)	|	1338.639 (40%) |
| orangepi5p | jdk1.8.0_381	|	1847.996	|	1022.904 (55.35%)	|	991.461 (53.65%)	|	794.714 (43%) |
|  | jdk-11.0.20	|	1956.646	|	964.651 (49.3%)	|	931.905 (47.63%)	|	810.851 (41.44%) |
|  | jdk-17.0.8	|	2008.938	|	1186.372 (59.05%)	|	1070.988 (53.31%)	|	784.927 (39.07%) |
|  | graalvm_17.0.8+9.1	|	2120.392	|	1496.004 (70.55%)	|	1121.143 (52.87%)	|	906.123 (42.73%) |


### 8.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2415.915 | 2389.827 | -1.08% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3079.247 | 3346.621 | 8.68% |
|  orangepi5p |  fastjson2 | 2008.938 | 2120.392 | 5.55% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1208.764 | 1534.926 | 26.98% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1556.828 | 2293.385 | 47.31% |
|  orangepi5p |  fastjson1 | 1186.372 | 1496.004 | 26.1% |
|  aliyun_ecs.c8i.large |  jackson | 1130.652 | 1136.821 | 0.55% |
|  aliyun_ecs.c8y.large |  jackson | 1496.028 | 1573.476 | 5.18% |
|  orangepi5p |  jackson | 1070.988 | 1121.143 | 4.68% |
|  aliyun_ecs.c8i.large |  gson | 798.779 | 1005.749 | 25.91% |
|  aliyun_ecs.c8y.large |  gson | 1174.803 | 1338.639 | 13.95% |
|  orangepi5p |  gson | 784.927 | 906.123 | 15.44% |
## 9 EishayParseTreeStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	1629.867	|	1001.742 (61.46%)	|	1076.643 (66.06%)	|	802.574 (49.24%) |
|  | jdk-11.0.20	|	1580.082	|	899.044 (56.9%)	|	952.12 (60.26%)	|	751.714 (47.57%) |
|  | jdk-17.0.8	|	1853.193	|	1090.151 (58.83%)	|	1009.317 (54.46%)	|	749.696 (40.45%) |
|  | graalvm_17.0.8+9.1	|	1722.329	|	1294.94 (75.19%)	|	1081.27 (62.78%)	|	915.569 (53.16%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	2366.377	|	1265.058 (53.46%)	|	1167.266 (49.33%)	|	1043.045 (44.08%) |
|  | jdk-11.0.20	|	2543.728	|	1263.683 (49.68%)	|	1212.282 (47.66%)	|	1068.848 (42.02%) |
|  | jdk-17.0.8	|	2560.168	|	1397.256 (54.58%)	|	1215.647 (47.48%)	|	1102.116 (43.05%) |
|  | graalvm_17.0.8+9.1	|	2676.081	|	1943.706 (72.63%)	|	1449.629 (54.17%)	|	1310.955 (48.99%) |
| orangepi5p | jdk1.8.0_381	|	1654.68	|	892.414 (53.93%)	|	892.19 (53.92%)	|	744.133 (44.97%) |
|  | jdk-11.0.20	|	1618.267	|	780.297 (48.22%)	|	922.525 (57.01%)	|	750.261 (46.36%) |
|  | jdk-17.0.8	|	1684.729	|	1004.959 (59.65%)	|	994.52 (59.03%)	|	725.057 (43.04%) |
|  | graalvm_17.0.8+9.1	|	1784.842	|	1240.336 (69.49%)	|	1048.817 (58.76%)	|	860.752 (48.23%) |


### 9.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 1853.193 | 1722.329 | -7.06% |
|  aliyun_ecs.c8y.large |  fastjson2 | 2560.168 | 2676.081 | 4.53% |
|  orangepi5p |  fastjson2 | 1684.729 | 1784.842 | 5.94% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1090.151 | 1294.94 | 18.79% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1397.256 | 1943.706 | 39.11% |
|  orangepi5p |  fastjson1 | 1004.959 | 1240.336 | 23.42% |
|  aliyun_ecs.c8i.large |  jackson | 1009.317 | 1081.27 | 7.13% |
|  aliyun_ecs.c8y.large |  jackson | 1215.647 | 1449.629 | 19.25% |
|  orangepi5p |  jackson | 994.52 | 1048.817 | 5.46% |
|  aliyun_ecs.c8i.large |  gson | 749.696 | 915.569 | 22.13% |
|  aliyun_ecs.c8y.large |  gson | 1102.116 | 1310.955 | 18.95% |
|  orangepi5p |  gson | 725.057 | 860.752 | 18.72% |
## 10 EishayParseTreeUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	2229.868	|	1025.232 (45.98%)	|	1265.354 (56.75%)	|	810.322 (36.34%) |
|  | jdk-11.0.20	|	1949.748	|	941.693 (48.3%)	|	1119.419 (57.41%)	|	800.498 (41.06%) |
|  | jdk-17.0.8	|	2428.074	|	1116.41 (45.98%)	|	1142.443 (47.05%)	|	775.751 (31.95%) |
|  | graalvm_17.0.8+9.1	|	2506.583	|	1298.867 (51.82%)	|	1258.379 (50.2%)	|	1001.461 (39.95%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	2667.804	|	1106.845 (41.49%)	|	1277.216 (47.88%)	|	1007.372 (37.76%) |
|  | jdk-11.0.20	|	2987.575	|	1302.551 (43.6%)	|	1427.547 (47.78%)	|	1064.423 (35.63%) |
|  | jdk-17.0.8	|	3101.104	|	1395.167 (44.99%)	|	1567.11 (50.53%)	|	1162.565 (37.49%) |
|  | graalvm_17.0.8+9.1	|	3355.108	|	1808.476 (53.9%)	|	1671.739 (49.83%)	|	1349.518 (40.22%) |
| orangepi5p | jdk1.8.0_381	|	1787.285	|	817.688 (45.75%)	|	1070.408 (59.89%)	|	716.163 (40.07%) |
|  | jdk-11.0.20	|	1947.966	|	873.761 (44.86%)	|	1119.449 (57.47%)	|	764.116 (39.23%) |
|  | jdk-17.0.8	|	1968.621	|	1022.026 (51.92%)	|	1106.019 (56.18%)	|	752.316 (38.22%) |
|  | graalvm_17.0.8+9.1	|	2178.645	|	1160.275 (53.26%)	|	1197.438 (54.96%)	|	819.379 (37.61%) |


### 10.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2428.074 | 2506.583 | 3.23% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3101.104 | 3355.108 | 8.19% |
|  orangepi5p |  fastjson2 | 1968.621 | 2178.645 | 10.67% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1116.41 | 1298.867 | 16.34% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1395.167 | 1808.476 | 29.62% |
|  orangepi5p |  fastjson1 | 1022.026 | 1160.275 | 13.53% |
|  aliyun_ecs.c8i.large |  jackson | 1142.443 | 1258.379 | 10.15% |
|  aliyun_ecs.c8y.large |  jackson | 1567.11 | 1671.739 | 6.68% |
|  orangepi5p |  jackson | 1106.019 | 1197.438 | 8.27% |
|  aliyun_ecs.c8i.large |  gson | 775.751 | 1001.461 | 29.1% |
|  aliyun_ecs.c8y.large |  gson | 1162.565 | 1349.518 | 16.08% |
|  orangepi5p |  gson | 752.316 | 819.379 | 8.91% |
## 11 EishayParseTreeUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	1613.669	|	885.531 (54.88%)	|	1149.417 (71.23%)	|	735.635 (45.59%) |
|  | jdk-11.0.20	|	1549.278	|	799.632 (51.61%)	|	946.879 (61.12%)	|	735.27 (47.46%) |
|  | jdk-17.0.8	|	1862.41	|	909.083 (48.81%)	|	1031.775 (55.4%)	|	711.988 (38.23%) |
|  | graalvm_17.0.8+9.1	|	1800.491	|	1075.701 (59.74%)	|	1111.463 (61.73%)	|	924.103 (51.33%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	2355.17	|	1031.182 (43.78%)	|	1321.095 (56.09%)	|	964.31 (40.94%) |
|  | jdk-11.0.20	|	2564.353	|	1097.351 (42.79%)	|	1362.709 (53.14%)	|	1009.095 (39.35%) |
|  | jdk-17.0.8	|	2545.56	|	1226.013 (48.16%)	|	1417.873 (55.7%)	|	1054.777 (41.44%) |
|  | graalvm_17.0.8+9.1	|	2641.707	|	1474.959 (55.83%)	|	1500.385 (56.8%)	|	1260.134 (47.7%) |
| orangepi5p | jdk1.8.0_381	|	1604.989	|	700.243 (43.63%)	|	1010.289 (62.95%)	|	659.29 (41.08%) |
|  | jdk-11.0.20	|	1661.517	|	701.95 (42.25%)	|	1029.785 (61.98%)	|	713.33 (42.93%) |
|  | jdk-17.0.8	|	1672.492	|	866.818 (51.83%)	|	1013.751 (60.61%)	|	696.648 (41.65%) |
|  | graalvm_17.0.8+9.1	|	1801.853	|	957.337 (53.13%)	|	1062.796 (58.98%)	|	788.005 (43.73%) |


### 11.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 1862.41 | 1800.491 | -3.32% |
|  aliyun_ecs.c8y.large |  fastjson2 | 2545.56 | 2641.707 | 3.78% |
|  orangepi5p |  fastjson2 | 1672.492 | 1801.853 | 7.73% |
|  aliyun_ecs.c8i.large |  fastjson1 | 909.083 | 1075.701 | 18.33% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1226.013 | 1474.959 | 20.31% |
|  orangepi5p |  fastjson1 | 866.818 | 957.337 | 10.44% |
|  aliyun_ecs.c8i.large |  jackson | 1031.775 | 1111.463 | 7.72% |
|  aliyun_ecs.c8y.large |  jackson | 1417.873 | 1500.385 | 5.82% |
|  orangepi5p |  jackson | 1013.751 | 1062.796 | 4.84% |
|  aliyun_ecs.c8i.large |  gson | 711.988 | 924.103 | 29.79% |
|  aliyun_ecs.c8y.large |  gson | 1054.777 | 1260.134 | 19.47% |
|  orangepi5p |  gson | 696.648 | 788.005 | 13.11% |
## 12 EishayParseUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	1982.995	|	1894.298 (95.53%)	|	1195.025 (60.26%)	|	915.978 (46.19%) |
|  | jdk-11.0.20	|	2336.715	|	1691.639 (72.39%)	|	1081.532 (46.28%)	|	962.67 (41.2%) |
|  | jdk-17.0.8	|	3991.25	|	1938.046 (48.56%)	|	1059.155 (26.54%)	|	913.153 (22.88%) |
|  | graalvm_17.0.8+9.1	|	4235.011	|	2565.427 (60.58%)	|	1198.745 (28.31%)	|	1111.551 (26.25%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	1919.563	|	2701.401 (140.73%)	|	1682.191 (87.63%)	|	1319.61 (68.75%) |
|  | jdk-11.0.20	|	1862.086	|	2588.459 (139.01%)	|	1560.391 (83.8%)	|	1345.018 (72.23%) |
|  | jdk-17.0.8	|	5503.63	|	3265.001 (59.32%)	|	1579.964 (28.71%)	|	1381.204 (25.1%) |
|  | graalvm_17.0.8+9.1	|	5748.926	|	3097.096 (53.87%)	|	1471.582 (25.6%)	|	1477.192 (25.7%) |
| orangepi5p | jdk1.8.0_381	|	3192.508	|	1849.503 (57.93%)	|	1254.457 (39.29%)	|	859.454 (26.92%) |
|  | jdk-11.0.20	|	2559.42	|	1840.978 (71.93%)	|	1169.16 (45.68%)	|	901.015 (35.2%) |
|  | jdk-17.0.8	|	3699.161	|	2372.085 (64.12%)	|	1177.768 (31.84%)	|	922.568 (24.94%) |
|  | graalvm_17.0.8+9.1	|	3932.077	|	2030.641 (51.64%)	|	1068.93 (27.18%)	|	995.193 (25.31%) |


### 12.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3991.25 | 4235.011 | 6.11% |
|  aliyun_ecs.c8y.large |  fastjson2 | 5503.63 | 5748.926 | 4.46% |
|  orangepi5p |  fastjson2 | 3699.161 | 3932.077 | 6.3% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1938.046 | 2565.427 | 32.37% |
|  aliyun_ecs.c8y.large |  fastjson1 | 3265.001 | 3097.096 | -5.14% |
|  orangepi5p |  fastjson1 | 2372.085 | 2030.641 | -14.39% |
|  aliyun_ecs.c8i.large |  jackson | 1059.155 | 1198.745 | 13.18% |
|  aliyun_ecs.c8y.large |  jackson | 1579.964 | 1471.582 | -6.86% |
|  orangepi5p |  jackson | 1177.768 | 1068.93 | -9.24% |
|  aliyun_ecs.c8i.large |  gson | 913.153 | 1111.551 | 21.73% |
|  aliyun_ecs.c8y.large |  gson | 1381.204 | 1477.192 | 6.95% |
|  orangepi5p |  gson | 922.568 | 995.193 | 7.87% |
## 13 EishayParseUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	1538.082	|	547.064 (35.57%)	|	1081.007 (70.28%)	|	735.972 (47.85%) |
|  | jdk-11.0.20	|	2335.688	|	540.88 (23.16%)	|	953.266 (40.81%)	|	721.128 (30.87%) |
|  | jdk-17.0.8	|	2505.112	|	578.375 (23.09%)	|	970.277 (38.73%)	|	746.009 (29.78%) |
|  | graalvm_17.0.8+9.1	|	2778.957	|	771.433 (27.76%)	|	1079.292 (38.84%)	|	893.035 (32.14%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	3552.94	|	859.832 (24.2%)	|	1462.136 (41.15%)	|	975.405 (27.45%) |
|  | jdk-11.0.20	|	3909.913	|	868.127 (22.2%)	|	1428.381 (36.53%)	|	1009.902 (25.83%) |
|  | jdk-17.0.8	|	3892.835	|	941.042 (24.17%)	|	1417.436 (36.41%)	|	1034.804 (26.58%) |
|  | graalvm_17.0.8+9.1	|	4160.977	|	1088.292 (26.15%)	|	1369.029 (32.9%)	|	1266.942 (30.45%) |
| orangepi5p | jdk1.8.0_381	|	2505.145	|	592.723 (23.66%)	|	1139.494 (45.49%)	|	668.353 (26.68%) |
|  | jdk-11.0.20	|	2232.936	|	579.282 (25.94%)	|	1062.015 (47.56%)	|	729.099 (32.65%) |
|  | jdk-17.0.8	|	2809.497	|	661.85 (23.56%)	|	1086.446 (38.67%)	|	702.547 (25.01%) |
|  | graalvm_17.0.8+9.1	|	2969.875	|	719.581 (24.23%)	|	970.654 (32.68%)	|	818.898 (27.57%) |


### 13.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 2505.112 | 2778.957 | 10.93% |
|  aliyun_ecs.c8y.large |  fastjson2 | 3892.835 | 4160.977 | 6.89% |
|  orangepi5p |  fastjson2 | 2809.497 | 2969.875 | 5.71% |
|  aliyun_ecs.c8i.large |  fastjson1 | 578.375 | 771.433 | 33.38% |
|  aliyun_ecs.c8y.large |  fastjson1 | 941.042 | 1088.292 | 15.65% |
|  orangepi5p |  fastjson1 | 661.85 | 719.581 | 8.72% |
|  aliyun_ecs.c8i.large |  jackson | 970.277 | 1079.292 | 11.24% |
|  aliyun_ecs.c8y.large |  jackson | 1417.436 | 1369.029 | -3.42% |
|  orangepi5p |  jackson | 1086.446 | 970.654 | -10.66% |
|  aliyun_ecs.c8i.large |  gson | 746.009 | 893.035 | 19.71% |
|  aliyun_ecs.c8y.large |  gson | 1034.804 | 1266.942 | 22.43% |
|  orangepi5p |  gson | 702.547 | 818.898 | 16.56% |
## 14 EishayWriteBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	msgpack	|	protobuf |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	5680.191	|	1008.284 (17.75%)	|	3328.833 (58.6%) |
|  | jdk-11.0.20	|	5558.463	|	1267.666 (22.81%)	|	2769.482 (49.82%) |
|  | jdk-17.0.8	|	8277.69	|	1402.517 (16.94%)	|	3367.098 (40.68%) |
|  | graalvm_17.0.8+9.1	|	9025.075	|	1461.439 (16.19%)	|	7598.368 (84.19%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	7130.66	|	1211.885 (17%)	|	3934.516 (55.18%) |
|  | jdk-11.0.20	|	9404.143	|	1846.019 (19.63%)	|	3726.74 (39.63%) |
|  | jdk-17.0.8	|	10051.24	|	1771.573 (17.63%)	|	5102.236 (50.76%) |
|  | graalvm_17.0.8+9.1	|	13732.625	|	1896.544 (13.81%)	|	9059.394 (65.97%) |
| orangepi5p | jdk1.8.0_381	|	5724.373	|	798.721 (13.95%)	|	2617.451 (45.72%) |
|  | jdk-11.0.20	|	6729.256	|	1140.377 (16.95%)	|	2604.801 (38.71%) |
|  | jdk-17.0.8	|	7053.111	|	1135.322 (16.1%)	|	4097.101 (58.09%) |
|  | graalvm_17.0.8+9.1	|	9076.329	|	1232.419 (13.58%)	|	6395.137 (70.46%) |


### 14.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 8277.69 | 9025.075 | 9.03% |
|  aliyun_ecs.c8y.large |  jsonb | 10051.24 | 13732.625 | 36.63% |
|  orangepi5p |  jsonb | 7053.111 | 9076.329 | 28.69% |
|  aliyun_ecs.c8i.large |  msgpack | 1402.517 | 1461.439 | 4.2% |
|  aliyun_ecs.c8y.large |  msgpack | 1771.573 | 1896.544 | 7.05% |
|  orangepi5p |  msgpack | 1135.322 | 1232.419 | 8.55% |
|  aliyun_ecs.c8i.large |  protobuf | 3367.098 | 7598.368 | 125.67% |
|  aliyun_ecs.c8y.large |  protobuf | 5102.236 | 9059.394 | 77.56% |
|  orangepi5p |  protobuf | 4097.101 | 6395.137 | 56.09% |
## 15 EishayWriteBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	10545.889	|	3504.571 (33.23%)	|	3401.997 (32.26%) |
|  | jdk-11.0.20	|	11842.351	|	3314.579 (27.99%)	|	3258.321 (27.51%) |
|  | jdk-17.0.8	|	13185.052	|	3797.283 (28.8%)	|	3293.789 (24.98%) |
|  | graalvm_17.0.8+9.1	|	22429.216	|	5293.153 (23.6%)	|	7673.705 (34.21%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	7726.205	|	5446.575 (70.49%)	|	3609.79 (46.72%) |
|  | jdk-11.0.20	|	15778.473	|	5768.704 (36.56%)	|	4686.426 (29.7%) |
|  | jdk-17.0.8	|	13236.175	|	5619.063 (42.45%)	|	4952.199 (37.41%) |
|  | graalvm_17.0.8+9.1	|	23733.54	|	5914.242 (24.92%)	|	9509.594 (40.07%) |
| orangepi5p | jdk1.8.0_381	|	8023.821	|	3466.65 (43.2%)	|	2714.116 (33.83%) |
|  | jdk-11.0.20	|	9104.894	|	2857.378 (31.38%)	|	3541.528 (38.9%) |
|  | jdk-17.0.8	|	11670.672	|	3702.361 (31.72%)	|	3709.935 (31.79%) |
|  | graalvm_17.0.8+9.1	|	18332.464	|	4747.211 (25.9%)	|	6522.96 (35.58%) |


### 15.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  jsonb | 13185.052 | 22429.216 | 70.11% |
|  aliyun_ecs.c8y.large |  jsonb | 13236.175 | 23733.54 | 79.31% |
|  orangepi5p |  jsonb | 11670.672 | 18332.464 | 57.08% |
|  aliyun_ecs.c8i.large |  kryo | 3797.283 | 5293.153 | 39.39% |
|  aliyun_ecs.c8y.large |  kryo | 5619.063 | 5914.242 | 5.25% |
|  orangepi5p |  kryo | 3702.361 | 4747.211 | 28.22% |
|  aliyun_ecs.c8i.large |  protobuf | 3293.789 | 7673.705 | 132.98% |
|  aliyun_ecs.c8y.large |  protobuf | 4952.199 | 9509.594 | 92.03% |
|  orangepi5p |  protobuf | 3709.935 | 6522.96 | 75.82% |
## 16 EishayWriteBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3500.344	|	874.946 (25%)	|	534.045 (15.26%) |
|  | jdk-11.0.20	|	3068.12	|	844.902 (27.54%)	|	547.377 (17.84%) |
|  | jdk-17.0.8	|	3563.145	|	798.06 (22.4%)	|	508.341 (14.27%) |
|  | graalvm_17.0.8+9.1	|	3950.079	|	1246.956 (31.57%)	|	579.06 (14.66%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	4532.471	|	1152.062 (25.42%)	|	813.389 (17.95%) |
|  | jdk-11.0.20	|	4665.599	|	983.75 (21.09%)	|	890.955 (19.1%) |
|  | jdk-17.0.8	|	4752.82	|	1158.312 (24.37%)	|	813.325 (17.11%) |
|  | graalvm_17.0.8+9.1	|	7309.168	|	1262.052 (17.27%)	|	827.72 (11.32%) |
| orangepi5p | jdk1.8.0_381	|	3356.546	|	651.374 (19.41%)	|	569.2 (16.96%) |
|  | jdk-11.0.20	|	3199.454	|	649.899 (20.31%)	|	569.534 (17.8%) |
|  | jdk-17.0.8	|	2981.109	|	662.027 (22.21%)	|	571.952 (19.19%) |
|  | graalvm_17.0.8+9.1	|	5504.962	|	668.964 (12.15%)	|	530.651 (9.64%) |


### 16.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2JSONB | 3563.145 | 3950.079 | 10.86% |
|  aliyun_ecs.c8y.large |  fastjson2JSONB | 4752.82 | 7309.168 | 53.79% |
|  orangepi5p |  fastjson2JSONB | 2981.109 | 5504.962 | 84.66% |
|  aliyun_ecs.c8i.large |  hessian | 798.06 | 1246.956 | 56.25% |
|  aliyun_ecs.c8y.large |  hessian | 1158.312 | 1262.052 | 8.96% |
|  orangepi5p |  hessian | 662.027 | 668.964 | 1.05% |
|  aliyun_ecs.c8i.large |  javaSerialize | 508.341 | 579.06 | 13.91% |
|  aliyun_ecs.c8y.large |  javaSerialize | 813.325 | 827.72 | 1.77% |
|  orangepi5p |  javaSerialize | 571.952 | 530.651 | -7.22% |
## 17 EishayWriteString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3453.683	|	1539.465 (44.57%)	|	2249.767 (65.14%)	|	1002.561 (29.03%) |
|  | jdk-11.0.20	|	3147.83	|	1424.241 (45.25%)	|	1973.849 (62.71%)	|	722.952 (22.97%) |
|  | jdk-17.0.8	|	3690.415	|	1849.755 (50.12%)	|	2080.922 (56.39%)	|	711.85 (19.29%) |
|  | graalvm_17.0.8+9.1	|	5307.548	|	1779.025 (33.52%)	|	2250.648 (42.4%)	|	707.316 (13.33%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	4760.952	|	2031.824 (42.68%)	|	2577.619 (54.14%)	|	1305.228 (27.42%) |
|  | jdk-11.0.20	|	4942.597	|	2254.672 (45.62%)	|	2553.305 (51.66%)	|	1254.175 (25.37%) |
|  | jdk-17.0.8	|	5360.811	|	2092.557 (39.03%)	|	2720.201 (50.74%)	|	868.975 (16.21%) |
|  | graalvm_17.0.8+9.1	|	6277.585	|	3621.569 (57.69%)	|	3117.266 (49.66%)	|	876.594 (13.96%) |
| orangepi5p | jdk1.8.0_381	|	3652.18	|	1349.299 (36.95%)	|	1887.287 (51.68%)	|	959.676 (26.28%) |
|  | jdk-11.0.20	|	3826.385	|	1870.832 (48.89%)	|	1894.131 (49.5%)	|	715.465 (18.7%) |
|  | jdk-17.0.8	|	4033.499	|	1397.813 (34.66%)	|	1956.563 (48.51%)	|	739.099 (18.32%) |
|  | graalvm_17.0.8+9.1	|	4331.679	|	2210.386 (51.03%)	|	2090.364 (48.26%)	|	715.694 (16.52%) |


### 17.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3690.415 | 5307.548 | 43.82% |
|  aliyun_ecs.c8y.large |  fastjson2 | 5360.811 | 6277.585 | 17.1% |
|  orangepi5p |  fastjson2 | 4033.499 | 4331.679 | 7.39% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1849.755 | 1779.025 | -3.82% |
|  aliyun_ecs.c8y.large |  fastjson1 | 2092.557 | 3621.569 | 73.07% |
|  orangepi5p |  fastjson1 | 1397.813 | 2210.386 | 58.13% |
|  aliyun_ecs.c8i.large |  jackson | 2080.922 | 2250.648 | 8.16% |
|  aliyun_ecs.c8y.large |  jackson | 2720.201 | 3117.266 | 14.6% |
|  orangepi5p |  jackson | 1956.563 | 2090.364 | 6.84% |
|  aliyun_ecs.c8i.large |  gson | 711.85 | 707.316 | -0.64% |
|  aliyun_ecs.c8y.large |  gson | 868.975 | 876.594 | 0.88% |
|  orangepi5p |  gson | 739.099 | 715.694 | -3.17% |
## 18 EishayWriteStringTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3349.947	|	2007.04 (59.91%)	|	1950.33 (58.22%)	|	1148.495 (34.28%) |
|  | jdk-11.0.20	|	2456.576	|	1760.302 (71.66%)	|	1650.898 (67.2%)	|	751.964 (30.61%) |
|  | jdk-17.0.8	|	3165.243	|	1872.43 (59.16%)	|	1715.591 (54.2%)	|	748.809 (23.66%) |
|  | graalvm_17.0.8+9.1	|	3561.137	|	1923.835 (54.02%)	|	2108.592 (59.21%)	|	726.444 (20.4%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	3660.124	|	2270.82 (62.04%)	|	2391.792 (65.35%)	|	1720.089 (47%) |
|  | jdk-11.0.20	|	3802.984	|	2438.121 (64.11%)	|	2594.98 (68.24%)	|	1360.547 (35.78%) |
|  | jdk-17.0.8	|	4635.384	|	2479.294 (53.49%)	|	2531.846 (54.62%)	|	902.61 (19.47%) |
|  | graalvm_17.0.8+9.1	|	5050.148	|	3225.295 (63.87%)	|	2919.274 (57.81%)	|	919.354 (18.2%) |
| orangepi5p | jdk1.8.0_381	|	2493.661	|	1596.552 (64.02%)	|	1839.32 (73.76%)	|	1002.694 (40.21%) |
|  | jdk-11.0.20	|	2414.986	|	1593.415 (65.98%)	|	1781.304 (73.76%)	|	941.282 (38.98%) |
|  | jdk-17.0.8	|	2762.176	|	1648.221 (59.67%)	|	1862.047 (67.41%)	|	769.531 (27.86%) |
|  | graalvm_17.0.8+9.1	|	2949.602	|	1977.291 (67.04%)	|	2120.89 (71.9%)	|	768.15 (26.04%) |


### 18.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3165.243 | 3561.137 | 12.51% |
|  aliyun_ecs.c8y.large |  fastjson2 | 4635.384 | 5050.148 | 8.95% |
|  orangepi5p |  fastjson2 | 2762.176 | 2949.602 | 6.79% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1872.43 | 1923.835 | 2.75% |
|  aliyun_ecs.c8y.large |  fastjson1 | 2479.294 | 3225.295 | 30.09% |
|  orangepi5p |  fastjson1 | 1648.221 | 1977.291 | 19.97% |
|  aliyun_ecs.c8i.large |  jackson | 1715.591 | 2108.592 | 22.91% |
|  aliyun_ecs.c8y.large |  jackson | 2531.846 | 2919.274 | 15.3% |
|  orangepi5p |  jackson | 1862.047 | 2120.89 | 13.9% |
|  aliyun_ecs.c8i.large |  gson | 748.809 | 726.444 | -2.99% |
|  aliyun_ecs.c8y.large |  gson | 902.61 | 919.354 | 1.86% |
|  orangepi5p |  gson | 769.531 | 768.15 | -0.18% |
## 19 EishayWriteUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3844.927	|	1414.237 (36.78%)	|	1922.219 (49.99%)	|	905.51 (23.55%) |
|  | jdk-11.0.20	|	4257.371	|	1285.459 (30.19%)	|	1872.671 (43.99%)	|	782.219 (18.37%) |
|  | jdk-17.0.8	|	4894.031	|	1341.576 (27.41%)	|	2040.799 (41.7%)	|	709.469 (14.5%) |
|  | graalvm_17.0.8+9.1	|	7419.198	|	1983.437 (26.73%)	|	2486.425 (33.51%)	|	697.155 (9.4%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	5651.692	|	1929.912 (34.15%)	|	2615.664 (46.28%)	|	1254.996 (22.21%) |
|  | jdk-11.0.20	|	6372.039	|	1857.647 (29.15%)	|	2539.082 (39.85%)	|	1184.486 (18.59%) |
|  | jdk-17.0.8	|	6320.464	|	1844.239 (29.18%)	|	2709.09 (42.86%)	|	848.356 (13.42%) |
|  | graalvm_17.0.8+9.1	|	9416.854	|	2260.32 (24%)	|	3320.019 (35.26%)	|	867.695 (9.21%) |
| orangepi5p | jdk1.8.0_381	|	4786.854	|	1274.469 (26.62%)	|	1820.564 (38.03%)	|	795.859 (16.63%) |
|  | jdk-11.0.20	|	4877.933	|	1203.367 (24.67%)	|	1687.296 (34.59%)	|	774.897 (15.89%) |
|  | jdk-17.0.8	|	4972.77	|	1276.739 (25.67%)	|	1901.923 (38.25%)	|	730.497 (14.69%) |
|  | graalvm_17.0.8+9.1	|	6093.256	|	1406.303 (23.08%)	|	2245.064 (36.85%)	|	696.625 (11.43%) |


### 19.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 4894.031 | 7419.198 | 51.6% |
|  aliyun_ecs.c8y.large |  fastjson2 | 6320.464 | 9416.854 | 48.99% |
|  orangepi5p |  fastjson2 | 4972.77 | 6093.256 | 22.53% |
|  aliyun_ecs.c8i.large |  fastjson1 | 1341.576 | 1983.437 | 47.84% |
|  aliyun_ecs.c8y.large |  fastjson1 | 1844.239 | 2260.32 | 22.56% |
|  orangepi5p |  fastjson1 | 1276.739 | 1406.303 | 10.15% |
|  aliyun_ecs.c8i.large |  jackson | 2040.799 | 2486.425 | 21.84% |
|  aliyun_ecs.c8y.large |  jackson | 2709.09 | 3320.019 | 22.55% |
|  orangepi5p |  jackson | 1901.923 | 2245.064 | 18.04% |
|  aliyun_ecs.c8i.large |  gson | 709.469 | 697.155 | -1.74% |
|  aliyun_ecs.c8y.large |  gson | 848.356 | 867.695 | 2.28% |
|  orangepi5p |  gson | 730.497 | 696.625 | -4.64% |
## 20 EishayWriteUTF8BytesTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	jackson |
|-----|-----|----------|-----|
| aliyun_ecs.c8i.large | jdk1.8.0_381	|	3623.203	|	1920.897 (53.02%) |
|  | jdk-11.0.20	|	3056.005	|	1613.369 (52.79%) |
|  | jdk-17.0.8	|	3501.74	|	1820.755 (52%) |
|  | graalvm_17.0.8+9.1	|	4272.702	|	2610.69 (61.1%) |
| aliyun_ecs.c8y.large | jdk1.8.0_381	|	4286.314	|	2903.902 (67.75%) |
|  | jdk-11.0.20	|	4514.58	|	2205.039 (48.84%) |
|  | jdk-17.0.8	|	4351.284	|	2632.526 (60.5%) |
|  | graalvm_17.0.8+9.1	|	5856.565	|	3434.566 (58.64%) |
| orangepi5p | jdk1.8.0_381	|	3054.58	|	1950.127 (63.84%) |
|  | jdk-11.0.20	|	3094.456	|	1736.478 (56.12%) |
|  | jdk-17.0.8	|	3033.775	|	1871.284 (61.68%) |
|  | graalvm_17.0.8+9.1	|	4012.243	|	2234.561 (55.69%) |


### 20.1 jdk17 vs graalvm17
|  ecs | library | jdk-17.0.8 | graalvm-jdk-17.0.8+9.1 | delta |
|-----|-----|-----|-----|-----|
|  aliyun_ecs.c8i.large |  fastjson2 | 3501.74 | 4272.702 | 22.02% |
|  aliyun_ecs.c8y.large |  fastjson2 | 4351.284 | 5856.565 | 34.59% |
|  orangepi5p |  fastjson2 | 3033.775 | 4012.243 | 32.25% |
|  aliyun_ecs.c8i.large |  jackson | 1820.755 | 2610.69 | 43.39% |
|  aliyun_ecs.c8y.large |  jackson | 2632.526 | 3434.566 | 30.47% |
|  orangepi5p |  jackson | 1871.284 | 2234.561 | 19.41% |
