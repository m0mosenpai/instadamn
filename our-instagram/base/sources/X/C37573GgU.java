package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37573GgU {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final Context A03;
    public final C37567GgN playerManager;

    public C37573GgU(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        this.A03 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.playerManager = new C37567GgN(context, interfaceC11380iw, userSession);
    }
}
