package X;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: X.DxK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31763DxK extends InputConnectionWrapper {
    public final InterfaceC37111GWw A00;

    public C31763DxK(InputConnection inputConnection, InterfaceC37111GWw interfaceC37111GWw) {
        super(inputConnection, false);
        this.A00 = interfaceC37111GWw;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C31782Dy1 c31782Dy1 = (C31782Dy1) this.A00;
        GYV gyv = c31782Dy1.A00;
        if (gyv != null) {
            gyv.D9k(c31782Dy1);
        }
        return super.deleteSurroundingText(i, i2);
    }
}
