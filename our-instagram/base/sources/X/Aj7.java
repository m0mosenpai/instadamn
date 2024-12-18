package X;

import android.content.Context;

/* loaded from: classes4.dex */
public final class Aj7 implements JH8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC86463tJ A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C3YD A03;

    @Override // X.JH8
    public final void Dpz(HAO hao) {
    }

    public Aj7(Context context, AbstractC86463tJ abstractC86463tJ, C38321qM c38321qM, C3YD c3yd) {
        this.A01 = abstractC86463tJ;
        this.A00 = context;
        this.A03 = c3yd;
        this.A02 = c38321qM;
    }

    @Override // X.JH8
    public final void onFail(AbstractC115105If abstractC115105If) {
        AbstractC86463tJ abstractC86463tJ = this.A01;
        AbstractC86463tJ.A00(this.A00, abstractC86463tJ, this.A02, this.A03);
    }
}
