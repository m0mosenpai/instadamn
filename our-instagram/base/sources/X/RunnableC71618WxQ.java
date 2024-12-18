package X;

import java.util.Iterator;

/* renamed from: X.WxQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71618WxQ implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ C5n5 A01;
    public final /* synthetic */ C117275Sm A02;
    public final /* synthetic */ C4RV A03;
    public final /* synthetic */ C4RU A04;
    public final /* synthetic */ String A05;

    public RunnableC71618WxQ(C4RW c4rw, C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        this.A00 = c4rw;
        this.A04 = c4ru;
        this.A03 = c4rv;
        this.A01 = c5n5;
        this.A02 = c117275Sm;
        this.A05 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            C4RS c4rs = (C4RS) it.next();
            C4RU c4ru = this.A04;
            c4rs.DZ1(this.A01, this.A02, this.A03, c4ru, this.A05);
        }
    }
}
