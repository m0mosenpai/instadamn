package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class E63 extends C0T6 {
    public final Boolean A00;
    public final HashMap A01;

    public E63(Boolean bool, HashMap hashMap) {
        C14360o3.A0B(hashMap, 1);
        this.A01 = hashMap;
        this.A00 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E63) {
                E63 e63 = (E63) obj;
                if (!C14360o3.A0K(this.A01, e63.A01) || !C14360o3.A0K(this.A00, e63.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
