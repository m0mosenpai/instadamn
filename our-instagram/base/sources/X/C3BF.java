package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.3BF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BF {
    public static final int A00(C69453Af c69453Af, C60862qA c60862qA) {
        C14360o3.A0B(c60862qA, 1);
        C5GM c5gm = c60862qA.A00.A0C;
        int i = 0;
        if (c5gm != null) {
            i = 1;
        }
        if (!C1OU.A04(c69453Af.A0O.A07).A0U(false).isEmpty()) {
            return i + 1;
        }
        return i;
    }

    public final int A01(Context context, C60862qA c60862qA, int i) {
        int i2;
        int A00 = C3HB.A00(context) + i;
        if (c60862qA.A00.A0T) {
            i2 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        } else {
            i2 = 0;
        }
        return A00 + i2;
    }
}
