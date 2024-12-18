package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.CdO */
/* loaded from: classes5.dex */
public final class C28279CdO {
    public final long A00;
    public final Drawable A01;
    public final C51722Yv A02;
    public final CWK A03;
    public final C28276CdL A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28279CdO) {
                C28279CdO c28279CdO = (C28279CdO) obj;
                if (!C14360o3.A0K(this.A06, c28279CdO.A06) || this.A08 != c28279CdO.A08 || this.A00 != c28279CdO.A00 || this.A0B != c28279CdO.A0B || !C14360o3.A0K(this.A04, c28279CdO.A04) || !C14360o3.A0K(this.A03, c28279CdO.A03) || this.A09 != c28279CdO.A09 || !C14360o3.A0K(this.A02, c28279CdO.A02) || !C14360o3.A0K(this.A01, c28279CdO.A01) || this.A07 != c28279CdO.A07 || !C14360o3.A0K(this.A05, c28279CdO.A05) || this.A0A != c28279CdO.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public C28279CdO(Drawable drawable, C51722Yv c51722Yv, CWK cwk, C28276CdL c28276CdL, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, long j, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(num2, 10);
        this.A06 = charSequence;
        this.A08 = num;
        this.A00 = j;
        this.A0B = z;
        this.A04 = c28276CdL;
        this.A03 = cwk;
        this.A09 = z2;
        this.A02 = c51722Yv;
        this.A01 = drawable;
        this.A07 = num2;
        this.A05 = charSequence2;
        this.A0A = z3;
    }

    public static /* synthetic */ C28279CdO A00(Drawable drawable, CWK cwk, C28279CdO c28279CdO, C28276CdL c28276CdL, CharSequence charSequence, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        long j;
        C51722Yv c51722Yv;
        boolean z3;
        Integer num3 = num;
        Drawable drawable2 = drawable;
        boolean z4 = z2;
        CWK cwk2 = cwk;
        C28276CdL c28276CdL2 = c28276CdL;
        boolean z5 = z;
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = null;
        if ((i & 1) != 0) {
            charSequence2 = c28279CdO.A06;
        }
        if ((i & 2) != 0) {
            num2 = c28279CdO.A08;
        } else {
            num2 = null;
        }
        if ((i & 4) != 0) {
            j = c28279CdO.A00;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            z5 = c28279CdO.A0B;
        }
        if ((i & 16) != 0) {
            c28276CdL2 = c28279CdO.A04;
        }
        if ((i & 32) != 0) {
            cwk2 = c28279CdO.A03;
        }
        if ((i & 64) != 0) {
            z4 = c28279CdO.A09;
        }
        if ((i & 128) != 0) {
            c51722Yv = c28279CdO.A02;
        } else {
            c51722Yv = null;
        }
        if ((i & 256) != 0) {
            drawable2 = c28279CdO.A01;
        }
        if ((i & 512) != 0) {
            num3 = c28279CdO.A07;
        }
        if ((i & 1024) != 0) {
            charSequence3 = c28279CdO.A05;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            z3 = c28279CdO.A0A;
        } else {
            z3 = false;
        }
        AbstractC167017dG.A1N(charSequence2, num2);
        C14360o3.A0B(num3, 9);
        return new C28279CdO(drawable2, c51722Yv, cwk2, c28276CdL2, charSequence2, charSequence3, num2, num3, j, z5, z4, z3);
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A06);
        Integer num = this.A08;
        int A0D = (((AbstractC167007dF.A0D(this.A09, (((AbstractC167007dF.A0D(this.A0B, AbstractC25236BEt.A01(this.A00, AbstractC167017dG.A0L(num, CL7.A00(num), A0G))) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        Integer num2 = this.A07;
        return AbstractC166987dD.A0K(this.A0A, (AbstractC167017dG.A0L(num2, U76.A01(num2), A0D) + AbstractC166997dE.A0I(this.A05)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiBottomSheetConfig(titleString=");
        A1C.append((Object) this.A06);
        A1C.append(", titleTextType=");
        A1C.append(CL7.A00(this.A08));
        A1C.append(", titleCapSize=");
        A1C.append((Object) C2Z3.A04(this.A00));
        A1C.append(", shouldShowMetaAiDonut=");
        A1C.append(this.A0B);
        A1C.append(", navigationButtonConfig=");
        A1C.append(this.A04);
        A1C.append(", actionButtonConfig=");
        A1C.append(this.A03);
        A1C.append(", overrideDefaultNavigation=");
        A1C.append(this.A09);
        A1C.append(", headerStyle=");
        A1C.append(this.A02);
        A1C.append(", customBackgroundDrawable=");
        A1C.append(this.A01);
        A1C.append(", darkModeConfig=");
        A1C.append(U76.A01(this.A07));
        A1C.append(", subTitleString=");
        A1C.append((Object) this.A05);
        A1C.append(", shouldShowHeader=");
        return AbstractC25236BEt.A0a(A1C, this.A0A);
    }
}
