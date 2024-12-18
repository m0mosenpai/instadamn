package X;

import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.HZq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39351HZq extends IN1 {
    public final ImageInfo A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39351HZq(ImageInfo imageInfo, String str, String str2) {
        super(new C41630IbL(imageInfo), C05F.A0N, str, "catalog_photo", AbstractC40161tk.A00(imageInfo));
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = imageInfo;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39351HZq) {
                C39351HZq c39351HZq = (C39351HZq) obj;
                if (!C14360o3.A0K(this.A01, c39351HZq.A01) || !C14360o3.A0K(this.A00, c39351HZq.A00) || !C14360o3.A0K(this.A02, c39351HZq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
