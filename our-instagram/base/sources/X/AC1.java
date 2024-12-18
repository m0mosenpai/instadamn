package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* loaded from: classes4.dex */
public final class AC1 {
    public final /* synthetic */ C214619ez A00;

    public AC1(C214619ez c214619ez) {
        this.A00 = c214619ez;
    }

    public final void A00() {
        String str;
        C214619ez c214619ez = this.A00;
        AX0 ax0 = c214619ez.A06;
        if (ax0 == null) {
            str = "variantPickerController";
        } else {
            ShutterButton shutterButton = ax0.A03;
            if (shutterButton == null) {
                str = "shutterButton";
            } else {
                shutterButton.setLongPressEnabled(false);
                C23656Adr.A00(EnumC223239t9.A0V, c214619ez.A02());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A01() {
        String str;
        C214619ez c214619ez = this.A00;
        AX0 ax0 = c214619ez.A06;
        if (ax0 == null) {
            str = "variantPickerController";
        } else {
            ShutterButton shutterButton = ax0.A03;
            if (shutterButton == null) {
                str = "shutterButton";
            } else {
                shutterButton.setLongPressEnabled(true);
                C23656Adr.A00(EnumC223239t9.A0U, c214619ez.A02());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
