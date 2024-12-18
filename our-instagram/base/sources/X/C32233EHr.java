package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.EHr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32233EHr extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ChannelsListFragment";
    public C66362zD A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "channels_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.channels_list);
        this.A00 = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new EXX(this, this, null, requireContext().getColor(R.color.fds_transparent)));
        AbstractC31177DnL.A0s(requireContext(), recyclerView);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(((C31809DyT) this.A02.getValue()).A02), new C50370MLx(30, recyclerView, this), 5);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C32233EHr() {
        C37017GSy c37017GSy = new C37017GSy(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37017GSy(new C37017GSy(this, 35), 36));
        this.A02 = AbstractC25225BEi.A0a(new C37017GSy(A00, 37), c37017GSy, new C50169MDw(43, A00, null), AbstractC25225BEi.A1D(C31809DyT.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1234067214);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_channels_fragment, false);
        C0f9.A09(1597316329, A02);
        return A0R;
    }
}
