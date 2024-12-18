package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107544sz {
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A02 = new ArrayList();
    public final ArrayList A01 = new ArrayList();

    public static void A00(AbstractC107574t2 abstractC107574t2, AbstractC107574t2 abstractC107574t22, String str) {
        if (abstractC107574t2.A02.remove(abstractC107574t22)) {
            Map map = abstractC107574t22.A03;
            if (map != null && map.remove(str) != null) {
                return;
            } else {
                throw new RuntimeException(AnonymousClass001.A0R("Tried to remove non-existent input with name: ", str));
            }
        }
        throw new RuntimeException("Tried to remove non-existent input!");
    }
}
