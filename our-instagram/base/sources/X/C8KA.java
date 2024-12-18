package X;

import java.util.Arrays;

/* renamed from: X.8KA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KA {
    public final C8K8 A00;
    public final C8K9 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8KA)) {
                return false;
            }
            C8KA c8ka = (C8KA) obj;
            if (c8ka.A00 != this.A00 || c8ka.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C8KA(C8K8 c8k8, C8K9 c8k9) {
        this.A00 = c8k8;
        this.A01 = c8k9;
    }
}
