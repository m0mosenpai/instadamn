package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106994s0 {
    public int A00;
    public int A01;
    public int A02;
    public final float A04;
    public C107004s1 A03 = new Object();
    public final C107004s1 A05 = new Object();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4s1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.4s1, java.lang.Object] */
    public C106994s0(float f) {
        this.A04 = ((float) TimeUnit.SECONDS.toNanos(1L)) / f;
    }
}
