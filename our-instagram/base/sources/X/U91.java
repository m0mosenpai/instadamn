package X;

import android.os.CountDownTimer;
import com.facebook.proxygen.LigerSamplePolicy;

/* loaded from: classes11.dex */
public final class U91 extends CountDownTimer {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C33X A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U91(C38321qM c38321qM, C33X c33x) {
        super(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, 100L);
        this.A01 = c33x;
        this.A00 = c38321qM;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C33X c33x = this.A01;
        C33V c33v = c33x.A04;
        C38321qM c38321qM = this.A00;
        C75113Zb c75113Zb = c33x.A02;
        C66290U7l c66290U7l = c33v.A00.A02;
        if (c66290U7l != null) {
            c66290U7l.A06(c38321qM, c75113Zb);
        }
        C75113Zb c75113Zb2 = c33x.A02;
        if (c75113Zb2 != null) {
            c75113Zb2.A0m(false, false);
        }
        c33x.A00 = null;
        c33x.A01 = null;
        c33x.A02 = null;
        c33x.A03 = null;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C33X c33x = this.A01;
        InterfaceC74323Vo interfaceC74323Vo = c33x.A03;
        if (interfaceC74323Vo != null) {
            if (j > 2000) {
                interfaceC74323Vo.EcU(((int) j) + 1000, false);
                return;
            }
            C75113Zb c75113Zb = c33x.A02;
            if (c75113Zb != null) {
                c75113Zb.A0m(true, false);
            }
            interfaceC74323Vo.setVideoIconState(EnumC74373Vt.A06);
        }
    }
}
