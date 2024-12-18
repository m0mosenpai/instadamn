package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.Ark, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24403Ark implements Runnable {
    public final /* synthetic */ C8NW A00;

    public RunnableC24403Ark(C8NW c8nw) {
        this.A00 = c8nw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8NW c8nw = this.A00;
        List list = c8nw.A0K;
        list.getClass();
        c8nw.A1l.A0Q((Drawable) list.get(c8nw.A00 - 1));
    }
}
