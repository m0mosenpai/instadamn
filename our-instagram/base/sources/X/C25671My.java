package X;

import android.os.Looper;

/* renamed from: X.1My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25671My implements InterfaceC25681Mz {
    public final C1N0 A00;

    @Override // X.InterfaceC25681Mz
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void E4s(InterfaceC41141vN interfaceC41141vN) {
        C14360o3.A0B(interfaceC41141vN, 0);
        this.A00.A04(interfaceC41141vN);
    }

    public final void A01(InterfaceC41501vz interfaceC41501vz, Class cls) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(interfaceC41501vz, 1);
        this.A00.A02(interfaceC41501vz, cls);
    }

    public final void A02(InterfaceC41501vz interfaceC41501vz, Class cls) {
        C14360o3.A0B(cls, 0);
        if (interfaceC41501vz != null) {
            C1N0 c1n0 = this.A00;
            synchronized (c1n0) {
                C1N0.A00(c1n0, interfaceC41501vz, cls, true);
            }
        }
    }

    public final void A03(InterfaceC41501vz interfaceC41501vz, Class cls, Object obj) {
        C14360o3.A0B(interfaceC41501vz, 1);
        this.A00.A03(interfaceC41501vz, cls, obj);
    }

    public final void A04(Object obj) {
        this.A00.A05(obj);
    }

    public C25671My(Looper looper) {
        this.A00 = new C1N0(looper);
    }

    public final boolean A05(InterfaceC41141vN interfaceC41141vN) {
        int A03 = C0f9.A03(537261483);
        boolean A01 = C1N0.A01(this.A00, interfaceC41141vN);
        C0f9.A0A(-1985616095, A03);
        return A01;
    }

    @Override // X.InterfaceC25681Mz
    public final /* bridge */ /* synthetic */ InterfaceC25681Mz A9E(InterfaceC41501vz interfaceC41501vz, Class cls) {
        A01(interfaceC41501vz, cls);
        return this;
    }

    @Override // X.InterfaceC25681Mz
    public final /* bridge */ /* synthetic */ InterfaceC25681Mz EFf(InterfaceC41501vz interfaceC41501vz, Class cls) {
        A02(interfaceC41501vz, cls);
        return this;
    }
}
