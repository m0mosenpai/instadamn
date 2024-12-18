package X;

import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHG extends C1I4 {
    public final /* synthetic */ C6FG A00;

    public UHG(C6FG c6fg) {
        this.A00 = c6fg;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(548185627);
        if (i == 1) {
            ((InputMethodManager) this.A00.A00.getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
        }
        C0f9.A0A(-267474578, A03);
    }
}
