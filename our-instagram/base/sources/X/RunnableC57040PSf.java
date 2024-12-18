package X;

import java.util.List;

/* renamed from: X.PSf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57040PSf implements Runnable {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ C111364zz A01;
    public final /* synthetic */ C123645id A02;

    public RunnableC57040PSf(InterfaceC1116050z interfaceC1116050z, C111364zz c111364zz, C123645id c123645id) {
        this.A01 = c111364zz;
        this.A02 = c123645id;
        this.A00 = interfaceC1116050z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C111364zz c111364zz = this.A01;
        AbstractC50522MSa.A0p(c111364zz).remove(EnumC2045493n.A09);
        if (c111364zz.A0A) {
            List list = this.A02.A06;
            C14360o3.A07(list);
            C111364zz.A03(this.A00, c111364zz, list);
            return;
        }
        C111364zz.A02(this.A00, c111364zz);
    }
}
