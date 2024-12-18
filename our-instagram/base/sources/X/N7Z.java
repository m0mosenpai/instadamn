package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: classes9.dex */
public final class N7Z extends AbstractC60672pq implements CallerContextable {
    public static final String __redex_internal_original_name = "CtaSelectorFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cta_selector";
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31174DnI.A15(AbstractC31173DnH.A06(recyclerView, 0), recyclerView);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getScrollingViewProxy().EPJ(getAdapter());
        C50974Mfh c50974Mfh = (C50974Mfh) this.A01.getValue();
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), c50974Mfh.A01, C57747Pja.A00(this, 49), 65);
        JQ0.A11(this, PZV.A02(this, null, 0), c50974Mfh.A05);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public N7Z() {
        B5y b5y = new B5y(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B5y(new B5y(this, 45), 46));
        this.A01 = AbstractC25225BEi.A0a(new B5y(A00, 47), b5y, new C57256Pbe(43, null, A00), AbstractC25225BEi.A1D(C50974Mfh.class));
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-500988749);
        super.onCreate(bundle);
        requireArguments();
        setAdapter(new N8e(AbstractC166987dD.A0r(this.A00)));
        C0f9.A09(-576519206, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1503478136);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_cta_selector, viewGroup, false);
        C0f9.A09(1849842089, A02);
        return inflate;
    }
}
