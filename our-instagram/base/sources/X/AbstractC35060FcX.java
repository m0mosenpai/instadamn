package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FcX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35060FcX {
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.common.typedurl.ImageUrl A01(com.instagram.common.session.UserSession r4, com.instagram.model.direct.DirectShareTarget r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.3oG r3 = X.AbstractC31171DnF.A0O(r5)
            boolean r0 = X.AbstractC140946Yw.A08(r3)
            r2 = 0
            if (r0 == 0) goto L25
            X.2DS r1 = X.AbstractC28761aE.A00(r4)
            X.3oF r0 = X.AbstractC140946Yw.A01(r3)
            com.instagram.model.direct.DirectThreadKey r0 = X.AbstractC140956Yx.A01(r0)
            X.3kb r3 = r1.B3U(r0)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r5.A04
            if (r0 == 0) goto L26
            com.instagram.common.typedurl.ImageUrl r2 = r0.A02
        L25:
            return r2
        L26:
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r5.A05
            if (r0 == 0) goto L2d
            com.instagram.common.typedurl.ImageUrl r2 = r0.A00
            return r2
        L2d:
            if (r3 == 0) goto L25
            int r0 = r3.C7g()
            boolean r0 = X.C4GR.A02(r0)
            if (r0 == 0) goto L4c
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r3.At4()
            if (r0 == 0) goto L43
            com.instagram.common.typedurl.ImageUrl r2 = r0.A00
        L41:
            if (r2 != 0) goto L25
        L43:
            X.3AY r0 = A00(r4, r5)
            java.lang.Object r2 = r0.A00
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            return r2
        L4c:
            int r1 = r3.C7g()
            r0 = 29
            if (r1 != r0) goto L25
            X.3iy r0 = r3.A01
            X.3kP r0 = r0.A0t
            if (r0 == 0) goto L43
            com.instagram.common.typedurl.ImageUrl r2 = r0.A04
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35060FcX.A01(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectShareTarget):com.instagram.common.typedurl.ImageUrl");
    }

    public static final ImageUrl A02(UserSession userSession, DirectShareTarget directShareTarget) {
        C106414qv C7L;
        C14360o3.A0B(userSession, 0);
        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
        if (A0O instanceof InterfaceC2056098k) {
            return directShareTarget.A02;
        }
        if (AbstractC140946Yw.A08(A0O)) {
            C2DS A00 = AbstractC28761aE.A00(userSession);
            DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(A0O));
            C14360o3.A0B(A01, 0);
            C81663kb A03 = C2DU.A03((C2DU) A00, A01);
            if (A03 != null && (C7L = A03.C7L()) != null) {
                return AbstractC40161tk.A02(C7L.A00);
            }
            return null;
        }
        return null;
    }

    public static final C3AY A00(UserSession userSession, DirectShareTarget directShareTarget) {
        AbstractC167017dG.A1N(userSession, directShareTarget);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        List A18 = AbstractC31172DnG.A18(directShareTarget);
        directShareTarget.A0R();
        return AbstractC81683kd.A02(null, A0Y, null, A18);
    }
}
