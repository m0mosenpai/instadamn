package X;

import android.app.PendingIntent;

/* loaded from: classes10.dex */
public final class QJT extends C0T6 implements InterfaceC65207Tfu {
    public final PendingIntent A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof QJT) && C14360o3.A0K(this.A00, ((QJT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public QJT(PendingIntent pendingIntent) {
        this.A00 = pendingIntent;
    }
}
