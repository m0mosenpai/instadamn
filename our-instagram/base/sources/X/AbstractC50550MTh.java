package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MTh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50550MTh {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (X.C18U.A06(r3, r9, 36316701561852528L) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x021a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36320687291441971L) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r0 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51761Mtk A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C41181vS r10, X.C41551w4 r11, com.instagram.model.reels.ReelViewerConfig r12, X.C3G2 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50550MTh.A00(android.content.Context, com.instagram.common.session.UserSession, X.1vS, X.1w4, com.instagram.model.reels.ReelViewerConfig, X.3G2, boolean):X.Mtk");
    }

    public static final Integer A01(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, ReelViewerConfig reelViewerConfig, C3G2 c3g2, boolean z) {
        C38321qM c38321qM = c41181vS.A0b;
        Reel reel = c41551w4.A0H;
        if (!reel.A0i() && c41181vS.CY4() && c38321qM != null && AbstractC166997dE.A1Z(c38321qM.A0C.C1g(), true) && ((!c41551w4.A0D() || c3g2 == C3G2.A08) && c41181vS.A1h() && !c38321qM.A5C() && !c41181vS.A1v(EnumC75383a5.A1B) && AbstractC14490oL.A0C(context) && !z && !reel.A0k())) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36319068088769442L) && c41181vS.A0B() != EnumC76383bi.A05 && c41181vS.A0B() != EnumC76383bi.A0A && c41181vS.A0B() != EnumC76383bi.A0C) {
                if (C141446aN.A05(c41181vS, c41551w4, reelViewerConfig, c3g2) && A00(context, userSession, c41181vS, c41551w4, reelViewerConfig, c3g2, z).A00 == C05F.A00 && C141446aN.A04(userSession, c41181vS, c41551w4) && (!C2E7.A00(AbstractC166987dD.A10(userSession))) && C18U.A06(c06090Tz, userSession, 36316701561721455L) && C18U.A06(c06090Tz, userSession, 36316701562049139L)) {
                    return C05F.A01;
                }
                return C05F.A00;
            }
        }
        return C05F.A0C;
    }

    public static final boolean A04(C41181vS c41181vS, C41551w4 c41551w4) {
        C38321qM c38321qM;
        User user;
        Reel reel = c41551w4.A0H;
        if (!reel.A1a || reel.A1b || (c38321qM = c41181vS.A0b) == null || (user = c41181vS.A0i) == null || !user.A1J() || c38321qM.A1x() == EnumC76383bi.A0C) {
            return false;
        }
        return true;
    }

    public static final boolean A05(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC75383a5 enumC75383a5 = ((C84823qW) it.next()).A12;
                if (enumC75383a5 == EnumC75383a5.A0y || enumC75383a5 == EnumC75383a5.A0q || enumC75383a5 == EnumC75383a5.A0z || enumC75383a5 == EnumC75383a5.A10 || enumC75383a5 == EnumC75383a5.A1F) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        Reel reel = c41551w4.A0H;
        if ((reel.A0b() || reel.A0k() || (c41551w4.A0D() && reel.A1a)) && c41181vS.A1h() && !c41181vS.A1u(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C1NB c1nb;
        long days = TimeUnit.MILLISECONDS.toDays(Math.abs(Calendar.getInstance().getTimeInMillis() - (c41181vS.A03() * 1000)));
        Reel reel = c41551w4.A0H;
        if (reel.A1a && reel.A0b() && (c1nb = reel.A0W) != null && c1nb.CDj() != null) {
            C14360o3.A0A(c1nb);
            User CDj = c1nb.CDj();
            C14360o3.A0A(CDj);
            if (CDj.A2G() && days <= r2.getActualMaximum(7) && C18U.A06(C06090Tz.A05, userSession, 36322233480063045L)) {
                return true;
            }
        }
        return false;
    }
}
