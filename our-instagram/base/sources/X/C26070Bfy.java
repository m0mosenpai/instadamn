package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.Bfy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26070Bfy extends C0T6 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C26070Bfy(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str3, 3);
        AbstractC25234BEr.A0k(4, imageUrl, str4, str5, str6);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = imageUrl;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C26070Bfy)) {
                        return false;
                    }
                    C26070Bfy c26070Bfy = (C26070Bfy) obj;
                    if (c26070Bfy.A00 != 0 || !C14360o3.A0K(this.A03, c26070Bfy.A03) || !C14360o3.A0K(this.A02, c26070Bfy.A02) || !C14360o3.A0K(this.A04, c26070Bfy.A04) || !C14360o3.A0K(this.A01, c26070Bfy.A01) || !C14360o3.A0K(this.A06, c26070Bfy.A06) || !C14360o3.A0K(this.A07, c26070Bfy.A07)) {
                        return false;
                    }
                    str = this.A05;
                    str2 = c26070Bfy.A05;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C26070Bfy)) {
                        return false;
                    }
                    C26070Bfy c26070Bfy2 = (C26070Bfy) obj;
                    if (c26070Bfy2.A00 != 1 || !C14360o3.A0K(this.A01, c26070Bfy2.A01) || !C14360o3.A0K(this.A05, c26070Bfy2.A05) || !C14360o3.A0K(this.A02, c26070Bfy2.A02) || !C14360o3.A0K(this.A06, c26070Bfy2.A06) || !C14360o3.A0K(this.A07, c26070Bfy2.A07) || !C14360o3.A0K(this.A03, c26070Bfy2.A03)) {
                        return false;
                    }
                    str = this.A04;
                    str2 = c26070Bfy2.A04;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    if (obj instanceof C26070Bfy) {
                        C26070Bfy c26070Bfy3 = (C26070Bfy) obj;
                        if (c26070Bfy3.A00 == 2 && C14360o3.A0K(this.A02, c26070Bfy3.A02) && C14360o3.A0K(this.A06, c26070Bfy3.A06) && C14360o3.A0K(this.A05, c26070Bfy3.A05) && this.A01 == c26070Bfy3.A01 && C14360o3.A0K(this.A03, c26070Bfy3.A03) && C14360o3.A0K(this.A04, c26070Bfy3.A04)) {
                            str = this.A07;
                            str2 = c26070Bfy3.A07;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0K;
        String str;
        switch (this.A00) {
            case 0:
                return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)))))));
            case 1:
                A0K = (((((((AbstractC166997dE.A0K(this.A05, AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                str = this.A04;
                return A0K + AbstractC25227BEk.A07(str);
            default:
                A0K = ((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
                str = this.A07;
                return A0K + AbstractC25227BEk.A07(str);
        }
    }

    public final String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaNoticeUiState(mediaId=");
        A1C.append(this.A02);
        A1C.append(", noticeText=");
        A1C.append(this.A06);
        A1C.append(", noticeSubText=");
        A1C.append(this.A05);
        A1C.append(", noticeIcon=");
        A1C.append(this.A01);
        A1C.append(", noticeMediaId=");
        A1C.append(this.A03);
        A1C.append(", noticeRidgeMatchId=");
        A1C.append(this.A04);
        A1C.append(", noticeUrl=");
        return AbstractC25236BEt.A0Y(this.A07, A1C);
    }

    public C26070Bfy(DirectThreadThemeInfo directThreadThemeInfo, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? null : directThreadThemeInfo, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public C26070Bfy(MediaNoticeIcon mediaNoticeIcon, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A01 = mediaNoticeIcon;
        this.A03 = str4;
        this.A04 = str5;
        this.A07 = str6;
    }

    public C26070Bfy(DirectThreadThemeInfo directThreadThemeInfo, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str, 2);
        this.A01 = directThreadThemeInfo;
        this.A05 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A04 = str6;
    }
}
