package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.EYy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32650EYy extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;

    public C32650EYy(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31937E1r(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.avatar_pose_customization_v2_grid_item, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32093E8r c32093E8r = (C32093E8r) interfaceC66482zP;
        C31937E1r c31937E1r = (C31937E1r) c3oo;
        AbstractC167007dF.A1K(c32093E8r, c31937E1r);
        ProfileCoinFlipView profileCoinFlipView = c31937E1r.A00;
        UserSession userSession = this.A01;
        Context context = this.A00;
        C60492R0s c60492R0s = c32093E8r.A00;
        C74K.A02(context, profileCoinFlipView, userSession, false, String.valueOf(((C2JS) c60492R0s.A0E().get(0)).A09("cdn_url")), ((C2JS) c60492R0s.A0E().get(0)).getCoercedIntField(4, "margin_top") / ((C2JS) c60492R0s.A0E().get(0)).getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT), R.dimen.abc_list_item_height_large_material);
        profileCoinFlipView.setCircleBackgroundColor(AbstractC167007dF.A09(context, R.attr.igds_color_status_pill));
        c31937E1r.A01.setSelected(c32093E8r.A02);
        profileCoinFlipView.setContentDescription(((C2JS) c60492R0s.A0E().get(0)).getOptionalStringField(9, AbstractC111324zv.A00(96)));
        C3P9 c3p9 = new C3P9(profileCoinFlipView);
        c3p9.A04 = new EZQ(c32093E8r, 2);
        c3p9.A00();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C31937E1r c31937E1r = (C31937E1r) c3oo;
        C14360o3.A0B(c31937E1r, 0);
        c31937E1r.A00.setAvatarImageDrawable(null);
        c31937E1r.A01.setSelected(false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32093E8r.class;
    }
}
