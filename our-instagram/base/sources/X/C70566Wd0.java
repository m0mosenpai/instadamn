package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wd0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70566Wd0 implements C2JL {
    public final Vg6 A00;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // X.C2JL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(X.AnonymousClass436 r42) {
        /*
            Method dump skipped, instructions count: 3310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70566Wd0.onSuccess(X.436):void");
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        Vg6 vg6 = this.A00;
        UserSession userSession = vg6.A00;
        AbstractC31546DtW.A00(userSession, C05F.A1F, "IGFetcherCallback: Failed to fetch promotions from GQL", null);
        vg6.A01.A0W(new C117145Rz(null, userSession.userId));
    }

    public C70566Wd0(UserSession userSession, C4O8 c4o8) {
        this.A00 = new Vg6(userSession, c4o8.A03);
    }
}
