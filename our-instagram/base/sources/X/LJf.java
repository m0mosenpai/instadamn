package X;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LJf {
    public static final LJf A00 = new Object();

    public static final EnumC46208Kck A00(Activity activity, C6CF c6cf, C48519LdH c48519LdH, Integer num) {
        C14360o3.A0B(c48519LdH, 0);
        AbstractC167027dH.A13(c6cf, activity, num);
        C48519LdH.A03(c48519LdH, num);
        Object value = c48519LdH.A0R.getValue();
        C48519LdH.A03(c48519LdH, num);
        Object value2 = c48519LdH.A0S.getValue();
        C48519LdH.A03(c48519LdH, num);
        boolean A1a = AbstractC166987dD.A1a(c48519LdH.A0O.getValue());
        if (c6cf.A01(activity) && value == EnumC46166Kc4.A03) {
            if (C6CB.A02(c6cf.A00, 36315928476258105L) && num != C05F.A0C) {
                return EnumC46208Kck.A0A;
            }
            return EnumC46208Kck.A09;
        }
        if (value2 == EnumC46166Kc4.A03) {
            return EnumC46208Kck.A0N;
        }
        if (A1a) {
            if (C6CB.A02(c6cf.A00, 36315928476258105L)) {
                return EnumC46208Kck.A0L;
            }
            return EnumC46208Kck.A0K;
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.KCM A01(android.os.Bundle r3, com.instagram.common.session.UserSession r4, X.EnumC46208Kck r5) {
        /*
            r0 = 2
            X.C14360o3.A0B(r4, r0)
            int r0 = r5.ordinal()
            r2 = 0
            switch(r0) {
                case 0: goto L9d;
                case 1: goto L97;
                case 2: goto L91;
                case 3: goto L4f;
                case 4: goto L49;
                case 5: goto L8b;
                case 6: goto L85;
                case 7: goto L7f;
                case 8: goto L43;
                case 9: goto L79;
                case 10: goto L73;
                case 11: goto Lc;
                case 12: goto L27;
                case 13: goto Lc;
                case 14: goto L1a;
                case 15: goto L6d;
                case 16: goto L67;
                case 17: goto L61;
                case 18: goto L5b;
                case 19: goto L55;
                case 20: goto Ld;
                case 21: goto L3d;
                case 22: goto L37;
                default: goto Lc;
            }
        Lc:
            return r2
        Ld:
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            X.AbstractC60492pY.A04(r1, r4)
            X.KPs r0 = new X.KPs
            r0.<init>()
            goto L33
        L1a:
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            X.AbstractC60492pY.A04(r1, r4)
            X.KPv r0 = new X.KPv
            r0.<init>()
            goto L33
        L27:
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            X.AbstractC60492pY.A04(r1, r4)
            X.KPi r0 = new X.KPi
            r0.<init>()
        L33:
            r0.setArguments(r1)
            goto La2
        L37:
            X.KPk r0 = new X.KPk
            r0.<init>()
            goto La2
        L3d:
            X.KPj r0 = new X.KPj
            r0.<init>()
            goto La2
        L43:
            X.KPp r0 = new X.KPp
            r0.<init>()
            goto La2
        L49:
            X.KOz r0 = new X.KOz
            r0.<init>()
            goto La2
        L4f:
            X.KOy r0 = new X.KOy
            r0.<init>()
            goto La2
        L55:
            X.KPr r0 = new X.KPr
            r0.<init>()
            goto La2
        L5b:
            X.KPq r0 = new X.KPq
            r0.<init>()
            goto La2
        L61:
            X.KPt r0 = new X.KPt
            r0.<init>()
            goto La2
        L67:
            X.KPn r0 = new X.KPn
            r0.<init>()
            goto La2
        L6d:
            X.KPl r0 = new X.KPl
            r0.<init>()
            goto La2
        L73:
            X.KPg r0 = new X.KPg
            r0.<init>()
            goto La2
        L79:
            X.KPu r0 = new X.KPu
            r0.<init>()
            goto La2
        L7f:
            X.KPm r0 = new X.KPm
            r0.<init>()
            goto La2
        L85:
            X.KPf r0 = new X.KPf
            r0.<init>()
            goto La2
        L8b:
            X.KPw r0 = new X.KPw
            r0.<init>()
            goto La2
        L91:
            X.KP1 r0 = new X.KP1
            r0.<init>()
            goto La2
        L97:
            X.KP0 r0 = new X.KP0
            r0.<init>()
            goto La2
        L9d:
            X.KPo r0 = new X.KPo
            r0.<init>()
        La2:
            X.KCM r0 = (X.KCM) r0
            if (r0 == 0) goto Lc
            r0.setArguments(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJf.A01(android.os.Bundle, com.instagram.common.session.UserSession, X.Kck):X.KCM");
    }

    public final C189448aO A02(Resources resources, Fragment fragment, UserSession userSession) {
        String str;
        if (fragment instanceof C45811KPq) {
            str = resources.getString(2131961792);
            C14360o3.A0A(str);
        } else {
            str = " ";
        }
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        boolean z = true;
        A0y.A1I = true;
        A0y.A11 = true;
        A0y.A0d = str;
        if (str.length() <= 0 || str.equals(" ")) {
            z = false;
        }
        A0y.A1C = z;
        return A0y;
    }
}
