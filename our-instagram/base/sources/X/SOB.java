package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes10.dex */
public final class SOB {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final View.OnClickListener A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public SOB(Drawable drawable, View.OnClickListener onClickListener, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A02 = drawable;
        this.A00 = i;
        this.A03 = onClickListener;
        this.A04 = str;
        this.A01 = i2;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOB) {
                SOB sob = (SOB) obj;
                if (this.A06 != sob.A06 || this.A07 != sob.A07 || this.A08 != sob.A08 || !C14360o3.A0K(this.A02, sob.A02) || this.A00 != sob.A00 || !C14360o3.A0K(this.A03, sob.A03) || !C14360o3.A0K(this.A04, sob.A04) || this.A01 != sob.A01 || !C14360o3.A0K(this.A05, sob.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((AbstractC58322PtE.A02(this.A06 ? 1 : 0) + 31) * 31) + AbstractC58322PtE.A02(this.A07 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A08 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + this.A00) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + this.A01) * 31) + AbstractC25235BEs.A06(this.A05);
    }
}
