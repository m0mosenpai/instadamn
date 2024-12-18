package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public final class Wb1 implements InterfaceC71855X7n {
    public final Bundle A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Wb1) {
                Wb1 wb1 = (Wb1) obj;
                if (!C14360o3.A0K(this.A01, wb1.A01) || !C14360o3.A0K(this.A00, wb1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, this.A01.hashCode() * 31) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FragmentTransitionInfo(identifier=");
        sb.append(this.A01);
        sb.append(", bundle=");
        sb.append(this.A00);
        sb.append(", requestKey=");
        sb.append((String) null);
        sb.append(", resultListener=");
        return AbstractC167017dG.A0o(null, sb);
    }

    public Wb1(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }
}
