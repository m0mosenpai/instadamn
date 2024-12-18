package X;

import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import java.util.List;

/* renamed from: X.Ms8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51677Ms8 extends C0T6 {
    public final EnumC53137Neq A00;
    public final RtcCallSource A01;
    public final RtcStartCoWatchPlaybackArguments A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final Integer A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51677Ms8) {
                C51677Ms8 c51677Ms8 = (C51677Ms8) obj;
                if (!C14360o3.A0K(this.A04, c51677Ms8.A04) || !C14360o3.A0K(this.A05, c51677Ms8.A05) || this.A00 != c51677Ms8.A00 || !C14360o3.A0K(this.A07, c51677Ms8.A07) || !C14360o3.A0K(this.A06, c51677Ms8.A06) || !C14360o3.A0K(this.A03, c51677Ms8.A03) || !C14360o3.A0K(this.A02, c51677Ms8.A02) || this.A09 != c51677Ms8.A09 || this.A08 != c51677Ms8.A08 || !C14360o3.A0K(this.A01, c51677Ms8.A01) || this.A0A != c51677Ms8.A0A || !C14360o3.A0K(this.A0B, c51677Ms8.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0B, (AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04)))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC53644Nnp.A00()) * 31)) + AbstractC54901OPx.A00(this.A0A)) * 31);
    }

    public C51677Ms8(EnumC53137Neq enumC53137Neq, RtcCallSource rtcCallSource, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, Integer num, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = enumC53137Neq;
        this.A07 = list;
        this.A06 = list2;
        this.A03 = str3;
        this.A02 = rtcStartCoWatchPlaybackArguments;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = rtcCallSource;
        this.A0A = num;
        this.A0B = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallCreateParams(threadId=");
        A1C.append(this.A04);
        A1C.append(", threadIdV2=");
        A1C.append(this.A05);
        A1C.append(", e2eeCallType=");
        A1C.append(this.A00);
        A1C.append(", calleeUserIds=");
        A1C.append(this.A07);
        A1C.append(", avatarUrls=");
        A1C.append(this.A06);
        A1C.append(", callTarget=");
        A1C.append(this.A03);
        A1C.append(", coWatchArguments=");
        A1C.append(this.A02);
        A1C.append(", startedInShhMode=");
        A1C.append(this.A09);
        A1C.append(", isDropIn=");
        A1C.append(false);
        A1C.append(", isAudioCall=");
        A1C.append(this.A08);
        A1C.append(", source=");
        A1C.append(this.A01);
        A1C.append(", callType=");
        A1C.append(AbstractC54901OPx.A01(this.A0A));
        A1C.append(", callerAvatarUrl=");
        return AbstractC25236BEt.A0Y(this.A0B, A1C);
    }
}
