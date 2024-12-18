package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bhi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26157Bhi extends C0T6 implements InterfaceC132245y2 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C26157Bhi(MediaNoticeIcon mediaNoticeIcon, C132175xv c132175xv, String str, String str2, String str3) {
        this(mediaNoticeIcon, c132175xv, new C26036BfP(false, false, false, false, false), str, str2, str3);
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26157Bhi) && ((C26157Bhi) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        if (this.A00 != 0) {
            return AbstractC132295y8.A01(this, "SearchTopicPreviewModel", ((C132175xv) this.A03).A03);
        }
        return this.A04;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return (C132175xv) this.A03;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C26157Bhi c26157Bhi = (C26157Bhi) obj;
                    if (C14360o3.A0K(this.A03, c26157Bhi.A03) && C14360o3.A0K(this.A02, c26157Bhi.A02) && C14360o3.A0K(this.A06, c26157Bhi.A06) && C14360o3.A0K(this.A07, c26157Bhi.A07) && C14360o3.A0K(this.A05, c26157Bhi.A05) && C14360o3.A0K(this.A04, c26157Bhi.A04)) {
                        obj2 = this.A01;
                        obj3 = c26157Bhi.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C26157Bhi c26157Bhi2 = (C26157Bhi) obj;
            if (!C14360o3.A0K(this.A03, c26157Bhi2.A03) || !C14360o3.A0K(this.A02, c26157Bhi2.A02) || this.A01 != c26157Bhi2.A01 || !C14360o3.A0K(this.A07, c26157Bhi2.A07) || !C14360o3.A0K(this.A06, c26157Bhi2.A06)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = c26157Bhi2.A05;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03));
        if (i != 0) {
            return ((((AbstractC166997dE.A0K(this.A07, (A0J + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A01);
        }
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A01, A0J))));
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public C26157Bhi(MediaNoticeIcon mediaNoticeIcon, C132175xv c132175xv, C26036BfP c26036BfP, String str, String str2, String str3) {
        this.A03 = c132175xv;
        this.A02 = c26036BfP;
        this.A01 = mediaNoticeIcon;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = AbstractC132295y8.A01(this, "medianotice", c132175xv.A03);
    }

    public C26157Bhi(C132175xv c132175xv, C26036BfP c26036BfP, ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this.A03 = c132175xv;
        this.A02 = c26036BfP;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A01 = imageUrl;
    }

    public C26157Bhi(C132175xv c132175xv, ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this(c132175xv, new C26036BfP(false, false, false, false, false), imageUrl, str, str2, str3, str4);
    }
}
