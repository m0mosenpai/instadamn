package X;

import java.util.Map;

/* renamed from: X.Pxc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58560Pxc {
    public static C58561Pxd A00(String name) {
        AbstractC61590RqE abstractC61590RqE;
        SXp sXp = SXp.A01;
        synchronized (sXp) {
            Map map = sXp.A00;
            if (map.containsKey(name)) {
                abstractC61590RqE = (AbstractC61590RqE) map.get(name);
            } else {
                throw AbstractC58318PtA.A0x(AnonymousClass001.A0g("Name ", name, " does not exist"));
            }
        }
        return new C58561Pxd(abstractC61590RqE);
    }
}
