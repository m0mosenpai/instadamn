package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class M3Y implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C47705L4m A01;

    public M3Y(RecyclerView recyclerView, C47705L4m c47705L4m) {
        this.A01 = c47705L4m;
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47705L4m c47705L4m = this.A01;
        C54839OLy c54839OLy = (C54839OLy) c47705L4m.A04.getValue();
        if (!C1H6.A03() && !AbstractC43840Ja3.A00(c47705L4m.A01)) {
            c54839OLy.A01.requireActivity().getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
        C47760L7g c47760L7g = (C47760L7g) c47705L4m.A06.getValue();
        RecyclerView recyclerView = this.A00;
        AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
        if (recyclerView.A12.size() == 0) {
            AbstractC59962oe abstractC59962oe = c47760L7g.A00;
            AbstractC37304Gc5.A0z(recyclerView, AbstractC167017dG.A03(abstractC59962oe.requireContext()), AbstractC167017dG.A06(abstractC59962oe.requireContext()));
        }
    }
}
