package X;

import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.Sbc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63055Sbc {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r3.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.String r3) {
        /*
            java.lang.String r1 = "ReactNative"
            r2 = 16842871(0x1010077, float:2.3693892E-38)
            if (r3 == 0) goto L69
            int r0 = r3.hashCode()
            switch(r0) {
                case -1955878649: goto L60;
                case -1414214583: goto L54;
                case -913872828: goto L48;
                case -670403824: goto L3c;
                case -142408811: goto L30;
                case 73190171: goto L24;
                case 79996135: goto L18;
                default: goto Le;
            }
        Le:
            java.lang.String r0 = "Unknown ProgressBar style: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r3)
        L14:
            X.C0I2.A04(r1, r0)
        L17:
            return r2
        L18:
            java.lang.String r0 = "Small"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r2 = 16842873(0x1010079, float:2.3693897E-38)
            return r2
        L24:
            java.lang.String r0 = "Large"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r2 = 16842874(0x101007a, float:2.36939E-38)
            return r2
        L30:
            java.lang.String r0 = "LargeInverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r2 = 16843401(0x1010289, float:2.3695377E-38)
            return r2
        L3c:
            java.lang.String r0 = "Inverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r2 = 16843399(0x1010287, float:2.369537E-38)
            return r2
        L48:
            java.lang.String r0 = "Horizontal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r2 = 16842872(0x1010078, float:2.3693894E-38)
            return r2
        L54:
            java.lang.String r0 = "SmallInverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r2 = 16843400(0x1010288, float:2.3695374E-38)
            return r2
        L60:
            java.lang.String r0 = "Normal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L17
            goto Le
        L69:
            java.lang.String r0 = "ProgressBar needs to have a style, null received"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63055Sbc.A00(java.lang.String):int");
    }

    public static final ProgressBar A01(Context context, int i) {
        ProgressBar progressBar;
        synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }
}
