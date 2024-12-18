package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7BR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BR extends C0T6 implements InterfaceC129555tK {
    public final int A00 = 12;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C9BW A05;
    public final C7P3 A06;
    public final C160787Im A07;
    public final MessageIdentifier A08;
    public final CharSequence A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7BR) {
                C7BR c7br = (C7BR) obj;
                if (!C14360o3.A0K(this.A08, c7br.A08) || !C14360o3.A0K(this.A09, c7br.A09) || !C14360o3.A0K(this.A0G, c7br.A0G) || this.A03 != c7br.A03 || this.A01 != c7br.A01 || !C14360o3.A0K(this.A0A, c7br.A0A) || this.A00 != c7br.A00 || this.A04 != c7br.A04 || this.A02 != c7br.A02 || !C14360o3.A0K(this.A05, c7br.A05) || this.A06 != c7br.A06 || this.A0B != c7br.A0B || this.A0K != c7br.A0K || !C14360o3.A0K(this.A0C, c7br.A0C) || !C14360o3.A0K(this.A0H, c7br.A0H) || !C14360o3.A0K(this.A0D, c7br.A0D) || !C14360o3.A0K(this.A0E, c7br.A0E) || !C14360o3.A0K(this.A0F, c7br.A0F) || this.A0I != c7br.A0I || !C14360o3.A0K(this.A07, c7br.A07) || this.A0J != c7br.A0J) {
                }
            }
            return false;
        }
        return true;
    }

    public C7BR(C9BW c9bw, C7P3 c7p3, C160787Im c160787Im, MessageIdentifier messageIdentifier, CharSequence charSequence, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, List list, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A08 = messageIdentifier;
        this.A09 = charSequence;
        this.A0G = str;
        this.A03 = i;
        this.A01 = i2;
        this.A0A = num;
        this.A04 = i3;
        this.A02 = i4;
        this.A05 = c9bw;
        this.A06 = c7p3;
        this.A0B = num2;
        this.A0K = z;
        this.A0C = num3;
        this.A0H = list;
        this.A0D = str2;
        this.A0E = str3;
        this.A0F = str4;
        this.A0I = z2;
        this.A07 = c160787Im;
        this.A0J = z3;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        MessageIdentifier messageIdentifier = this.A08;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        CharSequence charSequence = this.A09;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A0G;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (((((i3 + hashCode3) * 31) + this.A03) * 31) + this.A01) * 31;
        Integer num = this.A0A;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i5 = (((((((i4 + hashCode4) * 31) + this.A00) * 31) + this.A04) * 31) + this.A02) * 31 * 31;
        C9BW c9bw = this.A05;
        if (c9bw == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c9bw.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        C7P3 c7p3 = this.A06;
        if (c7p3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c7p3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        int intValue = this.A0B.intValue();
        switch (intValue) {
            case 1:
                str = "FOOTER_LABEL_TYPE_NUX";
                break;
            case 2:
                str = "FOOTER_LABEL_TYPE_TRANSLATION";
                break;
            case 3:
                str = "FOOTER_LABEL_TYPE_ODN";
                break;
            case 4:
                str = "FOOTER_LABEL_TYPE_POLICY_VIOLATION";
                break;
            case 5:
                str = "FOOTER_LABEL_TYPE_MUTED_WORDS";
                break;
            case 6:
                str = "FOOTER_LABEL_TYPE_MEDIA_ARCHIVE";
                break;
            case 7:
                str = "FOOTER_LABEL_TYPE_SEND_SILENTLY";
                break;
            default:
                str = "FOOTER_LABEL_TYPE_NONE";
                break;
        }
        int hashCode12 = (i7 + str.hashCode() + intValue) * 31;
        int i8 = 1237;
        if (this.A0K) {
            i8 = 1231;
        }
        int i9 = (hashCode12 + i8) * 31;
        Integer num2 = this.A0C;
        if (num2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num2.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        List list = this.A0H;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str3 = this.A0D;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str4 = this.A0E;
        if (str4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str4.hashCode();
        }
        int i13 = (i12 + hashCode10) * 31;
        String str5 = this.A0F;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i14 = (i13 + hashCode11) * 31;
        int i15 = 1237;
        if (this.A0I) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        C160787Im c160787Im = this.A07;
        if (c160787Im != null) {
            i = c160787Im.hashCode();
        }
        int i17 = (i16 + i) * 31;
        int i18 = 1237;
        if (this.A0J) {
            i18 = 1231;
        }
        return i17 + i18;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
