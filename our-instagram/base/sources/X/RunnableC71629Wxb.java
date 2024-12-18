package X;

import android.util.ArrayMap;

/* renamed from: X.Wxb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71629Wxb implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ArrayMap A01;
    public final /* synthetic */ WDD A02;
    public final /* synthetic */ VDI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public RunnableC71629Wxb(ArrayMap arrayMap, WDD wdd, VDI vdi, String str, String str2, String str3, long j) {
        this.A02 = wdd;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = vdi;
        this.A01 = arrayMap;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WDD wdd = this.A02;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        VDI vdi = this.A03;
        ArrayMap arrayMap = this.A01;
        WDD.A01(wdd, vdi, str, str2, str3, this.A00);
        AbstractC63056Sbd.A02(arrayMap, wdd.A00, AbstractC63056Sbd.A00(str, str2));
    }
}
