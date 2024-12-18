package X;

import androidx.activity.ComponentActivity;

/* loaded from: classes9.dex */
public final class OJB {
    public int A00;
    public C00X A01;
    public InterfaceC16660sJ A02;
    public final ComponentActivity A03;
    public final String A04;

    public OJB(ComponentActivity componentActivity, String str) {
        AbstractC167017dG.A1P(str, componentActivity);
        this.A04 = str;
        this.A03 = componentActivity;
        this.A02 = null;
        this.A00 = CXC.A00(componentActivity, str);
    }

    public final void A00() {
        InterfaceC16660sJ interfaceC16660sJ;
        int A00 = CXC.A00(this.A03, this.A04);
        boolean z = !AbstractC167007dF.A1P(this.A00, A00);
        this.A00 = A00;
        if (z && (interfaceC16660sJ = this.A02) != null) {
            interfaceC16660sJ.invoke(new CV1(A00));
        }
    }
}
