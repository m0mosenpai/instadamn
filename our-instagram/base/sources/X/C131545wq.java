package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131545wq extends C131555wr {
    public final Handler A00;
    public final Runnable A01;

    public C131545wq(Context context) {
        super(context);
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new Runnable() { // from class: X.5wv
            @Override // java.lang.Runnable
            public final void run() {
                C131545wq.this.setRenderTree(null);
            }
        };
    }
}
