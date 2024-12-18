package X;

import android.content.Context;

/* renamed from: X.85J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85J {
    public long A00;
    public boolean A01;
    public final Context A02;

    public C85J(Context context) {
        C14360o3.A0B(context, 1);
        this.A02 = context;
    }

    public final void A00(String str, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        if (!this.A01 && System.currentTimeMillis() - this.A00 >= 1500) {
            C193328hC c193328hC = new C193328hC(this.A02);
            c193328hC.A0A(2131971203);
            c193328hC.A0r(str);
            int i = 2131971205;
            if (z) {
                i = 2131971204;
            }
            c193328hC.A0J(new AOX(this, str, z, z2), i);
            c193328hC.A0H(DialogInterfaceOnClickListenerC23170AOj.A00, 2131954754);
            c193328hC.A0g(new DialogInterfaceOnDismissListenerC23181AOu(this));
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            C0fJ.A00(c193328hC.A02());
            this.A01 = true;
        }
    }
}
