package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GP1 implements Runnable {
    public final /* synthetic */ C455127l A00;
    public final /* synthetic */ String A01;

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = C2OG.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (fragmentActivity == null) {
            Object A00 = AbstractC54852fj.A00();
            if (A00 instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) A00;
            }
        }
        UserSession userSession = this.A00.A02;
        C461529z.A06(fragmentActivity, userSession);
        String str = this.A01;
        AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
        C14360o3.A0B(userSession, 0);
        AbstractC31177DnL.A1M(AbstractC31174DnI.A0e(userSession, anonymousClass282), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", str, true);
    }

    public GP1(C455127l c455127l, String str) {
        this.A00 = c455127l;
        this.A01 = str;
    }
}
