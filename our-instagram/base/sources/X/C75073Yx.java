package X;

/* renamed from: X.3Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75073Yx {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A04 = new int[16];
    public int[] A03 = new int[16];

    public static final void A00(C75073Yx c75073Yx, int i, int i2) {
        int[] iArr = c75073Yx.A04;
        int[] iArr2 = c75073Yx.A03;
        int[] iArr3 = c75073Yx.A02;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public C75073Yx() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.A02 = iArr;
    }
}
