package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Kan, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46089Kan extends C30P {
    public String A00;
    public final UserSession A01;
    public final UserSession A02;
    public final C7DP A03;
    public final C7DO A04;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.4So] */
    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C95804So A05(Object obj) {
        EnumC95784Sm enumC95784Sm = EnumC95784Sm.ORGANIC;
        ?? c0Zx = new C0Zx();
        c0Zx.A05("media_id", -1L);
        AbstractC43594JPz.A1A(enumC95784Sm, c0Zx, this);
        c0Zx.A06("tracking_token", "-1");
        c0Zx.A06("persistent_id", this.A04.A00());
        c0Zx.A06("encrypted_logging_policy", "encrypted_only");
        return c0Zx;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    @Override // X.C30P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C4T2 A06(X.C4T2 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46089Kan.A06(X.4T2, java.lang.Object):X.4T2");
    }

    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C4SH A07(Object obj) {
        String str;
        String str2;
        C75363a3 CFR;
        MRO mro = (MRO) obj;
        C14360o3.A0B(mro, 0);
        C38321qM BQN = mro.BQN();
        FollowStatus followStatus = null;
        if (BQN != null && A00(mro)) {
            InterfaceC60442pS interfaceC60442pS = super.A00;
            boolean z = true;
            boolean z2 = false;
            if (AbstractC75423a9.A02(BQN, interfaceC60442pS)) {
                str = AbstractC41071vF.A0F(this.A01, BQN);
                z = false;
                z2 = true;
            } else if (AbstractC75423a9.A01(BQN, interfaceC60442pS)) {
                str = BQN.A0C.getOrganicTrackingToken();
            } else {
                if (BQN.CW9()) {
                    str = BQN.A0C.BHD();
                } else {
                    str = null;
                }
                z = false;
            }
            UserSession userSession = this.A01;
            User A2E = BQN.A2E(userSession);
            String id = BQN.getId();
            if (id != null) {
                EnumC76383bi A1x = BQN.A1x();
                C14360o3.A0B(A1x, 2);
                String id2 = BQN.getId();
                if (A2E != null) {
                    str2 = A2E.getId();
                    followStatus = A2E.B7L();
                } else {
                    str2 = null;
                }
                boolean A4g = BQN.A4g();
                long A1B = BQN.A1B();
                EnumC40111tc BRp = BQN.BRp();
                if (!BQN.Cff() && !BQN.A5J()) {
                    CFR = null;
                } else {
                    CFR = BQN.CFR();
                }
                return new C4SH(A1x, BRp, followStatus, CFR, null, id, null, id2, str, str2, BQN.A2h(), null, null, null, BQN.A0C.BJN(), null, null, null, AbstractC41071vF.A0H(userSession, BQN.getId()), null, null, A1B, false, z, z2, A4g, BQN.A4x());
            }
            throw AbstractC166997dE.A0g();
        }
        UserSession userSession2 = this.A03.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36320287859548470L) || C18U.A06(c06090Tz, userSession2, 36322014436272078L)) {
            return null;
        }
        return new C4SH(EnumC76383bi.A06, null, null, null, null, "placeholder", null, "placeholder", null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, false, false, false, false);
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A04;
    }

    @Override // X.C30P
    public final String A09() {
        String str = this.A00;
        if (str == null) {
            return super.A01;
        }
        return str;
    }

    @Override // X.C30P
    public final /* bridge */ /* synthetic */ boolean A0B(Object obj) {
        MRO mro = (MRO) obj;
        C14360o3.A0B(mro, 0);
        if (!A00(mro)) {
            return false;
        }
        if (C18U.A06(C06090Tz.A05, this.A03.A00, 36319549126483462L)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46089Kan(UserSession userSession, C7DO c7do, InterfaceC60442pS interfaceC60442pS, String str) {
        super(interfaceC60442pS, str);
        AbstractC43594JPz.A1P(interfaceC60442pS, c7do);
        C7DP c7dp = new C7DP(userSession);
        this.A01 = userSession;
        this.A03 = c7dp;
        this.A02 = userSession;
        this.A04 = c7do;
    }

    public static final boolean A00(MRO mro) {
        int intValue = mro.BRP().intValue();
        if (intValue != 7 && intValue != 8 && intValue != 9 && intValue != 4) {
            C38321qM BQN = mro.BQN();
            if (BQN == null) {
                return false;
            }
            if (!BQN.A5P() && !BQN.A63() && AbstractC43592JPx.A0h(BQN) == null) {
                return false;
            }
        }
        return true;
    }
}
