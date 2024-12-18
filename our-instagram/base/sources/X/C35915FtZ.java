package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FtZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35915FtZ implements GXF {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ EVW A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ UserSession A04;

    public C35915FtZ(FragmentActivity fragmentActivity, EVW evw, C6FQ c6fq, C102884kP c102884kP, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = c102884kP;
        this.A02 = c6fq;
        this.A01 = evw;
        this.A00 = fragmentActivity;
    }

    @Override // X.GXF
    public final void DgR(C3G2 c3g2, List list) {
        if (!list.isEmpty()) {
            String id = AbstractC25225BEi.A0x(list, 0).getId();
            C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
            UserSession userSession = this.A04;
            User A2E = A0x.A2E(userSession);
            A2E.getClass();
            Reel A0J = C1OU.A04(userSession).A0J(new C1N9(A2E), id, list, AbstractC167007dF.A1X(c3g2, C3G2.A0N));
            C102884kP c102884kP = this.A03;
            C6FQ c6fq = this.A02;
            View A05 = c102884kP.A05(c6fq.A03);
            int[] iArr = new int[2];
            if (A05 != null) {
                A05.getLocationOnScreen(iArr);
            }
            EVW evw = this.A01;
            float f = iArr[0];
            float f2 = iArr[1];
            evw.A00(new RectF(f, f2, f, f2), this.A00, C6BQ.A08(c6fq), userSession, A0J, c3g2);
        }
    }
}
