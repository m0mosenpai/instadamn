package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Eue, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33690Eue {
    public static Map A00(InterfaceC104834np interfaceC104834np) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104834np.B21() != null) {
            A1I.put("end_scene_length", interfaceC104834np.B21());
        }
        if (interfaceC104834np.B7T() != null) {
            A1I.put("follower_count", interfaceC104834np.B7T());
        }
        if (interfaceC104834np.CTs() != null) {
            A1I.put("is_end_scene_permanent", interfaceC104834np.CTs());
        }
        if (interfaceC104834np.Bb3() != null) {
            A1I.put("page_name", interfaceC104834np.Bb3());
        }
        if (interfaceC104834np.getSubtitle() != null) {
            A1I.put("subtitle", interfaceC104834np.getSubtitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
