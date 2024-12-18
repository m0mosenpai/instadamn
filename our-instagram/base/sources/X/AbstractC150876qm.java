package X;

import java.util.ArrayList;

/* renamed from: X.6qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC150876qm {
    public static final void A00(int i) {
        ArrayList arrayList = new ArrayList(2);
        if ((i & 256) == 256) {
            arrayList.add("CREATE");
        }
        if ((i & 32) == 32) {
            arrayList.add("OPEN");
        }
    }
}
