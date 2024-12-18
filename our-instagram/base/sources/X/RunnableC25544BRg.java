package X;

import android.view.View;

/* renamed from: X.BRg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25544BRg implements Runnable {
    public final /* synthetic */ C25541BRd A00;

    public RunnableC25544BRg(C25541BRd c25541BRd) {
        this.A00 = c25541BRd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        View view;
        View view2;
        View A07;
        C25541BRd c25541BRd = this.A00;
        C120985dq c120985dq = c25541BRd.A00;
        if (c120985dq != null) {
            C25541BRd.A02(c120985dq, c25541BRd, "scrubber");
            AbstractC43757JWv abstractC43757JWv = c25541BRd.A0B;
            C37556GgC c37556GgC = ((AbstractC37623GhI) c25541BRd).A02;
            if (c37556GgC != null && (A07 = c37556GgC.A07(c37556GgC.A03())) != null) {
                obj = A07.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof C37658Ghr) {
                C37576GgX c37576GgX = c25541BRd.A0D;
                C37658Ghr c37658Ghr = (C37658Ghr) obj;
                if (abstractC43757JWv != null) {
                    view = abstractC43757JWv.A0B();
                } else {
                    view = null;
                }
                C37851Gl5 c37851Gl5 = c25541BRd.A0A;
                if (c37851Gl5 != null) {
                    view2 = c37851Gl5.A02;
                } else {
                    view2 = null;
                }
                c37576GgX.A01(view, view2, null, c37658Ghr);
            }
            C11T.A02(new BST(c25541BRd.A09, 8));
        }
    }
}
