package X;

import com.instagram.shopping.model.share.ShopShareInfo;

/* renamed from: X.EbZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32769EbZ extends FKR {
    public final ShopShareInfo A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32769EbZ(ShopShareInfo shopShareInfo, String str) {
        super(C2EY.A1c, str);
        C14360o3.A0B(shopShareInfo, 2);
        this.A01 = str;
        this.A00 = shopShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32769EbZ) {
                C32769EbZ c32769EbZ = (C32769EbZ) obj;
                if (!C14360o3.A0K(this.A01, c32769EbZ.A01) || !C14360o3.A0K(this.A00, c32769EbZ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
