package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ASU implements View.OnClickListener {
    public final /* synthetic */ EnumC223459tc A00;
    public final /* synthetic */ C7Vn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public ASU(EnumC223459tc enumC223459tc, C7Vn c7Vn, String str, String str2, boolean z) {
        this.A01 = c7Vn;
        this.A00 = enumC223459tc;
        this.A04 = z;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1246044146);
        this.A01.A01(this.A00, this.A02, this.A03, this.A04);
        C0f9.A0C(1123244047, A05);
    }
}
