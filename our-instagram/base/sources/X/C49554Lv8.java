package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lv8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49554Lv8 implements C5OV {
    public final UserSession A00;
    public final C13920nI A01;
    public final Integer A02;

    public C49554Lv8(UserSession userSession, C13920nI c13920nI, Integer num) {
        C14360o3.A0B(c13920nI, 3);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = c13920nI;
    }

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        long A0L = AbstractC166987dD.A0L(AbstractC37300Gc1.A00(AbstractC31175DnJ.A03(AbstractC166987dD.A0x(this.A00), "last_interop_interstitial_presentation_timestamp")));
        C14360o3.A0A(this.A02);
        return AbstractC167007dF.A1O((A0L > r0.intValue() ? 1 : (A0L == r0.intValue() ? 0 : -1)));
    }
}
