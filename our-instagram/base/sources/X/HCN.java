package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCN extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC169507hQ, InterfaceC60122ou, JPR, GZD {
    public static final EnumC39617HeR A0D = EnumC39617HeR.A03;
    public static final String __redex_internal_original_name = "BrandSelectionFragment";
    public IgdsInlineSearchBox A00;
    public InterfaceC169517hR A01;
    public HEU A02;
    public C41762Ied A03;
    public J1K A04;
    public InterfaceC43455JHt A05;
    public ProductSourceOverrideState A06;
    public String A07;
    public final ID4 A0C = new ID4(this);
    public final ILC A0B = new ILC(this);
    public final J10 A0A = new J10(this, 3);
    public final C1I4 A09 = new C38385GuM(this, 4);
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(interfaceC169517hR, 0);
        Object Bov = interfaceC169517hR.Bov();
        C14360o3.A0C(Bov, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.shopping.model.productsource.BrandInfo>");
        A00(this, (List) Bov);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1.equals("entry_point_creator_swipe_up_to_shop") == false) goto L6;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r3) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L13
            java.lang.String r0 = "entry_point_creator_swipe_up_to_shop"
            boolean r1 = r1.equals(r0)
            r0 = 2131970253(0x7f1348cd, float:1.9577452E38)
            if (r1 != 0) goto L16
        L13:
            r0 = 2131970020(0x7f1347e4, float:1.957698E38)
        L16:
            X.AbstractC25229BEm.A1G(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCN.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "product_source_selection";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC169517hR interfaceC169517hR = this.A01;
        if (interfaceC169517hR == null) {
            C14360o3.A0F("brandSearchResultProvider");
            throw C00O.createAndThrow();
        }
        interfaceC169517hR.Eby(str);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A00 = igdsInlineSearchBox;
        if (igdsInlineSearchBox == null) {
            str = "inlineSearchBox";
        } else {
            igdsInlineSearchBox.A02 = this;
            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.recycler_view);
            recyclerView.A14(this.A09);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
            linearLayoutManager.A12(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            HEU heu = this.A02;
            if (heu == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(heu);
                J1K j1k = this.A04;
                if (j1k == null) {
                    str = "networkHelper";
                } else {
                    AbstractC37304Gc5.A0y(linearLayoutManager, recyclerView, j1k, C153146ui.A0A);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(HCN hcn, List list) {
        String str;
        HEU heu = hcn.A02;
        if (heu == null) {
            str = "adapter";
        } else {
            C14360o3.A0B(list, 0);
            List list2 = heu.A00;
            list2.clear();
            list2.addAll(list);
            heu.A00();
            InterfaceC43455JHt interfaceC43455JHt = hcn.A05;
            if (interfaceC43455JHt == null) {
                str = "emptyStateController";
            } else {
                interfaceC43455JHt.FAs();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JPR
    public final void DXZ() {
        String str;
        HEU heu = this.A02;
        if (heu == null) {
            str = "adapter";
        } else {
            if (heu.isEmpty()) {
                J1K j1k = this.A04;
                if (j1k == null) {
                    str = "networkHelper";
                } else if (!j1k.isLoading()) {
                    J1K.A00(j1k, true);
                    InterfaceC43455JHt interfaceC43455JHt = this.A05;
                    if (interfaceC43455JHt == null) {
                        str = "emptyStateController";
                    } else {
                        interfaceC43455JHt.FAs();
                    }
                }
            }
            C41762Ied c41762Ied = this.A03;
            if (c41762Ied == null) {
                str = "logger";
            } else {
                c41762Ied.A01 = A0D;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A03 == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        if (igdsInlineSearchBox == null) {
            C14360o3.A0F("inlineSearchBox");
            throw C00O.createAndThrow();
        }
        igdsInlineSearchBox.A03();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC39584Hdu enumC39584Hdu;
        String str;
        int A02 = C0f9.A02(2042816333);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if ("feed_tag_entrypoint".equals(requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY))) {
            AbstractC1566271k.A0R(AbstractC166987dD.A0r(this.A08), requireActivity(), "product_source_selection");
        }
        this.A07 = requireArguments.getString("brand_selection_entry_point");
        String string = requireArguments.getString("surface");
        if (string != null) {
            enumC39584Hdu = EnumC39584Hdu.valueOf(string);
        } else {
            enumC39584Hdu = null;
        }
        ID4 id4 = this.A0C;
        InterfaceC09390do interfaceC09390do = this.A08;
        this.A04 = new J1K(requireContext(), AbstractC018607g.A00(this), AbstractC166987dD.A0r(interfaceC09390do), id4, enumC39584Hdu, this.A07);
        Object value = interfaceC09390do.getValue();
        C61972ry c61972ry = new C61972ry(requireContext(), AbstractC018607g.A00(this), null);
        C14360o3.A0B(value, 0);
        this.A01 = new C169337h7(c61972ry, new C36695GFq(value, 6), new C169487hO());
        this.A05 = new C42879Ixt(requireContext(), this.A0A);
        Context requireContext = requireContext();
        ILC ilc = this.A0B;
        InterfaceC43455JHt interfaceC43455JHt = this.A05;
        if (interfaceC43455JHt != null) {
            this.A02 = new HEU(requireContext, this, interfaceC43455JHt, ilc);
            this.A06 = (ProductSourceOverrideState) requireArguments.getParcelable("product_source_override_state");
            C41762Ied c41762Ied = new C41762Ied(AbstractC166987dD.A0r(interfaceC09390do), this, requireArguments.getString("prior_module_name"), requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY), requireArguments.getString("waterfall_id"), requireArguments.getBoolean("is_tabbed", false));
            this.A03 = c41762Ied;
            c41762Ied.A07(C41768Iek.A00(AbstractC166987dD.A0r(interfaceC09390do)), A0D, requireArguments.getString("initial_tab"));
            InterfaceC169517hR interfaceC169517hR = this.A01;
            if (interfaceC169517hR == null) {
                str = "brandSearchResultProvider";
            } else {
                interfaceC169517hR.EYJ(this);
                J1K j1k = this.A04;
                if (j1k == null) {
                    str = "networkHelper";
                } else {
                    J1K.A00(j1k, true);
                    InterfaceC43455JHt interfaceC43455JHt2 = this.A05;
                    if (interfaceC43455JHt2 != null) {
                        interfaceC43455JHt2.FAs();
                        C0f9.A09(373691881, A02);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "emptyStateController";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1524531152);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_brand_selection_fragment, viewGroup, false);
        C0f9.A09(558158450, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(82703615);
        super.onDestroy();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        if (igdsInlineSearchBox == null) {
            C14360o3.A0F("inlineSearchBox");
            throw C00O.createAndThrow();
        }
        igdsInlineSearchBox.A03();
        C0f9.A09(1353846949, A02);
    }
}
