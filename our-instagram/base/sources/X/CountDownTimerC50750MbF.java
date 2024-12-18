package X;

import android.os.CountDownTimer;
import android.view.View;

/* renamed from: X.MbF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CountDownTimerC50750MbF extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC57935Pmf A01;
    public final /* synthetic */ C50641MXd A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC50750MbF(View view, InterfaceC57935Pmf interfaceC57935Pmf, C50641MXd c50641MXd, Integer num, long j, long j2, boolean z, boolean z2) {
        super(j, j2);
        this.A02 = c50641MXd;
        this.A03 = num;
        this.A05 = z;
        this.A00 = view;
        this.A04 = z2;
        this.A01 = interfaceC57935Pmf;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C50641MXd c50641MXd = this.A02;
        c50641MXd.A02 = null;
        C50641MXd.A01(c50641MXd);
        this.A00.setVisibility(MSY.A02(c50641MXd.A0A));
        Integer num = this.A03;
        if (this.A05) {
            C14120nc.A00().ATO(new NGQ(c50641MXd, num));
        }
        if (this.A04) {
            View view = c50641MXd.A08;
            view.setVisibility(0);
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            A01.A05 = new PHM(this, 1);
            A01.A0M(1.0f, 0.0f);
            A01.A0H();
        }
        this.A01.D7r();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C50641MXd c50641MXd = this.A02;
        Integer num = this.A03;
        boolean z = this.A05;
        if (num.intValue() == 0 && j != 0) {
            C14120nc.A00().ATO(new C52386NGh(c50641MXd, num, j, z));
        }
    }
}
