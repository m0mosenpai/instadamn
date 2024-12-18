package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.God, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38050God implements Runnable {
    public final /* synthetic */ C96494Vi A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;

    public RunnableC38050God(C96494Vi c96494Vi, List list, Map map) {
        this.A00 = c96494Vi;
        this.A01 = list;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C96494Vi c96494Vi = this.A00;
        C96534Vo c96534Vo = c96494Vi.A05;
        List list = this.A01;
        C1YP c1yp = c96534Vo.A01;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            c96534Vo.A00.insert((Iterable) list);
            c1yp.setTransactionSuccessful();
            c1yp.endTransaction();
            Iterator A15 = AbstractC166997dE.A15(this.A02);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                c96494Vi.A07.put(entry.getKey(), C96504Vj.A00((Collection) entry.getValue()));
            }
            Map map = c96494Vi.A07;
            if (map.size() > c96494Vi.A00 * 2) {
                try {
                    long max = Math.max(c96494Vi.A03, System.currentTimeMillis() - c96494Vi.A02);
                    int i = c96494Vi.A01;
                    c1yp.assertNotSuspendingTransaction();
                    AbstractC29601bb abstractC29601bb = c96534Vo.A02;
                    InterfaceC37561ot acquire = abstractC29601bb.acquire();
                    acquire.ADi(1, max);
                    acquire.ADi(2, i);
                    try {
                        c1yp.beginTransaction();
                        try {
                            int ATb = acquire.ATb();
                            c1yp.setTransactionSuccessful();
                            if (ATb > 0) {
                                map.clear();
                                map.putAll(c96494Vi.A00());
                            }
                        } finally {
                        }
                    } finally {
                        abstractC29601bb.release(acquire);
                    }
                } catch (Exception e) {
                    C0K8.A0F("UserReelMediasRoom", "Failed to prune room", e);
                    C0w9.A03("UserReelMediasRoom", AnonymousClass001.A0R("Failed to prune room ", e.getMessage()));
                }
            }
        } finally {
        }
    }
}
