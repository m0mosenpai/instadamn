package X;

import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.Ptd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58342Ptd {
    public final C58341Ptc A00;
    public volatile C55092g9 A01;
    public volatile C54502f7 A02;

    public final void A00() {
        try {
            this.A00.A03.ChH(new AbstractC53492cX() { // from class: X.2cW
                @Override // X.AbstractC53492cX
                public final void A00(C54502f7 c54502f7) {
                    C58342Ptd c58342Ptd = C58342Ptd.this;
                    c58342Ptd.A02 = c54502f7;
                    C54502f7 c54502f72 = c58342Ptd.A02;
                    C58341Ptc c58341Ptc = c58342Ptd.A00;
                    c58342Ptd.A01 = new C55092g9(c58341Ptc.A02, c58341Ptc.A04, c54502f72, AbstractC55062g6.A00());
                    ArrayList arrayList = new ArrayList();
                    ReadWriteLock readWriteLock = c58341Ptc.A06;
                    readWriteLock.writeLock().lock();
                    try {
                        c58341Ptc.A07 = 1;
                        java.util.Set set = c58341Ptc.A05;
                        arrayList.addAll(set);
                        set.clear();
                        readWriteLock.writeLock().unlock();
                        c58341Ptc.A00.post(new RunnableC55102gA(null, arrayList, c58341Ptc.A07));
                    } catch (Throwable th) {
                        readWriteLock.writeLock().unlock();
                        throw th;
                    }
                }

                @Override // X.AbstractC53492cX
                public final void A01(Throwable th) {
                    C58342Ptd.this.A00.A05(th);
                }
            });
        } catch (Throwable th) {
            this.A00.A05(th);
        }
    }

    public C58342Ptd(C58341Ptc c58341Ptc) {
        this.A00 = c58341Ptc;
    }
}
