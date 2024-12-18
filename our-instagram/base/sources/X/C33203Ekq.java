package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.Ekq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33203Ekq extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectReadReceiptControlFragment";
    public C36731GHa A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131974067);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_read_receipt_control";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        C14360o3.A0C(view2, MSV.A00(14));
        ((EmptyStateView) view2).A0P(EnumC153216up.A06);
        C36731GHa c36731GHa = this.A00;
        Context context = getContext();
        if (context != null) {
            str = context.getString(2131971520);
        } else {
            str = null;
        }
        c36731GHa.A0A = str;
        AbstractC166987dD.A1Z(new PZC(this, null, 41), AbstractC25235BEs.A0S(this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C33203Ekq() {
        C37061GUv A01 = C37061GUv.A01(this, 37);
        InterfaceC09390do A00 = C37061GUv.A00(C37061GUv.A01(this, 34), EnumC09460dv.A02, 35);
        this.A02 = AbstractC25225BEi.A0a(C37061GUv.A01(A00, 36), A01, new C57252Pba(25, null, A00), AbstractC25225BEi.A1D(C31801DyL.class));
        this.A00 = C36731GHa.A02(new C35745Fqd(this, 47), 2131971519, true);
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1964439611);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state, false);
        C0f9.A09(1268392461, A02);
        return A0R;
    }
}
