package X;

import android.content.res.Resources;

/* renamed from: X.JVx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43738JVx {
    public static final C51u A00(Resources resources, int i, int i2, int i3) {
        String A0t;
        boolean z = false;
        int max = Math.max(0, i2 - i3);
        if (i > i2) {
            max = Math.max(1, max);
            A0t = AbstractC43594JPz.A0t(resources, max, 2131960897);
            z = true;
        } else if (max == 0) {
            A0t = resources.getString(2131959913);
        } else {
            A0t = AbstractC43594JPz.A0t(resources, max, 2131959914);
        }
        C14360o3.A0A(A0t);
        return new C51u(Integer.valueOf(max), Boolean.valueOf(z), A0t);
    }
}
