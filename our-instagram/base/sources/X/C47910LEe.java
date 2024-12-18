package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LEe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47910LEe {
    public final C006802i A00;
    public final C218914p A01;
    public final InterfaceC12870lZ A02;
    public final UserSession A03;

    public static final void A00(C47910LEe c47910LEe, short s) {
        c47910LEe.A00.markerEnd(31786177, s);
        C218914p.A06(c47910LEe.A02);
    }

    public C47910LEe(C006802i c006802i, C218914p c218914p, UserSession userSession) {
        AbstractC167017dG.A1Q(userSession, c218914p);
        this.A03 = userSession;
        this.A00 = c006802i;
        this.A01 = c218914p;
        YEY yey = new YEY(this, 1);
        this.A02 = yey;
        C218914p.A05(yey);
    }
}
