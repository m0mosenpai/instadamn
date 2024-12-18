package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N9W extends C1P1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public N9W(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1833288280);
        String A01 = AbstractC172137li.A01(abstractC115105If);
        Activity activity = this.A00;
        if (A01 == null || A01.length() == 0) {
            A01 = AbstractC166997dE.A0p(activity, 2131961896);
        }
        C9GR.A09(activity, A01);
        C0f9.A0A(221850661, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1048475728);
        N3N n3n = (N3N) obj;
        int A032 = C0f9.A03(-1123859966);
        C14360o3.A0B(n3n, 0);
        UserSession userSession = this.A01;
        C1DW.A00(userSession).A01(n3n.A00(), true, false).AEH(userSession);
        C0f9.A0A(-1939028117, A032);
        C0f9.A0A(-494041922, A03);
    }
}
