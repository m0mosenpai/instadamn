package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.Sgy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63297Sgy {
    public final BreakIterator A00;
    public final int A01;
    public final int A02;
    public final CharSequence A03;

    public C63297Sgy(CharSequence charSequence, Locale locale, int i) {
        this.A03 = charSequence;
        if (0 <= charSequence.length()) {
            if (i >= 0 && i <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.A00 = wordInstance;
                this.A02 = Math.max(0, -50);
                this.A01 = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new TS6(charSequence, i));
                return;
            }
            throw AbstractC166987dD.A12("input end index is outside the CharSequence");
        }
        throw AbstractC166987dD.A12("input start index is outside the CharSequence");
    }

    public static final void A00(C63297Sgy c63297Sgy, int i) {
        int i2 = c63297Sgy.A02;
        int i3 = c63297Sgy.A01;
        if (i <= i3 && i2 <= i) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Invalid offset: ");
        A1C.append(i);
        A1C.append(". Valid range is [");
        A1C.append(i2);
        A1C.append(" , ");
        A1C.append(i3);
        throw AbstractC166987dD.A12(AbstractC58320PtC.A14(A1C));
    }

    public static final boolean A01(C63297Sgy c63297Sgy, int i) {
        int i2 = c63297Sgy.A02 + 1;
        if (i <= c63297Sgy.A01 && i2 <= i && Character.isLetterOrDigit(Character.codePointBefore(c63297Sgy.A03, i))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C63297Sgy c63297Sgy, int i) {
        int i2 = c63297Sgy.A02;
        if (i < c63297Sgy.A01 && i2 <= i && Character.isLetterOrDigit(Character.codePointAt(c63297Sgy.A03, i))) {
            return true;
        }
        return false;
    }

    public final boolean A03(int i) {
        int i2 = this.A02 + 1;
        if (i > this.A01 || i2 > i) {
            return false;
        }
        return AbstractC61623Rqn.A00(Character.codePointBefore(this.A03, i));
    }

    public final boolean A04(int i) {
        int i2 = this.A02;
        if (i >= this.A01 || i2 > i) {
            return false;
        }
        return AbstractC61623Rqn.A00(Character.codePointAt(this.A03, i));
    }
}
