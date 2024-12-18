package X;

import com.instagram.api.schemas.OnImpressionStyle;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDQ {
    public static Map A00(InterfaceC104934o6 interfaceC104934o6) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104934o6.AyO() != null) {
            A1I.put("dismiss_icon", interfaceC104934o6.AyO());
        }
        if (interfaceC104934o6.BWP() != null) {
            A1I.put("negative_confirmation_body", interfaceC104934o6.BWP());
        }
        if (interfaceC104934o6.BWQ() != null) {
            A1I.put("negative_confirmation_cta_text", interfaceC104934o6.BWQ());
        }
        if (interfaceC104934o6.BWR() != null) {
            A1I.put("negative_confirmation_icon", interfaceC104934o6.BWR());
        }
        if (interfaceC104934o6.BWS() != null) {
            A1I.put("negative_confirmation_title", interfaceC104934o6.BWS());
        }
        if (interfaceC104934o6.BWT() != null) {
            A1I.put("negative_icon", interfaceC104934o6.BWT());
        }
        if (interfaceC104934o6.BWU() != null) {
            A1I.put("negative_text", interfaceC104934o6.BWU());
        }
        if (interfaceC104934o6.Beh() != null) {
            A1I.put("positive_confirmation_body", interfaceC104934o6.Beh());
        }
        if (interfaceC104934o6.Bei() != null) {
            A1I.put(AbstractC111324zv.A00(5068), interfaceC104934o6.Bei());
        }
        if (interfaceC104934o6.Bej() != null) {
            A1I.put("positive_confirmation_icon", interfaceC104934o6.Bej());
        }
        if (interfaceC104934o6.Bek() != null) {
            A1I.put("positive_confirmation_title", interfaceC104934o6.Bek());
        }
        if (interfaceC104934o6.Bel() != null) {
            A1I.put("positive_icon", interfaceC104934o6.Bel());
        }
        if (interfaceC104934o6.Bem() != null) {
            A1I.put("positive_text", interfaceC104934o6.Bem());
        }
        if (interfaceC104934o6.C35() != null) {
            OnImpressionStyle C35 = interfaceC104934o6.C35();
            if (C35 != null) {
                str = C35.A00;
            } else {
                str = null;
            }
            A1I.put("style", str);
        }
        if (interfaceC104934o6.C3Z() != null) {
            A1I.put("subtext", interfaceC104934o6.C3Z());
        }
        if (interfaceC104934o6.getText() != null) {
            A1I.put("text", interfaceC104934o6.getText());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
