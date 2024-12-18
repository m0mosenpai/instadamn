package X;

import android.content.Context;

/* renamed from: X.TGl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64499TGl implements C5OV {
    public final Context A00;
    public final boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (1 != r0) goto L8;
     */
    @Override // X.C5OV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E3b(X.C5OW r4) {
        /*
            r3 = this;
            android.content.Context r1 = r3.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            X.C14360o3.A0C(r1, r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            r2 = 1
            if (r1 == 0) goto L23
            boolean r0 = r1.isConnected()
            if (r0 != r2) goto L23
            int r0 = r1.getType()
            r1 = 1
            if (r2 == r0) goto L24
        L23:
            r1 = 0
        L24:
            boolean r0 = r3.A01
            if (r0 == r1) goto L29
            r2 = 0
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64499TGl.E3b(X.5OW):boolean");
    }

    public C64499TGl(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
