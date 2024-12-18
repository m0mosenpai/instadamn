package X;

import android.view.View;
import java.util.List;

/* renamed from: X.GzK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38679GzK extends C0T6 {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;

    public C38679GzK(List list, int i, int i2, boolean z) {
        this.A02 = list;
        this.A03 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A04 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C38679GzK) {
                C38679GzK c38679GzK = (C38679GzK) obj;
                if (c38679GzK.A04 != 1 || !C14360o3.A0K(this.A02, c38679GzK.A02) || this.A03 != c38679GzK.A03 || this.A01 != c38679GzK.A01 || this.A00 != c38679GzK.A00) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A04 != 0) {
            return super.hashCode();
        }
        return ((AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A02)) + this.A01) * 31) + this.A00;
    }

    public C38679GzK(View.OnClickListener onClickListener, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = onClickListener;
    }

    public C38679GzK() {
        this((List) C16930sl.A00, -1, -1, false);
    }
}
