package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dtc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31552Dtc extends C1I2 {
    public final UserSession A00;
    public final GYO A01;

    public C31552Dtc(UserSession userSession, GYO gyo) {
        this.A00 = userSession;
        this.A01 = gyo;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(1972115335);
        for (int i6 = i; i6 < i + i2; i6++) {
            this.A01.EHl(this.A00, i6);
        }
        C0f9.A0A(-1362326756, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(147355321, C0f9.A03(1215019731));
    }
}
