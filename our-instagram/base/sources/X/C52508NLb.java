package X;

import java.util.Iterator;

/* renamed from: X.NLb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52508NLb extends J69 {
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
        if (abstractC127945qN instanceof AbstractC52514NLh) {
            AbstractC52514NLh abstractC52514NLh = (AbstractC52514NLh) abstractC127945qN;
            InterfaceC57960Pn6 interfaceC57960Pn6 = abstractC52514NLh.A02;
            if ((interfaceC57960Pn6 instanceof P5B) && !this.A02.EjD(((P5B) interfaceC57960Pn6).A00)) {
                return null;
            }
            return abstractC52514NLh;
        }
        return abstractC127945qN;
    }
}
