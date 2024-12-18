package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Fn2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35550Fn2 implements View.OnClickListener {
    public final /* synthetic */ C2EE A00;
    public final /* synthetic */ AAK A01;

    public ViewOnClickListenerC35550Fn2(C2EE c2ee, AAK aak) {
        this.A01 = aak;
        this.A00 = c2ee;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC31602DuU kWi;
        int A05 = C0f9.A05(-1854271828);
        AnonymousClass981 anonymousClass981 = this.A01.A07;
        C2EE c2ee = this.A00;
        Fragment fragment = anonymousClass981.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        FragmentActivity requireActivity2 = fragment.requireActivity();
        UserSession userSession = anonymousClass981.A02;
        if (!C35244Fgd.A03(requireActivity2, requireActivity, anonymousClass981.A01, userSession, null, c2ee.C7C(), false)) {
            if (c2ee.BKb() instanceof DirectThreadKey) {
                FragmentActivity requireActivity3 = fragment.requireActivity();
                AbstractC167017dG.A1N(requireActivity3, userSession);
                kWi = new C31605DuX(requireActivity3, userSession);
            } else {
                kWi = new KWi(fragment.requireActivity(), userSession);
            }
            kWi.A02(c2ee.BKb(), C05F.A01);
        }
        C0f9.A0C(-135752241, A05);
    }
}
