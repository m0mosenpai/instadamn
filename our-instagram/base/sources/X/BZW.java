package X;

import androidx.compose.foundation.gestures.DragGestureNode;

/* loaded from: classes5.dex */
public final class BZW extends DragGestureNode {
    public InterfaceC30902DiF A00;
    public C6M3 A01;
    public InterfaceC16610sE A02;
    public InterfaceC16610sE A03;
    public boolean A04;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object A0H(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object AQL = this.A00.AQL(EnumC27348C5d.UserInput, interfaceC23621Ds, new C57172PZq(this, interfaceC16620sF, (InterfaceC23621Ds) null, 4, 42));
        if (AQL != C1JX.A02) {
            return C0eB.A00;
        }
        return AQL;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A0J(long j) {
        if (((C58J) this).A08 && !C14360o3.A0K(this.A02, BG5.A00)) {
            AbstractC166987dD.A1Z(new C50121MBv(this, j, (InterfaceC23621Ds) null, 0), A05());
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A0K(long j) {
        if (((C58J) this).A08 && !C14360o3.A0K(this.A03, BG5.A01)) {
            AbstractC166987dD.A1Z(new C50121MBv(this, j, (InterfaceC23621Ds) null, 1), A05());
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean A0M() {
        return this.A04;
    }
}
