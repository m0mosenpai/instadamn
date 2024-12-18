package X;

/* renamed from: X.Had, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39393Had extends AbstractC86353t7 {
    public final /* synthetic */ C37540Gfw A00;

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void Dyj(C51752Mtb c51752Mtb) {
        String str;
        String str2;
        C14360o3.A0B(c51752Mtb, 0);
        int i = c51752Mtb.A00;
        if (i != 1) {
            if (i != 2) {
                str = "swipe_vertical";
            } else {
                str = "swipe_down";
            }
        } else {
            str = "swipe_up";
        }
        int i2 = c51752Mtb.A01;
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = "anchored";
            } else {
                str2 = "fullscreen";
            }
        } else {
            str2 = "dismiss";
        }
        C37540Gfw c37540Gfw = this.A00;
        ((C37603Ggy) c37540Gfw.A1b.getValue()).A05(c37540Gfw.A1L.A02(), str, str2);
    }

    public C39393Had(C37540Gfw c37540Gfw) {
        this.A00 = c37540Gfw;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DId(Integer num) {
        this.A00.A1K.A0S(null, "fragment_paused", false, true);
    }
}
