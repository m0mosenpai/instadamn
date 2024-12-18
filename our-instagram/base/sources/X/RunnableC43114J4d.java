package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.J4d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43114J4d implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C60R A01;

    public RunnableC43114J4d(RecyclerView recyclerView, C60R c60r) {
        this.A00 = recyclerView;
        this.A01 = c60r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Parcelable A1M;
        AbstractC70663Fe abstractC70663Fe = this.A00.A0D;
        if (abstractC70663Fe != null && (A1M = abstractC70663Fe.A1M()) != null) {
            this.A01.A01 = A1M;
        }
    }
}
