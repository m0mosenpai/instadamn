package X;

import java.io.Closeable;

/* renamed from: X.Bu8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26905Bu8 extends AbstractC61152qd {
    public final C27267C1k A00;
    public final String A01;
    public final String A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C0UO A06;

    public C26905Bu8(C27267C1k c27267C1k, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = c27267C1k;
        C008002u A1H = AbstractC25225BEi.A1H(new C51740MtP(23));
        this.A05 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A03 = c24721Ip;
        this.A04 = AbstractC208910l.A00(AbstractC141776au.A00(this), AbstractC07080Za.A03(c24721Ip), new C15020pI(0L), 1);
        addCloseable((Closeable) c27267C1k);
    }
}
