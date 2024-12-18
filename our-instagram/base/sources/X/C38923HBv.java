package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.HBv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38923HBv extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SuggestedCreatorsReelsFragment";
    public List A00;
    public boolean A01;
    public C39463Hbp A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "dev_options_suggested_creators_reels_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!this.A01) {
            C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(this.A03));
            A0M.A0B("discover/get_creators_in_reels_equivalent/");
            C1ON A0e = AbstractC25227BEk.A0e(A0M, HAG.class, ITJ.class);
            C39030HGg.A00(A0e, this, 30);
            schedule(A0e);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1129694469);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_creators, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC09390do interfaceC09390do = this.A03;
        C39463Hbp c39463Hbp = new C39463Hbp(A0R, AbstractC166987dD.A0r(interfaceC09390do));
        this.A02 = c39463Hbp;
        View view = c39463Hbp.itemView;
        AbstractC31172DnG.A1B(view.getContext(), view, android.R.color.black);
        AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do), true, false);
        C0f9.A09(245150806, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1817547576);
        super.onPause();
        C41761Iec.A03(this, AbstractC166987dD.A0r(this.A03));
        C0f9.A09(-829037637, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        List list;
        C39463Hbp c39463Hbp;
        int A02 = C0f9.A02(-80025185);
        super.onResume();
        if (this.A01 && (list = this.A00) != null && (c39463Hbp = this.A02) != null) {
            C37548Gg4.A0B.A06(requireActivity(), this, AbstractC166987dD.A0r(this.A03), c39463Hbp, list);
        }
        C0f9.A09(1946134484, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1308589795);
        super.onStop();
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A03), true, false);
        C0f9.A09(1569193122, A02);
    }
}
