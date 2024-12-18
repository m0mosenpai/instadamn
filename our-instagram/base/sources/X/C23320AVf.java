package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.AVf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23320AVf implements BD8 {
    public final /* synthetic */ C22973AAr A00;
    public final /* synthetic */ AKN A01;

    public C23320AVf(C22973AAr c22973AAr, AKN akn) {
        this.A01 = akn;
        this.A00 = c22973AAr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.7xa, java.lang.Object] */
    @Override // X.BD8
    public final void DdV(ACI aci) {
        String str;
        this.A01.A08.DfO(new Object());
        C23088AFw c23088AFw = this.A00.A00.A04;
        if (aci != null) {
            C214899fR.A00(c23088AFw.A00, AbstractC166987dD.A11(aci.A05), MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        C214899fR c214899fR = c23088AFw.A00;
        AAM aam = c214899fR.A06;
        if (aam == null) {
            str = "preCaptureUIController";
        } else {
            ShutterButton shutterButton = aam.A01;
            if (shutterButton != null) {
                shutterButton.Dp4("ar_ads");
            }
            ShutterButton shutterButton2 = aam.A01;
            if (shutterButton2 != null) {
                shutterButton2.setInnerCircleAlpha(0.0f);
            }
            AbstractC167007dF.A0w(aam.A00);
            String str2 = c214899fR.A0H;
            if (str2 == null) {
                str = "effectId";
            } else {
                C23088AFw.A00(c23088AFw, str2);
                C23656Adr.A00(EnumC223239t9.A0m, c214899fR.A02());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.7xa, java.lang.Object] */
    @Override // X.BD8
    public final void DdW(Exception exc) {
        this.A01.A08.DfO(new Object());
        this.A00.A00(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.7xa, java.lang.Object] */
    @Override // X.BD8
    public final void DdY(ACI aci) {
        this.A01.A08.DfO(new Object());
        AAM aam = this.A00.A00.A04.A00.A06;
        if (aam == null) {
            C14360o3.A0F("preCaptureUIController");
            throw C00O.createAndThrow();
        }
        ShutterButton shutterButton = aam.A01;
        if (shutterButton != null) {
            shutterButton.A03(C05F.A00);
        }
        ShutterButton shutterButton2 = aam.A01;
        if (shutterButton2 != null) {
            shutterButton2.setInnerCircleAlpha(1.0f);
        }
        AbstractC167007dF.A0x(aam.A00);
    }
}
