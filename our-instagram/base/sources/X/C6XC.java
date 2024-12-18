package X;

import android.view.View;

/* renamed from: X.6XC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6XC implements InterfaceC14180ni, InterfaceC69513Al {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C6XC(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC69513Al
    public final /* synthetic */ void DLu(View view) {
        this.A00.invoke(view);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC69513Al) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
