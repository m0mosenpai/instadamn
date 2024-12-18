package X;

/* renamed from: X.5GA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GA extends C5GB {
    public static int[] A00 = new int[2];

    public static void A00(int[] iArr, float f, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                i7 = (int) ((i8 * f) + 0.5f);
                iArr[0] = i8;
                iArr[1] = i7;
                return;
            } else {
                i6 = (int) ((i9 * f) + 0.5f);
                iArr[0] = i6;
                iArr[1] = i9;
            }
        }
        i6 = (int) ((i9 * f) + 0.5f);
        i7 = (int) ((i8 / f) + 0.5f);
        if (i6 > i8) {
            if (i7 > i9) {
                return;
            }
            iArr[0] = i8;
            iArr[1] = i7;
            return;
        }
        iArr[0] = i6;
        iArr[1] = i9;
    }

    public final void A0C() {
        this.A09 = false;
        Y8R y8r = this.A04;
        y8r.A01();
        y8r.A0B = false;
        Y8R y8r2 = this.A03;
        y8r2.A01();
        y8r2.A0B = false;
        this.A05.A0B = false;
    }

    public final String toString() {
        return AnonymousClass001.A0R("HorizontalRun ", this.A02.A0n);
    }
}
