package X;

import android.view.KeyEvent;

/* renamed from: X.VuS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69732VuS {
    public final KeyEvent A00;

    public final boolean equals(Object obj) {
        KeyEvent keyEvent = this.A00;
        if (!(obj instanceof C69732VuS) || !C14360o3.A0K(keyEvent, ((C69732VuS) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        KeyEvent keyEvent = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyEvent(nativeKeyEvent=");
        return AbstractC167017dG.A0o(keyEvent, sb);
    }
}
