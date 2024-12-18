package X;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes11.dex */
public final class W90 {
    public static final W90 A04 = new W90();
    public final Object A02 = new Object();
    public final LruCache A01 = new LruCache(64);
    public final ConcurrentMap A03 = new C18B().A00();
    public final Handler A00 = AbstractC167007dF.A0J();

    public static final void A00(W90 w90, C69645Vsm c69645Vsm) {
        List list = c69645Vsm.A06;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A0n = MSZ.A0n(it);
            if (A0n != null) {
                arrayList.add(A0n);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RunnableC71482Wui runnableC71482Wui = new RunnableC71482Wui((C67882V0n) it2.next(), c69645Vsm);
            if (C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper())) {
                runnableC71482Wui.run();
            } else {
                w90.A00.post(runnableC71482Wui);
            }
        }
    }
}
