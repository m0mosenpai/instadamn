package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.Rce, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60956Rce extends AbstractC60893Rb7 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FBPayAuthIgContainerFragment";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        Fragment A0O = getChildFragmentManager().A0O(R.id.container_fragment);
        if (A0O instanceof C58764Q7t) {
            interfaceC56362iU.EkF(true);
            interfaceC56362iU.EkS(true);
            int i = 2131962297;
            if (AbstractC58319PtB.A1O()) {
                i = 2131966640;
            }
            String string = A0O.getString(i);
            if (string != null) {
                interfaceC56362iU.setTitle(string);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        interfaceC56362iU.EkF(false);
    }
}
