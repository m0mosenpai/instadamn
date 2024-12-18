package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;

/* loaded from: classes7.dex */
public final class HCK extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op {
    public static final String __redex_internal_original_name = "ShoppingTaggingFeedFragment";
    public int A00;
    public C56352iT A01;
    public IgdsInlineSearchBox A02;
    public RecyclerView A03;
    public final ID9 A04;
    public final IDA A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final C38385GuM A0H;
    public final C3I9 A0I;
    public final GZD A0J;
    public final InterfaceC09390do A07 = J8U.A00(this, 15);
    public final InterfaceC09390do A0D = J8U.A00(this, 20);
    public final InterfaceC09390do A0A = J8U.A00(this, 18);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_tagging_feed";
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
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        A0F.setAdapter(((IL8) this.A06.getValue()).A00);
        AbstractC31177DnL.A0s(requireContext(), A0F);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        A0F.setItemAnimator(c70623Ez);
        A0F.A14(this.A0H);
        this.A03 = A0F;
        C153156uj c153156uj = new C153156uj(A0F.A0D, new C42508Irn(this, 14), C153146ui.A0B, false, false);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.A14(c153156uj);
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
            igdsInlineSearchBox.A02 = this.A0J;
            igdsInlineSearchBox.setImeOptions(6);
            this.A02 = igdsInlineSearchBox;
            this.A01 = C56342iS.A01(new ViewOnClickListenerC42033Ik2(this, 65), AbstractC31176DnK.A0C(view, R.id.action_bar_container));
            C57112jm c57112jm = (C57112jm) this.A0G.getValue();
            C71163Hc A00 = C71163Hc.A00(this);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                c57112jm.A08(recyclerView2, A00, new InterfaceC57142jp[0]);
                AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C38330GtP) this.A0E.getValue()).A00, C43361JEc.A01(this, 9), 14);
                C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 10);
                C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 11);
                C43172J6r.A03(this, AbstractC25235BEs.A0S(this), 12);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    public static final void A02(HCK hck, C38329GtO c38329GtO, C38330GtP c38330GtP) {
        boolean z;
        ShoppingTaggingFeedHeader shoppingTaggingFeedHeader;
        C56352iT c56352iT = hck.A01;
        if (c56352iT == null) {
            C14360o3.A0F("actionBarService");
            throw C00O.createAndThrow();
        }
        C38672GzD c38672GzD = (C38672GzD) c38330GtP.A00.A02();
        if (c38672GzD != null && (shoppingTaggingFeedHeader = c38672GzD.A01) != null) {
            z = shoppingTaggingFeedHeader.A05;
        } else {
            z = false;
        }
        c56352iT.Ect(A01(hck, c38329GtO, z), new ViewOnClickListenerC42033Ik2(hck, 67));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (((com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r11.A07.getValue()).A06 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.HCK r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCK.A04(X.HCK, boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C42346Ip8 A00 = I6K.A00(AbstractC166987dD.A0r(this.A0C));
        EnumC39554HdQ enumC39554HdQ = EnumC39554HdQ.A03;
        if (A00.A00.containsKey(enumC39554HdQ) && A00.A00.containsKey(enumC39554HdQ)) {
            A00.A01.flowMarkPoint(C42346Ip8.A00(enumC39554HdQ, A00), "shopping_creation_navigate_back", null);
        }
        if (!((ShoppingTaggingFeedArguments) this.A07.getValue()).A0I) {
            return false;
        }
        A04(this, true);
        return true;
    }

    public HCK() {
        J8U j8u = new J8U(this, 24);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8U(new J8U(this, 21), 22));
        this.A0E = AbstractC25225BEi.A0a(new J8U(A00, 23), j8u, C43208J8f.A00(null, A00, 13), AbstractC25225BEi.A1D(C38330GtP.class));
        this.A0G = AbstractC09440dt.A01(J8H.A00);
        this.A0F = C1XM.A00(new J8U(this, 25));
        this.A0B = J8U.A00(this, 19);
        this.A06 = J8U.A00(this, 14);
        this.A0J = new C42688Iuj(this, 5);
        this.A0H = new C38385GuM(this, 8);
        C3I8 A01 = C3I7.A01(this, false, false);
        A01.A9e(new C56177Owk(this, 11));
        this.A0I = A01;
        this.A04 = new ID9(this);
        this.A05 = new IDA(this);
        this.A08 = J8U.A00(this, 16);
        this.A09 = J8U.A00(this, 17);
        this.A0C = AbstractC60492pY.A02(this);
    }

    public static TaggingFeedSessionInformation A00(InterfaceC09390do interfaceC09390do) {
        return new TaggingFeedSessionInformation(((ShoppingTaggingFeedArguments) interfaceC09390do.getValue()).A0G, ((ShoppingTaggingFeedArguments) interfaceC09390do.getValue()).A0F);
    }

    public static final String A01(HCK hck, C38329GtO c38329GtO, boolean z) {
        int size;
        String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(hck), 2131961124);
        if (c38329GtO.A01() != null) {
            size = 1;
        } else {
            size = AbstractC41363ISq.A00((TaggingFeedMultiSelectState) c38329GtO.A04.getValue()).size();
            if (size <= 0) {
                return A0q;
            }
        }
        if (z) {
            StringBuilder A11 = AbstractC166997dE.A11(A0q);
            A11.append(" (");
            return AbstractC25236BEt.A0Z(A11, size);
        }
        return A0q;
    }

    public static final void A03(HCK hck, String str) {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A05();
        A0K.A0H = "shopping_tagging_error";
        A0K.A0D = str;
        A0K.A02 = hck.A00;
        AbstractC31178DnM.A1S(A0K);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1138111856);
        super.onCreate(bundle);
        ((C38330GtP) this.A0E.getValue()).A02("", true, null);
        if (((ShoppingTaggingFeedArguments) this.A07.getValue()).A0I) {
            C41234IMz A0N = AbstractC37301Gc2.A0N(this);
            ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = A0N.A02;
            InterfaceC02590Ai A00 = AbstractC37305Gc6.A00(AbstractC37300Gc1.A0C(A0N.A03), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_entry");
            A00.AAP("source_id", shoppingTaggingFeedArguments.A0C);
            A00.AAP("source_type", shoppingTaggingFeedArguments.A0D);
            A00.AAQ((C0Zx) A0N.A04.getValue(), "suggested_tags_info");
            AbstractC37304Gc5.A14(A00, shoppingTaggingFeedArguments);
        }
        C0f9.A09(743940529, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-252295730);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.shopping_tagging_feed_fragment, false);
        C0f9.A09(-1051248092, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2036988985);
        super.onPause();
        this.A0I.onStop();
        C0f9.A09(-222561253, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-819895980);
        super.onResume();
        this.A0I.Dnr(requireActivity());
        C0f9.A09(504209033, A02);
    }
}
