package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* renamed from: X.4k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102664k1 extends C0T6 implements InterfaceC102674k2 {
    public final CornerStyle A00;
    public final ProductDetailsProductItemDict A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    @Override // X.InterfaceC102674k2
    public final InterfaceC102674k2 E9q(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC102674k2
    public final C102664k1 EzS(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC102674k2
    public final C102664k1 EzT(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C102664k1) {
                C102664k1 c102664k1 = (C102664k1) obj;
                if (!C14360o3.A0K(this.A03, c102664k1.A03) || this.A00 != c102664k1.A00 || !C14360o3.A0K(this.A04, c102664k1.A04) || !C14360o3.A0K(this.A05, c102664k1.A05) || !C14360o3.A0K(this.A01, c102664k1.A01) || !C14360o3.A0K(this.A02, c102664k1.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CornerStyle cornerStyle = this.A00;
        int hashCode2 = (hashCode + (cornerStyle == null ? 0 : cornerStyle.hashCode())) * 31;
        List list2 = this.A04;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A05;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A01;
        int hashCode5 = (hashCode4 + (productDetailsProductItemDict == null ? 0 : productDetailsProductItemDict.hashCode())) * 31;
        String str = this.A02;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC102674k2
    public final List Abm() {
        return this.A03;
    }

    @Override // X.InterfaceC102674k2
    public final CornerStyle Aru() {
        return this.A00;
    }

    @Override // X.InterfaceC102674k2
    public final List BJY() {
        return this.A04;
    }

    @Override // X.InterfaceC102674k2
    public final List BNi() {
        return this.A05;
    }

    @Override // X.InterfaceC102674k2
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgl() {
        return this.A01;
    }

    @Override // X.InterfaceC102674k2
    public final String BhE() {
        return this.A02;
    }

    @Override // X.InterfaceC102674k2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingAdsTappableComponentFeed", Ht0.A00(this));
    }

    public C102664k1(CornerStyle cornerStyle, ProductDetailsProductItemDict productDetailsProductItemDict, String str, List list, List list2, List list3) {
        this.A03 = list;
        this.A00 = cornerStyle;
        this.A04 = list2;
        this.A05 = list3;
        this.A01 = productDetailsProductItemDict;
        this.A02 = str;
    }
}
