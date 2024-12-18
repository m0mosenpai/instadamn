package X;

import android.os.CountDownTimer;

/* renamed from: X.MbE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CountDownTimerC50749MbE extends CountDownTimer {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC50749MbE(Object obj, long j, int i, long j2) {
        super(j, j2);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (this.A00 != 0) {
            AK8 ak8 = (AK8) this.A01;
            if (ak8.A05) {
                C23874AhT.A00(ak8.A07, C05F.A0j);
                return;
            }
            return;
        }
        C53627NnY c53627NnY = (C53627NnY) this.A01;
        c53627NnY.A02 = null;
        O1M o1m = c53627NnY.A03;
        if (o1m == null) {
            return;
        }
        o1m.A00.A01(EnumC53100NeD.A08, null);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
