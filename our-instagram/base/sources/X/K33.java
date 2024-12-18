package X;

import android.content.Intent;

/* loaded from: classes8.dex */
public final class K33 extends AbstractC46358Kfg {
    public final Intent A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K33) && C14360o3.A0K(this.A00, ((K33) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public K33(Intent intent) {
        this.A00 = intent;
    }
}
