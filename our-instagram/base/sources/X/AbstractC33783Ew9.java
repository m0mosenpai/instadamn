package X;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Ew9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33783Ew9 {
    public static final void A00(Context context, IgdsBanner igdsBanner, Integer num, Integer num2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3) {
        Drawable drawable;
        C14360o3.A0B(igdsBanner, 0);
        AbstractC167007dF.A1J(interfaceC16820sZ, 8, interfaceC16820sZ2);
        if (str != null && str.length() != 0) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC166987dD.A1N(context, shapeDrawable.getPaint(), R.color.blue_1);
            drawable = new C44306Jhx(context, shapeDrawable, null, str, R.dimen.action_bar_item_spacing_left, R.drawable.instagram_avatars_pano_filled_24, 0, 0, 880, false);
        } else {
            drawable = context.getDrawable(R.drawable.instagram_avatars_pano_filled_24);
            if (num2 != null && drawable != null) {
                int intValue = num2.intValue();
                drawable.setColorFilter(new LightingColorFilter(context.getColor(intValue), context.getColor(intValue)));
            }
        }
        igdsBanner.setIcon(drawable);
        AbstractC31172DnG.A1U(igdsBanner, AbstractC167027dH.A0P(context, i2), false);
        igdsBanner.setBodyColor(context.getColor(i));
        igdsBanner.setAction(AbstractC167027dH.A0P(context, i3));
        igdsBanner.setDismissible(true);
        igdsBanner.setDividerVisibility(1);
        if (num != null) {
            igdsBanner.setDividerColor(num.intValue());
        }
        igdsBanner.A00 = new C36498G7w(0, interfaceC16820sZ, interfaceC16820sZ2);
    }
}
