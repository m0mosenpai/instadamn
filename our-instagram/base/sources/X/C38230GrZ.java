package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GrZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38230GrZ implements InterfaceC62702t9 {
    public final int A00;
    public final Object A01;

    public C38230GrZ(UserSession userSession, int i) {
        this.A00 = i;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        int i;
        StringBuilder A1C;
        String hexString;
        List list;
        C38321qM c38321qM;
        String str;
        int i2 = this.A00;
        C14360o3.A0B(c59062n7, 0);
        UserSession userSession = (UserSession) this.A01;
        Object obj = c59062n7.A03;
        C1NI c1ni = (C1NI) obj;
        if (i2 != 0) {
            String hexString2 = Integer.toHexString(AbstractC31177DnL.A04(AbstractC41071vF.A06(userSession, c1ni)));
            C120985dq c120985dq = (C120985dq) obj;
            if (c120985dq != null) {
                str = AbstractC25226BEj.A1E(c120985dq);
            } else {
                str = null;
            }
            return AnonymousClass001.A0g("multiads_", hexString2, str);
        }
        String A06 = AbstractC41071vF.A06(userSession, c1ni);
        C42C c42c = (C42C) c59062n7.A04;
        if (c42c != null) {
            i = c42c.A00;
        } else {
            i = -1;
        }
        C120985dq c120985dq2 = (C120985dq) obj;
        int i3 = 0;
        if (c120985dq2 != null && (list = c120985dq2.A0R) != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(list, i)) != null) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("carousel_");
            if (A06 != null) {
                i3 = A06.hashCode();
            }
            A1C.append(Integer.toHexString(i3));
            hexString = c38321qM.getId();
        } else {
            A1C = AbstractC166987dD.A1C();
            A1C.append("carousel_");
            if (A06 != null) {
                i3 = A06.hashCode();
            }
            hexString = Integer.toHexString(i3);
        }
        return AbstractC166997dE.A0x(hexString, A1C);
    }
}
