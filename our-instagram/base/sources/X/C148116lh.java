package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148116lh {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC147266kB A05;
    public final boolean A06;
    public final UserSession A07;

    public C148116lh(UserSession userSession, InterfaceC147266kB interfaceC147266kB) {
        C14360o3.A0B(interfaceC147266kB, 1);
        C14360o3.A0B(userSession, 2);
        this.A05 = interfaceC147266kB;
        this.A07 = userSession;
        this.A01 = -1;
        this.A02 = -1;
        this.A00 = -1;
        this.A06 = C18U.A06(C06090Tz.A06, userSession, 36324776103850451L);
    }

    private final void A00(int i) {
        if ((this.A00 - i) % 2 == 0) {
            View A0D = ((C147256kA) this.A05).A04.A0D(i - 1);
            if (A0D != null && A0D.getAlpha() == 0.0f) {
                A0D.setAlpha(1.0f);
                this.A04 = false;
            }
        }
    }

    public static final void A01(C148116lh c148116lh, int i) {
        View A0D = ((C147256kA) c148116lh.A05).A04.A0D(i);
        if (A0D != null && A0D.getAlpha() == 0.0f) {
            c148116lh.A04 = true;
            if (c148116lh.A06) {
                c148116lh.A03 = true;
            }
            A0D.setAlpha(1.0f);
        }
    }

    public final void A02(int i) {
        boolean z = this.A06;
        boolean z2 = this.A04;
        if (!z) {
            if (z2) {
                A00(i);
                return;
            }
            return;
        }
        if (!z2 && !this.A03) {
            return;
        }
        A00(i);
        int i2 = this.A00;
        if (i2 <= 4 || (i2 - i) % 4 != 0) {
            return;
        }
        View A0D = ((C147256kA) this.A05).A04.A0D(i - 1);
        if (A0D == null || A0D.getAlpha() != 0.0f) {
            return;
        }
        A0D.setAlpha(1.0f);
        this.A03 = false;
    }
}
