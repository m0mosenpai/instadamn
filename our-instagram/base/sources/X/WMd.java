package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WMd implements View.OnClickListener {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16610sE A03;

    public WMd(String str, String str2, String str3, InterfaceC16610sE interfaceC16610sE) {
        this.A03 = interfaceC16610sE;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1335240314);
        this.A03.invoke(this.A02, this.A01, this.A00);
        C0f9.A0C(-1667983861, A05);
    }
}
