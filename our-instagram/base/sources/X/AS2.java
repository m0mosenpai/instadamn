package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AS2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AS2(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (2 - this.A00 != 0) {
            C8DN.A01((C8DN) this.A01, this.A02);
            return;
        }
        int A05 = C0f9.A05(1065139745);
        WP8.A02(((C210619Ta) this.A01).A02, this.A02);
        C0f9.A0C(-2058857761, A05);
    }
}
