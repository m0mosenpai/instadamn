package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.G7t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36495G7t implements InterfaceC63862v7 {
    public final int A00;
    public final Object A01;

    public C36495G7t(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC63862v7
    public final void DK9(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        switch (this.A00) {
            case 0:
                C32968Eez c32968Eez = (C32968Eez) this.A01;
                WE3.A00(c32968Eez.A01);
                C69730VuP c69730VuP = new C69730VuP(hashtag);
                c69730VuP.A09 = 0;
                c69730VuP.A08 = 0;
                Hashtag A00 = c69730VuP.A00();
                c32968Eez.A00 = A00;
                c32968Eez.A03.A01(A00);
                AbstractC31175DnJ.A0i(c32968Eez.A02);
                return;
            case 1:
                ENG eng = (ENG) this.A01;
                WE3.A00(eng.requireContext());
                C69730VuP c69730VuP2 = new C69730VuP(hashtag);
                c69730VuP2.A08 = AbstractC25227BEk.A0p();
                eng.A04 = c69730VuP2.A00();
                C0fA.A00(eng.A01, 450946355);
                return;
            default:
                WE3.A00(((C31250DoY) this.A01).A05);
                return;
        }
    }

    @Override // X.InterfaceC63862v7
    public final void DKC(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        switch (this.A00) {
            case 0:
                C32968Eez c32968Eez = (C32968Eez) this.A01;
                WE3.A01(c32968Eez.A01);
                C69730VuP c69730VuP = new C69730VuP(hashtag);
                c69730VuP.A09 = 1;
                c69730VuP.A08 = 1;
                Hashtag A00 = c69730VuP.A00();
                c32968Eez.A00 = A00;
                c32968Eez.A03.A01(A00);
                AbstractC31175DnJ.A0i(c32968Eez.A02);
                return;
            case 1:
                ENG eng = (ENG) this.A01;
                WE3.A00(eng.requireContext());
                C69730VuP c69730VuP2 = new C69730VuP(hashtag);
                c69730VuP2.A08 = 1;
                eng.A04 = c69730VuP2.A00();
                C0fA.A00(eng.A01, 1869983347);
                return;
            default:
                WE3.A01(((C31250DoY) this.A01).A05);
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
