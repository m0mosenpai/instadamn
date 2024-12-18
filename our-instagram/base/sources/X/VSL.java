package X;

import android.content.res.Resources;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class VSL {
    public static final String A00(Resources resources, C69749Vuj c69749Vuj) {
        String string;
        C14360o3.A0B(c69749Vuj, 1);
        Object[] objArr = c69749Vuj.A01;
        int length = objArr.length;
        if (length == 0) {
            string = resources.getString(c69749Vuj.A00);
        } else {
            string = resources.getString(c69749Vuj.A00, Arrays.copyOf(objArr, length));
        }
        C14360o3.A0A(string);
        return string;
    }
}
