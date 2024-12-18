package X;

import com.instagram.model.direct.DirectIfyXma;

/* renamed from: X.EbM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32756EbM extends FKR {
    public final DirectIfyXma A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32756EbM) {
                C32756EbM c32756EbM = (C32756EbM) obj;
                if (!C14360o3.A0K(this.A01, c32756EbM.A01) || !C14360o3.A0K(this.A00, c32756EbM.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32756EbM(DirectIfyXma directIfyXma, String str) {
        super(C2EY.A12, str);
        this.A01 = str;
        this.A00 = directIfyXma;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
