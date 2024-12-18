package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EfC extends EMV implements InterfaceC37125GXm {
    public static final String __redex_internal_original_name = "SeeOtherOptionSheetFragment";
    public final View.OnClickListener A02 = ViewOnClickListenerC35685FpK.A00(this, 34);
    public final View.OnClickListener A01 = ViewOnClickListenerC35685FpK.A00(this, 33);
    public final InterfaceC09390do A04 = AbstractC60492pY.A01(this);
    public final int A00 = -2;
    public final String A03 = "instagram_terms_flow";

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC37125GXm
    public final Integer B9K() {
        return C05F.A09;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1629088621);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.see_other_options_layout, viewGroup, false);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.help_center_button);
        View A0S2 = AbstractC166997dE.A0S(inflate, R.id.cancel_button);
        C0fQ.A00(this.A02, A0S);
        C0fQ.A00(this.A01, A0S2);
        C0f9.A09(-215215352, A02);
        return inflate;
    }
}
