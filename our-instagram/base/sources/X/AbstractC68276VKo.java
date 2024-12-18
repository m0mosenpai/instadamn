package X;

import android.view.View;

/* renamed from: X.VKo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68276VKo {
    public static View A00(C6FG c6fg, C102884kP c102884kP) {
        for (C102884kP c102884kP2 : c102884kP.A0M()) {
            View A05 = c102884kP2.A05(c6fg);
            if (A05 != null || (A05 = A00(c6fg, c102884kP2)) != null) {
                return A05;
            }
        }
        return null;
    }
}
