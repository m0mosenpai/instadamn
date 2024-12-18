package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.facebook.common.hiddenapis2.ApiExemption;

/* renamed from: X.5Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114425Ej extends C0R8 {
    public static final boolean A06;
    public static final boolean A07;
    public final Application.ActivityLifecycleCallbacks A00;
    public final Context A01;
    public final Handler A02;
    public final C0HY A03;
    public final AbstractC04410Lh A04;
    public final boolean A05;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "MediaSessionANRFixer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ("motorola".equals(r1) != false) goto L6;
     */
    static {
        /*
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r0 = "lenovo"
            boolean r0 = r0.equals(r1)
            r2 = 0
            if (r0 != 0) goto L14
            java.lang.String r0 = "motorola"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            X.C114425Ej.A07 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L1e
            r2 = 1
        L1e:
            X.C114425Ej.A06 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114425Ej.<clinit>():void");
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        C0HY c0hy;
        Application application;
        if (this.A05 && (c0hy = this.A03) != null) {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                A09("Hidden apis are not accessible");
                return;
            }
            C0HU.A03(this.A04);
            if (((Boolean) C92V.A04.get()).booleanValue()) {
                C92V.A01();
                Activity A00 = C92V.A00();
                if (A00 != null) {
                    c0hy.A01(A00, C0HC.A00(), false);
                }
            }
            Context context = this.A01;
            if (((context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) && (application = (Application) context) != null) {
                application.registerActivityLifecycleCallbacks(this.A00);
            }
            A08();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36314103109126580L) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C114425Ej(X.C0Rw r5) {
        /*
            r4 = this;
            r4.<init>(r5)
            com.facebook.fixie.fixes.common.MediaSessionANRFixer$1 r0 = new com.facebook.fixie.fixes.common.MediaSessionANRFixer$1
            r0.<init>(r4)
            r4.A00 = r0
            X.5Oh r0 = new X.5Oh
            r0.<init>(r4)
            r4.A04 = r0
            r0 = r5
            X.0RK r0 = (X.C0RK) r0
            android.content.Context r0 = r0.A01
            r4.A01 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r1 = r4.A05(r0)
            X.0hA r1 = (X.C10420hA) r1
            boolean r0 = X.C114425Ej.A07
            if (r0 == 0) goto L3d
            boolean r0 = X.C114425Ej.A06
            if (r0 == 0) goto L3d
            if (r1 == 0) goto L3d
            com.instagram.common.session.UserSession r3 = r1.A00
            r3.getClass()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314103109126580(0x81037c002809b4, double:3.0285232591434665E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L3e
        L3d:
            r1 = 0
        L3e:
            r4.A05 = r1
            android.os.Handler r0 = r5.Aex()
            r4.A02 = r0
            if (r1 == 0) goto L56
            java.lang.String r3 = "media_session"
            java.lang.String r2 = "mService"
            java.lang.String r1 = "android.media.session.ISessionManager"
            X.0HY r0 = new X.0HY
            r0.<init>(r3, r2, r1)
        L53:
            r4.A03 = r0
            return
        L56:
            r0 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114425Ej.<init>(X.0Rw):void");
    }
}
