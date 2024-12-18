package X;

/* renamed from: X.Ns7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53875Ns7 {
    public static final int A00() {
        Runtime runtime = Runtime.getRuntime();
        return (int) ((runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory())) >> 20);
    }
}
