package X;

import java.util.Arrays;

/* renamed from: X.Ete, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33628Ete {
    public boolean A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C33628Ete c33628Ete = (C33628Ete) obj;
            if (this.A01 != c33628Ete.A01 || this.A00 != c33628Ete.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A01), Boolean.valueOf(this.A00)});
    }
}
