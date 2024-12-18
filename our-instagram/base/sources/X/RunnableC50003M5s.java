package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.M5s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50003M5s implements Runnable {
    public final /* synthetic */ C7UR A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public RunnableC50003M5s(C7UR c7ur, String str, String str2) {
        this.A00 = c7ur;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7UR c7ur = this.A00;
        C7UR c7ur2 = C7UR.A0A;
        ConcurrentHashMap concurrentHashMap = c7ur.A05;
        String str = this.A01;
        java.util.Set set = (java.util.Set) concurrentHashMap.get(str);
        if (set != null) {
            String str2 = this.A02;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C74M) it.next()).onError(str2);
            }
        }
        concurrentHashMap.remove(str);
    }
}
