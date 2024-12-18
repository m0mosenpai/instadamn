package X;

import java.util.List;

/* renamed from: X.Irz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42520Irz implements InterfaceC38381qS {
    public C41232IMx A00;
    public final C38650Gyr A01;

    public final C41232IMx A00() {
        C41232IMx c41232IMx = this.A00;
        if (c41232IMx == null) {
            List list = this.A01.A0B;
            if (list != null) {
                c41232IMx = new C41232IMx((H6V) AbstractC001800i.A0I(list));
            } else {
                c41232IMx = null;
            }
            this.A00 = c41232IMx;
        }
        C14360o3.A0C(c41232IMx, "null cannot be cast to non-null type com.instagram.genericsurvey.model.base.SurveyQuestion");
        return c41232IMx;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0K;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A01.A03;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        InterfaceC39571se interfaceC39571se = this.A01.A00;
        if (interfaceC39571se != null) {
            return interfaceC39571se.Eyq();
        }
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        String str = this.A01.A09;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A01.A04;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A01.A06;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C42520Irz(C38650Gyr c38650Gyr) {
        this.A01 = c38650Gyr;
    }
}
