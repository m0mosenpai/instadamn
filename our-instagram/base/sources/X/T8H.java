package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class T8H implements C2JL {
    public final AtomicReference A00;
    public final C2n2 A01;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C62678SLr A01;
        InterfaceC65392TjP interfaceC65392TjP = (InterfaceC65392TjP) this.A00.getAndSet(null);
        if (interfaceC65392TjP != null) {
            try {
                A01 = SSG.A01((Throwable) this.A01.apply(th));
            } catch (Exception e) {
                A01 = SSG.A01(e);
            } catch (Throwable th2) {
                interfaceC65392TjP.Dx0(SSG.A01(th));
                throw th2;
            }
            interfaceC65392TjP.Dx0(A01);
        }
    }

    @Override // X.C2JL
    public final void onSuccess(Object obj) {
        C62678SLr A01;
        InterfaceC65392TjP interfaceC65392TjP = (InterfaceC65392TjP) this.A00.getAndSet(null);
        if (interfaceC65392TjP != null) {
            if (obj != null) {
                A01 = SSG.A00(obj);
            } else {
                A01 = SSG.A01(AbstractC166987dD.A14("Result is null on onSuccess"));
            }
            interfaceC65392TjP.Dx0(A01);
        }
    }

    public T8H(InterfaceC65392TjP interfaceC65392TjP, C2n2 c2n2) {
        this.A00 = new AtomicReference(interfaceC65392TjP);
        this.A01 = c2n2;
    }
}
