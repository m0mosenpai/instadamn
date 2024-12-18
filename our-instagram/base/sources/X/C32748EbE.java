package X;

import com.instagram.direct.model.DirectAREffectShare;

/* renamed from: X.EbE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32748EbE extends FKR {
    public final DirectAREffectShare A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32748EbE) {
                C32748EbE c32748EbE = (C32748EbE) obj;
                if (!C14360o3.A0K(this.A01, c32748EbE.A01) || !C14360o3.A0K(this.A00, c32748EbE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32748EbE(DirectAREffectShare directAREffectShare, String str) {
        super(C2EY.A0M, str);
        this.A01 = str;
        this.A00 = directAREffectShare;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
