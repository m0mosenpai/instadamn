package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NHN extends C8J9 {
    public float A00;
    public C88X A01;
    public C54462O4q A02;
    public boolean A03;
    public boolean A04;
    public final C8C0 A05;
    public final C05A A06;
    public final C05A A07;
    public final C1810281e A08;
    public final C19L A09;
    public final C05A A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NHN(C8C0 c8c0, C1810281e c1810281e, C19L c19l) {
        super(c8c0);
        C14360o3.A0B(c1810281e, 2);
        this.A05 = c8c0;
        this.A08 = c1810281e;
        this.A09 = c19l;
        C008002u A00 = C10E.A00(this.A01);
        this.A06 = A00;
        C008002u A0y = MSZ.A0y();
        this.A0A = A0y;
        C008002u A0s = MSX.A0s(this.A04);
        this.A07 = A0s;
        AbstractC18560vj.A03(c19l, new C16410rm(new MWF(this, null, 10), MSW.A1I(new PYw(this, null, 36), C0ST.A01(C10Q.A01(new C57187PaQ(1, null), MZP.A00(AbstractC184118Fa.A00(c1810281e), 15), A0y, A00, A0s)))));
    }

    public static final void A00(NHN nhn, boolean z) {
        if (z != nhn.A03) {
            nhn.A03 = z;
            C8C0 c8c0 = nhn.A05;
            if (z) {
                c8c0.A0C(true);
                c8c0.A0P.setTranslationY(nhn.A00);
            } else {
                c8c0.A0B(true);
            }
            C54462O4q c54462O4q = nhn.A02;
            if (c54462O4q != null) {
                C52692NTd.A03(c54462O4q.A00);
            } else {
                C14360o3.A0F("listener");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.C8J9
    public final void A01(List list) {
        super.A01(list);
        int i = ((C8JF) super.A00).A00;
        C54462O4q c54462O4q = this.A02;
        if (c54462O4q != null) {
            c54462O4q.A00.A0H.A03(new C56696PEo(i));
        } else {
            C14360o3.A0F("listener");
            throw C00O.createAndThrow();
        }
    }
}
