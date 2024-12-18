package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Htm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40282Htm {
    public static Map A00(InterfaceC43560JLu interfaceC43560JLu) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43560JLu.B4z() != null) {
            A1I.put("fb_tag_id", interfaceC43560JLu.B4z());
        }
        if (interfaceC43560JLu.B50() != null) {
            A1I.put("fb_tag_name", interfaceC43560JLu.B50());
        }
        if (interfaceC43560JLu.B53() != null) {
            A1I.put("fb_tag_type", interfaceC43560JLu.B53());
        }
        if (interfaceC43560JLu.B54() != null) {
            A1I.put("fb_tag_url", interfaceC43560JLu.B54());
        }
        if (interfaceC43560JLu.getPk() != null) {
            A1I.put("pk", interfaceC43560JLu.getPk());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
