package X;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.List;

/* loaded from: classes10.dex */
public final class TIR implements CharSequence, Formattable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;

    private void A00(StringBuilder sb) {
        for (int i = this.A02; i < this.A00; i++) {
            CharSequence A0i = AbstractC58321PtD.A0i(this.A03, i);
            if (A0i instanceof TIR) {
                ((TIR) A0i).A00(sb);
            } else {
                sb.append(A0i);
            }
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A01;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder A0q = AbstractC58318PtA.A0q(this.A01);
        A00(A0q);
        return A0q.toString();
    }

    public TIR(List list, int i, int i2, int i3) {
        this.A03 = list;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.util.Formattable
    public final void formatTo(Formatter formatter, int i, int i2, int i3) {
        try {
            formatter.out().append(this);
        } catch (IOException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
