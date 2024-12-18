package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ILs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41204ILs {
    public C33R A00;
    public C75113Zb A01;
    public boolean A02;
    public final UserSession A03;

    public C41204ILs(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
    }

    public final void A00() {
        C75113Zb c75113Zb;
        C33R c33r = this.A00;
        if (c33r != null && (c75113Zb = this.A01) != null) {
            c75113Zb.A0M(c33r, null, false);
        }
        this.A01 = null;
        this.A00 = null;
    }
}
