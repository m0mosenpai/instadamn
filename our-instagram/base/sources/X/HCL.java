package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCL extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProductPickerFragment";
    public FrameLayout A00;
    public C126545np A01;
    public C62862tP A02;
    public C6T7 A03;
    public IgdsInlineSearchBox A04;
    public C41701IdV A05;
    public IL9 A06;
    public PIC A07;
    public ProductPickerArguments A08;
    public ProductSourceOverrideState A09;
    public RefreshableNestedScrollingParent A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public RecyclerView A0G;
    public C64842wi A0H;
    public C39049HGz A0I;
    public HHA A0J;
    public C41207ILv A0K;
    public String A0L;
    public final C38369Gu5 A0M;
    public final InterfaceC09390do A0N;
    public final C1I4 A0O;
    public final GZD A0P;
    public final InterfaceC58157PqM A0Q = new C42866Ixg(this, 0);
    public final InterfaceC43410JGa A0R;
    public final InterfaceC43411JGb A0S;
    public final ILB A0T;
    public final InterfaceC43413JGd A0U;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "product_search";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0E = view.requireViewById(R.id.product_source);
        this.A0F = view.requireViewById(R.id.product_source_divider);
        this.A00 = (FrameLayout) view.requireViewById(R.id.null_state_container);
        if (getContext() != null) {
            C126545np c126545np = new C126545np(requireContext());
            this.A01 = c126545np;
            FrameLayout frameLayout = this.A00;
            if (frameLayout != null) {
                frameLayout.addView(c126545np);
            }
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.requireViewById(R.id.refreshable_recycler_view_container);
            this.A0A = refreshableNestedScrollingParent;
            if (refreshableNestedScrollingParent != null) {
                refreshableNestedScrollingParent.A07 = new J1P(this, 4);
                this.A0G = AbstractC31176DnK.A0F(refreshableNestedScrollingParent);
            }
            RecyclerView recyclerView = this.A0G;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.A0M);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            RecyclerView recyclerView2 = this.A0G;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView3 = this.A0G;
            if (recyclerView3 != null) {
                recyclerView3.A14(this.A0O);
            }
            PIC pic = this.A07;
            String str = "networkHelper";
            if (pic != null) {
                C153156uj c153156uj = new C153156uj(linearLayoutManager, pic, C153146ui.A0B, false, false);
                RecyclerView recyclerView4 = this.A0G;
                if (recyclerView4 != null) {
                    recyclerView4.A14(c153156uj);
                }
                IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
                this.A04 = igdsInlineSearchBox;
                if (igdsInlineSearchBox != null) {
                    igdsInlineSearchBox.A02 = this.A0P;
                    igdsInlineSearchBox.setImeOptions(6);
                }
                this.A0K = new C41207ILv(view, this.A0U);
                if (AbstractC31176DnK.A0g(C17060sy.A01, this.A0N).A1Y()) {
                    HHA hha = this.A0J;
                    if (hha == null) {
                        str = "shopVisibilityController";
                    } else {
                        hha.A00();
                        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A0A;
                        if (refreshableNestedScrollingParent2 != null) {
                            refreshableNestedScrollingParent2.setVisibility(8);
                        }
                        View view2 = this.A0E;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        View view3 = this.A0F;
                        if (view3 != null) {
                            view3.setVisibility(8);
                        }
                        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A04;
                        if (igdsInlineSearchBox2 != null) {
                            igdsInlineSearchBox2.setEditTextAndCustomActionEnabled(false);
                            return;
                        }
                        return;
                    }
                } else {
                    PIC pic2 = this.A07;
                    if (pic2 != null) {
                        pic2.A06(true);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    private final String A00() {
        User user;
        ProductPickerArguments productPickerArguments = this.A08;
        if (productPickerArguments == null) {
            C14360o3.A0F("arguments");
            throw C00O.createAndThrow();
        }
        List list = productPickerArguments.A07;
        if ((list == null && (list = productPickerArguments.A08) == null) || list.isEmpty() || (user = AbstractC38048Gob.A00((ProductTag) AbstractC166987dD.A16(list)).A0B) == null) {
            return null;
        }
        return AbstractC76433bn.A00(user);
    }

    public static final void A01(ProductSource productSource, HCL hcl) {
        String str;
        C41207ILv c41207ILv;
        if (productSource != null) {
            PIC pic = hcl.A07;
            if (pic == null) {
                str = "networkHelper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            pic.A03(productSource);
        }
        C41207ILv c41207ILv2 = hcl.A0K;
        if (c41207ILv2 != null) {
            c41207ILv2.A00(productSource);
            ProductSourceOverrideState productSourceOverrideState = hcl.A09;
            str = "productSourceOverrideState";
            if (productSourceOverrideState != null) {
                ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState.A01;
                if (productSourceOverrideStatus != ProductSourceOverrideStatus.NONE && productSourceOverrideStatus != ProductSourceOverrideStatus.ALREADY_TAGGED && (c41207ILv = hcl.A0K) != null) {
                    c41207ILv.A00.setAlpha(0.5f);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C41701IdV c41701IdV = hcl.A05;
        if (c41701IdV == null) {
            str = "logger";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c41701IdV.A01 = productSource;
    }

    public static final boolean A02(HCL hcl) {
        User user;
        ProductPickerArguments productPickerArguments = hcl.A08;
        String str = null;
        if (productPickerArguments == null) {
            C14360o3.A0F("arguments");
            throw C00O.createAndThrow();
        }
        List list = productPickerArguments.A07;
        if (list == null) {
            list = productPickerArguments.A08;
        }
        if (list == null || list.isEmpty() || (user = AbstractC38048Gob.A00((ProductTag) list.get(0)).A0B) == null || AbstractC76433bn.A00(user) == null) {
            return false;
        }
        User user2 = AbstractC38048Gob.A00((ProductTag) list.get(0)).A0B;
        if (user2 != null) {
            str = AbstractC76433bn.A00(user2);
        }
        if (!C14360o3.A0K(str, AbstractC31173DnH.A0t(hcl.A0N))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            ProductSource A00 = C41768Iek.A00(AbstractC166987dD.A0r(this.A0N));
            if (A00 != null) {
                String str = "productSourceOverrideState";
                if (A00.A00 != EnumC39617HeR.A04) {
                    ProductSourceOverrideState productSourceOverrideState = this.A09;
                    if (productSourceOverrideState != null) {
                        if (A00.equals(productSourceOverrideState.A00)) {
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A01(A00, this);
                ProductSourceOverrideState productSourceOverrideState2 = this.A09;
                if (productSourceOverrideState2 != null) {
                    ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState2.A01;
                    String str2 = productSourceOverrideState2.A02;
                    C14360o3.A0B(productSourceOverrideStatus, 0);
                    this.A09 = new ProductSourceOverrideState(A00, productSourceOverrideStatus, str2);
                    PIC pic = this.A07;
                    str = "networkHelper";
                    if (pic != null) {
                        pic.A01();
                        C38369Gu5 c38369Gu5 = this.A0M;
                        c38369Gu5.A00 = C05F.A00;
                        c38369Gu5.A03.clear();
                        c38369Gu5.notifyDataSetChanged();
                        PIC pic2 = this.A07;
                        if (pic2 != null) {
                            pic2.A06(true);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0D) {
            C25671My A0Q = AbstractC31176DnK.A0Q(this.A0N);
            ProductPickerArguments productPickerArguments = this.A08;
            if (productPickerArguments == null) {
                C14360o3.A0F("arguments");
                throw C00O.createAndThrow();
            }
            Integer num = productPickerArguments.A01;
            String str = productPickerArguments.A05;
            C14360o3.A0B(num, 1);
            A0Q.E4s(new AbstractC56014Otl(num, str));
            return false;
        }
        return false;
    }

    public HCL() {
        ILB ilb = new ILB(this);
        this.A0T = ilb;
        this.A0P = new C42688Iuj(this, 2);
        this.A0O = new C38385GuM(this, 3);
        this.A0U = new C42897IyB(this);
        this.A0R = new C42891Iy5(this);
        this.A0S = new C42893Iy7(this);
        this.A0M = new C38369Gu5(this, ilb);
        this.A0D = true;
        this.A0C = true;
        this.A0N = AbstractC60492pY.A02(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ff, code lost:
    
        if (X.C14360o3.A0K(r6, r4.A04) == false) goto L91;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCL.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(454473633);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_picker, viewGroup, false);
        C0f9.A09(-1238109883, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-280017539);
        super.onDestroy();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A04;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        C6T7 c6t7 = this.A03;
        if (c6t7 != null) {
            c6t7.A04();
        }
        C0f9.A09(-102199492, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(375761699);
        this.A0G = null;
        this.A0A = null;
        this.A04 = null;
        this.A0E = null;
        this.A0F = null;
        this.A00 = null;
        this.A01 = null;
        C0f9.A09(1064489772, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2046850778);
        super.onPause();
        IL9 il9 = this.A06;
        if (il9 == null) {
            C14360o3.A0F("perfLogger");
            throw C00O.createAndThrow();
        }
        il9.A00();
        C0f9.A09(-1257730128, A02);
    }
}
