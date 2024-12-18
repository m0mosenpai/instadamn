package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N7V extends C38K implements JPR {
    public static final String __redex_internal_original_name = "HighlightsMediaGridFragment";
    public C52193N8i A00;
    public UserSession A01;
    public int A02;
    public ViewOnTouchListenerC60632pm A03;
    public final C61372qz A04 = new C61372qz();

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_reel_highlights";
    }

    public static void A01(N7V n7v, Reel reel) {
        C55197Oe4.A00(n7v.A01).A08(reel);
        C52193N8i c52193N8i = n7v.A00;
        ArrayList A1F = AbstractC166987dD.A1F(C55197Oe4.A02(C55197Oe4.A00(n7v.A01)));
        NLo nLo = c52193N8i.A00;
        nLo.A04();
        c52193N8i.A02.clear();
        nLo.A0B(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            c52193N8i.A03.put(Long.valueOf(A0i.A1B()), A0i);
        }
        c52193N8i.A0C();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A01;
    }

    @Override // X.JPR
    public final void DXQ() {
        AbstractC13880nE.A0O(this.mView);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        AbstractC47119KsE.A00(AbstractC37300Gc1.A02(this), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-557114909);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        C52193N8i c52193N8i = new C52193N8i(requireContext(), this, this, this.A01);
        this.A00 = c52193N8i;
        A0U(c52193N8i);
        String string = requireArguments().getString("edit_highlights_reel_id");
        Reel A0R = MSY.A0R(this.A01, string);
        if (A0R != null) {
            A01(this, A0R);
        } else {
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            AbstractC82003lM.A00(userSession).A00(C3G5.A0I, new P8I(string, this, 0), string, "edit_reel_highlights", AbstractC166987dD.A1G());
        }
        this.A02 = AbstractC43594JPz.A06(requireContext());
        Context requireContext = requireContext();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        ViewOnTouchListenerC60632pm A00 = AbstractC60622pl.A00(requireContext, null, false);
        this.A03 = A00;
        this.A04.A01(A00);
        C0f9.A09(1733694971, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1130593271);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_feed);
        C0f9.A09(571127266, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(5672411);
        super.onDestroyView();
        C55197Oe4 A00 = C55197Oe4.A00(this.A01);
        A00.A06.remove(this.A00);
        C0f9.A09(686907666, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1796964403);
        super.onPause();
        AbstractC13880nE.A0O(this.mView);
        C0f9.A09(-1220706044, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03.A06(this.A00, getScrollingViewProxy(), this.A02);
        C55197Oe4 A00 = C55197Oe4.A00(this.A01);
        A00.A06.add(this.A00);
        AbstractC31178DnM.A0v(this);
    }
}
