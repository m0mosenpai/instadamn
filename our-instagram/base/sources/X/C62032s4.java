package X;

/* renamed from: X.2s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62032s4 extends AbstractC62022s3 {
    public final C449725c A00;
    public final C13920nI A01;

    public C62032s4(C13920nI c13920nI, C449725c c449725c) {
        C14360o3.A0B(c13920nI, 1);
        C14360o3.A0B(c449725c, 2);
        this.A01 = c13920nI;
        this.A00 = c449725c;
    }

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgH(C1I1 c1i1) {
        C14360o3.A0B(c1i1, 0);
        C1EU c1eu = c1i1.A00;
        C449725c c449725c = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        String obj = c1eu.A04.toString();
        String str = c1eu.A09;
        String str2 = c1eu.A0A;
        synchronized (c449725c.A01) {
            C74513Wj c74513Wj = c449725c.A00;
            if (c74513Wj != null) {
                c449725c.A02.add(0, c74513Wj);
            }
            c449725c.A00 = new C74513Wj(currentTimeMillis, obj, str, str2);
        }
    }

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgV(C1I1 c1i1, C74283Vj c74283Vj) {
        final long currentTimeMillis = System.currentTimeMillis();
        final int i = c74283Vj.mStatusCode;
        final int size = c74283Vj.A00().size();
        C11T.A07(false, new Runnable() { // from class: X.3XX
            @Override // java.lang.Runnable
            public final void run() {
                C449725c c449725c = C62032s4.this.A00;
                long j = currentTimeMillis;
                int i2 = i;
                int i3 = size;
                synchronized (c449725c.A01) {
                    C74513Wj c74513Wj = c449725c.A00;
                    if (c74513Wj != null) {
                        c74513Wj.A02 = j - c74513Wj.A05;
                        c74513Wj.A01 = i2;
                        c74513Wj.A00 = i3;
                        C449725c.A00(c449725c);
                    }
                }
            }
        });
    }
}
