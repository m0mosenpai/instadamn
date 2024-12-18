package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.Snq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63477Snq implements InputFilter {
    public final InterfaceC16820sZ A00;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        if (spanned != null) {
            i5 = spanned.length();
        } else {
            i5 = 0;
        }
        int i6 = 21 - (i5 - (i4 - i3));
        if (i6 <= 0) {
            this.A00.invoke();
            return "";
        }
        if (i6 >= i2 - i || charSequence == null) {
            return null;
        }
        int i7 = i6 + i;
        int i8 = i7 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i8))) {
            i7 = i8;
            if (i8 == i) {
                this.A00.invoke();
                return "";
            }
        }
        return charSequence.subSequence(i, i7);
    }

    public C63477Snq(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
