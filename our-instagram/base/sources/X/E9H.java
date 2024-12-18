package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class E9H extends C0T6 implements InterfaceC37094GWd {
    public final View A00;
    public final C35169FfL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9H) {
                E9H e9h = (E9H) obj;
                if (!C14360o3.A0K(this.A00, e9h.A00) || !C14360o3.A0K(this.A01, e9h.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public E9H(View view, C35169FfL c35169FfL) {
        this.A00 = view;
        this.A01 = c35169FfL;
    }
}
