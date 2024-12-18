package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Le8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48571Le8 implements InterfaceC43071ya {
    public long A00;
    public InterfaceC60442pS A01;
    public final Map A02;
    public final InterfaceC63482uV A03;

    public C48571Le8(InterfaceC63482uV interfaceC63482uV) {
        C14360o3.A0B(interfaceC63482uV, 1);
        this.A03 = interfaceC63482uV;
        this.A02 = AbstractC166987dD.A1G();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        String str;
        String str2;
        EnumC46291KeN enumC46291KeN;
        double d;
        String str3;
        ArrayList arrayList;
        ?? A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        boolean z = false;
        if (this.A01 == null) {
            String str4 = ((L5N) c59062n7.A04).A0E.A02;
            if (str4 == null) {
                str4 = "";
            }
            this.A01 = AbstractC60952qJ.A01(str4, false, false);
        }
        this.A00 = interfaceC57162jr.BmE();
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 != A1R) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A00;
        }
        float CGk = interfaceC57162jr.CGk(c59062n7);
        int i = 0;
        if (CGk <= 0.0f) {
            i = -2;
        } else if (CGk >= 0.1f) {
            if (CGk < 0.25f) {
                i = 10;
            } else if (CGk < 0.5f) {
                i = 25;
            } else if (CGk < 0.75f) {
                i = 50;
            } else if (CGk < 1.0f) {
                i = 75;
            } else if (CGk == 1.0f) {
                i = 100;
            }
        }
        String str5 = c59062n7.A05;
        int intValue = num.intValue();
        L5N l5n = (L5N) c59062n7.A04;
        C9CL c9cl = l5n.A0E;
        if (intValue != 0) {
            if (intValue != A1R) {
                str = c9cl.A03;
                if (str != null) {
                    boolean z2 = C4S0.A04;
                    C14360o3.A0A(str5);
                    C14360o3.A0B(str5, 3);
                    String str6 = str;
                    if (C4S0.A04) {
                        str6 = str5;
                    }
                    C5RC c5rc = (C5RC) C4S0.A07.get(str6);
                    if (c5rc != null) {
                        L5N l5n2 = c5rc.A03;
                        if (i != l5n2.A00) {
                            l5n2.A00 = i;
                            long A00 = C5RC.A00();
                            long A012 = C5RC.A01(c5rc, str);
                            C5RC.A02(c5rc, "viewability_changed", l5n2.A00, A012, A00);
                            l5n2.A09.put(Long.valueOf(A00), Long.valueOf(A012));
                        }
                    }
                }
            } else {
                str = c9cl.A03;
                if (str != null) {
                    C14360o3.A0A(str5);
                    boolean z3 = C4S0.A04;
                    C14360o3.A0B(str5, 3);
                    String str7 = str;
                    if (C4S0.A04) {
                        str7 = str5;
                    }
                    C5RC c5rc2 = (C5RC) C4S0.A07.get(str7);
                    if (c5rc2 != null) {
                        C5RC.A02(c5rc2, "view_exited", i, C5RC.A01(c5rc2, str), C5RC.A00());
                        L5N l5n3 = c5rc2.A03;
                        C95744Si c95744Si = l5n3.A01;
                        String str8 = null;
                        if (c95744Si != null) {
                            arrayList = AbstractC166987dD.A1E();
                            c95744Si.A00.drainTo(arrayList);
                        } else {
                            arrayList = null;
                        }
                        boolean z4 = false;
                        l5n3.A0C = AbstractC25229BEm.A1Z(l5n3.A01);
                        if (arrayList != null) {
                            l5n3.A0A = A1R;
                            if (C4S0.A00.A01 && c5rc2.A04) {
                                z4 = true;
                            }
                            str8 = C95744Si.A02(arrayList, arrayList.size(), z4);
                        }
                        l5n3.A04 = str8;
                        l5n3.A0D = c5rc2.A05;
                        l5n3.A01 = null;
                        c5rc2.A01 = A1R;
                        if (c5rc2.A02) {
                            C4S0.A05.A05(str, "");
                        }
                    }
                }
            }
        } else {
            str = c9cl.A03;
            if (str != null) {
                boolean z5 = C4S0.A04;
                C14360o3.A0A(str5);
                C14360o3.A0B(str5, A1R == true ? 1 : 0);
                String str9 = str;
                if (C4S0.A04) {
                    str9 = str5;
                }
                Map map = C4S0.A07;
                C5RC c5rc3 = (C5RC) map.get(str9);
                if (c5rc3 != null) {
                    L5N l5n4 = c5rc3.A03;
                    l5n4.A09.clear();
                    l5n4.A08.clear();
                    l5n4.A07.clear();
                    l5n4.A04 = null;
                    l5n4.A06.clear();
                    l5n4.A00 = 0;
                    l5n4.A04 = null;
                    l5n4.A03 = null;
                    l5n4.A01 = null;
                    l5n4.A0B = false;
                    l5n4.A0A = false;
                    l5n4.A0C = A1R;
                    l5n4.A0D = false;
                    l5n4.A05 = null;
                    l5n4.A02 = null;
                    c5rc3.A01 = false;
                }
                String str10 = str;
                if (C4S0.A04) {
                    str10 = str5;
                }
                C5RC c5rc4 = (C5RC) map.get(str10);
                if (c5rc4 != null) {
                    C5RC.A02(c5rc4, "view_entered", i, C5RC.A01(c5rc4, str), C5RC.A00());
                }
            }
        }
        Integer num2 = C05F.A0C;
        if (num != num2) {
            if (num == C05F.A01) {
                z = true;
            }
            InterfaceC63482uV interfaceC63482uV = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A01;
            if (interfaceC60442pS != null) {
                C14360o3.A06(str5);
                long j = this.A00;
                C14360o3.A06(c59062n7.A03);
                InterfaceC60442pS interfaceC60442pS2 = this.A01;
                if (interfaceC60442pS2 != null) {
                    C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS2, "VIDEO_VIEWABILITY_SECOND_CHANNEL");
                    c82713mZ.A55 = c9cl.A02;
                    c82713mZ.A61 = String.valueOf(C4Sq.A00.A01(str));
                    Boolean bool = (Boolean) c9cl.A00;
                    if (bool != null && bool.booleanValue()) {
                        str2 = "ad";
                    } else {
                        str2 = "organic";
                    }
                    c82713mZ.A7R = str2;
                    c82713mZ.A7Q = c9cl.A04;
                    List<L2I> A0a = AbstractC001800i.A0a(l5n.A06);
                    c82713mZ.A7m = AbstractC166987dD.A1E();
                    for (L2I l2i : A0a) {
                        C11520jB c11520jB = new C11520jB();
                        c11520jB.A04(C5I8.A9v, l2i.A03);
                        c11520jB.A04(C5I8.A9s, Long.valueOf(l2i.A01));
                        c11520jB.A04(C5I8.A9u, Long.valueOf(l2i.A02));
                        c11520jB.A04(C5I8.A9t, Integer.valueOf(l2i.A00));
                        ArrayList arrayList2 = c82713mZ.A7m;
                        if (arrayList2 != null) {
                            arrayList2.add(c11520jB);
                        }
                    }
                    c82713mZ.A5I = l5n.A04;
                    if (AbstractC167007dF.A1Z(EnumC12920le.A04)) {
                        enumC46291KeN = EnumC46291KeN.ALPHA_RELEASE;
                    } else if (AbstractC167007dF.A1Z(EnumC12920le.A05)) {
                        enumC46291KeN = EnumC46291KeN.BETA_RELEASE;
                    } else if (AbstractC167007dF.A1Z(EnumC12920le.A06)) {
                        enumC46291KeN = EnumC46291KeN.PROD;
                    } else {
                        enumC46291KeN = EnumC46291KeN.PRE_PROD;
                    }
                    c82713mZ.A0f = enumC46291KeN;
                    Number number = (Number) c9cl.A01;
                    if (number != null) {
                        d = number.doubleValue();
                    } else {
                        d = Double.NaN;
                    }
                    c82713mZ.A01 = d;
                    c82713mZ.A3e = l5n.A03;
                    c82713mZ.A2H = Boolean.valueOf(l5n.A0D);
                    c82713mZ.A17 = Boolean.valueOf(l5n.A0A);
                    c82713mZ.A1V = Boolean.valueOf(l5n.A0C);
                    String[] A002 = C95824Sr.A00(str);
                    if (A002 != null && A002.length > A1R) {
                        str3 = A002[A1R == true ? 1 : 0];
                    } else {
                        str3 = null;
                    }
                    c82713mZ.A4c = str3;
                    c82713mZ.A7C = l5n.A05;
                    c82713mZ.A23 = l5n.A02;
                    interfaceC63482uV.ECO(interfaceC60442pS, new C82453m9(new C82753md(c82713mZ), num, num2, str5, C16930sl.A00, CGk, j, false, false), "feed_video", z);
                    if (z && str != null) {
                        C4S0 c4s0 = C4S0.A05;
                        String str11 = str;
                        if (C4S0.A04) {
                            str11 = str5;
                        }
                        C5RC c5rc5 = (C5RC) C4S0.A07.get(str11);
                        if (c5rc5 != null && c5rc5.A01 && c5rc5.A00.get() != null) {
                            c4s0.A05(str, str5);
                        }
                    }
                }
            }
            C14360o3.A0F("insightsHost");
            throw C00O.createAndThrow();
        }
        int A013 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A013 != 0 && A013 != A1R) {
            this.A02.remove(str5);
        } else {
            this.A02.put(str5, Float.valueOf(interfaceC57162jr.CGk(c59062n7)));
        }
    }
}
