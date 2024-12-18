package X;

import android.app.Activity;

/* renamed from: X.7Nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162077Nr extends AbstractC162047No implements InterfaceC162057Np {
    public boolean A00;
    public final Activity A01;
    public final String A02;

    @Override // X.AbstractC159137Bz
    public final AbstractC160207Gg createCommandData() {
        return new C7CG(this, this.loggingId, this.commandType, super.A00, this.A02, this.description, "ai", this.iconDrawableRes);
    }

    @Override // X.InterfaceC162057Np
    public final boolean shouldPrependOnReply(String str, EnumC46202Kce enumC46202Kce) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC46202Kce, 1);
        if (str.equals(this.A02) && enumC46202Kce != EnumC46202Kce.LONG_PRESS_REIMAGINE && AbstractC31268Doq.A05(this.userSession)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C162077Nr(android.app.Activity r12, com.instagram.common.session.UserSession r13) {
        /*
            r11 = this;
            X.7FY r4 = X.C7FY.A04
            java.lang.String r5 = "ai"
            X.7FZ r6 = X.C7FZ.A03
            X.AbstractC31265Don.A00()
            r0 = 2131960573(0x7f1322fd, float:1.9557818E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329985895907948(0x8111ee0005426c, double:3.0385675974588526E-306)
            r3 = r13
            boolean r0 = X.C18U.A06(r2, r13, r0)
            r8 = 2131238468(0x7f081e44, float:1.8093216E38)
            if (r0 == 0) goto L24
            r8 = 2131238465(0x7f081e41, float:1.809321E38)
        L24:
            X.7Ns r9 = X.C162087Ns.A00
            r0 = 5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A01 = r12
            X.AbstractC31265Don.A00()
            r0 = 2131960572(0x7f1322fc, float:1.9557816E38)
            java.lang.String r0 = r12.getString(r0)
            X.C14360o3.A07(r0)
            r11.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162077Nr.<init>(android.app.Activity, com.instagram.common.session.UserSession):void");
    }
}
