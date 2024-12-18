package X;

import android.app.Activity;

/* loaded from: classes6.dex */
public final class G9Z implements GZE {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC37177GZo A01;
    public final /* synthetic */ C34998FbV A02;
    public final /* synthetic */ Boolean A03;

    public G9Z(Activity activity, InterfaceC37177GZo interfaceC37177GZo, C34998FbV c34998FbV, Boolean bool) {
        this.A02 = c34998FbV;
        this.A00 = activity;
        this.A03 = bool;
        this.A01 = interfaceC37177GZo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    @Override // X.GZE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DqC(java.lang.String r5) {
        /*
            r4 = this;
            X.FbV r1 = r4.A02
            X.GZo r0 = r1.A01
            if (r0 == 0) goto L5a
            r2 = 0
            android.app.Activity r0 = r4.A00
            boolean r0 = X.LHp.A00(r0)
            if (r0 == 0) goto L5b
            X.C14360o3.A0B(r5, r2)
            java.util.regex.Pattern r0 = X.C35118FeL.A01
            X.C14360o3.A08(r0)
            java.lang.String r3 = X.C35118FeL.A00(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L33
            java.lang.Boolean r0 = r4.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            java.util.regex.Pattern r0 = X.C35118FeL.A02
            X.C14360o3.A08(r0)
            java.lang.String r3 = X.C35118FeL.A00(r5, r0)
            r2 = 1
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L42
            java.util.regex.Pattern r0 = X.C35118FeL.A05
        L3b:
            X.C14360o3.A08(r0)
            java.lang.String r3 = X.C35118FeL.A00(r5, r0)
        L42:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L88
            java.lang.Boolean r0 = r4.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            X.GZo r0 = r1.A01
            r0.Dhy(r3, r2)
        L55:
            X.GZo r0 = r1.A01
            r0.Dhx(r3)
        L5a:
            return
        L5b:
            X.C14360o3.A0B(r5, r2)
            java.util.regex.Pattern r0 = X.C35118FeL.A03
            X.C14360o3.A08(r0)
            java.lang.String r3 = X.C35118FeL.A00(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7f
            java.lang.Boolean r0 = r4.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
            java.util.regex.Pattern r0 = X.C35118FeL.A04
            X.C14360o3.A08(r0)
            java.lang.String r3 = X.C35118FeL.A00(r5, r0)
            r2 = 1
        L7f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L42
            java.util.regex.Pattern r0 = X.C35118FeL.A06
            goto L3b
        L88:
            X.GZo r1 = r1.A01
            java.lang.String r0 = "parse_error"
            r1.Dhz(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G9Z.DqC(java.lang.String):void");
    }

    @Override // X.GZE
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = "unknown";
        }
        this.A01.Dhz(str);
    }
}
