package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JU8 extends AbstractC46524KiP {
    public InterfaceC50428MOi A00;
    public L1U A01;
    public C2EC A02;
    public boolean A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final InterfaceC50487MQp A06;
    public final C2056398n A07;

    public JU8(UserSession userSession, C2056398n c2056398n) {
        C14360o3.A0B(c2056398n, 2);
        this.A05 = userSession;
        this.A07 = c2056398n;
        this.A06 = new JU9(this);
        this.A04 = new JUA(this);
    }

    public final boolean A08(C2EC c2ec, boolean z) {
        String C7I;
        if (c2ec == null || (C7I = c2ec.C7I()) == null || !c2ec.Cd4()) {
            return false;
        }
        InterfaceC19630xq interfaceC19630xq = this.A07.A00;
        boolean z2 = false;
        if (interfaceC19630xq.contains("preference_direct_shh_mode_replay_existing_shh_user")) {
            z2 = interfaceC19630xq.getBoolean("preference_direct_shh_mode_replay_existing_shh_user", false);
        } else {
            if (interfaceC19630xq.getInt(AbstractC111324zv.A00(4299), 0) > 0) {
                z2 = true;
            }
            AbstractC31177DnL.A1N(interfaceC19630xq, "preference_direct_shh_mode_replay_existing_shh_user", z2);
        }
        if (z2) {
            return z || (interfaceC19630xq.getInt("direct_shh_mode_replay_banner_seen_count", 0) < 2 && interfaceC19630xq.getInt(AnonymousClass001.A0R("direct_shh_mode_replay_banner_seen_count_", C7I), 0) < 1);
        }
        return false;
    }
}
