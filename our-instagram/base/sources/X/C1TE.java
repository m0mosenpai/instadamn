package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.1TE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TE {
    public static final boolean A03;
    public C69192VjL A00;
    public final Context A01;
    public final Handler A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r2 > 33) goto L6;
     */
    static {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r2 < r0) goto Lb
            r1 = 33
            r0 = 1
            if (r2 <= r1) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.C1TE.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1TE.<clinit>():void");
    }

    public C1TE(Context context, Handler handler) {
        this.A01 = context;
        this.A02 = handler;
    }
}
