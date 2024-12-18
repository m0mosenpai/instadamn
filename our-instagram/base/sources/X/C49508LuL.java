package X;

import java.util.Map;

/* renamed from: X.LuL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49508LuL implements InterfaceC50512MRp {
    public int A00;
    public final InterfaceC25681Mz A01;
    public final InterfaceC41501vz A02;
    public final Class A03;
    public final Map A04;
    public final Map A05;

    public C49508LuL(InterfaceC25681Mz interfaceC25681Mz, Class cls) {
        C14360o3.A0B(interfaceC25681Mz, 1);
        this.A01 = interfaceC25681Mz;
        this.A03 = cls;
        this.A04 = AbstractC166987dD.A1I();
        this.A02 = new C44288Jhe(this, 19);
        this.A05 = AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC50512MRp
    public final void Cti(C07X c07x, InterfaceC58362lv interfaceC58362lv) {
        if (c07x.getLifecycle().A07() != C07S.DESTROYED) {
            Map map = this.A04;
            if (map.containsKey(interfaceC58362lv)) {
                Object obj = map.get(interfaceC58362lv);
                C14360o3.A0A(obj);
                if (!C14360o3.A0K(((C48101LRb) obj).A02, c07x)) {
                    throw AbstractC166987dD.A14("Already observing IgBaseLiveEvent with a different LifecycleOwner");
                }
                return;
            }
            C48101LRb c48101LRb = new C48101LRb(c07x, interfaceC58362lv, this);
            map.put(interfaceC58362lv, c48101LRb);
            c07x.getLifecycle().A09(c48101LRb);
            if (c07x.getLifecycle().A07().A00(C07S.CREATED)) {
                A00(this, true);
            }
            this.A05.put(interfaceC58362lv, AbstractC166987dD.A1E());
        }
    }

    public static final void A00(C49508LuL c49508LuL, boolean z) {
        int i = c49508LuL.A00;
        boolean z2 = false;
        boolean A1O = AbstractC167007dF.A1O(i);
        int i2 = -1;
        if (z) {
            i2 = 1;
        }
        int i3 = i + i2;
        c49508LuL.A00 = i3;
        if (i3 > 0) {
            z2 = true;
        }
        if (!A1O) {
            if (z2) {
                c49508LuL.A01.A9E(c49508LuL.A02, c49508LuL.A03);
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        c49508LuL.A01.EFf(c49508LuL.A02, c49508LuL.A03);
    }
}
