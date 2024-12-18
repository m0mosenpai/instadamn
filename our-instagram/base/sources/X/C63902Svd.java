package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Svd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63902Svd implements InterfaceC65334TiF {
    public final /* synthetic */ R7U A00;
    public final /* synthetic */ C58717Q4q A01;

    public C63902Svd(R7U r7u, C58717Q4q c58717Q4q) {
        this.A01 = c58717Q4q;
        this.A00 = r7u;
    }

    @Override // X.InterfaceC65334TiF
    public final void onLog(String str) {
        if (!TextUtils.isEmpty(str)) {
            C58717Q4q c58717Q4q = this.A01;
            List list = c58717Q4q.A02;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC65334TiF) it.next()).onLog(str);
                }
            }
            if (str.startsWith("FB_IX_PAGE_READY")) {
                List list2 = c58717Q4q.A04;
                synchronized (list2) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC65336TiH) it2.next()).DXY(this.A00);
                    }
                }
            }
        }
    }
}
