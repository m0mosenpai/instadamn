package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

/* renamed from: X.3mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82603mO {
    public static final C82603mO A00 = new Object();

    public static final boolean A01(AnonymousClass317 anonymousClass317) {
        C14360o3.A0B(anonymousClass317, 0);
        int ordinal = anonymousClass317.ordinal();
        if (ordinal != 19 && ordinal != 17 && ordinal != 18 && ordinal != 20 && ordinal != 21) {
            return false;
        }
        return true;
    }

    public final C9BW A02(ParcelableSignalData parcelableSignalData) {
        C14360o3.A0B(parcelableSignalData, 0);
        String str = parcelableSignalData.A0a;
        if (str != null) {
            AnonymousClass317 anonymousClass317 = parcelableSignalData.A03;
            if (anonymousClass317 != null) {
                EnumC74603Ws enumC74603Ws = parcelableSignalData.A02;
                if (enumC74603Ws != null) {
                    EnumC64222vh enumC64222vh = parcelableSignalData.A04;
                    if (enumC64222vh != null) {
                        EnumC64262vl enumC64262vl = parcelableSignalData.A01;
                        if (enumC64262vl != null) {
                            C9CQ c9cq = parcelableSignalData.A00;
                            if (c9cq != null) {
                                String str2 = c9cq.A01;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = c9cq.A03;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = c9cq.A02;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = c9cq.A05;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = c9cq.A00;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                String str7 = c9cq.A04;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                return new C9BW(new C9C7(new C9CQ(str2, str3, str4, 2, str5, str6, str7), enumC64262vl, enumC74603Ws, anonymousClass317, enumC64222vh, str), A00(parcelableSignalData, parcelableSignalData.A03));
                            }
                            throw new IllegalStateException("Null meta Id");
                        }
                        throw new IllegalStateException("Null item type");
                    }
                    throw new IllegalStateException("Null surface type");
                }
                throw new IllegalStateException("Null signal status");
            }
            throw new IllegalStateException("Null signal type");
        }
        throw new IllegalStateException("Null signal id");
    }

    public static final AbstractC82583mM A00(ParcelableSignalData parcelableSignalData, AnonymousClass317 anonymousClass317) {
        if (anonymousClass317 != null) {
            switch (anonymousClass317.ordinal()) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 14:
                case Process.SIGTERM /* 15 */:
                case 22:
                case 23:
                case 25:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                    String str = parcelableSignalData.A0T;
                    if (str != null) {
                        String str2 = parcelableSignalData.A0U;
                        if (str2 != null) {
                            String str3 = parcelableSignalData.A0R;
                            if (str3 != null) {
                                String str4 = parcelableSignalData.A0V;
                                if (str4 != null) {
                                    EnumC64262vl enumC64262vl = parcelableSignalData.A01;
                                    if (enumC64262vl != null) {
                                        List list = parcelableSignalData.A0f;
                                        if (list != null) {
                                            Long l = parcelableSignalData.A0L;
                                            if (l != null) {
                                                long longValue = l.longValue();
                                                String str5 = parcelableSignalData.A0b;
                                                if (str5 != null) {
                                                    return new XNM(enumC64262vl, str, str2, str3, str4, str5, list, longValue);
                                                }
                                                throw new IllegalStateException("Null signal media id");
                                            }
                                            throw new IllegalStateException("Null signal timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 2:
                case 17:
                    String str6 = parcelableSignalData.A0T;
                    if (str6 != null) {
                        String str7 = parcelableSignalData.A0U;
                        if (str7 != null) {
                            String str8 = parcelableSignalData.A0R;
                            if (str8 != null) {
                                String str9 = parcelableSignalData.A0V;
                                if (str9 != null) {
                                    EnumC64262vl enumC64262vl2 = parcelableSignalData.A01;
                                    if (enumC64262vl2 != null) {
                                        List list2 = parcelableSignalData.A0f;
                                        if (list2 != null) {
                                            Long l2 = parcelableSignalData.A0H;
                                            if (l2 != null) {
                                                long longValue2 = l2.longValue();
                                                String str10 = parcelableSignalData.A0S;
                                                if (str10 != null) {
                                                    return new C72271XaS(enumC64262vl2, str6, str7, str8, str9, str10, list2, longValue2);
                                                }
                                                throw new IllegalStateException("Null media id");
                                            }
                                            throw new IllegalStateException("Null click timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 5:
                case 18:
                    String str11 = parcelableSignalData.A0T;
                    if (str11 != null) {
                        String str12 = parcelableSignalData.A0U;
                        if (str12 != null) {
                            String str13 = parcelableSignalData.A0R;
                            if (str13 != null) {
                                String str14 = parcelableSignalData.A0V;
                                if (str14 != null) {
                                    EnumC64262vl enumC64262vl3 = parcelableSignalData.A01;
                                    if (enumC64262vl3 != null) {
                                        List list3 = parcelableSignalData.A0f;
                                        if (list3 != null) {
                                            Long l3 = parcelableSignalData.A0H;
                                            if (l3 != null) {
                                                long longValue3 = l3.longValue();
                                                String str15 = parcelableSignalData.A0S;
                                                if (str15 != null) {
                                                    return new XNR(enumC64262vl3, str11, str12, str13, str14, str15, list3, longValue3);
                                                }
                                                throw new IllegalStateException("Null media id");
                                            }
                                            throw new IllegalStateException("Null click timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 7:
                    String str16 = parcelableSignalData.A0T;
                    if (str16 != null) {
                        String str17 = parcelableSignalData.A0U;
                        if (str17 != null) {
                            String str18 = parcelableSignalData.A0R;
                            if (str18 != null) {
                                String str19 = parcelableSignalData.A0V;
                                if (str19 != null) {
                                    EnumC64262vl enumC64262vl4 = parcelableSignalData.A01;
                                    if (enumC64262vl4 != null) {
                                        List list4 = parcelableSignalData.A0f;
                                        if (list4 != null) {
                                            Long l4 = parcelableSignalData.A0H;
                                            if (l4 != null) {
                                                long longValue4 = l4.longValue();
                                                String str20 = parcelableSignalData.A0S;
                                                if (str20 != null) {
                                                    String str21 = parcelableSignalData.A0N;
                                                    if (str21 != null) {
                                                        return new C208209Je(enumC64262vl4, str16, str17, str18, str19, str20, str21, list4, longValue4);
                                                    }
                                                    throw new IllegalStateException("Null account type");
                                                }
                                                throw new IllegalStateException("Null signal media id");
                                            }
                                            throw new IllegalStateException("Null signal timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 10:
                case Process.SIGSTOP /* 19 */:
                    String str22 = parcelableSignalData.A0V;
                    if (str22 != null) {
                        EnumC64262vl enumC64262vl5 = parcelableSignalData.A01;
                        if (enumC64262vl5 != null) {
                            String str23 = parcelableSignalData.A0Z;
                            if (str23 != null) {
                                String str24 = parcelableSignalData.A0W;
                                if (str24 != null) {
                                    Long l5 = parcelableSignalData.A0K;
                                    if (l5 != null) {
                                        long longValue5 = l5.longValue();
                                        Long l6 = parcelableSignalData.A0J;
                                        if (l6 != null) {
                                            long longValue6 = l6.longValue();
                                            Float f = parcelableSignalData.A07;
                                            if (f != null) {
                                                float floatValue = f.floatValue();
                                                String str25 = parcelableSignalData.A0T;
                                                if (str25 != null) {
                                                    String str26 = parcelableSignalData.A0U;
                                                    if (str26 != null) {
                                                        Integer num = parcelableSignalData.A0E;
                                                        if (num != null) {
                                                            int intValue = num.intValue();
                                                            Integer num2 = parcelableSignalData.A0B;
                                                            if (num2 != null) {
                                                                int intValue2 = num2.intValue();
                                                                Integer num3 = parcelableSignalData.A0C;
                                                                if (num3 != null) {
                                                                    int intValue3 = num3.intValue();
                                                                    Integer num4 = parcelableSignalData.A0A;
                                                                    if (num4 != null) {
                                                                        int intValue4 = num4.intValue();
                                                                        Integer num5 = parcelableSignalData.A0G;
                                                                        if (num5 != null) {
                                                                            int intValue5 = num5.intValue();
                                                                            Integer num6 = parcelableSignalData.A08;
                                                                            if (num6 != null) {
                                                                                int intValue6 = num6.intValue();
                                                                                Integer num7 = parcelableSignalData.A0F;
                                                                                if (num7 != null) {
                                                                                    int intValue7 = num7.intValue();
                                                                                    String str27 = parcelableSignalData.A0c;
                                                                                    if (str27 != null) {
                                                                                        Integer num8 = parcelableSignalData.A0D;
                                                                                        if (num8 != null) {
                                                                                            return new C82573mL(enumC64262vl5, str22, str23, str24, str25, str26, str27, floatValue, intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, num8.intValue(), longValue5, longValue6);
                                                                                        }
                                                                                        throw new IllegalStateException("Null impression signature");
                                                                                    }
                                                                                    throw new IllegalStateException("Null tracking token");
                                                                                }
                                                                                throw new IllegalStateException("Null num media consumed in ad");
                                                                            }
                                                                            throw new IllegalStateException("Null ad consumed media gap");
                                                                        }
                                                                        throw new IllegalStateException("Null reel gap to last ad media");
                                                                    }
                                                                    throw new IllegalStateException("Null client insertion position");
                                                                }
                                                                throw new IllegalStateException("Null gap to last netego");
                                                            }
                                                            throw new IllegalStateException("Null gap to last ad");
                                                        }
                                                        throw new IllegalStateException("Null multi ads type");
                                                    }
                                                    throw new IllegalStateException("Null inventory source");
                                                }
                                                throw new IllegalStateException("Null container module");
                                            }
                                            throw new IllegalStateException("Null media percent visible");
                                        }
                                        throw new IllegalStateException("Null media last seen timestamp");
                                    }
                                    throw new IllegalStateException("Null media timespent");
                                }
                                throw new IllegalStateException("Null media id");
                            }
                            throw new IllegalStateException("Null session id");
                        }
                        throw new IllegalStateException("Null item type");
                    }
                    throw new IllegalStateException("Null item id");
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 20:
                    String str28 = parcelableSignalData.A0T;
                    if (str28 != null) {
                        String str29 = parcelableSignalData.A0U;
                        if (str29 != null) {
                            String str30 = parcelableSignalData.A0R;
                            if (str30 != null) {
                                String str31 = parcelableSignalData.A0V;
                                if (str31 != null) {
                                    EnumC64262vl enumC64262vl6 = parcelableSignalData.A01;
                                    if (enumC64262vl6 != null) {
                                        List list5 = parcelableSignalData.A0f;
                                        if (list5 != null) {
                                            Long l7 = parcelableSignalData.A0H;
                                            if (l7 != null) {
                                                long longValue7 = l7.longValue();
                                                String str32 = parcelableSignalData.A0S;
                                                if (str32 != null) {
                                                    return new C72273XaU(enumC64262vl6, str28, str29, str30, str31, str32, list5, longValue7);
                                                }
                                                throw new IllegalStateException("Null media id");
                                            }
                                            throw new IllegalStateException("Null click timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 16:
                case 21:
                    String str33 = parcelableSignalData.A0T;
                    if (str33 != null) {
                        String str34 = parcelableSignalData.A0U;
                        if (str34 != null) {
                            String str35 = parcelableSignalData.A0R;
                            if (str35 != null) {
                                String str36 = parcelableSignalData.A0V;
                                if (str36 != null) {
                                    EnumC64262vl enumC64262vl7 = parcelableSignalData.A01;
                                    if (enumC64262vl7 != null) {
                                        List list6 = parcelableSignalData.A0f;
                                        if (list6 != null) {
                                            Long l8 = parcelableSignalData.A0M;
                                            if (l8 != null) {
                                                long longValue8 = l8.longValue();
                                                String str37 = parcelableSignalData.A0e;
                                                if (str37 != null) {
                                                    String str38 = parcelableSignalData.A0Y;
                                                    if (str38 != null) {
                                                        return new C221269pq(enumC64262vl7, str33, str34, str35, str36, str37, str38, list6, longValue8);
                                                    }
                                                    throw new IllegalStateException("Null xout reason");
                                                }
                                                throw new IllegalStateException("Null xout media id");
                                            }
                                            throw new IllegalStateException("Null xout timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 24:
                    String str39 = parcelableSignalData.A0T;
                    if (str39 != null) {
                        String str40 = parcelableSignalData.A0U;
                        if (str40 != null) {
                            String str41 = parcelableSignalData.A0R;
                            if (str41 != null) {
                                String str42 = parcelableSignalData.A0V;
                                if (str42 != null) {
                                    EnumC64262vl enumC64262vl8 = parcelableSignalData.A01;
                                    if (enumC64262vl8 != null) {
                                        List list7 = parcelableSignalData.A0f;
                                        if (list7 != null) {
                                            Long l9 = parcelableSignalData.A0H;
                                            if (l9 != null) {
                                                long longValue9 = l9.longValue();
                                                String str43 = parcelableSignalData.A0S;
                                                if (str43 != null) {
                                                    return new C72272XaT(enumC64262vl8, str39, str40, str41, str42, str43, list7, longValue9);
                                                }
                                                throw new IllegalStateException("Null signal media id");
                                            }
                                            throw new IllegalStateException("Null signal timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                case 26:
                    Boolean bool = parcelableSignalData.A05;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        String str44 = parcelableSignalData.A0V;
                        if (str44 != null) {
                            Long l10 = parcelableSignalData.A0H;
                            if (l10 != null) {
                                long longValue10 = l10.longValue();
                                String str45 = parcelableSignalData.A0T;
                                if (str45 != null) {
                                    String str46 = parcelableSignalData.A0U;
                                    if (str46 != null) {
                                        EnumC64262vl enumC64262vl9 = parcelableSignalData.A01;
                                        if (enumC64262vl9 != null) {
                                            List list8 = parcelableSignalData.A0f;
                                            if (list8 != null) {
                                                String str47 = parcelableSignalData.A0S;
                                                if (str47 != null) {
                                                    String str48 = parcelableSignalData.A0c;
                                                    if (str48 != null) {
                                                        return new XaW(enumC64262vl9, str44, str45, str46, str47, str48, list8, longValue10, booleanValue);
                                                    }
                                                    throw new IllegalStateException("Null tracking token");
                                                }
                                                throw new IllegalStateException("Null media id");
                                            }
                                            throw new IllegalStateException("Null media ids");
                                        }
                                        throw new IllegalStateException("Null item type");
                                    }
                                    throw new IllegalStateException("Null inventory source");
                                }
                                throw new IllegalStateException("Null container module");
                            }
                            throw new IllegalStateException("Null click timestamp");
                        }
                        throw new IllegalStateException("Null item id");
                    }
                    throw new IllegalStateException("Null is ad click");
                case 27:
                    Boolean bool2 = parcelableSignalData.A06;
                    if (bool2 != null) {
                        boolean booleanValue2 = bool2.booleanValue();
                        String str49 = parcelableSignalData.A0V;
                        if (str49 != null) {
                            Long l11 = parcelableSignalData.A0H;
                            if (l11 != null) {
                                long longValue11 = l11.longValue();
                                String str50 = parcelableSignalData.A0T;
                                if (str50 != null) {
                                    String str51 = parcelableSignalData.A0U;
                                    if (str51 != null) {
                                        EnumC64262vl enumC64262vl10 = parcelableSignalData.A01;
                                        if (enumC64262vl10 != null) {
                                            List list9 = parcelableSignalData.A0f;
                                            if (list9 != null) {
                                                String str52 = parcelableSignalData.A0S;
                                                if (str52 != null) {
                                                    String str53 = parcelableSignalData.A0c;
                                                    if (str53 != null) {
                                                        return new C72275XaX(enumC64262vl10, str49, str50, str51, str52, str53, list9, longValue11, booleanValue2);
                                                    }
                                                    throw new IllegalStateException("Null tracking token");
                                                }
                                                throw new IllegalStateException("Null media id");
                                            }
                                            throw new IllegalStateException("Null media ids");
                                        }
                                        throw new IllegalStateException("Null item type");
                                    }
                                    throw new IllegalStateException("Null inventory source");
                                }
                                throw new IllegalStateException("Null container module");
                            }
                            throw new IllegalStateException("Null click timestamp");
                        }
                        throw new IllegalStateException("Null item id");
                    }
                    throw new IllegalStateException("Null no bounce data");
                case 28:
                    String str54 = parcelableSignalData.A0T;
                    if (str54 != null) {
                        String str55 = parcelableSignalData.A0U;
                        if (str55 != null) {
                            String str56 = parcelableSignalData.A0R;
                            if (str56 != null) {
                                String str57 = parcelableSignalData.A0V;
                                if (str57 != null) {
                                    EnumC64262vl enumC64262vl11 = parcelableSignalData.A01;
                                    if (enumC64262vl11 != null) {
                                        List list10 = parcelableSignalData.A0f;
                                        if (list10 != null) {
                                            Long l12 = parcelableSignalData.A0H;
                                            if (l12 != null) {
                                                long longValue12 = l12.longValue();
                                                String str58 = parcelableSignalData.A0S;
                                                if (str58 != null) {
                                                    String str59 = parcelableSignalData.A0O;
                                                    if (str59 != null) {
                                                        String str60 = parcelableSignalData.A0c;
                                                        if (str60 != null) {
                                                            Map map = parcelableSignalData.A0g;
                                                            if (map != null) {
                                                                String str61 = parcelableSignalData.A0P;
                                                                if (str61 != null) {
                                                                    Long l13 = parcelableSignalData.A0I;
                                                                    if (l13 != null) {
                                                                        long longValue13 = l13.longValue();
                                                                        String str62 = parcelableSignalData.A0X;
                                                                        if (str62 != null) {
                                                                            String str63 = parcelableSignalData.A0d;
                                                                            if (str63 != null) {
                                                                                String str64 = parcelableSignalData.A0Q;
                                                                                if (str64 != null) {
                                                                                    Integer num9 = parcelableSignalData.A09;
                                                                                    if (num9 != null) {
                                                                                        return new C72274XaV(new XVS(num9, str59, str60, str61, str62, str63, str64, map, longValue13), enumC64262vl11, str54, str55, str56, str57, str58, list10, longValue12);
                                                                                    }
                                                                                    throw new IllegalStateException("Null afi event type");
                                                                                }
                                                                                throw new IllegalStateException("Null answer id");
                                                                            }
                                                                            throw new IllegalStateException("Null trigger source");
                                                                        }
                                                                        throw new IllegalStateException("Null question id");
                                                                    }
                                                                    throw new IllegalStateException("Null global position");
                                                                }
                                                                throw new IllegalStateException("Null afi id type");
                                                            }
                                                            throw new IllegalStateException("Null extra data");
                                                        }
                                                        throw new IllegalStateException("Null ad tracking token");
                                                    }
                                                    throw new IllegalStateException("Null afi id");
                                                }
                                                throw new IllegalStateException("Null signal media id");
                                            }
                                            throw new IllegalStateException("Null signal timestamp");
                                        }
                                        throw new IllegalStateException("Null media ids");
                                    }
                                    throw new IllegalStateException("Null item type");
                                }
                                throw new IllegalStateException("Null item id");
                            }
                            throw new IllegalStateException("Null author id");
                        }
                        throw new IllegalStateException("Null inventory source");
                    }
                    throw new IllegalStateException("Null container module");
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected signal type: ");
                    sb.append(anonymousClass317);
                    throw new IllegalStateException(sb.toString());
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final ParcelableSignalData A03(C9BW c9bw) {
        String A002;
        C9C7 c9c7 = (C9C7) c9bw.A01;
        AnonymousClass317 anonymousClass317 = (AnonymousClass317) c9c7.A04;
        EnumC64222vh enumC64222vh = (EnumC64222vh) c9c7.A05;
        AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
        C9CQ c9cq = (C9CQ) c9c7.A02;
        switch (anonymousClass317.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 22:
            case 23:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.GeneralSignalData";
                break;
            case 2:
            case 17:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.CtaClickSignalData";
                break;
            case 5:
            case 18:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.LikeClickSignalData";
                break;
            case 7:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ProfileTapSignalData";
                break;
            case 10:
            case Process.SIGSTOP /* 19 */:
                A002 = AbstractC111324zv.A00(2797);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 20:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.UnlikeClickSignalData";
                break;
            case 16:
            case 21:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.XoutSignalData";
                break;
            case 24:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.TapAndHoldSignalData";
                break;
            case 26:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.AdClickSignalData";
                break;
            case 27:
                A002 = "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.IABNoBounceSignalData";
                break;
            case 28:
                A002 = AbstractC111324zv.A00(4993);
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected signal type: ");
                sb.append(anonymousClass317);
                throw new IllegalStateException(sb.toString());
        }
        C14360o3.A0C(abstractC82583mM, A002);
        ParcelableSignalData A01 = abstractC82583mM.A01();
        A01.A03 = anonymousClass317;
        A01.A04 = enumC64222vh;
        A01.A0a = c9c7.A06;
        C14360o3.A0B(c9cq, 0);
        A01.A00 = new C9CQ(c9cq.A01, c9cq.A03, c9cq.A02, 0, c9cq.A05, c9cq.A00, c9cq.A04);
        return A01;
    }
}
