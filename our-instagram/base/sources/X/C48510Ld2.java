package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ld2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48510Ld2 implements InterfaceC13000lm {
    public final Context A00;
    public final UserSession A02;
    public final C30T A03 = new Object();
    public final InterfaceC41501vz A01 = new C44288Jhe(this, 11);

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A02).A02(this.A01, C2Io.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.30T] */
    public C48510Ld2(Context context, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
    }
}
