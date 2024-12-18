package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.BLt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25402BLt {
    public final long A00;
    public final Handler A01;
    public final C2XI A02;
    public final C2XI A03;
    public final UserSession A04;

    public C25402BLt(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        Boolean A0a = AbstractC166997dE.A0a();
        this.A02 = new C2XI(A0a);
        this.A03 = new C2XI(A0a);
        this.A01 = AbstractC167007dF.A0J();
        this.A00 = C18U.A01(C06090Tz.A05, userSession, 36604374176633919L);
    }
}
