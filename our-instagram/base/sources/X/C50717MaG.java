package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Range;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.MaG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50717MaG extends U7W {
    public final UserSession A00;
    public final C47Z A01;

    public static final Range A00(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        String string = mediaFormat.getString("mime");
        if (string != null && (capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(string)) != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
            Range<Integer> complexityRange = encoderCapabilities.getComplexityRange();
            C14360o3.A07(complexityRange);
            if (complexityRange.getLower() != null && complexityRange.getUpper() != null && !C14360o3.A0K(complexityRange.getLower(), complexityRange.getUpper())) {
                return complexityRange;
            }
        }
        return null;
    }

    @Override // X.U7W
    public final int A0e() {
        return 90000;
    }

    @Override // X.U7W
    public final int A0h(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C14360o3.A0B(mediaCodec, 0);
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36600929612599371L);
        if (A07 > -1) {
            return A07;
        }
        Range A00 = A00(mediaCodec, mediaFormat);
        if (A00 == null) {
            return 0;
        }
        double A002 = C18U.A00(c06090Tz, userSession, 37163879565951279L);
        double A003 = MSW.A00(A00.getLower());
        int A0H = AbstractC166987dD.A0H(A00.getUpper());
        C14360o3.A07(A00.getLower());
        return C1H4.A00(A003 + ((A0H - AbstractC166987dD.A0H(r0)) * A002));
    }

    @Override // X.U7W
    public final String A0l() {
        return null;
    }

    @Override // X.U7W
    public final boolean A0w() {
        return true;
    }

    @Override // X.U7W
    public final boolean A10() {
        return true;
    }

    @Override // X.U7W
    public final boolean A11() {
        return true;
    }

    @Override // X.U7W
    public final boolean A1B() {
        return true;
    }

    @Override // X.U7W
    public final boolean A1E() {
        return true;
    }

    @Override // X.U7W
    public final boolean A1H() {
        return true;
    }

    @Override // X.U7W
    public final boolean A1M() {
        return true;
    }

    @Override // X.U7W
    public final boolean A1P() {
        return true;
    }

    @Override // X.U7W
    public final boolean A1V(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C14360o3.A0B(mediaCodec, 0);
        UserSession userSession = this.A00;
        if (C18U.A01(C06090Tz.A06, userSession, 36600929612599371L) > -1) {
            return true;
        }
        if (A00(mediaCodec, mediaFormat) != null) {
            return C18U.A06(C06090Tz.A05, userSession, 36319454635761097L);
        }
        return false;
    }

    @Override // X.U7W
    public final double A0a() {
        if (Build.VERSION.SDK_INT >= 31) {
            double A00 = C18U.A00(C06090Tz.A05, this.A00, 37165086452089218L);
            C14360o3.A0A(Double.valueOf(A00));
            return A00;
        }
        return -1.0d;
    }

    @Override // X.U7W
    public final float A0b() {
        return (float) C18U.A00(C06090Tz.A05, this.A00, 37175768035558014L);
    }

    @Override // X.U7W
    public final int A0c() {
        return AbstractC25225BEi.A07(C06090Tz.A05, this.A00, 36596720544647788L);
    }

    @Override // X.U7W
    public final int A0d() {
        return AbstractC25225BEi.A07(C06090Tz.A05, this.A00, 36612818082208161L);
    }

    @Override // X.U7W
    public final int A0f() {
        return AbstractC25225BEi.A07(C06090Tz.A05, this.A00, 36597643967662963L);
    }

    @Override // X.U7W
    public final int A0g() {
        return AbstractC25225BEi.A07(C06090Tz.A05, this.A00, 36597643967859572L);
    }

    @Override // X.U7W
    public final long A0i() {
        return C18U.A01(C06090Tz.A05, this.A00, 36597643965434738L);
    }

    @Override // X.U7W
    public final long A0j() {
        return C18U.A01(C06090Tz.A05, this.A00, 36598129294904442L);
    }

    @Override // X.U7W
    public final W95 A0k() {
        if (Build.VERSION.SDK_INT >= 31) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            return new W95(AbstractC25225BEi.A07(c06090Tz, userSession, 36602136498279004L), AbstractC25225BEi.A07(c06090Tz, userSession, 36602136498344541L), AbstractC25225BEi.A07(c06090Tz, userSession, 36602136498410078L), AbstractC25225BEi.A07(c06090Tz, userSession, 36602136498475615L), AbstractC25225BEi.A07(c06090Tz, userSession, 36602136498541152L), AbstractC25225BEi.A07(c06090Tz, userSession, 36602136498606689L));
        }
        return W95.A06;
    }

    @Override // X.U7W
    public final boolean A0m() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168990691412L);
    }

    @Override // X.U7W
    public final boolean A0n() {
        return C1LE.A0E(this.A00);
    }

    @Override // X.U7W
    public final boolean A0o() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168991084633L);
    }

    @Override // X.U7W
    public final boolean A0p() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168990167116L);
    }

    @Override // X.U7W
    public final boolean A0q() {
        return AbstractC167007dF.A1M(C18U.A06(C06090Tz.A06, this.A00, 36320000096608143L) ? 1 : 0);
    }

    @Override // X.U7W
    public final boolean A0r() {
        boolean z;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        boolean z2;
        C47Z c47z = this.A01;
        ShareType A0D = c47z.A0D();
        boolean z3 = true;
        if (A0D == ShareType.A0V || (A0D == ShareType.A0W && c47z.A14(ShareType.A02))) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = AbstractC16960so.A1Q(ShareType.A08, ShareType.A0H).contains(A0D);
        if (!z) {
            if (!AbstractC16960so.A1Q(ShareType.A0E, ShareType.A0F, ShareType.A0W).contains(A0D)) {
                z3 = false;
            }
            if (contains) {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                j = 36331343105311997L;
            } else if (z3) {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                j = 36331343105377534L;
            } else {
                z2 = false;
                return AbstractC31172DnG.A1b(z2);
            }
        } else {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 36331343105246460L;
        }
        z2 = AbstractC166997dE.A0c(c06090Tz, userSession, j);
        return AbstractC31172DnG.A1b(z2);
    }

    @Override // X.U7W
    public final boolean A0s() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168990101579L);
    }

    @Override // X.U7W
    public final boolean A0t() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168987676720L);
    }

    @Override // X.U7W
    public final boolean A0u() {
        return C18U.A06(C06090Tz.A05, this.A00, 36326884929190065L);
    }

    @Override // X.U7W
    public final boolean A0v() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168988790843L);
    }

    @Override // X.U7W
    public final boolean A0x() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989249598L);
    }

    @Override // X.U7W
    public final boolean A0y() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989184061L);
    }

    @Override // X.U7W
    public final boolean A0z() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168987938866L);
    }

    @Override // X.U7W
    public final boolean A12() {
        if (this.A01.A0D() == ShareType.A08) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36319373031382305L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.U7W
    public final boolean A13() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989577283L);
    }

    @Override // X.U7W
    public final boolean A14() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989642820L);
    }

    @Override // X.U7W
    public final boolean A15() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989577283L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r2.A02 == false) goto L30;
     */
    @Override // X.U7W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A18() {
        /*
            r13 = this;
            com.instagram.common.session.UserSession r3 = r13.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315245568068727(0x81048600040c77, double:3.029245754778793E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 0
            if (r0 == 0) goto L2e
            X.15G r2 = X.C15G.A00()
            java.lang.String r1 = r2.A01
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            boolean r0 = r2.A02
            if (r0 == 0) goto L80
        L2e:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315245567806581(0x81048600000c75, double:3.029245754613011E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L80
            r0 = 36315245568003190(0x81048600030c76, double:3.029245754737347E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L81
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            int r9 = r3.lastTrimLevel
            r2 = 1
            if (r9 == 0) goto L66
            r0 = 20
            if (r9 == r0) goto L66
            r0 = 40
            if (r9 == r0) goto L66
            r0 = 5
            if (r9 == r0) goto L66
            r0 = 60
            if (r9 == r0) goto L66
            r0 = 10
            if (r9 != r0) goto L67
        L66:
            r2 = 0
        L67:
            java.lang.String r1 = "OsMemoryState"
            if (r2 == 0) goto L81
            java.lang.String r5 = "level: "
            java.lang.String r6 = ", importance: "
            int r10 = r3.importance
            java.lang.String r7 = ", "
            int r11 = r3.importanceReasonCode
            java.lang.String r8 = ", lru: "
            int r12 = r3.lru
            java.lang.String r0 = X.AnonymousClass001.A10(r5, r6, r7, r8, r9, r10, r11, r12)
            X.C0w9.A03(r1, r0)
        L80:
            return r4
        L81:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50717MaG.A18():boolean");
    }

    @Override // X.U7W
    public final boolean A19() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316654317408856L);
    }

    @Override // X.U7W
    public final boolean A1A() {
        return C18U.A06(C06090Tz.A05, this.A00, 36319342966611136L);
    }

    @Override // X.U7W
    public final boolean A1C() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168987021351L);
    }

    @Override // X.U7W
    public final boolean A1F() {
        return C18U.A06(C06090Tz.A05, this.A00, 36322426753263854L);
    }

    @Override // X.U7W
    public final boolean A1G() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168991019096L);
    }

    @Override // X.U7W
    public final boolean A1I() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989970505L);
    }

    @Override // X.U7W
    public final boolean A1J() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168989904968L);
    }

    @Override // X.U7W
    public final boolean A1K() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168987873329L);
    }

    @Override // X.U7W
    public final boolean A1L() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168987873329L);
    }

    @Override // X.U7W
    public final boolean A1N() {
        return C18U.A06(C06090Tz.A05, this.A00, 36322246364506192L);
    }

    @Override // X.U7W
    public final boolean A1O() {
        return C18U.A06(C06090Tz.A05, this.A00, 36318093131192200L);
    }

    @Override // X.U7W
    public final boolean A1Q() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316168990429264L);
    }

    @Override // X.U7W
    public final boolean A1R() {
        return C18U.A06(C06090Tz.A05, this.A00, 36316654318260831L);
    }

    @Override // X.U7W
    public final boolean A1S() {
        return C18U.A06(C06090Tz.A05, this.A00, 36331343105574143L);
    }

    @Override // X.U7W
    public final boolean A1T() {
        return C18U.A06(C06090Tz.A05, this.A00, 36326631526119427L);
    }

    @Override // X.U7W
    public final boolean A1U() {
        return C18U.A06(C06090Tz.A05, this.A00, 36326631526184964L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (A12() == false) goto L6;
     */
    @Override // X.U7W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1W(boolean r5) {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316168986562594(0x81055d000c1022, double:3.0298297283526225E-306)
            boolean r3 = X.C18U.A06(r2, r3, r0)
            r2 = 1
            if (r5 == 0) goto L17
            boolean r1 = r4.A12()
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            if (r3 != 0) goto L1d
            if (r0 != 0) goto L1d
            r2 = 0
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50717MaG.A1W(boolean):boolean");
    }

    public C50717MaG(UserSession userSession, C47Z c47z) {
        this.A00 = userSession;
        this.A01 = c47z;
    }

    @Override // X.U7W
    public final boolean A16() {
        if ("mediatek".equals(C15G.A00().A01)) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36322121810520071L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.U7W
    public final boolean A17() {
        C15G.A00();
        return false;
    }

    @Override // X.U7W
    public final boolean A1D() {
        if ("mediatek".equals(C15G.A00().A01)) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36322121810454534L)) {
                return true;
            }
        }
        return false;
    }
}
