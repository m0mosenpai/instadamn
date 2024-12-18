package X;

import java.util.Iterator;

/* renamed from: X.UHq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66440UHq extends C3OO {
    public final void A00() {
        AbstractC69697Vts abstractC69697Vts;
        if (this instanceof C67708UwZ) {
            C67708UwZ c67708UwZ = (C67708UwZ) this;
            AbstractC69697Vts abstractC69697Vts2 = c67708UwZ.A00;
            if (abstractC69697Vts2 != null) {
                abstractC69697Vts2.A01();
            }
            AbstractC69697Vts abstractC69697Vts3 = c67708UwZ.A01;
            if (abstractC69697Vts3 != null) {
                abstractC69697Vts3.A01();
            }
            abstractC69697Vts = c67708UwZ.A02;
        } else if (this instanceof C67706UwX) {
            Iterator it = ((C67706UwX) this).A02.iterator();
            while (it.hasNext()) {
                ((AbstractC66440UHq) it.next()).A00();
            }
            return;
        } else {
            if (!(this instanceof C67707UwY)) {
                return;
            }
            C67707UwY c67707UwY = (C67707UwY) this;
            AbstractC69697Vts abstractC69697Vts4 = c67707UwY.A01;
            if (abstractC69697Vts4 != null) {
                abstractC69697Vts4.A01();
            }
            abstractC69697Vts = c67707UwY.A00;
        }
        if (abstractC69697Vts != null) {
            abstractC69697Vts.A01();
        }
    }
}
