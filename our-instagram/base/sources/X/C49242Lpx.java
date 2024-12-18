package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lpx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49242Lpx implements InterfaceC50494MQx {
    public final C116155Nu A00;
    public final UserSession A01;
    public final C2IX A02;
    public final C6DQ A03;
    public final InterfaceC16660sJ A04;
    public final boolean A05;

    @Override // X.InterfaceC50494MQx
    public final C71933Kq Ctk() {
        int A02;
        int A06;
        int i;
        C116155Nu c116155Nu = this.A00;
        if (c116155Nu.A1R) {
            return new C71933Kq(c116155Nu.A08.A02, -1, -1);
        }
        int i2 = 0;
        if (this.A05) {
            if (!C14360o3.A0K(this.A01.userId, c116155Nu.A0j)) {
                C0K8.A0D("ArmadilloSupportedDirectNotificationBadgeUpdateStrategy", "Badge count calculation triggered by Armadillo notification sent to a non-active user. Armadillo does not support multi account yet so as a fallback we will just calculate badge account for the active user.");
            }
            int max = Math.max(0, this.A02.A00.getInt("direct_threads_badge_count", -1));
            C9BO c9bo = (C9BO) this.A03.A01.A0W();
            if (c9bo != null) {
                i2 = c9bo.A00;
            }
            return new C71933Kq(i2 + max, max, i2);
        }
        int i3 = c116155Nu.A08.A02;
        if (C14360o3.A0K(this.A01.userId, c116155Nu.A0j)) {
            InterfaceC19610xo ARD = this.A02.A00.ARD();
            ARD.E7D("direct_threads_badge_count", i3);
            ARD.apply();
            C9BO c9bo2 = (C9BO) this.A03.A01.A0W();
            if (c9bo2 != null) {
                i = c9bo2.A00;
            } else {
                i = 0;
            }
            i3 += i;
            C50B c50b = c116155Nu.A08;
            A02 = AbstractC25227BEk.A06(c50b.A05, -1);
            A06 = AbstractC25227BEk.A06(c50b.A04, 0) + i;
        } else {
            AbstractC43592JPx.A19(i3, this.A04);
            C50B c50b2 = c116155Nu.A08;
            A02 = AbstractC37302Gc3.A02(c50b2.A05);
            A06 = AbstractC25227BEk.A06(c50b2.A04, -1);
        }
        return new C71933Kq(i3, A02, A06);
    }

    @Override // X.InterfaceC50494MQx
    public final boolean Ek3() {
        return !this.A05;
    }

    @Override // X.InterfaceC50494MQx
    public final boolean Ek4() {
        if (!this.A05 && this.A00.A08 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC50494MQx
    public final boolean Ek5() {
        return !this.A05;
    }

    public C49242Lpx(C116155Nu c116155Nu, UserSession userSession, C2IX c2ix, C6DQ c6dq, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC37302Gc3.A1U(c6dq, c2ix);
        this.A01 = userSession;
        this.A00 = c116155Nu;
        this.A03 = c6dq;
        this.A02 = c2ix;
        this.A04 = interfaceC16660sJ;
        this.A05 = AbstractC47881LDb.A00(c116155Nu.A0g);
    }
}
