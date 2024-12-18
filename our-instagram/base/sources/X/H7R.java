package X;

import android.text.Spannable;

/* loaded from: classes7.dex */
public final class H7R extends C0T6 implements JFV {
    public final Spannable A00;

    public H7R(Spannable spannable) {
        C14360o3.A0B(spannable, 1);
        this.A00 = spannable;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H7R) && C14360o3.A0K(this.A00, ((H7R) obj).A00));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC53644Nnp.A00();
    }
}
