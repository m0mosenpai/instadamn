package X;

import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6C9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6C9 extends C0T6 implements C6CA {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass689 A04;
    public final NoteBackgroundColor A05;
    public final NoteCustomThemeImpl A06;
    public final AnonymousClass688 A07;
    public final NoteFontStyle A08;
    public final C68B A09;
    public final C67s A0A;
    public final C68D A0B;
    public final User A0C;
    public final User A0D;
    public final Boolean A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6C9) {
                C6C9 c6c9 = (C6C9) obj;
                if (this.A00 != c6c9.A00 || !C14360o3.A0K(this.A0L, c6c9.A0L) || !C14360o3.A0K(this.A0F, c6c9.A0F) || this.A05 != c6c9.A05 || this.A0O != c6c9.A0O || !C14360o3.A0K(this.A04, c6c9.A04) || this.A02 != c6c9.A02 || !C14360o3.A0K(this.A06, c6c9.A06) || !C14360o3.A0K(this.A0M, c6c9.A0M) || this.A03 != c6c9.A03 || this.A08 != c6c9.A08 || !C14360o3.A0K(this.A0G, c6c9.A0G) || this.A0P != c6c9.A0P || !C14360o3.A0K(this.A0H, c6c9.A0H) || this.A0Q != c6c9.A0Q || this.A0R != c6c9.A0R || !C14360o3.A0K(this.A0A, c6c9.A0A) || this.A01 != c6c9.A01 || !C14360o3.A0K(this.A07, c6c9.A07) || !C14360o3.A0K(this.A0N, c6c9.A0N) || !C14360o3.A0K(this.A09, c6c9.A09) || !C14360o3.A0K(this.A0B, c6c9.A0B) || !C14360o3.A0K(this.A0C, c6c9.A0C) || !C14360o3.A0K(this.A0I, c6c9.A0I) || !C14360o3.A0K(this.A0J, c6c9.A0J) || !C14360o3.A0K(this.A0E, c6c9.A0E) || !C14360o3.A0K(this.A0D, c6c9.A0D) || !C14360o3.A0K(this.A0K, c6c9.A0K)) {
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
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int i = this.A00 * 31;
        List list = this.A0L;
        int i2 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num = this.A0F;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode13 = (((i3 + hashCode2) * 31) + this.A05.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0O) {
            i4 = 1231;
        }
        int i5 = (hashCode13 + i4) * 31;
        AnonymousClass689 anonymousClass689 = this.A04;
        if (anonymousClass689 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = anonymousClass689.hashCode();
        }
        long j = this.A02;
        int i6 = (((i5 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        NoteCustomThemeImpl noteCustomThemeImpl = this.A06;
        if (noteCustomThemeImpl == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = noteCustomThemeImpl.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        List list2 = this.A0M;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        long j2 = this.A03;
        int hashCode14 = (((((i7 + hashCode5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A08.hashCode()) * 31;
        String str = this.A0G;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i8 = (hashCode14 + hashCode6) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int hashCode15 = (((i8 + i9) * 31) + this.A0H.hashCode()) * 31;
        int i10 = 1237;
        if (this.A0Q) {
            i10 = 1231;
        }
        int i11 = (hashCode15 + i10) * 31;
        int i12 = 1237;
        if (this.A0R) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        C67s c67s = this.A0A;
        if (c67s == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c67s.hashCode();
        }
        int i14 = (((i13 + hashCode7) * 31) + this.A01) * 31;
        AnonymousClass688 anonymousClass688 = this.A07;
        if (anonymousClass688 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = anonymousClass688.hashCode();
        }
        int hashCode16 = (((i14 + hashCode8) * 31) + this.A0N.hashCode()) * 31;
        C68B c68b = this.A09;
        if (c68b == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = c68b.hashCode();
        }
        int i15 = (hashCode16 + hashCode9) * 31;
        C68D c68d = this.A0B;
        if (c68d == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c68d.hashCode();
        }
        int i16 = (i15 + hashCode10) * 31;
        User user = this.A0C;
        if (user == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = user.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str2.hashCode();
        }
        int hashCode17 = (((i17 + hashCode12) * 31) + this.A0J.hashCode()) * 31;
        Boolean bool = this.A0E;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((((hashCode17 + i2) * 31) + this.A0D.hashCode()) * 31) + this.A0K.hashCode();
    }

    public C6C9(AnonymousClass689 anonymousClass689, NoteBackgroundColor noteBackgroundColor, NoteCustomThemeImpl noteCustomThemeImpl, AnonymousClass688 anonymousClass688, NoteFontStyle noteFontStyle, C68B c68b, C67s c67s, C68D c68d, User user, User user2, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(noteBackgroundColor, 4);
        C14360o3.A0B(noteFontStyle, 11);
        C14360o3.A0B(str2, 14);
        C14360o3.A0B(list3, 20);
        C14360o3.A0B(str4, 25);
        C14360o3.A0B(user2, 27);
        C14360o3.A0B(str5, 28);
        this.A00 = i;
        this.A0L = list;
        this.A0F = num;
        this.A05 = noteBackgroundColor;
        this.A0O = z;
        this.A04 = anonymousClass689;
        this.A02 = j;
        this.A06 = noteCustomThemeImpl;
        this.A0M = list2;
        this.A03 = j2;
        this.A08 = noteFontStyle;
        this.A0G = str;
        this.A0P = z2;
        this.A0H = str2;
        this.A0Q = z3;
        this.A0R = z4;
        this.A0A = c67s;
        this.A01 = i2;
        this.A07 = anonymousClass688;
        this.A0N = list3;
        this.A09 = c68b;
        this.A0B = c68d;
        this.A0C = user;
        this.A0I = str3;
        this.A0J = str4;
        this.A0E = bool;
        this.A0D = user2;
        this.A0K = str5;
    }
}
