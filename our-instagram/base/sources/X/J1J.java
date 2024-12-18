package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J1J implements InterfaceC62602sz, InterfaceC62612t0 {
    public final UserSession A00;
    public final C154796xU A01;
    public final C41189ILc A02;
    public final String A03;
    public final String A04;

    public final void A00(boolean z) {
        String str;
        String str2 = this.A03;
        if (str2 != null && (str = this.A04) != null) {
            UserSession userSession = this.A00;
            C154796xU c154796xU = this.A01;
            String str3 = c154796xU.A03.A07;
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0B(String.format("media/%s/%s/story_question_responses/", str2, str));
            A0N.A9s("max_id", str3);
            C38290GsZ.A00(AbstractC31172DnG.A0S(A0N, C73449YDs.class, C41337IRi.class), c154796xU, this, 6, z);
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A01.A06()) {
            A00(false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return AbstractC167007dF.A1O(this.A02.A01.A01.size());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A01.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC37303Gc4.A1b(this.A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        C154796xU c154796xU = this.A01;
        if (!AbstractC37303Gc4.A1b(c154796xU) && !AbstractC37303Gc4.A1a(c154796xU) && CL7()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00(AbstractC25229BEm.A1Z(this.A01.A03.A07));
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A01);
    }

    public J1J(AbstractC59962oe abstractC59962oe, UserSession userSession, C41189ILc c41189ILc, String str, String str2) {
        this.A01 = AbstractC37302Gc3.A0L(abstractC59962oe.requireContext(), abstractC59962oe, userSession);
        this.A00 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = c41189ILc;
    }
}
