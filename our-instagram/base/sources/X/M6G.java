package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes8.dex */
public final class M6G implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC50380MMi A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ boolean A03;

    public M6G(Fragment fragment, InterfaceC50380MMi interfaceC50380MMi, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A03 = z;
        this.A00 = fragment;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC50380MMi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A03;
        InterfaceC09390do interfaceC09390do = AbstractC47205Kte.A01;
        interfaceC09390do.getValue();
        int i = 2131961248;
        if (z) {
            i = 2131961269;
        }
        interfaceC09390do.getValue();
        int i2 = 2131961247;
        if (z) {
            i2 = 2131961268;
        }
        LLQ.A07(this.A00, Integer.valueOf(i), MFN.A00, i2);
        this.A02.invoke(this.A01);
    }
}