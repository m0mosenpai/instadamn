package X;

/* loaded from: classes10.dex */
public final class TIL implements Appendable {
    public boolean A00 = true;
    public final Appendable A01;

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        boolean z = false;
        if (this.A00) {
            this.A00 = false;
            this.A01.append("  ");
        }
        if (c == '\n') {
            z = true;
        }
        this.A00 = z;
        this.A01.append(c);
        return this;
    }

    public TIL(Appendable appendable) {
        this.A01 = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = false;
        if (this.A00) {
            this.A00 = false;
            this.A01.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.A00 = z;
        this.A01.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
