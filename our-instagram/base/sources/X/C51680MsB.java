package X;

import java.util.List;

/* renamed from: X.MsB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51680MsB extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final UQ7 A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51680MsB) {
                C51680MsB c51680MsB = (C51680MsB) obj;
                if (!C14360o3.A0K(this.A08, c51680MsB.A08) || this.A06 != c51680MsB.A06 || this.A05 != c51680MsB.A05 || this.A0B != c51680MsB.A0B || this.A0F != c51680MsB.A0F || this.A0I != c51680MsB.A0I || this.A0E != c51680MsB.A0E || this.A09 != c51680MsB.A09 || this.A0A != c51680MsB.A0A || Float.compare(this.A00, c51680MsB.A00) != 0 || this.A0G != c51680MsB.A0G || this.A0D != c51680MsB.A0D || this.A02 != c51680MsB.A02 || this.A03 != c51680MsB.A03 || this.A04 != c51680MsB.A04 || this.A01 != c51680MsB.A01 || !C14360o3.A0K(this.A07, c51680MsB.A07) || this.A0C != c51680MsB.A0C || this.A0H != c51680MsB.A0H) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0H, AbstractC167007dF.A0D(this.A0C, AbstractC166997dE.A0J(this.A07, (((((((AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0G, AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0B, (((AbstractC166987dD.A0G(this.A08) + this.A06) * 31) + this.A05) * 31)))))), this.A00))) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A01) * 31) * 31));
    }

    public C51680MsB(UQ7 uq7, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A08 = list;
        this.A06 = i;
        this.A05 = i2;
        this.A0B = z;
        this.A0F = z2;
        this.A0I = z3;
        this.A0E = z4;
        this.A09 = z5;
        this.A0A = z6;
        this.A00 = f;
        this.A0G = z7;
        this.A0D = z8;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A01 = i6;
        this.A07 = uq7;
        this.A0C = z9;
        this.A0H = z10;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OmniGridViewModel(items=");
        A1C.append(this.A08);
        A1C.append(", systemTopInset=");
        A1C.append(this.A06);
        A1C.append(", systemBottomInset=");
        A1C.append(this.A05);
        A1C.append(", callControlsVisible=");
        A1C.append(this.A0B);
        A1C.append(", disableFloatingSelfView=");
        A1C.append(this.A0F);
        A1C.append(", minimized=");
        A1C.append(this.A0I);
        A1C.append(", coWatchEnabled=");
        A1C.append(this.A0E);
        A1C.append(", bottomSheetExpanded=");
        A1C.append(this.A09);
        A1C.append(", bottomSheetShowing=");
        A1C.append(this.A0A);
        A1C.append(", bottomSheetSlideOffset=");
        A1C.append(this.A00);
        A1C.append(", isARTrayShowing=");
        A1C.append(this.A0G);
        A1C.append(", chicletEnabled=");
        A1C.append(this.A0D);
        A1C.append(", cowatchE2eeDisclaimerHeight=");
        A1C.append(this.A02);
        A1C.append(", effectChicletHeight=");
        A1C.append(this.A03);
        A1C.append(", effectChicletTopSpacing=");
        A1C.append(this.A04);
        A1C.append(", arEffectsTrayHeight=");
        A1C.append(this.A01);
        A1C.append(", controlsHeightVOffset=");
        A1C.append(this.A07);
        A1C.append(", gridScaleDimensions=");
        A1C.append((Object) null);
        A1C.append(", cameraTogetherEnabled=");
        A1C.append(this.A0C);
        A1C.append(", isCreatorAIEmbodiment=");
        return AbstractC25236BEt.A0a(A1C, this.A0H);
    }
}
