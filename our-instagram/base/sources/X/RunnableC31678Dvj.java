package X;

import java.util.ArrayList;

/* renamed from: X.Dvj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31678Dvj implements Runnable {
    public final /* synthetic */ JR2 A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC31678Dvj(JR2 jr2, ArrayList arrayList) {
        this.A00 = jr2;
        this.A01 = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A0p(), 36317908449302197L) != false) goto L7;
     */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            X.JR2 r5 = r6.A00
            java.util.ArrayList r1 = r6.A01
            boolean r0 = r1 instanceof java.util.Collection
            r4 = 1
            if (r0 == 0) goto L24
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L24
        Lf:
            r4 = 0
        L10:
            X.Jbk r0 = r5.A1O
            if (r0 == 0) goto L53
            X.JR3 r0 = r0.A00
            X.Doe r1 = r0.A04
            if (r1 != 0) goto L4a
            java.lang.String r0 = "actionBarRepository"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.next()
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0U
            if (r0 == 0) goto L28
            com.instagram.common.session.UserSession r3 = r5.A0p()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317908449302197(0x8106f2001b16b5, double:3.0309297715934017E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lf
            goto L10
        L4a:
            boolean r0 = r1.A04
            if (r0 == r4) goto L53
            r1.A04 = r4
            X.C31256Doe.A01(r1)
        L53:
            android.view.View r1 = r5.A09
            if (r1 == 0) goto L5e
            int r0 = X.AbstractC167007dF.A05(r4)
            r1.setVisibility(r0)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC31678Dvj.run():void");
    }
}
