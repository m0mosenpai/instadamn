package X;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.CnC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28780CnC implements InterfaceC30907DiK {
    public final View A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGT(this, 40));
    public final C03U A02;

    @Override // X.InterfaceC30907DiK
    public final void Eny() {
        if (Build.VERSION.SDK_INT >= 34) {
            CB0.A00(this.A00, (InputMethodManager) this.A01.getValue());
        }
    }

    public C28780CnC(View view) {
        this.A00 = view;
        this.A02 = new C03U(view);
    }
}
