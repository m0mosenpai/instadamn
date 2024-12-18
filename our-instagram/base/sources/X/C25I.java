package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.25I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25I {
    public InterfaceC449925e A00;
    public C55867OrH A01;
    public C19860yG A02;
    public final InterfaceC449925e A03;
    public final InterfaceC449925e A04;
    public final InterfaceC449925e A05;
    public final C25S A06;
    public final AnonymousClass260 A07;
    public final C451825y A08;
    public final UserSession A09;
    public final C451225r A0A;

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0yG, java.lang.Object] */
    public C25I(Context context, UserSession userSession) {
        C55866OrG c55866OrG;
        this.A09 = userSession;
        this.A06 = C25O.A00(userSession);
        C14360o3.A0B(userSession, 0);
        this.A05 = (C449725c) userSession.A01(C449725c.class, C25Z.A00);
        this.A04 = AbstractC451025p.A00(userSession);
        C14360o3.A0B(context, 0);
        if (C1C0.A00(userSession)) {
            c55866OrG = (C55866OrG) userSession.A01(C55866OrG.class, new C57535Pg9(17, context, userSession));
        } else {
            c55866OrG = null;
        }
        this.A03 = c55866OrG;
        this.A0A = (C451225r) userSession.A01(C451225r.class, C451125q.A00);
        C451825y c451825y = C451825y.A01;
        if (c451825y == null) {
            c451825y = new C451825y(userSession);
            C451825y.A01 = c451825y;
        }
        this.A08 = c451825y;
        AnonymousClass260 anonymousClass260 = AnonymousClass260.A01;
        if (anonymousClass260 == null) {
            anonymousClass260 = new AnonymousClass260(userSession);
            AnonymousClass260.A01 = anonymousClass260;
        }
        this.A07 = anonymousClass260;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36318703016483239L)) {
            this.A00 = AnonymousClass263.A00(userSession);
        }
        if (C18U.A06(c06090Tz, userSession, 36313600595331244L)) {
            this.A02 = new Object();
        }
        if (C18U.A06(c06090Tz, userSession, 36310808866586931L)) {
            C55867OrH c55867OrH = C55867OrH.A02;
            if (c55867OrH == null) {
                c55867OrH = new C55867OrH(context);
                C55867OrH.A02 = c55867OrH;
            }
            this.A01 = c55867OrH;
        }
    }
}
