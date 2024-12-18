package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.PSh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57042PSh implements Runnable {
    public final /* synthetic */ AnonymousClass436 A00;
    public final /* synthetic */ C2045893s A01;
    public final /* synthetic */ C55815OqQ A02;

    public RunnableC57042PSh(AnonymousClass436 anonymousClass436, C2045893s c2045893s, C55815OqQ c55815OqQ) {
        this.A02 = c55815OqQ;
        this.A01 = c2045893s;
        this.A00 = anonymousClass436;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass435 anonymousClass435;
        C53M A00;
        long j;
        Map map;
        String A1A;
        Long A0j;
        C55815OqQ c55815OqQ = this.A02;
        C37494GfC c37494GfC = c55815OqQ.A05;
        c37494GfC.A0E(AnonymousClass001.A0O("fetch_user_on_data_flush", c55815OqQ.A01));
        c55815OqQ.A01++;
        C53M A002 = C55815OqQ.A00(c55815OqQ);
        if (A002 != null && A002.isValid()) {
            C53M A003 = C55815OqQ.A00(c55815OqQ);
            if (A003 != null) {
                A003.EWZ(false);
            }
            C2045893s c2045893s = this.A01;
            User A004 = C72W.A00(c2045893s);
            if (A004 != null) {
                C53M A005 = C55815OqQ.A00(c55815OqQ);
                if (A005 != null) {
                    C72X A006 = c55815OqQ.A06.A00();
                    AnonymousClass435 anonymousClass4352 = (AnonymousClass435) this.A00;
                    if (anonymousClass4352 != null && (map = anonymousClass4352.A00.trackedResponseHeaders) != null && (A1A = AbstractC166987dD.A1A("X-IG-Request-Elapsed-Time-MS", map)) != null && (A0j = AbstractC166997dE.A0j(A1A)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    A005.DyF(A006, A004, C72W.A01(c2045893s), j, c2045893s.CR4());
                }
                C53M A007 = C55815OqQ.A00(c55815OqQ);
                if (A007 != null) {
                    A007.EcE(((InterfaceC128135qh) c2045893s.F7f()).BlD());
                }
                if (!c55815OqQ.A02) {
                    c55815OqQ.A02 = true;
                    C5K5.A00(c55815OqQ.A04).EPB(A004.A0I(), A004.getId());
                }
            } else {
                C53M A008 = C55815OqQ.A00(c55815OqQ);
                if (A008 != null) {
                    A008.DGu(false, true, "User is null");
                }
            }
            AnonymousClass436 anonymousClass436 = this.A00;
            if ((anonymousClass436 instanceof AnonymousClass435) && (anonymousClass435 = (AnonymousClass435) anonymousClass436) != null && anonymousClass435.A00.isFinal && (A00 = C55815OqQ.A00(c55815OqQ)) != null) {
                A00.Dxm();
                return;
            }
            return;
        }
        c37494GfC.A0E("fetch_user_on_data_view_invalid");
    }
}
