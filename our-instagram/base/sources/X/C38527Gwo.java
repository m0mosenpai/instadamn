package X;

import androidx.fragment.app.Fragment;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;

/* renamed from: X.Gwo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38527Gwo extends AbstractC08380c0 {
    public final /* synthetic */ C38931HCe A00;
    public final /* synthetic */ C38931HCe A01;

    public C38527Gwo(C38931HCe c38931HCe, C38931HCe c38931HCe2) {
        this.A01 = c38931HCe;
        this.A00 = c38931HCe2;
    }

    @Override // X.AbstractC08380c0, X.InterfaceC021908q
    public final void onPageSelected(int i) {
        String A07;
        String str;
        C38931HCe c38931HCe = this.A01;
        C39396Hag c39396Hag = c38931HCe.A02;
        if (c39396Hag == null) {
            str = "tabFragmentPagerAdapter";
        } else {
            EnumC39569Hdf enumC39569Hdf = (EnumC39569Hdf) c39396Hag.A02.get(i);
            C38931HCe c38931HCe2 = this.A00;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(c38931HCe.A0A);
            String A1A = AbstractC166987dD.A1A(enumC39569Hdf, c38931HCe.A09);
            String str2 = c38931HCe.A05;
            if (str2 == null) {
                str = "priorModule";
            } else {
                String str3 = c38931HCe.A06;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(c38931HCe2, A0o, 1), "instagram_shopping_tags_list_navigated_to_tab");
                if (A0f.isSampled()) {
                    AbstractC37300Gc1.A0n(A0f, str2);
                    if (A1A == null) {
                        A1A = "";
                    }
                    A0f.AAP("tags_list_tab_destination", A1A);
                    AbstractC37300Gc1.A0t(A0f, str3);
                    A0f.Cht();
                }
                IK7 ik7 = c38931HCe.A03;
                if (ik7 != null) {
                    int ordinal = enumC39569Hdf.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 0 && ordinal != 2 && ordinal != 3) {
                            throw B4Z.A00();
                        }
                        A07 = AbstractC55229Oez.A03(c38931HCe.requireContext(), c38931HCe.A01);
                    } else {
                        Fragment fragment = c38931HCe.A00;
                        if (fragment != null) {
                            if (fragment instanceof ShoppingMoreProductsFragment) {
                                A07 = ((ShoppingMoreProductsFragment) fragment).A07(c38931HCe.requireContext());
                            } else {
                                return;
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    ik7.A04.A0M(A07);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
