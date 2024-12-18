package X;

import android.app.Notification;

/* renamed from: X.Spt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63586Spt implements InterfaceC65179TfN {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("NotifyTask[");
        A0s.append("packageName:");
        A0s.append(this.A02);
        A0s.append(", id:");
        A0s.append(this.A00);
        A0s.append(", tag:");
        A0s.append(this.A03);
        return AbstractC58319PtB.A0w(A0s);
    }

    public C63586Spt(Notification notification, String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = notification;
    }
}
