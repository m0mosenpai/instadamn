package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.MwM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51878MwM extends C0T6 implements InterfaceC57855PlL {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51878MwM) {
                C51878MwM c51878MwM = (C51878MwM) obj;
                if (this.A06 != c51878MwM.A06 || this.A02 != c51878MwM.A02 || !C14360o3.A0K(this.A04, c51878MwM.A04) || this.A05 != c51878MwM.A05 || this.A07 != c51878MwM.A07 || this.A0B != c51878MwM.A0B || this.A0A != c51878MwM.A0A || this.A00 != c51878MwM.A00 || !C14360o3.A0K(this.A03, c51878MwM.A03) || this.A08 != c51878MwM.A08 || !C14360o3.A0K(this.A01, c51878MwM.A01) || this.A09 != c51878MwM.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A08 = AbstractC25225BEi.A08(this.A06);
        Integer num = this.A02;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, AbstractC54171Nx7.A00(num));
        }
        return AbstractC166987dD.A0K(this.A09, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0K(this.A03, AbstractC25236BEt.A01(this.A00, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A04, (A08 + A0C) * 31))))))))));
    }

    public C51878MwM(ImageUrl imageUrl, Integer num, String str, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A06 = z;
        this.A02 = num;
        this.A04 = list;
        this.A05 = z2;
        this.A07 = z3;
        this.A0B = z4;
        this.A0A = z5;
        this.A00 = j;
        this.A03 = str;
        this.A08 = z6;
        this.A01 = imageUrl;
        this.A09 = z7;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallEndStateModel(isCallEnded=");
        A1C.append(this.A06);
        A1C.append(", endReason=");
        Integer num = this.A02;
        if (num != null) {
            str = AbstractC54171Nx7.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", endScreenAvatarUrls=");
        A1C.append(this.A04);
        A1C.append(", isAudioCall=");
        A1C.append(this.A05);
        A1C.append(", isGroupCall=");
        A1C.append(this.A07);
        A1C.append(", wasConnected=");
        A1C.append(this.A0B);
        A1C.append(", wasReconnecting=");
        A1C.append(this.A0A);
        A1C.append(", inCallDurationMs=");
        A1C.append(this.A00);
        A1C.append(", callTargetName=");
        A1C.append(this.A03);
        A1C.append(", requestUserFeedback=");
        A1C.append(this.A08);
        A1C.append(", ownAvatarUrl=");
        A1C.append(this.A01);
        A1C.append(", videoParticipantWasEverPresent=");
        return AbstractC25236BEt.A0a(A1C, this.A09);
    }
}
