package X;

import java.util.List;

/* renamed from: X.MwJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51875MwJ extends C0T6 implements InterfaceC57855PlL {
    public final EnumC53143New A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51875MwJ) {
                C51875MwJ c51875MwJ = (C51875MwJ) obj;
                if (this.A00 != c51875MwJ.A00 || !C14360o3.A0K(this.A02, c51875MwJ.A02) || !C14360o3.A0K(this.A01, c51875MwJ.A01) || this.A05 != c51875MwJ.A05 || this.A03 != c51875MwJ.A03 || this.A04 != c51875MwJ.A04 || this.A06 != c51875MwJ.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)))))));
    }

    public C51875MwJ(EnumC53143New enumC53143New, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A13(enumC53143New, list, str);
        this.A00 = enumC53143New;
        this.A02 = list;
        this.A01 = str;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A06 = z4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallOutgoingStateModel(state=");
        A1C.append(this.A00);
        A1C.append(", callTargetAvatarUrls=");
        A1C.append(this.A02);
        A1C.append(", callTarget=");
        A1C.append(this.A01);
        A1C.append(", isGroupCall=");
        A1C.append(this.A05);
        A1C.append(", isAudioCall=");
        A1C.append(this.A03);
        A1C.append(", isCreatorAIEmbodiment=");
        A1C.append(this.A04);
        A1C.append(", isUserCreatedAIEmbodiment=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }
}
