package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.U3c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66187U3c {
    public static final C66187U3c A00 = new Object();

    public static final C69566VrV A00(C66186U3b c66186U3b) {
        C14360o3.A0B(c66186U3b, 0);
        String str = c66186U3b.A01;
        if (str != null) {
            EnumC68197VFp enumC68197VFp = c66186U3b.A00;
            if (enumC68197VFp != null) {
                String str2 = c66186U3b.A02;
                if (str2 != null) {
                    return new C69566VrV(str, str2, AbstractC31178DnM.A0f(enumC68197VFp.name()));
                }
                throw new Exception("Showreel Native Action Parameter value is null");
            }
            throw new Exception("Showreel Native Action Parameter type is null");
        }
        throw new Exception("Showreel Native Action Parameter name is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.google.common.collect.ImmutableList$Builder] */
    /* JADX WARN: Type inference failed for: r11v14, types: [X.WY6] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.WY5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.WY3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [X.WY4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.U3f] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.WY0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [X.VJ7] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [X.VJ7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [X.VJ7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [X.VJ7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.WY2] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.WY1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.common.collect.ImmutableList$Builder] */
    public final C25630BUs A01(XP9 xp9, C66192U3h c66192U3h) {
        ?? obj;
        String str;
        Exception exc;
        ?? obj2;
        C14360o3.A0B(xp9, 1);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        loop0: for (C66193U3j c66193U3j : c66192U3h.A01) {
            C14360o3.A0A(c66193U3j);
            C14360o3.A0B(c66193U3j, 0);
            String str2 = c66193U3j.A02;
            if (str2 != null) {
                String str3 = c66193U3j.A01;
                if (str3 != null) {
                    ImmutableList.Builder builder2 = new ImmutableList.Builder();
                    for (C66195U3l c66195U3l : c66193U3j.A03) {
                        C14360o3.A0A(c66195U3l);
                        C14360o3.A0B(c66195U3l, 0);
                        String str4 = c66195U3l.A00;
                        if (str4 != null && str4.length() != 0) {
                            String str5 = c66195U3l.A01;
                            if (str5 != null && str5.length() != 0) {
                                builder2.add((Object) new MUD(str4, str5));
                            } else {
                                throw new Exception("Showreel Native Bitmap uri is null");
                            }
                        } else {
                            throw new Exception("Showreel Native Bitmap name is null");
                        }
                    }
                    ImmutableList.Builder builder3 = new ImmutableList.Builder();
                    for (C69005Vfh c69005Vfh : c66193U3j.A04) {
                        C14360o3.A0A(c69005Vfh);
                        C14360o3.A0B(c69005Vfh, 0);
                        String str6 = c69005Vfh.A00;
                        if (str6 != null) {
                            ImmutableList.Builder builder4 = new ImmutableList.Builder();
                            for (C69004Vfg c69004Vfg : c69005Vfh.A01) {
                                C14360o3.A0A(c69004Vfg);
                                C14360o3.A0B(c69004Vfg, 0);
                                String str7 = c69004Vfg.A00;
                                if (str7 != null) {
                                    ?? builder5 = new ImmutableList.Builder();
                                    for (C69003Vff c69003Vff : c69004Vfg.A01) {
                                        C14360o3.A0A(c69003Vff);
                                        C14360o3.A0B(c69003Vff, 0);
                                        EnumC68181VEz enumC68181VEz = c69003Vff.A00;
                                        if (enumC68181VEz != null) {
                                            int ordinal = enumC68181VEz.ordinal();
                                            if (ordinal != 3) {
                                                if (ordinal != 1) {
                                                    if (ordinal != 2) {
                                                        ImmutableList.Builder builder6 = new ImmutableList.Builder();
                                                        for (C66186U3b c66186U3b : c69003Vff.A01) {
                                                            C14360o3.A0A(c66186U3b);
                                                            builder6.add((Object) A00(c66186U3b));
                                                        }
                                                        String name = enumC68181VEz.name();
                                                        Locale locale = Locale.US;
                                                        C14360o3.A08(locale);
                                                        String lowerCase = name.toLowerCase(locale);
                                                        C14360o3.A07(lowerCase);
                                                        obj2 = new WY6(builder6.build(), lowerCase);
                                                    } else {
                                                        String str8 = null;
                                                        ?? r3 = 0;
                                                        for (C66186U3b c66186U3b2 : c69003Vff.A01) {
                                                            String str9 = c66186U3b2.A02;
                                                            String str10 = c66186U3b2.A01;
                                                            if ("layer".equalsIgnoreCase(str10) && EnumC68197VFp.STRING == c66186U3b2.A00) {
                                                                str8 = str9;
                                                            } else if (str9 != null && str10 != null) {
                                                                EnumC68197VFp enumC68197VFp = EnumC68197VFp.INT;
                                                                EnumC68197VFp enumC68197VFp2 = c66186U3b2.A00;
                                                                boolean z = r3;
                                                                if (enumC68197VFp == enumC68197VFp2) {
                                                                    try {
                                                                        Integer valueOf = Integer.valueOf(Integer.parseInt(str9));
                                                                        ?? obj3 = new Object();
                                                                        obj3.A01 = str10;
                                                                        obj3.A00 = valueOf;
                                                                        z = obj3;
                                                                    } catch (NumberFormatException unused) {
                                                                        throw new Exception("Value is not a valid Integer in MUTATE_PROPERTY DocumentAction");
                                                                    }
                                                                }
                                                                r3 = z;
                                                                if (EnumC68197VFp.FLOAT == enumC68197VFp2) {
                                                                    try {
                                                                        Float valueOf2 = Float.valueOf(Float.parseFloat(str9));
                                                                        ?? obj4 = new Object();
                                                                        obj4.A01 = str10;
                                                                        obj4.A00 = valueOf2;
                                                                        r3 = obj4;
                                                                    } catch (NumberFormatException unused2) {
                                                                        throw new Exception("Value is not a valid Float in MUTATE_PROPERTY DocumentAction");
                                                                    }
                                                                }
                                                                if (EnumC68197VFp.STRING == enumC68197VFp2) {
                                                                    r3 = new Object();
                                                                    r3.A01 = str10;
                                                                    r3.A00 = str9;
                                                                }
                                                            }
                                                        }
                                                        if (str8 != null) {
                                                            if (r3 != 0) {
                                                                obj2 = new Object();
                                                                obj2.A01 = str8;
                                                                obj2.A00 = r3;
                                                            } else {
                                                                throw new Exception("Property is null in MUTATE_PROPERTY DocumentAction");
                                                            }
                                                        } else {
                                                            throw new Exception("Layer is null in MUTATE_PROPERTY DocumentAction");
                                                        }
                                                    }
                                                } else {
                                                    String str11 = null;
                                                    for (C66186U3b c66186U3b3 : c69003Vff.A01) {
                                                        if ("new_state".equalsIgnoreCase(c66186U3b3.A01) && EnumC68197VFp.STRING == c66186U3b3.A00) {
                                                            str11 = c66186U3b3.A02;
                                                        }
                                                    }
                                                    if (str11 != null) {
                                                        obj2 = new Object();
                                                        obj2.A00 = str11;
                                                    } else {
                                                        throw new Exception("State is null in CHANGE_STATE DocumentAction");
                                                    }
                                                }
                                            } else {
                                                String str12 = null;
                                                String str13 = null;
                                                for (C66186U3b c66186U3b4 : c69003Vff.A01) {
                                                    String str14 = c66186U3b4.A01;
                                                    if ("start_progress".equalsIgnoreCase(str14) && EnumC68197VFp.FLOAT == c66186U3b4.A00) {
                                                        str12 = c66186U3b4.A02;
                                                    }
                                                    if ("end_progress".equalsIgnoreCase(str14) && EnumC68197VFp.FLOAT == c66186U3b4.A00) {
                                                        str13 = c66186U3b4.A02;
                                                    }
                                                }
                                                if (str12 != null) {
                                                    if (str13 != null) {
                                                        try {
                                                            float parseFloat = Float.parseFloat(str12);
                                                            try {
                                                                float parseFloat2 = Float.parseFloat(str13);
                                                                obj2 = new Object();
                                                                obj2.A01 = parseFloat;
                                                                obj2.A00 = parseFloat2;
                                                            } catch (NumberFormatException unused3) {
                                                                throw new Exception("end progress is not a valid Float in PLAY DocumentAction");
                                                            }
                                                        } catch (NumberFormatException unused4) {
                                                            throw new Exception("start progress is not a valid Float in PLAY DocumentAction");
                                                        }
                                                    } else {
                                                        throw new Exception("end progress is null in PLAY DocumentAction");
                                                    }
                                                } else {
                                                    throw new Exception("start progress is null in PLAY DocumentAction");
                                                }
                                            }
                                            builder5.add(obj2);
                                        } else {
                                            throw new Exception("Showreel Native Document Action Type is null");
                                        }
                                    }
                                    builder4.add((Object) new C69545Vr9(builder5.build(), str7));
                                } else {
                                    throw new Exception("Showreel Native Event Action name is null");
                                }
                            }
                            builder3.add((Object) new C69544Vr8(str6, builder4.build()));
                        } else {
                            throw new Exception("Showreel Native Document state name is null");
                        }
                    }
                    C66197U3n c66197U3n = c66193U3j.A00;
                    ImmutableList.Builder builder7 = new ImmutableList.Builder();
                    if (c66197U3n != null) {
                        for (C69235Vk3 c69235Vk3 : c66197U3n.A00) {
                            try {
                                C14360o3.A0A(c69235Vk3);
                                C14360o3.A0B(c69235Vk3, 0);
                                str = c69235Vk3.A03;
                            } catch (C46324Keu unused5) {
                                Integer num = C05F.A0N;
                                ImmutableMap immutableMap = RegularImmutableMap.A02;
                                C14360o3.A07(immutableMap);
                                xp9.DnK(immutableMap, num, "Document model metadata parse error");
                            }
                            if (str != null) {
                                String str15 = c69235Vk3.A02;
                                if (str15 != null) {
                                    VF0 vf0 = c69235Vk3.A00;
                                    if (vf0 != null) {
                                        String name2 = vf0.name();
                                        Locale locale2 = Locale.US;
                                        C14360o3.A08(locale2);
                                        String lowerCase2 = name2.toLowerCase(locale2);
                                        C14360o3.A07(lowerCase2);
                                        builder7.add((Object) new C26069Bfx(str, str15, lowerCase2, c69235Vk3.A01, 2));
                                    } else {
                                        exc = new Exception("Showreel Native Visible Layer type is null");
                                    }
                                } else {
                                    exc = new Exception("Showreel Native Visible Layer name is null");
                                }
                            } else {
                                exc = new Exception("Showreel Native Visible Layer tag is null");
                            }
                            throw exc;
                        }
                    }
                    ImmutableList build = builder7.build();
                    C14360o3.A07(build);
                    C51756Mtf c51756Mtf = new C51756Mtf((List) build, 11);
                    ImmutableList build2 = builder2.build();
                    C14360o3.A07(build2);
                    ImmutableList build3 = builder3.build();
                    C14360o3.A07(build3);
                    builder.add((Object) new C43662JSu(c51756Mtf, build2, build3, str2, str3));
                } else {
                    throw new Exception("Showreel Native Keyframes Document is null");
                }
            } else {
                throw new Exception("Showreel Native Document name is null");
            }
        }
        ImmutableList.Builder builder8 = new ImmutableList.Builder();
        for (U3X u3x : c66192U3h.A02) {
            C14360o3.A0A(u3x);
            C14360o3.A0B(u3x, 0);
            String str16 = u3x.A00;
            if (str16 != null) {
                ?? builder9 = new ImmutableList.Builder();
                for (U3Z u3z : u3x.A01) {
                    C14360o3.A0A(u3z);
                    C14360o3.A0B(u3z, 0);
                    EnumC68180VEy enumC68180VEy = u3z.A00;
                    if (enumC68180VEy != null) {
                        switch (enumC68180VEy.ordinal()) {
                            case 1:
                                obj = new Object();
                                break;
                            case 2:
                                String str17 = null;
                                for (C66186U3b c66186U3b5 : u3z.A01) {
                                    if ("document".equalsIgnoreCase(c66186U3b5.A01) && EnumC68197VFp.STRING == c66186U3b5.A00) {
                                        str17 = c66186U3b5.A02;
                                    }
                                }
                                if (str17 != null) {
                                    obj = new WY2(str17);
                                    break;
                                } else {
                                    throw new Exception("Document name is null in LAUNCH_DOCUMENT Action");
                                }
                            case 3:
                                String str18 = null;
                                String str19 = null;
                                for (C66186U3b c66186U3b6 : u3z.A01) {
                                    String str20 = c66186U3b6.A01;
                                    if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equalsIgnoreCase(str20) && EnumC68197VFp.STRING == c66186U3b6.A00) {
                                        str18 = c66186U3b6.A02;
                                    }
                                    if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(str20) && EnumC68197VFp.STRING == c66186U3b6.A00) {
                                        str19 = c66186U3b6.A02;
                                    }
                                }
                                if (str18 != null) {
                                    if (str19 != null) {
                                        obj = new C66190U3f(str18, str19);
                                        break;
                                    } else {
                                        throw new Exception("Value is null in LAUNCH_NATIVE_VIEW Action");
                                    }
                                } else {
                                    throw new Exception("Type is null in LAUNCH_NATIVE_VIEW Action");
                                }
                            case 4:
                            default:
                                ImmutableList.Builder builder10 = new ImmutableList.Builder();
                                for (C66186U3b c66186U3b7 : u3z.A01) {
                                    C14360o3.A0A(c66186U3b7);
                                    builder10.add((Object) A00(c66186U3b7));
                                }
                                String name3 = enumC68180VEy.name();
                                Locale locale3 = Locale.US;
                                C14360o3.A08(locale3);
                                String lowerCase3 = name3.toLowerCase(locale3);
                                C14360o3.A07(lowerCase3);
                                obj = new WY0(builder10.build(), lowerCase3);
                                break;
                            case 5:
                                obj = new Object();
                                break;
                            case 6:
                                obj = new Object();
                                break;
                            case 7:
                                String str21 = null;
                                for (C66186U3b c66186U3b8 : u3z.A01) {
                                    if ("event_name".equalsIgnoreCase(c66186U3b8.A01) && EnumC68197VFp.STRING == c66186U3b8.A00) {
                                        str21 = c66186U3b8.A02;
                                    }
                                }
                                if (str21 != null) {
                                    obj = new Object();
                                    obj.A00 = str21;
                                    break;
                                } else {
                                    throw new Exception("Event name is null in SEND_DOCUMENT_EVENT Action");
                                }
                        }
                        builder9.add(obj);
                    } else {
                        throw new Exception("Showreel Native Action Parameter type is null");
                    }
                }
                ImmutableList build4 = builder9.build();
                C14360o3.A07(build4);
                builder8.add((Object) new C206409Bx(build4, str16));
            } else {
                throw new Exception("Showreel Native Action Parameter name is null");
            }
        }
        ImmutableList.Builder builder11 = new ImmutableList.Builder();
        for (C69002Vfe c69002Vfe : c66192U3h.A00) {
            C14360o3.A0A(c69002Vfe);
            C14360o3.A0B(c69002Vfe, 0);
            String str22 = c69002Vfe.A00;
            if (str22 != null) {
                String str23 = c69002Vfe.A01;
                if (str23 != null) {
                    builder11.add((Object) new C68917VeH(str22, str23));
                } else {
                    throw new Exception("Showreel Native Additional Part template is null");
                }
            } else {
                throw new Exception("Showreel Native Additional Part name is null");
            }
        }
        ImmutableList build5 = builder.build();
        C14360o3.A07(build5);
        ImmutableList build6 = builder8.build();
        C14360o3.A07(build6);
        ImmutableList build7 = builder11.build();
        C14360o3.A07(build7);
        return new C25630BUs(build5, build6, build7);
    }
}
