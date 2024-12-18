package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class U22 {
    public U23 A00;
    public final Context A01;
    public final UserSession A02;
    public final C66155U1w A03;
    public final InterfaceC09390do A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r5.A04(X.C05F.A00, new X.VA4(r0), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r3 = r4.A03;
        r4 = (int) X.C18U.A01(X.AbstractC166997dE.A0U(r3), r3, 36609425058174858L);
        r1 = X.C16930sl.A00;
        X.C14360o3.A0B(r1, 3);
        r2 = X.AbstractC167017dG.A0q(r1);
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if (r1.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        X.AbstractC58318PtA.A1W(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r0 = new X.C51795Muz(r2, 0, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r3), r3, 36324767511359945L) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C66183U2y r5, X.U22 r6) {
        /*
            boolean r0 = r6.A08
            if (r0 != 0) goto L21
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131953228(0x7f13064c, float:1.9542921E38)
            X.BHS r3 = new X.BHS
            r3.<init>(r1, r0)
            java.lang.Integer r1 = X.C05F.A1I
            r0 = 0
            X.Mtj r2 = new X.Mtj
            r2.<init>(r3, r0, r1)
            X.VWV r1 = new X.VWV
            r1.<init>()
            java.lang.Integer r0 = X.C05F.A0C
            r5.A04(r0, r2, r1)
        L21:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.MZF r4 = X.U18.A00(r0)
            boolean r0 = X.C65911TwI.A03
            if (r0 == 0) goto L45
            boolean r0 = X.C65911TwI.A02
            if (r0 == 0) goto L45
        L2f:
            X.05A r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.XFM r0 = (X.XFM) r0
            if (r0 == 0) goto L57
        L39:
            X.VA4 r2 = new X.VA4
            r2.<init>(r0)
            r1 = 0
            java.lang.Integer r0 = X.C05F.A00
            r5.A04(r0, r2, r1)
            return
        L45:
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36324767511359945(0x810d2f001031c9, double:3.0352674700579475E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L57
            goto L2f
        L57:
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36609425058174858(0x8210140006178a, double:3.215286048887637E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r4 = (int) r0
            X.0sl r1 = X.C16930sl.A00
            r3 = 0
            r0 = 3
            X.C14360o3.A0B(r1, r0)
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r1)
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L80
            X.AbstractC58318PtA.A1W(r2, r1)
            goto L76
        L80:
            X.Muz r0 = new X.Muz
            r0.<init>(r2, r3, r4, r3)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U22.A00(X.U2y, X.U22):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (X.C66156U1x.A00.A00(r4) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U22(com.instagram.common.session.UserSession r4, android.content.Context r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A02 = r4
            r3.A01 = r5
            X.U1u r0 = X.AbstractC66154U1v.A00(r4)
            int r1 = r0.A00()
            X.U1w r0 = new X.U1w
            r0.<init>(r4, r1)
            r3.A03 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36310615593517251(0x810050000700c3, double:3.0263177402290287E-306)
            X.C18U.A06(r2, r4, r0)
            r0 = 36592090570686739(0x820050000e0113, double:3.204323649199772E-306)
            X.C18U.A01(r2, r4, r0)
            r1 = 10
            X.X2z r0 = new X.X2z
            r0.<init>(r3, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r3.A04 = r0
            boolean r0 = X.AbstractC65702TsY.A1Y(r4)
            if (r0 == 0) goto L44
            X.U1x r0 = X.C66156U1x.A00
            boolean r1 = r0.A00(r4)
            r0 = 1
            if (r1 != 0) goto L45
        L44:
            r0 = 0
        L45:
            r3.A05 = r0
            r0 = 36327950081080298(0x81101400003bea, double:3.0372801399642784E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r3.A06 = r0
            r0 = 36327950081670129(0x81101400093bf1, double:3.03728014033729E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r3.A07 = r0
            r0 = 36328242140364156(0x81105800173d7c, double:3.0374648394314186E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r3.A08 = r0
            r0 = 36330939378451546(0x8112cc0002445a, double:3.03917058365879E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L8d
            r0 = 36310615593451714(0x810050000600c2, double:3.026317740187583E-306)
            X.C18U.A06(r2, r4, r0)
            X.5jU r1 = X.AbstractC124145jT.A00(r4)
            X.U1u r0 = X.AbstractC66154U1v.A00(r4)
            r0.A00()
            X.U23 r0 = new X.U23
            r0.<init>(r1)
            r3.A00 = r0
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U22.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }

    public final int A01(C65965TxI c65965TxI, String str, String str2) {
        C01L A1I = C0eM.A1I();
        A1I.addAll(this.A03.A00(str));
        C01L A1J = C0eM.A1J(A1I);
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = A1J.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof C66130U0o)) {
                arrayList.add(next);
            }
        }
        c65965TxI.A05(arrayList, str2);
        return arrayList.size();
    }
}
