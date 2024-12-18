package X;

import java.util.Iterator;

/* renamed from: X.AsF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24434AsF implements Runnable {
    public final /* synthetic */ C219919nd A00;

    public RunnableC24434AsF(C219919nd c219919nd) {
        this.A00 = c219919nd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C219919nd c219919nd = this.A00;
        InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c219919nd).A04;
        if (interfaceC25215BDn != null) {
            interfaceC25215BDn.Dz9(c219919nd.A07());
        }
        Iterator it = ((C9KW) c219919nd).A0A.iterator();
        while (it.hasNext()) {
            ((InterfaceC184058Eu) it.next()).DzQ(c219919nd.A07());
        }
    }
}
