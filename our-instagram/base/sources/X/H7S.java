package X;

import android.text.Spannable;

/* loaded from: classes7.dex */
public final class H7S extends C0T6 implements JFV {
    public final Spannable A00;
    public final C45127Jxw A01;

    public H7S(Spannable spannable, C45127Jxw c45127Jxw) {
        C14360o3.A0B(spannable, 1);
        this.A00 = spannable;
        this.A01 = c45127Jxw;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7S) {
                H7S h7s = (H7S) obj;
                if (!C14360o3.A0K(this.A00, h7s.A00) || !C14360o3.A0K(this.A01, h7s.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC53644Nnp.A00();
    }
}
