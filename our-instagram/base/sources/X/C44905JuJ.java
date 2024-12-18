package X;

import com.instagram.common.typedurl.ImageUrl;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.JuJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44905JuJ extends AbstractC46355Kfd {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44905JuJ) {
                C44905JuJ c44905JuJ = (C44905JuJ) obj;
                if (!C14360o3.A0K(this.A03, c44905JuJ.A03) || this.A08 != c44905JuJ.A08 || this.A01 != c44905JuJ.A01 || this.A02 != c44905JuJ.A02 || this.A00 != c44905JuJ.A00 || !C14360o3.A0K(this.A07, c44905JuJ.A07) || !C14360o3.A0K(this.A05, c44905JuJ.A05) || !C14360o3.A0K(this.A0A, c44905JuJ.A0A) || !C14360o3.A0K(this.A09, c44905JuJ.A09) || !C14360o3.A0K(this.A04, c44905JuJ.A04) || !C14360o3.A0K(this.A06, c44905JuJ.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A03) * 31;
        Integer num = this.A08;
        if (num != null) {
            i = LAM.A00(num);
        }
        return AbstractC25226BEj.A03(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A07, (((((((A0M + i) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31))))));
    }

    public C44905JuJ(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        AbstractC167017dG.A1U(str, str2);
        AbstractC25234BEr.A0l(8, str3, str4, str5, str6);
        this.A03 = imageUrl;
        this.A08 = num;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A07 = str;
        this.A05 = str2;
        this.A0A = str3;
        this.A09 = str4;
        this.A04 = str5;
        this.A06 = str6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ExpressoStickerItem(stickerUri=");
        A1C.append(this.A03);
        A1C.append(", requestedSurface=");
        A1C.append(LAM.A01(this.A08));
        A1C.append(", templateHeight=");
        A1C.append(this.A01);
        A1C.append(", templateWidth=");
        A1C.append(this.A02);
        A1C.append(", fps=");
        A1C.append(this.A00);
        A1C.append(", stickerPackType=");
        A1C.append(this.A07);
        A1C.append(MSV.A00(629));
        A1C.append(this.A05);
        A1C.append(", stableId=");
        A1C.append(this.A0A);
        A1C.append(MSV.A00(633));
        A1C.append(this.A09);
        A1C.append(MSV.A00(66));
        A1C.append(this.A04);
        A1C.append(MSV.A00(634));
        return AbstractC25236BEt.A0Y(this.A06, A1C);
    }

    public C44905JuJ() {
        this(null, null, "", "", "", "", "", "", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 1);
    }
}
