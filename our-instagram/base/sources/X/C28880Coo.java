package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Coo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28880Coo implements InterfaceC56272iG {
    public C59Z A00;
    public InterfaceC1128957x A01;
    public ArrayList A02;
    public final C56062hu A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final InterfaceC09390do A07;
    public final int[] A08;
    public final int[] A09;

    @Override // X.InterfaceC56272iG
    public final void APF() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r26.A0G == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0152, code lost:
    
        if (java.lang.Integer.valueOf(r1) == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0162, code lost:
    
        if (java.lang.Integer.valueOf(r1) == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bb, code lost:
    
        if (r1 == Integer.MIN_VALUE) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        if (r10 != false) goto L44;
     */
    @Override // X.InterfaceC56272iG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cp9(X.C56082hw r26, X.C56132i1 r27) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28880Coo.Cp9(X.2hw, X.2i1):void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.2i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2hu, X.2hw, X.2hv] */
    public C28880Coo() {
        ?? c56082hw = new C56082hw(0, 0);
        c56082hw.A00 = AbstractC166987dD.A1E();
        c56082hw.A09 = new C56122i0(c56082hw);
        C2i2 c2i2 = new C2i2(c56082hw);
        c56082hw.A0A = c2i2;
        c56082hw.A08 = null;
        c56082hw.A0H = false;
        c56082hw.A06 = new C56142i3();
        c56082hw.A00 = 0;
        c56082hw.A04 = 0;
        c56082hw.A0K = new C56252iE[4];
        c56082hw.A0J = new C56252iE[4];
        c56082hw.A01 = 257;
        c56082hw.A0I = false;
        c56082hw.A0G = false;
        c56082hw.A0E = null;
        c56082hw.A0C = null;
        c56082hw.A0D = null;
        c56082hw.A0B = null;
        c56082hw.A0F = AbstractC166987dD.A1H();
        c56082hw.A07 = new Object();
        c56082hw.A08 = this;
        c2i2.A02 = this;
        this.A03 = c56082hw;
        this.A06 = AbstractC166987dD.A1I();
        this.A05 = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1I();
        this.A07 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57514Pfo(this, 12));
        this.A09 = new int[2];
        this.A08 = new int[2];
        this.A02 = AbstractC166987dD.A1E();
    }

    public static final void A00(Integer num, int[] iArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        int i5;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        iArr[0] = i4;
                    } else {
                        throw AbstractC166987dD.A14(AnonymousClass001.A0R("FIXED", AbstractC43591JPw.A00(55)));
                    }
                } else {
                    if (z2 || (i3 == 1 ? i2 != 1 || z : i3 == 2)) {
                        z3 = true;
                        i5 = i;
                    } else {
                        z3 = false;
                        i5 = 0;
                    }
                    iArr[0] = i5;
                    if (!z3) {
                        i = i4;
                    }
                }
            } else {
                iArr[0] = 0;
            }
            iArr[1] = i4;
            return;
        }
        iArr[0] = i;
        iArr[1] = i;
    }
}
