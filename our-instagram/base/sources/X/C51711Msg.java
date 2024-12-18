package X;

/* renamed from: X.Msg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51711Msg extends C0T6 {
    public boolean A00;
    public final long A01;
    public final C5QE A02;
    public final C5QE A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51711Msg) {
                C51711Msg c51711Msg = (C51711Msg) obj;
                if (this.A01 != c51711Msg.A01 || !C14360o3.A0K(this.A03, c51711Msg.A03) || !C14360o3.A0K(this.A02, c51711Msg.A02) || this.A00 != c51711Msg.A00 || this.A04 != c51711Msg.A04 || this.A05 != c51711Msg.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public C51711Msg() {
        this(MVZ.A00(""), MVZ.A00(""), -1L, false, true, false);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC25235BEs.A03(this.A01))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DealItem(id=");
        A1C.append(this.A01);
        A1C.append(", title=");
        A1C.append(this.A03);
        A1C.append(", subtitle=");
        A1C.append(this.A02);
        A1C.append(", isSelected=");
        A1C.append(this.A00);
        A1C.append(", isEnabled=");
        A1C.append(this.A04);
        A1C.append(", showReelsBoostTooltip=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }

    public C51711Msg(C5QE c5qe, C5QE c5qe2, long j, boolean z, boolean z2, boolean z3) {
        this.A01 = j;
        this.A03 = c5qe;
        this.A02 = c5qe2;
        this.A00 = z;
        this.A04 = z2;
        this.A05 = z3;
    }
}
