package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59762oJ {
    public final Activity A00;
    public final UserSession A03;
    public final InterfaceC53952dZ A04;
    public final InterfaceC41501vz A02 = new InterfaceC41501vz() { // from class: X.2oK
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            String str;
            int A03 = C0f9.A03(-2007932902);
            C04070Jy c04070Jy = (C04070Jy) obj;
            int A032 = C0f9.A03(1512568895);
            C14360o3.A0B(c04070Jy, 0);
            String str2 = c04070Jy.A01;
            if (str2 != null && (str = c04070Jy.A00) != null) {
                C59762oJ c59762oJ = C59762oJ.this;
                C193328hC c193328hC = new C193328hC(c59762oJ.A00);
                c193328hC.A05 = str2;
                c193328hC.A0s(false);
                c193328hC.A0r(str);
                c193328hC.A0F(new DialogInterfaceOnClickListenerC35308Fhj(c59762oJ));
                C0fJ.A00(c193328hC.A02());
            } else {
                C27391Ur A00 = AbstractC35178FfV.A00();
                C59762oJ c59762oJ2 = C59762oJ.this;
                A00.A00(c59762oJ2.A00, null, c59762oJ2.A03);
            }
            C0f9.A0A(1304097380, A032);
            C0f9.A0A(996700896, A03);
        }
    };
    public final InterfaceC41501vz A01 = new C59782oL(this);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C59762oJ r6, X.C04020Js r7, boolean r8) {
        /*
            java.lang.String r5 = r7.A02
            r2 = 0
            if (r8 != 0) goto L82
            android.content.Intent r3 = r7.A00
        L7:
            r1 = 0
            r4 = 1
            if (r3 == 0) goto L14
            java.lang.String r0 = "SERVICE_INTENT"
            boolean r0 = r3.getBooleanExtra(r0, r1)
            if (r0 != r4) goto L2d
            r2 = r3
        L14:
            if (r5 == 0) goto L76
            java.util.Set r0 = X.AbstractC57972lA.A01
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L76
            X.14I r0 = X.C14H.A03
            X.14H r3 = r0.A00()
            android.app.Activity r1 = r6.A00
            r0 = 268468224(0x10008000, float:2.5342157E-29)
        L29:
            android.content.Intent r3 = r3.A03(r1, r0)
        L2d:
            r0 = 664(0x298, float:9.3E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r3.putExtra(r0, r4)
            java.lang.String r0 = "MainActivityAccountHelper.ACCOUNT_SWITCH_ENTRY_POINT"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "end_of_activity_feed"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "MainActivityAccountHelper.STARTUP_TAB"
            if (r0 == 0) goto L73
            X.1QO r0 = X.C1QO.A0D
        L47:
            java.lang.String r0 = r0.toString()
            r3.putExtra(r1, r0)
            java.lang.String r1 = "profile"
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L59
            r3.putExtra(r1, r4)
        L59:
            r0 = 0
            X.AbstractC54852fj.A00 = r0
            android.app.Activity r1 = r6.A00
            r1.finish()
            if (r8 == 0) goto L6a
            java.lang.Runnable r0 = r7.A01
            if (r0 == 0) goto L6a
            r0.run()
        L6a:
            X.C12260kU.A0C(r1, r3)
            if (r2 == 0) goto L72
            X.C12260kU.A01(r1, r2)
        L72:
            return
        L73:
            X.1QO r0 = X.C1QO.A0C
            goto L47
        L76:
            X.14I r0 = X.C14H.A03
            X.14H r3 = r0.A00()
            android.app.Activity r1 = r6.A00
            r0 = 268533760(0x10018000, float:2.5539372E-29)
            goto L29
        L82:
            r3 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59762oJ.A00(X.2oJ, X.0Js, boolean):void");
    }

    public C59762oJ(Activity activity, UserSession userSession, InterfaceC53952dZ interfaceC53952dZ) {
        this.A03 = userSession;
        this.A04 = interfaceC53952dZ;
        this.A00 = activity;
    }
}
