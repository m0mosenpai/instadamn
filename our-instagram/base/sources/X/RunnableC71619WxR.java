package X;

import java.util.Iterator;

/* renamed from: X.WxR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71619WxR implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4RW A01;
    public final /* synthetic */ C117275Sm A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public RunnableC71619WxR(C4RW c4rw, C117275Sm c117275Sm, String str, String str2, String str3, long j) {
        this.A01 = c4rw;
        this.A00 = j;
        this.A05 = str;
        this.A02 = c117275Sm;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C4RS c4rs = (C4RS) it.next();
            long j = this.A00;
            c4rs.DER(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
