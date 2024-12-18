package X;

import java.util.Iterator;

/* renamed from: X.XoF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72825XoF {
    public YRK A00;
    public final C72759Xmb A01 = new C72759Xmb();

    public final void A00() {
        YDP ydp;
        C72759Xmb c72759Xmb = this.A01;
        synchronized (c72759Xmb.A02) {
            ydp = c72759Xmb.A01;
            c72759Xmb.A00 = ydp;
        }
        Iterator it = ydp.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("executor");
        }
    }
}
