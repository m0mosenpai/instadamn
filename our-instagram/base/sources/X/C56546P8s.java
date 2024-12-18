package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.P8s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56546P8s implements InterfaceC58059Pok {
    public final /* synthetic */ N7M A00;

    @Override // X.InterfaceC58059Pok
    public final void DXl(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        N7M n7m = this.A00;
        List A00 = ((C51158Mj1) n7m.A07.getValue()).A00();
        C38E c38e = (C38E) n7m.A0G.getValue();
        c38e.A05 = (AbstractC140596Xn) n7m.A08.getValue();
        c38e.A0C = AbstractC25225BEi.A15(n7m.A0K);
        c38e.A03 = (ReelViewerConfig) AbstractC166987dD.A17(n7m.A0F);
        c38e.A0A(reel, C3G2.A0U, gradientSpinnerAvatarView, null, A00, A00);
        OUO ouo = (OUO) n7m.A0C.getValue();
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            String id = c1nb.getId();
            C14360o3.A0B(id, 0);
            OUO.A00(ouo, "pog_tap", id);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C56546P8s(N7M n7m) {
        this.A00 = n7m;
    }

    @Override // X.InterfaceC58059Pok
    public final void DF7(String str) {
        N7M.A02(this.A00, str);
    }
}
