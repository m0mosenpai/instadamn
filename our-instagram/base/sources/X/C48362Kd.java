package X;

import java.util.LinkedHashSet;

/* renamed from: X.2Kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48362Kd {
    public Integer A00 = C05F.A00;
    public java.util.Set A01 = new LinkedHashSet();
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public final void A01(Integer num) {
        C14360o3.A0B(num, 0);
        this.A00 = num;
    }

    public final C48562Ky A00() {
        java.util.Set A0k = AbstractC001800i.A0k(this.A01);
        boolean z = this.A03;
        boolean z2 = false;
        if (this.A04) {
            z2 = true;
        }
        return new C48562Ky(this.A00, A0k, -1L, -1L, z, z2, this.A02, this.A05);
    }
}
