package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ASL implements View.OnClickListener {
    public final /* synthetic */ EnumC50631MWs A00;
    public final /* synthetic */ C191578eE A01;
    public final /* synthetic */ C47947LGc A02;
    public final /* synthetic */ boolean A03;

    public ASL(EnumC50631MWs enumC50631MWs, C191578eE c191578eE, C47947LGc c47947LGc, boolean z) {
        this.A01 = c191578eE;
        this.A00 = enumC50631MWs;
        this.A03 = z;
        this.A02 = c47947LGc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(2041045798);
        C191578eE c191578eE = this.A01;
        c191578eE.A06.A1O(this.A00, AbstractC166997dE.A0b(), MSV.A00(356));
        if (this.A03) {
            C191578eE.A06(c191578eE);
        }
        this.A02.A01();
        C0f9.A0C(6885172, A05);
    }
}
