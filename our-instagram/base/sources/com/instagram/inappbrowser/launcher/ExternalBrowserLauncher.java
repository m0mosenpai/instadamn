package com.instagram.inappbrowser.launcher;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC58318PtA;
import X.C05F;
import X.C06090Tz;
import X.C12260kU;
import X.C18U;
import X.C2JG;
import X.C62594SHx;
import X.InterfaceC08100bW;
import X.SWZ;
import X.TSE;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ExternalBrowserLauncher {
    public static final InterfaceC08100bW A06 = AbstractC31175DnJ.A0B();
    public List A00 = AbstractC166987dD.A1E();
    public List A01 = AbstractC166987dD.A1E();
    public boolean A02;
    public final Context A03;
    public final PackageManager A04;
    public final UserSession A05;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        if (X.AbstractC31171DnF.A1X(r1.getQueryParameter("u")) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(java.lang.String r5) {
        /*
            java.lang.String r2 = "horizon.meta.com;hz.me"
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L3a
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L3a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L3a
            android.net.Uri r1 = android.net.Uri.parse(r5)
            boolean r0 = X.AbstractC63114SdI.A01(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "u"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch: java.lang.Exception -> L38
            boolean r0 = X.AbstractC31171DnF.A1X(r0)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L3c
        L2b:
            java.lang.String r0 = "u"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L38
            android.net.Uri r1 = X.AbstractC58319PtB.A09(r0)
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r0 = 0
            return r0
        L3c:
            java.lang.String r5 = r1.getHost()
            if (r5 == 0) goto L3a
            java.lang.String r0 = "[,; ]+"
            java.lang.String[] r4 = r2.split(r0)
            int r3 = r4.length
            r2 = 0
        L4a:
            if (r2 >= r3) goto L3a
            r1 = r4[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L5c
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L5c
            r0 = 1
            return r0
        L5c:
            int r2 = r2 + 1
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.launcher.ExternalBrowserLauncher.A00(java.lang.String):boolean");
    }

    public final C62594SHx A01(Uri uri) {
        ArrayList A1E;
        int indexOf;
        PackageManager packageManager = this.A04;
        if (packageManager == null) {
            A1E = AbstractC166987dD.A1E();
        } else {
            String str = null;
            Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
            Intent addCategory2 = new Intent("android.intent.action.VIEW", uri.buildUpon().scheme("http").build()).addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveActivity = packageManager.resolveActivity(addCategory, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            if (resolveActivity != null || (resolveActivity = packageManager.resolveActivity(addCategory2, Constants.LOAD_RESULT_PGO_ATTEMPTED)) != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                activityInfo.getClass();
                str = ((PackageItemInfo) activityInfo).packageName;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE"), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            A1E = AbstractC166987dD.A1E();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                activityInfo2.getClass();
                String str2 = ((PackageItemInfo) activityInfo2).packageName;
                String str3 = ((PackageItemInfo) resolveInfo.activityInfo).packageName;
                boolean equals = str3.equals(str);
                TextUtils.isEmpty(SWZ.A00(this.A03, AbstractC31174DnI.A0z(str3)));
                List list = this.A01;
                if (!list.contains(((PackageItemInfo) resolveInfo.activityInfo).packageName)) {
                    indexOf = Integer.MAX_VALUE;
                } else {
                    indexOf = list.indexOf(((PackageItemInfo) resolveInfo.activityInfo).packageName);
                }
                A1E.add(new C62594SHx(str2, equals, this.A00.contains(((PackageItemInfo) resolveInfo.activityInfo).packageName), indexOf));
            }
        }
        if (A1E.isEmpty()) {
            return null;
        }
        Collections.sort(A1E, new TSE(6));
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((C62594SHx) next).A02) {
                A1E2.add(next);
            }
        }
        Collections.sort(A1E2, new TSE(7));
        if (A1E2.isEmpty()) {
            return null;
        }
        return (C62594SHx) A1E2.get(0);
    }

    public final Integer A02() {
        UserSession userSession = this.A05;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36313566235789414L)) {
            return C05F.A00;
        }
        if (C18U.A06(c06090Tz, userSession, 36313566235986025L)) {
            return C05F.A0C;
        }
        return C05F.A0G;
    }

    public final boolean A03(String str, String str2) {
        Uri A03;
        if (this.A02 && this.A04 != null && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
            if (!TextUtils.isEmpty(str)) {
                A03 = AbstractC08820cl.A01(A06, str);
                if (A03 == null) {
                    return false;
                }
            } else {
                str2.getClass();
                A03 = AbstractC08820cl.A03(str2);
            }
            UserSession userSession = this.A05;
            if (C18U.A06(C06090Tz.A05, userSession, 36330239298781953L)) {
                String A02 = C2JG.A01(userSession).A02(null, A03.toString());
                A02.getClass();
                A03 = AbstractC08820cl.A03(A02);
            }
            C62594SHx A01 = A01(A03);
            if (A01 != null) {
                return C12260kU.A0A(this.A03, AbstractC58318PtA.A0D(A03).setPackage(A01.A01).addCategory("android.intent.category.BROWSABLE"));
            }
        }
        return false;
    }

    public ExternalBrowserLauncher(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = context.getPackageManager();
        this.A05 = userSession;
    }
}
