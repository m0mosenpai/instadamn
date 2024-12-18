package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.clips.model.metadata.InteractionUpsellCTAType;

/* renamed from: X.5HR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HR extends C0T6 implements C5HS {
    public final InteractionUpsellCTAType A00;
    public final boolean A01;
    public final boolean A02;
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

    @Override // X.C5HS
    public final C5HR F4P() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5HR) {
                C5HR c5hr = (C5HR) obj;
                if (this.A01 != c5hr.A01 || this.A02 != c5hr.A02 || this.A03 != c5hr.A03 || this.A04 != c5hr.A04 || this.A05 != c5hr.A05 || this.A06 != c5hr.A06 || this.A07 != c5hr.A07 || this.A08 != c5hr.A08 || this.A09 != c5hr.A09 || this.A0A != c5hr.A0A || this.A0B != c5hr.A0B || this.A00 != c5hr.A00 || this.A0C != c5hr.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public C5HR(InteractionUpsellCTAType interactionUpsellCTAType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C14360o3.A0B(interactionUpsellCTAType, 12);
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A05 = z5;
        this.A06 = z6;
        this.A07 = z7;
        this.A08 = z8;
        this.A09 = z9;
        this.A0A = z10;
        this.A0B = z11;
        this.A00 = interactionUpsellCTAType;
        this.A0C = z12;
    }

    @Override // X.C5HS
    public final boolean Axl() {
        return this.A01;
    }

    @Override // X.C5HS
    public final boolean Axm() {
        return this.A02;
    }

    @Override // X.C5HS
    public final boolean Axn() {
        return this.A03;
    }

    @Override // X.C5HS
    public final boolean Axp() {
        return this.A04;
    }

    @Override // X.C5HS
    public final boolean Axq() {
        return this.A05;
    }

    @Override // X.C5HS
    public final boolean Axr() {
        return this.A06;
    }

    @Override // X.C5HS
    public final boolean Axs() {
        return this.A07;
    }

    @Override // X.C5HS
    public final boolean Axu() {
        return this.A08;
    }

    @Override // X.C5HS
    public final boolean Axx() {
        return this.A09;
    }

    @Override // X.C5HS
    public final boolean Axy() {
        return this.A0A;
    }

    @Override // X.C5HS
    public final boolean B1V() {
        return this.A0B;
    }

    @Override // X.C5HS
    public final InteractionUpsellCTAType BIu() {
        return this.A00;
    }

    @Override // X.C5HS
    public final boolean BwN() {
        return this.A0C;
    }

    @Override // X.C5HS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsViewerInteractionSettings", CFS.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A04) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A05) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A06) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A07) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A08) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A09) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        int i19 = 1237;
        if (this.A0A) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0B) {
            i21 = 1231;
        }
        int hashCode = (((i20 + i21) * 31) + this.A00.hashCode()) * 31;
        int i22 = 1237;
        if (this.A0C) {
            i22 = 1231;
        }
        return hashCode + i22;
    }
}
