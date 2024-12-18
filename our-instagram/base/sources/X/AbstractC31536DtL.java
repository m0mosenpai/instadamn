package X;

import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DtL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31536DtL {
    public static final boolean A01(android.net.Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        return host.equals(IGPixelRequestBuffer.URL_PREFIX) || AbstractC002300n.A0f(host, AbstractC58317Pt9.A00(61), false) || host.equals("fb.watch");
    }

    public static final boolean A02(UserSession userSession, User user) {
        long j;
        C14360o3.A0B(userSession, 1);
        boolean A1W = AbstractC31171DnF.A1W(userSession, user.getId());
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A1W) {
            j = 36320090292166703L;
        } else if (C18U.A06(c06090Tz, userSession, 36320090291118119L)) {
            j = 36320090291773486L;
        } else {
            return false;
        }
        if (!C18U.A06(c06090Tz, userSession, j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(android.content.Context r5, X.InterfaceC81873l7 r6, com.instagram.common.session.UserSession r7) {
        /*
            X.AbstractC167017dG.A1N(r6, r7)
            java.lang.String r4 = r6.getUrl()
            if (r4 == 0) goto L10
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L11
        L10:
            r0 = 1
        L11:
            r3 = 0
            if (r0 != 0) goto L18
            android.net.Uri r3 = X.AbstractC08820cl.A03(r4)     // Catch: java.lang.Throwable -> L18
        L18:
            if (r3 == 0) goto L65
            boolean r0 = X.AbstractC63325ShZ.A01(r3)
            if (r0 != 0) goto L26
            boolean r0 = A01(r3)
            if (r0 == 0) goto L65
        L26:
            java.lang.String r2 = r3.getPath()
            r0 = 0
            if (r2 == 0) goto L33
            java.lang.String r1 = "/help/"
            boolean r0 = X.AbstractC001900j.A0a(r2, r1, r0)
        L33:
            if (r0 != 0) goto L65
            if (r4 == 0) goto L5d
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r1 = r1.setFlags(r0)
            X.IlG r0 = X.AbstractC41776Ies.A00
            android.net.Uri r0 = X.AbstractC08820cl.A01(r0, r4)
            android.content.Intent r2 = X.AbstractC31173DnH.A09(r1, r0)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            if (r1 == 0) goto L5d
            r0 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)
            r1 = 1
            if (r0 != 0) goto L5e
        L5d:
            r1 = 0
        L5e:
            if (r1 == 0) goto L65
            java.lang.String r0 = r3.toString()
            return r0
        L65:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31536DtL.A00(android.content.Context, X.3l7, com.instagram.common.session.UserSession):java.lang.String");
    }
}
