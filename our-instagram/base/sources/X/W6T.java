package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class W6T {
    public static final ArrayList A01(Context context) {
        ArrayList arrayList = new ArrayList();
        C69206VjZ A00 = A00(context, VD4.A02, R.drawable.powerup_confetti_1);
        if (A00 != null) {
            arrayList.add(A00);
        }
        C69206VjZ A002 = A00(context, VD4.A03, R.drawable.powerup_confetti_2);
        if (A002 != null) {
            arrayList.add(A002);
        }
        C69206VjZ A003 = A00(context, VD4.A04, R.drawable.powerup_confetti_3);
        if (A003 != null) {
            arrayList.add(A003);
        }
        C69206VjZ A004 = A00(context, VD4.A05, R.drawable.powerup_confetti_4);
        if (A004 != null) {
            arrayList.add(A004);
        }
        C69206VjZ A005 = A00(context, VD4.A07, R.drawable.powerup_confetti_5);
        if (A005 != null) {
            arrayList.add(A005);
        }
        return arrayList;
    }

    public static final List A02(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        List<ColorFilter> A1Q = AbstractC16960so.A1Q(new PorterDuffColorFilter(Color.rgb(255, 215, 0), mode), new PorterDuffColorFilter(Color.rgb(255, 122, 0), mode), new PorterDuffColorFilter(Color.rgb(255, 0, 105), mode), new PorterDuffColorFilter(Color.rgb(211, 0, 197), mode), new PorterDuffColorFilter(Color.rgb(118, 56, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), mode));
        ArrayList A0q = AbstractC167017dG.A0q(A1Q);
        for (ColorFilter colorFilter : A1Q) {
            Paint paint = new Paint(6);
            paint.setColorFilter(colorFilter);
            paint.setAlpha(i);
            A0q.add(paint);
        }
        return A0q;
    }

    public static final C69206VjZ A00(Context context, VD4 vd4, int i) {
        Resources resources = context.getResources();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            VD4 vd42 = VD4.A02;
            C14360o3.A0A(resources);
            C68925VeP c68925VeP = new C68925VeP(AbstractC46577KjG.A00(resources, drawable, 1), new int[]{0});
            if (vd4 == vd42) {
                return new C69206VjZ(c68925VeP, vd42);
            }
            return new C69206VjZ(c68925VeP, vd4);
        }
        return null;
    }
}
