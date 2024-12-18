package X;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* renamed from: X.5h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122735h9 {
    public static final C122745hA A01 = new Canvas();
    public static final long A00 = 0 << 32;

    public static final TextDirectionHeuristic A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }
}
