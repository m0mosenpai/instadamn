package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.user.model.User;

/* renamed from: X.GPb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36932GPb implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;
    public final /* synthetic */ User A02;

    public RunnableC36932GPb(UserSession userSession, InstagramMainActivity instagramMainActivity, User user) {
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
        this.A02 = user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.53S, java.lang.Object, X.FtG] */
    @Override // java.lang.Runnable
    public final void run() {
        InstagramMainActivity instagramMainActivity = this.A01;
        if (instagramMainActivity.A09 != null) {
            instagramMainActivity.A02++;
            C31721DwQ A04 = AbstractC31364DqT.A02().A04("profile");
            Bundle bundle = A04.mArguments;
            if (bundle != null) {
                bundle.putBoolean("is_complete_your_profile", true);
            }
            UserSession userSession = this.A00;
            C70C c70c = instagramMainActivity.A0A;
            C70C c70c2 = c70c;
            if (c70c == null) {
                InstagramMainActivity instagramMainActivity2 = null;
                if (instagramMainActivity instanceof InterfaceC53892dT) {
                    instagramMainActivity2 = instagramMainActivity;
                }
                c70c2 = new C70C(instagramMainActivity, userSession, instagramMainActivity2);
            }
            instagramMainActivity.A0A = c70c2;
            c70c2.A03(A04, "edit_profile", false);
            c70c2.A01();
            c70c2.A02();
            String id = this.A02.getId();
            ?? obj = new Object();
            obj.A00 = id;
            c70c2.A04(obj);
            c70c2.A00();
        }
    }
}
