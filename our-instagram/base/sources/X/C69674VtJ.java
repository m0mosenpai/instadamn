package X;

import java.io.File;

/* renamed from: X.VtJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69674VtJ {
    public final File A00;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C69674VtJ)) {
            return C14360o3.A0K(this.A00, ((C69674VtJ) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C69674VtJ(File file) {
        this.A00 = file;
    }
}
