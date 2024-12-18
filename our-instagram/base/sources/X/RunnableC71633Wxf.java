package X;

import java.util.List;

/* renamed from: X.Wxf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71633Wxf implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C95734Sh A01;
    public final /* synthetic */ C117275Sm A02;
    public final /* synthetic */ C98704bq A03;
    public final /* synthetic */ C98704bq A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public RunnableC71633Wxf(C95734Sh c95734Sh, C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
        this.A01 = c95734Sh;
        this.A03 = c98704bq;
        this.A04 = c98704bq2;
        this.A00 = j;
        this.A06 = str;
        this.A07 = list;
        this.A05 = str2;
        this.A02 = c117275Sm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C4R6 c4r6 = this.A01.A02;
        C98704bq c98704bq = this.A03;
        C98704bq c98704bq2 = this.A04;
        long j = this.A00;
        String str = this.A06;
        List list = this.A07;
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        c4r6.CmP(this.A02, c98704bq, c98704bq2, str, this.A05, i, j);
    }
}
