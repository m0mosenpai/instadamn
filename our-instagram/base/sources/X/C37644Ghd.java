package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.Ghd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37644Ghd extends C0T6 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final C51737MtK A09;
    public final C45127Jxw A0A;
    public final EnumC39550HdM A0B;
    public final EnumC39535Hd6 A0C;
    public final EnumC75193Zm A0D;
    public final C75113Zb A0E;
    public final C37648Ghh A0F;
    public final FollowStatus A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final C09530e4 A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37644Ghd) {
                C37644Ghd c37644Ghd = (C37644Ghd) obj;
                if (!C14360o3.A0K(this.A0J, c37644Ghd.A0J) || !C14360o3.A0K(this.A0I, c37644Ghd.A0I) || this.A0G != c37644Ghd.A0G || this.A0f != c37644Ghd.A0f || this.A0T != c37644Ghd.A0T || this.A0U != c37644Ghd.A0U || this.A0Y != c37644Ghd.A0Y || this.A0C != c37644Ghd.A0C || this.A0W != c37644Ghd.A0W || this.A0V != c37644Ghd.A0V || !C14360o3.A0K(this.A0E, c37644Ghd.A0E) || this.A0O != c37644Ghd.A0O || this.A0D != c37644Ghd.A0D || this.A08 != c37644Ghd.A08 || !C14360o3.A0K(this.A0A, c37644Ghd.A0A) || this.A0M != c37644Ghd.A0M || !C14360o3.A0K(this.A0H, c37644Ghd.A0H) || !C14360o3.A0K(this.A0F, c37644Ghd.A0F) || this.A0N != c37644Ghd.A0N || this.A0c != c37644Ghd.A0c || this.A0d != c37644Ghd.A0d || this.A0b != c37644Ghd.A0b || this.A0a != c37644Ghd.A0a || this.A0e != c37644Ghd.A0e || this.A0P != c37644Ghd.A0P || this.A0Z != c37644Ghd.A0Z || this.A0B != c37644Ghd.A0B || this.A0X != c37644Ghd.A0X || !C14360o3.A0K(this.A0K, c37644Ghd.A0K) || !C14360o3.A0K(this.A09, c37644Ghd.A09) || this.A0R != c37644Ghd.A0R || this.A0S != c37644Ghd.A0S || this.A0Q != c37644Ghd.A0Q || !C14360o3.A0K(this.A0L, c37644Ghd.A0L) || this.A07 != c37644Ghd.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int A06() {
        C75113Zb c75113Zb = this.A0E;
        if (c75113Zb != null) {
            return c75113Zb.getPosition();
        }
        return -1;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A0L, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0S, AbstractC167007dF.A0D(this.A0R, AbstractC166997dE.A0J(this.A09, (AbstractC167007dF.A0D(this.A0X, (AbstractC167007dF.A0D(this.A0Z, AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0e, AbstractC167007dF.A0D(this.A0a, AbstractC167007dF.A0D(this.A0b, AbstractC167007dF.A0D(this.A0d, AbstractC167007dF.A0D(this.A0c, AbstractC167007dF.A0D(this.A0N, (((AbstractC167007dF.A0D(this.A0M, (((AbstractC166997dE.A0J(this.A0D, AbstractC167007dF.A0D(this.A0O, (AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A0W, AbstractC166997dE.A0J(this.A0C, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0f, AbstractC166997dE.A0J(this.A0G, ((AbstractC167017dG.A0M(this.A0J) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31)))))))) + AbstractC167017dG.A0M(this.A0E)) * 31)) + this.A08) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31)))))))) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC25227BEk.A07(this.A0K)) * 31))))) + this.A07;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsItemState(lastUserPausedPositionMs=");
        A1C.append(this.A0J);
        A1C.append(", lastStoppedPositionMs=");
        A1C.append(this.A0I);
        A1C.append(", initialFollowStatus=");
        A1C.append(this.A0G);
        A1C.append(", shouldShowOnboardingNux=");
        A1C.append(this.A0f);
        A1C.append(", isOnboardingNuxDirectType=");
        A1C.append(this.A0T);
        A1C.append(", isOnboardingNuxDirectionSwipeUp=");
        A1C.append(this.A0U);
        A1C.append(", isTapToPausedByUser=");
        A1C.append(this.A0Y);
        A1C.append(", sfpltInputStatus=");
        A1C.append(this.A0C);
        A1C.append(AbstractC111324zv.A00(3397));
        A1C.append(this.A0W);
        A1C.append(AbstractC111324zv.A00(3391));
        A1C.append(this.A0V);
        A1C.append(", mediaStateReadOnly=");
        A1C.append(this.A0E);
        A1C.append(", isAcpDelivered=");
        A1C.append(this.A0O);
        A1C.append(", reportedType=");
        A1C.append(this.A0D);
        A1C.append(", numVideoLoops=");
        A1C.append(this.A08);
        A1C.append(", commentPreviews=");
        A1C.append(this.A0A);
        A1C.append(", commentPreviewsVisible=");
        A1C.append(this.A0M);
        A1C.append(", carouselIndexForVideoViewHolder=");
        A1C.append(this.A0H);
        A1C.append(", timeline=");
        A1C.append(this.A0F);
        A1C.append(", hasAutoAdvanceStarted=");
        A1C.append(this.A0N);
        A1C.append(", shouldShowDelayedSkipAdTimerInSponsoredLabel=");
        A1C.append(this.A0c);
        A1C.append(", shouldShowDelayedSkipAdsNextReelTimer=");
        A1C.append(this.A0d);
        A1C.append(", shouldShowDelayedSkipAdTimerAboveUsername=");
        A1C.append(this.A0b);
        A1C.append(", shouldShowColoredSnackBarStyledDelayedSkipAdTimer=");
        A1C.append(this.A0a);
        A1C.append(", shouldShowGreySnackBarStyledDelayedSkipAdTimer=");
        A1C.append(this.A0e);
        A1C.append(", isDelayedSkipAdScrolledUp=");
        A1C.append(this.A0P);
        A1C.append(", isVideoStoppedByStickerTap=");
        A1C.append(this.A0Z);
        A1C.append(", reminderAdCtaState=");
        A1C.append(this.A0B);
        A1C.append(AbstractC111324zv.A00(1427));
        A1C.append(this.A0X);
        A1C.append(AbstractC111324zv.A00(562));
        A1C.append(this.A0K);
        A1C.append(", multiAdsPlaybackInfo=");
        A1C.append(this.A09);
        A1C.append(", isFullscreenViewActive=");
        A1C.append(this.A0R);
        A1C.append(", isFullscreenViewNuxActive=");
        A1C.append(this.A0S);
        A1C.append(", isFanOutMenuActive=");
        A1C.append(this.A0Q);
        A1C.append(", fanOutMenuPosition=");
        A1C.append(this.A0L);
        A1C.append(", fanOutMenuHoverValue=");
        return AbstractC25236BEt.A0Z(A1C, this.A07);
    }

    public C37644Ghd(C51737MtK c51737MtK, C45127Jxw c45127Jxw, EnumC39550HdM enumC39550HdM, EnumC39535Hd6 enumC39535Hd6, EnumC75193Zm enumC75193Zm, C75113Zb c75113Zb, C37648Ghh c37648Ghh, FollowStatus followStatus, Integer num, Integer num2, Integer num3, String str, C09530e4 c09530e4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        this.A0J = num;
        this.A0I = num2;
        this.A0G = followStatus;
        this.A0f = z;
        this.A0T = z2;
        this.A0U = z3;
        this.A0Y = z4;
        this.A0C = enumC39535Hd6;
        this.A0W = z5;
        this.A0V = z6;
        this.A0E = c75113Zb;
        this.A0O = z7;
        this.A0D = enumC75193Zm;
        this.A08 = i;
        this.A0A = c45127Jxw;
        this.A0M = z8;
        this.A0H = num3;
        this.A0F = c37648Ghh;
        this.A0N = z9;
        this.A0c = z10;
        this.A0d = z11;
        this.A0b = z12;
        this.A0a = z13;
        this.A0e = z14;
        this.A0P = z15;
        this.A0Z = z16;
        this.A0B = enumC39550HdM;
        this.A0X = z17;
        this.A0K = str;
        this.A09 = c51737MtK;
        this.A0R = z18;
        this.A0S = z19;
        this.A0Q = z20;
        this.A0L = c09530e4;
        this.A07 = i2;
    }

    public static /* synthetic */ C37644Ghd A00(C45127Jxw c45127Jxw, EnumC39550HdM enumC39550HdM, EnumC39535Hd6 enumC39535Hd6, C37644Ghd c37644Ghd, EnumC75193Zm enumC75193Zm, Integer num, Integer num2, Integer num3, String str, C09530e4 c09530e4, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        int i5 = i2;
        C09530e4 c09530e42 = c09530e4;
        boolean z21 = z20;
        int i6 = i;
        EnumC75193Zm enumC75193Zm2 = enumC75193Zm;
        boolean z22 = z7;
        boolean z23 = z4;
        boolean z24 = z3;
        EnumC39535Hd6 enumC39535Hd62 = enumC39535Hd6;
        boolean z25 = z18;
        boolean z26 = z2;
        Integer num4 = num3;
        boolean z27 = z;
        boolean z28 = z6;
        C45127Jxw c45127Jxw2 = c45127Jxw;
        Integer num5 = num2;
        boolean z29 = z12;
        boolean z30 = z5;
        Integer num6 = num;
        boolean z31 = z8;
        boolean z32 = z9;
        boolean z33 = z10;
        boolean z34 = z14;
        boolean z35 = z13;
        boolean z36 = z15;
        boolean z37 = z16;
        boolean z38 = z11;
        boolean z39 = z17;
        String str2 = str;
        boolean z40 = z19;
        if ((i3 & 1) != 0) {
            num6 = c37644Ghd.A0J;
        }
        if ((i3 & 2) != 0) {
            num5 = c37644Ghd.A0I;
        }
        FollowStatus followStatus = (i3 & 4) != 0 ? c37644Ghd.A0G : null;
        if ((i3 & 8) != 0) {
            z27 = c37644Ghd.A0f;
        }
        if ((i3 & 16) != 0) {
            z26 = c37644Ghd.A0T;
        }
        if ((i3 & 32) != 0) {
            z24 = c37644Ghd.A0U;
        }
        if ((i3 & 64) != 0) {
            z23 = c37644Ghd.A0Y;
        }
        if ((i3 & 128) != 0) {
            enumC39535Hd62 = c37644Ghd.A0C;
        }
        if ((i3 & 256) != 0) {
            z30 = c37644Ghd.A0W;
        }
        if ((i3 & 512) != 0) {
            z28 = c37644Ghd.A0V;
        }
        C75113Zb c75113Zb = (i3 & 1024) != 0 ? c37644Ghd.A0E : null;
        if ((i3 & C3OO.FLAG_MOVED) != 0) {
            z22 = c37644Ghd.A0O;
        }
        if ((i3 & 4096) != 0) {
            enumC75193Zm2 = c37644Ghd.A0D;
        }
        if ((i3 & 8192) != 0) {
            i6 = c37644Ghd.A08;
        }
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            c45127Jxw2 = c37644Ghd.A0A;
        }
        if ((i3 & Constants.LOAD_RESULT_PGO) != 0) {
            z31 = c37644Ghd.A0M;
        }
        if ((i3 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            num4 = c37644Ghd.A0H;
        }
        C37648Ghh c37648Ghh = (i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? c37644Ghd.A0F : null;
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z32 = c37644Ghd.A0N;
        }
        if ((i3 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z33 = c37644Ghd.A0c;
        }
        if ((i3 & 1048576) != 0) {
            z38 = c37644Ghd.A0d;
        }
        if ((i3 & 2097152) != 0) {
            z29 = c37644Ghd.A0b;
        }
        if ((i3 & 4194304) != 0) {
            z35 = c37644Ghd.A0a;
        }
        if ((i3 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            z34 = c37644Ghd.A0e;
        }
        if ((i3 & 16777216) != 0) {
            z36 = c37644Ghd.A0P;
        }
        if ((i3 & 33554432) != 0) {
            z37 = c37644Ghd.A0Z;
        }
        if ((i3 & 67108864) != 0) {
            enumC39550HdM = c37644Ghd.A0B;
        }
        if ((i3 & 134217728) != 0) {
            z39 = c37644Ghd.A0X;
        }
        if ((i3 & 268435456) != 0) {
            str2 = c37644Ghd.A0K;
        }
        C51737MtK c51737MtK = (i3 & 536870912) != 0 ? c37644Ghd.A09 : null;
        if ((i3 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0) {
            z25 = c37644Ghd.A0R;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            z40 = c37644Ghd.A0S;
        }
        if ((i4 & 1) != 0) {
            z21 = c37644Ghd.A0Q;
        }
        if ((i4 & 2) != 0) {
            c09530e42 = c37644Ghd.A0L;
        }
        if ((i4 & 4) != 0) {
            i5 = c37644Ghd.A07;
        }
        AbstractC167007dF.A1H(followStatus, 2, enumC39535Hd62);
        C14360o3.A0B(enumC75193Zm2, 12);
        C14360o3.A0B(c51737MtK, 29);
        C14360o3.A0B(c09530e42, 33);
        return new C37644Ghd(c51737MtK, c45127Jxw2, enumC39550HdM, enumC39535Hd62, enumC75193Zm2, c75113Zb, c37648Ghh, followStatus, num6, num5, num4, str2, c09530e42, i6, i5, z27, z26, z24, z23, z30, z28, z22, z31, z32, z33, z38, z29, z35, z34, z36, z37, z39, z25, z40, z21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37644Ghd() {
        /*
            r36 = this;
            r2 = 0
            com.instagram.user.model.FollowStatus r8 = com.instagram.user.model.FollowStatus.A08
            r14 = 0
            r18 = 1
            X.Hd6 r4 = X.EnumC39535Hd6.A03
            X.3Zm r5 = X.EnumC75193Zm.A0F
            r0 = 7
            X.MtK r1 = new X.MtK
            r1.<init>(r0)
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.0e4 r13 = new X.0e4
            r13.<init>(r0, r0)
            r0 = r36
            r3 = r2
            r6 = r2
            r7 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r15 = r14
            r16 = r14
            r17 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r14
            r29 = r18
            r30 = r14
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r14
            r35 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37644Ghd.<init>():void");
    }
}
