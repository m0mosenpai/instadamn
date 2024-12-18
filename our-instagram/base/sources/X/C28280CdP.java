package X;

import java.util.List;

/* renamed from: X.CdP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28280CdP {
    public final int A00;
    public final CVW A01;
    public final CW8 A02;
    public final C27972CUu A03;
    public final C28265CdA A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final String A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28280CdP) {
                C28280CdP c28280CdP = (C28280CdP) obj;
                if (!C14360o3.A0K(this.A08, c28280CdP.A08) || !C14360o3.A0K(this.A0G, c28280CdP.A0G) || this.A00 != c28280CdP.A00 || this.A05 != c28280CdP.A05 || !C14360o3.A0K(this.A09, c28280CdP.A09) || !C14360o3.A0K(this.A02, c28280CdP.A02) || this.A0F != c28280CdP.A0F || !C14360o3.A0K(this.A04, c28280CdP.A04) || this.A0E != c28280CdP.A0E || !C14360o3.A0K(this.A06, c28280CdP.A06) || !C14360o3.A0K(this.A01, c28280CdP.A01) || this.A0B != c28280CdP.A0B || this.A0C != c28280CdP.A0C || this.A0D != c28280CdP.A0D || !C14360o3.A0K(this.A03, c28280CdP.A03) || !C14360o3.A0K(this.A0A, c28280CdP.A0A) || !C14360o3.A0K(this.A07, c28280CdP.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public C28280CdP(CVW cvw, CW8 cw8, C27972CUu c27972CUu, C28265CdA c28265CdA, Integer num, String str, String str2, String str3, String str4, String str5, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str4, 10);
        this.A08 = str;
        this.A0G = str2;
        this.A00 = i;
        this.A05 = num;
        this.A09 = str3;
        this.A02 = cw8;
        this.A0F = z;
        this.A04 = c28265CdA;
        this.A0E = z2;
        this.A06 = str4;
        this.A01 = cvw;
        this.A0B = z3;
        this.A0C = z4;
        this.A0D = z5;
        this.A03 = c27972CUu;
        this.A0A = list;
        this.A07 = str5;
    }

    public static /* synthetic */ C28280CdP A00(CW8 cw8, C28280CdP c28280CdP) {
        String str = c28280CdP.A08;
        String str2 = c28280CdP.A0G;
        int i = c28280CdP.A00;
        Integer num = c28280CdP.A05;
        String str3 = c28280CdP.A09;
        boolean z = c28280CdP.A0F;
        C28265CdA c28265CdA = c28280CdP.A04;
        boolean z2 = c28280CdP.A0E;
        String str4 = c28280CdP.A06;
        CVW cvw = c28280CdP.A01;
        boolean z3 = c28280CdP.A0B;
        boolean z4 = c28280CdP.A0C;
        boolean z5 = c28280CdP.A0D;
        return new C28280CdP(cvw, cw8, c28280CdP.A03, c28265CdA, num, str, str2, str3, str4, c28280CdP.A07, c28280CdP.A0A, i, z, z2, z3, z4, z5);
    }

    public final int hashCode() {
        int A0J = (((AbstractC166987dD.A0J(this.A08) + AbstractC167017dG.A0O(this.A0G)) * 31) + this.A00) * 31;
        Integer num = this.A05;
        return AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0F, AbstractC166997dE.A0J(this.A02, (AbstractC167017dG.A0L(num, AbstractC28338CeQ.A02(num), A0J) + AbstractC167017dG.A0O(this.A09)) * 31))))))))))) + AbstractC25227BEk.A07(this.A07);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIParams(surfaceSessionId=");
        A1C.append(this.A08);
        A1C.append(", appSessionId=");
        A1C.append(this.A0G);
        A1C.append(", numberOfOutputs=");
        A1C.append(this.A00);
        A1C.append(", surface=");
        A1C.append(AbstractC28338CeQ.A02(this.A05));
        A1C.append(", surfaceStringOverride=");
        A1C.append(this.A09);
        A1C.append(", writeWithAIContext=");
        A1C.append(this.A02);
        A1C.append(", streamingEnabled=");
        A1C.append(this.A0F);
        A1C.append(", uiConfig=");
        A1C.append(this.A04);
        A1C.append(", plaintextResultEnabled=");
        A1C.append(this.A0E);
        A1C.append(", bottomSheetSessionId=");
        A1C.append(this.A06);
        A1C.append(", loggingParams=");
        A1C.append(this.A01);
        A1C.append(", initialContentEditingEnabled=");
        A1C.append(this.A0B);
        A1C.append(", isAutoFocusTextInputEnabled=");
        A1C.append(this.A0C);
        A1C.append(", isUsingMMLLM=");
        A1C.append(this.A0D);
        A1C.append(", preqParams=");
        A1C.append(this.A03);
        A1C.append(", prefetchedTonePills=");
        A1C.append(this.A0A);
        A1C.append(AbstractC111324zv.A00(278));
        return AbstractC25236BEt.A0Y(this.A07, A1C);
    }
}
