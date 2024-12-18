package X;

import java.util.List;

/* renamed from: X.Mrx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51666Mrx extends C0T6 {
    public final EnumC46148Kbm A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51666Mrx) {
                C51666Mrx c51666Mrx = (C51666Mrx) obj;
                if (!C14360o3.A0K(this.A01, c51666Mrx.A01) || this.A04 != c51666Mrx.A04 || this.A02 != c51666Mrx.A02 || this.A03 != c51666Mrx.A03 || this.A00 != c51666Mrx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0G(this.A01)))));
    }

    public C51666Mrx(EnumC46148Kbm enumC46148Kbm, List list, boolean z, boolean z2, boolean z3) {
        this.A01 = list;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = enumC46148Kbm;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(audioControlBarItem=");
        A1C.append(this.A01);
        A1C.append(", hasVoiceover=");
        A1C.append(this.A04);
        A1C.append(", hasSoundEffects=");
        A1C.append(this.A02);
        A1C.append(", hasSticker=");
        A1C.append(this.A03);
        A1C.append(", canAddAudioTrackStatus=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
