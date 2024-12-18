package X;

import android.widget.CompoundButton;

/* renamed from: X.FqJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35736FqJ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C33230ElN A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C35736FqJ(C33230ElN c33230ElN, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = c33230ElN;
        this.A02 = z2;
        this.A03 = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r5.A03 == false) goto L30;
     */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.A01
            if (r0 == r7) goto L54
            X.ElN r4 = r5.A00
            X.0do r3 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r3)
            if (r7 == 0) goto L69
            java.lang.Integer r0 = X.C05F.A03
        L10:
            X.AbstractC35075Fcm.A00(r1, r0)
            if (r7 == 0) goto L6c
            android.content.Context r0 = r4.requireContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.String r0 = X.AbstractC31178DnM.A0W()
            boolean r1 = X.AbstractC14490oL.A0J(r1, r0)
            android.content.Context r0 = r4.requireContext()
            boolean r0 = X.AbstractC31179DnN.A1Y(r0)
            X.AbstractC35179FfW.A03()
            android.os.Bundle r2 = r4.requireArguments()
            if (r1 == 0) goto L5e
            if (r0 == 0) goto L5b
            java.lang.Integer r0 = X.C05F.A0C
        L3a:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L55;
                case 1: goto L58;
                default: goto L41;
            }
        L41:
            java.lang.String r1 = "Authentication App"
        L43:
            java.lang.String r0 = "arg_two_fac_app_name"
            r2.putString(r0, r1)
            X.EKf r1 = new X.EKf
            r1.<init>()
        L4d:
            androidx.fragment.app.FragmentActivity r0 = X.AbstractC31173DnH.A0J(r2, r1, r4)
            X.AbstractC31179DnN.A0y(r1, r0, r3)
        L54:
            return
        L55:
            java.lang.String r1 = "Duo Mobile"
            goto L43
        L58:
            java.lang.String r1 = "Google Authenticator"
            goto L43
        L5b:
            java.lang.Integer r0 = X.C05F.A00
            goto L3a
        L5e:
            if (r0 == 0) goto L63
            java.lang.Integer r0 = X.C05F.A01
            goto L3a
        L63:
            X.EKe r1 = new X.EKe
            r1.<init>()
            goto L4d
        L69:
            java.lang.Integer r0 = X.C05F.A05
            goto L10
        L6c:
            X.C14360o3.A0A(r6)
            boolean r0 = r5.A02
            if (r0 == 0) goto L80
            boolean r1 = r5.A03
            r3 = 2131975828(0x7f135e94, float:1.958876E38)
            r0 = 2131975827(0x7f135e93, float:1.9588757E38)
            r2 = 2131975976(0x7f135f28, float:1.958906E38)
            if (r1 != 0) goto L89
        L80:
            r3 = 2131975826(0x7f135e92, float:1.9588755E38)
            r0 = 2131975825(0x7f135e91, float:1.9588753E38)
            r2 = 2131976002(0x7f135f42, float:1.9589112E38)
        L89:
            X.8hC r1 = X.AbstractC31175DnJ.A0O(r4)
            r1.A0A(r3)
            r1.A09(r0)
            r0 = 57
            X.DialogInterfaceOnClickListenerC35453FkA.A02(r1, r4, r0, r2)
            r0 = 58
            X.FkA r0 = X.DialogInterfaceOnClickListenerC35453FkA.A00(r6, r0)
            X.AbstractC31176DnK.A14(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35736FqJ.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
