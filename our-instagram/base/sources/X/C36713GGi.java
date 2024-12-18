package X;

/* renamed from: X.GGi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36713GGi implements InterfaceC125355lh {
    public final /* synthetic */ C160597Ht A00;

    public C36713GGi(C160597Ht c160597Ht) {
        this.A00 = c160597Ht;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        C160597Ht c160597Ht = this.A00;
        C159737El c159737El = c160597Ht.A04.A00;
        c159737El.A1B = true;
        C159737El.A0h(c159737El, 0);
        c160597Ht.A02.removeAllViews();
        C35164Ff6 c35164Ff6 = c160597Ht.A00;
        if (c35164Ff6 != null) {
            C35164Ff6.A00(c35164Ff6);
            c35164Ff6.A03 = null;
            c35164Ff6.A02 = null;
            C35164Ff6 c35164Ff62 = c160597Ht.A00;
            if (c35164Ff62 != null) {
                c35164Ff62.A04 = false;
                return;
            }
        }
        C14360o3.A0F("currentTray");
        throw C00O.createAndThrow();
    }
}
