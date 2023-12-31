## EishayParseBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	2591.109	|	1383.046 (53.38%)	|	394.292 (15.22%)	|	58.884 (2.27%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	3168.932	|	1348.798 (42.56%)	|	349.63 (11.03%)	|	59.155 (1.87%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	3400.376	|	1442.65 (42.43%)	|	363.491 (10.69%)	|	65.165 (1.92%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1748.104	|	1011.894 (57.89%)	|	292.502 (16.73%)	|	51.207 (2.93%) |
| ecs.g7.xlarge | jdk-11.0.19	|	2382.467	|	1048.562 (44.01%)	|	249.237 (10.46%)	|	50.47 (2.12%) |
| ecs.g7.xlarge | jdk-17.0.7	|	2683.231	|	1119.397 (41.72%)	|	287.011 (10.7%)	|	59.486 (2.22%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	3127.766	|	1761.165 (56.31%)	|	341.011 (10.9%)	|	76.046 (2.43%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	3948.263	|	2136.883 (54.12%)	|	395.47 (10.02%)	|	78.29 (1.98%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	4400.743	|	2207.344 (50.16%)	|	440.668 (10.01%)	|	80.038 (1.82%) |

## EishayParseBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf	|	fastjson2UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	4667.868	|	1740.72 (37.29%)	|	1478.135 (31.67%)	|	2195.744 (47.04%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	4665.776	|	1672.863 (35.85%)	|	1467.398 (31.45%)	|	2243.598 (48.09%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	5636.115	|	1784.099 (31.65%)	|	1843.513 (32.71%)	|	2477.082 (43.95%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	2808.607	|	1471.077 (52.38%)	|	1150.827 (40.98%)	|	1583.451 (56.38%) |
| ecs.g7.xlarge | jdk-11.0.19	|	3414.165	|	1430.856 (41.91%)	|	1257.941 (36.84%)	|	1775.241 (52%) |
| ecs.g7.xlarge | jdk-17.0.7	|	4162.173	|	1556.242 (37.39%)	|	1540.227 (37.01%)	|	1961.941 (47.14%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	5305.284	|	2787.161 (52.54%)	|	1462.122 (27.56%)	|	2844.055 (53.61%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	6078.2	|	2808.895 (46.21%)	|	1449.143 (23.84%)	|	3143.747 (51.72%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	6293.381	|	1734.667 (27.56%)	|	2782.942 (44.22%)	|	3289.804 (52.27%) |

## EishayParseBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1904.614	|	393.213 (20.65%)	|	59.213 (3.11%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	2353.768	|	359.825 (15.29%)	|	58.647 (2.49%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	2597.45	|	356.018 (13.71%)	|	64.568 (2.49%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1506.426	|	300.042 (19.92%)	|	51.466 (3.42%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1838.032	|	263.298 (14.32%)	|	51.924 (2.82%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1999.72	|	284.548 (14.23%)	|	59.141 (2.96%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	2556.855	|	350.695 (13.72%)	|	76.452 (2.99%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	3170.034	|	387.732 (12.23%)	|	77.694 (2.45%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	3259.126	|	451.938 (13.87%)	|	78.992 (2.42%) |

## EishayParseString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1425.769	|	1108.495 (77.75%)	|	553.839 (38.84%)	|	520.689 (36.52%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1297.055	|	958.583 (73.9%)	|	526.307 (40.58%)	|	503.893 (38.85%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1418.425	|	1314.826 (92.7%)	|	538.812 (37.99%)	|	496.052 (34.97%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1103.984	|	915.001 (82.88%)	|	458.438 (41.53%)	|	404.205 (36.61%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1017.195	|	812.389 (79.87%)	|	421.285 (41.42%)	|	389.627 (38.3%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1115.759	|	1106.43 (99.16%)	|	438.528 (39.3%)	|	425.149 (38.1%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1953.899	|	1660.711 (84.99%)	|	707.289 (36.2%)	|	728.395 (37.28%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	2128.424	|	1647.681 (77.41%)	|	720.118 (33.83%)	|	736.758 (34.62%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	2214.709	|	2248.899 (101.54%)	|	732.123 (33.06%)	|	762.123 (34.41%) |

## EishayParseStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1050.637	|	292.813 (27.87%)	|	507.257 (48.28%)	|	474.219 (45.14%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	972.173	|	290.99 (29.93%)	|	463.457 (47.67%)	|	470.281 (48.37%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1011.214	|	324.243 (32.06%)	|	471.169 (46.59%)	|	449.982 (44.5%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	804.229	|	261.095 (32.47%)	|	408.972 (50.85%)	|	379.494 (47.19%) |
| ecs.g7.xlarge | jdk-11.0.19	|	770.464	|	253.799 (32.94%)	|	385.259 (50%)	|	367.26 (47.67%) |
| ecs.g7.xlarge | jdk-17.0.7	|	792.426	|	293.844 (37.08%)	|	378.445 (47.76%)	|	395.436 (49.9%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1167.212	|	419.973 (35.98%)	|	601.768 (51.56%)	|	679.207 (58.19%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	1573.455	|	479.44 (30.47%)	|	660.384 (41.97%)	|	686.915 (43.66%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	1628.702	|	534.161 (32.8%)	|	678.029 (41.63%)	|	699.858 (42.97%) |

## EishayParseTreeString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1090.892	|	592.936 (54.35%)	|	624.269 (57.23%)	|	433.804 (39.77%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1014.053	|	537.392 (52.99%)	|	509.226 (50.22%)	|	393.53 (38.81%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1207.611	|	627.446 (51.96%)	|	567.094 (46.96%)	|	396.673 (32.85%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	839.663	|	472.754 (56.3%)	|	483.565 (57.59%)	|	350.289 (41.72%) |
| ecs.g7.xlarge | jdk-11.0.19	|	735.025	|	398.649 (54.24%)	|	417.67 (56.82%)	|	329.504 (44.83%) |
| ecs.g7.xlarge | jdk-17.0.7	|	935.897	|	498.291 (53.24%)	|	441.231 (47.15%)	|	330.447 (35.31%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1326.65	|	710.615 (53.56%)	|	612.441 (46.16%)	|	592.584 (44.67%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	1559.813	|	737.35 (47.27%)	|	695.483 (44.59%)	|	593.422 (38.04%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	1601.088	|	794.356 (49.61%)	|	750.546 (46.88%)	|	602.473 (37.63%) |

## EishayParseTreeStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	835.01	|	479.293 (57.4%)	|	557.415 (66.76%)	|	396.827 (47.52%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	792.419	|	444.784 (56.13%)	|	489.352 (61.75%)	|	374.08 (47.21%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	934.703	|	548.487 (58.68%)	|	520.99 (55.74%)	|	369.397 (39.52%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	642.7	|	403.346 (62.76%)	|	425.961 (66.28%)	|	332.099 (51.67%) |
| ecs.g7.xlarge | jdk-11.0.19	|	647.613	|	351.435 (54.27%)	|	391.103 (60.39%)	|	302.237 (46.67%) |
| ecs.g7.xlarge | jdk-17.0.7	|	702.047	|	427.553 (60.9%)	|	424.099 (60.41%)	|	306.192 (43.61%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1139.048	|	603.498 (52.98%)	|	587.512 (51.58%)	|	534.012 (46.88%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	1284.168	|	634.284 (49.39%)	|	599.619 (46.69%)	|	569.248 (44.33%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	1313.992	|	693.999 (52.82%)	|	646.583 (49.21%)	|	555.157 (42.25%) |

## EishayParseTreeUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1123.092	|	535.979 (47.72%)	|	678.365 (60.4%)	|	384.146 (34.2%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1029.815	|	487.887 (47.38%)	|	570.129 (55.36%)	|	395.491 (38.4%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1219.568	|	559.188 (45.85%)	|	634.924 (52.06%)	|	387.037 (31.74%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	796.495	|	420.958 (52.85%)	|	526.903 (66.15%)	|	318.708 (40.01%) |
| ecs.g7.xlarge | jdk-11.0.19	|	705.493	|	365.654 (51.83%)	|	457.454 (64.84%)	|	320.768 (45.47%) |
| ecs.g7.xlarge | jdk-17.0.7	|	961.363	|	448.922 (46.7%)	|	523.652 (54.47%)	|	325.576 (33.87%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1302.127	|	536.653 (41.21%)	|	628.1 (48.24%)	|	485.448 (37.28%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	1570.46	|	651.708 (41.5%)	|	719.796 (45.83%)	|	564.376 (35.94%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	1604.4	|	730.765 (45.55%)	|	839.208 (52.31%)	|	577.603 (36%) |

## EishayParseTreeUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	898.278	|	452.285 (50.35%)	|	586.894 (65.34%)	|	368.414 (41.01%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	830.478	|	402.028 (48.41%)	|	509.311 (61.33%)	|	368.522 (44.37%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	949.363	|	471.84 (49.7%)	|	550.715 (58.01%)	|	361.298 (38.06%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	627.291	|	356.011 (56.75%)	|	488.846 (77.93%)	|	303.959 (48.46%) |
| ecs.g7.xlarge | jdk-11.0.19	|	599.509	|	311.155 (51.9%)	|	421.71 (70.34%)	|	304.874 (50.85%) |
| ecs.g7.xlarge | jdk-17.0.7	|	722.409	|	376.222 (52.08%)	|	465.847 (64.49%)	|	302.432 (41.86%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1115.435	|	506.181 (45.38%)	|	627.649 (56.27%)	|	464.764 (41.67%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	1287.222	|	568.956 (44.2%)	|	729.362 (56.66%)	|	529.339 (41.12%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	1326.317	|	639.49 (48.22%)	|	750.317 (56.57%)	|	541.948 (40.86%) |

## EishayParseUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1335.827	|	934.337 (69.94%)	|	643.998 (48.21%)	|	461.721 (34.56%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1304.548	|	833.553 (63.9%)	|	580.14 (44.47%)	|	484.831 (37.16%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1433.499	|	993.101 (69.28%)	|	579.403 (40.42%)	|	486.841 (33.96%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	966.503	|	767.303 (79.39%)	|	533.491 (55.2%)	|	372.564 (38.55%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1045.207	|	728.523 (69.7%)	|	497.976 (47.64%)	|	387.952 (37.12%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1133.658	|	883.933 (77.97%)	|	494.734 (43.64%)	|	413.872 (36.51%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1757.3	|	1263.122 (71.88%)	|	790.485 (44.98%)	|	657.074 (37.39%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	2131.367	|	1353.221 (63.49%)	|	775.33 (36.38%)	|	709.414 (33.28%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	2247.48	|	1737.969 (77.33%)	|	639.242 (28.44%)	|	729.087 (32.44%) |

## EishayParseUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	970.511	|	282.753 (29.13%)	|	551.179 (56.79%)	|	371.996 (38.33%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	961.651	|	270.34 (28.11%)	|	515.823 (53.64%)	|	369.727 (38.45%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1044.044	|	292.877 (28.05%)	|	519.192 (49.73%)	|	355.165 (34.02%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	760.168	|	245.663 (32.32%)	|	458.889 (60.37%)	|	297.038 (39.08%) |
| ecs.g7.xlarge | jdk-11.0.19	|	789.859	|	238.902 (30.25%)	|	444.182 (56.24%)	|	299.755 (37.95%) |
| ecs.g7.xlarge | jdk-17.0.7	|	834.295	|	268.497 (32.18%)	|	440.037 (52.74%)	|	300.752 (36.05%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1435.671	|	420.855 (29.31%)	|	725.409 (50.53%)	|	482.482 (33.61%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	1571.213	|	445.726 (28.37%)	|	706.359 (44.96%)	|	526.217 (33.49%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	1578.402	|	488.89 (30.97%)	|	754.796 (47.82%)	|	552.334 (34.99%) |

## EishayWriteBinary
| aliyun ecs spec | jdk version 	|	jsonb	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	2410.702	|	1834.091 (76.08%)	|	457.89 (18.99%)	|	263.305 (10.92%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	2967.085	|	1917.038 (64.61%)	|	441.032 (14.86%)	|	257.538 (8.68%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	4139.295	|	2251.201 (54.39%)	|	419.402 (10.13%)	|	276.903 (6.69%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1851.005	|	1506.12 (81.37%)	|	444.135 (23.99%)	|	240.952 (13.02%) |
| ecs.g7.xlarge | jdk-11.0.19	|	2286.198	|	1574.518 (68.87%)	|	408.099 (17.85%)	|	233.428 (10.21%) |
| ecs.g7.xlarge | jdk-17.0.7	|	3276.627	|	1925.353 (58.76%)	|	408.819 (12.48%)	|	245.025 (7.48%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	3117.858	|	2537.658 (81.39%)	|	622.583 (19.97%)	|	408.173 (13.09%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	4543.744	|	2949.174 (64.91%)	|	589.767 (12.98%)	|	445.723 (9.81%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	4615.837	|	3055.919 (66.21%)	|	641.703 (13.9%)	|	423.342 (9.17%) |

## EishayWriteBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	jsonb	|	kryo	|	protobuf	|	fastjson2UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	4169.395	|	null	|	1658.623 (39.78%)	|	2466.216 (59.15%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	6518.495	|	null	|	1584.694 (24.31%)	|	2638.198 (40.47%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	7849.478	|	1847.764 (23.54%)	|	1700.96 (21.67%)	|	2720.544 (34.66%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	3054.588	|	null	|	1409.154 (46.13%)	|	2047.076 (67.02%) |
| ecs.g7.xlarge | jdk-11.0.19	|	4553.257	|	null	|	1465.581 (32.19%)	|	2165.882 (47.57%) |
| ecs.g7.xlarge | jdk-17.0.7	|	5650.569	|	1543.342 (27.31%)	|	1504.667 (26.63%)	|	2361.94 (41.8%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	4257.124	|	null	|	1920.724 (45.12%)	|	3185.034 (74.82%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	9310.455	|	null	|	2735.296 (29.38%)	|	3925.532 (42.16%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	4902.05	|	null	|	2471.948 (50.43%)	|	4167.365 (85.01%) |

## EishayWriteBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1598.912	|	462.131 (28.9%)	|	273.716 (17.12%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1689.877	|	430.501 (25.48%)	|	277.83 (16.44%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1956.434	|	428.263 (21.89%)	|	273.918 (14%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1256.393	|	438.392 (34.89%)	|	237.807 (18.93%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1349.054	|	411.091 (30.47%)	|	251.377 (18.63%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1625.102	|	404.387 (24.88%)	|	233.225 (14.35%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	2138.947	|	611.668 (28.6%)	|	406.787 (19.02%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	2458.242	|	624.204 (25.39%)	|	454.739 (18.5%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	2636.188	|	649.205 (24.63%)	|	420.716 (15.96%) |

## EishayWriteString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1821.148	|	787.4 (43.24%)	|	1159.382 (63.66%)	|	484.221 (26.59%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1636.986	|	735.303 (44.92%)	|	1005.673 (61.43%)	|	382.856 (23.39%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1797.768	|	768.022 (42.72%)	|	1023.832 (56.95%)	|	360.217 (20.04%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1608.177	|	638.294 (39.69%)	|	940.367 (58.47%)	|	405.254 (25.2%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1453.401	|	604.215 (41.57%)	|	845.321 (58.16%)	|	335.979 (23.12%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1689.71	|	645.281 (38.19%)	|	947.705 (56.09%)	|	332.929 (19.7%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	2429.311	|	1072.521 (44.15%)	|	1252.225 (51.55%)	|	747.169 (30.76%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	2486.56	|	1183.156 (47.58%)	|	1466.532 (58.98%)	|	685.27 (27.56%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	2432.354	|	1007.247 (41.41%)	|	1435.807 (59.03%)	|	433.744 (17.83%) |

## EishayWriteStringTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1613.323	|	974.865 (60.43%)	|	1113.065 (68.99%)	|	533.18 (33.05%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1599.428	|	918.599 (57.43%)	|	977.926 (61.14%)	|	421.131 (26.33%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	1471.796	|	927.85 (63.04%)	|	975.795 (66.3%)	|	375.133 (25.49%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1231.223	|	785.128 (63.77%)	|	871.264 (70.76%)	|	435.195 (35.35%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1214.06	|	704.88 (58.06%)	|	786.539 (64.79%)	|	387.195 (31.89%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1172.424	|	736.146 (62.79%)	|	772.19 (65.86%)	|	353.382 (30.14%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	1854.416	|	1118.916 (60.34%)	|	1348.962 (72.74%)	|	897.657 (48.41%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	2342.667	|	1260.675 (53.81%)	|	1349.715 (57.61%)	|	704.086 (30.05%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	2371.872	|	1281.232 (54.02%)	|	1293.018 (54.51%)	|	457.582 (19.29%) |

## EishayWriteUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.g8i.xlarge | jdk1.8.0_371	|	1842.645	|	723.445 (39.26%)	|	1049.298 (56.95%)	|	422.164 (22.91%) |
| ecs.g8i.xlarge | jdk-11.0.19	|	1899.146	|	668.308 (35.19%)	|	960.578 (50.58%)	|	456.53 (24.04%) |
| ecs.g8i.xlarge | jdk-17.0.7	|	2257.304	|	677.159 (30%)	|	1038.856 (46.02%)	|	333.478 (14.77%) |
| ecs.g7.xlarge | jdk1.8.0_371	|	1524.347	|	572.848 (37.58%)	|	901.09 (59.11%)	|	398.341 (26.13%) |
| ecs.g7.xlarge | jdk-11.0.19	|	1553.448	|	548.275 (35.29%)	|	786.578 (50.63%)	|	307.496 (19.79%) |
| ecs.g7.xlarge | jdk-17.0.7	|	1897.386	|	568.955 (29.99%)	|	917.81 (48.37%)	|	335.761 (17.7%) |
| ecs.g8m.xlarge | jdk1.8.0_371	|	2560.951	|	1003.307 (39.18%)	|	1312.336 (51.24%)	|	644.669 (25.17%) |
| ecs.g8m.xlarge | jdk-11.0.19	|	2798.379	|	963.069 (34.42%)	|	1276.3 (45.61%)	|	653.793 (23.36%) |
| ecs.g8m.xlarge | jdk-17.0.7	|	3043.542	|	1024.96 (33.68%)	|	1449.288 (47.62%)	|	432.628 (14.21%) |

