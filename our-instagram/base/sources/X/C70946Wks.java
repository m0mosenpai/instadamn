package X;

import android.view.View;

/* renamed from: X.Wks, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70946Wks implements InterfaceC58152PqH {
    public final /* synthetic */ C68732VbB A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C70946Wks(C68732VbB c68732VbB, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c68732VbB;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A01.invoke();
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        this.A00.A00 = null;
    }
}
