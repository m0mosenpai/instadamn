package X;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: X.02o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C007402o {
    public final DisplayCutout A00;

    public final C02I A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C02I.A01(AbstractC007302n.A00(this.A00));
        }
        return C02I.A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C02O.A00(this.A00, ((C007402o) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public C007402o(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }
}
