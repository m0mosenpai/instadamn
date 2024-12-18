package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MwL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51877MwL extends C0T6 implements InterfaceC57855PlL {
    public final InterfaceC58275PsT A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C51877MwL(InterfaceC58275PsT interfaceC58275PsT, ImageUrl imageUrl, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 3);
        this.A07 = z;
        this.A01 = imageUrl;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A06 = z2;
        this.A00 = interfaceC58275PsT;
        this.A08 = z3;
        this.A05 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51877MwL) {
                C51877MwL c51877MwL = (C51877MwL) obj;
                if (this.A07 != c51877MwL.A07 || !C14360o3.A0K(this.A01, c51877MwL.A01) || !C14360o3.A0K(this.A03, c51877MwL.A03) || !C14360o3.A0K(this.A02, c51877MwL.A02) || !C14360o3.A0K(this.A04, c51877MwL.A04) || this.A06 != c51877MwL.A06 || !C14360o3.A0K(this.A00, c51877MwL.A00) || this.A08 != c51877MwL.A08 || !C14360o3.A0K(this.A05, c51877MwL.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A06, (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC25225BEi.A08(this.A07))) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallIncomingModel(isCallIncoming=");
        A1C.append(this.A07);
        A1C.append(", callerAvatarUrl=");
        A1C.append(this.A01);
        A1C.append(", callerName=");
        A1C.append(this.A03);
        A1C.append(", callTarget=");
        A1C.append(this.A02);
        A1C.append(", igThreadId=");
        A1C.append(this.A04);
        A1C.append(", isAudioCall=");
        A1C.append(this.A06);
        A1C.append(", trace=");
        A1C.append(this.A00);
        A1C.append(", isE2EE=");
        A1C.append(this.A08);
        A1C.append(", localCallId=");
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
