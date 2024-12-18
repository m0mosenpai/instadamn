package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.List;
import java.util.Queue;

/* renamed from: X.Lvw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49603Lvw implements InterfaceC125355lh {
    public final /* synthetic */ C47660L2t A00;
    public final /* synthetic */ LKK A01;
    public final /* synthetic */ String A02;

    public C49603Lvw(C47660L2t c47660L2t, LKK lkk, String str) {
        this.A01 = lkk;
        this.A00 = c47660L2t;
        this.A02 = str;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        LKK lkk = this.A01;
        C47660L2t c47660L2t = this.A00;
        ConstrainedImageView constrainedImageView = c47660L2t.A02;
        ConstrainedImageView constrainedImageView2 = c47660L2t.A03;
        String str = this.A02;
        LKK.A02(lkk, str, lkk.A03);
        C45059Jwo A02 = lkk.A0H.A02(str);
        if (A02 != null) {
            LES les = lkk.A0G;
            if (les != null) {
                List A1J = AbstractC166987dD.A1J(new C45115Jxk(constrainedImageView, constrainedImageView2, A02, str));
                Queue queue = les.A02;
                queue.clear();
                queue.addAll(AbstractC001800i.A0S(C0eM.A1H(AbstractC001800i.A0c(A1J, 1)), AbstractC001800i.A0d(A1J, 1)));
                LES.A00(les);
                return;
            }
            return;
        }
        constrainedImageView.setAlpha(1.0f);
        AbstractC125325le A0o = AbstractC43592JPx.A0o(constrainedImageView, 1);
        A0o.A0U(0.0f, 1.0f, -1.0f);
        A0o.A0V(0.0f, 1.0f, -1.0f);
        A0o.A0C(100L).A0H();
    }
}
