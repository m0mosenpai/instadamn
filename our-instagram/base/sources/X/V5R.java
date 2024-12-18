package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes11.dex */
public final class V5R extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;
    public final C189478aR A02;
    public final L5A A03;
    public final InterfaceC11380iw A04;

    public V5R(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C189478aR c189478aR, L5A l5a) {
        C14360o3.A0B(userSession, 5);
        this.A00 = context;
        this.A02 = c189478aR;
        this.A03 = l5a;
        this.A04 = interfaceC11380iw;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        IgImageView igImageView;
        Drawable c44306Jhx;
        AvatarMixedAttributionModel avatarMixedAttributionModel = (AvatarMixedAttributionModel) interfaceC66482zP;
        UJ6 uj6 = (UJ6) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, avatarMixedAttributionModel, uj6);
        int intValue = avatarMixedAttributionModel.A00.intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                C70996WmC c70996WmC = uj6.A02;
                GradientSpinner gradientSpinner = c70996WmC.A01;
                gradientSpinner.setVisibility(0);
                gradientSpinner.A06();
                c70996WmC.CMM();
                AbstractC68582VWj.A00(this.A00, this.A02, this.A03, uj6, avatarMixedAttributionModel);
            }
        } else {
            boolean A06 = C18U.A06(C06090Tz.A05, this.A01, 36322409573263579L);
            int i = R.drawable.instagram_facebook_avatars_filled_44;
            if (A06) {
                i = R.drawable.instagram_avatars_filled_44;
            }
            ImageUrl imageUrl = avatarMixedAttributionModel.A02;
            if (imageUrl != null) {
                igImageView = uj6.A02.A00;
                c44306Jhx = new C44306Jhx(this.A00, null, null, imageUrl.getUrl(), R.dimen.action_bar_item_spacing_left, i, 0, 0, 2032, false);
                igImageView.setImageDrawable(c44306Jhx);
                AbstractC68582VWj.A00(this.A00, this.A02, this.A03, uj6, avatarMixedAttributionModel);
            }
        }
        igImageView = uj6.A02.A00;
        Context context = this.A00;
        c44306Jhx = new C44349Jio(context, null, R.drawable.ig_avatar_assets_avatar_class_photo, AbstractC43594JPz.A03(context), 0);
        igImageView.setImageDrawable(c44306Jhx);
        AbstractC68582VWj.A00(this.A00, this.A02, this.A03, uj6, avatarMixedAttributionModel);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new UJ6(layoutInflater.inflate(R.layout.mixed_attribution_list_row, viewGroup, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AvatarMixedAttributionModel.class;
    }
}
