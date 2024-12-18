package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.Lhq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48783Lhq implements MRR {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C3DN A02;
    public final /* synthetic */ C143316dW A03;
    public final /* synthetic */ ViewOnKeyListenerC148356m5 A04;

    @Override // X.MRR
    public final DirectShareTarget BuH() {
        return null;
    }

    @Override // X.MRR
    public final void Cu8(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
    }

    @Override // X.MRR
    public final void Cvn() {
    }

    @Override // X.MRR
    public final void Cyi(C148286ly c148286ly, C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void D96(C148286ly c148286ly) {
    }

    @Override // X.MRR
    public final void DJV(C45058Jwn c45058Jwn, C45026JwH c45026JwH, String str) {
        C14360o3.A0B(c45026JwH, 0);
        ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5 = this.A04;
        viewOnKeyListenerC148356m5.A00(c45026JwH, this.A00, this.A01);
        viewOnKeyListenerC148356m5.A01 = true;
        this.A02.A0B();
        C54765OIa A00 = AbstractC47088Krj.A00(viewOnKeyListenerC148356m5.A03);
        A00.A01.flowMarkPoint(A00.A00, "reply_with_gif", "");
    }

    @Override // X.MRR
    public final void DP2(C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void DQH() {
    }

    @Override // X.MRR
    public final void DUW(JIN jin) {
    }

    @Override // X.MRR
    public final void Dp9(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker, String str) {
    }

    @Override // X.MRR
    public final void DwN(String str) {
    }

    @Override // X.MRR
    public final void DwO(String str) {
    }

    @Override // X.MRR
    public final void Ekm() {
    }

    public C48783Lhq(C41181vS c41181vS, C41551w4 c41551w4, C3DN c3dn, C143316dW c143316dW, ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5) {
        this.A04 = viewOnKeyListenerC148356m5;
        this.A01 = c41551w4;
        this.A00 = c41181vS;
        this.A02 = c3dn;
        this.A03 = c143316dW;
    }

    @Override // X.MRR
    public final void Dvf() {
        ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5 = this.A04;
        if (!viewOnKeyListenerC148356m5.A01) {
            C143316dW c143316dW = this.A03;
            c143316dW.A0Q = true;
            c143316dW.A0A(C05F.A0C);
        } else {
            viewOnKeyListenerC148356m5.A07.EJJ();
        }
        viewOnKeyListenerC148356m5.A01 = false;
    }
}
