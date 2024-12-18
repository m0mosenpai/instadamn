package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.943, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass943 implements InterfaceC13050lr {
    public static final AnonymousClass943 $redex_init_class = null;
    public final C2046894c A00;
    public final UserSession A01;
    public final List A02;
    public final List A03;
    public final InterfaceC09390do A04;
    public final Context A05;
    public final C3RT A06;
    public final AnonymousClass948 A07;
    public final AnonymousClass944 A08;
    public final AnonymousClass945 A09;
    public final AnonymousClass947 A0A;
    public final AnonymousClass946 A0B;

    static {
        AnonymousClass943.class.getCanonicalName();
    }

    public AnonymousClass943(Context context, UserSession userSession) {
        this.A05 = context;
        this.A01 = userSession;
        C3RT c3rt = new C3RT(userSession);
        this.A06 = c3rt;
        AnonymousClass944 anonymousClass944 = new AnonymousClass944(userSession);
        this.A08 = anonymousClass944;
        AnonymousClass945 anonymousClass945 = new AnonymousClass945(userSession);
        this.A09 = anonymousClass945;
        AnonymousClass946 anonymousClass946 = new AnonymousClass946(userSession);
        this.A0B = anonymousClass946;
        AnonymousClass947 anonymousClass947 = new AnonymousClass947(userSession);
        this.A0A = anonymousClass947;
        AnonymousClass948 anonymousClass948 = new AnonymousClass948(userSession);
        this.A07 = anonymousClass948;
        this.A03 = AbstractC16960so.A1Q(c3rt, anonymousClass944, anonymousClass945, c3rt, anonymousClass946, anonymousClass947, anonymousClass948);
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC16960so.A1Q((C94A) userSession.A01(AnonymousClass949.class, new C57254Pbc(12, context, userSession)), (C94A) userSession.A01(C94G.class, new C57254Pbc(21, context, userSession)), (C94A) userSession.A01(C94T.class, new C57255Pbd(2, context, userSession)), (C94A) userSession.A01(C94V.class, new C57255Pbd(8, context, userSession)), (C94A) userSession.A01(C94X.class, new C57510Pfk(userSession, 36)), (C94A) userSession.A01(C94Z.class, new C57255Pbd(6, context, userSession)), (C94A) userSession.A01(C2046794b.class, new C57254Pbc(18, context, userSession)));
        C17050sx A01 = AbstractC09440dt.A01(new C206859Dq(this, 27));
        this.A04 = A01;
        this.A00 = new C2046894c((InterfaceC10260gi) A01.getValue());
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }
}
