package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.BrD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26732BrD extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PivotPageDefaultCtaFragment";
    public View A00;
    public IgdsButton A01;
    public C26831Bst A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pivot_page_default_cta_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.cta_button);
        ViewOnClickListenerC28666ClE.A01(igdsButton, 52, this);
        this.A01 = igdsButton;
        BY8.A00(getViewLifecycleOwner(), ((C25830Bbl) this.A03.getValue()).A01, DRR.A00(this, 1), 12);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26732BrD() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29888DGc.A00(C29888DGc.A00(this, 1), 2));
        C0YZ A1D = AbstractC25225BEi.A1D(C25830Bbl.class);
        this.A03 = AbstractC25225BEi.A0a(C29888DGc.A00(A00, 3), new D8J(5, A00, this), new D8J(4, null, A00), A1D);
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-361055100);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_cta_fragment, viewGroup, false);
        this.A00 = inflate;
        if (inflate == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        C0f9.A09(1893363603, A02);
        return inflate;
    }
}
