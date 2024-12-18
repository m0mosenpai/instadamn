package X;

/* renamed from: X.BfM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26033BfM extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26033BfM) {
                C26033BfM c26033BfM = (C26033BfM) obj;
                if (Float.compare(this.A00, c26033BfM.A00) != 0 || Float.compare(this.A01, c26033BfM.A01) != 0 || Float.compare(this.A02, c26033BfM.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01), this.A02);
    }

    public C26033BfM(float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public C26033BfM() {
        this(0.0f, 0.0f, 0.0f);
    }
}
