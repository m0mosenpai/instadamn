package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.REf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60620REf extends C58444PvN {
    public final SZ5 A00;
    public final C58443PvM A01;
    public final SJB A02;
    public final AtomicReference A03 = new AtomicReference();

    @Override // X.C58444PvN, X.InterfaceC65512Tlh
    public final void A9a(InterfaceC65392TjP interfaceC65392TjP) {
        C14360o3.A0B(interfaceC65392TjP, 0);
        super.A9a(interfaceC65392TjP);
        Object obj = this.A03.get();
        if (obj != null) {
            interfaceC65392TjP.Dx0(obj);
        }
    }

    public C60620REf(SZ5 sz5, C58443PvM c58443PvM, SJB sjb) {
        this.A01 = c58443PvM;
        this.A02 = sjb;
        this.A00 = sz5;
    }
}
