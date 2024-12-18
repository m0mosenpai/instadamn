package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.T3h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64198T3h implements InterfaceC65512Tlh {
    public static final C2n2 A03 = new C58605PyY(39);
    public final ListenableFuture A00;
    public final C2n2 A01;
    public final Map A02 = Collections.synchronizedMap(AbstractC166987dD.A1G());

    @Override // X.InterfaceC65512Tlh
    public final void A9a(InterfaceC65392TjP interfaceC65392TjP) {
        T8H t8h = new T8H(interfaceC65392TjP, this.A01);
        this.A02.put(interfaceC65392TjP, t8h);
        C2OD.A03(t8h, this.A00, C1M8.A01);
    }

    @Override // X.InterfaceC65512Tlh
    public final void AOi(InterfaceC65392TjP interfaceC65392TjP) {
        T8H t8h = (T8H) this.A02.remove(interfaceC65392TjP);
        if (t8h != null) {
            t8h.A00.set(null);
        }
    }

    public C64198T3h(C2n2 c2n2, ListenableFuture listenableFuture) {
        this.A00 = listenableFuture;
        this.A01 = c2n2;
    }
}
