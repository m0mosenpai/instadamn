package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.996, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass996 implements InterfaceC13000lm {
    public final C25671My A00;
    public final C23031Ai A02;
    public final UserSession A04;
    public final InterfaceC41501vz A01 = new InterfaceC41501vz() { // from class: X.998
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            C31311DpX c31311DpX;
            InterfaceC50428MOi interfaceC50428MOi;
            AnonymousClass996 anonymousClass996 = AnonymousClass996.this;
            C2Io c2Io = (C2Io) obj;
            DirectThreadKey directThreadKey = c2Io.A00;
            List list = c2Io.A03;
            if (TextUtils.isEmpty(directThreadKey.A00)) {
                C0w9.A03("DirectThreadUnsendWarningStatusController", "Thread id is null or empty.");
                return;
            }
            if (list == null || list.size() != 1) {
                return;
            }
            C9Q7 c9q7 = (C9Q7) list.get(0);
            if (!Boolean.TRUE.equals(c9q7.A01) || c9q7.A00 == C2EY.A0G || c9q7.A02 != C05F.A00) {
                return;
            }
            InterfaceC19630xq interfaceC19630xq = anonymousClass996.A02.A01;
            if (interfaceC19630xq.getBoolean(AbstractC111324zv.A00(3097), false) || !AnonymousClass996.A00(anonymousClass996)) {
                return;
            }
            String str = directThreadKey.A00;
            if (str != null) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77(AnonymousClass001.A0R(AbstractC111324zv.A00(1357), str), true);
                ARD.apply();
            }
            C9HY c9hy = (C9HY) anonymousClass996.A03.get(directThreadKey.A00);
            if (c9hy == null || (interfaceC50428MOi = (c31311DpX = c9hy.A00).A00) == null) {
                return;
            }
            interfaceC50428MOi.EJ0(c31311DpX);
        }
    };
    public final Map A03 = new HashMap();

    public static boolean A00(AnonymousClass996 anonymousClass996) {
        if (C18U.A06(C06090Tz.A05, anonymousClass996.A04, 36310430909464681L)) {
            InterfaceC19630xq interfaceC19630xq = anonymousClass996.A02.A01;
            if (!interfaceC19630xq.getBoolean(AbstractC111324zv.A00(5532), false) && interfaceC19630xq.getInt(AbstractC111324zv.A00(1358), 0) < 2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.clear();
        this.A00.A02(this.A01, C2Io.class);
    }

    public AnonymousClass996(C25671My c25671My, UserSession userSession, C23031Ai c23031Ai) {
        this.A04 = userSession;
        this.A02 = c23031Ai;
        this.A00 = c25671My;
    }
}
