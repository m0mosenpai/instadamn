package X;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import java.util.Date;

/* renamed from: X.0bA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07900bA {
    public static Spanned A00(Resources resources, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (!(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Date) && !(obj instanceof Character)) {
                obj = Html.escapeHtml(obj.toString());
            }
            objArr2[i2] = obj;
        }
        return Html.fromHtml(resources.getString(i, objArr2));
    }

    public static Spanned A01(Resources resources, String[] strArr, int i) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr2[i2] = Html.escapeHtml(strArr[i2]);
        }
        String string = resources.getString(i, strArr2);
        if (string == null) {
            string = "";
        }
        return Html.fromHtml(string);
    }

    public static Spanned A02(Resources resources, String[] strArr, int i, int i2) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr2[i3] = Html.escapeHtml(strArr[i3]);
        }
        String quantityString = resources.getQuantityString(i, i2, strArr2);
        if (quantityString == null) {
            quantityString = "";
        }
        return Html.fromHtml(quantityString);
    }
}
