package X;

/* renamed from: X.15T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15T {
    public static volatile Integer A00;

    public static int A00() {
        int i;
        if (A00 == null) {
            int[] A002 = C15U.A00("(RenderThread)");
            if (A002.length != 1) {
                i = -1;
            } else {
                i = A002[0];
            }
            A00 = Integer.valueOf(i);
        }
        return A00.intValue();
    }
}
