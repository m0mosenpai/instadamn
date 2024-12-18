package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes7.dex */
public final class HCE extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ShoppingShopManagementAddProductFragment";
    public View A00;
    public View A01;
    public FrameLayout A02;
    public RecyclerView A03;
    public C126545np A04;
    public C62862tP A05;
    public C6T7 A06;
    public IgdsInlineSearchBox A07;
    public C40963ICk A08;
    public C39049HGz A09;
    public HHA A0A;
    public C41207ILv A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC41501vz A0K;
    public final InterfaceC41501vz A0L;
    public final InterfaceC41501vz A0M;
    public final InterfaceC43413JGd A0T = new C42898IyC(this);
    public final C42842IxI A0J = new C42842IxI(this, 2);
    public final ID7 A0R = new ID7(this);
    public final InterfaceC43386JFb A0O = new C42836IxC(this, 2);
    public final JGR A0P = new C42838IxE(this);
    public final GZD A0N = new C42688Iuj(this, 3);
    public final C1I4 A0I = new C38385GuM(this, 6);
    public final InterfaceC43410JGa A0Q = new C42892Iy6(this);
    public final C42894Iy8 A0S = new C42894Iy8(this);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 != false) goto L6;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.0cb r1 = X.C17060sy.A01
            X.0do r0 = r3.A0G
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r1, r0)
            java.util.List r0 = r0.A0S()
            if (r0 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            r0 = 2131973936(0x7f135730, float:1.9584922E38)
            if (r1 == 0) goto L1e
        L1b:
            r0 = 2131952358(0x7f1302e6, float:1.9541156E38)
        L1e:
            r4.Efu(r0)
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            r0 = 2131961124(0x7f132524, float:1.9558936E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A0K = r0
            r1 = 63
            X.Ik2 r0 = new X.Ik2
            r0.<init>(r3, r1)
            X.AbstractC31176DnK.A1B(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCE.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "shop_manager_add_products";
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
        this.A08 = new C40963ICk(requireContext(), this, this.A0O, this.A0P, this.A0J, this.A0R);
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        this.A03 = A08;
        String str = "recyclerView";
        if (A08 != null) {
            A08.A14(this.A0I);
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                C40963ICk c40963ICk = this.A08;
                if (c40963ICk == null) {
                    str = "adapterWrapper";
                } else {
                    recyclerView.setAdapter(c40963ICk.A00.A00);
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        C70623Ez c70623Ez = new C70623Ez();
                        ((C3F0) c70623Ez).A00 = false;
                        recyclerView2.setItemAnimator(c70623Ez);
                        this.A00 = view.findViewById(R.id.product_source);
                        this.A01 = view.findViewById(R.id.product_source_divider);
                        this.A02 = (FrameLayout) view.findViewById(R.id.null_state_container);
                        C126545np c126545np = new C126545np(requireContext());
                        this.A04 = c126545np;
                        FrameLayout frameLayout = this.A02;
                        if (frameLayout == null) {
                            str = "nullStateContainer";
                        } else {
                            frameLayout.addView(c126545np);
                            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.search_box);
                            this.A07 = igdsInlineSearchBox;
                            if (igdsInlineSearchBox == null) {
                                str = "inlineSearchBox";
                            } else {
                                igdsInlineSearchBox.A02 = this.A0N;
                                C42508Irn c42508Irn = new C42508Irn(this, 12);
                                C153146ui c153146ui = C153146ui.A0B;
                                RecyclerView recyclerView3 = this.A03;
                                if (recyclerView3 != null) {
                                    C153156uj c153156uj = new C153156uj(recyclerView3.A0D, c42508Irn, c153146ui, false, false);
                                    RecyclerView recyclerView4 = this.A03;
                                    if (recyclerView4 != null) {
                                        recyclerView4.A14(c153156uj);
                                        this.A0B = new C41207ILv(view, this.A0T);
                                        C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 8);
                                        AbstractC37301Gc2.A0Q(this).A01.A06(getViewLifecycleOwner(), new C42078Ikl(this, 2));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    public HCE() {
        C43207J8e c43207J8e = new C43207J8e(this, 37);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43207J8e(new C43207J8e(this, 34), 35));
        this.A0H = AbstractC25225BEi.A0a(new C43207J8e(A00, 36), c43207J8e, C43208J8f.A00(null, A00, 9), AbstractC25225BEi.A1D(C38323GtI.class));
        this.A0K = C37816GkW.A00(this, 40);
        this.A0M = C37816GkW.A00(this, 42);
        this.A0L = C37816GkW.A00(this, 41);
        this.A0G = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            AbstractC37301Gc2.A0Q(this).A05.A01();
            IgdsInlineSearchBox igdsInlineSearchBox = this.A07;
            if (igdsInlineSearchBox == null) {
                C14360o3.A0F("inlineSearchBox");
                throw C00O.createAndThrow();
            }
            igdsInlineSearchBox.A01();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1597211169);
        super.onCreate(bundle);
        this.A0D = AbstractC153636vY.A01(requireArguments(), "waterfall_id");
        this.A0C = AbstractC153636vY.A01(requireArguments(), "prior_module");
        AbstractC37301Gc2.A0Q(this).A01("");
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        String str = this.A0D;
        if (str != null) {
            this.A09 = new C39049HGz(requireContext, A00, A0r, this.A0Q, "add_to_shop", str, "shop_manager_add_products");
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Context requireContext2 = requireContext();
            C08790ch A002 = AbstractC018607g.A00(this);
            String str2 = this.A0D;
            if (str2 != null) {
                this.A0A = new HHA(requireContext2, A002, A0r2, this.A0S, "shop_manager_add_products", str2, "shop_manager_add_products");
                this.A05 = C62862tP.A03(this, AbstractC166987dD.A0o(interfaceC09390do), null);
                C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
                A0Q.A01(this.A0K, C42234InK.class);
                A0Q.A01(this.A0M, C42236InM.class);
                A0Q.A01(this.A0L, C42235InL.class);
                C0f9.A09(1756438167, A02);
                return;
            }
        }
        C14360o3.A0F("waterfallId");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1496999179);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.shop_management_add_fragment, false);
        C0f9.A09(-474610390, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1794369738);
        super.onDestroy();
        C6T7 c6t7 = this.A06;
        if (c6t7 != null) {
            c6t7.A04();
        }
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A0G);
        A0Q.A02(this.A0K, C42234InK.class);
        A0Q.A02(this.A0M, C42236InM.class);
        A0Q.A02(this.A0L, C42235InL.class);
        C0f9.A09(1537060625, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-587556638);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A07;
        if (igdsInlineSearchBox == null) {
            C14360o3.A0F("inlineSearchBox");
            throw C00O.createAndThrow();
        }
        igdsInlineSearchBox.A03();
        super.onPause();
        C0f9.A09(-88708303, A02);
    }
}
