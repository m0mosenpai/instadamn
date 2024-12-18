package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.release.lockout.DogfoodingEligibilityApi;

/* renamed from: X.3EW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EW {
    public final Context A00;
    public final Handler A01;
    public final C41451vu A02;
    public final UserSession A03;
    public final InterfaceC19630xq A04;
    public final DogfoodingEligibilityApi A05;
    public final C3EZ A06;
    public final int A07;
    public final EnumC12920le A08;
    public final C13920nI A09;
    public final boolean A0A;
    public final boolean A0B;

    public C3EW(Context context, Handler handler, C41451vu c41451vu, EnumC12920le enumC12920le, UserSession userSession, C13920nI c13920nI, InterfaceC19630xq interfaceC19630xq, DogfoodingEligibilityApi dogfoodingEligibilityApi, C3EZ c3ez, int i, boolean z, boolean z2) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c41451vu, 3);
        C14360o3.A0B(c13920nI, 5);
        C14360o3.A0B(enumC12920le, 10);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = c41451vu;
        this.A04 = interfaceC19630xq;
        this.A09 = c13920nI;
        this.A01 = handler;
        this.A06 = c3ez;
        this.A05 = dogfoodingEligibilityApi;
        this.A0A = z;
        this.A08 = enumC12920le;
        this.A0B = z2;
        this.A07 = i;
    }

    public final void A01(FragmentActivity fragmentActivity, C19L c19l) {
        C140966Yy c140966Yy;
        C26788BsC A00;
        if (this.A0A) {
            if (this.A08 == EnumC12920le.A0C) {
                UserSession userSession = this.A03;
                if (C18U.A06(C06090Tz.A05, userSession, 36318960714521394L)) {
                    InterfaceC19630xq interfaceC19630xq = this.A04;
                    if (interfaceC19630xq.getBoolean("lockout_active", false)) {
                        c140966Yy = new C140966Yy(fragmentActivity, userSession);
                        A00 = AbstractC27703CJw.A00(userSession, true, false);
                    } else {
                        long j = interfaceC19630xq.getLong("snooze_expiration_lockout_manager", 0L);
                        if (j != 0 && System.currentTimeMillis() < j) {
                            return;
                        }
                        AbstractC23641Du.A05(AnonymousClass191.A00, new PZL(fragmentActivity, this, null, 6), c19l);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                boolean z = this.A0B;
                int i = this.A07;
                if (z) {
                    if (i < 14) {
                        return;
                    }
                } else if (i < 7) {
                    return;
                }
                UserSession userSession2 = this.A03;
                c140966Yy = new C140966Yy(fragmentActivity, userSession2);
                A00 = AbstractC27703CJw.A00(userSession2, true, true);
            }
            c140966Yy.A0B(null, A00);
            c140966Yy.A04();
        }
    }

    public final void A00(long j) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E7G("snooze_expiration_lockout_manager", System.currentTimeMillis() + j);
        ARD.apply();
    }

    public final void A02(boolean z) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E77("lockout_active", z);
        ARD.apply();
    }

    public final boolean A03() {
        if (!C18U.A06(C06090Tz.A05, this.A03, 36318960714652467L)) {
            return false;
        }
        long j = this.A04.getLong(AbstractC111324zv.A00(898), 0L);
        if (j == 0 || System.currentTimeMillis() >= j) {
            return false;
        }
        return true;
    }
}
