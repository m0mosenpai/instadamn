package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gk0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37785Gk0 implements InterfaceC43437JHb {
    public final InterfaceC19630xq A00;
    public final UserSession A01;
    public final EnumC37795GkA A02;

    public C37785Gk0(UserSession userSession, InterfaceC19630xq interfaceC19630xq, EnumC37795GkA enumC37795GkA) {
        C14360o3.A0B(interfaceC19630xq, 2);
        this.A01 = userSession;
        this.A00 = interfaceC19630xq;
        this.A02 = enumC37795GkA;
    }

    @Override // X.InterfaceC43437JHb
    public final boolean CSz() {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        boolean z = false;
        if (interfaceC19630xq.getInt("KEY_CLIPS_TAB_VISIT_COUNT", 0) <= 4 && System.currentTimeMillis() - interfaceC19630xq.getLong("KEY_LAST_TAB_VISIT_TIMESTAMP_MS", 0L) > 604800000 && System.currentTimeMillis() - interfaceC19630xq.getLong("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", 0L) > 86400000) {
            z = true;
        }
        if (!z) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.A02.A00;
        if (currentTimeMillis - AbstractC31175DnJ.A03(interfaceC19630xq, AnonymousClass001.A0R("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", str)) <= 604800000 || interfaceC19630xq.getInt(AnonymousClass001.A0R("KEY_TOOLTIP_COUNT", str), 0) > 3) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43437JHb
    public final void Dm8() {
        String str = this.A02.A00;
        String A0R = AnonymousClass001.A0R("KEY_TOOLTIP_COUNT", str);
        InterfaceC19630xq interfaceC19630xq = this.A00;
        int i = interfaceC19630xq.getInt(A0R, 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", System.currentTimeMillis());
        ARD.E7G(AnonymousClass001.A0R("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", str), System.currentTimeMillis());
        ARD.E7D(A0R, i + 1);
        ARD.apply();
    }
}
