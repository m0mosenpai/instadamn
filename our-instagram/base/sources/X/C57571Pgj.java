package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;

/* renamed from: X.Pgj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57571Pgj extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IgSignalsTtncEstimator A01;
    public final /* synthetic */ C74283Vj A02;
    public final /* synthetic */ C61922rt A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57571Pgj(IgSignalsTtncEstimator igSignalsTtncEstimator, C74283Vj c74283Vj, C61922rt c61922rt, Runnable runnable, String str, long j) {
        super(1);
        this.A01 = igSignalsTtncEstimator;
        this.A03 = c61922rt;
        this.A02 = c74283Vj;
        this.A04 = runnable;
        this.A00 = j;
        this.A05 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool;
        C54986OTu c54986OTu = (C54986OTu) obj;
        C14360o3.A0B(c54986OTu, 0);
        if (!this.A01.A0G) {
            C61922rt c61922rt = this.A03;
            C74283Vj c74283Vj = this.A02;
            Runnable runnable = this.A04;
            long j = this.A00;
            String str = this.A05;
            if (c54986OTu.A03) {
                double d = c54986OTu.A00;
                if (d > 0.0d) {
                    bool = Boolean.valueOf(AbstractC25230BEn.A1P((d > c54986OTu.A01 ? 1 : (d == c54986OTu.A01 ? 0 : -1))));
                } else {
                    bool = null;
                }
                if (AbstractC31177DnL.A1b(bool)) {
                    UserSession userSession = c61922rt.A0K;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A01(c06090Tz, userSession, 36599069892873639L) > 0) {
                        j = C18U.A01(c06090Tz, userSession, 36599069892873639L);
                    }
                }
                if (AbstractC166997dE.A1Z(bool, false)) {
                    if (!C18U.A06(C06090Tz.A05, c61922rt.A0K, 36317594918983058L)) {
                        j = 0;
                    }
                }
            }
            C61922rt.A02(c74283Vj, c61922rt, runnable, str, j);
        }
        return C0eB.A00;
    }
}
