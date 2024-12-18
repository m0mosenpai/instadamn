package X;

import android.widget.TextView;

/* loaded from: classes4.dex */
public final /* synthetic */ class B44 implements InterfaceC14180ni, InterfaceC185428Kk {
    public final /* synthetic */ C9R3 A00;

    public B44(C9R3 c9r3) {
        this.A00 = c9r3;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C9R3.class, "onTick", "onTick(I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC185428Kk
    public final void Dt9(int i) {
        C9R3 c9r3 = this.A00;
        if (i != 1) {
            ((TextView) AbstractC166987dD.A17(c9r3.A04)).setText(String.valueOf(i - 1));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC185428Kk) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
