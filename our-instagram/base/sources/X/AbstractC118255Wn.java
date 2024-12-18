package X;

/* renamed from: X.5Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118255Wn {
    public static final InterfaceC118275Wp A01 = new InterfaceC118275Wp() { // from class: X.5Wo
        public final String toString() {
            return "Arrangement#Start";
        }

        @Override // X.InterfaceC118275Wp
        public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
            if (anonymousClass583 == AnonymousClass583.Ltr) {
                int i2 = 0;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                return;
            }
            AbstractC118255Wn.A05(iArr, iArr2, i, true);
        }

        @Override // X.InterfaceC118275Wp
        public final /* synthetic */ float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118275Wp A00 = new InterfaceC118275Wp() { // from class: X.5Wq
        public final String toString() {
            return "Arrangement#End";
        }

        @Override // X.InterfaceC118275Wp
        public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
            if (anonymousClass583 == AnonymousClass583.Ltr) {
                AbstractC118255Wn.A05(iArr, iArr2, i, false);
                return;
            }
            int i2 = 0;
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return;
                }
                int i3 = iArr[length];
                iArr2[length] = i2;
                i2 += i3;
            }
        }

        @Override // X.InterfaceC118275Wp
        public final /* synthetic */ float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118305Ws A07 = new InterfaceC118305Ws() { // from class: X.5Wr
        @Override // X.InterfaceC118305Ws
        public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
            int i2 = 0;
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
        }

        public final String toString() {
            return "Arrangement#Top";
        }

        @Override // X.InterfaceC118305Ws
        public final /* synthetic */ float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118305Ws A06 = new InterfaceC118305Ws() { // from class: X.5Wt
        @Override // X.InterfaceC118305Ws
        public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
            AbstractC118255Wn.A05(iArr, iArr2, i, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }

        @Override // X.InterfaceC118305Ws
        public final /* synthetic */ float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118335Wv A02 = new InterfaceC118335Wv() { // from class: X.5Wu
        @Override // X.InterfaceC118305Ws
        public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
            AbstractC118255Wn.A04(iArr, iArr2, i, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }

        @Override // X.InterfaceC118275Wp
        public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
            boolean z = true;
            if (anonymousClass583 == AnonymousClass583.Ltr) {
                z = false;
            }
            AbstractC118255Wn.A04(iArr, iArr2, i, z);
        }

        @Override // X.InterfaceC118275Wp
        public final float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118335Wv A05 = new InterfaceC118335Wv() { // from class: X.5Ww
        @Override // X.InterfaceC118305Ws
        public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
            AbstractC118255Wn.A08(iArr, iArr2, i, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // X.InterfaceC118275Wp
        public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
            boolean z = true;
            if (anonymousClass583 == AnonymousClass583.Ltr) {
                z = false;
            }
            AbstractC118255Wn.A08(iArr, iArr2, i, z);
        }

        @Override // X.InterfaceC118275Wp
        public final float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118335Wv A04 = new InterfaceC118335Wv() { // from class: X.5Wx
        @Override // X.InterfaceC118305Ws
        public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
            AbstractC118255Wn.A07(iArr, iArr2, i, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // X.InterfaceC118275Wp
        public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
            boolean z = true;
            if (anonymousClass583 == AnonymousClass583.Ltr) {
                z = false;
            }
            AbstractC118255Wn.A07(iArr, iArr2, i, z);
        }

        @Override // X.InterfaceC118275Wp
        public final float Byx() {
            return 0.0f;
        }
    };
    public static final InterfaceC118335Wv A03 = new InterfaceC118335Wv() { // from class: X.5Wy
        @Override // X.InterfaceC118305Ws
        public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
            AbstractC118255Wn.A06(iArr, iArr2, i, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // X.InterfaceC118275Wp
        public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
            boolean z = true;
            if (anonymousClass583 == AnonymousClass583.Ltr) {
                z = false;
            }
            AbstractC118255Wn.A06(iArr, iArr2, i, z);
        }

        @Override // X.InterfaceC118275Wp
        public final float Byx() {
            return 0.0f;
        }
    };

    public static final C6ID A02(InterfaceC118245Wl interfaceC118245Wl, float f) {
        return new C6ID(new C206989Ed(interfaceC118245Wl, 1), f, true);
    }

    public static final C6ID A03(InterfaceC118225Wj interfaceC118225Wj, float f) {
        return new C6ID(new C206989Ed(interfaceC118225Wj, 2), f, false);
    }

    public static final void A04(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = length - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = Math.round(f);
            f += i8;
        }
    }

    public static final void A05(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        for (int i8 = length - 1; -1 < i8; i8--) {
            int i9 = iArr[i8];
            iArr2[i8] = i5;
            i5 += i9;
        }
    }

    public static final void A06(int[] iArr, int[] iArr2, int i, boolean z) {
        float f;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (length == 0) {
            f = 0.0f;
        } else {
            f = (i - i3) / length;
        }
        float f2 = f / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = length - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + f;
        }
    }

    public static final void A07(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        if (length != 0) {
            int i3 = 0;
            int i4 = 0;
            do {
                i4 += iArr[i3];
                i3++;
            } while (i3 < length);
            float max = (i - i4) / Math.max(length - 1, 1);
            float f = 0.0f;
            if (z) {
                if (length == 1) {
                    f = max;
                }
                for (int i5 = length - 1; -1 < i5; i5--) {
                    int i6 = iArr[i5];
                    iArr2[i5] = Math.round(f);
                    f += i6 + max;
                }
                return;
            }
            int i7 = 0;
            do {
                int i8 = iArr[i2];
                iArr2[i7] = Math.round(f);
                f += i8 + max;
                i2++;
                i7++;
            } while (i2 < length);
        }
    }

    public static final void A08(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / (length + 1);
        float f2 = f;
        if (!z) {
            float f3 = f;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f3);
                f3 += i6 + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = length - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + f;
        }
    }

    public static final C6ID A00() {
        return A01(8.0f);
    }

    public static final C6ID A01(float f) {
        return new C6ID(C6IC.A00, f, true);
    }
}
