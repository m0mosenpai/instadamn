package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.71d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1565571d implements InterfaceC13000lm {
    public final InterfaceC19630xq A00;
    public final UserSession A01;

    public final String A00() {
        return this.A00.getString("account_delegate_ig_id", null);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C1565571d.class);
    }

    public C1565571d(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C1AT.A01(userSession).A04(C1AV.A1t, getClass());
    }
}
