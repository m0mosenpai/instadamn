package X;

import android.view.View;

/* renamed from: X.CwA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29315CwA implements InterfaceC58152PqH {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C29315CwA(InterfaceC16660sJ interfaceC16660sJ, long j) {
        this.A01 = interfaceC16660sJ;
        this.A00 = j;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A01.invoke(Long.valueOf(this.A00));
    }
}
