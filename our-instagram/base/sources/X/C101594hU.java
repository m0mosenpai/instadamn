package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.4hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101594hU extends C0T6 {
    public CreativeConfigIntf A00;
    public final float A01;
    public final long A02;
    public final InterfaceC216113n A03;
    public final ImageUrl A04;
    public final C101634hY A05;
    public final ImageInfo A06;
    public final EnumC40111tc A07;
    public final MusicOverlayStickerModel A08;
    public final C75363a3 A09;
    public final Boolean A0A;
    public final Integer A0B;
    public final Long A0C;
    public final Long A0D;
    public final Long A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public final ExtendedImageUrl A00(Context context) {
        C14360o3.A0B(context, 0);
        C38801rC c38801rC = C38321qM.A0h;
        return C38801rC.A03(this.A04, null, this.A06, this.A0B, AbstractC13880nE.A0A(context));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101594hU) {
                C101594hU c101594hU = (C101594hU) obj;
                if (!C14360o3.A0K(this.A0F, c101594hU.A0F) || !C14360o3.A0K(this.A0C, c101594hU.A0C) || Float.compare(this.A01, c101594hU.A01) != 0 || this.A0B != c101594hU.A0B || !C14360o3.A0K(this.A00, c101594hU.A00) || !C14360o3.A0K(this.A0G, c101594hU.A0G) || this.A02 != c101594hU.A02 || this.A0N != c101594hU.A0N || this.A0O != c101594hU.A0O || this.A0Q != c101594hU.A0Q || this.A0P != c101594hU.A0P || !C14360o3.A0K(this.A0H, c101594hU.A0H) || !C14360o3.A0K(this.A09, c101594hU.A09) || !C14360o3.A0K(this.A06, c101594hU.A06) || !C14360o3.A0K(this.A0I, c101594hU.A0I) || this.A0R != c101594hU.A0R || this.A0S != c101594hU.A0S || this.A0T != c101594hU.A0T || this.A0V != c101594hU.A0V || !C14360o3.A0K(this.A0J, c101594hU.A0J) || this.A07 != c101594hU.A07 || !C14360o3.A0K(this.A0D, c101594hU.A0D) || !C14360o3.A0K(this.A08, c101594hU.A08) || !C14360o3.A0K(this.A0L, c101594hU.A0L) || !C14360o3.A0K(this.A0E, c101594hU.A0E) || !C14360o3.A0K(this.A0M, c101594hU.A0M) || !C14360o3.A0K(this.A04, c101594hU.A04) || !C14360o3.A0K(this.A03, c101594hU.A03) || !C14360o3.A0K(this.A05, c101594hU.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        String str2 = this.A0F;
        int i = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i2 = hashCode * 31;
        Long l = this.A0C;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int floatToIntBits = (((i2 + hashCode2) * 31) + Float.floatToIntBits(this.A01)) * 31;
        Integer num = this.A0B;
        if (num == null) {
            hashCode3 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "RECTANGULAR";
                    break;
                case 2:
                    str = "SQUARE";
                    break;
                default:
                    str = "ANY";
                    break;
            }
            hashCode3 = str.hashCode() + intValue;
        }
        int i3 = (floatToIntBits + hashCode3) * 31;
        CreativeConfigIntf creativeConfigIntf = this.A00;
        if (creativeConfigIntf == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = creativeConfigIntf.hashCode();
        }
        int hashCode14 = (((i3 + hashCode4) * 31) + this.A0G.hashCode()) * 31;
        long j = this.A02;
        int i4 = (hashCode14 + ((int) (j ^ (j >>> 32)))) * 31;
        int i5 = 1237;
        if (this.A0N) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0O) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0Q) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0P) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        String str3 = this.A0H;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int hashCode15 = (((i12 + hashCode5) * 31) + this.A09.hashCode()) * 31;
        ImageInfo imageInfo = this.A06;
        if (imageInfo == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = imageInfo.hashCode();
        }
        int i13 = (hashCode15 + hashCode6) * 31;
        String str4 = this.A0I;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        int i15 = 1237;
        if (this.A0R) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0S) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        int i19 = 1237;
        if (this.A0T) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0V) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        String str5 = this.A0J;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int hashCode16 = (((i22 + hashCode8) * 31) + this.A07.hashCode()) * 31;
        Long l2 = this.A0D;
        if (l2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l2.hashCode();
        }
        int i23 = (hashCode16 + hashCode9) * 31;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A08;
        if (musicOverlayStickerModel == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = musicOverlayStickerModel.hashCode();
        }
        int i24 = (i23 + hashCode10) * 31;
        String str6 = this.A0L;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int i25 = (i24 + hashCode11) * 31;
        Long l3 = this.A0E;
        if (l3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l3.hashCode();
        }
        int hashCode17 = (((i25 + hashCode12) * 31) + this.A0M.hashCode()) * 31;
        ImageUrl imageUrl = this.A04;
        if (imageUrl == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = imageUrl.hashCode();
        }
        int hashCode18 = (((hashCode17 + hashCode13) * 31) + this.A03.hashCode()) * 31;
        C101634hY c101634hY = this.A05;
        if (c101634hY != null) {
            i = c101634hY.hashCode();
        }
        return hashCode18 + i;
    }

    public C101594hU(InterfaceC216113n interfaceC216113n, ImageUrl imageUrl, C101634hY c101634hY, CreativeConfigIntf creativeConfigIntf, ImageInfo imageInfo, EnumC40111tc enumC40111tc, MusicOverlayStickerModel musicOverlayStickerModel, C75363a3 c75363a3, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, List list, float f, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        String str7;
        this.A0F = str;
        this.A0C = l;
        this.A01 = f;
        this.A0B = num;
        this.A00 = creativeConfigIntf;
        this.A0G = str2;
        this.A02 = j;
        this.A0N = z;
        this.A0O = z2;
        this.A0Q = z3;
        this.A0P = z4;
        this.A0H = str3;
        this.A09 = c75363a3;
        this.A06 = imageInfo;
        this.A0I = str4;
        this.A0R = z5;
        this.A0S = z6;
        this.A0T = z7;
        this.A0V = z8;
        this.A0J = str5;
        this.A07 = enumC40111tc;
        this.A0D = l2;
        this.A08 = musicOverlayStickerModel;
        this.A0L = str6;
        this.A0E = l3;
        this.A0M = list;
        this.A04 = imageUrl;
        this.A03 = interfaceC216113n;
        this.A05 = c101634hY;
        if (c101634hY != null) {
            str7 = c101634hY.A00;
        } else {
            str7 = null;
        }
        this.A0K = str7;
        this.A0A = c101634hY != null ? Boolean.valueOf(c101634hY.A01) : null;
        this.A0U = c101634hY != null ? c101634hY.A02 : false;
    }
}
