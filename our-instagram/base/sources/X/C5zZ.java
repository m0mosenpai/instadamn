package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5zZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5zZ {
    public final C41761wQ A00;
    public final UserSession A01;
    public final C1341764d A02;
    public final C23031Ai A03;

    public C5zZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new C41761wQ(null);
        this.A02 = (C1341764d) userSession.A01(C1341764d.class, C64c.A00);
        this.A03 = AbstractC23021Ah.A00(userSession);
    }

    public final void A00(MQ7 mq7, boolean z) {
        this.A00.A02(AbstractC132055xg.A00(this.A01).A01(1, 1, z), new C49705Lxa(mq7, this));
    }
}
