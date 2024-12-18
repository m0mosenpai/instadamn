package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.List;

/* renamed from: X.UPi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66621UPi extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final MediaUploadMetadata A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final List A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66621UPi) {
                C66621UPi c66621UPi = (C66621UPi) obj;
                if (!C14360o3.A0K(this.A05, c66621UPi.A05) || !C14360o3.A0K(this.A0A, c66621UPi.A0A) || this.A02 != c66621UPi.A02 || this.A03 != c66621UPi.A03 || !C14360o3.A0K(this.A06, c66621UPi.A06) || !C14360o3.A0K(this.A07, c66621UPi.A07) || this.A09 != c66621UPi.A09 || this.A08 != c66621UPi.A08 || this.A00 != c66621UPi.A00 || this.A0B != c66621UPi.A0B || this.A01 != c66621UPi.A01 || !C14360o3.A0K(this.A04, c66621UPi.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, (((AbstractC166997dE.A0J(this.A0A, this.A05.hashCode() * 31) + this.A02) * 31) + this.A03) * 31)))) + this.A00) * 31) + this.A01) * 31) + this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloudMediaInfo(id=");
        sb.append(this.A05);
        sb.append(", sourceAlbumTypes=");
        sb.append(this.A0A);
        sb.append(", height=");
        sb.append(this.A02);
        sb.append(", width=");
        sb.append(this.A03);
        sb.append(", src=");
        sb.append(this.A06);
        sb.append(", thumbnail=");
        sb.append(this.A07);
        sb.append(AbstractC111324zv.A00(568));
        sb.append(this.A09);
        sb.append(", hasCtime=");
        sb.append(this.A08);
        sb.append(", ctime=");
        sb.append(this.A00);
        sb.append(", hasDuration=");
        sb.append(this.A0B);
        sb.append(MSV.A00(37));
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(572));
        return AbstractC167017dG.A0o(this.A04, sb);
    }

    public C66621UPi(MediaUploadMetadata mediaUploadMetadata, String str, String str2, String str3, List list, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A0A = list;
        this.A02 = i;
        this.A03 = i2;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = z;
        this.A08 = z2;
        this.A00 = i3;
        this.A0B = z3;
        this.A01 = i4;
        this.A04 = mediaUploadMetadata;
    }
}
