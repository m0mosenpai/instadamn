package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18160v1 extends C0T6 {
    public static final List A03 = new ArrayList(Arrays.asList(-16777216, -16777216));
    public List A02 = new ArrayList();
    public int A00 = 0;
    public String A01 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18160v1) {
                C18160v1 c18160v1 = (C18160v1) obj;
                if (!C14360o3.A0K(this.A02, c18160v1.A02) || this.A00 != c18160v1.A00 || !C14360o3.A0K(this.A01, c18160v1.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A00) * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
