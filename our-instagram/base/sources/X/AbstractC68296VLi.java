package X;

import android.animation.Animator;

/* renamed from: X.VLi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68296VLi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Animator A01;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null || (A01 = C66250U5u.A01(c6fg, AbstractC31177DnL.A0d(c6fw))) == null) {
            return null;
        }
        long totalDuration = A01.getTotalDuration();
        if (totalDuration == -1) {
            return -1L;
        }
        return Float.valueOf(((float) totalDuration) / ((float) C66250U5u.A00));
    }
}
