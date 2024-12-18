package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2Q3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Q3 implements InterfaceC13000lm, InterfaceC13030lp {
    public final UserSession A00;
    public final List A01;
    public final C19L A02 = AnonymousClass194.A02(new AnonymousClass197(null).plus(C12L.A00.AOT(1911310022, 3)));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C2Q3 r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 38
            boolean r0 = X.C206459Cc.A00(r7, r3)
            if (r0 == 0) goto L4d
            r5 = r7
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 != r3) goto L56
            java.lang.Object r2 = r5.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r5.A01
            X.AbstractC09560e7.A00(r1)
        L2a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r2.next()
            X.2Q2 r1 = (X.C2Q2) r1
            r5.A01 = r0
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r1 = r1.A01(r5)
            if (r1 != r4) goto L2a
            return r4
        L43:
            X.AbstractC09560e7.A00(r1)
            java.util.List r0 = r6.A01
            java.util.Iterator r2 = r0.iterator()
            goto L2a
        L4d:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r7, r3)
            goto L16
        L53:
            X.0eB r4 = X.C0eB.A00
            return r4
        L56:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Q3.A00(X.2Q3, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13030lp
    public final void DyC(boolean z) {
        C19L c19l = this.A02;
        B5E b5e = new B5E(this, null);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, b5e, c19l);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AnonymousClass194.A05(null, this.A02);
    }

    public C2Q3(UserSession userSession, List list) {
        this.A00 = userSession;
        this.A01 = list;
    }
}
