package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* renamed from: X.GuK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38383GuK extends C1I4 {
    public final Map A00 = AbstractC166987dD.A1G();
    public final Map A01 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();

    public final void A00(RecyclerView recyclerView, String str) {
        AbstractC167007dF.A1K(str, recyclerView);
        Map map = this.A00;
        if (!map.containsKey(recyclerView)) {
            recyclerView.A14(this);
        }
        map.put(recyclerView, str);
        if (recyclerView.getScrollState() == 0) {
            Map map2 = this.A01;
            if (map2.containsKey(str)) {
                Object remove = map2.remove(str);
                if (remove != null) {
                    recyclerView.A0n(AbstractC166987dD.A0H(remove));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                Parcelable parcelable = (Parcelable) this.A02.get(str);
                if (parcelable != null) {
                    abstractC70663Fe.A1P(parcelable);
                    return;
                } else {
                    abstractC70663Fe.A1O(0);
                    return;
                }
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0N = AbstractC167017dG.A0N(recyclerView, -869468529);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            this.A02.put(this.A00.get(recyclerView), abstractC70663Fe.A1M());
            C0f9.A0A(-667940571, A0N);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(291795724, A0N);
            throw A0g;
        }
    }
}
