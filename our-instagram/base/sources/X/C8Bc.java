package X;

/* renamed from: X.8Bc, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8Bc {
    public static final int A00() {
        return Math.max((int) ((Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())) / 20), 100000);
    }
}
