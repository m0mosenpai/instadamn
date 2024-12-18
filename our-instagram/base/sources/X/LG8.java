package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes8.dex */
public final class LG8 {
    public final ExtendedImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean A00() {
        String str;
        String str2 = this.A01;
        if (str2 == null || str2.length() == 0 || (str = this.A03) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public LG8(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A00 = extendedImageUrl;
        this.A02 = str5;
    }

    public LG8() {
        this(null, "", null, null, null, null);
    }
}
