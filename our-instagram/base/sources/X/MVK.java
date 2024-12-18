package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MVK {
    public boolean A00;
    public final MVH A01;
    public final MVI A02;
    public final UserSession A03;
    public final C19L A04;

    /* JADX WARN: Multi-variable type inference failed */
    public MVK(UserSession userSession, C19L c19l) {
        this.A03 = userSession;
        this.A04 = c19l;
        MVH mvh = new MVH(null, 0 == true ? 1 : 0, 1);
        this.A01 = mvh;
        this.A02 = new MVI(AbstractC07080Za.A03(mvh));
    }
}
