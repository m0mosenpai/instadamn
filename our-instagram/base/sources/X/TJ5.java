package X;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes10.dex */
public final class TJ5 implements Runnable {
    public final /* synthetic */ SearchView A00;

    public TJ5(SearchView searchView) {
        this.A00 = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q51 q51 = this.A00.A05;
        if (q51 instanceof Q7G) {
            q51.AGs(null);
        }
    }
}
