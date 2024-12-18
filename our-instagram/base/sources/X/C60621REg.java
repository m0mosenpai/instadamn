package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.REg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60621REg extends C58444PvN {
    public final AtomicReference A00 = new AtomicReference();

    @Override // X.C58444PvN, X.InterfaceC65512Tlh
    public final void A9a(InterfaceC65392TjP interfaceC65392TjP) {
        C14360o3.A0B(interfaceC65392TjP, 0);
        super.A9a(interfaceC65392TjP);
        Object obj = this.A00.get();
        if (obj != null) {
            interfaceC65392TjP.Dx0(obj);
        }
    }

    @Override // X.C58444PvN
    public final void A03(Object obj) {
        super.A03(obj);
        this.A00.set(obj);
    }
}
