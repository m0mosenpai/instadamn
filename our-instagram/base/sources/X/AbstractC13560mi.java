package X;

import android.view.Choreographer;

/* renamed from: X.0mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13560mi {
    public static final C55952hg A00() {
        Choreographer choreographer = AbstractC13550mh.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            AbstractC13550mh.A00 = choreographer;
            C14360o3.A07(choreographer);
        }
        return C55952hg.A01(choreographer);
    }
}
