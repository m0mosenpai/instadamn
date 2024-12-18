package X;

import android.os.Looper;
import android.os.MessageQueue;

/* loaded from: classes8.dex */
public final class LHx {
    public static final MessageQueue A02;
    public static final C46554Kit A03 = new Object();
    public final C01U A00;
    public final C46554Kit A01;

    public LHx(C46554Kit c46554Kit) {
        C14360o3.A0B(c46554Kit, 1);
        this.A01 = c46554Kit;
        this.A00 = new C01U();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Kit] */
    static {
        MessageQueue myQueue = Looper.myQueue();
        C14360o3.A07(myQueue);
        A02 = myQueue;
    }

    public LHx() {
        this(A03);
    }
}
