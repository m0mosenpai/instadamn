package X;

/* renamed from: X.3zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC90013zh implements Runnable, Comparable, C19D, InterfaceC90023zi {
    public int A00;
    public long A01;
    public volatile Object _heap;

    @Override // X.C19D
    public final void dispose() {
        C90033zj c90033zj;
        synchronized (this) {
            Object obj = this._heap;
            C20730zt c20730zt = C2SZ.A01;
            if (obj != c20730zt) {
                if ((obj instanceof C90033zj) && (c90033zj = (C90033zj) obj) != null) {
                    synchronized (c90033zj) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C2SY) && ((C2SY) obj2) != null) {
                            c90033zj.A02(this.A00);
                        }
                    }
                }
                this._heap = c20730zt;
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.A01 - ((AbstractRunnableC90013zh) obj).A01;
        if (j > 0) {
            return 1;
        }
        if (j >= 0) {
            return 0;
        }
        return -1;
    }

    public String toString() {
        return AnonymousClass001.A0K("Delayed[nanos=", ']', this.A01);
    }
}
