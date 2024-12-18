package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KBh extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChannelsPerformanceFragment";
    public L1E A00;
    public L5F A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A04 = "channels_education";
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(new C37017GSy(this, 32), new C37017GSy(this, 33), new C50169MDw(42, this, null), AbstractC25225BEi.A1D(C25860BcF.class));
    public final InterfaceC16820sZ A05 = new C37017GSy(this, 31);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131955090);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new L1E(AbstractC166997dE.A0S(view, R.id.days_messaged));
        this.A01 = new L5F(requireContext(), AbstractC166997dE.A0S(view, R.id.recommend_actions), AbstractC166987dD.A0r(this.A02), this.A05);
        InterfaceC09390do interfaceC09390do = this.A03;
        C25860BcF c25860BcF = (C25860BcF) interfaceC09390do.getValue();
        C0UO c0uo = c25860BcF.A05;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c0uo), new MM0(this, 23), 25);
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c25860BcF.A04), new MM0(this, 24), 25);
        C25860BcF c25860BcF2 = (C25860BcF) interfaceC09390do.getValue();
        if (c25860BcF2.A01 != null) {
            AbstractC23641Du.A05(anonymousClass191, new D4v(c25860BcF2, null, 30), AbstractC141776au.A00(c25860BcF2));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(533899024);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_channel_performance, viewGroup, false);
        C0f9.A09(-1418735044, A02);
        return inflate;
    }
}
