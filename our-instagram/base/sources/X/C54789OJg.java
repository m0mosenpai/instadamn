package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OJg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54789OJg {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC10360h2 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ C75113Zb A05;
    public final /* synthetic */ C54309NzT A06;
    public final /* synthetic */ boolean A07;

    public C54789OJg(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C54309NzT c54309NzT, boolean z) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = c38321qM;
        this.A06 = c54309NzT;
        this.A01 = abstractC10360h2;
        this.A04 = interfaceC60442pS;
        this.A05 = c75113Zb;
        this.A07 = z;
    }

    public final void A00() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36317947102435033L);
        if (A06) {
            FragmentActivity fragmentActivity = this.A00;
            C38321qM c38321qM = this.A03;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!C2TN.A02(userSession, c38321qM)) {
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                if (interfaceC19630xq.getInt("clips_3p_download_privacy_snackbar_shown_count", 0) < 1) {
                    AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "clips_3p_download_privacy_snackbar_shown_count", 0);
                    C41451vu c41451vu = C41451vu.A01;
                    C146106i8 A0Y = AbstractC31174DnI.A0Y();
                    A0Y.A09 = c38321qM.A1S();
                    A0Y.A03();
                    AbstractC31172DnG.A1H(fragmentActivity.getResources(), A0Y, 2131955210);
                    A0Y.A0L = true;
                    AbstractC31175DnJ.A0l(fragmentActivity, A0Y, 2131965052);
                    A0Y.A0A(new P3I(5, fragmentActivity, userSession));
                    A0Y.A01 = 6000;
                    AbstractC31178DnM.A1N(c41451vu, A0Y);
                }
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36323341581692086L)) {
            FragmentActivity fragmentActivity2 = this.A00;
            AbstractC166987dD.A1Z(new PYD(fragmentActivity2, this.A01, userSession, this.A03, this.A04, this.A05, this.A06, null, 1, this.A07, A06), AbstractC57302k5.A00(fragmentActivity2.getLifecycle()));
            return;
        }
        C38321qM c38321qM2 = this.A03;
        FragmentActivity fragmentActivity3 = this.A00;
        C54798OJr c54798OJr = new C54798OJr(c38321qM2, this.A06, AbstractC166987dD.A11(AbstractC916948n.A0A(fragmentActivity3, "mp4", System.nanoTime(), true)));
        AbstractC10360h2 abstractC10360h2 = this.A01;
        C55220Oej.A00(fragmentActivity3, abstractC10360h2, userSession, this.A04, this.A05, c54798OJr, this.A07, A06);
        if (A06) {
            C55220Oej.A01(fragmentActivity3, userSession, c38321qM2, c54798OJr);
        } else {
            AbstractC63248Sg4.A02(abstractC10360h2);
        }
    }
}
