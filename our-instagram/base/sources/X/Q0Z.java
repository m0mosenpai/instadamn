package X;

import android.app.Notification;

/* loaded from: classes10.dex */
public final class Q0Z {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && getClass() == o.getClass()) {
            Q0Z q0z = (Q0Z) o;
            if (this.A01 == q0z.A01 && this.A00 == q0z.A00) {
                return this.A02.equals(q0z.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("ForegroundInfo{");
        A0s.append("mNotificationId=");
        A0s.append(this.A01);
        A0s.append(", mForegroundServiceType=");
        A0s.append(this.A00);
        A0s.append(", mNotification=");
        return AbstractC58320PtC.A11(this.A02, A0s);
    }

    public Q0Z(int notificationId, Notification notification, int foregroundServiceType) {
        this.A01 = notificationId;
        this.A02 = notification;
        this.A00 = foregroundServiceType;
    }
}
