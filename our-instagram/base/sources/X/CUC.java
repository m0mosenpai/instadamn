package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CUC {
    public float A00;
    public float A01;
    public float A02;
    public List A03;
    public final InterfaceC74963Ym A04;

    public CUC(InterfaceC74963Ym interfaceC74963Ym, List list, float f, float f2, float f3) {
        C14360o3.A0B(interfaceC74963Ym, 5);
        this.A03 = list;
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A04 = interfaceC74963Ym;
    }

    public final C25766Ba5 A00(InterfaceC1128957x interfaceC1128957x) {
        float A05 = AbstractC25231BEo.A05(this.A04);
        float f = this.A00;
        float EqT = A05 * interfaceC1128957x.EqT(this.A02 + f);
        return C6L6.A00(this.A03, AbstractC119395aw.A00(EqT - interfaceC1128957x.EqT(f), 0.0f), AbstractC119395aw.A00(EqT, interfaceC1128957x.EqT(this.A01)));
    }
}
