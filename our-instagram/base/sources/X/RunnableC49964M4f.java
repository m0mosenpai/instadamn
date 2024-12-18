package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.M4f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49964M4f implements Runnable {
    public final /* synthetic */ C206209Bd A00;
    public final /* synthetic */ C45510KCz A01;

    public RunnableC49964M4f(C206209Bd c206209Bd, C45510KCz c45510KCz) {
        this.A01 = c45510KCz;
        this.A00 = c206209Bd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45510KCz c45510KCz = this.A01;
        RecyclerView recyclerView = c45510KCz.A0C;
        if (recyclerView != null) {
            C3F1 c3f1 = recyclerView.A0C;
            if (c3f1 != null && c3f1.A0L()) {
                RecyclerView recyclerView2 = c45510KCz.A0C;
                if (recyclerView2 != null) {
                    C3F1 c3f12 = recyclerView2.A0C;
                    if (c3f12 != null) {
                        C48112LRm c48112LRm = new C48112LRm(this.A00, c45510KCz);
                        if (!c3f12.A0L()) {
                            c48112LRm.Cwn();
                            return;
                        } else {
                            c3f12.A05.add(c48112LRm);
                            return;
                        }
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }
}
