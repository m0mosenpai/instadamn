package X;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;

/* loaded from: classes5.dex */
public final class D3h extends C1Dq {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A07 = obj;
        this.A01 |= Integer.MIN_VALUE;
        if (i != 0) {
            return DragGestureDetectorKt.A06(null, this, null, 0, 0L);
        }
        return DragGestureDetectorKt.A05(null, this, null, 0, 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3h(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = i;
    }
}
