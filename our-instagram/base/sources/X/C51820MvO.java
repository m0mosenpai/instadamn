package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MvO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51820MvO extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImageUrl A03;
    public final C105824pt A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51820MvO) {
                C51820MvO c51820MvO = (C51820MvO) obj;
                if (!C14360o3.A0K(this.A05, c51820MvO.A05) || this.A02 != c51820MvO.A02 || !C14360o3.A0K(this.A06, c51820MvO.A06) || this.A08 != c51820MvO.A08 || !C14360o3.A0K(this.A07, c51820MvO.A07) || this.A01 != c51820MvO.A01 || !C14360o3.A0K(this.A03, c51820MvO.A03) || !C14360o3.A0K(this.A04, c51820MvO.A04) || this.A00 != c51820MvO.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, (((AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0K(this.A06, (AbstractC166987dD.A0J(this.A05) + this.A02) * 31)) + AbstractC167017dG.A0O(this.A07)) * 31) + this.A01) * 31)) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        String str2;
        C51820MvO c51820MvO = (C51820MvO) obj;
        String str3 = this.A05;
        ImageUrl imageUrl = null;
        if (c51820MvO != null) {
            str = c51820MvO.A05;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str3, str)) {
            String str4 = this.A06;
            if (c51820MvO != null) {
                str2 = c51820MvO.A06;
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str4, str2)) {
                ImageUrl imageUrl2 = this.A03;
                if (c51820MvO != null) {
                    imageUrl = c51820MvO.A03;
                }
                if (C14360o3.A0K(imageUrl2, imageUrl)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C51820MvO(ImageUrl imageUrl, C105824pt c105824pt, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A02 = i;
        this.A06 = str2;
        this.A08 = z;
        this.A07 = str3;
        this.A01 = i2;
        this.A03 = imageUrl;
        this.A04 = c105824pt;
        this.A00 = i3;
    }
}
