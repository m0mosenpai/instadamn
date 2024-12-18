package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.AAr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22973AAr {
    public final /* synthetic */ AAB A00;

    public C22973AAr(AAB aab) {
        this.A00 = aab;
    }

    public final void A00(Exception exc) {
        C214899fR c214899fR = this.A00.A04.A00;
        c214899fR.A02().A02(EnumC223239t9.A0k, "CAPTURE", String.valueOf(exc));
        AAM aam = c214899fR.A06;
        if (aam == null) {
            C14360o3.A0F("preCaptureUIController");
            throw C00O.createAndThrow();
        }
        ShutterButton shutterButton = aam.A01;
        if (shutterButton != null) {
            shutterButton.Dp4("ar_ads");
        }
        ShutterButton shutterButton2 = aam.A01;
        if (shutterButton2 != null) {
            shutterButton2.setInnerCircleAlpha(0.0f);
        }
        AbstractC167007dF.A0w(aam.A00);
    }
}
