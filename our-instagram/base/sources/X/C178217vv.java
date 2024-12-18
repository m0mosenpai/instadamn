package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178217vv extends AbstractC178227vw {
    public final AbstractC178097vi A01 = new AbstractC178097vi() { // from class: X.7vx
    };
    public final List A00 = Collections.synchronizedList(new ArrayList());

    @Override // X.AbstractC178227vw
    public final void A09() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC178077vg) it.next()).CNZ();
        }
    }
}
