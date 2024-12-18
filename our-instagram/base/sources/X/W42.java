package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W42 {
    public static final W42 A00 = new Object();

    public final void A00(C59392ni c59392ni, C69536Vr0 c69536Vr0) {
        Map map = c59392ni.A09;
        if (map != null) {
            c69536Vr0.A00("muxPrefetched", String.valueOf(map.get("started_as_prefetch")));
            c69536Vr0.A00("muxEncodedCount", String.valueOf(map.get("multiplex_enc_cnt")));
            c69536Vr0.A00("muxBitmapCount", String.valueOf(map.get("multiplex_bmp_cnt")));
            String valueOf = String.valueOf(map.get("last_scan_num"));
            if (!"0".equals(valueOf)) {
                c69536Vr0.A00("lastScanNum", valueOf);
            }
            c69536Vr0.A00("mp_resolution_code", String.valueOf(map.get("mp_resolution_code")));
            Object obj = map.get("mp_media_metadata");
            if (obj instanceof Map) {
                Iterator A15 = AbstractC166997dE.A15((Map) obj);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    c69536Vr0.A00(AbstractC167017dG.A0n(entry.getKey(), "mp_", new StringBuilder()), String.valueOf(entry.getValue()));
                }
            }
        }
    }
}
