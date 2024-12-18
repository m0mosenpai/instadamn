package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ENg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32359ENg extends C53Z {
    public static final String __redex_internal_original_name = "IgBloksNativeEmbeddedScreenFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_bloks_native_embedded_screen_example";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1243011902);
        super.onCreate(bundle);
        C0f9.A09(-1729593136, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-910499130);
        View inflate = layoutInflater.inflate(R.layout.native_bloks_embedded_and_screen_example, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.complex_type_example_input);
        View requireViewById2 = inflate.requireViewById(R.id.server_param_input);
        View requireViewById3 = inflate.requireViewById(R.id.client_input_param_input);
        View requireViewById4 = inflate.requireViewById(R.id.string_native_prop_input);
        View requireViewById5 = inflate.requireViewById(R.id.long_native_prop_input);
        C0fQ.A00(new ViewOnClickListenerC35633FoO(0, requireViewById4, requireViewById5, requireViewById2, requireViewById, requireViewById3, this), inflate.requireViewById(R.id.new_bloks_screen_button));
        C0f9.A09(-661091521, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1805103380);
        super.onDestroyView();
        C0f9.A09(896039378, A02);
    }
}
