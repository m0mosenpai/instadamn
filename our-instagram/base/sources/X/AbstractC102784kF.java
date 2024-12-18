package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexStore;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: X.4kF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102784kF {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.Vht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.4kJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.4kG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [X.SEt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [X.4lI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [X.8jl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [X.4kK, java.lang.Object] */
    public static C102794kG A00(C102814kI c102814kI, InterfaceC102764kD interfaceC102764kD) {
        String Ep1;
        HashMap hashMap;
        String Ep12;
        String Ep13;
        String Ep14;
        String Ep15;
        String Ep16;
        String Ep17;
        ?? obj = new Object();
        Integer E3x = interfaceC102764kD.E3x();
        Integer num = C05F.A0C;
        if (E3x != num) {
            interfaceC102764kD.EmB();
            return null;
        }
        while (true) {
            Integer Csy = interfaceC102764kD.Csy();
            Integer num2 = C05F.A0N;
            if (Csy != num2) {
                String E3u = interfaceC102764kD.E3u();
                boolean z = false;
                if (AbstractC102804kH.A00(E3u) >= 32) {
                    z = true;
                }
                interfaceC102764kD.Csy();
                if (!z && "bloks_payload".equals(E3u)) {
                    C102814kI c102814kI2 = new C102814kI(c102814kI);
                    C102824kJ obj2 = new Object();
                    if (interfaceC102764kD.E3x() != num) {
                        interfaceC102764kD.EmB();
                        obj2 = 0;
                    } else {
                        while (interfaceC102764kD.Csy() != num2) {
                            String E3u2 = interfaceC102764kD.E3u();
                            boolean z2 = false;
                            if (AbstractC102804kH.A00(E3u2) >= 32) {
                                z2 = true;
                            }
                            interfaceC102764kD.Csy();
                            if (!z2) {
                                if ("action".equals(E3u2)) {
                                    InterfaceC1120053p E3y = interfaceC102764kD.E3y();
                                    C102814kI c102814kI3 = new C102814kI(c102814kI2);
                                    AnonymousClass016.A18(c102814kI3.A03, new String[]{"action"});
                                    obj2.A03 = AbstractC58670Pzi.A00(new C102984kZ(c102814kI3, new C102964kX(null, new ArrayList())), E3y);
                                } else if ("tree".equals(E3u2)) {
                                    C102814kI c102814kI4 = new C102814kI(c102814kI2);
                                    AnonymousClass016.A18(c102814kI4.A03, new String[]{"tree"});
                                    obj2.A00 = (C102884kP) AbstractC102864kN.A01(c102814kI4, interfaceC102764kD);
                                } else {
                                    String str = null;
                                    ArrayList arrayList = null;
                                    ArrayList arrayList2 = null;
                                    ArrayList arrayList3 = null;
                                    ArrayList arrayList4 = null;
                                    ArrayList arrayList5 = null;
                                    ArrayList arrayList6 = null;
                                    C103424lI c103424lI = null;
                                    ArrayList arrayList7 = null;
                                    ArrayList arrayList8 = null;
                                    ArrayList arrayList9 = null;
                                    String str2 = null;
                                    if ("data".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                ?? obj3 = new Object();
                                                if (interfaceC102764kD.E3x() != num) {
                                                    interfaceC102764kD.EmB();
                                                } else {
                                                    while (interfaceC102764kD.Csy() != num2) {
                                                        String E3u3 = interfaceC102764kD.E3u();
                                                        boolean z3 = false;
                                                        if (AbstractC102804kH.A00(E3u3) >= 32) {
                                                            z3 = true;
                                                        }
                                                        interfaceC102764kD.Csy();
                                                        if (!z3) {
                                                            String str3 = null;
                                                            if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E3u3)) {
                                                                if (!interfaceC102764kD.E3y().isNull()) {
                                                                    str3 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                obj3.A00 = str3;
                                                            } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(E3u3)) {
                                                                if (!interfaceC102764kD.E3y().isNull()) {
                                                                    str3 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                obj3.A01 = str3;
                                                            } else if ("data".equals(E3u3)) {
                                                                obj3.A02 = AbstractC102854kM.A01(interfaceC102764kD);
                                                            }
                                                        }
                                                        interfaceC102764kD.EmB();
                                                    }
                                                    arrayList.add(obj3);
                                                }
                                            }
                                        }
                                        obj2.A07 = arrayList;
                                    } else if ("embedded_payloads".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList2 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                C62516SEs A00 = AbstractC58671Pzj.A00(c102814kI2, interfaceC102764kD, "embedded_payloads");
                                                if (A00 != null) {
                                                    arrayList2.add(A00);
                                                }
                                            }
                                        }
                                        obj2.A08 = arrayList2;
                                    } else if ("referenced".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList3 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                if (!interfaceC102764kD.E3y().isNull() && (Ep17 = interfaceC102764kD.E3y().Ep1()) != null) {
                                                    arrayList3.add(Ep17);
                                                }
                                            }
                                        }
                                        obj2.A0D = arrayList3;
                                    } else if ("referenced_external".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList4 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                if (!interfaceC102764kD.E3y().isNull() && (Ep16 = interfaceC102764kD.E3y().Ep1()) != null) {
                                                    arrayList4.add(Ep16);
                                                }
                                            }
                                        }
                                        obj2.A0C = arrayList4;
                                    } else if ("referenced_embedded_payloads".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList5 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                if (!interfaceC102764kD.E3y().isNull() && (Ep15 = interfaceC102764kD.E3y().Ep1()) != null) {
                                                    arrayList5.add(Ep15);
                                                }
                                            }
                                        }
                                        obj2.A0B = arrayList5;
                                    } else if ("props".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList6 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                ?? obj4 = new Object();
                                                if (interfaceC102764kD.E3x() != num) {
                                                    interfaceC102764kD.EmB();
                                                } else {
                                                    while (interfaceC102764kD.Csy() != num2) {
                                                        String E3u4 = interfaceC102764kD.E3u();
                                                        boolean z4 = false;
                                                        if (AbstractC102804kH.A00(E3u4) >= 32) {
                                                            z4 = true;
                                                        }
                                                        interfaceC102764kD.Csy();
                                                        if (!z4) {
                                                            String str4 = null;
                                                            if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E3u4)) {
                                                                if (!interfaceC102764kD.E3y().isNull()) {
                                                                    str4 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                obj4.A00 = str4;
                                                            } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(E3u4)) {
                                                                if (!interfaceC102764kD.E3y().isNull()) {
                                                                    str4 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                obj4.A01 = str4;
                                                            }
                                                        }
                                                        interfaceC102764kD.EmB();
                                                    }
                                                    arrayList6.add(obj4);
                                                }
                                            }
                                        }
                                        obj2.A0A = arrayList6;
                                    } else if ("error_attribution".equals(E3u2)) {
                                        ?? obj5 = new Object();
                                        if (interfaceC102764kD.E3x() != num) {
                                            interfaceC102764kD.EmB();
                                        } else {
                                            while (interfaceC102764kD.Csy() != num2) {
                                                String E3u5 = interfaceC102764kD.E3u();
                                                boolean z5 = false;
                                                if (AbstractC102804kH.A00(E3u5) >= 32) {
                                                    z5 = true;
                                                }
                                                interfaceC102764kD.Csy();
                                                if (!z5) {
                                                    String str5 = null;
                                                    if ("logging_id".equals(E3u5)) {
                                                        if (!interfaceC102764kD.E3y().isNull()) {
                                                            str5 = interfaceC102764kD.E3y().Ep1();
                                                        }
                                                        obj5.A00 = str5;
                                                    } else if ("source_map_id".equals(E3u5)) {
                                                        if (!interfaceC102764kD.E3y().isNull()) {
                                                            str5 = interfaceC102764kD.E3y().Ep1();
                                                        }
                                                        obj5.A01 = str5;
                                                    }
                                                }
                                                interfaceC102764kD.EmB();
                                            }
                                            c103424lI = obj5;
                                        }
                                        obj2.A01 = c103424lI;
                                    } else if ("component_queries".equals(E3u2)) {
                                        Integer E3x2 = interfaceC102764kD.E3x();
                                        Integer num3 = C05F.A00;
                                        if (E3x2 == num3) {
                                            arrayList7 = new ArrayList();
                                            while (true) {
                                                Integer Csy2 = interfaceC102764kD.Csy();
                                                Integer num4 = C05F.A01;
                                                if (Csy2 == num4) {
                                                    break;
                                                }
                                                U5W u5w = new U5W();
                                                if (interfaceC102764kD.E3x() != num) {
                                                    interfaceC102764kD.EmB();
                                                } else {
                                                    while (interfaceC102764kD.Csy() != num2) {
                                                        String E3u6 = interfaceC102764kD.E3u();
                                                        boolean z6 = false;
                                                        if (AbstractC102804kH.A00(E3u6) >= 32) {
                                                            z6 = true;
                                                        }
                                                        interfaceC102764kD.Csy();
                                                        if (!z6) {
                                                            HashMap hashMap2 = null;
                                                            String str6 = null;
                                                            HashSet hashSet = null;
                                                            if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E3u6)) {
                                                                if (!interfaceC102764kD.E3y().isNull()) {
                                                                    str6 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                u5w.A06 = str6;
                                                            } else if ("app_id_expr".equals(E3u6)) {
                                                                u5w.A00 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                                                            } else if ("params".equals(E3u6)) {
                                                                u5w.A03 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                                                            } else if ("client_params".equals(E3u6)) {
                                                                u5w.A02 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                                                            } else if (DexStore.DEPS_FILENAME.equals(E3u6)) {
                                                                if (interfaceC102764kD.E3x() == num3) {
                                                                    hashSet = new HashSet();
                                                                    while (interfaceC102764kD.Csy() != num4) {
                                                                        if (!interfaceC102764kD.E3y().isNull() && (Ep14 = interfaceC102764kD.E3y().Ep1()) != null) {
                                                                            hashSet.add(Ep14);
                                                                        }
                                                                    }
                                                                }
                                                                u5w.A08 = hashSet;
                                                            } else if ("targets".equals(E3u6)) {
                                                                if (interfaceC102764kD.E3x() == num) {
                                                                    HashMap hashMap3 = new HashMap();
                                                                    while (interfaceC102764kD.Csy() != num2) {
                                                                        String E3u7 = interfaceC102764kD.E3u();
                                                                        interfaceC102764kD.Csy();
                                                                        if (interfaceC102764kD.E3x() == C05F.A1I) {
                                                                            hashMap3.put(E3u7, null);
                                                                        } else if (!interfaceC102764kD.E3y().isNull() && (Ep13 = interfaceC102764kD.E3y().Ep1()) != null) {
                                                                            hashMap3.put(E3u7, Ep13);
                                                                        }
                                                                    }
                                                                    hashMap2 = hashMap3;
                                                                }
                                                                u5w.A07 = hashMap2;
                                                            } else if ("cache_ttl_expr".equals(E3u6)) {
                                                                u5w.A01 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                                                            } else if ("disk_cache_enabled".equals(E3u6)) {
                                                                u5w.A04 = Boolean.valueOf(interfaceC102764kD.E3y().AE8());
                                                            } else if ("is_scoped".equals(E3u6)) {
                                                                u5w.A05 = Boolean.valueOf(interfaceC102764kD.E3y().AE8());
                                                            }
                                                        }
                                                        interfaceC102764kD.EmB();
                                                    }
                                                    arrayList7.add(u5w);
                                                }
                                            }
                                        }
                                        obj2.A06 = arrayList7;
                                    } else if ("hoisted_async_components".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList8 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                ?? obj6 = new Object();
                                                if (interfaceC102764kD.E3x() != num) {
                                                    interfaceC102764kD.EmB();
                                                } else {
                                                    while (interfaceC102764kD.Csy() != num2) {
                                                        String E3u8 = interfaceC102764kD.E3u();
                                                        boolean z7 = false;
                                                        if (AbstractC102804kH.A00(E3u8) >= 32) {
                                                            z7 = true;
                                                        }
                                                        interfaceC102764kD.Csy();
                                                        if (!z7) {
                                                            if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E3u8)) {
                                                                if (interfaceC102764kD.E3y().isNull()) {
                                                                    Ep12 = null;
                                                                } else {
                                                                    Ep12 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                obj6.A01 = Ep12;
                                                            } else if ("payload".equals(E3u8)) {
                                                                obj6.A00 = Q06.A00(interfaceC102764kD);
                                                            }
                                                        }
                                                        interfaceC102764kD.EmB();
                                                    }
                                                    arrayList8.add(obj6);
                                                }
                                            }
                                        }
                                        obj2.A09 = arrayList8;
                                    } else if ("ft".equals(E3u2)) {
                                        C1338862w c1338862w = null;
                                        if (interfaceC102764kD.E3x() == num) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            while (interfaceC102764kD.Csy() != num2) {
                                                String E3u9 = interfaceC102764kD.E3u();
                                                interfaceC102764kD.Csy();
                                                Object A002 = AbstractC102854kM.A00(interfaceC102764kD);
                                                C14360o3.A0C(A002, "null cannot be cast to non-null type kotlin.String");
                                                C102814kI c102814kI5 = new C102814kI(c102814kI2);
                                                AnonymousClass016.A18(c102814kI5.A03, new String[]{"ft", E3u9});
                                                linkedHashMap.put(E3u9, new BloksScript(new C102984kZ(c102814kI5, new C102964kX(null, new ArrayList())), (String) A002, null, -1));
                                            }
                                            c1338862w = new C1338862w(linkedHashMap);
                                        }
                                        obj2.A02 = c1338862w;
                                    } else if ("templates".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == num) {
                                            hashMap = new HashMap();
                                            while (interfaceC102764kD.Csy() != num2) {
                                                String E3u10 = interfaceC102764kD.E3u();
                                                interfaceC102764kD.Csy();
                                                C102814kI c102814kI6 = new C102814kI(c102814kI2);
                                                AnonymousClass016.A18(c102814kI6.A03, new String[]{"templates", E3u10});
                                                hashMap.put(E3u10, AbstractC102864kN.A01(c102814kI6, interfaceC102764kD));
                                            }
                                        } else {
                                            hashMap = null;
                                        }
                                        obj2.A0F = hashMap;
                                    } else if ("values".equals(E3u2)) {
                                        if (interfaceC102764kD.E3x() == C05F.A00) {
                                            arrayList9 = new ArrayList();
                                            while (interfaceC102764kD.Csy() != C05F.A01) {
                                                ?? obj7 = new Object();
                                                if (interfaceC102764kD.E3x() != num) {
                                                    interfaceC102764kD.EmB();
                                                } else {
                                                    while (interfaceC102764kD.Csy() != num2) {
                                                        String E3u11 = interfaceC102764kD.E3u();
                                                        boolean z8 = false;
                                                        if (AbstractC102804kH.A00(E3u11) >= 32) {
                                                            z8 = true;
                                                        }
                                                        interfaceC102764kD.Csy();
                                                        if (!z8) {
                                                            if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E3u11)) {
                                                                if (interfaceC102764kD.E3y().isNull()) {
                                                                    Ep1 = null;
                                                                } else {
                                                                    Ep1 = interfaceC102764kD.E3y().Ep1();
                                                                }
                                                                obj7.A02 = Ep1;
                                                            } else if ("depth".equals(E3u11)) {
                                                                obj7.A01 = Integer.valueOf(interfaceC102764kD.E3y().COn());
                                                            } else if ("expression".equals(E3u11)) {
                                                                obj7.A00 = new BloksScript(null, interfaceC102764kD.E3y().Ep1(), null, -1);
                                                            }
                                                        }
                                                        interfaceC102764kD.EmB();
                                                    }
                                                    arrayList9.add(obj7);
                                                }
                                            }
                                        }
                                        obj2.A0E = arrayList9;
                                    } else if ("ft_declare".equals(E3u2)) {
                                        if (!interfaceC102764kD.E3y().isNull()) {
                                            str2 = interfaceC102764kD.E3y().Ep1();
                                        }
                                        obj2.A04 = str2;
                                    } else if ("ft_include".equals(E3u2)) {
                                        if (!interfaceC102764kD.E3y().isNull()) {
                                            str = interfaceC102764kD.E3y().Ep1();
                                        }
                                        obj2.A05 = str;
                                    }
                                }
                            }
                            interfaceC102764kD.EmB();
                        }
                    }
                    C103424lI c103424lI2 = obj2.A01;
                    if (c103424lI2 != null) {
                        String str7 = c103424lI2.A01;
                        if (str7 != null) {
                            c102814kI2.A01 = str7;
                        }
                        String str8 = c103424lI2.A00;
                        if (str8 != null) {
                            c102814kI2.A00 = str8;
                        }
                    }
                    obj.A00 = obj2;
                }
                interfaceC102764kD.EmB();
            } else {
                return obj;
            }
        }
    }
}
