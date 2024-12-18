package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class E9Z extends C0T6 implements InterfaceC37110GWv {
    public final Bundle A00;
    public final String A01;

    public E9Z(String str, Bundle bundle) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9Z) {
                E9Z e9z = (E9Z) obj;
                if (!C14360o3.A0K(this.A01, e9z.A01) || !C14360o3.A0K(this.A00, e9z.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
