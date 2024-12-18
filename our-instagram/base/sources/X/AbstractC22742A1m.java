package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.A1m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC22742A1m {
    public static Map A00(InterfaceC189148Zf interfaceC189148Zf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC189148Zf.AeK() != null) {
            A1I.put("auxiliary_message", interfaceC189148Zf.AeK());
        }
        if (interfaceC189148Zf.Aj8() != null) {
            A1I.put("button_text_color", interfaceC189148Zf.Aj8());
        }
        if (interfaceC189148Zf.AqZ() != null) {
            A1I.put("consumption_sheet_config", interfaceC189148Zf.AqZ().F7o());
        }
        if (interfaceC189148Zf.getEndBackgroundColor() != null) {
            A1I.put("end_background_color", interfaceC189148Zf.getEndBackgroundColor());
        }
        if (interfaceC189148Zf.B98() != null) {
            A1I.put("fundraiser_sticker_type", interfaceC189148Zf.B98());
        }
        if (interfaceC189148Zf.BFX() != null) {
            A1I.put("ig_charity_id", interfaceC189148Zf.BFX());
        }
        interfaceC189148Zf.BZy();
        A1I.put(AbstractC111324zv.A00(130), Integer.valueOf(interfaceC189148Zf.BZy()));
        if (interfaceC189148Zf.getPk() != null) {
            A1I.put("pk", interfaceC189148Zf.getPk());
        }
        if (interfaceC189148Zf.Bys() != null) {
            A1I.put("source_name", interfaceC189148Zf.Bys());
        }
        if (interfaceC189148Zf.getStartBackgroundColor() != null) {
            A1I.put("start_background_color", interfaceC189148Zf.getStartBackgroundColor());
        }
        if (interfaceC189148Zf.C3f() != null) {
            A1I.put("subtitle_color", interfaceC189148Zf.C3f());
        }
        if (interfaceC189148Zf.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, interfaceC189148Zf.getTitle());
        }
        if (interfaceC189148Zf.C8x() != null) {
            A1I.put("title_color", interfaceC189148Zf.C8x());
        }
        User CDj = interfaceC189148Zf.CDj();
        if (CDj != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
