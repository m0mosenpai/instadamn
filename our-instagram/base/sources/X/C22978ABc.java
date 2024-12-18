package X;

import android.content.Context;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.ABc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22978ABc {
    public final Context A00;
    public final InterfaceC58176Pqg A01;
    public final Map A03 = AbstractC166987dD.A1G();
    public final Queue A02 = new ConcurrentLinkedQueue();

    public final synchronized BCE A00(Class cls) {
        String canonicalName;
        Map map;
        canonicalName = cls.getCanonicalName();
        map = this.A03;
        if (!map.containsKey(canonicalName)) {
            try {
                BCE bce = (BCE) cls.newInstance();
                map.put(canonicalName, bce);
                bce.COG(this);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (BCE) map.get(canonicalName);
    }

    public C22978ABc(Context context) {
        this.A00 = context;
        this.A01 = new AjJ(context, null);
    }
}
