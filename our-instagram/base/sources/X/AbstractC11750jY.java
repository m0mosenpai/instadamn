package X;

import com.facebook.common.dextricks.DexStore;
import java.util.Map;

/* renamed from: X.0jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11750jY {
    public static C11720jV parseFromJson(C16L c16l) {
        return (C11720jV) C16V.A01(c16l, new C1EH() { // from class: X.0jX
            /* JADX WARN: Type inference failed for: r7v1, types: [X.0jZ, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v2, types: [X.0jZ, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v3, types: [X.0jZ, java.lang.Object] */
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                C16R c16r;
                C11720jV c11720jV = new C11720jV();
                C16R A11 = c16l2.A11();
                C16R c16r2 = C16R.A0D;
                if (A11 != c16r2) {
                    c16l2.A0z();
                    return null;
                }
                while (true) {
                    C16R A1J = c16l2.A1J();
                    c16r = C16R.A09;
                    if (A1J == c16r) {
                        break;
                    }
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    String str = null;
                    if ("app_data".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c11720jV.A03 = str;
                    } else if ("checksum".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c11720jV.A04 = str;
                    } else if (DexStore.CONFIG_FILENAME.equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c11720jV.A06 = str;
                    } else if ("config_owner_id".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c11720jV.A07 = str;
                    } else if ("qpl_version".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c11720jV.A08 = str;
                    } else if ("client_debug_config".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c11720jV.A05 = str;
                    }
                    c16l2.A0z();
                }
                String str2 = c11720jV.A03;
                C222015v c222015v = AbstractC221915u.A00;
                C16L A03 = c222015v.A03(str2);
                A03.A1J();
                c11720jV.A00 = AbstractC11630jM.parseFromJson(A03);
                String str3 = c11720jV.A05;
                if (str3 != null) {
                    C16L A032 = c222015v.A03(str3);
                    A032.A1J();
                    c11720jV.A01 = AbstractC11670jQ.parseFromJson(A032);
                }
                String str4 = c11720jV.A06;
                if (str4 == null || str4.equals("")) {
                    return c11720jV;
                }
                C16L A033 = c222015v.A03(str4);
                if (A033.A1J() != c16r2) {
                    return c11720jV;
                }
                while (true) {
                    A033.A12();
                    C16R A112 = A033.A11();
                    if (A112 == c16r) {
                        return c11720jV;
                    }
                    String A0q2 = A033.A0q();
                    if (A0q2 != null) {
                        if ("funnel_analytics".equals(A0q2)) {
                            A033.A0z();
                        } else if ("blacklist".equals(A0q2)) {
                            java.util.Set set = c11720jV.A0A;
                            while (true) {
                                A033.A12();
                                if (A033.A11() != C16R.A08) {
                                    A033.A1P();
                                    set.add(A033.A1P());
                                }
                            }
                        } else if ("perf".equals(A0q2)) {
                            String str5 = c11720jV.A08;
                            if ("v3".equals(str5)) {
                                ?? obj = new Object();
                                c11720jV.A02 = obj;
                                while (true) {
                                    A033.A1J();
                                    if (A033.A11() != c16r) {
                                        String A0q3 = A033.A0q();
                                        A033.A1J();
                                        String str6 = null;
                                        if ("version".equals(A0q3)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str6 = A033.A1P();
                                            }
                                            obj.A07 = str6;
                                        } else if ("checksum".equals(A0q3)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str6 = A033.A1P();
                                            }
                                            obj.A00 = str6;
                                        } else if ("sampling".equals(A0q3)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str6 = A033.A1P();
                                            }
                                            obj.A05 = str6;
                                        } else if ("metadata".equals(A0q3)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str6 = A033.A1P();
                                            }
                                            obj.A03 = str6;
                                        }
                                        A033.A0z();
                                    }
                                }
                            } else if ("v6".equals(str5)) {
                                ?? obj2 = new Object();
                                c11720jV.A02 = obj2;
                                while (true) {
                                    A033.A1J();
                                    if (A033.A11() != c16r) {
                                        String A0q4 = A033.A0q();
                                        A033.A1J();
                                        String str7 = null;
                                        if ("version".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A07 = str7;
                                        } else if ("checksum".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A00 = str7;
                                        } else if ("sampling".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A05 = str7;
                                        } else if ("metadata".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A03 = str7;
                                        } else if ("sampling_method".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A06 = str7;
                                        } else if ("pivots".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A04 = str7;
                                        } else if ("event_blocklist".equals(A0q4)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str7 = A033.A1P();
                                            }
                                            obj2.A02 = str7;
                                        }
                                        A033.A0z();
                                    }
                                }
                            } else if ("v7".equals(str5)) {
                                ?? obj3 = new Object();
                                c11720jV.A02 = obj3;
                                while (true) {
                                    A033.A1J();
                                    if (A033.A11() != c16r) {
                                        String A0q5 = A033.A0q();
                                        A033.A1J();
                                        String str8 = null;
                                        if ("version".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A07 = str8;
                                        } else if ("checksum".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A00 = str8;
                                        } else if ("sampling".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A05 = str8;
                                        } else if ("metadata".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A03 = str8;
                                        } else if ("sampling_method".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A06 = str8;
                                        } else if ("pivots".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A04 = str8;
                                        } else if ("event_blocklist".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A02 = str8;
                                        } else if ("crash_resiliency".equals(A0q5)) {
                                            if (A033.A11() != C16R.A0G) {
                                                str8 = A033.A1P();
                                            }
                                            obj3.A01 = str8;
                                        }
                                        A033.A0z();
                                    }
                                }
                            } else {
                                AbstractC11730jW.A00(A033, "perf", c11720jV.A09);
                            }
                        } else {
                            Map map = c11720jV.A09;
                            if (A112 == c16r2) {
                                AbstractC11730jW.A00(A033, A0q2, map);
                            } else {
                                AbstractC11730jW.A01(A033, A0q2, map);
                            }
                        }
                    }
                }
            }
        });
    }
}
