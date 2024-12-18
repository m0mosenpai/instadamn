package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Duf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31613Duf extends AbstractC60592pi {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C31613Duf(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        if (i == 14167 && i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
            boolean z = extras.getBoolean("is_icebreaker_added");
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            int i3 = 2131959396;
            if (z) {
                i3 = 2131959395;
            }
            C14360o3.A0B(fragmentActivity, 1);
            G9A g9a = new G9A(8, fragmentActivity, userSession);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(fragmentActivity, A0K, i3);
            AbstractC31175DnJ.A0l(fragmentActivity, A0K, 2131959397);
            A0K.A06();
            A0K.A0A(g9a);
            A0K.A0L = true;
            AbstractC25233BEq.A1F(A0K);
        }
    }
}
