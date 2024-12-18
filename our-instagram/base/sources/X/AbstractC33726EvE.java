package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EvE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33726EvE {
    public static Map A00(InterfaceC37266GbJ interfaceC37266GbJ) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37266GbJ.getMediaId() != null) {
            A1I.put("media_id", interfaceC37266GbJ.getMediaId());
        }
        if (interfaceC37266GbJ.Baq() != null) {
            A1I.put("pac_ad_media_ids", interfaceC37266GbJ.Baq());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
