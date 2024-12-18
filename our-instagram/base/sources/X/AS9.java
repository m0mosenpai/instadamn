package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AS9 implements View.OnClickListener {
    public final /* synthetic */ EnumC223459tc A00;
    public final /* synthetic */ C7Vn A01;
    public final /* synthetic */ boolean A02;

    public AS9(EnumC223459tc enumC223459tc, C7Vn c7Vn, boolean z) {
        this.A01 = c7Vn;
        this.A00 = enumC223459tc;
        this.A02 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(686621758);
        this.A01.A02(this.A00, this.A02);
        C0f9.A0C(916532002, A05);
    }
}
