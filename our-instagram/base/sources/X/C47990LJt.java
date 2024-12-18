package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LJt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47990LJt {
    public static final LCL A02 = new Object();
    public final long A00;
    public final UserSession A01;

    public C47990LJt(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C18U.A01(C06090Tz.A05, userSession, 36601758541680995L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (X.C11T.A08() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if (X.C11T.A08() != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[Catch: all -> 0x01a8, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001c, B:6:0x0020, B:8:0x0028, B:10:0x002e, B:12:0x0036, B:14:0x004e, B:21:0x007a, B:23:0x0082, B:24:0x00e7, B:26:0x00ef, B:28:0x00f5, B:30:0x00fd, B:32:0x011d, B:35:0x012e, B:38:0x0137, B:40:0x014b, B:42:0x015a, B:44:0x0173, B:45:0x0177, B:47:0x017d, B:49:0x0186, B:50:0x0188, B:57:0x008e, B:64:0x00b4, B:66:0x00bc, B:71:0x00e2, B:74:0x01a1, B:75:0x01a7, B:16:0x006a, B:18:0x0070, B:20:0x0076, B:58:0x00a4, B:60:0x00aa, B:62:0x00b0), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b A[Catch: all -> 0x01a8, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001c, B:6:0x0020, B:8:0x0028, B:10:0x002e, B:12:0x0036, B:14:0x004e, B:21:0x007a, B:23:0x0082, B:24:0x00e7, B:26:0x00ef, B:28:0x00f5, B:30:0x00fd, B:32:0x011d, B:35:0x012e, B:38:0x0137, B:40:0x014b, B:42:0x015a, B:44:0x0173, B:45:0x0177, B:47:0x017d, B:49:0x0186, B:50:0x0188, B:57:0x008e, B:64:0x00b4, B:66:0x00bc, B:71:0x00e2, B:74:0x01a1, B:75:0x01a7, B:16:0x006a, B:18:0x0070, B:20:0x0076, B:58:0x00a4, B:60:0x00aa, B:62:0x00b0), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.0pT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A02(long r14) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47990LJt.A02(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r2 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03(long r6, long r8, java.lang.String r10, long r11) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            com.instagram.common.session.UserSession r3 = r5.A01     // Catch: java.lang.Throwable -> L40
            boolean r0 = X.C6X6.A05(r3)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L40
            r0 = 36323917106917054(0x810c6900022ebe, double:3.0347296708639594E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            X.2DS r3 = X.C2JD.A00(r3)     // Catch: java.lang.Throwable -> L40
            X.3kb r2 = r3.B3V(r6)     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2c
            java.lang.String r0 = "GetExtendedDirectThread"
            r3.CoS(r0)     // Catch: java.lang.Throwable -> L3c
            X.3kb r2 = r3.B3V(r6)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3e
        L2c:
            java.lang.String r1 = X.C4H6.A04(r10, r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = A00(r2, r5, r0)     // Catch: java.lang.Throwable -> L40
            r3.AF1(r2, r1, r0)     // Catch: java.lang.Throwable -> L40
            goto L3e
        L3c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r4)
            return
        L40:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47990LJt.A03(long, long, java.lang.String, long):void");
    }

    public static final String A00(C2EC c2ec, C47990LJt c47990LJt, String str) {
        String str2;
        Object obj;
        UserSession userSession = c47990LJt.A01;
        if (!AbstractC31171DnF.A1V(userSession, str) && !C14360o3.A0K(String.valueOf(AbstractC166997dE.A0Y(userSession).BTC()), str)) {
            Iterator it = c2ec.BSH().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    User user = (User) obj;
                    if (C14360o3.A0K(String.valueOf(user.BTC()), str) || C14360o3.A0K(user.getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user2 = (User) obj;
            if (user2 != null) {
                str2 = user2.getId();
            }
            throw AbstractC166997dE.A0g();
        }
        str2 = userSession.userId;
        if (str2 != null) {
            return str2;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A04(L1W l1w, String str, long j, long j2, long j3, boolean z, boolean z2) {
        if (l1w.A00 == EnumC46242KdI.A04 && l1w.A01 != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(j3) + timeUnit.toMillis(AbstractC25232BEp.A0t(l1w.A01));
            UserSession userSession = this.A01;
            long A01 = C18U.A01(C06090Tz.A05, userSession, 36601758541484386L);
            if (A01 <= 2) {
                if (z2) {
                    A01 = 21600;
                } else {
                    A01 = 1209600;
                }
            }
            M8M.A00(userSession, EnumC132075xi.A0X, C50367MLu.A01(new C50364MLq(19, new Date(millis), new Date(millis + timeUnit.toMillis(A01)), this), 21));
            if (z) {
                A03(j, j2, str, j3);
            }
        }
    }

    public static final List A01(Map map) {
        ArrayList A1F = AbstractC06950Ym.A1F(map.values());
        ArrayList A0q = AbstractC167017dG.A0q(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            C45116Jxl c45116Jxl = (C45116Jxl) it.next();
            String str = c45116Jxl.A00;
            if (str == null) {
                str = c45116Jxl.A01;
            }
            A0q.add(str);
        }
        return A0q;
    }
}
