package X;

import android.os.Looper;

/* renamed from: X.1vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41451vu implements InterfaceC25681Mz {
    public static C41451vu A01;
    public final C1N0 A00;

    @Override // X.InterfaceC25681Mz
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void E4s(InterfaceC41471vw interfaceC41471vw) {
        C14360o3.A0B(interfaceC41471vw, 0);
        this.A00.A04(interfaceC41471vw);
    }

    public final synchronized void A02(InterfaceC41501vz interfaceC41501vz, Class cls) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(interfaceC41501vz, 1);
        this.A00.A02(interfaceC41501vz, cls);
    }

    public final synchronized void A03(InterfaceC41501vz interfaceC41501vz, Class cls) {
        C14360o3.A0B(cls, 0);
        if (interfaceC41501vz != null) {
            C1N0 c1n0 = this.A00;
            synchronized (c1n0) {
                C1N0.A00(c1n0, interfaceC41501vz, cls, true);
            }
        }
    }

    public final void A01(InterfaceC41471vw interfaceC41471vw) {
        C1N0.A01(this.A00, interfaceC41471vw);
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        C14360o3.A07(mainLooper);
        A01 = new C41451vu(mainLooper);
    }

    public C41451vu(Looper looper) {
        this.A00 = new C1N0(looper);
    }

    @Override // X.InterfaceC25681Mz
    public final /* bridge */ /* synthetic */ InterfaceC25681Mz A9E(InterfaceC41501vz interfaceC41501vz, Class cls) {
        A02(interfaceC41501vz, cls);
        return this;
    }

    @Override // X.InterfaceC25681Mz
    public final /* bridge */ /* synthetic */ InterfaceC25681Mz EFf(InterfaceC41501vz interfaceC41501vz, Class cls) {
        A03(interfaceC41501vz, cls);
        return this;
    }
}
