package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.EYx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32649EYx extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public C32649EYx(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        boolean A04 = AbstractC31248DoW.A04(this.A01);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        int i2 = R.layout.avatar_background_customization_grid_item;
        if (A04) {
            i2 = R.layout.avatar_background_customization_v2_grid_item;
        }
        return new C31936E1q(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i2, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32092E8q c32092E8q = (C32092E8q) interfaceC66482zP;
        C31936E1q c31936E1q = (C31936E1q) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c32092E8q, c31936E1q);
        CircularImageView circularImageView = c31936E1q.A01;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = c32092E8q.A00;
        circularImageView.setUrl(AbstractC25225BEi.A0t(avatarCoinFlipBackgroundOptionResponse.A01), this.A00);
        circularImageView.setContentDescription(avatarCoinFlipBackgroundOptionResponse.A00);
        c31936E1q.A00.setSelected(c32092E8q.A02);
        C3P9 c3p9 = new C3P9(circularImageView);
        c3p9.A04 = new EZQ(c32092E8q, A1a ? 1 : 0);
        c3p9.A00();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C31936E1q c31936E1q = (C31936E1q) c3oo;
        C14360o3.A0B(c31936E1q, 0);
        c31936E1q.A01.setImageDrawable(null);
        c31936E1q.A00.setSelected(false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32092E8q.class;
    }
}
