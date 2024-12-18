package X;

import com.facebook.react.uimanager.UIManagerHelper;

/* loaded from: classes11.dex */
public final class WXX implements X9L {
    public int A00;
    public int A01;
    public final int A02;
    public final X9J A03;
    public final UDV A04;

    public WXX(UDV udv) {
        this.A04 = udv;
        Q21 A02 = UIManagerHelper.A02(udv);
        this.A03 = UIManagerHelper.A05(A02, udv.getId());
        this.A02 = UIManagerHelper.A00(A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Usi, X.Sb5] */
    @Override // X.X9L
    public final void DkL(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        if (this.A01 != min || this.A00 != max) {
            X9J x9j = this.A03;
            ?? sb5 = new Sb5(this.A02, this.A04.getId());
            sb5.A01 = min;
            sb5.A00 = max;
            x9j.APn(sb5);
            this.A01 = min;
            this.A00 = max;
        }
    }
}
