package X;

import android.app.Dialog;

/* renamed from: X.Agb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23826Agb implements InterfaceC25207BDf {
    public final /* synthetic */ C185948Mo A00;

    public C23826Agb(C185948Mo c185948Mo) {
        this.A00 = c185948Mo;
    }

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
        C185948Mo c185948Mo = this.A00;
        C006802i.A0p.markerEnd(18948745, (short) 3);
        C185948Mo.A0B(c185948Mo, 2131961880);
    }

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        C185948Mo c185948Mo = this.A00;
        C006802i.A0p.markerEnd(18948745, (short) 2);
        C185948Mo.A0B(c185948Mo, 2131976733);
    }

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
        C185948Mo c185948Mo = this.A00;
        if (C6PX.A01(c185948Mo.A0c)) {
            c185948Mo.onResume();
        }
        ((Dialog) c185948Mo.A15.getValue()).dismiss();
    }

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
        C185948Mo c185948Mo = this.A00;
        InterfaceC09390do interfaceC09390do = c185948Mo.A15;
        ((C6WQ) interfaceC09390do.getValue()).A00(c185948Mo.A0W.getString(2131969964));
        C0fJ.A00((Dialog) interfaceC09390do.getValue());
    }
}
