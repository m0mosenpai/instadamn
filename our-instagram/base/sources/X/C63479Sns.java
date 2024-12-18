package X;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

/* renamed from: X.Sns, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63479Sns implements InputFilter {
    public static final C63479Sns A00 = new C63479Sns();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (int i5 = i; i5 < i2; i5++) {
            if (Character.isUpperCase(charSequence.charAt(i5))) {
                char[] cArr = new char[i2 - i];
                TextUtils.getChars(charSequence, i, i2, cArr, 0);
                String A16 = AbstractC31172DnG.A16(C1Q2.A02(), new String(cArr));
                if (charSequence instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(A16);
                    TextUtils.copySpansFrom((Spanned) charSequence, i, i2, Object.class, spannableString, 0);
                    return spannableString;
                }
                return A16;
            }
        }
        return null;
    }
}
