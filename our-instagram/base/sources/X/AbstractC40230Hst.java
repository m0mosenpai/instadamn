package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hst, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40230Hst {
    public static Map A00(JKU jku) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jku.Bcz() != null) {
            A1I.put("photo_url", jku.Bcz());
        }
        if (jku.CFd() != null) {
            A1I.put("video_url", jku.CFd());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
