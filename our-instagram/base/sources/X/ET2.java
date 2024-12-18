package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ET2 extends C1P1 {
    public final UserSession A00;
    public final C31823Dyh A01;

    public ET2(UserSession userSession, C31823Dyh c31823Dyh) {
        C14360o3.A0B(userSession, 2);
        this.A01 = c31823Dyh;
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1473617175);
        super.onFail(abstractC115105If);
        this.A01.A00(this.A00, null);
        C0f9.A0A(99698242, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1875883995);
        int A0N = AbstractC167017dG.A0N(obj, -858777060);
        super.onSuccess(obj);
        this.A01.A00(this.A00, null);
        C0f9.A0A(-1170103581, A0N);
        C0f9.A0A(1237373394, A03);
    }
}
