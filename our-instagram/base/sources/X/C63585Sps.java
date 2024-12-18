package X;

/* renamed from: X.Sps, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63585Sps implements InterfaceC72029XFr {
    public final C63297Sgy A00;
    public final CharSequence A01;

    @Override // X.InterfaceC72029XFr
    public final int Css(int i) {
        do {
            C63297Sgy c63297Sgy = this.A00;
            C63297Sgy.A00(c63297Sgy, i);
            i = c63297Sgy.A00.following(i);
            if (i == -1) {
                return -1;
            }
        } while (AbstractC58319PtB.A1T(this.A01, i - 1));
        return i;
    }

    @Override // X.InterfaceC72029XFr
    public final int Csw(int i) {
        CharSequence charSequence;
        do {
            C63297Sgy c63297Sgy = this.A00;
            C63297Sgy.A00(c63297Sgy, i);
            i = c63297Sgy.A00.following(i);
            if (i != -1) {
                charSequence = this.A01;
                if (i != charSequence.length()) {
                }
            }
            return -1;
        } while (AbstractC58319PtB.A1T(charSequence, i));
        return i;
    }

    @Override // X.InterfaceC72029XFr
    public final int E62(int i) {
        do {
            C63297Sgy c63297Sgy = this.A00;
            C63297Sgy.A00(c63297Sgy, i);
            i = c63297Sgy.A00.preceding(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (AbstractC58319PtB.A1T(this.A01, i - 1));
        return i;
    }

    @Override // X.InterfaceC72029XFr
    public final int E64(int i) {
        do {
            C63297Sgy c63297Sgy = this.A00;
            C63297Sgy.A00(c63297Sgy, i);
            i = c63297Sgy.A00.preceding(i);
            if (i == -1) {
                return -1;
            }
        } while (AbstractC58319PtB.A1T(this.A01, i));
        return i;
    }

    public C63585Sps(C63297Sgy c63297Sgy, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = c63297Sgy;
    }
}
