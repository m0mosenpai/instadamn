package X;

import android.content.res.Resources;
import java.util.Arrays;

/* renamed from: X.4dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99764dw {
    public final Resources.Theme A00;
    public final Resources A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C99764dw c99764dw = (C99764dw) obj;
            if (!this.A01.equals(c99764dw.A01) || !C02O.A00(this.A00, c99764dw.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C99764dw(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }
}
