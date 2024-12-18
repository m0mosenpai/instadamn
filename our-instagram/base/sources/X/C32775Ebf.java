package X;

import com.instagram.model.direct.DirectPendingLayeredXma;

/* renamed from: X.Ebf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32775Ebf extends FKR {
    public DirectPendingLayeredXma A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32775Ebf) {
                C32775Ebf c32775Ebf = (C32775Ebf) obj;
                if (!C14360o3.A0K(this.A02, c32775Ebf.A02) || !C14360o3.A0K(this.A01, c32775Ebf.A01) || !C14360o3.A0K(this.A03, c32775Ebf.A03) || !C14360o3.A0K(this.A00, c32775Ebf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32775Ebf(DirectPendingLayeredXma directPendingLayeredXma, String str, String str2, String str3) {
        super(C2EY.A0c, str);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = directPendingLayeredXma;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
