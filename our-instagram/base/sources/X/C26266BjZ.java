package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.BjZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26266BjZ extends C0T6 implements InterfaceC30895Di8 {
    public final int A00;
    public final C51750MtZ A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public C26266BjZ(C51750MtZ c51750MtZ, ImageUrl imageUrl, String str, String str2, List list, List list2, List list3, List list4, int i) {
        AbstractC167007dF.A1F(list, 1, str);
        this.A06 = list;
        this.A05 = list2;
        this.A02 = imageUrl;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = c51750MtZ;
        this.A07 = list3;
        this.A08 = list4;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26266BjZ) {
                C26266BjZ c26266BjZ = (C26266BjZ) obj;
                if (!C14360o3.A0K(this.A06, c26266BjZ.A06) || !C14360o3.A0K(this.A05, c26266BjZ.A05) || !C14360o3.A0K(this.A02, c26266BjZ.A02) || !C14360o3.A0K(this.A04, c26266BjZ.A04) || !C14360o3.A0K(this.A03, c26266BjZ.A03) || !C14360o3.A0K(this.A01, c26266BjZ.A01) || !C14360o3.A0K(this.A07, c26266BjZ.A07) || !C14360o3.A0K(this.A08, c26266BjZ.A08) || this.A00 != c26266BjZ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0K(this.A04, (((AbstractC166987dD.A0G(this.A06) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31)) + AbstractC166997dE.A0I(this.A08)) * 31) + this.A00;
    }
}
