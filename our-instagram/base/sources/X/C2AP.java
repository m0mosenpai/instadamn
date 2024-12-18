package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2AP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AP {
    public static final List A06 = AbstractC16960so.A1Q(EnumC456327x.A03, EnumC456327x.A09);
    public long A00;
    public long A01;
    public EnumC456327x A02;
    public final C006802i A03;
    public final UserSession A04;
    public final boolean A05;

    public /* synthetic */ C2AP(UserSession userSession) {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A0B(userSession, 0);
        boolean A062 = C18U.A06(C06090Tz.A05, userSession, 36328297973431740L);
        C14360o3.A0B(c006802i, 2);
        this.A04 = userSession;
        this.A03 = c006802i;
        this.A05 = A062;
    }

    public final void A00(long j) {
        int i;
        long j2;
        short s;
        long j3;
        EnumC456327x enumC456327x = this.A02;
        C006802i c006802i = this.A03;
        if (enumC456327x == null) {
            i = 191636345;
            if (c006802i.isMarkerOn(191636345)) {
                s = 4;
            } else {
                return;
            }
        } else {
            i = 191636345;
            c006802i.markerAnnotate(191636345, "blocking_type", String.valueOf(enumC456327x));
            EnumC456327x enumC456327x2 = this.A02;
            if (enumC456327x2 != null) {
                int ordinal = enumC456327x2.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 5) {
                        j3 = (C123815iv.A00() / 1000) + new C71603Jf(this.A04).A01();
                        long j4 = this.A01;
                        if (j3 < j4) {
                            j2 = this.A00 - j4;
                            c006802i.markerAnnotate(191636345, "delay_time", j2);
                            s = 2;
                        }
                        j2 = this.A00 - j3;
                        c006802i.markerAnnotate(191636345, "delay_time", j2);
                        s = 2;
                    }
                } else {
                    C08730cb c08730cb = C17060sy.A01;
                    UserSession userSession = this.A04;
                    InterfaceC223716s C45 = c08730cb.A01(userSession).A03.C45();
                    if (C45 != null && !C14360o3.A0K(C45.Ce0(), false) && !C14360o3.A0K(C45.CSI(), true) && C45.Bqo() != null) {
                        long A00 = new C29W(userSession).A00();
                        long A02 = C461529z.A02(userSession);
                        if (A02 - A00 > j) {
                            j2 = this.A00 - this.A01;
                            c006802i.markerAnnotate(191636345, "delay_time", j2);
                            s = 2;
                        } else {
                            j3 = this.A01 + (A00 - (A02 - j));
                            j2 = this.A00 - j3;
                            c006802i.markerAnnotate(191636345, "delay_time", j2);
                            s = 2;
                        }
                    }
                }
            }
            j2 = 0;
            c006802i.markerAnnotate(191636345, "delay_time", j2);
            s = 2;
        }
        c006802i.markerEnd(i, s);
    }
}
