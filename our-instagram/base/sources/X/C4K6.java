package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4K6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4K6 {
    public final C006802i A00;

    public final void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5lP c5lP = (C5lP) it.next();
            C14360o3.A0B(c5lP, 0);
            AbstractC125215lS.A00(this.A00, c5lP, "process_message_start");
        }
    }

    public C4K6() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A00 = c006802i;
    }
}
