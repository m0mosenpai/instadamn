package X;

import java.util.Arrays;

/* renamed from: X.7nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173327nk {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C173327nk c173327nk = (C173327nk) obj;
            if (this.A02 != c173327nk.A02 || !C14360o3.A0K(this.A00, c173327nk.A00) || !C14360o3.A0K(this.A01, c173327nk.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Boolean.valueOf(this.A02), this.A01});
    }

    public C173327nk(Object obj, String str, boolean z) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }
}
