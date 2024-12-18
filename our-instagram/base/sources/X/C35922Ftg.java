package X;

import android.content.ComponentCallbacks;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.Ftg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35922Ftg implements XA8 {
    public final /* synthetic */ W65 A00;
    public final /* synthetic */ ContextualFeedFragment A01;

    public C35922Ftg(W65 w65, ContextualFeedFragment contextualFeedFragment) {
        this.A01 = contextualFeedFragment;
        this.A00 = w65;
    }

    @Override // X.XA8
    public final void CuW() {
        YE3 ye3;
        ContextualFeedFragment contextualFeedFragment = this.A01;
        String str = contextualFeedFragment.A0R;
        if (str != null && (ye3 = contextualFeedFragment.A07) != null) {
            ye3.A06(AbstractC111324zv.A00(5093), "call_to_action", str, null);
            int ordinal = AbstractC40538HyK.A00(str).ordinal();
            if (ordinal != 1) {
                if (ordinal == 0) {
                    ComponentCallbacks componentCallbacks = contextualFeedFragment.mParentFragment;
                    if (componentCallbacks instanceof InterfaceC53892dT) {
                        C14360o3.A0C(componentCallbacks, AbstractC43591JPw.A00(22));
                    } else {
                        componentCallbacks = contextualFeedFragment.getRootActivity();
                    }
                    InterfaceC53892dT interfaceC53892dT = (InterfaceC53892dT) componentCallbacks;
                    if (interfaceC53892dT != null) {
                        interfaceC53892dT.FBp(new PositionConfig(null, new CameraConfiguration(C128535rM.A00, AbstractC166987dD.A1H()), null, "inspiration_hub_create_post", null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
                    }
                }
            } else {
                String str2 = contextualFeedFragment.A0Q;
                if (str2 != null) {
                    AbstractC69888VxF.A00().A09(contextualFeedFragment.requireActivity(), ContextualFeedFragment.A00(contextualFeedFragment), str2);
                }
            }
        }
        this.A00.A05(false);
    }
}
