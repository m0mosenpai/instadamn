package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class G8A implements InterfaceC199918sv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C73R A01;

    public G8A(Context context, C73R c73r) {
        this.A01 = c73r;
        this.A00 = context;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C73R c73r = this.A01;
        if (c73r instanceof GBP) {
            C6WQ A0i = AbstractC31174DnI.A0i(this.A00);
            ((GBP) c73r).A00 = new C36327G0w(A0i, 3);
            C0fJ.A00(A0i);
        }
        c73r.onClick();
    }
}
