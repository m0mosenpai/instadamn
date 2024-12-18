package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;

/* renamed from: X.Brk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26763Brk extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "WallFeedFragment";
    public View A00;
    public C189478aR A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final String A05;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object value = this.A03.getValue();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, value, c07s, this, null, 49), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26763Brk() {
        DGU dgu = new DGU(this, 21);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGU(new DGU(this, 23), 24));
        this.A03 = AbstractC25225BEi.A0a(new DGU(A00, 25), dgu, new C29895DGj(26, null, A00), AbstractC25225BEi.A1D(C25883Bcj.class));
        this.A02 = C1XM.A00(new DGU(this, 20));
        this.A04 = AbstractC60492pY.A02(this);
        this.A05 = "wonder_wall_feed";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_photo_list_pano_outline_24;
        c3lo.A05 = 2131952539;
        int i = 8;
        c3lo.A08 = 8;
        c3lo.A0G = ViewOnClickListenerC28666ClE.A00(this, 46);
        View AA9 = interfaceC56362iU.AA9(new C3LY(c3lo));
        this.A00 = AA9;
        if (((C26059Bfm) ((C25883Bcj) this.A03.getValue()).A09.getValue()).A05) {
            i = 0;
        }
        AA9.setVisibility(i);
        C7JA.A00(requireActivity(), interfaceC56362iU.C94(), AbstractC166987dD.A0r(this.A04), "WallFeed", AbstractC16960so.A1Q("wall_to_wall_activity_enabled", "post_preview_reply_enabled", "wall_activity_timeline_enabled", "profile_header_tooltip_max_count"), C7J9.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1395198474);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 33), 1228463928);
        C0f9.A09(34295017, A02);
        return A00;
    }
}
