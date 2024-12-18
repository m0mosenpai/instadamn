package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* renamed from: X.H7b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38811H7b extends C0T6 implements JMP {
    public final C38813H7d A00;
    public final ProductDetailsProductItemDict A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Override // X.JMP
    public final C38811H7b F5Z(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38811H7b) {
                C38811H7b c38811H7b = (C38811H7b) obj;
                if (!C14360o3.A0K(this.A02, c38811H7b.A02) || !C14360o3.A0K(this.A03, c38811H7b.A03) || !C14360o3.A0K(this.A00, c38811H7b.A00) || !C14360o3.A0K(this.A01, c38811H7b.A01) || !C14360o3.A0K(this.A04, c38811H7b.A04) || !C14360o3.A0K(this.A05, c38811H7b.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMP
    public final Long AZD() {
        return this.A02;
    }

    @Override // X.JMP
    public final String Alz() {
        return this.A03;
    }

    @Override // X.JMP
    public final /* bridge */ /* synthetic */ JLG AtX() {
        return this.A00;
    }

    @Override // X.JMP
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BTe() {
        return this.A01;
    }

    @Override // X.JMP
    public final String Bgv() {
        return this.A04;
    }

    @Override // X.JMP
    public final List Buf() {
        return this.A05;
    }

    @Override // X.JMP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingNetegoInStoryProductSuggestion", AbstractC40716I2w.A00(this));
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31)) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C38811H7b(C38813H7d c38813H7d, ProductDetailsProductItemDict productDetailsProductItemDict, Long l, String str, String str2, List list) {
        AbstractC37302Gc3.A1U(c38813H7d, productDetailsProductItemDict);
        this.A02 = l;
        this.A03 = str;
        this.A00 = c38813H7d;
        this.A01 = productDetailsProductItemDict;
        this.A04 = str2;
        this.A05 = list;
    }

    @Override // X.JMP
    public final JMP EBh(C1DY c1dy) {
        return this;
    }
}
