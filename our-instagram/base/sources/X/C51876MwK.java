package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MwK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51876MwK extends C0T6 implements InterfaceC57855PlL {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51876MwK) {
                C51876MwK c51876MwK = (C51876MwK) obj;
                if (!C14360o3.A0K(this.A02, c51876MwK.A02) || !C14360o3.A0K(this.A03, c51876MwK.A03) || !C14360o3.A0K(this.A01, c51876MwK.A01) || this.A04 != c51876MwK.A04 || this.A07 != c51876MwK.A07 || !C14360o3.A0K(this.A00, c51876MwK.A00) || this.A05 != c51876MwK.A05 || this.A06 != c51876MwK.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))))))));
    }

    public C51876MwK(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(imageUrl, 6);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A07 = z2;
        this.A00 = imageUrl;
        this.A05 = z3;
        this.A06 = z4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallParticipant(userId=");
        A1C.append(this.A02);
        A1C.append(", username=");
        A1C.append(this.A03);
        A1C.append(", displayName=");
        A1C.append(this.A01);
        A1C.append(", isAudioOn=");
        A1C.append(this.A04);
        A1C.append(", isVideoOn=");
        A1C.append(this.A07);
        A1C.append(", avatarUrl=");
        A1C.append(this.A00);
        A1C.append(", isDominantSpeaker=");
        A1C.append(this.A05);
        A1C.append(", isSharingScreen=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }
}
