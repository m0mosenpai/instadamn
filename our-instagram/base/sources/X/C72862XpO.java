package X;

/* renamed from: X.XpO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72862XpO {
    public final Y6Z A00 = new Y6Z();

    public final void A00() {
        if (this.A00.A08()) {
        } else {
            throw AbstractC166987dD.A14("Cannot cancel a completed task.");
        }
    }

    public final void A01(Exception exc) {
        Y6Z y6z = this.A00;
        Object obj = y6z.A05;
        synchronized (obj) {
            if (y6z.A02) {
                throw AbstractC166987dD.A14("Cannot set the error on a completed task.");
            }
            y6z.A02 = true;
            y6z.A00 = exc;
            obj.notifyAll();
            Y6Z.A01(y6z);
        }
    }

    public final void A02(Object obj) {
        if (this.A00.A09(obj)) {
        } else {
            throw AbstractC166987dD.A14("Cannot set the result of a completed task.");
        }
    }
}
