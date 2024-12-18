package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.JjL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44382JjL extends InputFilter.LengthFilter {
    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AbstractC167007dF.A1E(charSequence, 0, spanned);
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt != '/') {
                A1C.append(charAt);
            }
        }
        return super.filter(A1C, i, i2, spanned, i3, i4);
    }
}
