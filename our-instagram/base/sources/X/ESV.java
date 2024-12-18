package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ESV extends C1P1 {
    public String A00;
    public final UserSession A01;

    public ESV(UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1464613762);
        int A032 = C0f9.A03(1138591808);
        AbstractC25651Mw.A00(this.A01).E4s(new C71M(((EB9) obj).A00, this.A00));
        C0f9.A0A(1030550540, A032);
        C0f9.A0A(2077553248, A03);
    }
}
