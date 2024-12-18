package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ENf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32358ENf extends C53Z {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridNativeAndBloksBottomSheetInteropExampleFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_bloks_native_hybrid_native_and_bloks_bottom_sheet_interop_example";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(266229650);
        super.onCreate(bundle);
        C0f9.A09(-1593605768, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1178462080);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.native_and_blocks_bottom_sheet_example);
        View findViewById = A0A.findViewById(R.id.button);
        if (findViewById != null) {
            Fp1.A00(findViewById, 39, this);
        }
        C0f9.A09(1483845943, A02);
        return A0A;
    }
}
