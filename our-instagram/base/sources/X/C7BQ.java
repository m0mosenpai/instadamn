package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7BQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BQ extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final C7IH A01;
    public final MessageIdentifier A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final UserSession A06;
    public final AnonymousClass988 A07;
    public final String A08;
    public final boolean A09;

    public C7BQ(UserSession userSession, AnonymousClass988 anonymousClass988, C7IH c7ih, MessageIdentifier messageIdentifier, String str, String str2, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 7);
        this.A02 = messageIdentifier;
        this.A08 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = c7ih;
        this.A07 = anonymousClass988;
        this.A06 = userSession;
        this.A09 = z;
        this.A04 = z2;
        boolean z3 = false;
        if (!z && C18U.A06(C06090Tz.A06, userSession, 36320232024842389L) && C18U.A06(C06090Tz.A05, userSession, 36319377327856951L)) {
            z3 = true;
        }
        this.A05 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7BQ) {
                C7BQ c7bq = (C7BQ) obj;
                if (!C14360o3.A0K(this.A02, c7bq.A02) || !C14360o3.A0K(this.A08, c7bq.A08) || !C14360o3.A0K(this.A03, c7bq.A03) || this.A00 != c7bq.A00 || !C14360o3.A0K(this.A01, c7bq.A01) || !C14360o3.A0K(this.A07, c7bq.A07) || !C14360o3.A0K(this.A06, c7bq.A06) || this.A09 != c7bq.A09 || this.A04 != c7bq.A04) {
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
        MessageIdentifier messageIdentifier = this.A02;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A08;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.A00) * 31;
        C7IH c7ih = this.A01;
        if (c7ih == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c7ih.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        AnonymousClass988 anonymousClass988 = this.A07;
        if (anonymousClass988 != null) {
            i = anonymousClass988.hashCode();
        }
        int hashCode5 = (((i5 + i) * 31) + this.A06.hashCode()) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (hashCode5 + i6) * 31;
        int i8 = 1237;
        if (this.A04) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
