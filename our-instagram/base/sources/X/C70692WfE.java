package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WfE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70692WfE implements XAJ {
    public Parcelable A00;
    public RecyclerView A01;
    public Ut8 A02 = new AbstractC65828Tul(null);
    public String A03 = "";

    @Override // X.XAJ
    public final boolean isScrolledToTop() {
        if (AbstractC79383gk.A03()) {
            if (this.A01 == null) {
                return true;
            }
            return !r1.canScrollVertically(-1);
        }
        throw new RuntimeException("Cannot call isScrolledToTop off the main thread!");
    }
}
