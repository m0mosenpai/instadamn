package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N6i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52156N6i extends AbstractC59962oe implements InterfaceC187288Rv, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "HighlightsGridFragment";
    public final C54444O3y A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dvh() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963619);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "highlights_grid";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0c = AbstractC166987dD.A0c(view, R.id.loading_spinner);
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.highlights_recycler_view);
        A0B.setAdapter(((C54443O3x) this.A01.getValue()).A00);
        AbstractC50523MSb.A0r(this, A0B);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        A0B.setItemAnimator(c70623Ez);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) AbstractC166987dD.A0c(view, R.id.highlights_media_thumbnail_tray);
        C159407Da c159407Da = ((C50935Mf4) this.A06.getValue()).A01;
        Resources resources = view.getResources();
        new C187318Ry(requireContext, null, this, A0r, touchInterceptorFrameLayout, null, c159407Da, this, null, null, MXW.A00, C187308Rx.A00, 0.5625f, 2131968535, 0, resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) / 2, R.color.black_90_transparent, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, c07s, A0c, this, null, 17), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final void Dve(C26086BgF c26086BgF) {
        List list = ((C50935Mf4) this.A06.getValue()).A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((C51815MvJ) it.next()).A02);
        }
        AbstractC35084Fcv.A02(requireContext(), new P94(0, A0q, this), A0q);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ejf() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C52156N6i() {
        C57244PbS c57244PbS = new C57244PbS(this, 3);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57244PbS(new C57244PbS(this, 0), 1));
        this.A06 = AbstractC25225BEi.A0a(new C57244PbS(A00, 2), c57244PbS, new C57257Pbf(10, null, A00), AbstractC25225BEi.A1D(C50935Mf4.class));
        this.A04 = C1XM.A00(new GSv(this, 49));
        this.A02 = C1XM.A00(new GSv(this, 47));
        this.A00 = new C54444O3y(this);
        this.A01 = C1XM.A00(new GSv(this, 46));
        this.A03 = C1XM.A00(new GSv(this, 48));
        this.A05 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 9587 && i != 10005) {
            return;
        }
        AbstractC25226BEj.A1Q(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1656115553);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlights_grid_fragment, false);
        C0f9.A09(-1178169613, A02);
        return A0R;
    }
}
