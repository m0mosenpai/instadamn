package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.8Q1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Q1 {
    public final List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return C14360o3.A0K(this.A00, ((C8Q1) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C8Q1(List list) {
        this.A00 = list;
    }
}
