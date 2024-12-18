package X;

import com.shopify.checkout.models.errors.ErrorGroup;

/* renamed from: X.WpG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71177WpG implements InterfaceC71868X8b {
    public final ErrorGroup A00 = ErrorGroup.A06;
    public final Exception A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71177WpG) {
                C71177WpG c71177WpG = (C71177WpG) obj;
                if (this.A02 != c71177WpG.A02 || !C14360o3.A0K(this.A01, c71177WpG.A01) || !C14360o3.A0K(this.A03, c71177WpG.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return AbstractC166997dE.A0J(this.A01, AbstractC25230BEn.A0C(num, AbstractC68609VXk.A00(num)) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Group: ");
        sb.append(this.A00);
        sb.append("\n            Reason: ");
        sb.append(this.A03);
        sb.append("\n            Code: ");
        sb.append(AbstractC68609VXk.A00(this.A02));
        sb.append("\n            Underlying Error: ");
        sb.append(this.A01);
        return AbstractC166997dE.A0x("\n        ", sb);
    }

    public C71177WpG(Exception exc, Integer num, String str) {
        this.A02 = num;
        this.A01 = exc;
        this.A03 = str;
    }
}
