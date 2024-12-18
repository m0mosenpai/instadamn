package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HBm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38915HBm extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgOnlyCtmDisclosureBottomSheetFragment";
    public C18920wW A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_deeplink";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        Long A0j;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.ig_only_ctm_discloure_bottom_sheet);
        AbstractC31178DnM.A0C(A0S).setText(getString(2131963748));
        AbstractC167007dF.A0N(A0S, R.id.body).setText(getString(2131963746));
        C18920wW c18920wW = this.A00;
        if (c18920wW == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_ctm_ig_only_user_disclosure_view_event");
        if (A0f.isSampled()) {
            String A0t = AbstractC31173DnH.A0t(this.A01);
            if (A0t != null && (A0j = AbstractC166997dE.A0j(A0t)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A0f.A9K("user_igid", Long.valueOf(j));
            A0f.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1734770139);
        super.onCreate(bundle);
        this.A00 = AbstractC12220kQ.A02(AbstractC166987dD.A0o(this.A01));
        C0f9.A09(-1916293839, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(80021748);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ig_only_ctm_disclosure_bottom_sheet, viewGroup, false);
        C0f9.A09(522825916, A02);
        return inflate;
    }
}
