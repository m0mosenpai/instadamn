package X;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class BX4 extends C0T6 {
    public final Rect A00;
    public final Typeface A01;
    public final TextView.OnEditorActionListener A02;
    public final C66248U5s A03;
    public final BXC A04;
    public final EnumC25697BXh A05;
    public final BXL A06;
    public final BXN A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final Float A0A;
    public final Float A0B;
    public final Float A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;
    public final InterfaceC16820sZ A0M;
    public final InterfaceC16820sZ A0N;
    public final InterfaceC16820sZ A0O;
    public final InterfaceC16620sF A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    public BX4(Rect rect, Typeface typeface, TextView.OnEditorActionListener onEditorActionListener, C66248U5s c66248U5s, BXC bxc, EnumC25697BXh enumC25697BXh, BXL bxl, BXN bxn, CharSequence charSequence, CharSequence charSequence2, Float f, Float f2, Float f3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(charSequence, 1);
        C14360o3.A0B(bxc, 18);
        this.A09 = charSequence;
        this.A07 = bxn;
        this.A0I = num;
        this.A0J = num2;
        this.A0C = f;
        this.A08 = charSequence2;
        this.A0G = num3;
        this.A0F = num4;
        this.A00 = rect;
        this.A03 = c66248U5s;
        this.A0B = f2;
        this.A0A = f3;
        this.A0D = num5;
        this.A0E = num6;
        this.A05 = enumC25697BXh;
        this.A06 = bxl;
        this.A04 = bxc;
        this.A0R = z;
        this.A0H = num7;
        this.A0K = str;
        this.A0Q = z2;
        this.A0T = z3;
        this.A01 = typeface;
        this.A0M = interfaceC16820sZ;
        this.A0N = interfaceC16820sZ2;
        this.A02 = onEditorActionListener;
        this.A0P = interfaceC16620sF;
        this.A0S = z4;
        this.A0L = str2;
        this.A0O = interfaceC16820sZ3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BX4) {
                BX4 bx4 = (BX4) obj;
                if (!C14360o3.A0K(this.A09, bx4.A09) || !C14360o3.A0K(this.A07, bx4.A07) || !C14360o3.A0K(this.A0I, bx4.A0I) || !C14360o3.A0K(this.A0J, bx4.A0J) || !C14360o3.A0K(this.A0C, bx4.A0C) || !C14360o3.A0K(this.A08, bx4.A08) || !C14360o3.A0K(this.A0G, bx4.A0G) || !C14360o3.A0K(this.A0F, bx4.A0F) || !C14360o3.A0K(this.A00, bx4.A00) || !C14360o3.A0K(this.A03, bx4.A03) || !C14360o3.A0K(this.A0B, bx4.A0B) || !C14360o3.A0K(this.A0A, bx4.A0A) || !C14360o3.A0K(this.A0D, bx4.A0D) || !C14360o3.A0K(this.A0E, bx4.A0E) || this.A05 != bx4.A05 || this.A06 != bx4.A06 || this.A04 != bx4.A04 || this.A0R != bx4.A0R || !C14360o3.A0K(this.A0H, bx4.A0H) || !C14360o3.A0K(this.A0K, bx4.A0K) || this.A0Q != bx4.A0Q || this.A0T != bx4.A0T || !C14360o3.A0K(this.A01, bx4.A01) || !C14360o3.A0K(this.A0M, bx4.A0M) || !C14360o3.A0K(this.A0N, bx4.A0N) || !C14360o3.A0K(this.A02, bx4.A02) || !C14360o3.A0K(this.A0P, bx4.A0P) || this.A0S != bx4.A0S || !C14360o3.A0K(this.A0L, bx4.A0L) || !C14360o3.A0K(this.A0O, bx4.A0O)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167007dF.A0D(this.A0S, (((((((((AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0Q, (((AbstractC167007dF.A0D(this.A0R, AbstractC166997dE.A0J(this.A04, (((((((((((((((((AbstractC25225BEi.A05((((((((((AbstractC166987dD.A0G(this.A09) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A0J)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31, AbstractC167017dG.A0M(this.A0G)) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31)) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A0M)) * 31) + AbstractC167017dG.A0M(this.A0N)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A0P)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A0O)) * 31;
    }
}
