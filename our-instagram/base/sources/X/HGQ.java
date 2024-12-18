package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HGQ extends C1P1 {
    public final C1P1 A00;
    public final C38321qM A01;
    public final String A02 = "approve";
    public final /* synthetic */ C41138IJd A03;

    public HGQ(C1P1 c1p1, C38321qM c38321qM, C41138IJd c41138IJd) {
        this.A03 = c41138IJd;
        this.A01 = c38321qM;
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1985534818);
        C9GR.A0F(this.A03.A00.requireContext(), "people_tagging_modify_photos_of_you_failure", 2131969526);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFail(abstractC115105If);
        }
        C0f9.A0A(441072151, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(727615957);
        this.A03.A05.decrementAndGet();
        C0f9.A0A(1150987493, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-474743713);
        int A032 = C0f9.A03(-1780533028);
        super.onSuccess(obj);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        C0f9.A0A(595661695, A032);
        C0f9.A0A(1693726288, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-984012355);
        int A032 = C0f9.A03(-551539366);
        C38321qM c38321qM = this.A01;
        boolean equals = this.A02.equals("approve");
        c38321qM.A0C.Eak(Boolean.valueOf(equals));
        UserSession userSession = this.A03.A03;
        c38321qM.AEH(userSession);
        if (equals) {
            AbstractC25651Mw.A00(userSession).E4s(new Object());
        }
        C0f9.A0A(-1986979828, A032);
        C0f9.A0A(-2065845023, A03);
    }
}
