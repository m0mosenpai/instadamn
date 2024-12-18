package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.Sf7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63203Sf7 {
    public static final C63203Sf7 A03;
    public final int A00;
    public final int A01;
    public final ImmutableSet A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63203Sf7)) {
            return false;
        }
        C63203Sf7 c63203Sf7 = (C63203Sf7) obj;
        return this.A00 == c63203Sf7.A00 && this.A01 == c63203Sf7.A01 && Util.A0F(this.A02, c63203Sf7.A02);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001b. Please report as an issue. */
    static {
        /*
            int r1 = androidx.media3.common.util.Util.A01
            r4 = 10
            r3 = 2
            r0 = 33
            if (r1 < r0) goto L43
            X.1RF r2 = new X.1RF
            r2.<init>()
            r1 = 1
        Lf:
            r0 = 4
        L10:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04(r0)
            int r1 = r1 + 1
            if (r1 > r4) goto L39
            switch(r1) {
                case 1: goto Lf;
                case 2: goto L20;
                case 3: goto L23;
                case 4: goto L26;
                case 5: goto L29;
                case 6: goto L2c;
                case 7: goto L2f;
                case 8: goto L32;
                case 9: goto L1e;
                case 10: goto L35;
                default: goto L1e;
            }
        L1e:
            r0 = 0
            goto L10
        L20:
            r0 = 12
            goto L10
        L23:
            r0 = 28
            goto L10
        L26:
            r0 = 204(0xcc, float:2.86E-43)
            goto L10
        L29:
            r0 = 220(0xdc, float:3.08E-43)
            goto L10
        L2c:
            r0 = 252(0xfc, float:3.53E-43)
            goto L10
        L2f:
            r0 = 1276(0x4fc, float:1.788E-42)
            goto L10
        L32:
            r0 = 6396(0x18fc, float:8.963E-42)
            goto L10
        L35:
            r0 = 737532(0xb40fc, float:1.033502E-39)
            goto L10
        L39:
            com.google.common.collect.ImmutableSet r1 = r2.build()
            X.Sf7 r0 = new X.Sf7
            r0.<init>(r1, r3)
            goto L48
        L43:
            X.Sf7 r0 = new X.Sf7
            r0.<init>(r3, r4)
        L48:
            X.C63203Sf7.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63203Sf7.<clinit>():void");
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A02);
    }

    public C63203Sf7(java.util.Set set, int i) {
        this.A00 = i;
        ImmutableSet A032 = ImmutableSet.A03(set);
        this.A02 = A032;
        C1LC it = A032.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(AbstractC167007dF.A0B(it)));
        }
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioProfile[format=");
        A1C.append(this.A00);
        A1C.append(", maxChannelCount=");
        A1C.append(this.A01);
        A1C.append(", channelMasks=");
        A1C.append(this.A02);
        return AbstractC58319PtB.A0w(A1C);
    }

    public C63203Sf7(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = null;
    }
}
