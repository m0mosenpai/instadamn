package X;

import java.util.Map;

/* loaded from: classes7.dex */
public final class J5V implements Runnable {
    public final /* synthetic */ C29X A00;
    public final /* synthetic */ C4AD A01;
    public final /* synthetic */ boolean A02;

    public J5V(C29X c29x, C4AD c4ad, boolean z) {
        this.A00 = c29x;
        this.A01 = c4ad;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set set;
        C29X c29x = this.A00;
        C4AD c4ad = this.A01;
        String str = c4ad.A07.A0G;
        Map map = c29x.A07;
        synchronized (map) {
            if (map.containsKey(str) && (set = (java.util.Set) map.get(str)) != null && set.remove(c4ad)) {
                java.util.Set set2 = (java.util.Set) map.get(str);
                if (set2 != null && set2.isEmpty()) {
                    map.remove(str);
                }
                boolean z = this.A02;
                C4AF A00 = c4ad.A00();
                if (A00 != null) {
                    A00.DzT(z);
                }
            }
        }
    }
}
