package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.J4g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43117J4g implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ IntentAwareAdPivotState A01;

    public RunnableC43117J4g(RecyclerView recyclerView, IntentAwareAdPivotState intentAwareAdPivotState) {
        this.A00 = recyclerView;
        this.A01 = intentAwareAdPivotState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Parcelable A1M;
        AbstractC70663Fe abstractC70663Fe = this.A00.A0D;
        if (abstractC70663Fe != null && (A1M = abstractC70663Fe.A1M()) != null) {
            this.A01.A03 = A1M;
        }
    }
}
