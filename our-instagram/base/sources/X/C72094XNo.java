package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XNo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72094XNo implements InterfaceC175597rZ {
    public long A00;
    public final XOC A01;
    public final Handler A02;
    public final Runnable A03;
    public volatile Choreographer A04;
    public volatile InterfaceC175577rX A05;
    public volatile Long A06;
    public volatile boolean A07;

    @Override // X.InterfaceC175597rZ
    public final void DIE() {
        DIF(null);
    }

    @Override // X.InterfaceC175597rZ
    public final void stop() {
        this.A07 = true;
        this.A05 = null;
    }

    public static void A00(C72094XNo c72094XNo) {
        if (c72094XNo.A04 == null) {
            c72094XNo.A02.post(c72094XNo.A03);
        } else {
            c72094XNo.A03.run();
        }
    }

    @Override // X.InterfaceC175597rZ
    public final void DIF(Long l) {
        if (this.A06 != null) {
            A00(this);
            return;
        }
        InterfaceC175577rX interfaceC175577rX = this.A05;
        if (interfaceC175577rX == null) {
            return;
        }
        interfaceC175577rX.EGZ(l);
    }

    @Override // X.InterfaceC175597rZ
    public final void DII() {
        if (this.A06 != null) {
            A00(this);
        }
    }

    @Override // X.InterfaceC175597rZ
    public final void EfS(Integer num) {
        Long valueOf;
        if (num == null) {
            valueOf = null;
        } else {
            int intValue = num.intValue();
            if (intValue > 0) {
                valueOf = Long.valueOf(TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS) / intValue);
            } else {
                throw AbstractC166987dD.A12("Target FPS must be greater than 0");
            }
        }
        this.A06 = valueOf;
    }

    @Override // X.InterfaceC175597rZ
    public final void Emi(InterfaceC175577rX interfaceC175577rX) {
        this.A05 = interfaceC175577rX;
        this.A07 = false;
    }

    public C72094XNo(Handler handler) {
        this.A07 = false;
        this.A03 = new XOD(this);
        this.A01 = new XOC(this);
        this.A02 = handler;
    }

    public C72094XNo() {
        this.A07 = false;
        this.A03 = new XOD(this);
        this.A01 = new XOC(this);
        this.A02 = AbstractC167007dF.A0J();
    }
}
