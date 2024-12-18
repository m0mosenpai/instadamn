package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;
import java.util.Map;

/* renamed from: X.N6l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52159N6l extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "CreatorInspirationHubReelsFragment";
    public LinearLayoutManager A00;
    public RecyclerView A01;
    public C25896Bcx A02;
    public String A03;
    public List A04;
    public int A05;
    public C41711wL A06;
    public boolean A07;
    public final InterfaceC41501vz A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0G = C1XM.A00(new D88(this, 14));
    public final InterfaceC09390do A0M = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0H = C1XM.A00(new D88(this, 15));
    public final InterfaceC09390do A0I = C1XM.A00(new D88(this, 16));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_inspiration_hub_reels";
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
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.creator_inspiration_hub_reels_vscroll_recycler_view);
        this.A01 = A0B;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        this.A00 = linearLayoutManager;
        if (A0B != null) {
            A0B.setLayoutManager(linearLayoutManager);
            A0B.A10((AbstractC70653Fc) this.A0L.getValue());
            A0B.A14((C1I4) this.A0K.getValue());
        }
        C25896Bcx c25896Bcx = this.A02;
        if (c25896Bcx != null && A0B != null) {
            A0B.setAdapter(c25896Bcx);
        }
        JQ0.A11(this, new PZN(view, this, null, 34), ((C25852Bc7) this.A0F.getValue()).A07);
        D51.A02(this, AbstractC25235BEs.A0S(this), 48);
        C41711wL A01 = C41711wL.A01(AbstractC166987dD.A0r(this.A0M));
        this.A06 = A01;
        if (A01 != null) {
            this.A05 = A01.A09();
            C41711wL c41711wL = this.A06;
            if (c41711wL != null) {
                c41711wL.A0C(5);
                return;
            }
        }
        C14360o3.A0F("playerServiceController");
        throw C00O.createAndThrow();
    }

    public static final void A00(C52159N6l c52159N6l) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager = c52159N6l.A00;
        C3OO c3oo = null;
        if (linearLayoutManager != null && (recyclerView = c52159N6l.A01) != null) {
            c3oo = recyclerView.A0W(linearLayoutManager.A1c(), false);
        }
        if (c3oo instanceof C25943Bdk) {
            ((C25852Bc7) c52159N6l.A0F.getValue()).A08.Egh(c3oo);
            C25943Bdk c25943Bdk = (C25943Bdk) c3oo;
            c25943Bdk.A01.post(new D1G(c25943Bdk));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0M);
    }

    public C52159N6l() {
        D88 d88 = new D88(this, 10);
        D88 d882 = new D88(this, 22);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D88(d882, 23));
        this.A0F = AbstractC25225BEi.A0a(new D88(A00, 24), d88, new D8K(37, null, A00), AbstractC25225BEi.A1D(C25852Bc7.class));
        this.A0L = C1XM.A00(C57501Pfb.A00);
        D88 d883 = new D88(this, 8);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new D88(new D88(this, 25), 26));
        this.A0D = AbstractC25225BEi.A0a(new D88(A002, 27), d883, new D8K(38, null, A002), AbstractC25225BEi.A1D(Gt6.class));
        this.A0B = AbstractC166987dD.A1I();
        this.A0A = AbstractC166987dD.A1I();
        this.A09 = AbstractC166987dD.A1I();
        this.A0E = C1XM.A00(new D88(this, 9));
        this.A0C = C1XM.A00(new D88(this, 7));
        this.A08 = new C29152CtJ(this, 2);
        this.A0K = C1XM.A00(new D88(this, 21));
        this.A0J = C1XM.A00(new D88(this, 20));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(536432965);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_reels_fragment, viewGroup, false);
        C0f9.A09(-2019918224, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C62832tM c62832tM;
        int A02 = C0f9.A02(1515014076);
        super.onDestroy();
        this.A02 = null;
        String str = this.A03;
        if (str != null && (c62832tM = ((C25852Bc7) this.A0F.getValue()).A01) != null) {
            c62832tM.A07(str);
        }
        C0f9.A09(-1949955430, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1554612925);
        super.onDestroyView();
        int i = this.A05;
        if (i != 0) {
            C41711wL c41711wL = this.A06;
            if (c41711wL == null) {
                C14360o3.A0F("playerServiceController");
                throw C00O.createAndThrow();
            }
            c41711wL.A0C(i);
        }
        ((Gt6) this.A0D.getValue()).A0E();
        this.A01 = null;
        AbstractC31176DnK.A0Q(this.A0M).A02(this.A08, C55971Ot3.class);
        C0f9.A09(-1220201447, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1569202908);
        super.onPause();
        ((Gt6) this.A0D.getValue()).A0F();
        C0f9.A09(362463045, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Object obj;
        int A02 = C0f9.A02(104245369);
        super.onResume();
        C25863BcI c25863BcI = (C25863BcI) this.A0G.getValue();
        if (c25863BcI != null) {
            obj = c25863BcI.A03.getValue();
        } else {
            obj = null;
        }
        if (C14360o3.A0K(obj, "clips")) {
            C25943Bdk c25943Bdk = (C25943Bdk) ((C25852Bc7) this.A0F.getValue()).A08.getValue();
            if (c25943Bdk != null) {
                c25943Bdk.A01.post(new D1G(c25943Bdk));
            }
            Gt6 gt6 = (Gt6) this.A0D.getValue();
            gt6.A00 = false;
            Gt6.A01(gt6);
        }
        if (AbstractC167007dF.A1Z(this.A0I) && !this.A07) {
            this.A07 = true;
            ((C25852Bc7) this.A0F.getValue()).A00();
        }
        C0f9.A09(-160853488, A02);
    }
}
