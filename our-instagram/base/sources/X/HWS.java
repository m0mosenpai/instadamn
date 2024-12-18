package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;

/* loaded from: classes7.dex */
public final class HWS extends C17T implements InterfaceC37931pa {
    @Override // X.InterfaceC37931pa
    public final String AgP() {
        String stringValue = getStringValue("bloks_app_id");
        if (stringValue != null) {
            return stringValue;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37931pa
    public final String Ata() {
        return getStringValue("cta_button_text");
    }

    @Override // X.InterfaceC37931pa
    public final BloksStoryNetegoCTAStyle Atn() {
        JD3 jd3 = JD3.A00;
        C14360o3.A0B(jd3, 1);
        return (BloksStoryNetegoCTAStyle) jd3.invoke(AbstractC31180DnO.A0k(getField_UNTYPED("cta_style")));
    }

    @Override // X.InterfaceC37931pa
    public final boolean B7p() {
        Boolean optionalBooleanValue = getOptionalBooleanValue("force_isolate_cta_button");
        if (optionalBooleanValue != null) {
            return optionalBooleanValue.booleanValue();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37931pa
    public final C38687GzS Bbj() {
        return new C38687GzS(new C58590PyH());
    }

    @Override // X.InterfaceC37931pa
    public final String CAR() {
        String stringValue = getStringValue("tracking_token");
        if (stringValue != null) {
            return stringValue;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37931pa
    public final boolean CS6() {
        Boolean optionalBooleanValue = getOptionalBooleanValue("is_cta_button_enabled");
        if (optionalBooleanValue != null) {
            return optionalBooleanValue.booleanValue();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37931pa
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40714I2u.A00(this));
    }

    @Override // X.InterfaceC37931pa
    public final int getDuration() {
        Integer optionalIntValue = getOptionalIntValue("duration");
        if (optionalIntValue != null) {
            return optionalIntValue.intValue();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37931pa
    public final String getId() {
        String stringValue = getStringValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (stringValue != null) {
            return stringValue;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37931pa
    public final String getTitle() {
        return getStringValue(DialogModule.KEY_TITLE);
    }

    @Override // X.InterfaceC37931pa
    public final C37921pZ F5Y() {
        String AgP = AgP();
        String stringValue = getStringValue("cta_button_text");
        BloksStoryNetegoCTAStyle Atn = Atn();
        int duration = getDuration();
        boolean B7p = B7p();
        return new C37921pZ(Bbj(), Atn, AgP, stringValue, getId(), getStringValue(DialogModule.KEY_TITLE), CAR(), duration, B7p, CS6());
    }
}
