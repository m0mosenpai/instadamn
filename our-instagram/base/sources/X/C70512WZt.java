package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.WZt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70512WZt implements InterfaceC72024XFm {
    public final int A00;

    @Override // X.InterfaceC72024XFm
    public final void ChW(ImageView imageView) {
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C70512WZt) && this.A00 == ((C70512WZt) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("ButtonVariantImageResource(buttonVariant=", ')', this.A00);
    }

    public C70512WZt(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC72024XFm
    public final void EPs(View view) {
        WFY.A02();
    }
}
