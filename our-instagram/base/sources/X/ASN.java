package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ASN implements View.OnClickListener {
    public final /* synthetic */ EnumC50631MWs A00;
    public final /* synthetic */ C191578eE A01;
    public final /* synthetic */ C47947LGc A02;
    public final /* synthetic */ Boolean A03;

    public ASN(EnumC50631MWs enumC50631MWs, C191578eE c191578eE, C47947LGc c47947LGc, Boolean bool) {
        this.A01 = c191578eE;
        this.A00 = enumC50631MWs;
        this.A03 = bool;
        this.A02 = c47947LGc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-991769571);
        C191578eE.A02(this.A00, this.A01, this.A03);
        this.A02.A01();
        C0f9.A0C(-1936304977, A05);
    }
}
