package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gjb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37762Gjb extends AbstractC154286wd {
    public int A00;
    public final InterfaceC116925Qy A01;
    public final C153696ve A02;
    public final String A03;
    public final List A04;
    public final java.util.Set A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final UserSession A0F;
    public final C13920nI A0G;
    public final Integer A0H;

    public C37762Gjb(InterfaceC116925Qy interfaceC116925Qy, C153696ve c153696ve, UserSession userSession, Integer num, String str, List list, java.util.Set set, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167017dG.A1R(set, list);
        this.A0F = userSession;
        this.A05 = set;
        this.A04 = list;
        this.A09 = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A0H = num;
        this.A0E = z4;
        this.A0A = true;
        this.A0D = z5;
        this.A08 = z6;
        this.A02 = c153696ve;
        this.A03 = str;
        this.A01 = interfaceC116925Qy;
        this.A07 = z7;
        this.A06 = interfaceC16820sZ;
        this.A0G = C13920nI.A00;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C38952HDe c38952HDe;
        C50679MYx c50679MYx;
        String str;
        String str2;
        String str3;
        String str4;
        int A03 = C0f9.A03(-653937981);
        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC124295jj, 1243677822);
        List<C120985dq> AoM = interfaceC124295jj.AoM();
        if (AoM.isEmpty()) {
            AoM = interfaceC124295jj.AoP();
        }
        InterfaceC116925Qy interfaceC116925Qy = this.A01;
        if (interfaceC116925Qy != null) {
            if (this.A07) {
                EnumC74603Ws enumC74603Ws = EnumC74603Ws.A05;
                java.util.Set set = C37814GkU.A00;
                if (set != null) {
                    interfaceC116925Qy.FCF(enumC74603Ws, set);
                    C37814GkU.A00 = null;
                }
            } else {
                C37787Gk2.A05(interfaceC116925Qy, EnumC74603Ws.A05, true);
            }
        }
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AoM = ((C153706vf) it.next()).A00(AoM);
        }
        boolean z = this.A0B;
        if (z) {
            Iterator it2 = AoM.iterator();
            while (it2.hasNext()) {
                ((C120985dq) it2.next()).A0E(C05F.A0C);
            }
        } else if (interfaceC124295jj.CR4()) {
            Iterator it3 = AoM.iterator();
            while (it3.hasNext()) {
                ((C120985dq) it3.next()).A0E(C05F.A0Y);
            }
        }
        boolean z2 = this.A0E;
        if (z2) {
            Iterator it4 = AoM.iterator();
            while (it4.hasNext()) {
                ((C120985dq) it4.next()).A09 = true;
            }
        }
        if (!interfaceC124295jj.CR4()) {
            Iterator it5 = AoM.iterator();
            while (it5.hasNext()) {
                ((C120985dq) it5.next()).A06 = Long.valueOf(System.currentTimeMillis() / 1000);
            }
        }
        if ((interfaceC124295jj instanceof C38952HDe) && (c50679MYx = (c38952HDe = (C38952HDe) interfaceC124295jj).A00) != null && (str = c50679MYx.A01) != null && str.length() != 0 && (str2 = c50679MYx.A00) != null) {
            for (C120985dq c120985dq : AoM) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    str3 = c38321qM.A2u();
                } else {
                    str3 = null;
                }
                if (C14360o3.A0K(str3, str2)) {
                    C50679MYx c50679MYx2 = c38952HDe.A00;
                    if (c50679MYx2 != null) {
                        str4 = c50679MYx2.A01;
                    } else {
                        str4 = null;
                    }
                    c120985dq.A07 = str4;
                }
            }
        }
        int i = this.A00;
        boolean z3 = this.A09;
        boolean z4 = this.A0C;
        boolean z5 = this.A0A;
        boolean z6 = this.A0D;
        boolean z7 = this.A08;
        D8L d8l = new D8L(9, new C37818GkY(interfaceC124295jj, Long.valueOf(interfaceC124295jj.Ajf()), Long.valueOf(interfaceC124295jj.getResponseTimestamp()), interfaceC124295jj.Bb1(), interfaceC124295jj.Boh(), this.A03, interfaceC124295jj.Ahz(), AoM, interfaceC124295jj.Ahw(), i, z3, z4, z, z2, z5, z6, z7, interfaceC124295jj.CR4()), this);
        if (z) {
            C153696ve c153696ve = this.A02;
            if (c153696ve != null) {
                c153696ve.A03();
            }
            if (!AbstractC25231BEo.A1b(this.A06)) {
                C11T.A03(new RunnableC37831Gkl(d8l));
                this.A00++;
                C0f9.A0A(-1136407544, A0N);
                C0f9.A0A(1939025633, A03);
            }
        }
        d8l.invoke();
        this.A00++;
        C0f9.A0A(-1136407544, A0N);
        C0f9.A0A(1939025633, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 328851863);
        C38971HDz c38971HDz = new C38971HDz(abstractC115105If, this.A00, this.A09, this.A0C, this.A0B, this.A0E, this.A0D);
        InterfaceC116925Qy interfaceC116925Qy = this.A01;
        if (interfaceC116925Qy != null) {
            if (this.A07) {
                EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
                java.util.Set set = C37814GkU.A00;
                if (set != null) {
                    interfaceC116925Qy.FCF(enumC74603Ws, set);
                    C37814GkU.A00 = null;
                }
            } else {
                C37787Gk2.A05(interfaceC116925Qy, EnumC74603Ws.A04, true);
            }
        }
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((InterfaceC116905Qw) it.next()).D5E(c38971HDz);
        }
        C0f9.A0A(1961192260, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-907211457);
        MHO mho = new MHO(this, 34);
        if (this.A0E && this.A0B && !AbstractC25231BEo.A1b(this.A06)) {
            C11T.A03(new RunnableC37831Gkl(mho));
        } else {
            mho.invoke();
        }
        C0f9.A0A(1959882887, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(162018734);
        C11T.A03(new RunnableC37763Gjc(this, new C37752GjR(this.A0H, this.A09, this.A0C, this.A0E, this.A08)));
        C0f9.A0A(769516931, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1245146008);
        C0f9.A0A(2019579661, C0f9.A03(321307447));
        C0f9.A0A(912687385, A03);
    }
}
