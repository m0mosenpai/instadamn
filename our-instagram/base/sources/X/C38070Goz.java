package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Goz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38070Goz extends C0T6 implements JM8 {
    public final AudioBrowserPlaylistType A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C38070Goz(AudioBrowserPlaylistType audioBrowserPlaylistType, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, List list) {
        AbstractC167007dF.A1I(str2, 4, str4);
        this.A03 = str;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A04 = str2;
        this.A00 = audioBrowserPlaylistType;
        this.A07 = list;
        this.A05 = str3;
        this.A06 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38070Goz) {
                C38070Goz c38070Goz = (C38070Goz) obj;
                if (!C14360o3.A0K(this.A03, c38070Goz.A03) || !C14360o3.A0K(this.A01, c38070Goz.A01) || !C14360o3.A0K(this.A02, c38070Goz.A02) || !C14360o3.A0K(this.A04, c38070Goz.A04) || this.A00 != c38070Goz.A00 || !C14360o3.A0K(this.A07, c38070Goz.A07) || !C14360o3.A0K(this.A05, c38070Goz.A05) || !C14360o3.A0K(this.A06, c38070Goz.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM8
    public final String Aal() {
        return this.A03;
    }

    @Override // X.JM8
    public final ImageUrl BEx() {
        return this.A02;
    }

    @Override // X.JM8
    public final AudioBrowserPlaylistType Be7() {
        return this.A00;
    }

    @Override // X.JM8
    public final List Bfr() {
        return this.A07;
    }

    @Override // X.JM8
    public final String getId() {
        return this.A04;
    }

    @Override // X.JM8
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // X.JM8
    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A06, (((((AbstractC166997dE.A0K(this.A04, ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31);
    }

    @Override // X.JM8
    public final JM8 E9Z(C1DY c1dy) {
        return this;
    }
}
