package X;

import java.util.Map;

/* renamed from: X.MwN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51879MwN extends C0T6 implements InterfaceC57855PlL {
    public final long A00;
    public final C51876MwK A01;
    public final Map A02;
    public final Map A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51879MwN) {
                C51879MwN c51879MwN = (C51879MwN) obj;
                if (!C14360o3.A0K(this.A01, c51879MwN.A01) || !C14360o3.A0K(this.A03, c51879MwN.A03) || this.A0G != c51879MwN.A0G || this.A05 != c51879MwN.A05 || this.A06 != c51879MwN.A06 || this.A0E != c51879MwN.A0E || this.A0B != c51879MwN.A0B || this.A0C != c51879MwN.A0C || this.A08 != c51879MwN.A08 || this.A00 != c51879MwN.A00 || this.A09 != c51879MwN.A09 || this.A04 != c51879MwN.A04 || this.A07 != c51879MwN.A07 || !C14360o3.A0K(this.A02, c51879MwN.A02) || this.A0F != c51879MwN.A0F || this.A0A != c51879MwN.A0A || this.A0D != c51879MwN.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0D, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0F, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A09, AbstractC25236BEt.A01(this.A00, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A0G, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01)))))))))))))))));
    }

    public C51879MwN(C51876MwK c51876MwK, Map map, Map map2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A01 = c51876MwK;
        this.A03 = map;
        this.A0G = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A0E = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A08 = z7;
        this.A00 = j;
        this.A09 = z8;
        this.A04 = z9;
        this.A07 = z10;
        this.A02 = map2;
        this.A0F = z11;
        this.A0A = z12;
        this.A0D = z13;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallParticipantsModel(self=");
        A1C.append(this.A01);
        A1C.append(", remoteParticipants=");
        A1C.append(this.A03);
        A1C.append(", useFloatingSelfView=");
        A1C.append(this.A0G);
        A1C.append(", detectBadFrames=");
        A1C.append(this.A05);
        A1C.append(", hasInteropUsers=");
        A1C.append(this.A06);
        A1C.append(", showParticipantsView=");
        A1C.append(this.A0E);
        A1C.append(", isE2eeEncrypted=");
        A1C.append(this.A0B);
        A1C.append(", isUserAloneInRoom=");
        A1C.append(this.A0C);
        A1C.append(", isAvatarApplied=");
        A1C.append(this.A08);
        A1C.append(", reconnectionCount=");
        A1C.append(this.A00);
        A1C.append(", isCallOnGoing=");
        A1C.append(this.A09);
        A1C.append(", areUserIdsEimu=");
        A1C.append(this.A04);
        A1C.append(", hasVerifiedUser=");
        A1C.append(this.A07);
        A1C.append(", participantInfoMap=");
        A1C.append(this.A02);
        A1C.append(", useFloatingParticipantsView=");
        A1C.append(this.A0F);
        A1C.append(", isCreatorAIEmbodiment=");
        A1C.append(this.A0A);
        A1C.append(", isUserCreatedAIEmbodiment=");
        return AbstractC25236BEt.A0a(A1C, this.A0D);
    }
}
