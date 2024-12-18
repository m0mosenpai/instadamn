package X;

import android.widget.CompoundButton;

/* renamed from: X.FqI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35735FqI implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C33212El0 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C35735FqI(C33212El0 c33212El0, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = c33212El0;
        this.A02 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r10.A02 == false) goto L15;
     */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r11, boolean r12) {
        /*
            r10 = this;
            boolean r2 = r10.A01
            if (r2 == r12) goto L36
            if (r12 == 0) goto L46
            X.El0 r3 = r10.A00
            X.0do r2 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r2)
            java.lang.Integer r0 = X.C05F.A02
            X.AbstractC35075Fcm.A00(r1, r0)
            android.os.Bundle r5 = r3.requireArguments()
            java.lang.String r0 = "is_phone_confirmed"
            boolean r0 = r5.getBoolean(r0)
            X.FRQ r4 = X.AbstractC35179FfW.A00()
            if (r0 == 0) goto L37
            java.lang.String r8 = X.AbstractC31180DnO.A0a(r5)
            java.lang.Integer r6 = X.C05F.A00
            r9 = 1
            r7 = r6
            X.EJc r0 = r4.A01(r5, r6, r7, r8, r9)
        L2f:
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.AbstractC31179DnN.A0y(r0, r1, r2)
        L36:
            return
        L37:
            r1 = 0
            java.lang.String r0 = "ARG_IS_ENABLING_WHATSAPP"
            r5.putBoolean(r0, r1)
            X.EK3 r0 = new X.EK3
            r0.<init>()
            r0.setArguments(r5)
            goto L2f
        L46:
            X.El0 r6 = r10.A00
            X.0do r0 = r6.A00
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            java.lang.Integer r0 = X.C05F.A04
            X.AbstractC35075Fcm.A00(r1, r0)
            X.C14360o3.A0A(r11)
            if (r2 == 0) goto L63
            boolean r0 = r10.A02
            r2 = 1
            r5 = 2131975990(0x7f135f36, float:1.9589088E38)
            r1 = 2131975989(0x7f135f35, float:1.9589086E38)
            if (r0 != 0) goto L6a
        L63:
            r2 = 0
            r5 = 2131975826(0x7f135e92, float:1.9588755E38)
            r1 = 2131975825(0x7f135e91, float:1.9588753E38)
        L6a:
            r0 = 2131976002(0x7f135f42, float:1.9589112E38)
            java.lang.String r4 = X.AbstractC25227BEk.A0v(r6, r0)
            if (r2 == 0) goto L93
            X.8hE r3 = X.EnumC193348hE.A03
        L75:
            X.8hC r2 = X.AbstractC31175DnJ.A0O(r6)
            r2.A0A(r5)
            r2.A09(r1)
            r0 = 64
            X.FkA r1 = X.DialogInterfaceOnClickListenerC35453FkA.A00(r6, r0)
            r0 = 1
            r2.A0Z(r1, r3, r4, r0)
            r0 = 65
            X.FkA r0 = X.DialogInterfaceOnClickListenerC35453FkA.A00(r11, r0)
            X.AbstractC31176DnK.A14(r0, r2)
            return
        L93:
            X.8hE r3 = X.EnumC193348hE.A06
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35735FqI.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
