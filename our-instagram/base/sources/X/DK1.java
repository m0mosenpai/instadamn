package X;

import androidx.compose.ui.window.PopupLayout;

/* loaded from: classes5.dex */
public final class DK1 extends C0YY implements InterfaceC16660sJ {
    public static final DK1 A00 = new DK1();

    public DK1() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PopupLayout popupLayout = (PopupLayout) obj;
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.A09();
        }
        return C0eB.A00;
    }
}
