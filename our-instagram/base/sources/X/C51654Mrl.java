package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.List;

/* renamed from: X.Mrl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51654Mrl extends C0T6 {
    public final C51761Mtk A00;
    public final ImageUrl A01;
    public final C51633MrQ A02;
    public final EnumC53189Nfl A03;
    public final LeadGenCustomDisclaimer A04;
    public final LeadGenDisqualifyingScreenData A05;
    public final LeadGenPrivacyPolicy A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51654Mrl) {
                C51654Mrl c51654Mrl = (C51654Mrl) obj;
                if (!C14360o3.A0K(this.A09, c51654Mrl.A09) || this.A03 != c51654Mrl.A03 || !C14360o3.A0K(this.A00, c51654Mrl.A00) || !C14360o3.A0K(this.A07, c51654Mrl.A07) || !C14360o3.A0K(this.A01, c51654Mrl.A01) || !C14360o3.A0K(this.A06, c51654Mrl.A06) || !C14360o3.A0K(this.A08, c51654Mrl.A08) || !C14360o3.A0K(this.A0A, c51654Mrl.A0A) || this.A0E != c51654Mrl.A0E || this.A0L != c51654Mrl.A0L || !C14360o3.A0K(this.A05, c51654Mrl.A05) || this.A0I != c51654Mrl.A0I || this.A0J != c51654Mrl.A0J || !C14360o3.A0K(this.A04, c51654Mrl.A04) || this.A0F != c51654Mrl.A0F || this.A0K != c51654Mrl.A0K || this.A0C != c51654Mrl.A0C || !C14360o3.A0K(this.A02, c51654Mrl.A02) || this.A0B != c51654Mrl.A0B || this.A0H != c51654Mrl.A0H || this.A0G != c51654Mrl.A0G || this.A0D != c51654Mrl.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0D, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0F, (AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0I, (((AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A08, (((((AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A09))) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31)))) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31))) + AbstractC166997dE.A0I(this.A02)) * 31))));
    }

    public C51654Mrl(C51761Mtk c51761Mtk, ImageUrl imageUrl, C51633MrQ c51633MrQ, EnumC53189Nfl enumC53189Nfl, LeadGenCustomDisclaimer leadGenCustomDisclaimer, LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData, LeadGenPrivacyPolicy leadGenPrivacyPolicy, String str, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        AbstractC167027dH.A13(list, enumC53189Nfl, c51761Mtk);
        C14360o3.A0B(list2, 7);
        this.A09 = list;
        this.A03 = enumC53189Nfl;
        this.A00 = c51761Mtk;
        this.A07 = str;
        this.A01 = imageUrl;
        this.A06 = leadGenPrivacyPolicy;
        this.A08 = list2;
        this.A0A = list3;
        this.A0E = z;
        this.A0L = z2;
        this.A05 = leadGenDisqualifyingScreenData;
        this.A0I = z3;
        this.A0J = z4;
        this.A04 = leadGenCustomDisclaimer;
        this.A0F = z5;
        this.A0K = z6;
        this.A0C = z7;
        this.A02 = c51633MrQ;
        this.A0B = z8;
        this.A0H = z9;
        this.A0G = z10;
        this.A0D = z11;
    }
}
