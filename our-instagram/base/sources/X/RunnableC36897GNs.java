package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GNs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36897GNs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EVU A01;

    public RunnableC36897GNs(EVU evu, int i) {
        this.A01 = evu;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EVU evu = this.A01;
        RecyclerView recyclerView = evu.A05;
        if (((Fragment) evu.A0m).isAdded() && recyclerView != null) {
            AbstractC13880nE.A0Y(recyclerView, this.A00);
        }
    }
}
