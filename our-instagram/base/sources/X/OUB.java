package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;

/* loaded from: classes9.dex */
public final class OUB {
    public static final InterfaceC09390do A05 = AbstractC09440dt.A01(MWa.A00);
    public boolean A00;
    public final MWY A01;
    public final C56152OwJ A02;
    public final MUB A03;
    public final C37494GfC A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.53M, X.MWY, java.lang.Object] */
    public OUB(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        MUB mub = new MUB(userSession, userDetailLaunchConfig, new MV3(userSession));
        this.A03 = mub;
        C37494GfC c37494GfC = new C37494GfC(userSession, userDetailLaunchConfig.A0A, userDetailLaunchConfig.A0L, userDetailLaunchConfig.A0Z);
        this.A04 = c37494GfC;
        ?? obj = new Object();
        this.A01 = obj;
        C19K A02 = AbstractC24771Iv.A02(93492324, 3);
        C06090Tz c06090Tz = C06090Tz.A05;
        C56152OwJ c56152OwJ = new C56152OwJ(A02, AbstractC25225BEi.A07(c06090Tz, userSession, 36609592563079091L), C18U.A06(c06090Tz, userSession, 36328117586115780L));
        this.A02 = c56152OwJ;
        if (C18U.A06(c06090Tz, userSession, 36328117585198267L)) {
            this.A00 = true;
            boolean A07 = mub.A07();
            mub.A06(userSession, c56152OwJ, new MV1(userSession), obj, c37494GfC, new AnonymousClass700(null, false, mub.A07(), false), userDetailLaunchConfig.A0C, "profile", false, A07);
        }
    }
}
