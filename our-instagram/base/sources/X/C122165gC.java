package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.5gC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122165gC {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C122165gC) || i != ((C122165gC) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
