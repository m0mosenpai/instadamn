package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* loaded from: classes11.dex */
public final class UPJ extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final ImageInfo A04;
    public final String A05;
    public final List A06;

    public UPJ(ImageInfo imageInfo, String str, List list, float f, int i, int i2, int i3) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A04 = imageInfo;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = f;
        this.A06 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPJ) {
                UPJ upj = (UPJ) obj;
                if (!C14360o3.A0K(this.A05, upj.A05) || !C14360o3.A0K(this.A04, upj.A04) || this.A01 != upj.A01 || this.A02 != upj.A02 || this.A03 != upj.A03 || Float.compare(this.A00, upj.A00) != 0 || !C14360o3.A0K(this.A06, upj.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A00 = AbstractC166997dE.A00(((((((((this.A05.hashCode() * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31, this.A00);
        List list = this.A06;
        if (list != null) {
            i = list.hashCode();
        }
        return A00 + i;
    }
}
