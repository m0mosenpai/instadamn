package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GlX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37877GlX {
    public static Map A00(InterfaceC131055vt interfaceC131055vt) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC131055vt.Ban() != null) {
            linkedHashMap.put("p_comment_button_tap_LOGGING_ONLY_DO_NOT_USE", AnonymousClass010.A0m(String.valueOf(interfaceC131055vt.Ban())));
        }
        if (interfaceC131055vt.Bao() != null) {
            linkedHashMap.put("p_reshare_button_tap", AnonymousClass010.A0m(String.valueOf(interfaceC131055vt.Bao())));
        }
        if (interfaceC131055vt.Bv3() != null) {
            linkedHashMap.put("should_force_new_preload_chaining", interfaceC131055vt.Bv3());
        }
        if (interfaceC131055vt.BvG() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(5356), interfaceC131055vt.BvG());
        }
        if (interfaceC131055vt.BvI() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(5357), interfaceC131055vt.BvI());
        }
        if (interfaceC131055vt.BvK() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(5359), interfaceC131055vt.BvK());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
