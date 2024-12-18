package X;

/* renamed from: X.KsJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47124KsJ {
    public static final C5QE A00(C1R0 c1r0, String str) {
        int i;
        java.util.Set set = c1r0.A0C;
        if (set.contains("ig_select_video_nux")) {
            i = 2131977217;
        } else if (set.contains("ig_video_nux")) {
            i = 2131977224;
        } else {
            if (str != null) {
                return new BQO(str);
            }
            return null;
        }
        return BHS.A00(new Object[0], i);
    }
}
