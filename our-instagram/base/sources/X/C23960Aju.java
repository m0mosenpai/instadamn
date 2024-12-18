package X;

import android.view.View;

/* renamed from: X.Aju, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23960Aju implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;

    public C23960Aju(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                ((C193768hw) this.A01).A0G.A0Z.DIt();
                return;
            case 1:
                APn.A02((APn) this.A01, false);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (2 - this.A00 == 0) {
            ((C14510oO) this.A01).A00 = true;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
