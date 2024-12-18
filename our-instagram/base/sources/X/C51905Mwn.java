package X;

import com.facebook.common.dextricks.Constants;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mwn */
/* loaded from: classes9.dex */
public final class C51905Mwn extends C0T6 implements InterfaceC57856PlM {
    public final C50627MWo A00;
    public final C51671Ms2 A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static /* synthetic */ C51905Mwn A01(C51905Mwn c51905Mwn) {
        return A00(null, null, c51905Mwn, null, null, null, 98303, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C51905Mwn A02(C51905Mwn c51905Mwn, List list, Map map, int i) {
        return A00(null, null, c51905Mwn, null, list, map, i, false, false, false, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51905Mwn) {
                C51905Mwn c51905Mwn = (C51905Mwn) obj;
                if (this.A05 != c51905Mwn.A05 || this.A0F != c51905Mwn.A0F || this.A0B != c51905Mwn.A0B || this.A0G != c51905Mwn.A0G || this.A0E != c51905Mwn.A0E || this.A0C != c51905Mwn.A0C || this.A0D != c51905Mwn.A0D || this.A0A != c51905Mwn.A0A || !C14360o3.A0K(this.A02, c51905Mwn.A02) || !C14360o3.A0K(this.A03, c51905Mwn.A03) || !C14360o3.A0K(this.A04, c51905Mwn.A04) || this.A06 != c51905Mwn.A06 || !C14360o3.A0K(this.A00, c51905Mwn.A00) || !C14360o3.A0K(this.A01, c51905Mwn.A01) || this.A07 != c51905Mwn.A07 || this.A08 != c51905Mwn.A08 || this.A09 != c51905Mwn.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C51905Mwn A00(C50627MWo c50627MWo, C51671Ms2 c51671Ms2, C51905Mwn c51905Mwn, List list, List list2, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        int i2;
        int i3;
        int i4;
        boolean z10 = z9;
        boolean z11 = z;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z4;
        boolean z15 = z5;
        List list3 = list;
        List list4 = list2;
        Map map2 = map;
        boolean z16 = z6;
        boolean z17 = z7;
        C51671Ms2 c51671Ms22 = c51671Ms2;
        boolean z18 = z8;
        if ((i & 1) != 0) {
            z11 = c51905Mwn.A05;
        }
        if ((i & 2) != 0) {
            z12 = c51905Mwn.A0F;
        }
        if ((i & 4) != 0) {
            z13 = c51905Mwn.A0B;
        }
        if ((i & 8) != 0) {
            z14 = c51905Mwn.A0G;
        }
        if ((i & 16) != 0) {
            i2 = c51905Mwn.A0E;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = c51905Mwn.A0C;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            i4 = c51905Mwn.A0D;
        } else {
            i4 = 0;
        }
        if ((i & 128) != 0) {
            z15 = c51905Mwn.A0A;
        }
        if ((i & 256) != 0) {
            list3 = c51905Mwn.A02;
        }
        if ((i & 512) != 0) {
            list4 = c51905Mwn.A03;
        }
        if ((i & 1024) != 0) {
            map2 = c51905Mwn.A04;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            z16 = c51905Mwn.A06;
        }
        if ((i & 4096) != 0) {
            c50627MWo = c51905Mwn.A00;
        }
        if ((i & 8192) != 0) {
            c51671Ms22 = c51905Mwn.A01;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z17 = c51905Mwn.A07;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z18 = c51905Mwn.A08;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z10 = c51905Mwn.A09;
        }
        C14360o3.A0B(list3, 8);
        AbstractC25229BEm.A1J(list4, 9, map2);
        boolean z19 = z11;
        boolean z20 = z12;
        return new C51905Mwn(c50627MWo, c51671Ms22, list3, list4, map2, i2, i3, i4, z19, z20, z13, z14, z15, z16, z17, z18, z10);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, (((AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A0A, (((((AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0F, AbstractC25225BEi.A08(this.A05)))) + this.A0E) * 31) + this.A0C) * 31) + this.A0D) * 31))))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31)));
    }

    public C51905Mwn(C50627MWo c50627MWo, C51671Ms2 c51671Ms2, List list, List list2, Map map, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A05 = z;
        this.A0F = z2;
        this.A0B = z3;
        this.A0G = z4;
        this.A0E = i;
        this.A0C = i2;
        this.A0D = i3;
        this.A0A = z5;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = map;
        this.A06 = z6;
        this.A00 = c50627MWo;
        this.A01 = c51671Ms2;
        this.A07 = z7;
        this.A08 = z8;
        this.A09 = z9;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallParticipantsViewModel(displayCompactly=");
        A1C.append(this.A05);
        A1C.append(", callControlsShown=");
        A1C.append(this.A0F);
        A1C.append(", useFloatingSelfView=");
        A1C.append(this.A0B);
        A1C.append(", detectBadFrames=");
        A1C.append(this.A0G);
        A1C.append(", selfViewTopOffsetPx=");
        A1C.append(this.A0E);
        A1C.append(", selfViewBottomOffsetPx=");
        A1C.append(this.A0C);
        A1C.append(", selfViewSideOffsetPx=");
        A1C.append(this.A0D);
        A1C.append(", showParticipantsView=");
        A1C.append(this.A0A);
        A1C.append(", floatingParticipantsList=");
        A1C.append(this.A02);
        A1C.append(", participantsList=");
        A1C.append(this.A03);
        A1C.append(", participantViewSizes=");
        A1C.append(this.A04);
        A1C.append(", shouldAnimateGridChanges=");
        A1C.append(this.A06);
        A1C.append(", gridLayoutStrategy=");
        A1C.append(this.A00);
        A1C.append(", gridFloatingLayoutConfig=");
        A1C.append(this.A01);
        A1C.append(", shouldRegisterViewPointManager=");
        A1C.append(this.A07);
        A1C.append(", shouldShowParticipantsOverlay=");
        A1C.append(this.A08);
        A1C.append(", shouldSwapPeerAndSelfViews=");
        return AbstractC25236BEt.A0a(A1C, this.A09);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51905Mwn() {
        /*
            r18 = this;
            r1 = 0
            r6 = 0
            X.0sl r3 = X.C16930sl.A00
            X.0sk r5 = X.AbstractC06930Yk.A0E()
            r14 = 1
            r0 = r18
            r2 = r1
            r4 = r3
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51905Mwn.<init>():void");
    }
}
