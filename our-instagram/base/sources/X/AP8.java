package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AP8 implements DialogInterface.OnShowListener {
    public final /* synthetic */ C8EU A00;

    public AP8(C8EU c8eu) {
        this.A00 = c8eu;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        char c;
        C8EU c8eu = this.A00;
        boolean z = c8eu instanceof C172257lu;
        C23031Ai c23031Ai = c8eu.A02;
        if (z) {
            interfaceC16530ry = c23031Ai.A57;
            c0yrArr = C23031Ai.A8c;
            c = 322;
        } else {
            interfaceC16530ry = c23031Ai.A2e;
            c0yrArr = C23031Ai.A8c;
            c = 321;
        }
        interfaceC16530ry.Egi(c23031Ai, true, c0yrArr[c]);
    }
}
