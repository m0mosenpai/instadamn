package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2JI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JI {
    public static final long A04 = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
    public final C2JH A00;
    public final AtomicInteger A01;
    public final AtomicReference A02;
    public final /* synthetic */ C2JG A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2JI(C2JG c2jg) {
        this();
        this.A03 = c2jg;
    }

    public C2JI() {
        this.A00 = new C2JH(A04);
        this.A02 = new AtomicReference();
        this.A01 = new AtomicInteger(0);
    }
}
