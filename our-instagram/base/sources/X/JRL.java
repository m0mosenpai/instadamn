package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public final class JRL extends C0T6 implements InterfaceC66482zP {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C45127Jxw A07;
    public final JUM A08;
    public final C99E A09;
    public final C31228DoB A0A;
    public final C43641JRz A0B;
    public final AbstractC46440Kh0 A0C;
    public final JS2 A0D;
    public final EnumC92794Ds A0E;
    public final C45176JzI A0F;
    public final C31243DoR A0G;
    public final DirectShareTarget A0H;
    public final DirectThreadKey A0I;
    public final C3o9 A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JRL) {
                JRL jrl = (JRL) obj;
                if (!C14360o3.A0K(this.A0M, jrl.A0M) || !C14360o3.A0K(this.A0N, jrl.A0N) || !C14360o3.A0K(this.A0O, jrl.A0O) || this.A0j != jrl.A0j || this.A0e != jrl.A0e || this.A0k != jrl.A0k || !C14360o3.A0K(this.A0I, jrl.A0I) || !C14360o3.A0K(this.A0J, jrl.A0J) || !C14360o3.A0K(this.A0H, jrl.A0H) || this.A0E != jrl.A0E || this.A01 != jrl.A01 || this.A02 != jrl.A02 || this.A0n != jrl.A0n || !C14360o3.A0K(this.A0G, jrl.A0G) || !C14360o3.A0K(this.A0F, jrl.A0F) || Float.compare(this.A00, jrl.A00) != 0 || this.A0l != jrl.A0l || this.A0m != jrl.A0m || !C14360o3.A0K(this.A0B, jrl.A0B) || !C14360o3.A0K(this.A08, jrl.A08) || !C14360o3.A0K(this.A0D, jrl.A0D) || !C14360o3.A0K(this.A0C, jrl.A0C) || !C14360o3.A0K(this.A07, jrl.A07) || !C14360o3.A0K(this.A0A, jrl.A0A) || !C14360o3.A0K(this.A0R, jrl.A0R) || this.A03 != jrl.A03 || this.A0c != jrl.A0c || !C14360o3.A0K(this.A0L, jrl.A0L) || this.A0b != jrl.A0b || this.A05 != jrl.A05 || !C14360o3.A0K(this.A0S, jrl.A0S) || this.A0h != jrl.A0h || this.A06 != jrl.A06 || !C14360o3.A0K(this.A09, jrl.A09) || !C14360o3.A0K(this.A0Q, jrl.A0Q) || !C14360o3.A0K(this.A0K, jrl.A0K) || this.A0f != jrl.A0f || this.A0g != jrl.A0g || this.A0Y != jrl.A0Y || this.A0a != jrl.A0a || this.A0Z != jrl.A0Z || this.A0U != jrl.A0U || this.A0X != jrl.A0X || this.A0V != jrl.A0V || this.A04 != jrl.A04 || this.A0T != jrl.A0T || !C14360o3.A0K(this.A0P, jrl.A0P) || this.A0W != jrl.A0W || this.A0d != jrl.A0d || this.A0i != jrl.A0i) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        DirectShareTarget directShareTarget = this.A0H;
        String A08 = directShareTarget.A08();
        if (A08 == null) {
            String A09 = directShareTarget.A09();
            C14360o3.A07(A09);
            return A09;
        }
        return A08;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0i, AbstractC167007dF.A0D(this.A0d, AbstractC167007dF.A0D(this.A0W, (AbstractC167007dF.A0D(this.A0T, (AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A0X, AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0Z, AbstractC167007dF.A0D(this.A0a, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0g, AbstractC167007dF.A0D(this.A0f, (((((AbstractC167007dF.A07(this.A06, AbstractC167007dF.A0D(this.A0h, AbstractC166997dE.A0J(this.A0S, AbstractC167007dF.A07(this.A05, AbstractC167007dF.A0D(this.A0b, AbstractC166997dE.A0K(this.A0L, AbstractC167007dF.A0D(this.A0c, (AbstractC166997dE.A0J(this.A0R, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A0D, AbstractC166997dE.A0J(this.A08, (AbstractC167007dF.A0D(this.A0m, AbstractC167007dF.A0D(this.A0l, AbstractC166997dE.A00((((AbstractC167007dF.A0D(this.A0n, (((AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A0H, AbstractC166997dE.A0J(this.A0J, AbstractC166997dE.A0J(this.A0I, AbstractC167007dF.A0D(this.A0k, AbstractC167007dF.A0D(this.A0e, AbstractC167007dF.A0D(this.A0j, (((AbstractC166987dD.A0J(this.A0M) + AbstractC167017dG.A0O(this.A0N)) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31))))))) + this.A01) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31, this.A00))) + AbstractC167017dG.A0M(this.A0B)) * 31)) + AbstractC167017dG.A0M(this.A0C)) * 31))) + this.A03) * 31))))))) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0Q)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31)))))))) + this.A04) * 31) + AbstractC25227BEk.A07(this.A0P)) * 31)));
    }

    public JRL(C45127Jxw c45127Jxw, JUM jum, C99E c99e, C31228DoB c31228DoB, C43641JRz c43641JRz, AbstractC46440Kh0 abstractC46440Kh0, JS2 js2, EnumC92794Ds enumC92794Ds, C45176JzI c45176JzI, C31243DoR c31243DoR, DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, float f, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
        C14360o3.A0B(list, 25);
        C14360o3.A0B(str4, 28);
        C14360o3.A0B(list2, 31);
        this.A0M = str;
        this.A0N = str2;
        this.A0O = str3;
        this.A0j = z;
        this.A0e = z2;
        this.A0k = z3;
        this.A0I = directThreadKey;
        this.A0J = c3o9;
        this.A0H = directShareTarget;
        this.A0E = enumC92794Ds;
        this.A01 = i;
        this.A02 = i2;
        this.A0n = z4;
        this.A0G = c31243DoR;
        this.A0F = c45176JzI;
        this.A00 = f;
        this.A0l = z5;
        this.A0m = z6;
        this.A0B = c43641JRz;
        this.A08 = jum;
        this.A0D = js2;
        this.A0C = abstractC46440Kh0;
        this.A07 = c45127Jxw;
        this.A0A = c31228DoB;
        this.A0R = list;
        this.A03 = i3;
        this.A0c = z7;
        this.A0L = str4;
        this.A0b = z8;
        this.A05 = j;
        this.A0S = list2;
        this.A0h = z9;
        this.A06 = j2;
        this.A09 = c99e;
        this.A0Q = list3;
        this.A0K = str5;
        this.A0f = z10;
        this.A0g = z11;
        this.A0Y = z12;
        this.A0a = z13;
        this.A0Z = z14;
        this.A0U = z15;
        this.A0X = z16;
        this.A0V = z17;
        this.A04 = i4;
        this.A0T = z18;
        this.A0P = str6;
        this.A0W = z19;
        this.A0d = z20;
        this.A0i = z21;
    }
}
