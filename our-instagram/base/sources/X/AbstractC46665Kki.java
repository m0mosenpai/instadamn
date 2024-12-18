package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kki, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46665Kki {
    public static final Drawable A00(Context context, String str, List list, int i, int i2) {
        Drawable A06 = C3LQ.A06(context, R.drawable.close_friends_star_60, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green));
        int color = context.getColor(R.color.grey_1);
        int i3 = i + (i2 * 2);
        InsetDrawable insetDrawable = new InsetDrawable(A06, i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        AbstractC166997dE.A1F(shapeDrawable, -1);
        LayerDrawable A0B = AbstractC43593JPy.A0B(shapeDrawable, insetDrawable);
        if (!list.isEmpty()) {
            ArrayList A1N = AbstractC16960so.A1N(A0B);
            int i4 = 0;
            while (i4 < list.size()) {
                A1N.add(new C89533yt((ImageUrl) AbstractC001800i.A0O(list, i4), str, i3, i2, -1, color));
                i4++;
                if (i4 >= 3) {
                    break;
                }
            }
            return new C89553yv(context, C05F.A00, A1N, 0.3f, i3, true);
        }
        return A0B;
    }
}
