package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Los, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC49175Los implements InterfaceC50437MOr {
    public static final C7QY A00(Context context, C7QX c7qx, C7QL c7ql, EnumC910243u enumC910243u, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, String str, String str2, String str3, int i) {
        String str4 = str;
        C14360o3.A0B(c7ql, 4);
        C14360o3.A0B(c7qx, 5);
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(null, interfaceC50520MRx.BSx(i), null);
        C16930sl c16930sl = C16930sl.A00;
        String str5 = "";
        if (str == null) {
            str4 = "";
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_instagram_pano_outline_24);
        if (drawable != null) {
            drawable.mutate().setTint(context.getColor(AbstractC53242c7.A05(context)));
        } else {
            drawable = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{AbstractC167007dF.A09(context, R.attr.igds_color_gradient_purple), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_lavender), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_pink), context.getColor(R.color.activator_card_progress_bad), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_yellow)});
        Integer valueOf = Integer.valueOf(R.dimen.abc_button_inset_vertical_material);
        C1583678w c1583678w = new C1583678w(drawable, gradientDrawable, str4, str2, valueOf, valueOf, valueOf, valueOf, Integer.valueOf(R.dimen.abc_action_bar_elevation_material), null, c16930sl);
        if (str3 != null) {
            str5 = str3;
        }
        String str6 = messagingUser.A03;
        C14360o3.A07(str6);
        return new C7QY(null, null, null, new C9C9(str5, str6, 5), null, null, null, null, c7qx, c7ql, null, c1583678w, null, null, null, null, enumC910243u, null, directMessageIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }
}
