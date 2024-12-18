package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FtY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35914FtY implements GXF {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ EVW A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ UserSession A03;

    public C35914FtY(FragmentActivity fragmentActivity, EVW evw, C6FQ c6fq, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = evw;
        this.A00 = fragmentActivity;
        this.A02 = c6fq;
    }

    @Override // X.GXF
    public final void DgR(C3G2 c3g2, List list) {
        if (!list.isEmpty()) {
            boolean z = false;
            String id = AbstractC25225BEi.A0x(list, 0).getId();
            C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
            UserSession userSession = this.A03;
            User A2E = A0x.A2E(userSession);
            A2E.getClass();
            if (c3g2 == C3G2.A0N) {
                z = true;
            }
            this.A01.A00(new RectF(), this.A00, C6BQ.A08(this.A02), userSession, C1OU.A04(userSession).A0J(new C1N9(A2E), id, list, z), c3g2);
        }
    }
}
