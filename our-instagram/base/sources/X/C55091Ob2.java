package X;

/* renamed from: X.Ob2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55091Ob2 {
    public final android.net.Uri A00;
    public final EnumC53181Nfd A01;
    public final InterfaceC30840DhF A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55091Ob2) {
                C55091Ob2 c55091Ob2 = (C55091Ob2) obj;
                if (!C14360o3.A0K(this.A05, c55091Ob2.A05) || !C14360o3.A0K(this.A06, c55091Ob2.A06) || !C14360o3.A0K(this.A03, c55091Ob2.A03) || this.A01 != c55091Ob2.A01 || this.A0C != c55091Ob2.A0C || this.A0A != c55091Ob2.A0A || this.A08 != c55091Ob2.A08 || this.A07 != c55091Ob2.A07 || this.A0B != c55091Ob2.A0B || !C14360o3.A0K(this.A00, c55091Ob2.A00) || this.A04 != c55091Ob2.A04 || !C14360o3.A0K(this.A02, c55091Ob2.A02) || this.A09 != c55091Ob2.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(EnumC53181Nfd enumC53181Nfd, C55091Ob2 c55091Ob2, CharSequence charSequence, Object obj, C05A c05a) {
        String str = c55091Ob2.A05;
        String str2 = c55091Ob2.A06;
        boolean z = c55091Ob2.A0C;
        boolean z2 = c55091Ob2.A0A;
        boolean z3 = c55091Ob2.A08;
        boolean z4 = c55091Ob2.A07;
        boolean z5 = c55091Ob2.A0B;
        android.net.Uri uri = c55091Ob2.A00;
        Integer num = c55091Ob2.A04;
        InterfaceC30840DhF interfaceC30840DhF = c55091Ob2.A02;
        boolean z6 = c55091Ob2.A09;
        C14360o3.A0B(enumC53181Nfd, 3);
        return c05a.AIi(obj, new C55091Ob2(uri, enumC53181Nfd, interfaceC30840DhF, charSequence, num, str, str2, z, z2, z3, z4, z5, z6));
    }

    public final int hashCode() {
        String str;
        int A0D = (AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0C, AbstractC166997dE.A0J(this.A01, ((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31)))))) + AbstractC167017dG.A0M(this.A00)) * 31;
        int intValue = this.A04.intValue();
        if (1 != intValue) {
            str = "SMALL";
        } else {
            str = "NORMAL";
        }
        return AbstractC166987dD.A0K(this.A09, (AbstractC25231BEo.A0H(str, intValue, A0D) + AbstractC166997dE.A0I(this.A02)) * 31);
    }

    public C55091Ob2(android.net.Uri uri, EnumC53181Nfd enumC53181Nfd, InterfaceC30840DhF interfaceC30840DhF, CharSequence charSequence, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = charSequence;
        this.A01 = enumC53181Nfd;
        this.A0C = z;
        this.A0A = z2;
        this.A08 = z3;
        this.A07 = z4;
        this.A0B = z5;
        this.A00 = uri;
        this.A04 = num;
        this.A02 = interfaceC30840DhF;
        this.A09 = z6;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiVoiceSessionUiState(botTranscriptionToRender=");
        A1C.append(this.A05);
        A1C.append(", userTranscriptionTextToRender=");
        A1C.append(this.A06);
        A1C.append(", statusTextToRender=");
        A1C.append((Object) this.A03);
        A1C.append(", voiceSessionStatus=");
        A1C.append(this.A01);
        A1C.append(", showInstructionText=");
        A1C.append(this.A0C);
        A1C.append(", isUserInputMuted=");
        A1C.append(this.A0A);
        A1C.append(", isBotOutputMuted=");
        A1C.append(this.A08);
        A1C.append(", enableAudioButtons=");
        A1C.append(this.A07);
        A1C.append(", isVideoTurnedOff=");
        A1C.append(this.A0B);
        A1C.append(", backgroundUri=");
        A1C.append(this.A00);
        A1C.append(", animationViewSize=");
        if (1 - this.A04.intValue() != 0) {
            str = "SMALL";
        } else {
            str = "NORMAL";
        }
        A1C.append(str);
        A1C.append(", multimodalUIState=");
        A1C.append(this.A02);
        A1C.append(", isRenderableMultiModelResponse=");
        return AbstractC25236BEt.A0a(A1C, this.A09);
    }

    public C55091Ob2() {
        this(null, EnumC53181Nfd.A03, null, null, C05F.A01, null, null, false, false, false, false, true, false);
    }
}
