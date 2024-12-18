package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vrh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69578Vrh {
    public final int A00;
    public final java.util.Set A02 = new HashSet();
    public final Map A01 = new HashMap();

    public final void A00() {
        Iterator A15 = AbstractC166997dE.A15(this.A01);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            C006802i.A0p.markerAnnotate(this.A00, (String) entry.getKey(), (String) entry.getValue());
        }
        C006802i.A0p.markerEnd(this.A00, (short) 467);
    }

    public C69578Vrh(int i) {
        this.A00 = i;
    }
}
