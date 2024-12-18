package X;

import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;

/* renamed from: X.GmJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37922GmJ extends AbstractC154146wP {
    public final int A00;
    public final Object A01;

    public C37922GmJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC154146wP
    public final int A03(int i) {
        AbstractC66422zJ abstractC66422zJ;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                HCY hcy = (HCY) this.A01;
                C66362zD c66362zD = hcy.A01;
                if (c66362zD != null) {
                    abstractC66422zJ = c66362zD.A03.A02(c66362zD.getItemViewType(i));
                } else {
                    abstractC66422zJ = null;
                }
                if (!(abstractC66422zJ instanceof C39101HIz)) {
                    return hcy.A00;
                }
                return 1;
            case 1:
                int itemViewType = ((C41189ILc) this.A01).A01.getItemViewType(i);
                if (itemViewType != 0 && itemViewType != 1 && itemViewType != 2) {
                    return 2;
                }
                return 1;
            case 2:
                interfaceC09390do = ((HCU) this.A01).A06;
                break;
            case 3:
                interfaceC09390do = ((HCV) this.A01).A06;
                break;
            case 4:
                C38371Gu8 c38371Gu8 = ((ShoppingMoreProductsFragment) this.A01).A03;
                int itemViewType2 = c38371Gu8.getItemViewType(i);
                if (itemViewType2 != 0) {
                    if (itemViewType2 == 1) {
                        return 2;
                    }
                    if (itemViewType2 != 2) {
                        if (itemViewType2 == 3 || itemViewType2 == 4 || itemViewType2 == 5 || itemViewType2 == 10) {
                            return 2;
                        }
                        return 1;
                    }
                    return 1;
                }
                if (C38371Gu8.A02(c38371Gu8, 0)) {
                    return 2;
                }
                return 1;
            default:
                return AbstractC154256wa.A00(C153766vl.A00((C153766vl) this.A01), i);
        }
        if (!(((C2US) interfaceC09390do.getValue()).getItem(i) instanceof C38321qM)) {
            return 3;
        }
        return 1;
    }
}
