package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class W1F {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final InterfaceC09390do A06;
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public static final AtomicInteger A04 = new AtomicInteger(0);
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public static final ConcurrentHashMap A02 = new ConcurrentHashMap();

    static {
        C17050sx A012 = AbstractC09440dt.A01(X3e.A00);
        A06 = A012;
        RunnableC71639Wxl runnableC71639Wxl = RunnableC71639Wxl.A00;
        A00 = runnableC71639Wxl;
        RunnableC71640Wxm runnableC71640Wxm = RunnableC71640Wxm.A00;
        A01 = runnableC71640Wxm;
        ((Handler) A012.getValue()).post(runnableC71639Wxl);
        ((Handler) A06.getValue()).post(runnableC71640Wxm);
    }

    public static final void A00(C68903Ve2 c68903Ve2, int i) {
        int i2 = c68903Ve2.A00;
        float f = i2 * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        int i3 = (int) f;
        C70424WVc c70424WVc = c68903Ve2.A01;
        int i4 = c70424WVc.A00;
        int A032 = C17s.A03(i4 + i, i3, i2);
        if (A032 != i4 && A032 != c70424WVc.A00) {
            c70424WVc.A00 = C17s.A03(A032, 1, c70424WVc.A04);
            C70424WVc.A00(c70424WVc).A02(c70424WVc.A00);
        }
    }
}
