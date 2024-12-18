package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: X.9Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC206099Aq {
    public static final InterfaceC11380iw A00 = new C19270xB("quiet_mode");

    public static final long A00(UserSession userSession) {
        long A002;
        long timeInMillis;
        C14360o3.A0B(userSession, 0);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!AbstractC455527p.A00(userSession)) {
            A002 = c71603Jf.A00();
            timeInMillis = C123815iv.A00();
        } else {
            currentTimeMillis = A01(userSession);
            Calendar A03 = C123815iv.A03(currentTimeMillis);
            A002 = c71603Jf.A00();
            timeInMillis = A03.getTimeInMillis();
        }
        long j = A002 + (timeInMillis / 1000);
        if (currentTimeMillis > j) {
            return j + SandboxRepository.CACHE_TTL;
        }
        return j;
    }

    public static final long A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        boolean A08 = c71603Jf.A08(currentTimeMillis);
        long A01 = c71603Jf.A01() + (C123815iv.A00() / 1000);
        if (A08) {
            if (currentTimeMillis < A01) {
                return A01 - SandboxRepository.CACHE_TTL;
            }
            return A01;
        }
        if (AbstractC455527p.A00(userSession)) {
            return A03(userSession, A01);
        }
        if (currentTimeMillis <= A01) {
            return A01;
        }
        return A01 + SandboxRepository.CACHE_TTL;
    }

    public static final long A02(UserSession userSession, long j) {
        long A002;
        int i;
        C14360o3.A0B(userSession, 0);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        if (AbstractC455527p.A00(userSession) && !c71603Jf.A08(j)) {
            long A03 = A03(userSession, j);
            A002 = (C123815iv.A03(A03).getTimeInMillis() / 1000) + c71603Jf.A00();
            i = (A03 > A002 ? 1 : (A03 == A002 ? 0 : -1));
        } else {
            A002 = (C123815iv.A00() / 1000) + c71603Jf.A00();
            i = (j > A002 ? 1 : (j == A002 ? 0 : -1));
        }
        if (i >= 0) {
            return A002 + SandboxRepository.CACHE_TTL;
        }
        return A002;
    }

    public static final long A03(UserSession userSession, long j) {
        long A002;
        EnumC206089Ap enumC206089Ap;
        int i;
        int i2;
        C14360o3.A0B(userSession, 0);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        boolean A003 = AbstractC455527p.A00(userSession);
        long j2 = SandboxRepository.CACHE_TTL;
        if (A003) {
            Calendar A03 = C123815iv.A03(j);
            EnumC206089Ap A01 = AbstractC206079Ao.A01(A03);
            long timeInMillis = (A03.getTimeInMillis() / 1000) + c71603Jf.A01();
            if (j >= timeInMillis) {
                A03.setTimeInMillis(A03.getTimeInMillis() + 86400000);
            }
            EnumC206089Ap A012 = AbstractC206079Ao.A01(A03);
            if (A012 != null && i <= (i2 = (i = A012.A00) + 6)) {
                while (true) {
                    int i3 = i % 7;
                    if (i3 == 0) {
                        i3 = 7;
                    }
                    EnumC206089Ap[] values = EnumC206089Ap.values();
                    int length = values.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            enumC206089Ap = values[i4];
                            if (enumC206089Ap.A00 == i3) {
                                break;
                            }
                            i4++;
                        } else {
                            enumC206089Ap = null;
                            break;
                        }
                    }
                    if (!new C71603Jf(userSession).A09(enumC206089Ap)) {
                        if (i == i2) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            enumC206089Ap = null;
            if (A01 != null && enumC206089Ap != null) {
                int i5 = enumC206089Ap.A00 - A01.A00;
                if (i5 < 0) {
                    i5 += 7;
                }
                A002 = timeInMillis + (i5 * SandboxRepository.CACHE_TTL);
                if (i5 == 0 && j >= A002) {
                    j2 = 604800;
                    return A002 + j2;
                }
                return A002;
            }
        }
        A002 = (C123815iv.A00() / 1000) + c71603Jf.A01();
        if (j < A002) {
            return A002;
        }
        return A002 + j2;
    }

    public static final Date A04(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        long A03 = A03(userSession, j);
        if (!new C71603Jf(userSession).A08(j)) {
            if (!AbstractC455527p.A00(userSession)) {
                A03 += SandboxRepository.CACHE_TTL;
            } else {
                return new Date(A03(userSession, A03) * 1000);
            }
        }
        return new Date(A03 * 1000);
    }

    public static final void A05(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        boolean A01 = AbstractC455527p.A01(userSession);
        C189448aO c189448aO = new C189448aO(userSession);
        int i = 2131971401;
        if (A01) {
            i = 2131974159;
        }
        c189448aO.A0g = context.getString(i);
        c189448aO.A0K = new ViewOnClickListenerC55404OjF(fragmentActivity, userSession, str);
        c189448aO.A1J = true;
        int i2 = 2131971400;
        if (A01) {
            i2 = 2131974158;
        }
        c189448aO.A0h = context.getString(i2);
        c189448aO.A0L = new WMa(fragmentActivity, userSession, str);
        c189448aO.A1N = true;
        c189448aO.A0U = new C24118An3(userSession, c71603Jf, str);
        c189448aO.A00().A02(fragmentActivity, new C33183EkU());
        C65761Ttc.A02(FDN.A00(A00, userSession), c71603Jf.A03(0L), "ig_quiet_mode_pause_bottom_sheet_shown", str);
    }

    public static final void A06(UserSession userSession) {
        long j;
        C14360o3.A0B(userSession, 0);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        boolean A07 = c71603Jf.A07(System.currentTimeMillis() / 1000);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        if (A07) {
            long A01 = c71603Jf.A01();
            long A003 = c71603Jf.A00();
            long A004 = C123815iv.A00() / 1000;
            if (A01 < A003) {
                j = A004 + A003;
            } else {
                if (A01 > A003 && c71603Jf.A06()) {
                    A004 += A003;
                }
                j = A004 + SandboxRepository.CACHE_TTL;
            }
        } else {
            j = 0;
        }
        InterfaceC19610xo ARD = A002.A01.ARD();
        ARD.E7G(AbstractC43591JPw.A00(1267), j);
        ARD.apply();
    }

    public static final void A07(UserSession userSession, User user, List list, long j, long j2) {
        C14360o3.A0B(userSession, 1);
        List list2 = C16930sl.A00;
        if (AbstractC455527p.A00(userSession)) {
            if (list == null) {
                list = new C71603Jf(userSession).A04();
            }
            list2 = list;
        }
        List singletonList = Collections.singletonList(new C43J(Integer.valueOf((int) j2), Integer.valueOf((int) j), null, list2));
        C14360o3.A07(singletonList);
        user.A03.Ec2(singletonList);
    }

    public static final boolean A08(UserSession userSession) {
        List<InterfaceC106844rl> Bjl;
        C14360o3.A0B(userSession, 0);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        User A002 = C08730cb.A00(userSession).A00();
        List Bjl2 = A002.A03.Bjl();
        if (Bjl2 != null && !Bjl2.isEmpty() && (Bjl = A002.A03.Bjl()) != null && !Bjl.isEmpty()) {
            for (InterfaceC106844rl interfaceC106844rl : Bjl) {
                Long startTimestamp = interfaceC106844rl.getStartTimestamp();
                Long l = null;
                if (startTimestamp == null) {
                    startTimestamp = null;
                }
                Long B2A = interfaceC106844rl.B2A();
                if (B2A != null) {
                    l = B2A;
                }
                if (startTimestamp != null && l != null) {
                    long longValue = startTimestamp.longValue();
                    if ((longValue + 1 <= currentTimeMillis && currentTimeMillis < l.longValue()) || currentTimeMillis <= longValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
