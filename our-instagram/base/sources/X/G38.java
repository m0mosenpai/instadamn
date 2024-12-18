package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G38 implements InterfaceC37156GYt {
    public final Context A00;
    public final View.OnClickListener A01;
    public final C31817Dyb A02;
    public final C34421FFl A03;
    public final E70 A04;
    public final UserSession A05;
    public final boolean A06;

    public G38(Context context, View.OnClickListener onClickListener, UserSession userSession, C31817Dyb c31817Dyb, C34421FFl c34421FFl, E70 e70, boolean z) {
        C14360o3.A0B(userSession, 2);
        AbstractC167017dG.A1T(c34421FFl, c31817Dyb);
        this.A00 = context;
        this.A05 = userSession;
        this.A04 = e70;
        this.A06 = z;
        this.A03 = c34421FFl;
        this.A02 = c31817Dyb;
        this.A01 = onClickListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r3.intValue() <= 0) goto L40;
     */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G38.getItems():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r0.intValue() <= 0) goto L19;
     */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEnabled() {
        /*
            r10 = this;
            X.E70 r9 = r10.A04
            X.3kP r7 = r9.A0E
            r0 = 0
            if (r7 == 0) goto L64
            java.lang.String r1 = r7.A07
        L9:
            com.instagram.common.session.UserSession r5 = r10.A05
            boolean r8 = X.AbstractC31171DnF.A1W(r5, r1)
            if (r7 == 0) goto L13
            java.util.List r0 = r7.A0G
        L13:
            r4 = 1
            if (r0 == 0) goto L1d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            r6 = r0 ^ 1
            if (r7 == 0) goto L2d
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()
            r3 = 1
            if (r0 > 0) goto L2e
        L2d:
            r3 = 0
        L2e:
            X.98R r2 = X.C98Q.A00(r5)
            X.3oI r1 = r9.A0L
            r0 = 40
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L66
            if (r8 == 0) goto L66
            if (r7 == 0) goto L66
            boolean r0 = r7.A0H
            if (r0 != r4) goto L66
            if (r6 != 0) goto L48
            if (r3 == 0) goto L66
        L48:
            java.util.List r0 = r7.A0D
            if (r0 == 0) goto L52
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L66
        L52:
            java.util.List r0 = r7.A0E
            if (r0 == 0) goto L5c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L66
        L5c:
            r0 = 0
            boolean r0 = X.C7HD.A04(r5, r0)
            if (r0 == 0) goto L66
            return r4
        L64:
            r1 = r0
            goto L9
        L66:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G38.isEnabled():boolean");
    }
}
