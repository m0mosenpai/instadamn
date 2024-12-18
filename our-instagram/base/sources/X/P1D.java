package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P1D implements InterfaceC58169PqZ {
    public static final CallerContext A0A = CallerContext.A01("AutoSharingRowItem");
    public C52369NFj A00;
    public C196208mB A01;
    public boolean A02;
    public final C81X A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final Ef3 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    private final SpannableStringBuilder A00() {
        AbstractC59962oe abstractC59962oe = this.A04;
        Context requireContext = abstractC59962oe.requireContext();
        return C50701MZw.A01(MSZ.A0H(requireContext.getResources(), requireContext.getString(2131973763), 2131973734), abstractC59962oe.requireActivity(), this.A05, AbstractC166997dE.A0p(requireContext, 2131973763), "advanced_post_settings", "https://help.instagram.com/1188715848969926/");
    }

    public static final SpannableStringBuilder A01(P1D p1d) {
        if (p1d.A02) {
            C131975xX c131975xX = C131965xW.A05;
            C131965xW A00 = C131975xX.A00(p1d.A05);
            AbstractC59962oe abstractC59962oe = p1d.A04;
            return A00.A02(abstractC59962oe.requireContext(), abstractC59962oe.requireActivity());
        }
        P1Z p1z = new P1Z(p1d);
        C131975xX c131975xX2 = C131965xW.A05;
        C131965xW A002 = C131975xX.A00(p1d.A05);
        AbstractC59962oe abstractC59962oe2 = p1d.A04;
        return A002.A03(abstractC59962oe2.requireContext(), abstractC59962oe2.requireActivity(), p1z, "advanced_setting_description");
    }

    public static final void A02(P1D p1d, boolean z) {
        C52369NFj c52369NFj = p1d.A00;
        if (c52369NFj != null) {
            c52369NFj.setChecked(z);
            C196208mB c196208mB = p1d.A01;
            if (c196208mB == null) {
                c196208mB = OQ9.A00(p1d.A05);
                p1d.A01 = c196208mB;
            }
            C14360o3.A0A(c196208mB);
            UserSession userSession = p1d.A05;
            c196208mB.A01(userSession, "feed_composer", z);
            AbstractC25651Mw.A00(userSession).A05(new C55999OtW(z));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
    
        if (X.C196218mC.A00(r10) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ac, code lost:
    
        if (r4 != false) goto L56;
     */
    @Override // X.InterfaceC58169PqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ANR() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1D.ANR():android.view.View");
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A03;
    }

    public P1D(AbstractC59962oe abstractC59962oe, UserSession userSession, boolean z, boolean z2) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A08 = z;
        this.A09 = z2;
        this.A03 = C81X.A2F;
        this.A07 = !C31238DoL.A00(userSession);
        this.A06 = AbstractC34213F7l.A00().A01(abstractC59962oe, userSession, new PK1(this, 1));
    }
}
