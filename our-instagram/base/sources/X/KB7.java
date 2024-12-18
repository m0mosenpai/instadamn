package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KB7 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgBloksNativeScreenDemoFragment";
    public C47522Kyp A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A01(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "NativeScreenDemo";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1371383097);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_native_screen_demo, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.submit_button);
        View findViewById2 = inflate.findViewById(R.id.edit_text);
        if (findViewById != null) {
            ViewOnClickListenerC48066LPr.A00(findViewById, 12, findViewById2, this);
        }
        C0f9.A09(1047380362, A02);
        return inflate;
    }
}
