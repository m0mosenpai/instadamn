package X;

import com.facebook.rsys.mediasync.gen.MediaSyncContent;

/* renamed from: X.MrL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51628MrL extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final MediaSyncContent A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public C51628MrL(MediaSyncContent mediaSyncContent, Integer num, Long l, String str, String str2, int i, int i2, int i3) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A05 = l;
        this.A03 = mediaSyncContent;
        this.A01 = i3;
        this.A07 = str2;
        this.A04 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51628MrL) {
                C51628MrL c51628MrL = (C51628MrL) obj;
                if (this.A00 != c51628MrL.A00 || !C14360o3.A0K(this.A06, c51628MrL.A06) || this.A02 != c51628MrL.A02 || !C14360o3.A0K(this.A05, c51628MrL.A05) || !C14360o3.A0K(this.A03, c51628MrL.A03) || this.A01 != c51628MrL.A01 || !C14360o3.A0K(this.A07, c51628MrL.A07) || !C14360o3.A0K(this.A04, c51628MrL.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AbstractC166997dE.A0K(this.A06, this.A00 * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31 * 31;
    }
}
