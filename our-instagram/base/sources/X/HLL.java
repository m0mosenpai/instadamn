package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLL extends C155376yQ {
    public final /* synthetic */ C3YU A00;
    public final /* synthetic */ C38J A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C155376yQ
    /* renamed from: A00 */
    public final boolean EjD(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38J c38j = this.A01;
        if (c38j.A0H) {
            if (c38321qM.A2O() != C05F.A0C || c38321qM.A00 == 2) {
                return false;
            }
        } else {
            if (super.EjD(c38321qM) || this.A03 || c38j.A08 == EnumC114765Gh.A04) {
                if (this.A02 || c38321qM.A1y() == this.A00) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HLL(UserSession userSession, C3YU c3yu, C38J c38j, boolean z, boolean z2) {
        super(userSession);
        this.A01 = c38j;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = c3yu;
    }
}
