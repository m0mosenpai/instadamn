package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DvJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31653DvJ extends AbstractRunnableC14200nk {
    public final /* synthetic */ C25201La A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31653DvJ(C25201La c25201La) {
        super(406, 4, true, true);
        this.A00 = c25201La;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25331Ln c25331Ln;
        C25201La c25201La = this.A00;
        if (!c25201La.A01) {
            C25301Lk c25301Lk = c25201La.A02;
            UserSession userSession = c25201La.A03;
            C34466FHe c34466FHe = (C34466FHe) c25301Lk.A02(AnonymousClass001.A0R("pending_reel_tray_seen_state_", userSession.userId), true);
            if (c34466FHe != null && (c25331Ln = c34466FHe.A00) != null) {
                c25201La.A00 = c25331Ln;
                c25301Lk.A04(AnonymousClass001.A0R("pending_reel_tray_seen_state_", userSession.userId));
            }
            c25201La.A01 = true;
        }
    }
}
