package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import java.util.List;

/* renamed from: X.7h4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169307h4 extends C0T6 {
    public final CommentGiphyMediaInfo A00;
    public final C115925Mi A01;
    public final C115935Mj A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final C167987et A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169307h4) {
                C169307h4 c169307h4 = (C169307h4) obj;
                if (!C14360o3.A0K(this.A07, c169307h4.A07) || !C14360o3.A0K(this.A08, c169307h4.A08) || this.A03 != c169307h4.A03 || this.A04 != c169307h4.A04 || !C14360o3.A0K(this.A0B, c169307h4.A0B) || !C14360o3.A0K(this.A00, c169307h4.A00) || !C14360o3.A0K(this.A01, c169307h4.A01) || !C14360o3.A0K(this.A02, c169307h4.A02) || this.A0A != c169307h4.A0A || !C14360o3.A0K(this.A05, c169307h4.A05) || !C14360o3.A0K(this.A06, c169307h4.A06) || this.A09 != c169307h4.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        int hashCode2;
        String str2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str3 = this.A07;
        int i = 0;
        if (str3 == null) {
            hashCode = 0;
        } else {
            hashCode = str3.hashCode();
        }
        int hashCode8 = ((hashCode * 31) + this.A08.hashCode()) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode2 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "BLOCKING";
            } else {
                str = "UNMENTIONABLE";
            }
            hashCode2 = str.hashCode() + intValue;
        }
        int i2 = (hashCode8 + hashCode2) * 31;
        int intValue2 = this.A04.intValue();
        switch (intValue2) {
            case 1:
                str2 = "EDIT";
                break;
            case 2:
                str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str2 = "RETRY";
                break;
        }
        int hashCode9 = (i2 + str2.hashCode() + intValue2) * 31;
        C167987et c167987et = this.A0B;
        if (c167987et == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c167987et.hashCode();
        }
        int i3 = (hashCode9 + hashCode3) * 31;
        CommentGiphyMediaInfo commentGiphyMediaInfo = this.A00;
        if (commentGiphyMediaInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = commentGiphyMediaInfo.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        C115925Mi c115925Mi = this.A01;
        if (c115925Mi == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c115925Mi.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        C115935Mj c115935Mj = this.A02;
        if (c115935Mj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c115935Mj.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        String str4 = this.A05;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        String str5 = this.A06;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i10 = (i9 + i) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        return i10 + i11;
    }

    public C169307h4(CommentGiphyMediaInfo commentGiphyMediaInfo, C167987et c167987et, C115925Mi c115925Mi, C115935Mj c115935Mj, Integer num, Integer num2, String str, String str2, String str3, List list, boolean z, boolean z2) {
        this.A07 = str;
        this.A08 = list;
        this.A03 = num;
        this.A04 = num2;
        this.A0B = c167987et;
        this.A00 = commentGiphyMediaInfo;
        this.A01 = c115925Mi;
        this.A02 = c115935Mj;
        this.A0A = z;
        this.A05 = str2;
        this.A06 = str3;
        this.A09 = z2;
    }
}
