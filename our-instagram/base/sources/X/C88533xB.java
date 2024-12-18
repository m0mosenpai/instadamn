package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88533xB implements InterfaceC38371qR, InterfaceC38381qS {
    public final C88523xA A00;

    public C88533xB(C88523xA c88523xA) {
        C38321qM c38321qM;
        C38321qM c38321qM2;
        this.A00 = c88523xA;
        C38321qM c38321qM3 = c88523xA.A02;
        if (c38321qM3 != null) {
            String str = c88523xA.A0C;
            if (str != null) {
                c38321qM3.A0C.EWK(str);
            }
            String str2 = c88523xA.A0A;
            if (str2 != null) {
                c38321qM3.A0C.EUQ(str2);
            }
            List list = c88523xA.A0F;
            if (list != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                for (Object obj : list) {
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.api.schemas.FeedRecsHideReasonImpl");
                    arrayList.add(obj);
                }
                c38321qM3.A0S = arrayList;
            }
            C88523xA c88523xA2 = this.A00;
            Boolean bool = c88523xA2.A05;
            if (bool != null && (c38321qM2 = c88523xA2.A02) != null) {
                c38321qM2.A0C.ETu(bool);
            }
            C88523xA c88523xA3 = this.A00;
            String str3 = c88523xA3.A0D;
            if (str3 != null && (c38321qM = c88523xA3.A02) != null) {
                c38321qM.A0C.EZE(str3);
            }
            C88523xA c88523xA4 = this.A00;
            C38321qM c38321qM4 = c88523xA4.A02;
            if (c38321qM4 != null) {
                c38321qM4.A0C.EdM(Boolean.valueOf(C14360o3.A0K(c88523xA4.A06, true)));
            }
            C38321qM c38321qM5 = this.A00.A02;
            if (c38321qM5 != null) {
                c38321qM5.A0C.EQ9(true);
            }
        }
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ String BzL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return BQN().A33();
    }

    @Override // X.C1NI
    public final /* synthetic */ boolean CW9() {
        return IQT.A00(this);
    }

    @Override // X.C1NI
    public final /* synthetic */ boolean CZq() {
        return IQT.A01(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
            return false;
        }
        getId();
        return C14360o3.A0K(getId(), ((C88533xB) obj).getId());
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0H;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A00.A08;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            return c38321qM;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            return c38321qM.CAR();
        }
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A00.A09;
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A00.A0B;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ boolean CdW() {
        return BQN().CdW();
    }

    public final int hashCode() {
        return getId().hashCode();
    }
}
