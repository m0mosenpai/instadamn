package X;

import android.view.View;

/* renamed from: X.Ajv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23961Ajv implements InterfaceC58152PqH {
    public final /* synthetic */ C5G5 A00;
    public final /* synthetic */ C6k4 A01;

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C23961Ajv(C5G5 c5g5, C6k4 c6k4) {
        this.A00 = c5g5;
        this.A01 = c6k4;
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        this.A01.A00 = null;
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        this.A00.A02 = true;
    }
}
