package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Htj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40279Htj {
    public static Map A00(JMV jmv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmv.B4e() != null) {
            A1I.put(AbstractC111324zv.A00(408), jmv.B4e());
        }
        if (jmv.B4f() != null) {
            A1I.put("fb_entity_id", jmv.B4f());
        }
        if (jmv.B4g() != null) {
            A1I.put("fb_entity_subtype", jmv.B4g());
        }
        if (jmv.B4h() != null) {
            A1I.put("fb_entity_type", jmv.B4h());
        }
        if (jmv.B4i() != null) {
            A1I.put("fb_entity_url", jmv.B4i());
        }
        if (jmv.B4y() != null) {
            A1I.put(AbstractC111324zv.A00(409), jmv.B4y());
        }
        if (jmv.BTd() != null) {
            A1I.put("mib_extid", jmv.BTd());
        }
        if (jmv.getPk() != null) {
            A1I.put("pk", jmv.getPk());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
