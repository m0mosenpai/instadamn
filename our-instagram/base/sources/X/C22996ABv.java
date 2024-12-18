package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ABv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22996ABv {
    public G1U A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final View A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C32679Ea6 A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final View A0B;
    public final InterfaceC41501vz A0C;
    public final InterfaceC41501vz A0D;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r15, 36327331605920252L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C22996ABv(android.content.Context r12, android.view.View r13, androidx.fragment.app.FragmentActivity r14, com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r11 = this;
            r4 = 3
            r8 = r13
            X.C14360o3.A0B(r13, r4)
            r11.<init>()
            r7 = r12
            r11.A03 = r12
            r6 = r14
            r11.A05 = r14
            r11.A0B = r13
            r9 = r15
            r11.A06 = r15
            r1 = r16
            r11.A09 = r1
            r0 = r17
            r11.A0A = r0
            r0 = r18
            r11.A08 = r0
            r11.A04 = r13
            boolean r0 = X.C7HD.A05(r1)
            if (r0 == 0) goto L35
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36327331605920252(0x810f84000239fc, double:3.036889013782666E-306)
            boolean r1 = X.C18U.A06(r2, r15, r0)
            r0 = 1
            if (r1 != 0) goto L36
        L35:
            r0 = 0
        L36:
            r10 = r0 ^ 1
            X.Ea6 r5 = new X.Ea6
            r5.<init>(r6, r7, r8, r9, r10)
            r11.A07 = r5
            X.9HR r3 = new X.9HR
            r3.<init>(r11, r4)
            r11.A0C = r3
            r0 = 13
            X.DvG r2 = new X.DvG
            r2.<init>(r11, r0)
            r11.A0D = r2
            r5.A04()
            X.1My r1 = X.AbstractC25651Mw.A00(r15)
            java.lang.Class<X.7LZ> r0 = X.C7LZ.class
            r1.A01(r3, r0)
            X.1My r1 = X.AbstractC25651Mw.A00(r15)
            java.lang.Class<X.FwC> r0 = X.C36076FwC.class
            r1.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22996ABv.<init>(android.content.Context, android.view.View, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A00() {
        UserSession userSession = this.A06;
        AbstractC25651Mw.A00(userSession).A02(this.A0C, C7LZ.class);
        AbstractC25651Mw.A00(userSession).A02(this.A0D, C36076FwC.class);
        InterfaceC37220GaV interfaceC37220GaV = ((C35045FcI) this.A07).A07;
        if (interfaceC37220GaV != null) {
            interfaceC37220GaV.DAx();
        }
    }
}
