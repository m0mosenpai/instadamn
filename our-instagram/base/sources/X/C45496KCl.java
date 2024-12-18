package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.KCl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45496KCl extends AbstractC59962oe implements InterfaceC187288Rv, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PlaylistReelsSelectionFragment";
    public View A00;
    public C27832COv A01;
    public RecyclerView A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(new D87(this, 18), new D87(this, 19), new C50169MDw(20, this, null), AbstractC25225BEi.A1D(C25840Bbv.class));

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
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969685);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "playlist_reels_selection_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view.findViewById(R.id.playlist_loading_image);
        this.A01 = new C27832COv(requireContext(), this, this);
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.playlist_recycler_view);
        A0B.setLayoutManager(new GridLayoutManager((Context) getActivity(), 3, 1, false));
        A0B.A10(new C195638l4(A0B.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material), false));
        C27832COv c27832COv = this.A01;
        if (c27832COv == null) {
            C14360o3.A0F("gridAdapter");
            throw C00O.createAndThrow();
        }
        A0B.setAdapter(c27832COv.A00);
        this.A02 = A0B;
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) AbstractC166987dD.A0c(view, R.id.playlist_media_thumbnail_tray);
        InterfaceC09390do interfaceC09390do = this.A04;
        C159407Da c159407Da = ((C25840Bbv) interfaceC09390do.getValue()).A00;
        Resources resources = view.getResources();
        new C187318Ry(requireContext, null, this, A0r, touchInterceptorFrameLayout, null, c159407Da, this, null, null, MXW.A00, C187308Rx.A00, 0.5625f, 2131968535, 0, resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) / 2, R.color.black_90_transparent, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
        C57312k6 A0a = AbstractC25229BEm.A0a(this);
        D4v d4v = new D4v(this, null, 15);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, d4v, A0a);
        AbstractC23641Du.A05(anonymousClass191, new D4v(this, null, 16), AbstractC25229BEm.A0a(this));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
        AbstractC23641Du.A05(anonymousClass191, new D4v(A0Z, null, 19), AbstractC25235BEs.A0W(A0Z, anonymousClass191, new D4v(A0Z, null, 18), AbstractC25235BEs.A0W(A0Z, anonymousClass191, new D4v(A0Z, null, 17), AbstractC141776au.A00(A0Z))));
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
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
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC187288Rv
    public final void Dve(C26086BgF c26086BgF) {
        C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), this.A03);
        A0c.A0D(new C26757Bre());
        A0c.A04();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1439853924);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_playlist_reels_selection, viewGroup, false);
        C0f9.A09(-736013365, A02);
        return inflate;
    }
}
