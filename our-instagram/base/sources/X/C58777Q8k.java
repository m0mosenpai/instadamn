package X;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Q8k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58777Q8k extends AbstractC62442sj implements InterfaceC65249Tgf {
    public final Semaphore A00;
    public final java.util.Set A01;

    @Override // X.AbstractC019307n
    public final void A02() {
        this.A00.drainPermits();
        A09();
    }

    @Override // X.AbstractC62442sj
    public final /* bridge */ /* synthetic */ Object A06() {
        Iterator it = this.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC1335861e) it.next()).A0G(this)) {
                i++;
            }
        }
        try {
            this.A00.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            AbstractC58318PtA.A18();
            return null;
        }
    }

    public C58777Q8k(Context context, java.util.Set set) {
        super(context);
        this.A00 = new Semaphore(0);
        this.A01 = set;
    }
}
