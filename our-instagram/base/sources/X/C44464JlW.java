package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JlW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44464JlW extends C193578hc {
    public String A00;
    public final C2GT A01;
    public final EnumC46194KcW A02;
    public final C42221xC A03;
    public final C42221xC A04;
    public final C41761wQ A05;
    public final UserSession A06;
    public final KPF A07;
    public final KPI A08;
    public final C48519LdH A09;
    public final EnumC46172KcA A0A;
    public final InterfaceC58152PqH A0B;
    public final Integer A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC24731Iq A0F;
    public final InterfaceC19390xP A0G;
    public final InterfaceC19390xP A0H;
    public final InterfaceC19390xP A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final boolean A0N;
    public final List A0O;
    public final InterfaceC19390xP A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44464JlW(Application application, C12N c12n, C42221xC c42221xC, C42221xC c42221xC2, UserSession userSession, KPF kpf, KPI kpi, C48519LdH c48519LdH, InterfaceC58152PqH interfaceC58152PqH, Integer num) {
        super(application);
        C14360o3.A0B(c42221xC, 1);
        AbstractC25229BEm.A1I(c48519LdH, 4, kpf);
        AbstractC25233BEq.A0y(7, num, interfaceC58152PqH, c12n);
        C14360o3.A0B(application, 10);
        this.A03 = c42221xC;
        this.A04 = c42221xC2;
        this.A06 = userSession;
        this.A09 = c48519LdH;
        this.A08 = kpi;
        this.A07 = kpf;
        this.A0C = num;
        this.A0B = interfaceC58152PqH;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        int i = C3JM.A00;
        C24721Ip c24721Ip = new C24721Ip(i);
        this.A0F = c24721Ip;
        C24721Ip c24721Ip2 = new C24721Ip(i);
        this.A0E = c24721Ip2;
        C008002u A00 = C10E.A00(null);
        this.A0J = A00;
        EnumC46139Kbd enumC46139Kbd = EnumC46139Kbd.A03;
        C008002u A1H = AbstractC25225BEi.A1H(enumC46139Kbd);
        this.A0M = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A0K = A1H2;
        boolean z = false;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0L = A1A;
        C24721Ip c24721Ip3 = new C24721Ip(i);
        this.A0D = c24721Ip3;
        C15150pV A03 = C10Q.A03(new MCS(1, null), A1H2, A1A);
        this.A0P = A03;
        this.A02 = EnumC46194KcW.A05;
        this.A05 = new C41761wQ(null);
        C48519LdH.A03(c48519LdH, num);
        this.A0A = (EnumC46172KcA) c48519LdH.A0P.getValue();
        this.A0O = AbstractC166987dD.A1E();
        this.A0I = AbstractC07080Za.A03(c24721Ip);
        this.A0H = AbstractC07080Za.A03(c24721Ip2);
        this.A0G = AbstractC07080Za.A03(c24721Ip3);
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, C10Q.A00(C50128MCc.A00, A1H, A03, A00), 1705805791);
        this.A01 = AbstractC43594JPz.A0J(new C45023JwE(null, EnumC46138Kbc.A02, enumC46139Kbd), AbstractC141776au.A00(this), A15, C10I.A00);
        this.A00 = "";
        if (C6CB.A02(C6CE.A00(userSession).A00, 2342158937683398379L) && num != C05F.A0C) {
            z = true;
        }
        this.A0N = z;
    }

    public static final void A00(C5QE c5qe, C44464JlW c44464JlW) {
        AbstractC43594JPz.A1T(c44464JlW.A0L);
        c44464JlW.A0J.Egh(c5qe);
        c44464JlW.A0M.Egh(EnumC46139Kbd.A03);
        c44464JlW.A0K.Egh("");
    }

    public static final void A02(C44464JlW c44464JlW, String str) {
        if (str != null) {
            c44464JlW.A0O.add(str);
        }
        KPI kpi = c44464JlW.A08;
        kpi.A07("END_REASON", "CONFIRM_PIN_SETUP_FAIL");
        AbstractC43594JPz.A1H(kpi, c44464JlW.A0O);
        kpi.A05("CONFIRM_PIN_SETUP_FAIL");
        if (c44464JlW.A0C != C05F.A0C) {
            kpi.A04(C05F.A01);
        }
    }

    public static final void A03(C44464JlW c44464JlW, String str, boolean z) {
        int i;
        AbstractC43592JPx.A1R(c44464JlW.A07, "FAILURE_REASON", str);
        A02(c44464JlW, str);
        if (c44464JlW.A0N) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            UserSession userSession = c44464JlW.A06;
            AbstractC25226BEj.A1N(AbstractC25225BEi.A0F(userSession), A0K, 2131969638);
            A0K.A0I = AbstractC25225BEi.A0F(userSession).getString(2131969637);
            A0K.A0L = true;
            AbstractC31175DnJ.A0l(AbstractC25225BEi.A0F(userSession), A0K, 2131969636);
            A0K.A0A(c44464JlW.A0B);
            A0K.A06();
            AbstractC25233BEq.A1F(A0K);
            return;
        }
        c44464JlW.A08.A05("PIN_CODE_SETUP_VESTA_REGISTRATION_FAIL");
        Object[] objArr = new Object[0];
        if (z) {
            i = 2131961773;
        } else {
            i = 2131961771;
        }
        A00(BHS.A00(objArr, i), c44464JlW);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A05.A01();
    }

    public static final void A01(C5QE c5qe, C44464JlW c44464JlW) {
        if (AnonymousClass194.A07(AbstractC141776au.A00(c44464JlW))) {
            GSS.A02(c5qe, c44464JlW, AbstractC141776au.A00(c44464JlW), 8);
        } else {
            C11T.A02(new RunnableC49943M3k(c5qe, c44464JlW));
        }
    }
}
