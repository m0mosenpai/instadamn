package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class CWL {
    public final C8k A00;
    public final EnumC72434Xde A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWL) {
                CWL cwl = (CWL) obj;
                if (this.A00 != cwl.A00 || !C14360o3.A0K(this.A04, cwl.A04) || !C14360o3.A0K(this.A03, cwl.A03) || this.A02 != cwl.A02 || this.A09 != cwl.A09 || !C14360o3.A0K(this.A07, cwl.A07) || !C14360o3.A0K(this.A05, cwl.A05) || !C14360o3.A0K(this.A06, cwl.A06) || this.A0A != cwl.A0A || this.A08 != cwl.A08 || this.A01 != cwl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = (AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
        Integer num = this.A02;
        return (AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0A, (((((AbstractC167007dF.A0D(this.A09, AbstractC167017dG.A0L(num, AbstractC27731CKy.A00(num), A0K)) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31;
    }

    public CWL(C8k c8k, EnumC72434Xde enumC72434Xde, Integer num, String str, String str2, String str3, String str4, Map map, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1Q(c8k, str);
        this.A00 = c8k;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A09 = z;
        this.A07 = map;
        this.A05 = str3;
        this.A06 = str4;
        this.A0A = z2;
        this.A08 = z3;
        this.A01 = enumC72434Xde;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineMEmuParams(entryPoint=");
        A1C.append(this.A00);
        AbstractC25235BEs.A1N(A1C, ", entryPointStringOverride=");
        A1C.append(", surfaceSessionId=");
        A1C.append(this.A04);
        A1C.append(", bottomSheetSessionId=");
        A1C.append(this.A03);
        A1C.append(", skipToScreen=");
        A1C.append(AbstractC27731CKy.A00(this.A02));
        A1C.append(", forceDarkMode=");
        A1C.append(this.A09);
        A1C.append(", appContextData=");
        A1C.append(this.A07);
        A1C.append(AbstractC111324zv.A00(1457));
        A1C.append(this.A05);
        A1C.append(", triggerMessageId=");
        A1C.append(this.A06);
        A1C.append(", isUploadingAdditionalPhotos=");
        A1C.append(this.A0A);
        A1C.append(", closeBottomSheetOnFailure=");
        A1C.append(this.A08);
        A1C.append(", metaAIIntentsPlatformSurface=");
        A1C.append(this.A01);
        A1C.append(", metaAIIntentsPlatformSurfaceStringOverride=");
        return AbstractC25236BEt.A0Y(null, A1C);
    }
}
