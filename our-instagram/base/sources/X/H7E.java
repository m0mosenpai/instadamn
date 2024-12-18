package X;

import com.instagram.model.shopping.ProductArEffectMetadata;

/* loaded from: classes7.dex */
public final class H7E extends C0T6 implements InterfaceC66482zP {
    public final IDP A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final ProductArEffectMetadata A04;

    public H7E(ProductArEffectMetadata productArEffectMetadata, IDP idp, String str, String str2, String str3) {
        C14360o3.A0B(str3, 3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = productArEffectMetadata;
        this.A00 = idp;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7E) {
                H7E h7e = (H7E) obj;
                if (!C14360o3.A0K(this.A01, h7e.A01) || !C14360o3.A0K(this.A03, h7e.A03) || !C14360o3.A0K(this.A02, h7e.A02) || !C14360o3.A0K(this.A04, h7e.A04) || !C14360o3.A0K(this.A00, h7e.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R("arpill:", this.A03);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A01)))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
