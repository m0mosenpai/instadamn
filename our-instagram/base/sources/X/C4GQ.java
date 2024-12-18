package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4GQ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4GQ {
    public static final long A00;

    public static User A04(UserSession userSession, C83403nh c83403nh, C2EG c2eg) {
        User CDl;
        if (c83403nh != null) {
            String str = c83403nh.A1u;
            if (c2eg != null && (CDl = c2eg.CDl(str)) != null) {
                return CDl;
            }
            if (userSession.userId.equals(str)) {
                return C08730cb.A00(userSession).A00();
            }
            C18A A002 = AnonymousClass189.A00(userSession);
            if (A002 != null) {
                return A002.A02(str);
            }
        }
        return null;
    }

    public static boolean A0A(C2ED c2ed, String str, String str2) {
        C80993jT Av3;
        C81703kf c81703kf;
        String str3;
        return (str2 == null || (Av3 = c2ed.Av3(str)) == null || (c81703kf = Av3.A02) == null || (str3 = c81703kf.A01) == null || C93404Gt.A01.compare(str3, str2) < 0) ? false : true;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A00 = timeUnit.toMillis(30L);
        timeUnit.toMillis(60L);
    }

    public static C83403nh A01(C2EH c2eh) {
        C83403nh BLX;
        if (C1AD.A06(C06090Tz.A06, 18299910755453454L)) {
            BLX = c2eh.BLY();
        } else {
            BLX = c2eh.BLX();
        }
        C83403nh BYi = c2eh.BYi();
        C83403nh BLr = c2eh.BLr();
        if (BLX == null || !BLX.A1P()) {
            if (BYi != null) {
                return BYi;
            }
            if (c2eh.CM2()) {
                if (BLr == null) {
                    C0w9.A03("DirectThreadUtil", "last permanent message is null");
                    return BLX;
                }
                return BLr;
            }
        }
        return BLX;
    }

    public static C80993jT A02(UserSession userSession, C2EC c2ec, boolean z) {
        String str = userSession.userId;
        if (z) {
            return c2ec.Av3(str);
        }
        if (c2ec.CVQ()) {
            return null;
        }
        for (Map.Entry entry : c2ec.CDu().entrySet()) {
            if (!str.equals(entry.getKey())) {
                return (C80993jT) entry.getValue();
            }
        }
        return null;
    }

    public static User A05(C2EC c2ec) {
        if (c2ec != null && !c2ec.CVQ() && c2ec.BSH().size() == 1) {
            return (User) c2ec.BSH().get(0);
        }
        return null;
    }

    public static Long A06(C2EC c2ec) {
        C1118752z Ay9;
        Integer num;
        if (c2ec != null && c2ec.Ay8() && (Ay9 = c2ec.Ay9()) != null && (num = Ay9.A02) != null) {
            return Long.valueOf(TimeUnit.SECONDS.toMillis(num.longValue()));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (r7 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r7 == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A08(android.content.Context r3, com.instagram.common.session.UserSession r4, java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r1 = r0.A01(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto Lf
            if (r7 != 0) goto L11
        Le:
            return r5
        Lf:
            if (r7 == 0) goto L31
        L11:
            int r0 = r6.size()
            r2 = 1
            if (r0 <= r2) goto L31
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            X.17E r0 = (X.C17E) r0
            java.lang.String r5 = r0.getUsername()
            int r1 = r6.size()
            if (r1 == r2) goto Le
            java.lang.String r0 = " +"
            int r1 = r1 - r2
            java.lang.String r5 = X.AnonymousClass001.A0b(r5, r0, r1)
            return r5
        L31:
            java.lang.String r5 = X.AbstractC101904i3.A02(r3, r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GQ.A08(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, java.util.List, boolean):java.lang.String");
    }

    public static String A09(C2ED c2ed) {
        if (c2ed != null && !c2ed.CVQ() && c2ed.BSD().size() == 1) {
            return (String) c2ed.BSD().get(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C3AY A00(com.instagram.common.session.UserSession r6, X.C2EC r7) {
        /*
            X.4qv r0 = r7.C7L()
            r4 = 0
            if (r0 == 0) goto L28
            r7.C7L()
            X.4qv r0 = r7.C7L()
            com.instagram.model.mediasize.ImageInfoImpl r0 = r0.A00
            java.lang.Integer r1 = X.C05F.A01
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.AbstractC40161tk.A03(r0, r1)
            if (r0 == 0) goto L28
            X.4qv r0 = r7.C7L()
            com.instagram.model.mediasize.ImageInfoImpl r0 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.AbstractC40161tk.A03(r0, r1)
        L22:
            X.3AY r0 = new X.3AY
            r0.<init>(r1, r4)
            return r0
        L28:
            int r0 = r7.C7g()
            boolean r0 = X.C4GR.A02(r0)
            if (r0 == 0) goto L41
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r7.At4()
            if (r0 == 0) goto L41
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r7.At4()
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
        L3e:
            if (r1 == 0) goto L8d
            goto L22
        L41:
            int r1 = r7.C7g()
            r0 = 29
            if (r1 != r0) goto L55
            r0 = r7
            X.3kb r0 = (X.C81663kb) r0
            X.3iy r0 = r0.A01
            X.3kP r0 = r0.A0t
            if (r0 == 0) goto L55
            com.instagram.common.typedurl.ImageUrl r1 = r0.A04
            goto L3e
        L55:
            int r0 = r7.C7g()
            boolean r0 = X.C4GR.A01(r0)
            if (r0 == 0) goto L8d
            X.3nh r0 = r7.BLX()
            if (r0 == 0) goto L8b
            com.instagram.user.model.User r5 = A04(r6, r0, r7)
        L69:
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r3 = r0.A01(r6)
            java.util.List r2 = r7.BSH()
            java.lang.String r1 = r7.Asv()
            r1.getClass()
            if (r5 == 0) goto L89
            java.lang.String r0 = r5.getId()
            com.instagram.common.typedurl.ImageUrl r4 = r5.Bhu()
        L84:
            X.3AY r0 = X.AbstractC81683kd.A00(r4, r3, r1, r0, r2)
            return r0
        L89:
            r0 = r4
            goto L84
        L8b:
            r5 = r4
            goto L69
        L8d:
            X.3nh r0 = r7.BLX()
            if (r0 == 0) goto Lc4
            com.instagram.user.model.User r3 = A04(r6, r0, r7)
        L97:
            java.util.List r2 = r7.BSH()
            if (r3 == 0) goto Laa
            boolean r0 = r3.A1U()
            if (r0 == 0) goto Laa
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto Laa
            r3 = r4
        Laa:
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r1 = r0.A01(r6)
            if (r3 == 0) goto Lc2
            java.lang.String r0 = r3.getId()
            com.instagram.common.typedurl.ImageUrl r4 = r3.Bhu()
        Lba:
            r7.CVQ()
            X.3AY r0 = X.AbstractC81683kd.A02(r4, r1, r0, r2)
            return r0
        Lc2:
            r0 = r4
            goto Lba
        Lc4:
            r3 = r4
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GQ.A00(com.instagram.common.session.UserSession, X.2EC):X.3AY");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    public static DirectThreadKey A03(C2EF c2ef) {
        String C7I = c2ef.C7I();
        String C7q = c2ef.C7q();
        ArrayList A002 = DirectThreadKey.A00(C4GO.A01(c2ef.BSH()));
        ?? obj = new Object();
        obj.A00 = C7I;
        obj.A02 = A002;
        Collections.sort(A002);
        obj.A01 = C7q;
        return obj;
    }

    public static String A07(Context context, UserSession userSession, C2EF c2ef) {
        String C7l = c2ef.C7l();
        List BSH = c2ef.BSH();
        User A01 = C17060sy.A01.A01(userSession);
        if (TextUtils.isEmpty(C7l)) {
            return AbstractC101904i3.A02(context, A01, BSH);
        }
        return C7l;
    }

    public static boolean A0B(C2ED c2ed, String str, String str2, String str3) {
        if (str3.equals(str)) {
            return true;
        }
        C80993jT Av3 = c2ed.Av3(str);
        if (str2 != null && Av3 != null && ((((AbstractC81003jU) Av3).A02.length() != 38 || !C1AD.A06(C06090Tz.A05, 18312267376637981L)) && C93404Gt.A01.compare(((AbstractC81003jU) Av3).A02, str2) >= 0)) {
            return true;
        }
        return false;
    }

    public static boolean A0C(C2EC c2ec) {
        if ((!c2ec.CVQ() || c2ec.C7L() != null || c2ec.C7g() == 29 || C4GR.A02(c2ec.C7g())) && !C4GR.A01(c2ec.C7g())) {
            return false;
        }
        return true;
    }
}
