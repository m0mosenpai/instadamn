package X;

import android.app.Dialog;

/* renamed from: X.B2a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24952B2a implements InterfaceC16820sZ {
    public final /* synthetic */ C183688Ct A00;

    public C24952B2a(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C176567tE.A00(new Runnable() { // from class: X.AqY
            @Override // java.lang.Runnable
            public final void run() {
                Dialog dialog = (Dialog) C24952B2a.this.A00.A20.getValue();
                if (!dialog.isShowing()) {
                    C0fJ.A00(dialog);
                }
            }
        });
        return C0eB.A00;
    }
}
