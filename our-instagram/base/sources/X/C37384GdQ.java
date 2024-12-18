package X;

/* renamed from: X.GdQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37384GdQ extends C4F4 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C37384GdQ c37384GdQ = (C37384GdQ) obj;
        if (this.A03 == c37384GdQ.A03 && this.A00 == c37384GdQ.A00 && this.A01 == c37384GdQ.A01 && this.A02 == c37384GdQ.A02) {
            return true;
        }
        return false;
    }

    public C37384GdQ(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public static C37384GdQ A00(InterfaceC62602sz interfaceC62602sz) {
        return new C37384GdQ(interfaceC62602sz.isLoading(), interfaceC62602sz.CL7(), interfaceC62602sz.CLJ(), interfaceC62602sz.CUG());
    }
}
