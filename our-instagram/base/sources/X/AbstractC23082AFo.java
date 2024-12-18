package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.AFo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23082AFo {
    public static final Handler A00 = AbstractC167007dF.A0J();
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static final void A00(BD5 bd5, AbstractC224249v8 abstractC224249v8) {
        String obj = abstractC224249v8.toString();
        ConcurrentHashMap concurrentHashMap = A01;
        if (concurrentHashMap.containsKey(obj)) {
            B0D b0d = (B0D) concurrentHashMap.get(obj);
            if (b0d != null) {
                b0d.A00.add(bd5);
                return;
            }
            return;
        }
        B0D b0d2 = new B0D(abstractC224249v8);
        b0d2.A00.add(bd5);
        concurrentHashMap.put(obj, b0d2);
        C14120nc.A00().ATO(C14190nj.A00(b0d2, 613898998, 3, false, false));
    }
}
