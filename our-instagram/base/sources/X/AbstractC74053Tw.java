package X;

import android.content.res.Resources;
import com.facebook.R;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.3Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74053Tw {
    public static final String A00(Resources resources, int i) {
        C14360o3.A0B(resources, 0);
        String quantityString = resources.getQuantityString(R.plurals.number_of_likes, i, NumberFormat.getInstance(Locale.getDefault()).format(i));
        C14360o3.A07(quantityString);
        return quantityString;
    }

    public static final String A01(Resources resources, Integer num) {
        int intValue;
        C14360o3.A0B(resources, 0);
        if (num != null && (intValue = num.intValue()) >= 0) {
            String quantityString = resources.getQuantityString(R.plurals.number_of_views, intValue, C84963qk.A04(resources, num, 10000, false, false));
            C14360o3.A0A(quantityString);
            return quantityString;
        }
        throw new UnsupportedOperationException(AbstractC111324zv.A00(292));
    }

    public static final String A02(Resources resources, Integer num) {
        int intValue;
        String quantityString;
        C14360o3.A0B(resources, 0);
        if (num != null && (intValue = num.intValue()) >= 0) {
            if (intValue == 0) {
                quantityString = resources.getString(2131968585);
            } else {
                quantityString = resources.getQuantityString(R.plurals.number_of_plays, intValue, NumberFormat.getInstance().format(num));
            }
            C14360o3.A0A(quantityString);
            return quantityString;
        }
        throw new UnsupportedOperationException(AbstractC111324zv.A00(292));
    }

    public static final String A03(Resources resources, Integer num, int i) {
        int intValue;
        String quantityString;
        C14360o3.A0B(resources, 1);
        if (num != null && (intValue = num.intValue()) >= 0) {
            if (intValue == 0) {
                quantityString = resources.getString(i);
            } else {
                quantityString = resources.getQuantityString(R.plurals.number_of_views, intValue, NumberFormat.getInstance().format(num));
            }
            C14360o3.A0A(quantityString);
            return quantityString;
        }
        throw new UnsupportedOperationException(AbstractC111324zv.A00(292));
    }

    public static final boolean A04(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return false;
        }
        Iterable A0C = C17s.A0C(0, length);
        if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                if (!Character.isDigit(str.charAt(((AbstractC16880sg) it).A00()))) {
                    return false;
                }
            }
        }
        return true;
    }
}
