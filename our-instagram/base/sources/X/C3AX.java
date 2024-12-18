package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3AX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AX {
    public final C3AW A00;
    public final UserSession A01;

    public C3AX(UserSession userSession, C3AW c3aw, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        this.A01 = userSession;
        if (C18U.A06(C06090Tz.A05, userSession, 36315498975071587L)) {
            c3aw = new C42611xp(userSession).A01(str);
        } else if (c3aw == null) {
            c3aw = AbstractC1571473t.A00(userSession);
        }
        this.A00 = c3aw;
    }

    public final /* bridge */ /* synthetic */ C9BW A00(C3AR c3ar, List list, boolean z) {
        C93144Fq A02 = AbstractC42951yN.A00(c3ar.A00).A02(this.A00, c3ar.A01, new C206969Eb(list, 40));
        if (A02 != null && A02.hasNext()) {
            boolean z2 = false;
            if (z) {
                z2 = true;
            }
            C9BW A00 = C93144Fq.A00(A02, z2);
            if (!list.contains(A00.A00)) {
                throw new IllegalArgumentException(AbstractC111324zv.A00(23));
            }
            return A00;
        }
        return null;
    }
}
