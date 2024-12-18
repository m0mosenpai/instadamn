package X;

import com.instagram.api.schemas.GatingResponseType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39934HnP {
    public static Map A00(InterfaceC109944xO interfaceC109944xO) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109944xO.Aam() != null) {
            A1I.put("alert_buttons", interfaceC109944xO.Aam());
        }
        if (interfaceC109944xO.Aan() != null) {
            A1I.put("alert_description", interfaceC109944xO.Aan());
        }
        if (interfaceC109944xO.Aao() != null) {
            A1I.put("alert_title", interfaceC109944xO.Aao());
        }
        if (interfaceC109944xO.AgN() != null) {
            A1I.put(AbstractC58317Pt9.A00(19), interfaceC109944xO.AgN());
        }
        if (interfaceC109944xO.AjH() != null) {
            A1I.put("buttons", interfaceC109944xO.AjH());
        }
        if (interfaceC109944xO.Ami() != null) {
            A1I.put("center_button", interfaceC109944xO.Ami());
        }
        if (interfaceC109944xO.Avq() != null) {
            A1I.put("date_gated_formatted", interfaceC109944xO.Avq());
        }
        if (interfaceC109944xO.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, interfaceC109944xO.getDescription());
        }
        if (interfaceC109944xO.B9V() != null) {
            GatingResponseType B9V = interfaceC109944xO.B9V();
            if (B9V != null) {
                str = B9V.A00;
            } else {
                str = null;
            }
            A1I.put("gating_type", str);
        }
        if (interfaceC109944xO.BR2() != null) {
            A1I.put("media_igid", interfaceC109944xO.BR2());
        }
        if (interfaceC109944xO.BUD() != null) {
            A1I.put("misinformation_type", interfaceC109944xO.BUD());
        }
        if (interfaceC109944xO.BaM() != null) {
            A1I.put("over_text", interfaceC109944xO.BaM());
        }
        if (interfaceC109944xO.Bf5() != null) {
            A1I.put("post_reveal_cta", interfaceC109944xO.Bf5());
        }
        if (interfaceC109944xO.getSessionId() != null) {
            A1I.put(AbstractC37310GcC.A01(0, 10, 123), interfaceC109944xO.getSessionId());
        }
        if (interfaceC109944xO.Bwd() != null) {
            A1I.put("show_notice", interfaceC109944xO.Bwd());
        }
        if (interfaceC109944xO.C8Q() != null) {
            A1I.put("time_gated", interfaceC109944xO.C8Q());
        }
        if (interfaceC109944xO.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC109944xO.getTitle(), A1I);
        }
        if (interfaceC109944xO.CCO() != null) {
            A1I.put("under_text", interfaceC109944xO.CCO());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
