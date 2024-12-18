package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* renamed from: X.2BK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BK implements C2BL {
    public String A00;
    public boolean A01 = false;
    public final C2B4 A02;
    public final AbrContextAwareConfiguration A03;
    public final C2BH A04;

    @Override // X.C2BL
    public final boolean Ejr() {
        return false;
    }

    private double A00(C93644Ip c93644Ip, int i, boolean z) {
        int systemicRiskOtherBitrate;
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A03;
        double systemicRiskBitrateBoostFactor = abrContextAwareConfiguration.getSystemicRiskBitrateBoostFactor(z);
        if (!abrContextAwareConfiguration.getSystemicRiskEnableDynamicOtherBitrate(z) || (systemicRiskOtherBitrate = c93644Ip.A00) <= 0) {
            systemicRiskOtherBitrate = abrContextAwareConfiguration.getSystemicRiskOtherBitrate(z);
        }
        return (i * systemicRiskBitrateBoostFactor) + systemicRiskOtherBitrate;
    }

    @Override // X.C2BL
    public final boolean CW0() {
        return this.A01;
    }

    public C2BK(C2B4 c2b4, AbrContextAwareConfiguration abrContextAwareConfiguration, C2BH c2bh, String str) {
        this.A04 = c2bh;
        this.A03 = abrContextAwareConfiguration;
        this.A02 = c2b4;
        this.A00 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x03f8, code lost:
    
        if (r54 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024e, code lost:
    
        if (r5 > r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0294, code lost:
    
        if (r8 > r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169 A[EDGE_INSN: B:122:0x0169->B:43:0x0169 BREAK  A[LOOP:1: B:31:0x00ed->B:36:0x013b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0380  */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.4Iz, java.lang.Object] */
    @Override // X.C2BL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4Iz AT7(X.C93644Ip r79, X.C4BV r80, X.C4B6 r81, java.util.Map r82, X.C4B6[] r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BK.AT7(X.4Ip, X.4BV, X.4B6, java.util.Map, X.4B6[], int, int):X.4Iz");
    }
}
