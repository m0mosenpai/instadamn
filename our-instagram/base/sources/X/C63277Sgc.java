package X;

/* renamed from: X.Sgc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63277Sgc {
    public final AbstractC64515THi A00;
    public final AbstractC64515THi A01;
    public final AbstractC64515THi A02;
    public final AbstractC64515THi A03;
    public final AbstractC64515THi A04;
    public final boolean A05;

    public C63277Sgc(C93744Je c93744Je, Q4B q4b) {
        AbstractC64515THi c60547R6k;
        AbstractC64515THi abstractC64515THi = C60546R6j.A00;
        abstractC64515THi = c93744Je.equals(C93744Je.A00) ? abstractC64515THi : new C60547R6k(c93744Je);
        if (Q4B.A01.equals(q4b)) {
            c60547R6k = abstractC64515THi;
        } else {
            c60547R6k = new C60547R6k(q4b);
        }
        this.A05 = true;
        this.A04 = abstractC64515THi;
        this.A01 = abstractC64515THi;
        this.A00 = abstractC64515THi;
        this.A02 = abstractC64515THi;
        this.A03 = c60547R6k;
    }

    public C63277Sgc(EnumC122375gY enumC122375gY) {
        C60547R6k c60547R6k = new C60547R6k(enumC122375gY);
        C60546R6j c60546R6j = C60546R6j.A00;
        this.A05 = false;
        this.A04 = c60547R6k;
        this.A01 = c60546R6j;
        this.A00 = c60546R6j;
        this.A02 = c60546R6j;
        this.A03 = c60546R6j;
    }

    public C63277Sgc(EnumC122375gY enumC122375gY, byte b) {
        C60547R6k c60547R6k = new C60547R6k(enumC122375gY);
        C60546R6j c60546R6j = C60546R6j.A00;
        C60547R6k A00 = C60547R6k.A00(Byte.valueOf(b));
        this.A05 = false;
        this.A04 = c60547R6k;
        this.A01 = c60546R6j;
        this.A00 = A00;
        this.A02 = c60546R6j;
        this.A03 = c60546R6j;
    }

    public C63277Sgc(EnumC122375gY enumC122375gY, Exception exc) {
        C60547R6k c60547R6k = new C60547R6k(enumC122375gY);
        C60547R6k c60547R6k2 = new C60547R6k(exc);
        C60546R6j c60546R6j = C60546R6j.A00;
        this.A05 = false;
        this.A04 = c60547R6k;
        this.A01 = c60547R6k2;
        this.A00 = c60546R6j;
        this.A02 = c60546R6j;
        this.A03 = c60546R6j;
    }
}
