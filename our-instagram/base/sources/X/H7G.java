package X;

import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes7.dex */
public final class H7G extends C0T6 implements InterfaceC66482zP {
    public H7E A00;
    public final C38321qM A01;
    public final EnumC39541HdD A02;
    public final EnumC39591He1 A03;
    public final Product A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final Integer A0B;

    public H7G(C38321qM c38321qM, EnumC39541HdD enumC39541HdD, EnumC39591He1 enumC39591He1, H7E h7e, Product product, Integer num, Integer num2, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(enumC39591He1, 6);
        this.A07 = str;
        this.A09 = list;
        this.A0A = z;
        this.A04 = product;
        this.A06 = str2;
        this.A03 = enumC39591He1;
        this.A01 = c38321qM;
        this.A02 = enumC39541HdD;
        this.A05 = num;
        this.A08 = str3;
        this.A0B = num2;
        this.A00 = h7e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7G) {
                H7G h7g = (H7G) obj;
                if (!C14360o3.A0K(this.A07, h7g.A07) || !C14360o3.A0K(this.A09, h7g.A09) || this.A0A != h7g.A0A || !C14360o3.A0K(this.A04, h7g.A04) || !C14360o3.A0K(this.A06, h7g.A06) || this.A03 != h7g.A03 || !C14360o3.A0K(this.A01, h7g.A01) || this.A02 != h7g.A02 || !C14360o3.A0K(this.A05, h7g.A05) || !C14360o3.A0K(this.A08, h7g.A08) || this.A0B != h7g.A0B || !C14360o3.A0K(this.A00, h7g.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A07;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A08, (AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A09, AbstractC166987dD.A0J(this.A07)))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31);
        Integer num = this.A0B;
        return AbstractC167017dG.A0L(num, I88.A00(num), A0K) + AbstractC166997dE.A0I(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
