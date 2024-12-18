package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* loaded from: classes6.dex */
public final class E3W extends C3OO {
    public final View A00;
    public final TextView A01;
    public final InterfaceC11380iw A02;
    public final ReelAvatarWithBadgeView A03;
    public final AnonymousClass172 A04;
    public final InterfaceC16660sJ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3W(View view, InterfaceC11380iw interfaceC11380iw, AnonymousClass172 anonymousClass172, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        AbstractC25233BEq.A0w(1, anonymousClass172, interfaceC16660sJ, interfaceC11380iw);
        this.A04 = anonymousClass172;
        this.A00 = view;
        this.A05 = interfaceC16660sJ;
        this.A02 = interfaceC11380iw;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) AbstractC166997dE.A0R(view, R.id.direct_recipient_pog_avatar);
        this.A03 = reelAvatarWithBadgeView;
        this.A01 = AbstractC167007dF.A0N(view, R.id.direct_recipient_pog_name);
        Context context = reelAvatarWithBadgeView.getContext();
        Resources resources = context.getResources();
        Drawable A05 = C3LQ.A05(context, R.drawable.instagram_circle_x_pano_filled_24, AbstractC167007dF.A09(context, R.attr.glyphColorPrimary));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.activation_card_icon_container_width);
        reelAvatarWithBadgeView.A02(A05, dimensionPixelSize);
        int i = dimensionPixelSize / 2;
        reelAvatarWithBadgeView.setBadgeOffsetX(i);
        reelAvatarWithBadgeView.setBadgeOffsetY(dimensionPixelSize2 - i);
        reelAvatarWithBadgeView.setFrontAvatarPunchRadius(resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        reelAvatarWithBadgeView.setFrontAvatarPunchOffsetY((-dimensionPixelSize2) + i);
        reelAvatarWithBadgeView.setFrontAvatarPunchOffsetX((-dimensionPixelSize) / 2);
    }
}
