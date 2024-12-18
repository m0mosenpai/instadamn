package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class M3Z implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C47705L4m A01;

    public M3Z(RecyclerView recyclerView, C47705L4m c47705L4m) {
        this.A01 = c47705L4m;
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47705L4m c47705L4m = this.A01;
        C47760L7g c47760L7g = (C47760L7g) c47705L4m.A06.getValue();
        ME0 me0 = new ME0(2, c47705L4m, this.A00);
        AbstractC59962oe abstractC59962oe = c47760L7g.A00;
        if (!abstractC59962oe.mDetached && !AbstractC166987dD.A1b(c47760L7g.A03.A00)) {
            C25621Ms A0c = AbstractC167017dG.A0c(c47760L7g.A01);
            A0c.A0B("music/trending/");
            A0c.A0R(C38071Gp0.class, C38074Gp3.class);
            C1ON A0T = AbstractC31172DnG.A0T(A0c, "product", "feed_post");
            A0T.A00 = new C45543KEi(3, me0, c47760L7g);
            C1GJ.A00(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), A0T);
        }
    }
}
