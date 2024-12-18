package X;

import android.util.SparseArray;

/* loaded from: classes11.dex */
public final class U6N implements InterfaceC13000lm {
    public final Object A02 = new Object();
    public int A00 = 0;
    public final SparseArray A01 = new SparseArray();

    public static U6N A00(AbstractC12990ll abstractC12990ll) {
        return (U6N) abstractC12990ll.A01(U6N.class, new C65881Tvk(0));
    }

    public final int A01(Object obj) {
        int i;
        synchronized (this.A02) {
            SparseArray sparseArray = this.A01;
            i = this.A00;
            sparseArray.put(i, obj);
            this.A00 = i + 1;
        }
        return i;
    }

    public final Object A02(int i) {
        Object obj;
        synchronized (this.A02) {
            obj = this.A01.get(i);
        }
        return obj;
    }

    public final void A03(int i) {
        synchronized (this.A02) {
            this.A01.remove(i);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this.A02) {
            this.A01.clear();
        }
    }
}
