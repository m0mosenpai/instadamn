package X;

import android.util.ArrayMap;

/* renamed from: X.Wwp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71593Wwp implements Runnable {
    public final /* synthetic */ ArrayMap A00;
    public final /* synthetic */ WDD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public RunnableC71593Wwp(ArrayMap arrayMap, WDD wdd, String str, String str2) {
        this.A01 = wdd;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = arrayMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WDD wdd = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        AbstractC63056Sbd.A02(this.A00, wdd.A00, AbstractC63056Sbd.A00(str, str2));
    }
}
