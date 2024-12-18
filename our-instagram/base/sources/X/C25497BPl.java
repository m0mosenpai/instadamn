package X;

import com.instagram.model.venue.Venue;

/* renamed from: X.BPl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25497BPl extends C03E implements InterfaceC16660sJ {
    public C25497BPl(Object obj) {
        super(1, obj, BKA.class, "launchLocation", "launchLocation(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        BKA A0h = AbstractC25235BEs.A0h(c38321qM, this);
        Venue A27 = c38321qM.A27();
        if (A27 != null) {
            AbstractC37834Gko.A05(A0h.A01, A0h.A04, A27);
        }
        return C0eB.A00;
    }
}
