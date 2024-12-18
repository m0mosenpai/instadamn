package X;

/* loaded from: classes10.dex */
public final class TIP implements CharSequence {
    public final char A00;

    @Override // java.lang.CharSequence
    public final int length() {
        return 1;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i == 0) {
            return this.A00;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return "";
            }
            if (i2 == 1) {
                return this;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public TIP(char c) {
        this.A00 = c;
    }
}
