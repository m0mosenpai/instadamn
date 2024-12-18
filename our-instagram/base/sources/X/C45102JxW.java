package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.JxW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45102JxW extends C0T6 {
    public final int A00;
    public final NoteAudience A01;
    public final C45044JwZ A02;
    public final boolean A03;
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
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45102JxW) {
                C45102JxW c45102JxW = (C45102JxW) obj;
                if (this.A08 != c45102JxW.A08 || this.A09 != c45102JxW.A09 || this.A0E != c45102JxW.A0E || this.A0H != c45102JxW.A0H || this.A0F != c45102JxW.A0F || this.A0D != c45102JxW.A0D || this.A00 != c45102JxW.A00 || this.A07 != c45102JxW.A07 || this.A0A != c45102JxW.A0A || this.A0C != c45102JxW.A0C || this.A0G != c45102JxW.A0G || this.A04 != c45102JxW.A04 || this.A06 != c45102JxW.A06 || this.A05 != c45102JxW.A05 || this.A03 != c45102JxW.A03 || this.A01 != c45102JxW.A01 || this.A0B != c45102JxW.A0B || !C14360o3.A0K(this.A02, c45102JxW.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, (AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A09, AbstractC25225BEi.A08(this.A08)))))) + this.A00) * 31)))))))))) + AbstractC167017dG.A0M(this.A02);
    }

    public C45102JxW(NoteAudience noteAudience, C45044JwZ c45044JwZ, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.A08 = z;
        this.A09 = z2;
        this.A0E = z3;
        this.A0H = z4;
        this.A0F = z5;
        this.A0D = z6;
        this.A00 = i;
        this.A07 = z7;
        this.A0A = z8;
        this.A0C = z9;
        this.A0G = z10;
        this.A04 = z11;
        this.A06 = z12;
        this.A05 = z13;
        this.A03 = z14;
        this.A01 = noteAudience;
        this.A0B = z15;
        this.A02 = c45044JwZ;
    }

    public C45102JxW() {
        this(NoteAudience.A07, null, 0, true, false, false, true, false, false, true, false, false, false, true, false, true, false, false);
    }
}
