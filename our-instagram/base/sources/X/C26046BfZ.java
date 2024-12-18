package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BfZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26046BfZ extends C0T6 {
    public final ImageView.ScaleType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26046BfZ) {
                C26046BfZ c26046BfZ = (C26046BfZ) obj;
                if (!C14360o3.A0K(this.A03, c26046BfZ.A03) || this.A07 != c26046BfZ.A07 || !C14360o3.A0K(this.A02, c26046BfZ.A02) || !C14360o3.A0K(this.A01, c26046BfZ.A01) || this.A09 != c26046BfZ.A09 || this.A05 != c26046BfZ.A05 || this.A0B != c26046BfZ.A0B || this.A00 != c26046BfZ.A00 || this.A08 != c26046BfZ.A08 || this.A0A != c26046BfZ.A0A || this.A04 != c26046BfZ.A04 || this.A06 != c26046BfZ.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A09, (((AbstractC167007dF.A0D(this.A07, AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31))))))));
    }

    public C26046BfZ(ImageView.ScaleType scaleType, ImageUrl imageUrl, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A03 = str;
        this.A07 = z;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A09 = z2;
        this.A05 = z3;
        this.A0B = z4;
        this.A00 = scaleType;
        this.A08 = z5;
        this.A0A = z6;
        this.A04 = z7;
        this.A06 = z8;
    }

    public C26046BfZ() {
        this(ImageView.ScaleType.CENTER, null, null, null, false, false, true, true, true, true, false, false);
    }
}
