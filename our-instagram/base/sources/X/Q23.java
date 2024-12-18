package X;

import android.database.ContentObserver;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class Q23 extends ContentObserver {
    public final /* synthetic */ SZ9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q23(SZ9 sz9) {
        super(null);
        this.A00 = sz9;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        SZ9 sz9 = this.A00;
        synchronized (sz9.A02) {
            sz9.A06 = null;
            AbstractC63298Sgz.A05.incrementAndGet();
        }
        synchronized (sz9) {
            Iterator it = sz9.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("zza");
            }
        }
    }
}
