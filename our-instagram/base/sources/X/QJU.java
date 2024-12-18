package X;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class QJU extends C0T6 implements InterfaceC65207Tfu {
    public final Intent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QJU) {
                QJU qju = (QJU) obj;
                if (!C14360o3.A0K(this.A00, qju.A00) || this.A01 != qju.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0G + i;
    }

    public QJU(Intent intent, boolean z) {
        this.A00 = intent;
        this.A01 = z;
    }
}
