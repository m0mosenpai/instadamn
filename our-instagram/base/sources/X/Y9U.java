package X;

import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public final class Y9U implements YRH {
    public final /* synthetic */ YRH A00;
    public final /* synthetic */ YEP A01;

    public Y9U(YRH yrh, YEP yep) {
        this.A01 = yep;
        this.A00 = yrh;
    }

    @Override // X.YPG
    public final void D2J(AbstractC223559ty abstractC223559ty) {
        this.A00.D2J(abstractC223559ty);
        YEP yep = this.A01;
        AbstractC196788n8.A00(abstractC223559ty, yep.A0B, YEP.__redex_internal_original_name, "medium", yep.hashCode());
    }

    @Override // X.YPG
    public final void D2M() {
        AbstractC196788n8.A01(this.A01.A0B, YEP.__redex_internal_original_name, hashCode());
        this.A00.D2M();
    }

    @Override // X.YRH
    public final void D2Q(Bitmap bitmap, String str) {
        this.A00.D2Q(bitmap, str);
    }

    @Override // X.YPG
    public final void D2R() {
        this.A00.D2R();
    }
}
