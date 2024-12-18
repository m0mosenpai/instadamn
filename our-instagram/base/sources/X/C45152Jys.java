package X;

import java.util.List;

/* renamed from: X.Jys, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45152Jys extends C0T6 implements InterfaceC50506MRj {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final Boolean A03;

    public C45152Jys(Boolean bool, List list, int i, boolean z) {
        C14360o3.A0B(list, 4);
        this.A00 = i;
        this.A03 = bool;
        this.A02 = z;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45152Jys) {
                C45152Jys c45152Jys = (C45152Jys) obj;
                if (this.A00 != c45152Jys.A00 || !C14360o3.A0K(this.A03, c45152Jys.A03) || this.A02 != c45152Jys.A02 || !C14360o3.A0K(this.A01, c45152Jys.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A02, ((this.A00 * 31) + AbstractC167017dG.A0M(this.A03)) * 31));
    }
}
