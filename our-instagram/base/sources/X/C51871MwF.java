package X;

import java.util.List;

/* renamed from: X.MwF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51871MwF extends C0T6 implements InterfaceC57855PlL {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51871MwF) {
                C51871MwF c51871MwF = (C51871MwF) obj;
                if (!C14360o3.A0K(this.A00, c51871MwF.A00) || this.A01 != c51871MwF.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC53644Nnp.A00();
    }

    public C51871MwF(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallParticipantsStateModel(participantsState=");
        A1C.append(this.A00);
        A1C.append(", isCallExpanded=");
        A1C.append(this.A01);
        A1C.append(", canShowParticipantStates=");
        return AbstractC25236BEt.A0a(A1C, false);
    }
}
