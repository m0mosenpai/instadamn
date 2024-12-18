package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24341Hd {
    public long A00;
    public Boolean A01;
    public final long A02;
    public final boolean A03;

    public C24341Hd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A03 = C18U.A06(c06090Tz, userSession, 36311470291550744L);
        this.A02 = C18U.A01(c06090Tz, userSession, 36592945268327165L);
        boolean z = C218914p.A05;
        C218914p.A03(EnumC220415e.A03, new InterfaceC12870lZ() { // from class: X.1Hg
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-2103191842);
                C24341Hd c24341Hd = C24341Hd.this;
                if (c24341Hd.A03) {
                    c24341Hd.A00 = SystemClock.elapsedRealtime();
                } else {
                    c24341Hd.A01 = null;
                }
                C0f9.A0A(-101248391, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int i;
                int A03 = C0f9.A03(-392165990);
                C24341Hd c24341Hd = C24341Hd.this;
                if (!c24341Hd.A03) {
                    i = 260035646;
                } else {
                    long j = c24341Hd.A02;
                    if (j < 0) {
                        i = 1353020832;
                    } else {
                        if (SystemClock.elapsedRealtime() - c24341Hd.A00 > j) {
                            c24341Hd.A01 = null;
                        }
                        i = -1271058572;
                    }
                }
                C0f9.A0A(i, A03);
            }
        });
    }

    public final void A00(boolean z) {
        this.A01 = Boolean.valueOf(z);
    }
}
