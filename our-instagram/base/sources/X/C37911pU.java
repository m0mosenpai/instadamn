package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1pU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37911pU {
    public final int A00;
    public final C14080nY A01;
    public final java.util.Set A02 = new CopyOnWriteArraySet();

    public static final int A00(C3Q0 c3q0) {
        int ordinal;
        if (c3q0 == null) {
            ordinal = -1;
        } else {
            ordinal = c3q0.ordinal();
        }
        switch (ordinal) {
            case 1:
                return 5;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 1;
            default:
                return 0;
        }
    }

    public C37911pU(C14080nY c14080nY, int i) {
        this.A00 = i;
        this.A01 = c14080nY;
    }
}
