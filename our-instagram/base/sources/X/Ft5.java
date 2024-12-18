package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class Ft5 implements C2JL {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ UserSession A01;

    public Ft5(CallerContext callerContext, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = callerContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (X.AbstractC14490oL.A0J(r1.getPackageManager(), "com.facebook.lite") != false) goto L6;
     */
    @Override // X.C2JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            java.util.List r0 = X.AbstractC25228BEl.A1C(r12)
            com.instagram.common.session.UserSession r4 = r11.A01
            android.content.Context r1 = X.AbstractC25225BEi.A0F(r4)
            boolean r5 = X.AbstractC166987dD.A1b(r0)
            r9 = 1
            boolean r0 = X.AbstractC14490oL.A0B(r1)
            if (r0 != 0) goto L22
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "com.facebook.lite"
            boolean r0 = X.AbstractC14490oL.A0J(r1, r0)
            r3 = 0
            if (r0 == 0) goto L23
        L22:
            r3 = 1
        L23:
            r0 = 36325901381744121(0x810e37000135f9, double:3.03598453425463E-306)
            boolean r2 = X.AbstractC54472f1.A06(r4, r0)
            r0 = 36325901381875195(0x810e37000335fb, double:3.035984534337522E-306)
            boolean r0 = X.AbstractC54472f1.A06(r4, r0)
            if (r3 != 0) goto L39
            if (r2 != 0) goto L3d
        L39:
            if (r0 == 0) goto L52
            if (r5 != 0) goto L52
        L3d:
            X.1uz r5 = X.AbstractC40751ui.A00(r4)
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r8 = X.AbstractC111324zv.A00(r0)
            com.facebook.common.callercontext.CallerContext r6 = r11.A00
            X.GJa r7 = new X.GJa
            r7.<init>(r4)
            r10 = r9
            r5.A0K(r6, r7, r8, r9, r10)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ft5.onSuccess(java.lang.Object):void");
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
    }
}
