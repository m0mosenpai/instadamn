package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.875, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass875 implements AnonymousClass876 {
    public int A00 = -1;
    public final UserSession A01;

    @Override // X.AnonymousClass876
    public final void EZO(int i) {
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A01).A01.ARD();
        ARD.E7D("music_duration_for_photo_last_selection", (int) (i / 1000));
        ARD.apply();
        this.A00 = i;
    }

    @Override // X.AnonymousClass876
    public final int BVm() {
        int i;
        int i2 = this.A00;
        if (i2 == -1) {
            UserSession userSession = this.A01;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36329461909569881L)) {
                i = (int) C18U.A01(c06090Tz, userSession, 36610936886401257L);
            } else {
                i = A00.A01.getInt("music_duration_for_photo_last_selection", 15);
            }
            int min = (int) (Math.min(i, 15) * 1000);
            this.A00 = min;
            return min;
        }
        return i2;
    }

    public AnonymousClass875(UserSession userSession) {
        this.A01 = userSession;
    }
}
