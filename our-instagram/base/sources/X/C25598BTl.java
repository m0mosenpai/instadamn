package X;

import java.util.List;

/* renamed from: X.BTl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25598BTl extends C0T6 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final List A03;
    public final boolean A04;

    public C25598BTl(String str, String str2, List list, boolean z, boolean z2) {
        AbstractC25233BEq.A0x(1, list, str, str2);
        this.A03 = list;
        this.A04 = z;
        this.A02 = z2;
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25598BTl) {
                C25598BTl c25598BTl = (C25598BTl) obj;
                if (!C14360o3.A0K(this.A03, c25598BTl.A03) || this.A04 != c25598BTl.A04 || this.A02 != c25598BTl.A02 || !C14360o3.A0K(this.A00, c25598BTl.A00) || !C14360o3.A0K(this.A01, c25598BTl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0G(this.A03)))));
    }
}
