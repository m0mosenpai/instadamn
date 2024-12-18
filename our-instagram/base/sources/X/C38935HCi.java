package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HCi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38935HCi extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "CutoutStickerAttributionBottomSheetFragment";
    public final Integer A01 = C05F.A0u;
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cutout_sticker_attribution_bottomsheet_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.JPX
    public final Integer BlT() {
        return this.A01;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String string;
        Integer num;
        int A02 = C0f9.A02(1373465421);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_attribution_bottom_sheet_fragment, viewGroup, false);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("media_id")) != null) {
            InterfaceC09390do interfaceC09390do = this.A00;
            C38321qM A0F = AbstractC37304Gc5.A0F(string, interfaceC09390do);
            if (A0F == null) {
                i = -842501926;
            } else {
                Bundle bundle3 = this.mArguments;
                if (bundle3 != null) {
                    z = bundle3.getBoolean("is_story", false);
                }
                AbstractC31172DnG.A0G(inflate, R.id.cutout_sticker_attribution_recycler_view).setAdapter(new C38360Gtw(requireActivity(), getViewLifecycleOwner(), this, AbstractC166987dD.A0r(interfaceC09390do), A0F, HE0.A08.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), A0F, z), new C38247Grq(this, 0), z));
                C8EV c8ev = new C8EV(this, AbstractC166987dD.A0r(interfaceC09390do));
                if (z) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                C8EV.A00(c8ev, num, null, null, null, "attribution_list_impression");
                i = 451110859;
            }
        } else {
            i = -359058315;
        }
        C0f9.A09(i, A02);
        return inflate;
    }
}
