package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HsZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40210HsZ {
    public static Map A00(JML jml) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jml.Bno() != null) {
            A1I.put("repost_context", jml.Bno());
        }
        if (jml.Bnq() != null) {
            A1I.put("repost_fbid", jml.Bnq());
        }
        if (jml.Bnr() != null) {
            A1I.put("repost_id", jml.Bnr());
        }
        jml.Bnu();
        A1I.put("reposted_at", Long.valueOf(jml.Bnu()));
        if (jml.Bny() != null) {
            A1I.put("reposter", jml.Bny().A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
