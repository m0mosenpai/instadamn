package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class BGI implements InterfaceC119205ac {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C6NM A01;
    public final /* synthetic */ InterfaceC119205ac A02;
    public final /* synthetic */ InterfaceC119205ac A03;

    @Override // X.InterfaceC119205ac
    public final Map Aaw() {
        return this.A03.Aaw();
    }

    @Override // X.InterfaceC119205ac
    public final InterfaceC16660sJ Bpq() {
        return this.A03.Bpq();
    }

    @Override // X.InterfaceC119205ac
    public final int getHeight() {
        return this.A03.getHeight();
    }

    @Override // X.InterfaceC119205ac
    public final int getWidth() {
        return this.A03.getWidth();
    }

    public BGI(C6NM c6nm, InterfaceC119205ac interfaceC119205ac, InterfaceC119205ac interfaceC119205ac2, int i) {
        this.A01 = c6nm;
        this.A00 = i;
        this.A02 = interfaceC119205ac2;
        this.A03 = interfaceC119205ac;
    }

    @Override // X.InterfaceC119205ac
    public final void E4Q() {
        C6NM c6nm = this.A01;
        c6nm.A00 = this.A00;
        this.A02.E4Q();
        c6nm.A06(c6nm.A00);
    }
}
