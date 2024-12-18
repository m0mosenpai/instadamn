package X;

import android.os.CountDownTimer;

/* loaded from: classes11.dex */
public final class U92 extends CountDownTimer {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U92(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j) {
        super(j, 100L);
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16820sZ;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.A00) {
            case 0:
                C70948Wku c70948Wku = (C70948Wku) this.A01;
                c70948Wku.A01 = new C50627MWo(c70948Wku.A00(false), C05F.A01);
                c70948Wku.A00 = 0L;
                c70948Wku.A01();
                C43631zr c43631zr = (C43631zr) this.A02;
                C40R c40r = c70948Wku.A02;
                C43631zr.A04(c43631zr, c40r.A05, c40r.A08, "Auto opened after snack bar timed out", null, c40r.A07);
                C43631zr.A03(c40r, c43631zr);
                return;
            case 1:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            default:
                C25371BKo.A03((C120985dq) this.A01, (C25371BKo) this.A02);
                return;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.A00) {
            case 0:
                C70948Wku c70948Wku = (C70948Wku) this.A01;
                c70948Wku.A00 = j;
                c70948Wku.A01 = new C50627MWo(c70948Wku.A00(false), C05F.A00);
                c70948Wku.A01();
                return;
            case 1:
                ((InterfaceC16660sJ) this.A02).invoke(Long.valueOf(j));
                return;
            default:
                C25371BKo c25371BKo = (C25371BKo) this.A02;
                c25371BKo.A05 = j;
                int A01 = C1H4.A01(((float) j) / 1000.0f);
                C25371BKo.A04((C120985dq) this.A01, c25371BKo, j);
                c25371BKo.A0T.A00(A01);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U92(C70948Wku c70948Wku, C43631zr c43631zr, long j) {
        super(j, 10L);
        this.A01 = c70948Wku;
        this.A02 = c43631zr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U92(C120985dq c120985dq, C25371BKo c25371BKo, long j) {
        super(j, 1000L);
        this.A02 = c25371BKo;
        this.A01 = c120985dq;
    }
}
