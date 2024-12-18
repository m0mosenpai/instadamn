package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KBc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45467KBc extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BoostErrorFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "boost_error_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.title_view);
        if (A0e != null) {
            A0e.setText(2131974294);
        }
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.description_view);
        if (A0e2 != null) {
            A0e2.setText(2131961896);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-294254998);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.boost_error_fragment, false);
        C0f9.A09(574499886, A02);
        return A0R;
    }
}
