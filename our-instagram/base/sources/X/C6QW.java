package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6QW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6QW {
    public static final C006802i A00 = C006802i.A0p;
    public static final AtomicInteger A01 = new AtomicInteger(0);

    public static final void A02(String str, String str2, int i, boolean z) {
        C006802i c006802i = A00;
        if (c006802i != null) {
            int andIncrement = A01.getAndIncrement();
            c006802i.markerStart(i, andIncrement);
            if (str2 != null) {
                c006802i.markerAnnotate(i, andIncrement, str, str2);
            }
            short s = 3;
            if (z) {
                s = 2;
            }
            c006802i.markerEnd(i, andIncrement, s);
        }
    }

    public static final void A00(String str) {
        A02("Animation Type", str, 38797313, true);
    }

    public static final void A01(String str) {
        A02("Font Type", str, 38797314, true);
    }

    public static final void A03(String str, boolean z) {
        A02("File Accessed", str, 38797321, z);
    }
}
