package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.L8u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47788L8u {
    public long A00;
    public long A01;
    public long A02;
    public final C24Q A03;

    public C47788L8u(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = new C24Q(userSession);
    }

    public final void A00(int i, int i2) {
        C24Q c24q = this.A03;
        c24q.A0A(this.A02, "camera_roll_acrs_count", String.valueOf(i));
        c24q.A0A(this.A02, "filtered_camera_roll_acrs_count", String.valueOf(i2));
        this.A02 = c24q.A02(246627450, this.A02);
    }

    public final void A01(boolean z) {
        long j = this.A00;
        if (j != 0) {
            C24Q c24q = this.A03;
            c24q.A0A(j, "is_empty_state", String.valueOf(z));
            this.A00 = c24q.A02(246622982, this.A00);
        }
        this.A00 = 0L;
    }
}
