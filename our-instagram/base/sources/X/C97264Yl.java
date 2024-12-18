package X;

import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ReverseNaturalOrdering;

/* renamed from: X.4Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97264Yl extends AbstractC97274Ym implements Comparable {
    public final int A00;
    public final C96394Ux A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if ((r1 & 1) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x008a, code lost:
    
        if (r14.apply(r9) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C97264Yl(X.C4WV r12, X.C96394Ux r13, X.InterfaceC28041Xi r14, int r15, int r16, int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97264Yl.<init>(X.4WV, X.4Ux, X.1Xi, int, int, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C97264Yl c97264Yl) {
        C4VF c4vf;
        C4VF A01;
        C4VF c4vf2;
        boolean z = this.A02;
        if (z && this.A0H) {
            c4vf = C4VA.A04;
            A01 = c4vf;
        } else {
            c4vf = C4VA.A04;
            A01 = c4vf.A01();
        }
        AbstractC58667Pzf A03 = AbstractC58667Pzf.A00.A03(this.A0H, c97264Yl.A0H);
        Integer valueOf = Integer.valueOf(this.A09);
        Integer valueOf2 = Integer.valueOf(c97264Yl.A09);
        ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.A00;
        AbstractC58667Pzf A02 = A03.A02(valueOf, valueOf2, reverseNaturalOrdering).A01(this.A0A, c97264Yl.A0A).A01(this.A0C, c97264Yl.A0C).A03(this.A0G, c97264Yl.A0G).A03(this.A0F, c97264Yl.A0F).A02(Integer.valueOf(this.A07), Integer.valueOf(c97264Yl.A07), reverseNaturalOrdering).A01(this.A08, c97264Yl.A08).A03(z, c97264Yl.A02).A02(Integer.valueOf(this.A0B), Integer.valueOf(c97264Yl.A0B), reverseNaturalOrdering);
        Integer valueOf3 = Integer.valueOf(this.A05);
        Integer valueOf4 = Integer.valueOf(c97264Yl.A05);
        if (this.A01.A0O) {
            c4vf2 = c4vf.A01();
        } else {
            c4vf2 = C4VA.A05;
        }
        AbstractC58667Pzf A022 = A02.A02(valueOf3, valueOf4, c4vf2).A03(this.A04, c97264Yl.A04).A03(this.A03, c97264Yl.A03).A02(Integer.valueOf(this.A06), Integer.valueOf(c97264Yl.A06), A01).A02(Integer.valueOf(this.A0D), Integer.valueOf(c97264Yl.A0D), A01);
        if (!Util.A0I(this.A0E, c97264Yl.A0E)) {
            A01 = C4VA.A05;
        }
        return A022.A02(valueOf3, valueOf4, A01).A00();
    }
}
