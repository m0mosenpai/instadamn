package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hq5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40079Hq5 {
    public static Map A00(JM7 jm7) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm7.B4o() != null) {
            A1I.put("fb_obid", jm7.B4o());
        }
        if (jm7.getFullName() != null) {
            A1I.put("full_name", jm7.getFullName());
        }
        if (jm7.Bhi() != null) {
            A1I.put("profile_deeplink", jm7.Bhi());
        }
        if (jm7.Bhz() != null) {
            A1I.put("profile_picture_url", jm7.Bhz());
        }
        if (jm7.BiG() != null) {
            A1I.put("profile_www_link", jm7.BiG());
        }
        if (jm7.getUsername() != null) {
            A1I.put(AbstractC37310GcC.A00(), jm7.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
