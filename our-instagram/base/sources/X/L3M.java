package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L3M {
    public final InterfaceC11380iw A00;
    public final C66362zD A01;
    public final UserSession A02;
    public final KD7 A03;
    public final Context A04;

    public L3M(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, KD7 kd7) {
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        this.A04 = context;
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = kd7;
        this.A01 = AbstractC31173DnH.A0R(C66362zD.A00(context), new KI6(this.A00, this.A02, new C48707Lgb(this)));
    }
}
