package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.List;

/* renamed from: X.GlM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37867GlM extends C0T6 {
    public final InterfaceC38401qU A00;
    public final C69749Vuj A01;
    public final ImageUrl A02;
    public final SpritesheetInfo A03;
    public final EnumC40111tc A04;
    public final Integer A05;
    public final List A06;
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
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37867GlM) {
                C37867GlM c37867GlM = (C37867GlM) obj;
                if (!C14360o3.A0K(this.A01, c37867GlM.A01) || !C14360o3.A0K(this.A05, c37867GlM.A05) || this.A0H != c37867GlM.A0H || this.A0G != c37867GlM.A0G || this.A09 != c37867GlM.A09 || this.A0A != c37867GlM.A0A || this.A07 != c37867GlM.A07 || this.A0I != c37867GlM.A0I || !C14360o3.A0K(this.A03, c37867GlM.A03) || !C14360o3.A0K(this.A02, c37867GlM.A02) || !C14360o3.A0K(this.A06, c37867GlM.A06) || !C14360o3.A0K(this.A00, c37867GlM.A00) || this.A0D != c37867GlM.A0D || this.A0E != c37867GlM.A0E || this.A0C != c37867GlM.A0C || this.A04 != c37867GlM.A04 || this.A08 != c37867GlM.A08 || this.A0F != c37867GlM.A0F || this.A0B != c37867GlM.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0D, (((((((AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0H, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)))))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31))) + AbstractC166997dE.A0I(this.A04)) * 31));
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC166987dD.A0K(this.A0B, (((A0D + A00) * 31) + A00) * 31);
    }

    public C37867GlM(InterfaceC38401qU interfaceC38401qU, C69749Vuj c69749Vuj, ImageUrl imageUrl, SpritesheetInfo spritesheetInfo, EnumC40111tc enumC40111tc, Integer num, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A01 = c69749Vuj;
        this.A05 = num;
        this.A0H = z;
        this.A0G = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A07 = z5;
        this.A0I = z6;
        this.A03 = spritesheetInfo;
        this.A02 = imageUrl;
        this.A06 = list;
        this.A00 = interfaceC38401qU;
        this.A0D = z7;
        this.A0E = z8;
        this.A0C = z9;
        this.A04 = enumC40111tc;
        this.A08 = z10;
        this.A0F = z11;
        this.A0B = z12;
    }
}
