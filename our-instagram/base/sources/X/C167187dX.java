package X;

import com.instagram.model.mediatype.ProductType;

/* renamed from: X.7dX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167187dX extends C0T6 implements InterfaceC166427cB {
    public final ProductType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C167187dX(ProductType productType, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(productType, 6);
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = str5;
        this.A00 = productType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167187dX) {
                C167187dX c167187dX = (C167187dX) obj;
                if (!C14360o3.A0K(this.A02, c167187dX.A02) || !C14360o3.A0K(this.A05, c167187dX.A05) || !C14360o3.A0K(this.A04, c167187dX.A04) || !C14360o3.A0K(this.A03, c167187dX.A03) || !C14360o3.A0K(this.A01, c167187dX.A01) || this.A00 != c167187dX.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str = this.A04;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }
}
