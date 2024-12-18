package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BQW extends AbstractC116895Qv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r8.A0C != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r8) {
        /*
            r7 = this;
            r5 = 0
            X.C14360o3.A0B(r8, r5)
            java.util.List r0 = r8.A09
            java.util.ArrayList r4 = X.AbstractC166987dD.A1F(r0)
            int r0 = r4.size()
            r6 = 1
            if (r0 <= r6) goto L51
            X.CLS r2 = X.C25513BQb.A01
            com.instagram.common.session.UserSession r3 = r7.A01
            monitor-enter(r2)
            r0 = 46
            X.DGf r1 = X.C29891DGf.A00(r3, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Class<X.BQb> r0 = X.C25513BQb.class
            java.lang.Object r1 = r3.A01(r0, r1)     // Catch: java.lang.Throwable -> L25
            X.BQb r1 = (X.C25513BQb) r1     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L28:
            monitor-exit(r2)
            android.content.Context r2 = r7.A00
            boolean r0 = r8.A0D
            if (r0 == 0) goto L3f
            boolean r0 = r7.A02
            if (r0 == 0) goto L37
            boolean r0 = r8.A0C
            if (r0 == 0) goto L3f
        L37:
            int r0 = r4.size()
            java.util.List r4 = r4.subList(r6, r0)
        L3f:
            r0 = 2
            X.C14360o3.A0B(r4, r0)
            X.BQZ r1 = r1.A00
            X.BQY r0 = new X.BQY
            r0.<init>(r2, r3, r4)
            android.os.Message r0 = r1.obtainMessage(r5, r0)
            r1.sendMessage(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQW.D5H(X.GkY):void");
    }

    public BQW(UserSession userSession, Context context, boolean z) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = z;
    }
}
