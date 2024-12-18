package X;

/* renamed from: X.BfK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26031BfK extends C0T6 {
    public final float A00;
    public final int A01;

    public C26031BfK(float f, int i) {
        this.A01 = i;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C26031BfK) {
            C26031BfK c26031BfK = (C26031BfK) obj;
            if (c26031BfK.A01 != i || Float.compare(this.A00, c26031BfK.A00) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26031BfK() {
        this(0.0f, 2);
        this.A01 = 2;
    }
}
