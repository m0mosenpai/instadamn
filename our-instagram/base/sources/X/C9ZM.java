package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.9ZM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZM extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final Medium A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZM) {
                C9ZM c9zm = (C9ZM) obj;
                if (!C14360o3.A0K(this.A06, c9zm.A06) || !C14360o3.A0K(this.A05, c9zm.A05) || !C14360o3.A0K(this.A09, c9zm.A09) || this.A03 != c9zm.A03 || this.A02 != c9zm.A02 || this.A01 != c9zm.A01 || this.A00 != c9zm.A00 || !C14360o3.A0K(this.A07, c9zm.A07) || !C14360o3.A0K(this.A04, c9zm.A04) || this.A08 != c9zm.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, (((((((AbstractC167007dF.A07(this.A02, AbstractC167007dF.A07(this.A03, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A05, AbstractC167017dG.A0O(this.A06) * 31)))) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31);
    }

    public C9ZM(Bitmap bitmap, Bitmap bitmap2, Medium medium, String str, List list, int i, int i2, long j, long j2, boolean z) {
        this.A06 = str;
        this.A05 = bitmap;
        this.A09 = medium;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = list;
        this.A04 = bitmap2;
        this.A08 = z;
    }
}
