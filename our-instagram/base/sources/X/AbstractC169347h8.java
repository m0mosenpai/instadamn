package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169347h8 implements InterfaceC169457hL, InterfaceC169357h9 {
    public InterfaceC169507hQ A00;
    public Object A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public Integer A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public final UserSession A0C;
    public final InterfaceC169497hP A0D;
    public final InterfaceC09390do A0E;
    public final boolean A0F;

    public AbstractC169347h8(UserSession userSession, InterfaceC169497hP interfaceC169497hP, boolean z, boolean z2) {
        this.A0C = userSession;
        this.A0D = interfaceC169497hP;
        this.A0F = z2;
        this.A0E = AbstractC09440dt.A00(EnumC09460dv.A02, new C9FH(10, this, null, z));
        C16930sl c16930sl = C16930sl.A00;
        this.A04 = c16930sl;
        this.A02 = "";
        this.A0A = c16930sl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r7.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(java.lang.String r7) {
        /*
            r6 = this;
            r2 = 0
            r6.A05 = r2
            r6.A06 = r2
            r1 = 1
            if (r7 == 0) goto Lf
            int r3 = r7.length()
            r0 = 0
            if (r3 != 0) goto L10
        Lf:
            r0 = 1
        L10:
            r5 = 0
            if (r0 == 0) goto L2f
            boolean r0 = r6.A0F
            if (r0 != 0) goto L2f
            X.0sl r0 = X.C16930sl.A00
            r6.A04 = r0
            r6.A01 = r5
            r6.A09 = r5
            r6.A03 = r5
            r6.A07 = r2
            r6.A0A = r5
            r6.A08 = r5
        L27:
            X.7hQ r0 = r6.A00
            if (r0 == 0) goto L2e
            r0.DcI(r6)
        L2e:
            return
        L2f:
            if (r7 == 0) goto L62
            X.7hP r0 = r6.A0D
            X.9JQ r4 = r0.BjP(r7)
        L37:
            java.lang.Integer r3 = r4.A01
            java.lang.Integer r0 = X.C05F.A0C
            if (r3 != r0) goto L67
            java.util.List r0 = r4.A06
            if (r0 != 0) goto L43
            X.0sl r0 = X.C16930sl.A00
        L43:
            r6.A04 = r0
            java.lang.Object r0 = r4.A02
            r6.A01 = r0
            java.lang.String r0 = r4.A04
            r6.A09 = r0
            java.lang.String r0 = r4.A05
            r6.A03 = r0
            java.util.List r0 = r4.A07
            r6.A0A = r0
            boolean r0 = r4.A08
            r6.A0B = r0
            java.lang.Integer r0 = r4.A00
            r6.A08 = r0
            r6.A07 = r2
            r6.A06 = r1
            goto L27
        L62:
            X.9JQ r4 = X.AbstractC208189Jc.A00()
            goto L37
        L67:
            X.0do r0 = r6.A0E
            java.lang.Object r0 = r0.getValue()
            X.TxR r0 = (X.C65974TxR) r0
            if (r7 != 0) goto L73
            java.lang.String r7 = ""
        L73:
            r0.A06(r7)
            X.0sl r0 = X.C16930sl.A00
            r6.A04 = r0
            r6.A01 = r5
            r6.A09 = r5
            r6.A03 = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0A = r0
            r6.A08 = r5
            r6.A07 = r1
            r6.A0B = r2
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC169347h8.A00(java.lang.String):void");
    }

    @Override // X.InterfaceC169517hR
    public final String An8() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final void DEw() {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        C14360o3.A0B(str, 0);
        if (C14360o3.A0K(this.A02, str)) {
            this.A07 = false;
            this.A05 = true;
            this.A06 = false;
            InterfaceC169507hQ interfaceC169507hQ = this.A00;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals(this.A02)) {
            this.A04 = C16930sl.A00;
            this.A01 = null;
            this.A09 = null;
            this.A03 = null;
            this.A0A = new ArrayList();
            this.A08 = null;
            InterfaceC169507hQ interfaceC169507hQ = this.A00;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(interfaceC40821up, 1);
        if (C14360o3.A0K(this.A02, str)) {
            this.A06 = true;
            InterfaceC168867gL interfaceC168867gL = (InterfaceC168867gL) interfaceC40821up;
            this.A04 = interfaceC168867gL.getItems();
            this.A01 = interfaceC168867gL.B3l();
            this.A09 = interfaceC168867gL.Bk6();
            this.A03 = interfaceC168867gL.Bo9();
            this.A0A = interfaceC168867gL.Bri();
            this.A08 = interfaceC168867gL.BmK();
            this.A07 = false;
            this.A05 = false;
            this.A0B = interfaceC168867gL.CLI();
            InterfaceC169507hQ interfaceC169507hQ = this.A00;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169517hR
    public final void ERL(final List list) {
        C14360o3.A0B(list, 0);
        final A9A a9a = new A9A((C221249po) this);
        C215499gP c215499gP = new C215499gP(this);
        UserSession userSession = this.A0C;
        C221249po c221249po = a9a.A03;
        if (c221249po != null) {
            a9a.A01 = userSession;
            A7K a7k = c221249po.A01;
            UserSession userSession2 = a7k.A00;
            String str = a7k.A01;
            C25621Ms c25621Ms = new C25621Ms(userSession2);
            c25621Ms.A06();
            c25621Ms.A0B("direct_v2/get_realtime_nullstate_metadata/");
            c25621Ms.A0F = str;
            c25621Ms.A9s(AbstractC111324zv.A00(3234), AbstractC34779FUd.A01(list));
            c25621Ms.A0S(C32208EDh.class, C34784FUj.class);
            C1ON A0N = c25621Ms.A0N();
            C14360o3.A0B(A0N, 0);
            a9a.A00 = A0N;
            a9a.A02 = c215499gP;
            A0N.A00 = new C1P1(list) { // from class: X.9gO
                public final List A00;

                {
                    this.A00 = list;
                }

                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A0N2 = AbstractC167017dG.A0N(abstractC115105If, -1793713905);
                    A9A a9a2 = A9A.this;
                    C215499gP c215499gP2 = a9a2.A02;
                    if (c215499gP2 != null) {
                        c215499gP2.onFail(abstractC115105If);
                    }
                    UserSession userSession3 = a9a2.A01;
                    if (userSession3 != null) {
                        C34926FaC.A00(userSession3).markerEnd(246558735, (short) 3);
                    }
                    C0f9.A0A(-2028821377, A0N2);
                }

                @Override // X.C1P1
                public final void onFinish() {
                    int A03 = C0f9.A03(-4102307);
                    C215499gP c215499gP2 = A9A.this.A02;
                    if (c215499gP2 != null) {
                        c215499gP2.onFinish();
                    }
                    C0f9.A0A(670880878, A03);
                }

                @Override // X.C1P1
                public final void onStart() {
                    int A03 = C0f9.A03(887106930);
                    A9A a9a2 = A9A.this;
                    C215499gP c215499gP2 = a9a2.A02;
                    if (c215499gP2 != null) {
                        c215499gP2.onStart();
                    }
                    UserSession userSession3 = a9a2.A01;
                    if (userSession3 != null) {
                        C34926FaC.A00(userSession3).markerStart(246558735);
                    }
                    C0f9.A0A(2139118032, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(-259399594);
                    InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
                    int A0N2 = AbstractC167017dG.A0N(interfaceC40821up, -1319575720);
                    ((InterfaceC168867gL) interfaceC40821up).getItems();
                    A9A a9a2 = A9A.this;
                    C215499gP c215499gP2 = a9a2.A02;
                    if (c215499gP2 != null) {
                        c215499gP2.A00(interfaceC40821up);
                    }
                    UserSession userSession3 = a9a2.A01;
                    if (userSession3 != null) {
                        C34926FaC.A00(userSession3).markerEnd(246558735, (short) 2);
                    }
                    C0f9.A0A(700876778, A0N2);
                    C0f9.A0A(123540420, A03);
                }
            };
            C1GL c1gl = c221249po.A00;
            if (c1gl != null) {
                c1gl.schedule(A0N, 2102726329, 1, true, true);
            } else {
                C1GJ.A06(A0N, 2102726329, 1, true, true);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC24489At8(a9a), 2000L);
        }
    }

    @Override // X.InterfaceC169517hR
    public final Object B3l() {
        return this.A01;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return this.A0B;
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A02;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        return this.A09;
    }

    @Override // X.InterfaceC169357h9
    public final Integer BmK() {
        return this.A08;
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        return this.A03;
    }

    @Override // X.InterfaceC169517hR
    public final /* bridge */ /* synthetic */ Object Bov() {
        return this.A04;
    }

    @Override // X.InterfaceC169357h9, X.InterfaceC169517hR
    public final List Bri() {
        return this.A0A;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CUG() {
        return this.A05;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CXh() {
        return this.A06;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CZV() {
        return this.A07;
    }

    @Override // X.InterfaceC169517hR
    public final void EKu() {
        if (!this.A07) {
            A00(this.A02);
        }
    }

    @Override // X.InterfaceC169517hR
    public final void EYJ(InterfaceC169507hQ interfaceC169507hQ) {
        if (this.A00 != interfaceC169507hQ) {
            this.A00 = interfaceC169507hQ;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169517hR
    public final void Eby(String str) {
        this.A02 = str;
        A00(str);
    }

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        return this.A07;
    }
}
