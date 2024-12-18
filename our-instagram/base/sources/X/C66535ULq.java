package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.ULq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66535ULq extends WU2 {
    public static Thread A06;
    public static final BlockingQueue A07 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A08 = new AtomicBoolean();
    public static volatile C71182WpU A09;
    public String A00;
    public String A01;
    public final int A02;
    public final W3L A03;
    public final AtomicLong A04;
    public final AtomicLong A05;

    public C66535ULq(Context context, W3L w3l, int i) {
        super(i);
        this.A04 = new AtomicLong(0L);
        this.A05 = new AtomicLong(0L);
        if (A08.compareAndSet(false, true)) {
            C70184WFm.A01(new C66531ULl(context, this));
        }
        this.A00 = "";
        int i2 = AbstractC167007dF.A0K(context).densityDpi;
        int i3 = 320;
        if (i2 <= 320) {
            i3 = C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
            if (i2 <= 250) {
                i3 = 72;
            }
        }
        this.A02 = i3;
        this.A03 = w3l;
    }
}
