package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes8.dex */
public final class M5K implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC50380MMi A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public M5K(Fragment fragment, InterfaceC50380MMi interfaceC50380MMi, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = fragment;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC50380MMi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.A00;
        InterfaceC09390do interfaceC09390do = AbstractC47205Kte.A01;
        interfaceC09390do.getValue();
        interfaceC09390do.getValue();
        LLQ.A07(fragment, 2131961250, MFP.A00, 2131961249);
        this.A02.invoke(this.A01);
    }
}
