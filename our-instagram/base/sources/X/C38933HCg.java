package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.Iterator;

/* renamed from: X.HCg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38933HCg extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC1571373s {
    public static final String __redex_internal_original_name = "ShoppingActivityFragment";
    public float A00;
    public C3FQ A01;
    public RecyclerView A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final C1I4 A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A06 = C1XM.A00(J8E.A00);
    public final InterfaceC09390do A0G = C43207J8e.A00(this, 15);
    public final InterfaceC09390do A09 = C43207J8e.A00(this, 8);
    public final InterfaceC09390do A0A = C43207J8e.A00(this, 9);
    public final InterfaceC09390do A0C = C43207J8e.A00(this, 12);
    public final InterfaceC09390do A0E = C43207J8e.A00(this, 14);
    public final InterfaceC09390do A0D = C43207J8e.A00(this, 13);
    public final InterfaceC09390do A0B = C43207J8e.A00(this, 11);
    public final InterfaceC09390do A04 = C43207J8e.A00(this, 4);

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
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
        ((C57112jm) AbstractC166987dD.A17(this.A0K)).A08(this.A02, C71163Hc.A00(this), new InterfaceC57142jp[0]);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 20), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
        ((C43034J0z) this.A07.getValue()).DDQ();
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        this.A07.getValue();
        C41598Ial A00 = C38326GtL.A00(this);
        C43172J6r.A03(A00, A00.A07, 36);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC37300Gc1.A0W(this.A06.getValue());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    public C38933HCg() {
        C43207J8e c43207J8e = new C43207J8e(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43207J8e(new C43207J8e(this, 16), 17));
        this.A0I = AbstractC25225BEi.A0a(new C43207J8e(A00, 18), c43207J8e, C43208J8f.A00(null, A00, 8), AbstractC25225BEi.A1D(C38326GtL.class));
        this.A05 = C43207J8e.A00(this, 5);
        this.A08 = C43207J8e.A00(this, 7);
        this.A0H = C43207J8e.A00(this, 19);
        this.A0J = C43207J8e.A00(this, 21);
        this.A0M = C43207J8e.A00(this, 10);
        this.A0K = C1XM.A00(J8F.A00);
        this.A03 = C43207J8e.A00(this, 3);
        this.A0L = new C38385GuM(this, 5);
        this.A07 = C43207J8e.A00(this, 6);
        this.A0F = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1179423303);
        super.onCreate(bundle);
        IMF imf = (IMF) this.A08.getValue();
        synchronized (imf) {
            try {
                java.util.Set set = imf.A04;
                set.add(AbstractC37303Gc4.A0N(set, 528295024));
                C006802i.A0p.markerStart(528295024);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int A0B = AbstractC167007dF.A0B(it);
                    C006802i c006802i = C006802i.A0p;
                    String str = imf.A03;
                    if (str != null) {
                        c006802i.markerAnnotate(A0B, "prior_module", str);
                    }
                    c006802i.markerAnnotate(A0B, "container_module", imf.A02);
                    c006802i.markerAnnotate(A0B, "analytics_page", "RECON_DESTINATION");
                    c006802i.markerAnnotate(A0B, "analytics_experience", "RECONSIDERATION");
                    String str2 = imf.A01;
                    if (str2 == null) {
                        str2 = "UNKNOWN";
                    }
                    c006802i.markerAnnotate(A0B, "analytics_referral_page", str2);
                    String str3 = imf.A00;
                    if (str3 == null) {
                        str3 = "UNKNOWN";
                    }
                    c006802i.markerAnnotate(A0B, "analytics_referral_experience", str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        registerLifecycleListener((C61582rL) this.A0H.getValue());
        C41598Ial A00 = C38326GtL.A00(this);
        C43172J6r.A03(A00, A00.A07, 34);
        C0f9.A09(1608849638, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-787566019);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview, false);
        RecyclerView A08 = AbstractC31180DnO.A08(A0R);
        this.A02 = A08;
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(A08.getContext());
        fastScrollingLinearLayoutManager.A12(true);
        A08.setLayoutManager(fastScrollingLinearLayoutManager);
        A08.setAdapter((C2UU) AbstractC166987dD.A17(this.A04));
        C3FQ A00 = C3FN.A00(A08);
        C14360o3.A0C(A00, AbstractC43591JPw.A00(434));
        C3FR c3fr = (C3FR) A00;
        c3fr.Ehc(new RunnableC43089J3e(this));
        this.A01 = c3fr;
        AbstractC37304Gc5.A0y(A08.A0D, A08, new C42508Irn(this, 11), new C153146ui(C05F.A00, C05F.A01, 2));
        A08.A14(this.A0L);
        A08.A14((C1I4) this.A0H.getValue());
        AbstractC37304Gc5.A1R((RefreshableNestedScrollingParent) A0R);
        C0f9.A09(-116279527, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-308718087);
        super.onDestroy();
        unregisterLifecycleListener((C61582rL) this.A0H.getValue());
        C0f9.A09(-388911976, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1515504739);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(1817631895, A02);
    }
}
