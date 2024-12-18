package X;

import java.util.List;

/* renamed from: X.EiD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33054EiD extends AbstractC33566Ese {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33054EiD) {
                C33054EiD c33054EiD = (C33054EiD) obj;
                if (!C14360o3.A0K(this.A00, c33054EiD.A00) || this.A02 != c33054EiD.A02 || this.A01 != c33054EiD.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public C33054EiD(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = z2;
    }
}
