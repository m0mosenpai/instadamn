package X;

import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BIo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25319BIo {
    public static final ComposeView A01(AbstractC59962oe abstractC59962oe, InterfaceC16620sF interfaceC16620sF) {
        return A02(abstractC59962oe, interfaceC16620sF, false, false);
    }

    public static final ComposeView A02(AbstractC59962oe abstractC59962oe, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC16620sF, 5);
        ComposeView composeView = new ComposeView(abstractC59962oe.requireContext(), null, 0);
        composeView.setViewCompositionStrategy(C25320BIp.A00);
        composeView.setContent(C5UA.A03(new C25321BIq(abstractC59962oe, interfaceC16620sF, z2, z), 123176915));
        return composeView;
    }

    public static ComposeView A00(AbstractC59962oe abstractC59962oe, Object obj, int i) {
        return A01(abstractC59962oe, C5UA.A03(obj, i));
    }
}
