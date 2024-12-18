package X;

import android.view.View;
import java.util.List;

/* renamed from: X.9BT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BT extends C0T6 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public C9BT(List list, int i, boolean z, boolean z2) {
        this.A00 = 0;
        this.A01 = i;
        this.A02 = list;
        this.A03 = z;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9BT) {
                    C9BT c9bt = (C9BT) obj;
                    if (c9bt.A00 == 1 && this.A01 == c9bt.A01 && C14360o3.A0K(this.A02, c9bt.A02) && this.A04 == c9bt.A04) {
                        z = this.A03;
                        z2 = c9bt.A03;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9BT)) {
                return false;
            }
            C9BT c9bt2 = (C9BT) obj;
            if (c9bt2.A00 != 0 || this.A01 != c9bt2.A01 || !C14360o3.A0K(this.A02, c9bt2.A02) || this.A03 != c9bt2.A03) {
                return false;
            }
            z = this.A04;
            z2 = c9bt2.A04;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        int hashCode;
        int i2 = this.A00;
        int i3 = this.A01;
        if (i2 != 0) {
            int i4 = i3 * 31;
            Object obj = this.A02;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i5 = (i4 + hashCode) * 31;
            int i6 = 1237;
            if (this.A04) {
                i6 = 1231;
            }
            i = (i5 + i6) * 31;
            z = this.A03;
        } else {
            int hashCode2 = ((i3 * 31) + this.A02.hashCode()) * 31;
            int i7 = 1237;
            if (this.A03) {
                i7 = 1231;
            }
            i = (hashCode2 + i7) * 31;
            z = this.A04;
        }
        int i8 = 1237;
        if (z) {
            i8 = 1231;
        }
        return i + i8;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TooltipData(duration=");
        sb.append(this.A01);
        sb.append(", items=");
        sb.append(this.A02);
        sb.append(", revoking=");
        sb.append(this.A03);
        sb.append(", visualized=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BT(List list, int i, int i2, boolean z) {
        this(list, i, (i2 & 4) != 0 ? false : z, false);
        this.A00 = 0;
    }

    public C9BT(View.OnClickListener onClickListener, int i) {
        this.A00 = 1;
        this.A00 = 1;
        this.A00 = 1;
        this.A01 = i;
        this.A02 = onClickListener;
        this.A04 = false;
        this.A03 = true;
    }
}
