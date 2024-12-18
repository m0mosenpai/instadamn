package X;

import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;

/* renamed from: X.2CJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CJ {
    public final boolean A00;
    public final boolean A01;
    public final C2CH A02;
    public final C2CI A03;
    public final boolean A04;

    public final boolean A00() {
        C2CH c2ch = this.A02;
        if (!c2ch.A01 && !AbstractC06440Vm.A01(1900596) && !C21A.A02() && !c2ch.A00 && !this.A04) {
            return false;
        }
        return true;
    }

    public C2CJ(UserSession userSession, C2CH c2ch, C2CI c2ci) {
        this.A02 = c2ch;
        this.A03 = c2ci;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A00 = C18U.A06(c06090Tz, userSession, 36311152463970753L);
        this.A01 = C18U.A06(c06090Tz, userSession, 36312440954291318L);
        this.A04 = EndToEnd.isRunningEndToEndTest();
    }
}
