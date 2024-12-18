package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EPy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32423EPy extends C2US {
    public final C32467ERt A00;
    public final User A01;
    public final C31566Dts A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32423EPy(Context context, AbstractC018607g abstractC018607g, C684436h c684436h, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GIQ giq, GYQ gyq, InterfaceC77483dY interfaceC77483dY, User user, String str, boolean z) {
        super(false);
        C14360o3.A0B(userSession, 10);
        this.A01 = user;
        C32467ERt c32467ERt = new C32467ERt(abstractC018607g, c684436h, interfaceC11380iw, userSession, giq, interfaceC77483dY, str, z);
        this.A00 = c32467ERt;
        C31566Dts c31566Dts = new C31566Dts(context, gyq);
        this.A02 = c31566Dts;
        init(c32467ERt, c31566Dts);
    }
}
