package X;

import java.util.Iterator;

/* renamed from: X.NLc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52509NLc extends J69 {
    @Override // java.util.Iterator
    public final void remove() {
    }

    @Override // X.J69
    public final AbstractC127945qN A00() {
        Iterator it = this.A01;
        if (it == null || !it.hasNext()) {
            return null;
        }
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) it.next();
        if (abstractC127945qN instanceof AbstractC52515NLi) {
            AbstractC52515NLi abstractC52515NLi = (AbstractC52515NLi) abstractC127945qN;
            InterfaceC58008Pns interfaceC58008Pns = abstractC52515NLi.A02;
            if ((interfaceC58008Pns instanceof C29426Cy1) && !this.A02.EjD(((C29426Cy1) interfaceC58008Pns).A00)) {
                return null;
            }
            return abstractC52515NLi;
        }
        return abstractC127945qN;
    }
}
