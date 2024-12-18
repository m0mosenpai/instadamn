package X;

import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26271Pi implements InterfaceC13000lm {
    public static final C26271Pi A02 = new C26271Pi(new SecureRandom());
    public final SecureRandom A00;
    public final Map A01 = new LinkedHashMap();

    public final C26281Pj A00(C1PC c1pc) {
        Map map = this.A01;
        Object obj = map.get(c1pc);
        if (obj == null) {
            obj = new C26281Pj(this.A00);
            map.put(c1pc, obj);
        }
        return (C26281Pj) obj;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Iterator it = this.A01.values().iterator();
        while (it.hasNext()) {
            ((C26281Pj) it.next()).A01(true);
        }
    }

    public C26271Pi(SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }
}
