package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;

/* renamed from: X.FQe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34693FQe {
    public Fragment A00;
    public BusinessFlowAnalyticsLogger A01;
    public InterfaceC37222GaX A02;
    public PageSelectionOverrideData A03;
    public EVM A04;
    public AbstractC12990ll A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C = AbstractC167007dF.A0J();

    public final void A00(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("page_selection", this.A06, str, null, null, null, null, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r8.B77() != X.EnumC151596s5.A0C) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2 != X.EnumC151596s5.A0B) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r3), r3, 36310271995805697L) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C34693FQe(androidx.fragment.app.Fragment r6, com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r7, X.InterfaceC37222GaX r8, X.AbstractC12990ll r9) {
        /*
            r5 = this;
            r5.<init>()
            android.os.Handler r0 = X.AbstractC167007dF.A0J()
            r5.A0C = r0
            boolean r0 = r6 instanceof X.C38K
            if (r0 != 0) goto L18
            boolean r0 = r6 instanceof X.AbstractC59962oe
            if (r0 != 0) goto L18
            java.lang.String r0 = "Invalid fragment type passed in the constructor. The fragment type must be either IgListFragment or IgFragment"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L18:
            r5.A05 = r9
            r5.A00 = r6
            r5.A02 = r8
            r5.A01 = r7
            if (r8 == 0) goto L2b
            X.6s5 r2 = r8.B77()
            X.6s5 r1 = X.EnumC151596s5.A0C
            r0 = 1
            if (r2 == r1) goto L2c
        L2b:
            r0 = 0
        L2c:
            r5.A09 = r0
            X.GaX r0 = r5.A02
            if (r0 == 0) goto L3b
            X.6s5 r2 = r0.B77()
            X.6s5 r1 = X.EnumC151596s5.A0B
            r0 = 1
            if (r2 == r1) goto L3c
        L3b:
            r0 = 0
        L3c:
            r5.A08 = r0
            X.GaX r0 = r5.A02
            boolean r0 = X.AbstractC35211Fg4.A02(r0)
            r5.A07 = r0
            X.GaX r0 = r5.A02
            X.AbstractC35211Fg4.A04(r0)
            X.GaX r0 = r5.A02
            boolean r0 = X.AbstractC35211Fg4.A03(r0)
            r5.A0B = r0
            r4 = 1
            if (r0 != 0) goto L6a
            boolean r0 = r5.A07
            if (r0 == 0) goto L6a
            X.0ll r3 = r5.A05
            com.facebook.common.callercontext.CallerContext r0 = X.C35792FrU.A00
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36310271995740160(0x81000000010000, double:3.026100447611239E-306)
            X.C18U.A06(r2, r3, r0)
        L6a:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L88
            boolean r0 = r5.A07
            if (r0 == 0) goto L88
            X.0ll r3 = r5.A05
            com.facebook.common.callercontext.CallerContext r0 = X.C35792FrU.A00
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36310271995805697(0x81000000020001, double:3.026100447652685E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L88
        L85:
            r5.A0A = r4
            return
        L88:
            r4 = 0
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34693FQe.<init>(androidx.fragment.app.Fragment, com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger, X.GaX, X.0ll):void");
    }
}
