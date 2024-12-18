package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;

/* loaded from: classes8.dex */
public final class M1A implements Runnable {
    public final /* synthetic */ L5G A00;

    public M1A(L5G l5g) {
        this.A00 = l5g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        L5G l5g = this.A00;
        A0E.A01(l5g.A09);
        C66362zD c66362zD = l5g.A01;
        if (c66362zD == null) {
            str = "magicMediaRemixAdapter";
        } else {
            c66362zD.A05(A0E);
            RecyclerView recyclerView = l5g.A00;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                recyclerView.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
