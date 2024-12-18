package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WkU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70925WkU implements InterfaceC63862v7 {
    public final int A00;
    public final Object A01;

    public C70925WkU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC63862v7
    public final void DK9(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        switch (this.A00) {
            case 0:
                V7n v7n = (V7n) this.A01;
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                WE3.A00(((V8M) v7n).A00.requireContext());
                v7n.A03(hashtag, false);
                V7n.A01(v7n);
                return;
            case 1:
                V1W v1w = (V1W) this.A01;
                WE3.A00(v1w.requireContext());
                C67917V2h c67917V2h = v1w.A02;
                if (c67917V2h == null) {
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                C0fA.A00(c67917V2h, -1336285967);
                return;
            default:
                V1E v1e = (V1E) this.A01;
                WE3.A00(v1e.requireContext());
                C69730VuP c69730VuP = new C69730VuP(hashtag);
                c69730VuP.A08 = 0;
                Hashtag A00 = c69730VuP.A00();
                v1e.A04 = A00;
                v1e.A03.A01(v1e, v1e.A0F, A00);
                return;
        }
    }

    @Override // X.InterfaceC63862v7
    public final void DKC(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        switch (this.A00) {
            case 0:
                V7n v7n = (V7n) this.A01;
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                WE3.A01(((V8M) v7n).A00.requireContext());
                v7n.A03(hashtag, true);
                V7n.A01(v7n);
                return;
            case 1:
                V1W v1w = (V1W) this.A01;
                WE3.A01(v1w.requireContext());
                C67917V2h c67917V2h = v1w.A02;
                if (c67917V2h == null) {
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                C0fA.A00(c67917V2h, -1222505146);
                return;
            default:
                V1E v1e = (V1E) this.A01;
                WE3.A01(v1e.requireContext());
                C69730VuP c69730VuP = new C69730VuP(hashtag);
                c69730VuP.A08 = 1;
                Hashtag A00 = c69730VuP.A00();
                v1e.A04 = A00;
                v1e.A03.A01(v1e, v1e.A0F, A00);
                return;
        }
    }

    @Override // X.InterfaceC63862v7
    public final void DKA(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
    }

    @Override // X.InterfaceC63862v7
    public final void DKD(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
    }
}
