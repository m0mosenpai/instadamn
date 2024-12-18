package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JlS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44460JlS extends C193578hc {
    public boolean A00;
    public final C2GT A01;
    public final EnumC46194KcW A02;
    public final C42221xC A03;
    public final C41761wQ A04;
    public final UserSession A05;
    public final KPB A06;
    public final KPE A07;
    public final KPU A08;
    public final C48519LdH A09;
    public final InterfaceC58152PqH A0A;
    public final Integer A0B;
    public final String A0C;
    public final List A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC24731Iq A0F;
    public final InterfaceC24731Iq A0G;
    public final InterfaceC24731Iq A0H;
    public final InterfaceC19390xP A0I;
    public final InterfaceC19390xP A0J;
    public final InterfaceC19390xP A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final InterfaceC19390xP A0R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44460JlS(Application application, C12N c12n, C42221xC c42221xC, UserSession userSession, KPB kpb, C48519LdH c48519LdH, InterfaceC58152PqH interfaceC58152PqH, Integer num) {
        super(application);
        AbstractC25233BEq.A0x(3, c12n, c48519LdH, num);
        AbstractC167007dF.A1I(interfaceC58152PqH, 6, application);
        this.A05 = userSession;
        this.A03 = c42221xC;
        this.A09 = c48519LdH;
        this.A0B = num;
        this.A0A = interfaceC58152PqH;
        this.A06 = kpb;
        this.A0E = AbstractC09440dt.A01(new MHT(this, 38));
        this.A0C = "";
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        int i = C3JM.A00;
        C24721Ip c24721Ip = new C24721Ip(i);
        this.A0H = c24721Ip;
        C24721Ip c24721Ip2 = new C24721Ip(i);
        this.A0G = c24721Ip2;
        C24721Ip c24721Ip3 = new C24721Ip(i);
        this.A0F = c24721Ip3;
        C008002u A1H = AbstractC25225BEi.A1H(BHS.A00(new Object[0], 2131969651));
        this.A0L = A1H;
        C008002u A00 = C10E.A00(MVZ.A00(""));
        this.A0O = A00;
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A0P = A1H2;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0Q = A1A;
        EnumC46150Kbo enumC46150Kbo = EnumC46150Kbo.A03;
        C008002u A1H3 = AbstractC25225BEi.A1H(enumC46150Kbo);
        this.A0M = A1H3;
        C15150pV A03 = C10Q.A03(new MCS(0, null), A1H2, A1A);
        this.A0R = A03;
        EnumC46158Kbw enumC46158Kbw = EnumC46158Kbw.A05;
        C008002u A1H4 = AbstractC25225BEi.A1H(enumC46158Kbw);
        this.A0N = A1H4;
        this.A02 = EnumC46194KcW.A05;
        this.A04 = new C41761wQ(null);
        this.A0K = AbstractC07080Za.A03(c24721Ip);
        this.A0J = AbstractC07080Za.A03(c24721Ip2);
        this.A0I = AbstractC07080Za.A03(c24721Ip3);
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, C10Q.A02(C50131MCf.A00, A03, A1H4, A1H, A00, A1H3), 1705805791);
        this.A01 = AbstractC43594JPz.A0J(new C45041JwW(BHS.A00(new Object[0], 2131969651), MVZ.A00(""), enumC46150Kbo, enumC46158Kbw, EnumC46138Kbc.A02), AbstractC141776au.A00(this), A15, C10I.A00);
        this.A08 = AbstractC47844LBm.A00(userSession, num);
        this.A07 = (KPE) userSession.A01(KPE.class, C50247MHc.A01(userSession, 47));
        this.A0D = AbstractC166987dD.A1E();
    }

    public static final void A00(C44460JlS c44460JlS, String str) {
        List list = c44460JlS.A0D;
        list.add(str);
        KPU kpu = c44460JlS.A08;
        kpu.A09("PIN_FAILURE_REASON", AbstractC31173DnH.A1b(list, 0));
        kpu.A07("END_REASON", "PIN_RESTORE_FAIL");
        kpu.A05("PIN_RESTORE_FAIL");
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A04.A01();
    }
}
