package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.FkI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC35461FkI implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC37164GZb A01;
    public final /* synthetic */ C34694FQf A02;
    public final /* synthetic */ C35233FgQ A03;
    public final /* synthetic */ EnumC33444EqG A04;

    public DialogInterfaceOnDismissListenerC35461FkI(Context context, InterfaceC37164GZb interfaceC37164GZb, C34694FQf c34694FQf, C35233FgQ c35233FgQ, EnumC33444EqG enumC33444EqG) {
        this.A03 = c35233FgQ;
        this.A02 = c34694FQf;
        this.A04 = enumC33444EqG;
        this.A00 = context;
        this.A01 = interfaceC37164GZb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0 != false) goto L8;
     */
    @Override // android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r8) {
        /*
            r7 = this;
            boolean r0 = X.C35233FgQ.A07
            X.FgQ r5 = r7.A03
            if (r0 == 0) goto L4f
            X.FQf r6 = r7.A02
            X.EqG r4 = r7.A04
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36322976509209380(0x810b8e00042b24, double:3.0341348330861434E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L25
            r0 = 36322976509274917(0x810b8e00052b25, double:3.034134833127589E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r2 = 0
            if (r0 == 0) goto L26
        L25:
            r2 = 1
        L26:
            r1 = 1
            java.lang.String r0 = "ci"
            r6.A00(r0, r1, r2)
            X.C36114Fwo.A00(r3)
            X.6jf r3 = r5.A03
            java.lang.String r2 = X.AbstractC31180DnO.A0k(r4)
            X.0wW r1 = r3.A02
            java.lang.String r0 = "ci_modal_accepted"
            X.0Ai r0 = X.AbstractC166987dD.A0f(r1, r0)
            if (r2 != 0) goto L41
            java.lang.String r2 = r3.A04
        L41:
            X.AbstractC31175DnJ.A17(r0, r2)
            r0 = 0
            X.C35233FgQ.A07 = r0
        L47:
            X.GZb r0 = r7.A01
            if (r0 == 0) goto L4e
            r0.onDismiss()
        L4e:
            return
        L4f:
            android.content.Context r2 = r7.A00
            X.EqG r4 = r7.A04
            com.instagram.common.session.UserSession r1 = r5.A02
            r0 = 0
            r3 = 0
            X.1ON r0 = X.AbstractC35238FgX.A01(r2, r1, r3, r0)
            X.C1GJ.A03(r0)
            X.C36114Fwo.A00(r1)
            X.6jf r2 = r5.A03
            if (r4 == 0) goto L69
            java.lang.String r3 = r4.toString()
        L69:
            X.0wW r1 = r2.A02
            java.lang.String r0 = "ci_modal_denied"
            X.0Ai r0 = X.AbstractC166987dD.A0f(r1, r0)
            if (r3 != 0) goto L75
            java.lang.String r3 = r2.A04
        L75:
            X.AbstractC31175DnJ.A17(r0, r3)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC35461FkI.onDismiss(android.content.DialogInterface):void");
    }
}
