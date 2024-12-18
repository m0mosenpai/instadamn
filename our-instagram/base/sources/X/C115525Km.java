package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.File;
import java.util.List;

/* renamed from: X.5Km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115525Km extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public MediaUploadMetadata A0B;
    public Boolean A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;

    public C115525Km(MediaUploadMetadata mediaUploadMetadata, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j, boolean z) {
        C14360o3.A0B(str, 1);
        this.A0F = str;
        this.A0G = str2;
        this.A0E = str3;
        this.A0A = j;
        this.A09 = i;
        this.A05 = i2;
        this.A01 = i3;
        this.A07 = i4;
        this.A0D = str4;
        this.A00 = i5;
        this.A08 = i6;
        this.A04 = i7;
        this.A03 = i8;
        this.A02 = i9;
        this.A0H = str5;
        this.A06 = i10;
        this.A0B = mediaUploadMetadata;
        this.A0K = z;
        this.A0I = str6;
        this.A0J = list;
        this.A0C = bool;
        if (str2 == null || str2.length() == 0 || !new File(str2).exists()) {
            this.A0G = this.A0F;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115525Km) {
                C115525Km c115525Km = (C115525Km) obj;
                if (!C14360o3.A0K(this.A0F, c115525Km.A0F) || !C14360o3.A0K(this.A0G, c115525Km.A0G) || !C14360o3.A0K(this.A0E, c115525Km.A0E) || this.A0A != c115525Km.A0A || this.A09 != c115525Km.A09 || this.A05 != c115525Km.A05 || this.A01 != c115525Km.A01 || this.A07 != c115525Km.A07 || !C14360o3.A0K(this.A0D, c115525Km.A0D) || this.A00 != c115525Km.A00 || this.A08 != c115525Km.A08 || this.A04 != c115525Km.A04 || this.A03 != c115525Km.A03 || this.A02 != c115525Km.A02 || !C14360o3.A0K(this.A0H, c115525Km.A0H) || this.A06 != c115525Km.A06 || !C14360o3.A0K(this.A0B, c115525Km.A0B) || this.A0K != c115525Km.A0K || !C14360o3.A0K(this.A0I, c115525Km.A0I) || !C14360o3.A0K(this.A0J, c115525Km.A0J) || !C14360o3.A0K(this.A0C, c115525Km.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceVideo(filePath=");
        sb.append(this.A0F);
        sb.append(", originalFilePath=");
        sb.append(this.A0G);
        sb.append(", coverThumbnailPath=");
        sb.append(this.A0E);
        sb.append(", dateTakenMs=");
        sb.append(this.A0A);
        sb.append(MSV.A00(138));
        sb.append(this.A09);
        sb.append(", height=");
        sb.append(this.A05);
        sb.append(", colorTransfer=");
        sb.append(this.A01);
        sb.append(", orientation=");
        sb.append(this.A07);
        sb.append(", cameraPosition=");
        sb.append(this.A0D);
        sb.append(", cameraId=");
        sb.append(this.A00);
        sb.append(", origin=");
        sb.append(this.A08);
        sb.append(", durationInMs=");
        sb.append(this.A04);
        sb.append(", correctedStartTimeMs=");
        sb.append(this.A03);
        sb.append(", correctedEndTimeMs=");
        sb.append(this.A02);
        sb.append(", originalMediaFolder=");
        sb.append(this.A0H);
        sb.append(", inFlightVideoCalculatedDurationMs=");
        sb.append(this.A06);
        sb.append(", mediaUploadMetadata=");
        sb.append(this.A0B);
        sb.append(", wasPhoto=");
        sb.append(this.A0K);
        sb.append(", sourcePhotoFilePath=");
        sb.append(this.A0I);
        sb.append(", externalMediaSegmentInfo=");
        sb.append(this.A0J);
        sb.append(", isRemix=");
        sb.append(this.A0C);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.A0F.hashCode() * 31;
        String str = this.A0G;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode7 + hashCode) * 31;
        String str2 = this.A0E;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        long j = this.A0A;
        int i3 = (((((((((((i2 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A09) * 31) + this.A05) * 31) + this.A01) * 31) + this.A07) * 31;
        String str3 = this.A0D;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (((((((((((i3 + hashCode3) * 31) + this.A00) * 31) + this.A08) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31;
        String str4 = this.A0H;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int hashCode8 = (((((i4 + hashCode4) * 31) + this.A06) * 31) + this.A0B.hashCode()) * 31;
        int i5 = 1237;
        if (this.A0K) {
            i5 = 1231;
        }
        int i6 = (hashCode8 + i5) * 31;
        String str5 = this.A0I;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        List list = this.A0J;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        Boolean bool = this.A0C;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i8 + i;
    }

    public C115525Km() {
        this(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), null, "", null, null, null, null, null, null, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0L, false);
    }
}
