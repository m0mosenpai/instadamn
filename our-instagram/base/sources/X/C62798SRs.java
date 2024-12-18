package X;

import android.util.SparseIntArray;
import android.view.MotionEvent;

/* renamed from: X.SRs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62798SRs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.Sb5] */
    public static final R6D A00(MotionEvent motionEvent, SBQ sbq, Integer num, float f, float f2, int i, int i2, long j) {
        C14360o3.A0B(sbq, 7);
        R6D r6d = (R6D) R6D.A05.A7H();
        R6D r6d2 = r6d;
        if (r6d == null) {
            r6d2 = new Sb5();
        }
        AbstractC05810Sj.A00(motionEvent);
        long eventTime = motionEvent.getEventTime();
        ((Sb5) r6d2).A00 = i;
        ((Sb5) r6d2).A02 = i2;
        ((Sb5) r6d2).A03 = eventTime;
        r6d2.A05 = true;
        short s = 0;
        C62791SRl.A00(AbstractC167007dF.A1M((j > Long.MIN_VALUE ? 1 : (j == Long.MIN_VALUE ? 0 : -1))), "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5 && action != 6) {
                            throw AbstractC166987dD.A18(AnonymousClass001.A0O("Unhandled MotionEvent action: ", action));
                        }
                        SparseIntArray sparseIntArray = sbq.A00;
                        int i3 = (int) j;
                        int i4 = sparseIntArray.get(i3, -1);
                        if (i4 != -1) {
                            sparseIntArray.put(i3, i4 + 1);
                        } else {
                            throw AbstractC166987dD.A18("Tried to increment non-existent cookie");
                        }
                    }
                } else {
                    int i5 = sbq.A00.get((int) j, -1);
                    if (i5 != -1) {
                        s = (short) (65535 & i5);
                    } else {
                        throw AbstractC166987dD.A18("Tried to get non-existent cookie");
                    }
                }
            }
            sbq.A00.delete((int) j);
        } else {
            sbq.A00.put((int) j, 0);
        }
        r6d2.A02 = MotionEvent.obtain(motionEvent);
        r6d2.A03 = num;
        r6d2.A04 = s;
        r6d2.A00 = f;
        r6d2.A01 = f2;
        return r6d2;
    }
}
