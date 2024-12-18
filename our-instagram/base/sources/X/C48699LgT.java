package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LgT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48699LgT implements InterfaceC50456MPk {
    public final UserSession A00;
    public final String A01;

    @Override // X.InterfaceC50456MPk
    public final void Cmx() {
        String str = this.A01;
        if (str != null) {
            InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(this.A00).A00;
            if (interfaceC19630xq.getLong(AnonymousClass001.A0R("direct_music_sticker_nux_first_seen_timestamp_", str), 0L) == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7G(AnonymousClass001.A0R("direct_music_sticker_nux_first_seen_timestamp_", str), currentTimeMillis);
                ARD.apply();
            }
        }
    }

    @Override // X.InterfaceC50456MPk
    public final boolean EjO() {
        String str = this.A01;
        if (str == null) {
            return false;
        }
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328379577941486L)) {
            return false;
        }
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        C14360o3.A0B(str, 0);
        long j = A00.A00.getLong(AnonymousClass001.A0R("direct_music_sticker_nux_first_seen_timestamp_", str), 0L);
        if (j == 0) {
            return true;
        }
        long A002 = AbstractC37300Gc1.A00(j);
        long A0N = AbstractC166987dD.A0N(AbstractC20100yh.A00(36609854554707941L).A00(userSession));
        if (A0N <= 0) {
            A0N = 604800000;
        }
        if (A002 > A0N) {
            return false;
        }
        return true;
    }

    public C48699LgT(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }
}
