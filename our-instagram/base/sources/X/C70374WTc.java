package X;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.WTc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70374WTc implements InterfaceC71968XDa {
    public final C69704Vtz A00;
    public final Map A01 = new HashMap();
    public final C70394WTw A02;
    public final InterfaceC71982XDr A03;

    @Override // X.InterfaceC71968XDa
    public final void ADe(C71196Wpl c71196Wpl, VZu vZu) {
        this.A02.A0I.invalidate();
    }

    @Override // X.InterfaceC71968XDa
    public final void Aon(WFW wfw, C2TB c2tb, Collection collection, float f) {
        this.A00.A00(wfw, c2tb, collection, this.A03.Aom());
    }

    public C70374WTc(C70394WTw c70394WTw, C70397WTz c70397WTz, InterfaceC71982XDr interfaceC71982XDr) {
        this.A02 = c70394WTw;
        this.A03 = interfaceC71982XDr;
        this.A00 = new C69704Vtz(c70397WTz, Collections.emptyList(), interfaceC71982XDr.Aol());
    }

    @Override // X.InterfaceC71968XDa
    public final VZu ALm(C71196Wpl c71196Wpl, int i) {
        LinkedList A04 = c71196Wpl.A04();
        Collections.sort(A04, new C71659WyA(this, 6));
        ULQ ALe = this.A03.ALe(c71196Wpl, (InterfaceC72044XLa) A04.peek(), this.A02);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            this.A01.put(((InterfaceC71945XBu) it.next()).getId(), new WeakReference(ALe));
        }
        return new VZu(ALe);
    }

    @Override // X.InterfaceC71968XDa
    public final void EF8(C71196Wpl c71196Wpl) {
        Iterator it = c71196Wpl.A04().iterator();
        while (it.hasNext()) {
            this.A01.remove(((InterfaceC71945XBu) it.next()).getId());
        }
    }
}
