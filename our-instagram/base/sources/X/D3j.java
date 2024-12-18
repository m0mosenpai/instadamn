package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

/* loaded from: classes5.dex */
public final class D3j extends C1Dq {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3j(ToastDragDismissState toastDragDismissState, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A04 = toastDragDismissState;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A05 != 0) {
            this.A03 = obj;
            this.A01 |= Integer.MIN_VALUE;
            return ((ToastDragDismissState) this.A04).A00(null, this, 0.0f);
        }
        this.A04 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.A01(null, null, null, this, null, 0.0f);
    }

    public D3j(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }
}
