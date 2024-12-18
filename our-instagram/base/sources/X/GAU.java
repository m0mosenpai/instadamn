package X;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public abstract class GAU implements InterfaceC37225Gaa {
    public final boolean equals(Object obj) {
        if ((obj instanceof GAU) && TextUtils.equals(getUsername(), ((GAU) obj).getUsername())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getUsername().hashCode();
    }

    public final String toString() {
        return getUsername();
    }
}
