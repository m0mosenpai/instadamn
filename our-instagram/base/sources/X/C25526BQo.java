package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.BQo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25526BQo implements InterfaceC14180ni, InterfaceC30939Dit {
    public final /* synthetic */ InterfaceC16610sE A00;

    public C25526BQo(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 1);
        this.A00 = interfaceC16610sE;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    @Override // X.InterfaceC30939Dit
    public final /* synthetic */ boolean DC3(MotionEvent motionEvent, View view, InterfaceC30808Dgj interfaceC30808Dgj) {
        return AbstractC166987dD.A1a(this.A00.invoke(interfaceC30808Dgj, view, motionEvent));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC30939Dit) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
