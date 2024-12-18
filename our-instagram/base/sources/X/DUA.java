package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class DUA extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C26053Bfg A00;
    public final /* synthetic */ C2Z1 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C25447BNm A03;
    public final /* synthetic */ C57 A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUA(C26053Bfg c26053Bfg, C2Z1 c2z1, C38321qM c38321qM, C25447BNm c25447BNm, C57 c57, Integer num, String str) {
        super(2);
        this.A00 = c26053Bfg;
        this.A04 = c57;
        this.A05 = num;
        this.A02 = c38321qM;
        this.A03 = c25447BNm;
        this.A01 = c2z1;
        this.A06 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C57 c57;
        Integer num;
        User user = (User) obj;
        C14360o3.A0B(user, 0);
        C26053Bfg c26053Bfg = this.A00;
        if (c26053Bfg != null && (c57 = this.A04) != null && (num = this.A05) != null && num.intValue() > 0 && !C14360o3.A0K(AbstractC25226BEj.A14(this.A02), user)) {
            C25447BNm c25447BNm = this.A03;
            UserSession userSession = c25447BNm.A06;
            if (!C14360o3.A0K(AbstractC166997dE.A0Y(userSession), user)) {
                CLP.A00(AbstractC25229BEm.A0M(this.A01), c26053Bfg, userSession, user.Bhu(), c57, this.A06, user.getUsername(), user.getId(), c25447BNm.A05.A06());
                return C0eB.A00;
            }
        }
        this.A03.A0A.invoke(user, obj2);
        return C0eB.A00;
    }
}
