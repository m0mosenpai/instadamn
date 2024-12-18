package X;

/* renamed from: X.UFk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66399UFk extends WS6 {
    public int A00;
    public int A01;
    public final int A02;
    public final /* synthetic */ WZ6 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66399UFk(InterfaceC71875X8i interfaceC71875X8i, WZ6 wz6, int i) {
        super(interfaceC71875X8i);
        this.A03 = wz6;
        this.A02 = i;
        this.A01 = -1;
        this.A00 = -1;
    }

    public final String toString() {
        return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00));
    }

    @Override // X.WS6, X.XG2
    public final void ELS(C69702Vtx c69702Vtx, int i, int i2, int i3, long j) {
        int i4 = i & (-536870913);
        int i5 = this.A00;
        if (i5 != -1) {
            this.A03.A0H.addLast(Integer.valueOf(i5));
        }
        int i6 = this.A01;
        WDn.A02(MSY.A1S(i6, -1));
        this.A03.A0H.addLast(Integer.valueOf(i6));
        super.ELS(c69702Vtx, i4, i2, i3, j);
    }
}
