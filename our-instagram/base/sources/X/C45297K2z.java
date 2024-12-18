package X;

import java.util.List;

/* renamed from: X.K2z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45297K2z extends C0T6 implements InterfaceC50400MNc {
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45297K2z) {
                C45297K2z c45297K2z = (C45297K2z) obj;
                if (!C14360o3.A0K(this.A02, c45297K2z.A02) || this.A03 != c45297K2z.A03 || !C14360o3.A0K(this.A01, c45297K2z.A01) || !C14360o3.A0K(this.A00, c45297K2z.A00) || this.A04 != c45297K2z.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0K(this.A00, (AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0O(this.A01)) * 31));
    }

    public C45297K2z(String str, String str2, List list, boolean z, boolean z2) {
        this.A02 = list;
        this.A03 = z;
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z2;
    }
}
