package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Ib2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41612Ib2 {
    public static final C41612Ib2 A00 = new Object();

    public final Drawable A00(Context context) {
        int i;
        switch ((AbstractC50712Us.A01.A03() % 9) % 9) {
            case 0:
                i = R.drawable.heart_gradient_1;
                break;
            case 1:
                i = R.drawable.heart_gradient_2;
                break;
            case 2:
                i = R.drawable.heart_gradient_3;
                break;
            case 3:
                i = R.drawable.heart_gradient_4;
                break;
            case 4:
                i = R.drawable.heart_gradient_5;
                break;
            case 5:
                i = R.drawable.heart_gradient_6;
                break;
            case 6:
                i = R.drawable.heart_gradient_7;
                break;
            case 7:
                i = R.drawable.heart_gradient_8;
                break;
            default:
                i = R.drawable.heart_gradient_9;
                break;
        }
        return context.getDrawable(i);
    }
}
