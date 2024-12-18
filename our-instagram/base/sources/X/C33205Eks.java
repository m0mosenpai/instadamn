package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Eks, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33205Eks extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiAgentEmbodimentThreadDetailFragment";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = C37050GUg.A00(this, 28);
    public final InterfaceC09390do A00 = C37050GUg.A00(this, 27);
    public final InterfaceC09390do A03 = C1XM.A00(GTW.A00);

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        C14360o3.A0B(layoutInflater, 0);
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        String string = requireArguments().getString("bot_id");
        if (string != null) {
            boolean A1T = AbstractC167007dF.A1T(((C163527Tp) this.A00.getValue()).A00(string));
            C36731GHa A02 = C36731GHa.A02(new C35731FqE(string, this, 0), AbstractC167027dH.A01(this.A03), A1T);
            A02.A03 = R.drawable.instagram_user_circle_pano_outline_24;
            setItems(AbstractC166987dD.A1J(A02));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_agent_embodiment_thread_detail_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(AbstractC167027dH.A01(this.A03));
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1510553517);
        super.onCreate(bundle);
        C0f9.A09(1545579654, A02);
    }
}
