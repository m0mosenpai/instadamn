package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.MtJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51736MtJ extends C0T6 {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public C51736MtJ() {
        this(null, C05F.A00, "", C16930sl.A00, 0L, false, false);
    }

    public static final C51736MtJ A00(ImageUrl imageUrl, Integer num, String str, List list, long j, boolean z, boolean z2) {
        AbstractC167007dF.A1E(num, 0, str);
        C14360o3.A0B(list, 6);
        return new C51736MtJ(imageUrl, num, str, list, j, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51736MtJ) {
                C51736MtJ c51736MtJ = (C51736MtJ) obj;
                if (this.A02 != c51736MtJ.A02 || this.A05 != c51736MtJ.A05 || !C14360o3.A0K(this.A01, c51736MtJ.A01) || !C14360o3.A0K(this.A03, c51736MtJ.A03) || this.A00 != c51736MtJ.A00 || this.A06 != c51736MtJ.A06 || !C14360o3.A0K(this.A04, c51736MtJ.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public static C51736MtJ A01(C51736MtJ c51736MtJ, Integer num, List list, boolean z) {
        return A00(c51736MtJ.A01, num, c51736MtJ.A03, list, c51736MtJ.A00, z, c51736MtJ.A06);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "Ready";
                break;
            case 2:
                str = "Loading";
                break;
            default:
                str = "Empty";
                break;
        }
        return AbstractC166987dD.A0I(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A03, (AbstractC167007dF.A0D(this.A05, AbstractC25228BEl.A0F(str, intValue)) + AbstractC167017dG.A0M(this.A01)) * 31))));
    }

    public C51736MtJ(ImageUrl imageUrl, Integer num, String str, List list, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 4);
        this.A02 = num;
        this.A05 = z;
        this.A01 = imageUrl;
        this.A03 = str;
        this.A00 = j;
        this.A06 = z2;
        this.A04 = list;
    }
}
