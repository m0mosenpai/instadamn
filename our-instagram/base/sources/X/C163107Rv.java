package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163107Rv extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public final int A01;
    public final long A02;
    public final UserSession A03;
    public final ImageUrl A04;
    public final AnonymousClass988 A05;
    public final AnonymousClass441 A06;
    public final C7IH A07;
    public final C2EY A08;
    public final MessageIdentifier A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final boolean A0G;

    public C163107Rv(UserSession userSession, ImageUrl imageUrl, AnonymousClass988 anonymousClass988, AnonymousClass441 anonymousClass441, C7IH c7ih, C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 6);
        C14360o3.A0B(str4, 10);
        this.A03 = userSession;
        this.A0B = str;
        this.A04 = imageUrl;
        this.A06 = anonymousClass441;
        this.A0A = str2;
        this.A01 = i;
        this.A09 = messageIdentifier;
        this.A0C = str3;
        this.A0F = str4;
        this.A02 = j;
        this.A08 = c2ey;
        this.A0G = z;
        this.A0E = z2;
        this.A00 = false;
        this.A07 = c7ih;
        this.A05 = anonymousClass988;
        this.A0D = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163107Rv) {
                C163107Rv c163107Rv = (C163107Rv) obj;
                if (!C14360o3.A0K(this.A03, c163107Rv.A03) || !C14360o3.A0K(this.A0B, c163107Rv.A0B) || !C14360o3.A0K(this.A04, c163107Rv.A04) || !C14360o3.A0K(this.A06, c163107Rv.A06) || !C14360o3.A0K(this.A0A, c163107Rv.A0A) || this.A01 != c163107Rv.A01 || !C14360o3.A0K(this.A09, c163107Rv.A09) || !C14360o3.A0K(this.A0C, c163107Rv.A0C) || !C14360o3.A0K(this.A0F, c163107Rv.A0F) || this.A02 != c163107Rv.A02 || this.A08 != c163107Rv.A08 || this.A0G != c163107Rv.A0G || this.A0E != c163107Rv.A0E || this.A00 != c163107Rv.A00 || !C14360o3.A0K(this.A07, c163107Rv.A07) || !C14360o3.A0K(this.A05, c163107Rv.A05) || this.A0D != c163107Rv.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A0B;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((this.A03.hashCode() * 31) + this.A0B.hashCode()) * 31;
        ImageUrl imageUrl = this.A04;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        AnonymousClass441 anonymousClass441 = this.A06;
        if (anonymousClass441 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = anonymousClass441.hashCode();
        }
        int hashCode6 = (((((i2 + hashCode2) * 31 * 31) + this.A0A.hashCode()) * 31) + this.A01) * 31;
        MessageIdentifier messageIdentifier = this.A09;
        if (messageIdentifier == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = messageIdentifier.hashCode();
        }
        int i3 = (hashCode6 + hashCode3) * 31;
        String str = this.A0C;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int hashCode7 = (((i3 + hashCode4) * 31) + this.A0F.hashCode()) * 31;
        long j = this.A02;
        int hashCode8 = (((hashCode7 + ((int) (j ^ (j >>> 32)))) * 31) + this.A08.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0G) {
            i4 = 1231;
        }
        int i5 = (hashCode8 + i4) * 31;
        int i6 = 1237;
        if (this.A0E) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A00) {
            i8 = 1231;
        }
        int hashCode9 = (((i7 + i8) * 31) + this.A07.hashCode()) * 31;
        AnonymousClass988 anonymousClass988 = this.A05;
        if (anonymousClass988 != null) {
            i = anonymousClass988.hashCode();
        }
        int i9 = (hashCode9 + i) * 31;
        int i10 = 1237;
        if (this.A0D) {
            i10 = 1231;
        }
        return i9 + i10;
    }
}
