package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GB8 implements GY7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;

    public GB8(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        this.A02 = z;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.GY7
    public final void onFinished() {
        boolean z = this.A02;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C19270xB c19270xB = AbstractC34919Fa5.A00;
        if (z) {
            AbstractC31525Dt9.A07(fragmentActivity, null, c19270xB, userSession, AbstractC31171DnF.A01(), false, false, false, true);
        } else {
            AbstractC31525Dt9.A08(fragmentActivity, c19270xB, userSession);
        }
    }
}
