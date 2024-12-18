package X;

/* renamed from: X.0ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13010ln extends AbstractC20510zS {
    public final /* synthetic */ C12780lQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13010ln(C12780lQ c12780lQ) {
        super(c12780lQ);
        this.A00 = c12780lQ;
    }

    public final int A01(int i) {
        int i2;
        int length;
        int length2;
        C12740lL c12740lL = this.A00.A04;
        short[] sArr = super.A00;
        if (c12740lL.A00(sArr, 0) == 0) {
            short[] sArr2 = this.A02[i];
            int i3 = 1;
            do {
                i3 = c12740lL.A00(sArr2, i3) | (i3 << 1);
                length2 = sArr2.length;
            } while (i3 < length2);
            return (i3 - length2) + 2;
        }
        if (c12740lL.A00(sArr, 1) == 0) {
            short[] sArr3 = this.A03[i];
            int i4 = 1;
            do {
                i4 = c12740lL.A00(sArr3, i4) | (i4 << 1);
                length = sArr3.length;
            } while (i4 < length);
            i2 = (i4 - length) + 2;
        } else {
            short[] sArr4 = this.A01;
            int i5 = 1;
            do {
                i5 = c12740lL.A00(sArr4, i5) | (i5 << 1);
            } while (i5 < 256);
            i2 = (i5 - 256) + 2 + 8;
        }
        return i2 + 8;
    }
}
