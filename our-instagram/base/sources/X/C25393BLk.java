package X;

import android.view.View;

/* renamed from: X.BLk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25393BLk implements InterfaceC31019DkI {
    public InterfaceC16610sE A00;

    @Override // X.InterfaceC31019DkI
    public final void DL9(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC16610sE interfaceC16610sE = this.A00;
        if (interfaceC16610sE != null) {
            interfaceC16610sE.invoke(c120985dq, c37644Ghd, view);
        }
    }

    @Override // X.InterfaceC31019DkI
    public final void EfN(InterfaceC16610sE interfaceC16610sE) {
        this.A00 = interfaceC16610sE;
    }
}
