package X;

import android.graphics.Bitmap;

/* renamed from: X.Mwa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51892Mwa extends C0T6 implements InterfaceC57856PlM {
    public final Bitmap A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public C51892Mwa(Bitmap bitmap, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(bitmap, 1);
        this.A00 = bitmap;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51892Mwa) {
                C51892Mwa c51892Mwa = (C51892Mwa) obj;
                if (!C14360o3.A0K(this.A00, c51892Mwa.A00) || this.A02 != c51892Mwa.A02 || this.A03 != c51892Mwa.A03 || this.A01 != c51892Mwa.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "DIRECT";
                break;
            case 2:
                str = "CAMERA";
                break;
            default:
                str = "STORIES";
                break;
        }
        return A0D + AbstractC25226BEj.A02(str, intValue);
    }
}
