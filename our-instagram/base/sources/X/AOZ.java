package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AOZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8YE A00;
    public final /* synthetic */ EnumC222569rx A01;
    public final /* synthetic */ EnumC222649s5 A02;
    public final /* synthetic */ String A03;

    public AOZ(C8YE c8ye, EnumC222569rx enumC222569rx, EnumC222649s5 enumC222649s5, String str) {
        this.A00 = c8ye;
        this.A03 = str;
        this.A02 = enumC222649s5;
        this.A01 = enumC222569rx;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8YE c8ye = this.A00;
        C18920wW c18920wW = c8ye.A06;
        C8YA c8ya = c8ye.A0A;
        ALg.A00(c18920wW, c8ya.AbY(), this.A03, c8ye.A03);
        C8YE.A01(c8ye, this.A01, this.A02, null);
        c8ya.DOg();
    }
}
