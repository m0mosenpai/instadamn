package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lhe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48771Lhe implements InterfaceC50427MOh {
    public final /* synthetic */ KDY A00;

    public C48771Lhe(KDY kdy) {
        this.A00 = kdy;
    }

    @Override // X.InterfaceC50427MOh
    public final void DK3(double d, long j) {
        KDY kdy = this.A00;
        UserSession A0r = AbstractC166987dD.A0r(kdy.A0C);
        C14360o3.A0B(A0r, 0);
        LLR.A01(null, new LLR(kdy, A0r), null, false, Long.valueOf(AbstractC43593JPy.A06() - AbstractC25232BEp.A0t(kdy.A02)), "INTERACTION_CARD_VIEW", "IMPRESSION", String.valueOf(j));
    }
}
