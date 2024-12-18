package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Avp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24655Avp implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C8NW A01;

    public RunnableC24655Avp(Drawable drawable, C8NW c8nw) {
        this.A01 = c8nw;
        this.A00 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8NW c8nw = this.A01;
        c8nw.A1l.A0Q(this.A00);
    }
}
