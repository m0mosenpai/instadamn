package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PTP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;

    public PTP(View view, FragmentActivity fragmentActivity, UserSession userSession, int i) {
        this.A02 = fragmentActivity;
        this.A00 = i;
        this.A01 = view;
        this.A03 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A02;
        C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, fragmentActivity.getString(this.A00));
        A0f.A03(this.A01);
        A0f.A01();
        A0f.A0B = true;
        A0f.A0A = true;
        UserSession userSession = this.A03;
        A0f.A04 = new EfP(userSession, 18);
        A0f.A00().A07(userSession);
    }
}
