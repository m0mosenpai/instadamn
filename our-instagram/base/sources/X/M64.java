package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class M64 implements Runnable {
    public final Object A00;
    public final boolean A01;
    public final /* synthetic */ C47807L9p A02;

    public M64(C47807L9p c47807L9p, Object obj, boolean z) {
        this.A02 = c47807L9p;
        this.A00 = obj;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47807L9p c47807L9p = this.A02;
        synchronized (c47807L9p.A01) {
            Map map = c47807L9p.A03;
            Object obj = this.A00;
            Object obj2 = map.get(obj);
            map.remove(obj);
            Map map2 = c47807L9p.A04;
            map2.remove(obj);
            if (!this.A01 && obj2 != null) {
                map2.put(obj, c47807L9p.A05.invoke(obj2));
            }
            c47807L9p.A02.remove(obj);
        }
    }
}
