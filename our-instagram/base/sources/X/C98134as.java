package X;

/* renamed from: X.4as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98134as implements InterfaceC98144at {
    public final C98044aj[] A00;
    public final int[] A01;

    @Override // X.InterfaceC98144at
    public final InterfaceC98054ak F88(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.A00[i3];
                }
                i3++;
            } else {
                AbstractC46512Bo.A03("BaseMediaChunkOutput", AnonymousClass001.A0O("Unmatched track of type: ", i2));
                return new C98414bK();
            }
        }
    }

    public C98134as(int[] iArr, C98044aj[] c98044ajArr) {
        this.A01 = iArr;
        this.A00 = c98044ajArr;
    }
}
