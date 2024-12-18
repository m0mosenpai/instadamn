package X;

import android.view.View;

/* renamed from: X.Ium, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42691Ium implements InterfaceC58152PqH {
    public final /* synthetic */ C141526aV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42691Ium(C141526aV c141526aV, String str, String str2) {
        this.A00 = c141526aV;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        H8N h8n = this.A00.A00;
        if (h8n != null) {
            h8n.CmG(this.A01);
        }
        String str = this.A02;
        C146106i8 A0H = AbstractC37304Gc5.A0H();
        A0H.A0D = str;
        A0H.A0R = true;
        A0H.A0J = true;
        AbstractC31178DnM.A1S(A0H);
    }
}
