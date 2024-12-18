package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class TIM implements Appendable {
    public int A00;
    public int A01;
    public final List A02;

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.A02.add(charSequence);
        this.A00 += charSequence.length();
        return this;
    }

    public final String toString() {
        List list = this.A02;
        return new TIR(list, this.A01, list.size(), this.A00).toString();
    }

    public TIM(int i) {
        this.A02 = AbstractC25225BEi.A17(i);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence.subSequence(i, i2));
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        append(new TIP(c));
        return this;
    }
}
