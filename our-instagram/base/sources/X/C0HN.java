package X;

import java.util.Random;

/* renamed from: X.0HN, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0HN {
    public static final Random A00 = new Random();

    public static long A00() {
        return ((System.currentTimeMillis() << 22) | (A00.nextInt() & 4194303)) & Long.MAX_VALUE;
    }
}
