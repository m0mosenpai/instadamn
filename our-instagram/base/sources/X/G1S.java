package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G1S implements InterfaceC37152GYp {
    public final /* synthetic */ C31446Drq A00;
    public final /* synthetic */ C31606DuY A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;

    @Override // X.InterfaceC37152GYp
    public final void D1h(int i) {
    }

    public G1S(C31446Drq c31446Drq, C31606DuY c31606DuY, DirectThreadKey directThreadKey, Integer num, Integer num2) {
        this.A01 = c31606DuY;
        this.A02 = directThreadKey;
        this.A00 = c31446Drq;
        this.A04 = num;
        this.A03 = num2;
    }

    @Override // X.InterfaceC37152GYp
    public final void AJt(DirectThreadKey directThreadKey, int i) {
        C31606DuY.A00(this.A00, this.A01, this.A02, this.A04, this.A03, "inbox");
    }
}
