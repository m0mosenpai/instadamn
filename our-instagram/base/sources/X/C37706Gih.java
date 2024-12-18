package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gih, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37706Gih {
    public final boolean A02;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A00 = new ConcurrentHashMap();

    public final JIM A00(C120985dq c120985dq, C25370BKn c25370BKn) {
        JIM jim = (JIM) this.A01.get(c25370BKn);
        JIM jim2 = null;
        if (jim instanceof C37707Gii) {
            if ((!c120985dq.CdW() || !c120985dq.A06().A07()) && (!c120985dq.CdW() || !c120985dq.A06().A08())) {
                jim2 = (C37707Gii) jim;
            }
        } else if (jim instanceof C39489HcH) {
            if (c120985dq.CdW() && c120985dq.A06().A07()) {
                jim2 = (C39489HcH) jim;
            }
        } else {
            if (!(jim instanceof C38253Grw)) {
                return null;
            }
            if (c120985dq.CdW() && c120985dq.A06().A08()) {
                jim2 = (C38253Grw) jim;
            }
        }
        return jim2;
    }

    public C37706Gih(boolean z) {
        this.A02 = z;
    }
}
