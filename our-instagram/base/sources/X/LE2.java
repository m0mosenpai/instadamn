package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.File;

/* loaded from: classes8.dex */
public final class LE2 {
    public final UserSession A00;

    public LE2(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final LWT A00(UserSession userSession, DirectAnimatedMedia directAnimatedMedia, InterfaceC2056098k interfaceC2056098k, File file, String str) {
        C14360o3.A0B(interfaceC2056098k, 6);
        C19K A01 = AbstractC24771Iv.A01(1397460454, 3);
        InterfaceC16620sF mBk = new MBk(userSession, directAnimatedMedia, interfaceC2056098k, file, null, null, str, null);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        C50374MMb c50374MMb = new C50374MMb(AbstractC23651Dv.A01(anonymousClass191, A01));
        c50374MMb.A0W(num, c50374MMb, mBk);
        return c50374MMb.A00;
    }
}
