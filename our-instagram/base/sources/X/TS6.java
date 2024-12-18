package X;

import java.text.CharacterIterator;

/* loaded from: classes10.dex */
public final class TS6 implements CharacterIterator {
    public int A00 = 0;
    public final int A01;
    public final CharSequence A02;

    public TS6(CharSequence charSequence, int i) {
        this.A02 = charSequence;
        this.A01 = i;
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.A00 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.A01;
        if (0 == i) {
            this.A00 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.A00 = i2;
        return this.A02.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i <= this.A01 && 0 <= i) {
            this.A00 = i;
            return current();
        }
        throw AbstractC166987dD.A12("invalid position");
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.A00;
        if (i == this.A01) {
            return (char) 65535;
        }
        return this.A02.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.A01;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.A00;
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.A00 + 1;
        this.A00 = i;
        int i2 = this.A01;
        if (i >= i2) {
            this.A00 = i2;
            return (char) 65535;
        }
        return this.A02.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.A00;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.A00 = i2;
        return this.A02.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }
}
