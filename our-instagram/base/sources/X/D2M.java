package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class D2M implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ BRA A02;
    public final /* synthetic */ List A03;

    public D2M(InterfaceC11380iw interfaceC11380iw, BRA bra, List list, int i) {
        this.A03 = list;
        this.A00 = i;
        this.A02 = bra;
        this.A01 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3PZ.A01((C9C2) this.A03.get(this.A00), this.A01, this.A02.A01);
    }
}
