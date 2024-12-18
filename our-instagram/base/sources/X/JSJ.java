package X;

import com.instagram.api.schemas.RingSpec;

/* loaded from: classes8.dex */
public final class JSJ extends AbstractC46438Kgy {
    public final RingSpec A00;
    public final boolean A01;

    public JSJ(RingSpec ringSpec, boolean z) {
        C14360o3.A0B(ringSpec, 1);
        this.A00 = ringSpec;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JSJ) {
                JSJ jsj = (JSJ) obj;
                if (!C14360o3.A0K(this.A00, jsj.A00) || this.A01 != jsj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Normal(ringSpec=");
        A1C.append(this.A00);
        A1C.append(", isActivated=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
