package X;

import com.instagram.api.schemas.WhatsAppAttributionInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40454Hwj {
    public static Map A00(WhatsAppAttributionInfo whatsAppAttributionInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (whatsAppAttributionInfo.AYb() != null) {
            A1I.put("actionLink", whatsAppAttributionInfo.AYb());
        }
        if (whatsAppAttributionInfo.AZS() != null) {
            A1I.put("adWhatsAppNumber", whatsAppAttributionInfo.AZS());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
