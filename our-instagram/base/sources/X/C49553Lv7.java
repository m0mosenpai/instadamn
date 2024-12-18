package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lv7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49553Lv7 implements C5OV {
    public final InterfaceC02900Bo A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        return AbstractC167007dF.A1P(this.A00.CLL() ? 1 : 0, this.A01 ? 1 : 0);
    }

    public C49553Lv7(UserSession userSession, boolean z) {
        this.A01 = z;
        this.A00 = C0BQ.A00(userSession);
    }
}
