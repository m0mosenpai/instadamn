package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.62T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62T {
    public long A00;
    public long A01;
    public AbstractC118405Xc A02;
    public final long A03;
    public final InterfaceC118485Xk A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final Object A07;
    public final InterfaceC16820sZ A08;

    public C62T(AbstractC118405Xc abstractC118405Xc, InterfaceC118485Xk interfaceC118485Xk, Object obj, Object obj2, InterfaceC16820sZ interfaceC16820sZ, long j, long j2) {
        this.A04 = interfaceC118485Xk;
        this.A07 = obj2;
        this.A03 = j2;
        this.A08 = interfaceC16820sZ;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A06 = new ParcelableSnapshotMutableState(A00, obj);
        this.A02 = AbstractC137336Kc.A00(abstractC118405Xc);
        this.A01 = j;
        this.A00 = Long.MIN_VALUE;
        this.A05 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), true);
    }

    public final void A00() {
        this.A05.Egh(false);
        this.A08.invoke();
    }
}
