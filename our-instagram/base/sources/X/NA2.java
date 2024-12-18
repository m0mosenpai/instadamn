package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NA2 extends C1P1 {
    public final UserSession A00;
    public final C154796xU A01;
    public final C154276wc A02;
    public final C37494GfC A03;

    public NA2(UserSession userSession, C154796xU c154796xU, C154276wc c154276wc, C37494GfC c37494GfC) {
        AbstractC167017dG.A1P(userSession, c154796xU);
        this.A00 = userSession;
        this.A01 = c154796xU;
        this.A02 = c154276wc;
        this.A03 = c37494GfC;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1022975439);
        this.A01.A03.A00(C05F.A01);
        C154276wc c154276wc = this.A02;
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null) {
            A01 = new Throwable("Unknown error has occurred when fetching Profile Timeline via GraphQL");
        }
        c154276wc.onFail(new C115095Ie(A01));
        C0f9.A0A(-985270725, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1148347186);
        this.A02.onFinish();
        C0f9.A0A(781518849, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1950334214);
        this.A01.A03.A00(C05F.A00);
        this.A02.onStart();
        C0f9.A0A(-801077923, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-589193703);
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass436, -69311099);
        C37494GfC c37494GfC = this.A03;
        if (c37494GfC != null) {
            c37494GfC.A0E("profile_on_data_bg");
            c37494GfC.A0E("profile_graphql_model_conversion_start");
        }
        C123645id A00 = AbstractC37979GnM.A00(anonymousClass436, this.A00);
        if (c37494GfC != null) {
            c37494GfC.A0E("profile_graphql_model_conversion_end");
        }
        C11T.A02(new PR7(this, A00));
        C0f9.A0A(-135476817, A0N);
        C0f9.A0A(-1143116848, A03);
    }
}
