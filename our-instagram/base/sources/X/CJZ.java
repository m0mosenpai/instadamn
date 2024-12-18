package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public abstract class CJZ {
    public static final ComposeView A00(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        ComposeView A02 = AbstractC25319BIo.A02(abstractC59962oe, C5UA.A03(new C30209DSo(interfaceC11380iw, str, interfaceC16820sZ, z3, z), 1842693592), z2, false);
        A02.setTag("opal_floating_switch_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 85);
        int A0C = AbstractC166987dD.A0C(abstractC59962oe.requireContext(), 12);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = A0C;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = A0C;
        A02.setLayoutParams(layoutParams);
        return A02;
    }
}
