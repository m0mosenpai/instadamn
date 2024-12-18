package X;

import com.facebook.R;

/* renamed from: X.BXs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25707BXs extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C25707BXs(InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        this.A00 = i2;
        switch (i2) {
            case 0:
                r2 = (i & 1) != 0 ? R.drawable.instagram_arrow_left_pano_outline_24 : 0;
                r1 = (i & 2) != 0 ? 2131963913 : 0;
                interfaceC16820sZ = (i & 4) != 0 ? null : interfaceC16820sZ;
                i3 = 0;
                break;
            case 1:
                r2 = (i & 1) != 0 ? R.drawable.instagram_x_pano_outline_24 : 0;
                r1 = (i & 2) != 0 ? 2131960994 : 0;
                interfaceC16820sZ = (i & 4) != 0 ? null : interfaceC16820sZ;
                i3 = 1;
                break;
            default:
                interfaceC16820sZ = (i & 4) != 0 ? null : interfaceC16820sZ;
                i3 = 2;
                break;
        }
        this.A00 = i3;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C25707BXs) {
            C25707BXs c25707BXs = (C25707BXs) obj;
            if (c25707BXs.A00 != i || this.A02 != c25707BXs.A02 || this.A01 != c25707BXs.A01 || !C14360o3.A0K(this.A03, c25707BXs.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A03);
    }
}
