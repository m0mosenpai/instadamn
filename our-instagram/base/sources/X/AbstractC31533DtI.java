package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DtI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31533DtI {
    public static Map A00(C44O c44o) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        c44o.AdZ();
        A1I.put("audience_type", Integer.valueOf(c44o.AdZ()));
        c44o.CPZ();
        A1I.put("is_added_to_inbox", Boolean.valueOf(c44o.CPZ()));
        if (c44o.CRS() != null) {
            A1I.put("is_collaborator", c44o.CRS());
        }
        if (c44o.CV3() != null) {
            A1I.put("is_follower", c44o.CV3());
        }
        if (c44o.CX3() != null) {
            A1I.put("is_invited_collaborator", c44o.CX3());
        }
        if (c44o.Cdv() != null) {
            A1I.put("is_subscriber", c44o.Cdv());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
