package X;

/* renamed from: X.CmW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28738CmW implements InterfaceC118275Wp {
    public final int A00;

    @Override // X.InterfaceC118275Wp
    public final /* synthetic */ float Byx() {
        return 0.0f;
    }

    public C28738CmW(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC118275Wp
    public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
        if (this.A00 != 0) {
            AbstractC118255Wn.A05(iArr, iArr2, i, false);
            return;
        }
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
        if (this.A00 != 0) {
            return "AbsoluteArrangement#Right";
        }
        return "AbsoluteArrangement#Left";
    }
}
