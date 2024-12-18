package X;

import com.instagram.model.rtc.RtcCallKey;
import java.util.List;

/* renamed from: X.MsA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51679MsA extends C0T6 {
    public final EnumC53137Neq A00;
    public final EnumC53138Ner A01;
    public final RtcCallKey A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final Integer A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51679MsA) {
                C51679MsA c51679MsA = (C51679MsA) obj;
                if (!C14360o3.A0K(this.A02, c51679MsA.A02) || !C14360o3.A0K(this.A05, c51679MsA.A05) || this.A00 != c51679MsA.A00 || this.A01 != c51679MsA.A01 || !C14360o3.A0K(this.A03, c51679MsA.A03) || this.A0C != c51679MsA.A0C || this.A0B != c51679MsA.A0B || !C14360o3.A0K(this.A07, c51679MsA.A07) || this.A08 != c51679MsA.A08 || !C14360o3.A0K(this.A04, c51679MsA.A04) || !C14360o3.A0K(this.A06, c51679MsA.A06) || this.A09 != c51679MsA.A09 || !C14360o3.A0K(this.A0A, c51679MsA.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public C51679MsA(EnumC53137Neq enumC53137Neq, EnumC53138Ner enumC53138Ner, RtcCallKey rtcCallKey, Integer num, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str4, 11);
        this.A02 = rtcCallKey;
        this.A05 = str;
        this.A00 = enumC53137Neq;
        this.A01 = enumC53138Ner;
        this.A03 = str2;
        this.A0C = z;
        this.A0B = z2;
        this.A07 = list;
        this.A08 = z3;
        this.A04 = str3;
        this.A06 = str4;
        this.A09 = num;
        this.A0A = str5;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0A, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A07, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, (AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A02)))) + AbstractC167017dG.A0O(this.A03)) * 31)))))) + AbstractC54901OPx.A00(this.A09)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallJoinParams(callKey=");
        A1C.append(this.A02);
        A1C.append(", threadId=");
        A1C.append(this.A05);
        A1C.append(", e2eeCallType=");
        A1C.append(this.A00);
        A1C.append(", e2eeInfraOnlyExpGroup=");
        A1C.append(this.A01);
        A1C.append(", callTarget=");
        A1C.append(this.A03);
        A1C.append(", isGroupCall=");
        A1C.append(this.A0C);
        A1C.append(", isFromIncomingCall=");
        A1C.append(this.A0B);
        A1C.append(", avatarUrls=");
        A1C.append(this.A07);
        A1C.append(", startWithVideo=");
        A1C.append(this.A08);
        A1C.append(", source=");
        A1C.append(this.A04);
        A1C.append(", waterfallId=");
        A1C.append(this.A06);
        A1C.append(", callType=");
        A1C.append(AbstractC54901OPx.A01(this.A09));
        A1C.append(", callerAvatarUrl=");
        return AbstractC25236BEt.A0Y(this.A0A, A1C);
    }
}
