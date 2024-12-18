package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import java.io.IOException;
import java.io.StringWriter;
import java.util.UUID;

/* renamed from: X.5Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115475Kh extends AbstractC115485Ki implements InterfaceC115505Kk {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C206169Az A0A;
    public C51737MtK A0B;
    public C38008Gnu A0C;
    public C26086BgF A0D;
    public C18160v1 A0E;
    public C115545Ko A0F;
    public C115525Km A0G;
    public Integer A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115475Kh) {
                C115475Kh c115475Kh = (C115475Kh) obj;
                if (!C14360o3.A0K(this.A0G, c115475Kh.A0G) || !C14360o3.A0K(this.A0F, c115475Kh.A0F) || Float.compare(this.A00, c115475Kh.A00) != 0 || this.A09 != c115475Kh.A09 || this.A08 != c115475Kh.A08 || this.A0R != c115475Kh.A0R || this.A0T != c115475Kh.A0T || !C14360o3.A0K(this.A0E, c115475Kh.A0E) || this.A0O != c115475Kh.A0O || this.A0S != c115475Kh.A0S || this.A03 != c115475Kh.A03 || this.A02 != c115475Kh.A02 || this.A05 != c115475Kh.A05 || this.A0U != c115475Kh.A0U || !C14360o3.A0K(this.A0I, c115475Kh.A0I) || !C14360o3.A0K(this.A0D, c115475Kh.A0D) || !C14360o3.A0K(this.A0M, c115475Kh.A0M) || !C14360o3.A0K(this.A0N, c115475Kh.A0N) || this.A07 != c115475Kh.A07 || !C14360o3.A0K(this.A0L, c115475Kh.A0L) || this.A06 != c115475Kh.A06 || this.A04 != c115475Kh.A04 || !C14360o3.A0K(this.A0J, c115475Kh.A0J) || !C14360o3.A0K(this.A0C, c115475Kh.A0C) || this.A0Q != c115475Kh.A0Q || this.A0P != c115475Kh.A0P || !C14360o3.A0K(this.A0H, c115475Kh.A0H) || !C14360o3.A0K(this.A0A, c115475Kh.A0A) || !C14360o3.A0K(this.A0K, c115475Kh.A0K) || Float.compare(this.A01, c115475Kh.A01) != 0 || !C14360o3.A0K(this.A0B, c115475Kh.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgVideoSegment(sourceVideo=");
        sb.append(this.A0G);
        sb.append(", recordingSettings=");
        sb.append(this.A0F);
        sb.append(", _recordingSpeed=");
        sb.append(this.A00);
        sb.append(", trimmedStartTimeInMs=");
        sb.append(this.A09);
        sb.append(", trimmedEndTimeInMs=");
        sb.append(this.A08);
        sb.append(", isFromDraft=");
        sb.append(this.A0R);
        sb.append(", isReplaced=");
        sb.append(this.A0T);
        sb.append(", textModeGradientColors=");
        sb.append(this.A0E);
        sb.append(", fillScreen=");
        sb.append(this.A0O);
        sb.append(", isNonTranscodedPrefillVideo=");
        sb.append(this.A0S);
        sb.append(", _minTrimTimeInMs=");
        sb.append(this.A03);
        sb.append(", _maxTrimTimeInMs=");
        sb.append(this.A02);
        sb.append(", minTrimStartTimeInMs=");
        sb.append(this.A05);
        sb.append(", isTranscoded=");
        sb.append(this.A0U);
        sb.append(", complianceError=");
        sb.append(this.A0I);
        sb.append(", autoCreatedReelsInfo=");
        sb.append(this.A0D);
        sb.append(", transitionInEffect=");
        sb.append(this.A0M);
        sb.append(", transitionOutEffect=");
        sb.append(this.A0N);
        sb.append(", takeIndex=");
        sb.append(this.A07);
        sb.append(", retakeListId=");
        sb.append(this.A0L);
        sb.append(", startTimeInMs=");
        sb.append(this.A06);
        sb.append(", endTimeInMs=");
        sb.append(this.A04);
        sb.append(", importId=");
        sb.append(this.A0J);
        sb.append(", videoSplitMetadata=");
        sb.append(this.A0C);
        sb.append(", hasVideoSlip=");
        sb.append(this.A0Q);
        sb.append(", hasTemplateReusableAsset=");
        sb.append(this.A0P);
        sb.append(", prefilledIndex=");
        sb.append(this.A0H);
        sb.append(", layoutTransform=");
        sb.append(this.A0A);
        sb.append(", originalMediumId=");
        sb.append(this.A0K);
        sb.append(", volume=");
        sb.append(this.A01);
        sb.append(", magicCutMetadata=");
        sb.append(this.A0B);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.5Ki, X.5Kh] */
    public static /* synthetic */ C115475Kh A00(C51737MtK c51737MtK, C38008Gnu c38008Gnu, C115475Kh c115475Kh, C115525Km c115525Km, float f, int i, int i2, int i3, int i4, int i5) {
        C115545Ko c115545Ko;
        boolean z;
        boolean z2;
        C18160v1 c18160v1;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        C26086BgF c26086BgF;
        String str;
        String str2;
        int i9;
        String str3;
        String str4;
        boolean z6;
        boolean z7;
        Integer num;
        C206169Az c206169Az;
        float f2;
        C38008Gnu c38008Gnu2 = c38008Gnu;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        int i13 = i;
        float f3 = f;
        C115525Km c115525Km2 = c115525Km;
        String str5 = null;
        String str6 = null;
        if ((i5 & 1) != 0) {
            c115525Km2 = c115475Kh.A0G;
        }
        if ((i5 & 2) != 0) {
            c115545Ko = c115475Kh.A0F;
        } else {
            c115545Ko = null;
        }
        if ((i5 & 4) != 0) {
            f3 = c115475Kh.A00;
        }
        if ((i5 & 8) != 0) {
            i13 = c115475Kh.A09;
        }
        if ((i5 & 16) != 0) {
            i12 = c115475Kh.A08;
        }
        if ((i5 & 32) != 0) {
            z = c115475Kh.A0R;
        } else {
            z = false;
        }
        if ((i5 & 64) != 0) {
            z2 = c115475Kh.A0T;
        } else {
            z2 = false;
        }
        if ((i5 & 128) != 0) {
            c18160v1 = c115475Kh.A0E;
        } else {
            c18160v1 = null;
        }
        if ((i5 & 256) != 0) {
            z3 = c115475Kh.A0O;
        } else {
            z3 = false;
        }
        if ((i5 & 512) != 0) {
            z4 = c115475Kh.A0S;
        } else {
            z4 = false;
        }
        if ((i5 & 1024) != 0) {
            i6 = c115475Kh.A03;
        } else {
            i6 = 0;
        }
        if ((i5 & C3OO.FLAG_MOVED) != 0) {
            i7 = c115475Kh.A02;
        } else {
            i7 = 0;
        }
        if ((i5 & 4096) != 0) {
            i8 = c115475Kh.A05;
        } else {
            i8 = 0;
        }
        if ((i5 & 8192) != 0) {
            z5 = c115475Kh.A0U;
        } else {
            z5 = false;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str6 = c115475Kh.A0I;
        }
        if ((i5 & Constants.LOAD_RESULT_PGO) != 0) {
            c26086BgF = c115475Kh.A0D;
        } else {
            c26086BgF = null;
        }
        if ((i5 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            str = c115475Kh.A0M;
        } else {
            str = null;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            str2 = c115475Kh.A0N;
        } else {
            str2 = null;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            i9 = c115475Kh.A07;
        } else {
            i9 = 0;
        }
        if ((i5 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            str3 = c115475Kh.A0L;
        } else {
            str3 = null;
        }
        if ((i5 & 1048576) != 0) {
            i11 = c115475Kh.A06;
        }
        if ((i5 & 2097152) != 0) {
            i10 = c115475Kh.A04;
        }
        if ((i5 & 4194304) != 0) {
            str4 = c115475Kh.A0J;
        } else {
            str4 = null;
        }
        if ((i5 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            c38008Gnu2 = c115475Kh.A0C;
        }
        if ((i5 & 16777216) != 0) {
            z6 = c115475Kh.A0Q;
        } else {
            z6 = false;
        }
        if ((i5 & 33554432) != 0) {
            z7 = c115475Kh.A0P;
        } else {
            z7 = false;
        }
        if ((i5 & 67108864) != 0) {
            num = c115475Kh.A0H;
        } else {
            num = null;
        }
        if ((i5 & 134217728) != 0) {
            c206169Az = c115475Kh.A0A;
        } else {
            c206169Az = null;
        }
        if ((i5 & 268435456) != 0) {
            str5 = c115475Kh.A0K;
        }
        if ((i5 & 536870912) != 0) {
            f2 = c115475Kh.A01;
        } else {
            f2 = 0.0f;
        }
        if ((i5 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0) {
            c51737MtK = c115475Kh.A0B;
        }
        C14360o3.A0B(c115525Km2, 0);
        C14360o3.A0B(c115545Ko, 1);
        ?? abstractC115485Ki = new AbstractC115485Ki(C05F.A01);
        abstractC115485Ki.A0G = c115525Km2;
        abstractC115485Ki.A0F = c115545Ko;
        abstractC115485Ki.A00 = f3;
        abstractC115485Ki.A09 = i13;
        abstractC115485Ki.A08 = i12;
        abstractC115485Ki.A0R = z;
        abstractC115485Ki.A0T = z2;
        abstractC115485Ki.A0E = c18160v1;
        abstractC115485Ki.A0O = z3;
        abstractC115485Ki.A0S = z4;
        abstractC115485Ki.A03 = i6;
        abstractC115485Ki.A02 = i7;
        abstractC115485Ki.A05 = i8;
        abstractC115485Ki.A0U = z5;
        abstractC115485Ki.A0I = str6;
        abstractC115485Ki.A0D = c26086BgF;
        abstractC115485Ki.A0M = str;
        abstractC115485Ki.A0N = str2;
        abstractC115485Ki.A07 = i9;
        abstractC115485Ki.A0L = str3;
        abstractC115485Ki.A06 = i11;
        abstractC115485Ki.A04 = i10;
        abstractC115485Ki.A0J = str4;
        abstractC115485Ki.A0C = c38008Gnu2;
        abstractC115485Ki.A0Q = z6;
        abstractC115485Ki.A0P = z7;
        abstractC115485Ki.A0H = num;
        abstractC115485Ki.A0A = c206169Az;
        abstractC115485Ki.A0K = str5;
        abstractC115485Ki.A01 = f2;
        abstractC115485Ki.A0B = c51737MtK;
        return abstractC115485Ki;
    }

    public final int A0B() {
        C115525Km c115525Km = this.A0G;
        float abs = Math.abs(this.A00);
        C115525Km c115525Km2 = AbstractC115515Kl.A00;
        return (int) Math.ceil((c115525Km.A02 - c115525Km.A03) / abs);
    }

    public final ClipSegment.VideoSegment A0C() {
        int i;
        int i2;
        C115525Km c115525Km = this.A0G;
        String str = c115525Km.A0F;
        int i3 = c115525Km.A09;
        int i4 = c115525Km.A05;
        int i5 = c115525Km.A07;
        LayoutTransform A04 = AbstractC115515Kl.A04(this);
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        C115525Km c115525Km2 = this.A0G;
        long j = c115525Km2.A0A;
        int i6 = c115525Km2.A04;
        float f = this.A00;
        boolean z = false;
        if (f < 0.0f) {
            z = true;
            i = i6 - this.A08;
        } else {
            i = this.A09;
        }
        if (z) {
            i2 = i6 - this.A09;
        } else {
            i2 = this.A08;
        }
        return new ClipSegment.VideoSegment(of, A04, null, null, str, null, null, f, this.A01, i3, i4, i5, i6, i, i2, -1, j, true, false);
    }

    public final ClipSegment A0D() {
        C115525Km c115525Km = this.A0G;
        String str = c115525Km.A0I;
        if (str != null) {
            return new ClipSegment.PhotoSegment(AbstractC115515Kl.A04(this), null, null, str, null, null, c115525Km.A09, c115525Km.A05, c115525Km.A07, this.A08 - this.A09, -1, false);
        }
        return A0C();
    }

    public final String A0E() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC115465Kg.A00(A0A, this);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    public final void A0F() {
        if (!C14360o3.A0K(this.A0G, AbstractC115515Kl.A00)) {
            if (this.A08 == 0) {
                this.A08 = A0B();
            }
            if (this.A06 == -1) {
                this.A06 = this.A0G.A03;
            }
            if (this.A04 == -1) {
                this.A04 = this.A0G.A02;
                return;
            }
            return;
        }
        throw new IllegalStateException("Source video must be set in video segment");
    }

    public final void A0G(float f) {
        float abs;
        if (this.A00 >= 0.0f) {
            abs = Math.abs(f);
        } else {
            abs = Math.abs(f) * (-1.0f);
        }
        this.A00 = abs;
    }

    @Override // X.InterfaceC115495Kj
    public final int BsL() {
        return this.A08 - this.A09;
    }

    @Override // X.InterfaceC115505Kk
    public final String CFA() {
        C115525Km c115525Km = this.A0G;
        StringBuilder sb = new StringBuilder();
        sb.append(c115525Km.A0G);
        sb.append('_');
        sb.append(c115525Km.A03);
        sb.append('_');
        sb.append(c115525Km.A02);
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = ((((((((this.A0G.hashCode() * 31) + this.A0F.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A09) * 31) + this.A08) * 31;
        int i = 1237;
        if (this.A0R) {
            i = 1231;
        }
        int i2 = (hashCode12 + i) * 31;
        int i3 = 1237;
        if (this.A0T) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        C18160v1 c18160v1 = this.A0E;
        int i5 = 0;
        if (c18160v1 == null) {
            hashCode = 0;
        } else {
            hashCode = c18160v1.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        int i7 = 1237;
        if (this.A0O) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0S) {
            i9 = 1231;
        }
        int i10 = (((((((i8 + i9) * 31) + this.A03) * 31) + this.A02) * 31) + this.A05) * 31;
        int i11 = 1237;
        if (this.A0U) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        String str = this.A0I;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        C26086BgF c26086BgF = this.A0D;
        if (c26086BgF == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c26086BgF.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.A0M;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str3 = this.A0N;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i16 = (((i15 + hashCode5) * 31) + this.A07) * 31;
        String str4 = this.A0L;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i17 = (((((i16 + hashCode6) * 31) + this.A06) * 31) + this.A04) * 31;
        String str5 = this.A0J;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        C38008Gnu c38008Gnu = this.A0C;
        if (c38008Gnu == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c38008Gnu.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        int i20 = 1237;
        if (this.A0Q) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0P) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        Integer num = this.A0H;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int i24 = (i23 + hashCode9) * 31;
        C206169Az c206169Az = this.A0A;
        if (c206169Az == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c206169Az.hashCode();
        }
        int i25 = (i24 + hashCode10) * 31;
        String str6 = this.A0K;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int floatToIntBits = (((i25 + hashCode11) * 31) + Float.floatToIntBits(this.A01)) * 31;
        C51737MtK c51737MtK = this.A0B;
        if (c51737MtK != null) {
            i5 = c51737MtK.hashCode();
        }
        return floatToIntBits + i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C115475Kh(C26086BgF c26086BgF, C18160v1 c18160v1, C115545Ko c115545Ko, C115525Km c115525Km, String str, String str2, String str3, String str4, String str5, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4) {
        super(C05F.A01);
        String str6;
        C26086BgF c26086BgF2 = c26086BgF;
        C18160v1 c18160v12 = c18160v1;
        String str7 = str5;
        int i8 = i6;
        int i9 = i5;
        String str8 = str4;
        int i10 = i4;
        float f2 = f;
        int i11 = i;
        int i12 = i2;
        boolean z5 = z3;
        String str9 = str3;
        boolean z6 = z;
        String str10 = str;
        boolean z7 = z2;
        String str11 = str2;
        int i13 = i3;
        boolean z8 = z4;
        C115545Ko c115545Ko2 = (i7 & 2) != 0 ? new C115545Ko(null, null, null, 1.0f, -1, false) : c115545Ko;
        f2 = (i7 & 4) != 0 ? c115545Ko2.A00 : f2;
        i11 = (i7 & 8) != 0 ? 0 : i11;
        if ((i7 & 16) != 0) {
            float abs = Math.abs(f2);
            C115525Km c115525Km2 = AbstractC115515Kl.A00;
            i12 = (int) Math.ceil((c115525Km.A02 - c115525Km.A03) / abs);
        }
        z6 = (i7 & 32) != 0 ? false : z6;
        c18160v12 = (i7 & 128) != 0 ? null : c18160v12;
        z7 = (i7 & 256) != 0 ? false : z7;
        z5 = (i7 & 512) != 0 ? false : z5;
        int i14 = (i7 & 1024) != 0 ? -1 : 0;
        int i15 = (i7 & C3OO.FLAG_MOVED) != 0 ? -1 : 0;
        i13 = (i7 & 4096) != 0 ? -1 : i13;
        z8 = (i7 & 8192) != 0 ? true : z8;
        str10 = (i7 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? null : str10;
        c26086BgF2 = (i7 & Constants.LOAD_RESULT_PGO) != 0 ? null : c26086BgF2;
        str11 = (i7 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? null : str11;
        str9 = (i7 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? null : str9;
        i10 = (i7 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? 0 : i10;
        str8 = (i7 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? null : str8;
        i9 = (i7 & 1048576) != 0 ? -1 : i9;
        i8 = (i7 & 2097152) != 0 ? -1 : i8;
        if ((i7 & 4194304) != 0) {
            str6 = UUID.randomUUID().toString();
        } else {
            str6 = null;
        }
        str7 = (i7 & 268435456) != 0 ? null : str7;
        float f3 = (i7 & 536870912) != 0 ? 1.0f : 0.0f;
        C14360o3.A0B(c115525Km, 1);
        C14360o3.A0B(c115545Ko2, 2);
        this.A0G = c115525Km;
        this.A0F = c115545Ko2;
        this.A00 = f2;
        this.A09 = i11;
        this.A08 = i12;
        this.A0R = z6;
        this.A0T = false;
        this.A0E = c18160v12;
        this.A0O = z7;
        this.A0S = z5;
        this.A03 = i14;
        this.A02 = i15;
        this.A05 = i13;
        this.A0U = z8;
        this.A0I = str10;
        this.A0D = c26086BgF2;
        this.A0M = str11;
        this.A0N = str9;
        this.A07 = i10;
        this.A0L = str8;
        this.A06 = i9;
        this.A04 = i8;
        this.A0J = str6;
        this.A0C = null;
        this.A0Q = false;
        this.A0P = false;
        this.A0H = null;
        this.A0A = null;
        this.A0K = str7;
        this.A01 = f3;
        this.A0B = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C115475Kh() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, AbstractC115515Kl.A00, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2147483646, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }
}
