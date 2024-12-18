package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;

/* loaded from: classes7.dex */
public final class HCO extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC189488aT {
    public static final String __redex_internal_original_name = "MultiProductPickerFragment";
    public InterfaceC41501vz A01;
    public IgdsInlineSearchBox A02;
    public ILO A03;
    public C41073IGq A04;
    public C41207ILv A05;
    public EnumC39584Hdu A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public RecyclerView A0B;
    public RecyclerView A0C;
    public IgSegmentedTabLayout A0D;
    public final IL9 A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final GZD A0Q;
    public final InterfaceC43386JFb A0R;
    public final JGR A0S;
    public final JGS A0T;
    public final InterfaceC43387JFc A0U;
    public final InterfaceC43413JGd A0V;
    public boolean A0E = true;
    public int A00 = -1;
    public boolean A0F = true;
    public final C2GS A0P = new C2GT(EnumC39534Hd4.A03);
    public final InterfaceC09390do A0N = AbstractC09440dt.A01(new C43207J8e(this, 1));
    public final InterfaceC09390do A0O = AbstractC09440dt.A01(new C43207J8e(this, 2));

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "multi_product_search";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.requireViewById(R.id.drag_handle).setVisibility(AbstractC167007dF.A05(requireArguments().getBoolean(AbstractC111324zv.A00(5362)) ? 1 : 0));
        this.A04 = new C41073IGq(requireContext(), this, this.A0R, this.A0S, this.A0U);
        C1I4 c38385GuM = new C38385GuM(this, 2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.products_recycler_view);
        recyclerView.A14(c38385GuM);
        C41073IGq c41073IGq = this.A04;
        if (c41073IGq == null) {
            str = "productsAdapterWrapper";
        } else {
            recyclerView.setAdapter(c41073IGq.A00.A00);
            this.A0C = recyclerView;
            C70623Ez c70623Ez = new C70623Ez();
            ((C3F0) c70623Ez).A00 = false;
            recyclerView.setItemAnimator(c70623Ez);
            C42508Irn c42508Irn = new C42508Irn(this, 10);
            C153146ui c153146ui = C153146ui.A0B;
            RecyclerView recyclerView2 = this.A0C;
            if (recyclerView2 != null) {
                C153156uj c153156uj = new C153156uj(recyclerView2.A0D, c42508Irn, c153146ui, false, false);
                RecyclerView recyclerView3 = this.A0C;
                if (recyclerView3 != null) {
                    recyclerView3.A14(c153156uj);
                    this.A03 = new ILO(requireContext(), this, this.A0T);
                    RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.collections_recycler_view);
                    recyclerView4.A14(c38385GuM);
                    ILO ilo = this.A03;
                    if (ilo == null) {
                        str = "collectionAdapterWrapper";
                    } else {
                        recyclerView4.setAdapter(ilo.A00);
                        this.A0B = recyclerView4;
                        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.search_box);
                        igdsInlineSearchBox.A02 = this.A0Q;
                        igdsInlineSearchBox.setImeOptions(6);
                        igdsInlineSearchBox.setHint(2131972993);
                        this.A02 = igdsInlineSearchBox;
                        ViewOnClickListenerC42033Ik2.A00(view.findViewById(R.id.done_button), 56, this);
                        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) view.findViewById(R.id.search_type_tab);
                        if (!this.A0E) {
                            igSegmentedTabLayout.setVisibility(8);
                        } else {
                            igSegmentedTabLayout.setVisibility(0);
                            igSegmentedTabLayout.A01(new ViewOnClickListenerC42033Ik2(this, 57), new C47673L3g(null, null, null, 2131975128, false));
                            igSegmentedTabLayout.A01(new ViewOnClickListenerC42033Ik2(this, 58), new C47673L3g(null, null, null, 2131975125, false));
                        }
                        this.A0D = igSegmentedTabLayout;
                        C41207ILv c41207ILv = new C41207ILv(view, this.A0V);
                        InterfaceC09390do interfaceC09390do = this.A0J;
                        c41207ILv.A00(((C38327GtM) interfaceC09390do.getValue()).A03);
                        this.A05 = c41207ILv;
                        registerLifecycleListener((C64742wY) this.A0L.getValue());
                        AbstractC55352ga abstractC55352ga = (AbstractC55352ga) this.A0K.getValue();
                        EnumC39584Hdu enumC39584Hdu = this.A06;
                        str = "surface";
                        if (enumC39584Hdu != null) {
                            abstractC55352ga.Dia(AbstractC167007dF.A0n("surface", enumC39584Hdu.A00));
                            C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 6);
                            View A0S = AbstractC166997dE.A0S(view, R.id.pin_products_cta);
                            C14360o3.A07(A0S.requireViewById(R.id.pin_product_button));
                            C14360o3.A07(A0S.requireViewById(R.id.pin_product_hint_text));
                            AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C38327GtM) interfaceC09390do.getValue()).A01, C43361JEc.A01(this, 5), 12);
                            C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 7);
                            AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C38322GtH) this.A0H.getValue()).A00, C43361JEc.A01(this, 6), 12);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("productsRecyclerView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final RecyclerView A00() {
        RecyclerView recyclerView;
        String str;
        int ordinal = ((EnumC39534Hd4) AbstractC37301Gc2.A0e(this.A0P)).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                recyclerView = this.A0B;
                if (recyclerView == null) {
                    str = "collectionsRecyclerView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return recyclerView;
            }
            throw B4Z.A00();
        }
        recyclerView = this.A0C;
        if (recyclerView == null) {
            str = "productsRecyclerView";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return recyclerView;
    }

    public static final void A01(EnumC39534Hd4 enumC39534Hd4, HCO hco) {
        String str;
        C2GS c2gs = hco.A0P;
        if (AbstractC37301Gc2.A0e(c2gs) != enumC39534Hd4) {
            c2gs.A0B(enumC39534Hd4);
            IgSegmentedTabLayout igSegmentedTabLayout = hco.A0D;
            if (igSegmentedTabLayout == null) {
                str = "tabLayout";
            } else {
                igSegmentedTabLayout.A00(enumC39534Hd4.ordinal(), true);
                RecyclerView recyclerView = hco.A0C;
                if (recyclerView == null) {
                    str = "productsRecyclerView";
                } else {
                    int i = 0;
                    int i2 = 8;
                    if (enumC39534Hd4 == EnumC39534Hd4.A03) {
                        i2 = 0;
                    }
                    recyclerView.setVisibility(i2);
                    RecyclerView recyclerView2 = hco.A0B;
                    if (recyclerView2 == null) {
                        str = "collectionsRecyclerView";
                    } else {
                        if (enumC39534Hd4 != EnumC39534Hd4.A02) {
                            i = 8;
                        }
                        recyclerView2.setVisibility(i);
                        IgdsInlineSearchBox igdsInlineSearchBox = hco.A02;
                        if (igdsInlineSearchBox == null) {
                            str = "inlineSearchBox";
                        } else {
                            A02(hco, igdsInlineSearchBox.getSearchString());
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A02(HCO hco, String str) {
        int ordinal = ((EnumC39534Hd4) AbstractC37301Gc2.A0e(hco.A0P)).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C38322GtH c38322GtH = (C38322GtH) hco.A0H.getValue();
                if (str == null) {
                    str = "";
                }
                c38322GtH.A01(str);
                return;
            }
            throw B4Z.A00();
        }
        C38327GtM A0P = AbstractC37301Gc2.A0P(hco);
        if (str == null) {
            str = "";
        }
        DHI dhi = new DHI(str, 3);
        AbstractC37304Gc5.A0x(A0P.A01, A0P.A02, dhi);
        C39333HYy c39333HYy = A0P.A04;
        ((PIC) c39333HYy).A01 = str;
        c39333HYy.A06(true);
    }

    private final boolean A03() {
        EnumC39617HeR enumC39617HeR;
        if (!AbstractC199308rX.A00(AbstractC166987dD.A0r(this.A0M))) {
            ProductSource productSource = AbstractC37302Gc3.A0N(AbstractC37301Gc2.A0P(this).A01).A00;
            if (productSource != null) {
                enumC39617HeR = productSource.A00;
            } else {
                enumC39617HeR = null;
            }
            if (enumC39617HeR != EnumC39617HeR.A03) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0M);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    public HCO() {
        C43206J8d c43206J8d = new C43206J8d(this, 42);
        C43206J8d c43206J8d2 = new C43206J8d(this, 45);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C43206J8d(c43206J8d2, 46));
        this.A0J = AbstractC25225BEi.A0a(new C43206J8d(A00, 47), c43206J8d, C43208J8f.A00(null, A00, 6), AbstractC25225BEi.A1D(C38327GtM.class));
        C43206J8d c43206J8d3 = new C43206J8d(this, 40);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C43206J8d(new C43206J8d(this, 48), 49));
        this.A0H = AbstractC25225BEi.A0a(new C43207J8e(A002, 0), c43206J8d3, C43208J8f.A00(null, A002, 7), AbstractC25225BEi.A1D(C38322GtH.class));
        this.A0I = C43206J8d.A00(this, 41);
        this.A0G = new IL9();
        this.A0L = C43206J8d.A00(this, 44);
        this.A0K = C43206J8d.A00(this, 43);
        this.A0Q = new C42688Iuj(this, 1);
        this.A0V = new C42896IyA(this);
        this.A0U = new C42842IxI(this, 1);
        this.A0R = new C42836IxC(this, 1);
        this.A0S = new C42837IxD(this);
        this.A0T = new C42841IxH(this);
        this.A0M = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return A00().getTop();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView A00 = A00();
        if (A00.getChildCount() != 0 && A00.computeVerticalScrollOffset() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 == -1) {
                ProductSource A00 = C41768Iek.A00(AbstractC166987dD.A0r(this.A0M));
                C38327GtM A0P = AbstractC37301Gc2.A0P(this);
                if (A00 != null && (A00.A00 == EnumC39617HeR.A04 || !A00.equals(AbstractC37302Gc3.A0N(A0P.A01).A00))) {
                    C43361JEc A01 = C43361JEc.A01(A00, 12);
                    AbstractC37304Gc5.A0x(A0P.A01, A0P.A02, A01);
                    C39333HYy c39333HYy = A0P.A04;
                    c39333HYy.A03(A00);
                    c39333HYy.A01();
                }
                C41207ILv c41207ILv = this.A05;
                if (c41207ILv == null) {
                    str = "productSourceRowController";
                } else {
                    c41207ILv.A00(A00);
                    IgdsInlineSearchBox igdsInlineSearchBox = this.A02;
                    if (igdsInlineSearchBox == null) {
                        str = "inlineSearchBox";
                    } else {
                        igdsInlineSearchBox.A01();
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (!A03()) {
                AbstractC167007dF.A0J().post(new RunnableC43088J3d(this));
            }
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        FragmentActivity requireActivity = requireActivity();
        Intent intent = new Intent();
        intent.putExtra(MSV.A00(57), new MultiProductPickerResult(null, null, AbstractC37302Gc3.A0N(AbstractC37301Gc2.A0P(this).A01).A03, AbstractC06930Yk.A0E()));
        requireActivity.setResult(-1, intent);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC39584Hdu enumC39584Hdu;
        int A02 = C0f9.A02(-806703923);
        super.onCreate(bundle);
        java.util.Set set = this.A0G.A00;
        set.add(AbstractC37303Gc4.A0N(set, 37369682));
        C006802i.A0p.markerStart(37369682);
        this.A07 = AbstractC153636vY.A01(requireArguments(), "prior_module_name");
        this.A09 = requireArguments().getBoolean(AbstractC111324zv.A00(4059));
        this.A08 = AbstractC153636vY.A01(requireArguments(), "waterfall_id");
        this.A0E = requireArguments().getBoolean(AbstractC111324zv.A00(4728));
        this.A00 = requireArguments().getInt(AbstractC111324zv.A00(1093));
        String string = requireArguments().getString("surface");
        if (string == null || (enumC39584Hdu = EnumC39584Hdu.valueOf(string)) == null) {
            enumC39584Hdu = EnumC39584Hdu.A08;
        }
        this.A06 = enumC39584Hdu;
        C38327GtM A0P = AbstractC37301Gc2.A0P(this);
        AbstractC37304Gc5.A0x(A0P.A01, A0P.A02, new DHI("", 3));
        C39333HYy c39333HYy = A0P.A04;
        ((PIC) c39333HYy).A01 = "";
        c39333HYy.A06(true);
        this.A0P.A0B(EnumC39534Hd4.A03);
        ((C41701IdV) AbstractC166987dD.A17(this.A0I)).A02();
        C0f9.A09(843290739, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(794483696);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.multi_product_picker, viewGroup, false);
        C0f9.A09(-2041393119, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1103081822);
        super.onDestroy();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A02;
        if (igdsInlineSearchBox == null) {
            C14360o3.A0F("inlineSearchBox");
            throw C00O.createAndThrow();
        }
        igdsInlineSearchBox.A03();
        C0f9.A09(-1174480256, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-951364108);
        super.onDestroyView();
        this.A0F = true;
        unregisterLifecycleListener((C64742wY) this.A0L.getValue());
        C0f9.A09(1403202783, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1806960707);
        super.onPause();
        this.A0G.A00();
        C0f9.A09(328479999, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1238210959);
        super.onResume();
        if (!A03() && this.A0F) {
            this.A0V.DbQ();
        }
        this.A0F = false;
        C0f9.A09(597807443, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-445280947);
        super.onStop();
        InterfaceC41501vz interfaceC41501vz = this.A01;
        if (interfaceC41501vz != null) {
            AbstractC31176DnK.A0Q(this.A0M).A02(interfaceC41501vz, C42248InY.class);
        }
        this.A0A = false;
        C0f9.A09(174817148, A02);
    }
}
