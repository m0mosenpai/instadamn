package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;

/* renamed from: X.3VI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VI implements InterfaceC12870lZ, InterfaceC13000lm {
    public C140286Wg A00;
    public UserSession A01;
    public String A02;
    public boolean A03;
    public final String A04;
    public final String A05;
    public final int A06;
    public final InterfaceC41501vz A07;
    public final C3VK A08;

    public static synchronized void A00(Context context, UserSession userSession) {
        synchronized (C3VI.class) {
            if (((C3VI) userSession.A00(C3VI.class)) == null) {
                C3VI c3vi = new C3VI(context, userSession);
                if (Build.VERSION.SDK_INT >= 29) {
                    C218914p.A08.A0B(c3vi);
                } else {
                    C218914p.A08.A0A(c3vi);
                }
                userSession.A04(C3VI.class, c3vi);
            }
        }
    }

    public static synchronized void A01(C3VI c3vi, String str, String str2, int i) {
        String A0R;
        synchronized (c3vi) {
            if (str.equals(c3vi.A02)) {
                if (i < c3vi.A06 && ((Build.VERSION.SDK_INT < 29 || !C218914p.A09()) && !C218914p.A08())) {
                    C3VK c3vk = c3vi.A08;
                    if (C103724lq.A00(c3vk.A02(), C05F.A0C, null, null, false) == C05F.A0N) {
                        C140286Wg c140286Wg = c3vi.A00;
                        if (c140286Wg != null && !c140286Wg.isDone()) {
                            c140286Wg.cancel(true);
                        }
                        C140286Wg A06 = c3vk.A06();
                        c3vi.A00 = A06;
                        if (i == 0) {
                            if (str2 == null) {
                                A0R = "ig_place_tagging";
                            } else {
                                A0R = AnonymousClass001.A0R("ig_place_tagging", str2);
                            }
                        } else if (str2 == null) {
                            A0R = "ig_place_tagging_extra";
                        } else {
                            A0R = AnonymousClass001.A0R(str2, "ig_place_tagging_extra");
                        }
                        C62675SLn c62675SLn = null;
                        if (i != 0) {
                            c62675SLn = new C62675SLn(10000L, 1800000L);
                            c62675SLn.A00 = true;
                        }
                        A06.A04(new SX8(null, null, null, c62675SLn, str, true, false), A0R);
                        C2OD.A03(new C23550Ac4(c3vi, str, str2, i), c3vi.A00, c3vk.A09());
                    }
                }
                c3vi.A02 = null;
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A01).A02(this.A07, C3VQ.class);
        if (Build.VERSION.SDK_INT >= 29) {
            C218914p.A07(this);
        } else {
            C218914p.A06(this);
        }
        this.A01 = null;
    }

    public C3VI(Context context, UserSession userSession) {
        String str;
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.3VJ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                Venue venue;
                Integer num;
                Integer num2;
                String str2;
                int A03 = C0f9.A03(-1288045325);
                C3VQ c3vq = (C3VQ) obj;
                int A032 = C0f9.A03(560109955);
                try {
                    venue = c3vq.A00;
                    num = c3vq.A01;
                    num2 = C05F.A00;
                } catch (Exception e) {
                    C0w9.A06(AbstractC111324zv.A00(1689), "Error in venue selected listener", e);
                }
                if (num != num2) {
                    if (!Boolean.valueOf(C18U.A06(C06090Tz.A05, C3VI.this.A01, 2342155506002560142L)).booleanValue()) {
                        i = 1703358072;
                        C0f9.A0A(i, A032);
                        C0f9.A0A(53738821, A03);
                    }
                }
                if (AbstractC111324zv.A00(923).equals(venue.A03())) {
                    C3VI c3vi = C3VI.this;
                    String A02 = venue.A02();
                    if (num != num2) {
                        switch (num.intValue()) {
                            case 0:
                                str2 = "POST";
                                break;
                            case 1:
                                str2 = "POST_QUICK";
                                break;
                            default:
                                str2 = "STORY";
                                break;
                        }
                    } else {
                        str2 = null;
                    }
                    synchronized (c3vi) {
                        if (!A02.equals(c3vi.A02)) {
                            c3vi.A02 = A02;
                            C3VI.A01(c3vi, A02, str2, 0);
                        }
                    }
                }
                i = -1336240083;
                C0f9.A0A(i, A032);
                C0f9.A0A(53738821, A03);
            }
        };
        this.A07 = interfaceC41501vz;
        this.A01 = userSession;
        this.A08 = C3VK.A00(context, userSession);
        this.A04 = C16030qx.A02.A05(context);
        C19U A01 = C11830jh.A04.A01(userSession).A01(C19T.A1t);
        if (A01 == null) {
            str = "Not initiated";
        } else {
            str = A01.A01;
        }
        this.A05 = str;
        AbstractC25651Mw.A00(this.A01).A01(interfaceC41501vz, C3VQ.class);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A03 = C18U.A06(c06090Tz, userSession, 2342155506002494605L);
        int intValue = Long.valueOf(C18U.A01(c06090Tz, userSession, 36593971765642792L)).intValue();
        this.A06 = intValue < 0 ? 1 : intValue;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(576731480);
        if (this.A03) {
            synchronized (this) {
                C140286Wg c140286Wg = this.A00;
                if (c140286Wg != null && !c140286Wg.isDone()) {
                    c140286Wg.cancel(true);
                }
                this.A02 = null;
            }
        }
        C0f9.A0A(-1120207662, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-2050953189, C0f9.A03(-1286867608));
    }
}
