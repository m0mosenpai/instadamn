package X;

import java.util.ArrayDeque;

/* loaded from: classes12.dex */
public final class XQJ extends AbstractC73334Y8p {
    public int A00;
    public YQB A01;
    public C72904Xqh A02;
    public final YQA A03;
    public final ArrayDeque A04;
    public final C66397UFi A05;

    public XQJ(YQA yqa) {
        super(4);
        this.A03 = yqa;
        this.A01 = YQB.A00;
        this.A05 = new C66397UFi(0);
        this.A02 = C72904Xqh.A00;
        this.A04 = new ArrayDeque();
        this.A00 = 1;
    }

    @Override // X.AbstractC73334Y8p
    public final void A01() {
        this.A00 = Math.min(this.A00, 1);
    }
}
