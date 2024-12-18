package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class LZ0 implements InterfaceC66382zF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LZ0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC66382zF
    public final void DxB() {
        AbstractC70663Fe abstractC70663Fe;
        switch (this.A00) {
            case 0:
                Integer num = ((C22993ABs) this.A01).A04;
                if (num == null) {
                    return;
                }
                C23630AdP c23630AdP = (C23630AdP) this.A02;
                int intValue = num.intValue();
                RecyclerView recyclerView = c23630AdP.A03;
                if (recyclerView == null) {
                    C14360o3.A0F("editRecyclerView");
                    throw C00O.createAndThrow();
                }
                recyclerView.A0o(intValue);
                return;
            case 1:
                C49098Lnb c49098Lnb = (C49098Lnb) this.A01;
                E72 e72 = (E72) this.A02;
                boolean z = c49098Lnb.A06;
                C164357Wy c164357Wy = c49098Lnb.A0B;
                if (z) {
                    c164357Wy.A00(false);
                    return;
                } else {
                    if (c164357Wy.A02(-1) || e72 == null) {
                        return;
                    }
                    c49098Lnb.A08.A01((ImageUrl) e72.A00, e72.A02, e72.A01, false, false);
                    return;
                }
            default:
                Parcelable parcelable = ((C52615NPk) this.A01).A00;
                if (parcelable != null && (abstractC70663Fe = ((RecyclerView) AbstractC166987dD.A17(((C52612NPh) this.A02).A01)).A0D) != null) {
                    abstractC70663Fe.A1P(parcelable);
                    return;
                }
                return;
        }
    }
}
