package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LgU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48700LgU implements InterfaceC50456MPk {
    public final UserSession A00;
    public final C2056398n A01;

    @Override // X.InterfaceC50456MPk
    public final void Cmx() {
        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(this.A00).A00;
        if (interfaceC19630xq.getLong("direct_cutout_sticker_new_badge_first_seen_timestamp", 0L) == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7G("direct_cutout_sticker_new_badge_first_seen_timestamp", currentTimeMillis);
            ARD.apply();
        }
    }

    @Override // X.InterfaceC50456MPk
    public final boolean EjO() {
        if (!C18U.A06(C06090Tz.A05, this.A00, 36325102517891812L) || AbstractC37300Gc1.A00(AbstractC31175DnJ.A03(this.A01.A00, "direct_cutout_sticker_new_badge_first_seen_timestamp")) > 604800000) {
            return false;
        }
        return true;
    }

    public C48700LgU(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC2056298m.A00(userSession);
    }
}
