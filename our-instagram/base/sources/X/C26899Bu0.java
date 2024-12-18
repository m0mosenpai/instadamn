package X;

import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

/* renamed from: X.Bu0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26899Bu0 extends C3r5 {
    public String A00;
    public boolean A01;
    public final FactsRepository A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;
    public static final C26064Bfs A0A = new C26064Bfs(2131957092, 2131957092, 2131957018, 2131957131, 7);
    public static final C26064Bfs A09 = new C26064Bfs(null, null, 2131957018, 2131957130, 31);
    public static final C26064Bfs A08 = new C26064Bfs(2131957108, 2131957108, 2131957018, 2131957137, 7);
    public static final C26064Bfs A07 = new C26064Bfs(2131957061, 2131957062, 2131957018, 2131957131, 7);

    public final void A05() {
        Object value;
        if (this.A01) {
            C05A c05a = this.A04;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C26064Bfs.A00((C26064Bfs) value, C6R.A03, null, 0, 126)));
            AbstractC166987dD.A1Z(D4z.A02(this, null, 46), A03());
        }
    }

    public C26899Bu0(C26064Bfs c26064Bfs, FactsRepository factsRepository) {
        boolean A1V = AbstractC167007dF.A1V(c26064Bfs);
        this.A02 = factsRepository;
        C008002u A00 = C10E.A00(C28233Ccd.A00);
        this.A03 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        C008002u A1H = AbstractC25225BEi.A1H(c26064Bfs);
        this.A04 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        this.A01 = A1V;
    }
}
