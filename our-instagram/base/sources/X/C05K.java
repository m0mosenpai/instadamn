package X;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* renamed from: X.05K, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C05K {
    public static void A00(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            C05J.A00(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 > i3) {
            i3 = i2;
        }
        int length = charSequence.length();
        if (i2 >= 0 && i3 <= length && (i = editorInfo.inputType & 4095) != 129 && i != 225 && i != 18) {
            if (length <= 2048) {
                A01(editorInfo, charSequence, i2, i3);
                return;
            }
            int i4 = i3 - i2;
            int i5 = i4;
            if (i4 > 1024) {
                i5 = 0;
            }
            int i6 = 2048 - i5;
            int min = Math.min(charSequence.length() - i3, i6 - Math.min(i2, (int) (i6 * 0.8d)));
            int min2 = Math.min(i2, i6 - min);
            int i7 = i2 - min2;
            if (Character.isLowSurrogate(charSequence.charAt(i7))) {
                i7++;
                min2--;
            }
            if (Character.isHighSurrogate(charSequence.charAt((i3 + min) - 1))) {
                min--;
            }
            int i8 = min2 + i5;
            int i9 = i8 + min;
            if (i5 != i4) {
                subSequence = TextUtils.concat(charSequence.subSequence(i7, i7 + min2), charSequence.subSequence(i3, min + i3));
            } else {
                subSequence = charSequence.subSequence(i7, i9 + i7);
            }
            A01(editorInfo, subSequence, min2, i8);
            return;
        }
        A01(editorInfo, null, 0, 0);
    }

    public static void A01(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
