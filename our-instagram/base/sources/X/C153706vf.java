package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153706vf {
    public final C3YT A00;

    public final ArrayList A00(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C120985dq c120985dq = (C120985dq) it.next();
            C3YT c3yt = this.A00;
            if (!c3yt.A00.getBoolean(c120985dq.getId(), false)) {
                arrayList.add(c120985dq);
            }
        }
        return arrayList;
    }

    public C153706vf(C3YT c3yt) {
        this.A00 = c3yt;
    }
}
