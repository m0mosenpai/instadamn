package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ADW {
    public static final int A01(Context context, UserSession userSession, List list, int i) {
        AbstractC167007dF.A1E(context, 0, userSession);
        int A04 = (int) (AbstractC167017dG.A04(context) * AbstractC172687md.A00(userSession));
        int A05 = AbstractC167017dG.A05(context);
        int A07 = (AbstractC13880nE.A07(context) - (((int) (context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin) * AbstractC172687md.A00(userSession))) * 2)) - A00(context, (Drawable) AbstractC001800i.A0O(list, i), userSession);
        int i2 = 1;
        int size = list.size();
        for (int i3 = i + 1; i3 < size; i3++) {
            A07 -= A00(context, (Drawable) AbstractC001800i.A0O(list, i3), userSession) + A04;
            if (A07 - A05 < 0 || i2 >= 8) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public static final int A00(Context context, Drawable drawable, UserSession userSession) {
        float f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                f = intrinsicWidth / intrinsicHeight;
                return (int) (((int) (context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * AbstractC172687md.A00(userSession))) * f);
            }
        }
        f = 2.2f;
        return (int) (((int) (context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * AbstractC172687md.A00(userSession))) * f);
    }
}
