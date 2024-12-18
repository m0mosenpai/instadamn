package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BKs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25375BKs {
    public static final C25375BKs A00 = new Object();

    public static final float A00(C37644Ghd c37644Ghd) {
        C14360o3.A0B(c37644Ghd, 0);
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null && c75113Zb.A1q) {
            return 0.0f;
        }
        return 1.0f;
    }

    public static final int A02(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (A03(userSession, c38321qM)) {
            return (int) C18U.A01(C06090Tz.A06, userSession, 36603012674818935L);
        }
        return 0;
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        InterfaceC43506JJs AqQ;
        List AiQ;
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A06, userSession, 36321537694901812L) && c38321qM != null && (AqQ = c38321qM.A0C.AqQ()) != null && (AiQ = AqQ.AiQ()) != null && (!(AiQ instanceof Collection) || !AiQ.isEmpty())) {
            Iterator it = AiQ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC43502JJo) it.next()).CHH() == IGConsiderAndBrowseType.A06) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A05(Context context, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, SPM spm, boolean z) {
        C75113Zb c75113Zb;
        String A002;
        AbstractC25233BEq.A0v(1, c38321qM, c37644Ghd, userSession);
        if (A03(userSession, c38321qM)) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36321537695753787L) && (c75113Zb = c37644Ghd.A0E) != null && ((C18U.A01(c06090Tz, userSession, 36603012671935347L) <= 0 || c75113Zb.A24) && c75113Zb.A1o)) {
                Activity A003 = AbstractC13330mJ.A00(context);
                Activity activity = null;
                if (A003 instanceof FragmentActivity) {
                    activity = A003;
                }
                C3DO c3do = C3DN.A00;
                C3DN A004 = c3do.A00(activity);
                if ((A004 == null || A004.A0Z()) && activity != null) {
                    AbstractC167017dG.A0y(activity, c3do);
                    if (spm != null) {
                        if (z) {
                            A002 = AbstractC58317Pt9.A00(780);
                        } else {
                            A002 = AbstractC111324zv.A00(2032);
                        }
                        spm.A02("secondary_cta", "dismiss", A002);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final int A01(C120985dq c120985dq, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, c120985dq);
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36610236807125011L);
        if (c120985dq.CdW() && (AbstractC25226BEj.A0y(c120985dq).A5w() || AbstractC25226BEj.A0y(c120985dq).A5v())) {
            return 0;
        }
        if (A07 > 0) {
            return A07;
        }
        return AbstractC25225BEi.A07(c06090Tz, userSession, 36610236807321621L);
    }

    public final float A04(Context context, UserSession userSession, C75113Zb c75113Zb) {
        long j;
        int A002 = AbstractC57322k7.A00(AbstractC13330mJ.A00(context));
        boolean z = c75113Zb.A2z;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (z) {
            j = 37165962625941915L;
        } else {
            j = 37165962625089944L;
        }
        return ((AbstractC25225BEi.A00(c06090Tz, userSession, j) * AbstractC13890nF.A00(context)) - A002) - AbstractC13690mv.A00(context, 8.0f);
    }
}
