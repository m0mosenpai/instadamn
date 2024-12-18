package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

/* renamed from: X.7M0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7M0 extends C4F4 implements C7VC {
    public boolean A00;
    public final int A01;
    public final C206269Bj A02;
    public final MessagingUser A03;
    public final EnumC92794Ds A04;
    public final InterfaceC83733oI A05;
    public final Boolean A06;
    public final Boolean A07;
    public final CharSequence A08;
    public final Integer A09;
    public final Integer A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final List A0L;
    public final C09530e4 A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final int A0a = 55;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7M0) {
                C7M0 c7m0 = (C7M0) obj;
                if (!C14360o3.A0K(this.A0J, c7m0.A0J) || this.A0Z != c7m0.A0Z || this.A0S != c7m0.A0S || this.A0T != c7m0.A0T || !C14360o3.A0K(this.A0M, c7m0.A0M) || !C14360o3.A0K(this.A0K, c7m0.A0K) || this.A0Y != c7m0.A0Y || !C14360o3.A0K(this.A08, c7m0.A08) || !C14360o3.A0K(this.A0C, c7m0.A0C) || !C14360o3.A0K(this.A03, c7m0.A03) || this.A0V != c7m0.A0V || !C14360o3.A0K(this.A0E, c7m0.A0E) || !C14360o3.A0K(this.A0F, c7m0.A0F) || !C14360o3.A0K(this.A0G, c7m0.A0G) || !C14360o3.A0K(this.A0H, c7m0.A0H) || !C14360o3.A0K(this.A0I, c7m0.A0I) || this.A0P != c7m0.A0P || this.A0R != c7m0.A0R || !C14360o3.A0K(this.A05, c7m0.A05) || this.A04 != c7m0.A04 || this.A0U != c7m0.A0U || !C14360o3.A0K(this.A0L, c7m0.A0L) || !C14360o3.A0K(this.A0D, c7m0.A0D) || this.A00 != c7m0.A00 || this.A01 != c7m0.A01 || this.A0W != c7m0.A0W || !C14360o3.A0K(this.A02, c7m0.A02) || this.A0A != c7m0.A0A || this.A0Q != c7m0.A0Q || this.A0O != c7m0.A0O || this.A0X != c7m0.A0X || this.A0N != c7m0.A0N || !C14360o3.A0K(this.A06, c7m0.A06) || this.A09 != c7m0.A09 || !C14360o3.A0K(this.A0B, c7m0.A0B) || !C14360o3.A0K(this.A07, c7m0.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.C7VC
    public final int getType() {
        return this.A0a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
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
        String str;
        int hashCode13;
        int intValue;
        int hashCode14;
        int hashCode15 = this.A0J.hashCode() * 31;
        int i = 1237;
        if (this.A0Z) {
            i = 1231;
        }
        int i2 = (hashCode15 + i) * 31;
        int i3 = 1237;
        if (this.A0S) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0T) {
            i5 = 1231;
        }
        int hashCode16 = (((i4 + i5) * 31) + this.A0M.hashCode()) * 31;
        List list = this.A0K;
        int i6 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i7 = (hashCode16 + hashCode) * 31;
        int i8 = 1237;
        if (this.A0Y) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        CharSequence charSequence = this.A08;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.A0C;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        MessagingUser messagingUser = this.A03;
        if (messagingUser == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = messagingUser.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        int i13 = 1237;
        if (this.A0V) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        String str3 = this.A0E;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str4 = this.A0F;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str5 = this.A0G;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str6 = this.A0H;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str7 = this.A0I;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        int i20 = 1237;
        if (this.A0P) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0R) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        InterfaceC83733oI interfaceC83733oI = this.A05;
        if (interfaceC83733oI == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = interfaceC83733oI.hashCode();
        }
        int hashCode17 = (((i23 + hashCode10) * 31) + this.A04.hashCode()) * 31;
        int i24 = 1237;
        if (this.A0U) {
            i24 = 1231;
        }
        int hashCode18 = (((hashCode17 + i24) * 31) + this.A0L.hashCode()) * 31;
        String str8 = this.A0D;
        if (str8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str8.hashCode();
        }
        int i25 = (hashCode18 + hashCode11) * 31;
        int i26 = 1237;
        if (this.A00) {
            i26 = 1231;
        }
        int i27 = (((i25 + i26) * 31) + this.A01) * 31;
        int i28 = 1237;
        if (this.A0W) {
            i28 = 1231;
        }
        int i29 = (i27 + i28) * 31;
        C206269Bj c206269Bj = this.A02;
        if (c206269Bj == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = c206269Bj.hashCode();
        }
        int i30 = (i29 + hashCode12) * 31;
        int intValue2 = this.A0A.intValue();
        switch (intValue2) {
            case 1:
                str = "SHOW_ORGANIC_DISCLOSURE";
                break;
            case 2:
                str = "SHOW_CTD_AD_DISCLOSURE";
                break;
            default:
                str = "NO_DISCLOSURE";
                break;
        }
        int hashCode19 = (i30 + str.hashCode() + intValue2) * 31;
        int i31 = 1237;
        if (this.A0Q) {
            i31 = 1231;
        }
        int i32 = (hashCode19 + i31) * 31;
        int i33 = 1237;
        if (this.A0O) {
            i33 = 1231;
        }
        int i34 = (i32 + i33) * 31;
        int i35 = 1237;
        if (this.A0X) {
            i35 = 1231;
        }
        int i36 = (i34 + i35) * 31;
        int i37 = 1237;
        if (this.A0N) {
            i37 = 1231;
        }
        int i38 = (i36 + i37) * 31;
        Boolean bool = this.A06;
        if (bool == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool.hashCode();
        }
        int i39 = (i38 + hashCode13) * 31;
        Integer num = this.A09;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = (-866832233) + num.intValue();
        }
        int i40 = (i39 + intValue) * 31;
        Long l = this.A0B;
        if (l == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l.hashCode();
        }
        int i41 = (i40 + hashCode14) * 31;
        Boolean bool2 = this.A07;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        }
        return i41 + i6;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public C7M0(C206269Bj c206269Bj, MessagingUser messagingUser, EnumC92794Ds enumC92794Ds, InterfaceC83733oI interfaceC83733oI, Boolean bool, Boolean bool2, CharSequence charSequence, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, C09530e4 c09530e4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.A0J = str;
        this.A0Z = z;
        this.A0S = z2;
        this.A0T = z3;
        this.A0M = c09530e4;
        this.A0K = list;
        this.A0Y = z4;
        this.A08 = charSequence;
        this.A0C = str2;
        this.A03 = messagingUser;
        this.A0V = z5;
        this.A0E = str3;
        this.A0F = str4;
        this.A0G = str5;
        this.A0H = str6;
        this.A0I = str7;
        this.A0P = z6;
        this.A0R = z7;
        this.A05 = interfaceC83733oI;
        this.A04 = enumC92794Ds;
        this.A0U = z8;
        this.A0L = list2;
        this.A0D = str8;
        this.A00 = z9;
        this.A01 = i;
        this.A0W = z10;
        this.A02 = c206269Bj;
        this.A0A = num;
        this.A0Q = z11;
        this.A0O = z12;
        this.A0X = z13;
        this.A0N = z14;
        this.A06 = bool;
        this.A09 = num2;
        this.A0B = l;
        this.A07 = bool2;
    }
}
