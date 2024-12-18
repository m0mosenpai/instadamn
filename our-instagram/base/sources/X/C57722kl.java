package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57722kl extends AbstractC57542kT {
    public final C25301Lk A00;
    public final String A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2km, X.1Li, java.lang.Object] */
    public static C57722kl A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57722kl c57722kl = (C57722kl) ((AbstractC57542kT) A00.A04.get(C57722kl.class));
        if (c57722kl == null) {
            Context context = AbstractC12290kX.A00;
            ?? obj = new Object();
            obj.A00 = userSession;
            C57722kl c57722kl2 = new C57722kl(new C25301Lk(context, (InterfaceC25281Li) obj, 528374993), userSession);
            A00.A03(c57722kl2, C57722kl.class);
            return c57722kl2;
        }
        return c57722kl;
    }

    public final C41160IJz A0L(Wm2 wm2) {
        String str = wm2.A00.A08;
        if (str == null) {
            str = "";
        }
        str.getClass();
        return (C41160IJz) A05(str);
    }

    public C57722kl(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = AnonymousClass001.A0R("pending_reel_slider_votes_", userSession.userId);
        this.A00 = c25301Lk;
    }
}
