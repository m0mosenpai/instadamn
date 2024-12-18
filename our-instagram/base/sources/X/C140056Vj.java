package X;

import android.util.LongSparseArray;

/* renamed from: X.6Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140056Vj {
    public final C18570vk A00;
    public final Object A01 = new Object();
    public final LongSparseArray A02 = new LongSparseArray();

    public final C140126Vq A00(long j) {
        C140126Vq c140126Vq;
        synchronized (this.A01) {
            Object obj = this.A02.get(j);
            if (obj instanceof C140126Vq) {
                c140126Vq = (C140126Vq) obj;
            } else {
                c140126Vq = null;
            }
        }
        return c140126Vq;
    }

    public final void A01(C140126Vq c140126Vq, long j, boolean z) {
        synchronized (this.A01) {
            this.A02.put(j, c140126Vq);
            if (z) {
                this.A00.A09(Long.valueOf(j));
            }
        }
    }

    public C140056Vj() {
        C18570vk c18570vk = AbstractC004901o.A00;
        this.A00 = new C18570vk(6);
    }
}
