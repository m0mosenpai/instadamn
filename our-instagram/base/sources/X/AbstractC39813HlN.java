package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HlN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39813HlN {
    public static Map A00(JKA jka) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jka.Byk() != null) {
            A1I.put("source_media_id", jka.Byk());
        }
        if (jka.Byp() != null) {
            A1I.put("source_media_username", jka.Byp());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
