package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.8A9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8A9 extends C0T6 {
    public final ACRType A00;
    public final AudioOverlayTrack A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public /* synthetic */ C8A9(ACRType aCRType, AudioOverlayTrack audioOverlayTrack, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        boolean z4 = (i & 2) != 0;
        str = (i & 4) != 0 ? null : str;
        aCRType = (i & 8) != 0 ? null : aCRType;
        AudioOverlayTrack audioOverlayTrack2 = (i & 16) == 0 ? audioOverlayTrack : null;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        boolean z5 = (i & 128) == 0 ? z3 : false;
        list2 = (i & 256) != 0 ? C16930sl.A00 : list2;
        Integer num = (i & 512) != 0 ? 30000 : null;
        this.A04 = list;
        this.A07 = z4;
        this.A03 = str;
        this.A00 = aCRType;
        this.A01 = audioOverlayTrack2;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = z5;
        this.A05 = list2;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8A9) {
                C8A9 c8a9 = (C8A9) obj;
                if (!C14360o3.A0K(this.A04, c8a9.A04) || this.A07 != c8a9.A07 || !C14360o3.A0K(this.A03, c8a9.A03) || this.A00 != c8a9.A00 || !C14360o3.A0K(this.A01, c8a9.A01) || this.A09 != c8a9.A09 || this.A08 != c8a9.A08 || this.A06 != c8a9.A06 || !C14360o3.A0K(this.A05, c8a9.A05) || !C14360o3.A0K(this.A02, c8a9.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.A04.hashCode() * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = (hashCode5 + i) * 31;
        String str = this.A03;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        ACRType aCRType = this.A00;
        if (aCRType == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aCRType.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        AudioOverlayTrack audioOverlayTrack = this.A01;
        if (audioOverlayTrack == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = audioOverlayTrack.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A06) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        List list = this.A05;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Integer num = this.A02;
        if (num != null) {
            i3 = num.hashCode();
        }
        return i13 + i3;
    }
}
