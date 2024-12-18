package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EHv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32237EHv extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ShareToStoryNuxFragment";
    public int A00;
    public C2EE A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37017GSy(this, 40));
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "social_channel_share_to_story_nux_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.subtitle);
        C2EE c2ee = this.A01;
        if (c2ee == null) {
            C14360o3.A0F("threadViewModel");
            throw C00O.createAndThrow();
        }
        boolean A0K = C14360o3.A0K(c2ee.Asv(), AbstractC31173DnH.A0t(this.A03));
        int i = 2131959741;
        if (A0K) {
            i = 2131959740;
        }
        AbstractC25227BEk.A12(A0N, this, i);
        View A0S = AbstractC166997dE.A0S(view, R.id.primary_button);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.secondary_button);
        ViewOnClickListenerC35681FpG.A01(A0S, 22, this);
        ViewOnClickListenerC35681FpG.A01(A0S2, 23, this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-877124043);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_channel_share_to_story_nux, false);
        C0f9.A09(-894249878, A02);
        return A0R;
    }
}
