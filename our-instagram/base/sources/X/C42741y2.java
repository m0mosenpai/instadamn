package X;

import java.io.Serializable;

/* renamed from: X.1y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42741y2 implements Serializable {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C42741y2) {
            Throwable th = this.A00;
            Throwable th2 = ((C42741y2) obj).A00;
            if (th != th2) {
                if (th != null && th.equals(th2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationLite.Error[");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public C42741y2(Throwable th) {
        this.A00 = th;
    }
}
