package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WDF {
    public C41761wQ A00;
    public C7TQ A01;
    public XAZ A02;
    public C3o9 A03;
    public Boolean A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final Activity A08;
    public final Context A09;
    public final Fragment A0A;
    public final AbstractC10360h2 A0B;
    public final C18920wW A0C;
    public final UserSession A0D;
    public final InterfaceC69973Cg A0E;
    public final C68744VbN A0F;
    public final String A0G;
    public final String A0H;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if ((r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WDF(androidx.fragment.app.Fragment r5, X.C18920wW r6, com.instagram.common.session.UserSession r7, X.C3o9 r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r4 = this;
            r0 = 1334(0x536, float:1.87E-42)
            java.lang.String r3 = X.AbstractC111324zv.A00(r0)
            X.0h2 r1 = r5.getChildFragmentManager()
            r0 = 0
            r4.<init>()
            r4.A0A = r5
            r4.A08 = r0
            r4.A0B = r1
            android.content.Context r2 = r5.requireContext()
            r4.A09 = r2
            r4.A0D = r7
            r4.A0G = r9
            r4.A0H = r10
            r4.A06 = r11
            r4.A07 = r12
            r4.A0C = r6
            r4.A03 = r8
            r4.A05 = r3
            if (r8 == 0) goto L31
            boolean r1 = r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r0 = 1
            if (r1 != 0) goto L32
        L31:
            r0 = 0
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            X.VbN r0 = new X.VbN
            r0.<init>(r6)
            r4.A0F = r0
            r1 = 0
            X.G0t r0 = new X.G0t
            r0.<init>(r4, r1)
            X.3Cf r0 = X.AbstractC69933Cc.A00(r2, r7, r0)
            r4.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDF.<init>(androidx.fragment.app.Fragment, X.0wW, com.instagram.common.session.UserSession, X.3o9, java.lang.String, java.lang.String, int, int):void");
    }

    public static void A00(WDF wdf) {
        C193328hC c193328hC = new C193328hC(wdf.A09);
        c193328hC.A0A(2131961880);
        int i = 2131960593;
        if (C18U.A05(C06090Tz.A05, wdf.A0D)) {
            i = 2131960592;
        }
        c193328hC.A09(i);
        c193328hC.A0J(new WHP(wdf, 49), 2131960994);
        AbstractC166987dD.A1W(c193328hC);
    }

    public final void A01(android.net.Uri uri) {
        XAZ xaz = this.A02;
        if (xaz != null) {
            new C67858Uzp().A0B(this.A0B, ReactProgressBarViewManager.PROP_PROGRESS);
            String valueOf = String.valueOf(System.nanoTime());
            Context context = this.A09;
            UserSession userSession = this.A0D;
            AbstractC25230BEn.A15(1, context, userSession);
            C121275eQ c121275eQ = new C121275eQ(new TUT(context, userSession, uri, valueOf, 2), 679);
            C67856Uzb c67856Uzb = new C67856Uzb(userSession, xaz, this, 2);
            String str = this.A0G;
            c121275eQ.A00 = new C67994V5j(c67856Uzb, this.A00, userSession, this.A01, new C68972VfA(xaz, this), this.A03, valueOf, str);
            C1GJ.A03(c121275eQ);
        }
    }

    public final void A02(boolean z) {
        int i = this.A07;
        Boolean valueOf = Boolean.valueOf(AbstractC167007dF.A1P(i, 29));
        C193328hC c193328hC = new C193328hC(this.A09);
        c193328hC.A0A(2131960587);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC70206WHe(9, this, valueOf), 2131960589);
        c193328hC.A0H(new DialogInterfaceOnClickListenerC70206WHe(10, this, valueOf), 2131960707);
        c193328hC.A0D(new DialogInterfaceOnClickListenerC70206WHe(11, this, valueOf));
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        if (z) {
            int i2 = 2131960697;
            if (C7NG.A00(i)) {
                i2 = 2131960698;
            }
            c193328hC.A0H(new DialogInterfaceOnClickListenerC70206WHe(12, this, valueOf), i2);
        }
        AbstractC166987dD.A1W(c193328hC);
    }

    public WDF(FragmentActivity fragmentActivity, C18920wW c18920wW, UserSession userSession, InterfaceC69973Cg interfaceC69973Cg, String str, String str2, int i, int i2) {
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        this.A0A = null;
        this.A08 = fragmentActivity;
        this.A0B = supportFragmentManager;
        this.A09 = fragmentActivity;
        this.A0D = userSession;
        this.A0G = str;
        this.A0H = str2;
        this.A06 = i;
        this.A07 = i2;
        this.A0C = c18920wW;
        this.A03 = null;
        this.A05 = "message_thread";
        this.A04 = false;
        this.A0F = new C68744VbN(c18920wW);
        this.A0E = interfaceC69973Cg == null ? AbstractC69933Cc.A00(fragmentActivity, userSession, new C36324G0t(this, 0)) : interfaceC69973Cg;
    }
}
