package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.E8o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32090E8o extends C0T6 implements InterfaceC66482zP {
    public int A00;
    public boolean A01;
    public final ImageUrl A02;
    public final C34565FKz A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32090E8o) {
                C32090E8o c32090E8o = (C32090E8o) obj;
                if (!C14360o3.A0K(this.A04, c32090E8o.A04) || !C14360o3.A0K(this.A06, c32090E8o.A06) || !C14360o3.A0K(this.A02, c32090E8o.A02) || !C14360o3.A0K(this.A05, c32090E8o.A05) || !C14360o3.A0K(this.A03, c32090E8o.A03) || this.A01 != c32090E8o.A01 || this.A07 != c32090E8o.A07 || this.A00 != c32090E8o.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A01, AbstractC166997dE.A0J(this.A03, (((AbstractC166997dE.A0K(this.A06, AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31))) + this.A00;
    }

    public C32090E8o(ImageUrl imageUrl, C34565FKz c34565FKz, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A04 = str;
        this.A06 = str2;
        this.A02 = imageUrl;
        this.A05 = str3;
        this.A03 = c34565FKz;
        this.A01 = z;
        this.A07 = z2;
        this.A00 = i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
