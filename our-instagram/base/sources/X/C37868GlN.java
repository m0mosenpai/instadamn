package X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GlN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37868GlN extends AbstractC42392Ipt implements InterfaceC43071ya {
    public final InterfaceC82483mC A00;
    public final C63572ue A01;
    public final C40994IDp A02;
    public final C40995IDq A03;
    public final C4EF A04;
    public final String A05;
    public final String A06;
    public final InterfaceC16620sF A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.5kS] */
    public C37868GlN(C4EA c4ea, C4E5 c4e5, C40994IDp c40994IDp, C40995IDq c40995IDq, String str, String str2, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        C63572ue c63572ue;
        C14360o3.A0B(c4ea, 4);
        if (c4e5.A09) {
            c63572ue = c4ea.A00;
        } else {
            c63572ue = null;
        }
        C4EF c4ef = c4e5.A0A ? c4ea.A01 : null;
        C37874GlT c37874GlT = new C37874GlT(AbstractC31171DnF.A0D(str), new Object(), c4ea.A02);
        boolean z4 = c4e5.A06;
        this.A05 = str2;
        this.A01 = c63572ue;
        this.A04 = c4ef;
        this.A03 = c40995IDq;
        this.A02 = c40994IDp;
        this.A00 = c37874GlT;
        this.A07 = interfaceC16620sF;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = str;
        this.A0B = z3;
        this.A0A = z4;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        InterfaceC82423m6 interfaceC82423m6;
        String A00;
        Integer num;
        long BmE;
        float f;
        InterfaceC82423m6 interfaceC82423m62;
        Integer num2;
        float f2;
        boolean z;
        Object B3n;
        Object obj;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        C63572ue c63572ue = this.A01;
        if (c63572ue != null && this.A0B) {
            int CGk = (int) (interfaceC57162jr.CGk(c59062n7) * 100.0f);
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            interfaceC57162jr.BA8(rect, c59062n7);
            interfaceC57162jr.CGX(rect2);
            int height = (int) (((rect.height() * rect.width()) / (rect2.height() * rect2.width())) * 100.0f);
            if (this.A0A) {
                A02(c59062n7, interfaceC57162jr);
                z = A03(c59062n7);
            } else {
                z = false;
            }
            A03(c59062n7);
            long BmE2 = interfaceC57162jr.BmE();
            Integer valueOf = Integer.valueOf(CGk);
            Integer valueOf2 = Integer.valueOf(height);
            boolean z2 = false;
            if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
                z2 = true;
            }
            C40995IDq c40995IDq = this.A03;
            InterfaceC82443m8 interfaceC82443m8 = null;
            String A002 = A00(c59062n7, this);
            C14360o3.A0B(A002, 0);
            c63572ue.A06.get(A002);
            int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    B3n = c40995IDq.A00.B3o();
                } else {
                    B3n = c40995IDq.A00.B3p();
                }
            } else {
                B3n = c40995IDq.A00.B3n();
            }
            if (B3n instanceof InterfaceC82423m6) {
                obj = (InterfaceC82423m6) B3n;
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC82443m8) {
                interfaceC82443m8 = (InterfaceC82443m8) obj;
            }
            String A003 = A00(c59062n7, this);
            String str = this.A05;
            C14360o3.A0B(A003, 1);
            InterfaceC82483mC interfaceC82483mC = this.A00;
            Map map = c63572ue.A05;
            C41088IHf c41088IHf = (C41088IHf) map.get(A003);
            if (c41088IHf == null) {
                c41088IHf = new C41088IHf(A003, str);
                map.put(A003, c41088IHf);
            }
            if (interfaceC82443m8 != null) {
                c41088IHf.A00 = interfaceC82443m8;
            }
            if (valueOf != null) {
                C82513mF c82513mF = c41088IHf.A01;
                C63572ue.A00(c82513mF.A07, 1, CGk, BmE2);
                C63572ue.A00(c82513mF.A02, 50, CGk, BmE2);
                C63572ue.A00(c82513mF.A04, 100, CGk, BmE2);
            }
            if (valueOf2 != null) {
                C82513mF c82513mF2 = c41088IHf.A01;
                C63572ue.A00(c82513mF2.A03, 50, height, BmE2);
                C63572ue.A00(c82513mF2.A05, 100, height, BmE2);
            }
            if (z) {
                C82513mF c82513mF3 = c41088IHf.A01;
                if (c82513mF3.A00 == -1) {
                    c82513mF3.A00 = BmE2;
                }
            }
            if (z2) {
                C82513mF c82513mF4 = c41088IHf.A01;
                List singletonList = Collections.singletonList(new C82493mD(c82513mF4, INV.A00(c82513mF4.A01)));
                C14360o3.A07(singletonList);
                C82543mI c82543mI = new C82543mI(null, new C82533mH(), c41088IHf.A00, "", c41088IHf.A02, c41088IHf.A03, singletonList);
                interfaceC82483mC.E11(c82543mI, true, c82543mI.A04);
                map.remove(A003);
            }
        } else {
            int intValue2 = interfaceC57162jr.CFq(c59062n7).intValue();
            if (intValue2 != 0) {
                if (intValue2 != 1) {
                    if (c63572ue != null) {
                        String A004 = A00(c59062n7, this);
                        C14360o3.A0B(A004, 0);
                        c63572ue.A06.get(A004);
                        InterfaceC82443m8 B3o = this.A03.A00.B3o();
                        if (B3o instanceof InterfaceC82423m6) {
                            interfaceC82423m62 = (InterfaceC82423m6) B3o;
                        } else {
                            interfaceC82423m62 = null;
                        }
                        C82543mI A02 = c63572ue.A02(new C37875GlU(interfaceC82423m62, this, C05F.A01, A00(c59062n7, this), 0.0f, interfaceC57162jr.BmE()), this.A00);
                        ICP icp = this.A02.A00;
                        if (icp != null) {
                            List list = A02.A06;
                            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C82493mD) it.next()).A01);
                            }
                            if ((!arrayList.isEmpty()) && AbstractC124635kR.A00((C82513mF) arrayList.get(0)) >= 250) {
                                icp.A00.A02(A02.A03);
                            }
                        }
                    }
                } else if (!this.A09) {
                    f = interfaceC57162jr.CGk(c59062n7);
                    if (c63572ue != null) {
                        String A005 = A00(c59062n7, this);
                        C14360o3.A0B(A005, 0);
                        c63572ue.A06.get(A005);
                        InterfaceC82443m8 B3p = this.A03.A00.B3p();
                        if (B3p instanceof InterfaceC82423m6) {
                            interfaceC82423m6 = (InterfaceC82423m6) B3p;
                        } else {
                            interfaceC82423m6 = null;
                        }
                        A00 = A00(c59062n7, this);
                        num = C05F.A0C;
                        BmE = interfaceC57162jr.BmE();
                        c63572ue.A02(new C37875GlU(interfaceC82423m6, this, num, A00, f, BmE), this.A00);
                    }
                }
            } else if (c63572ue != null) {
                String A006 = A00(c59062n7, this);
                C14360o3.A0B(A006, 0);
                c63572ue.A06.get(A006);
                InterfaceC82443m8 B3n2 = this.A03.A00.B3n();
                if (B3n2 instanceof InterfaceC82423m6) {
                    interfaceC82423m6 = (InterfaceC82423m6) B3n2;
                } else {
                    interfaceC82423m6 = null;
                }
                A00 = A00(c59062n7, this);
                num = C05F.A00;
                BmE = interfaceC57162jr.BmE();
                f = 0.0f;
                c63572ue.A02(new C37875GlU(interfaceC82423m6, this, num, A00, f, BmE), this.A00);
            }
        }
        C4EF c4ef = this.A04;
        if (c4ef != null) {
            if (this.A09 && interfaceC57162jr.CFq(c59062n7) == C05F.A01) {
                return;
            }
            int intValue3 = interfaceC57162jr.CFq(c59062n7).intValue();
            if (intValue3 != 0) {
                if (intValue3 != 1) {
                    num2 = C05F.A01;
                } else {
                    num2 = C05F.A0Y;
                    f2 = interfaceC57162jr.CGk(c59062n7);
                    if (!this.A08 && (num2 == C05F.A0Y || num2 == C05F.A01)) {
                        return;
                    }
                    c4ef.A01(new C38638Gyf(this.A03.A00.BrL(), num2, this.A05, A00(c59062n7, this), "ViewPoint", this.A06, f2, interfaceC57162jr.BmE()));
                }
            } else {
                num2 = C05F.A00;
            }
            f2 = 0.0f;
            if (!this.A08) {
            }
            c4ef.A01(new C38638Gyf(this.A03.A00.BrL(), num2, this.A05, A00(c59062n7, this), "ViewPoint", this.A06, f2, interfaceC57162jr.BmE()));
        }
    }

    public static final String A00(C59062n7 c59062n7, C37868GlN c37868GlN) {
        return (String) c37868GlN.A07.invoke(c59062n7.A03, c59062n7.A04);
    }
}
