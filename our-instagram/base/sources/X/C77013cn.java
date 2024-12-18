package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77013cn implements InterfaceC63932vE, InterfaceC77033cp, InterfaceC63912vC, InterfaceC63942vF {
    public C41583IaW A01;
    public InterfaceC690438q A02;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC65282xQ A06;
    public C38321qM A00 = null;
    public final int A03 = 2;

    public C77013cn(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC690438q interfaceC690438q, InterfaceC65282xQ interfaceC65282xQ) {
        this.A06 = interfaceC65282xQ;
        this.A02 = interfaceC690438q;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
    }

    public static void A01(C38321qM c38321qM, int i) {
        if (i == 1) {
            c38321qM.A3z();
        } else {
            c38321qM.A3y();
        }
    }

    @Override // X.InterfaceC77033cp
    public final boolean CX4(Object obj, Object obj2) {
        if (obj2 != null && (obj instanceof C38321qM)) {
            ((C38321qM) obj).A3y();
        }
        return false;
    }

    @Override // X.InterfaceC77033cp
    public final boolean CX9(Object obj, Object obj2) {
        if (obj2 != null && (obj instanceof C38321qM)) {
            ((C38321qM) obj).A3y();
        }
        return false;
    }

    @Override // X.InterfaceC63942vF
    public final void DB4(C41232IMx c41232IMx) {
    }

    @Override // X.InterfaceC63932vE
    public final void Dcd(C41222IMn c41222IMn, C41232IMx c41232IMx) {
    }

    @Override // X.InterfaceC63932vE
    public final void Dce(String str, int i) {
    }

    public static int A00(InterfaceC11380iw interfaceC11380iw, String str) {
        if ((str != null && (str.equals("contextual_feed") || str.equals("main_feed"))) || interfaceC11380iw.getModuleName().equals("feed_short_url")) {
            return 1;
        }
        return 2;
    }

    @Override // X.InterfaceC77033cp
    public final void AGt() {
        this.A06.AVK();
    }

    @Override // X.InterfaceC77033cp
    public final void CwX() {
    }

    @Override // X.InterfaceC63912vC
    public final void DmK() {
    }

    @Override // X.InterfaceC63912vC
    public final void DmL(C42665IuM c42665IuM, C105854pw c105854pw) {
        c42665IuM.A00 = C05F.A00;
    }

    @Override // X.InterfaceC63912vC
    public final void DmM() {
    }

    public final void A02(C38321qM c38321qM) {
        c38321qM.getClass();
        this.A00 = c38321qM;
        c38321qM.A3y();
        c38321qM.A3y();
    }

    @Override // X.InterfaceC63932vE
    public final void DHF(Object obj, Object obj2) {
    }

    @Override // X.InterfaceC63932vE
    public final void DHH(Object obj, Object obj2) {
    }
}
