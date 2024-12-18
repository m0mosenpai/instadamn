package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class HYL extends AbstractC39658Hin {
    public final View.OnClickListener A00;
    public final String A01;
    public final String A02;

    public HYL(String str, String str2, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HYL) {
                HYL hyl = (HYL) obj;
                if (!C14360o3.A0K(this.A02, hyl.A02) || !C14360o3.A0K(this.A01, hyl.A01) || !C14360o3.A0K(this.A00, hyl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02)));
    }
}
