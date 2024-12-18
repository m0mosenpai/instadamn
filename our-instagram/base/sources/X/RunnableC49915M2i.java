package X;

import android.view.ViewGroup;

/* renamed from: X.M2i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49915M2i implements Runnable {
    public final /* synthetic */ KDA A00;

    public RunnableC49915M2i(KDA kda) {
        this.A00 = kda;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00.A00;
        if (viewGroup != null) {
            AbstractC43594JPz.A18(viewGroup, this);
        }
    }
}
