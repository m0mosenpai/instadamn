package X;

import java.util.ArrayList;

/* renamed from: X.M4c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49961M4c implements Runnable {
    public final /* synthetic */ C82543mI A00;
    public final /* synthetic */ LTS A01;

    public RunnableC49961M4c(C82543mI c82543mI, LTS lts) {
        this.A01 = lts;
        this.A00 = c82543mI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LTS lts = this.A01;
        C12210kP A0P = AbstractC31177DnL.A0P(lts.A01);
        A0P.A00 = lts.A02;
        C18920wW A00 = A0P.A00();
        C124655kT c124655kT = C124655kT.A00;
        C124675kV c124675kV = C124675kV.A00;
        C124685kW c124685kW = C124685kW.A00;
        AbstractC25233BEq.A0w(2, c124655kT, c124675kV, c124685kW);
        ArrayList A1E = AbstractC166987dD.A1E();
        C82543mI c82543mI = this.A00;
        String str = lts.A04;
        AbstractC127775q2.A00(A00, lts.A00, c82543mI, lts.A03, str, A1E, c124685kW, c124675kV, c124655kT);
    }
}
