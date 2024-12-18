package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ASA implements View.OnClickListener {
    public final /* synthetic */ EnumC223459tc A00;
    public final /* synthetic */ C7Vn A01;
    public final /* synthetic */ boolean A02;

    public ASA(EnumC223459tc enumC223459tc, C7Vn c7Vn, boolean z) {
        this.A01 = c7Vn;
        this.A00 = enumC223459tc;
        this.A02 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(3235140);
        this.A01.A01(this.A00, null, null, this.A02);
        C0f9.A0C(1807366097, A05);
    }
}
