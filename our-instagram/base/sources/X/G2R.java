package X;

/* loaded from: classes6.dex */
public abstract class G2R implements InterfaceC37194Ga5 {
    public int A00;
    public long A01 = Long.MAX_VALUE;
    public Integer A02 = C05F.A00;
    public final FFV A03;

    @Override // X.InterfaceC37194Ga5
    public final void EJs(String str) {
        if (this instanceof C32738Eb4) {
            ((C32738Eb4) this).A00 = str;
        } else {
            ((C32739Eb5) this).A00 = str;
        }
        this.A00 = 0;
        this.A01 = Long.MAX_VALUE;
        this.A02 = C05F.A00;
    }

    @Override // X.InterfaceC37194Ga5
    public void Cha() {
        this.A02 = C05F.A01;
    }

    @Override // X.InterfaceC37194Ga5
    public final void onDestroy() {
        if (this instanceof C32739Eb5) {
            ((C32739Eb5) this).A01.A01();
        }
    }

    public G2R(FFV ffv) {
        this.A03 = ffv;
    }

    @Override // X.InterfaceC37194Ga5
    public final Integer C04() {
        return this.A02;
    }
}
