package X;

import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* renamed from: X.Ms9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51678Ms9 extends C0T6 {
    public final int A00 = 1910377639;
    public final InterfaceC58275PsT A01;
    public final EnumC53137Neq A02;
    public final RtcConnectionEntity.RtcCallConnectionEntity A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final Integer A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51678Ms9) {
                C51678Ms9 c51678Ms9 = (C51678Ms9) obj;
                if (!C14360o3.A0K(this.A08, c51678Ms9.A08) || this.A02 != c51678Ms9.A02 || !C14360o3.A0K(this.A06, c51678Ms9.A06) || !C14360o3.A0K(this.A04, c51678Ms9.A04) || this.A09 != c51678Ms9.A09 || this.A0A != c51678Ms9.A0A || !C14360o3.A0K(this.A05, c51678Ms9.A05) || !C14360o3.A0K(this.A07, c51678Ms9.A07) || !C14360o3.A0K(this.A03, c51678Ms9.A03) || this.A00 != c51678Ms9.A00 || this.A0B != c51678Ms9.A0B || !C14360o3.A0K(this.A01, c51678Ms9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0K(this.A05, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A08))) + AbstractC167017dG.A0O(this.A04)) * 31))) + AbstractC167017dG.A0O(this.A07)) * 31) + this.A00) * 31) + AbstractC54901OPx.A00(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C51678Ms9(InterfaceC58275PsT interfaceC58275PsT, EnumC53137Neq enumC53137Neq, RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, Integer num, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.A08 = str;
        this.A02 = enumC53137Neq;
        this.A06 = str2;
        this.A04 = str3;
        this.A09 = z;
        this.A0A = z2;
        this.A05 = str4;
        this.A07 = str5;
        this.A03 = rtcCallConnectionEntity;
        this.A0B = num;
        this.A01 = interfaceC58275PsT;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallIncomingParams(threadId=");
        A1C.append(this.A08);
        A1C.append(", e2eeCallType=");
        A1C.append(this.A02);
        A1C.append(", callerName=");
        A1C.append(this.A06);
        A1C.append(", callTarget=");
        A1C.append(this.A04);
        A1C.append(", isAudioCall=");
        A1C.append(this.A09);
        A1C.append(", isGroupCall=");
        A1C.append(this.A0A);
        A1C.append(", callerAvatarUrl=");
        A1C.append(this.A05);
        A1C.append(", notificationTag=");
        A1C.append(this.A07);
        A1C.append(", connectionEntity=");
        A1C.append(this.A03);
        A1C.append(", notificationId=");
        A1C.append(this.A00);
        A1C.append(", callType=");
        A1C.append(AbstractC54901OPx.A01(this.A0B));
        A1C.append(", trace=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
