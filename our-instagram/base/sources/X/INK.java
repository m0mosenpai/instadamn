package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class INK {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (X.AbstractC002300n.A0h(r6, "https://play.google.com/store/apps/details", false) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.Intent r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 1
            X.C14360o3.A0B(r6, r3)
            java.lang.String r2 = "market://details"
            r1 = 0
            boolean r0 = X.AbstractC002300n.A0h(r6, r2, r1)
            if (r0 != 0) goto L1d
            java.lang.String r2 = "http://play.google.com/store/apps/details"
            boolean r0 = X.AbstractC002300n.A0h(r6, r2, r1)
            if (r0 != 0) goto L1d
            java.lang.String r2 = "https://play.google.com/store/apps/details"
            boolean r0 = X.AbstractC002300n.A0h(r6, r2, r1)
            if (r0 == 0) goto L23
        L1d:
            java.lang.String r0 = "https://play.google.com/d"
            java.lang.String r6 = X.AbstractC002300n.A0d(r6, r2, r0, r1)
        L23:
            android.net.Uri r0 = X.AbstractC08820cl.A03(r6)
            r5.setData(r0)
            java.lang.String r0 = "com.android.vending"
            r5.setPackage(r0)
            java.lang.String r0 = "overlay"
            r5.putExtra(r0, r3)
            r0 = 403(0x193, float:5.65E-43)
            java.lang.String r1 = X.MSV.A00(r0)
            r0 = 0
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r5.putExtra(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.INK.A00(android.content.Intent, java.lang.String):void");
    }

    public final boolean A01() {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323564919467387L)) {
            Context context = this.A00;
            if (AbstractC14490oL.A0F(context)) {
                String A04 = C18U.A04(c06090Tz, userSession, 36886514872943325L);
                String A05 = AbstractC14490oL.A05(context, "com.android.vending");
                if (A05 != null && A05.compareTo(A04) >= 0 && A02()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A02() {
        String str;
        if (C18U.A06(C06090Tz.A05, this.A01, 36323564919598460L)) {
            return true;
        }
        PackageManager packageManager = this.A00.getPackageManager();
        String A00 = AbstractC58317Pt9.A00(0);
        android.net.Uri uri = AbstractC14490oL.A01;
        try {
            str = packageManager.getInstallerPackageName(A00);
            if (str == null) {
                str = "";
            }
        } catch (IllegalArgumentException unused) {
            str = "unknown";
        }
        return str.equals("com.android.vending");
    }

    public INK(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
