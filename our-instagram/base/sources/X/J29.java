package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class J29 implements InterfaceC64122vX {
    public final C41133IIy A00;

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
        C19280xC A00;
        String str2;
        FollowStatus followStatus;
        JPW jpw = (JPW) obj;
        CPC cpc = (CPC) obj2;
        AbstractC167027dH.A12(jpw, cpc, c82383m1);
        C105824pt AiE = jpw.AiE();
        C41133IIy c41133IIy = this.A00;
        if (AiE == null) {
            C38321qM BQN = jpw.BQN();
            C82713mZ c82713mZ = new C82713mZ(c41133IIy.A01, c41133IIy.A03);
            UserSession userSession = c41133IIy.A00;
            c82713mZ.A0G(userSession, BQN);
            A00 = c82713mZ.A00();
            C38321qM BQN2 = jpw.BQN();
            String str3 = c41133IIy.A04;
            String A01 = AbstractC58357Ptx.A01(0, 10, 6);
            if (str3 != null) {
                A00.A0C(A01, str3);
            }
            AbstractC131945xU.A00(A00, c82383m1);
            A00.A08(Integer.valueOf(cpc.A00), "m_ix");
            A00.A09("client_sub_impression", Boolean.valueOf(!c41133IIy.A02.A02(BQN2.getId())));
            Parcelable.Creator creator = User.CREATOR;
            User A2E = BQN2.A2E(userSession);
            if (A2E != null) {
                followStatus = A2E.B7L();
            } else {
                followStatus = null;
            }
            A00.A0C("follow_status", AbstractC38851rI.A06(followStatus));
            str2 = "nav_chain";
        } else {
            C82713mZ c82713mZ2 = new C82713mZ(c41133IIy.A01, c41133IIy.A03);
            c82713mZ2.A0M(AiE);
            A00 = c82713mZ2.A00();
            String str4 = c41133IIy.A04;
            String A012 = AbstractC58357Ptx.A01(0, 10, 6);
            if (str4 != null) {
                A00.A0C(A012, str4);
            }
            AbstractC131945xU.A00(A00, c82383m1);
            A00.A08(Integer.valueOf(cpc.A00), "m_ix");
            A00.A0C("nav_chain", str);
            A00.A09("client_sub_impression", Boolean.valueOf(!c41133IIy.A02.A02(AiE.getId())));
            Parcelable.Creator creator2 = User.CREATOR;
            User user = AiE.A09;
            user.getClass();
            str = AbstractC38851rI.A06(user.B7L());
            str2 = "follow_status";
        }
        A00.A0C(str2, str);
        A00.A08(24, "imp_logger_ver");
        return A00;
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
        C19280xC c19280xC = (C19280xC) obj;
        C14360o3.A0B(c19280xC, 0);
        return c19280xC;
    }

    public J29(C41133IIy c41133IIy) {
        this.A00 = c41133IIy;
    }
}
