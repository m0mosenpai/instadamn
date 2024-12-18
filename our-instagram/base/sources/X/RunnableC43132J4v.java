package X;

import com.instagram.user.model.Product;

/* renamed from: X.J4v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43132J4v implements Runnable {
    public final /* synthetic */ C42824Ix0 A00;
    public final /* synthetic */ Product A01;

    public RunnableC43132J4v(C42824Ix0 c42824Ix0, Product product) {
        this.A00 = c42824Ix0;
        this.A01 = product;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3F1 c3f1 = this.A00.A00.mRecyclerView.A0C;
        c3f1.getClass();
        C42080Ikn c42080Ikn = new C42080Ikn(this);
        if (!c3f1.A0L()) {
            c42080Ikn.Cwn();
        } else {
            c3f1.A05.add(c42080Ikn);
        }
    }
}
