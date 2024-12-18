package X;

import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes8.dex */
public final class M7I implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ C7FG A02;
    public final /* synthetic */ C211689Zc A03;
    public final /* synthetic */ ClipInfo A04;
    public final /* synthetic */ C47Z A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public M7I(C26086BgF c26086BgF, C7FG c7fg, C211689Zc c211689Zc, ClipInfo clipInfo, C47Z c47z, Long l, String str, int i, boolean z) {
        this.A02 = c7fg;
        this.A04 = clipInfo;
        this.A07 = str;
        this.A00 = i;
        this.A08 = z;
        this.A05 = c47z;
        this.A03 = c211689Zc;
        this.A01 = c26086BgF;
        this.A06 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7FA c7fa = this.A02.A03;
        ClipInfo clipInfo = this.A04;
        String str = this.A07;
        if (str != null) {
            int i = this.A00;
            boolean z = this.A08;
            C47Z c47z = this.A05;
            c7fa.Dzc(this.A01, this.A03, clipInfo, c47z, this.A06, str, i, z);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
