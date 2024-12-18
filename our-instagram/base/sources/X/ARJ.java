package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ARJ implements View.OnClickListener {
    public final /* synthetic */ C183688Ct A00;
    public final /* synthetic */ Runnable A01;

    public ARJ(C183688Ct c183688Ct, Runnable runnable) {
        this.A00 = c183688Ct;
        this.A01 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        int A05 = C0f9.A05(-1356023076);
        C183688Ct c183688Ct = this.A00;
        C1815483h c1815483h = c183688Ct.A15.A01;
        C183978Ee A03 = c1815483h.A03();
        C22C A01 = AnonymousClass229.A01(c183688Ct.A0w);
        String A052 = c1815483h.A05();
        EnumC203578zI enumC203578zI = EnumC203578zI.DIALOG;
        if (A03 != null) {
            str = A03.A0g;
            str2 = A03.A0e;
        } else {
            str = null;
            str2 = null;
        }
        A01.A1E(enumC203578zI, null, A052, null, str, str2, false);
        c183688Ct.A0n(this.A01);
        C0f9.A0C(-357969657, A05);
    }
}
