package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLJ extends C155376yQ {
    public final /* synthetic */ EnumC125765mR A00;

    @Override // X.C155376yQ
    /* renamed from: A00 */
    public final boolean EjD(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if ((this.A00 == EnumC125765mR.A0C && c38321qM.A0C.Bns() == null) || !super.EjD(c38321qM) || c38321qM.A1y() != C3YU.A05) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HLJ(UserSession userSession, EnumC125765mR enumC125765mR) {
        super(userSession);
        this.A00 = enumC125765mR;
    }
}
