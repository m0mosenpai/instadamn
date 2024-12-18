package X;

import java.util.Iterator;

/* renamed from: X.TuB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65793TuB implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4RW A01;
    public final /* synthetic */ C4RV A02;
    public final /* synthetic */ C4RU A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public RunnableC65793TuB(C4RW c4rw, C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01 = c4rw;
        this.A03 = c4ru;
        this.A02 = c4rv;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A08 = z;
        this.A07 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C4RS c4rs = (C4RS) it.next();
            C4RU c4ru = this.A03;
            c4rs.Dyn(this.A02, c4ru, this.A05, this.A06, this.A04, this.A07, this.A00, this.A08);
        }
    }
}
