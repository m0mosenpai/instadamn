package X;

import java.util.Arrays;

/* renamed from: X.7nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173027nG {
    public String A00;
    public String A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(obj.getClass(), getClass())) {
                return false;
            }
            C173027nG c173027nG = (C173027nG) obj;
            if (!AbstractC50102Ry.A00(this.A02, c173027nG.A02) || !AbstractC50102Ry.A00(this.A01, c173027nG.A01) || !AbstractC50102Ry.A00(this.A00, c173027nG.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00});
    }
}
