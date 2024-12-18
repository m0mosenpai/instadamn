package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaNoticeIcon;

/* loaded from: classes7.dex */
public final class H4B extends C0T6 implements JM6 {
    public final MediaNoticeIcon A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.JM6
    public final H4B EwO() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4B) {
                H4B h4b = (H4B) obj;
                if (!C14360o3.A0K(this.A01, h4b.A01) || this.A00 != h4b.A00 || !C14360o3.A0K(this.A02, h4b.A02) || !C14360o3.A0K(this.A03, h4b.A03) || !C14360o3.A0K(this.A04, h4b.A04) || !C14360o3.A0K(this.A05, h4b.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM6
    public final MediaNoticeIcon BXM() {
        return this.A00;
    }

    @Override // X.JM6
    public final String BpN() {
        return this.A05;
    }

    @Override // X.JM6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMediaNoticeDict", AbstractC40064Hpq.A00(this));
    }

    @Override // X.JM6
    public final String getMediaId() {
        return this.A01;
    }

    @Override // X.JM6
    public final String getNoticeSubText() {
        return this.A02;
    }

    @Override // X.JM6
    public final String getNoticeText() {
        return this.A03;
    }

    @Override // X.JM6
    public final String getNoticeUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public H4B(MediaNoticeIcon mediaNoticeIcon, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A00 = mediaNoticeIcon;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
