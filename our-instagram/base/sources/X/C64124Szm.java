package X;

import android.content.Context;

/* renamed from: X.Szm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64124Szm implements InterfaceC65541TmF {
    public final Context A00;
    public final InterfaceC40711ue A01;
    public final C40681ub A02;

    @Override // X.InterfaceC65541TmF
    public final String Be9() {
        return "token_ack";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0.longValue() != 52) goto L12;
     */
    @Override // X.InterfaceC65541TmF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E6A(X.QIm r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            com.facebook.pushlite.model.PushInfraMetaData r0 = r9.A04     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r0.A09     // Catch: java.lang.Throwable -> L2c
            X.1ue r6 = r8.A01     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L2c
            X.1ub r5 = r8.A02     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2c
            if (r7 == 0) goto L2c
            java.lang.Long r0 = r0.A01     // Catch: java.lang.Throwable -> L2c
            r3 = 52
            if (r0 == 0) goto L21
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L2c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L22
        L21:
            r2 = 0
        L22:
            android.content.Context r1 = r8.A00     // Catch: java.lang.Throwable -> L2c
            X.PvZ r0 = new X.PvZ     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r1, r6, r5)     // Catch: java.lang.Throwable -> L2c
            r0.A00(r7, r2)     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64124Szm.E6A(X.QIm):java.lang.Object");
    }

    @Override // X.InterfaceC65541TmF
    public final boolean EjA(QIm qIm) {
        C14360o3.A0B(qIm, 0);
        if (this.A01 != null && this.A02 != null && qIm.A04.A09 != null) {
            return true;
        }
        return false;
    }

    public C64124Szm(Context context, InterfaceC40711ue interfaceC40711ue, C40681ub c40681ub) {
        this.A00 = context;
        this.A01 = interfaceC40711ue;
        this.A02 = c40681ub;
    }
}
