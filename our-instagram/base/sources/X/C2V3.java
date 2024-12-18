package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;

/* renamed from: X.2V3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2V3 {
    public static int DEFAULT_BACKGROUND_THREAD_PRIORITY = 5;
    public static final int DEFAULT_CHANGE_SET_THREAD_PRIORITY = 0;
    public static final boolean NEEDS_THEME_SYNCHRONIZATION = false;
    public static final boolean USE_INCREMENTAL_MOUNT_HELPER = true;
    public static boolean bindOnSameComponentTree = true;
    public static boolean boostPerfLayoutStateFuture = false;
    public static boolean clearEventHandlersAndTriggers = false;
    public static boolean computeRangeOnSyncLayout = false;
    public static boolean disableReleaseComponentTreeInRecyclerBinder = false;
    public static boolean enableComputeLayoutAsyncAfterInsertion = true;
    public static boolean enableFixForDisappearTransitionInRecyclerBinder = false;
    public static boolean enableFixForStickyHeader = false;
    public static boolean enableLoggingForInvalidAspectRatio = false;
    public static boolean enablePrimitiveMeasurementFix = false;
    public static boolean enableThreadTracingStacktrace = false;
    public static boolean forceEnableTransitionsForInstrumentationTests = false;
    public static int hostComponentPoolSize = 30;
    public static boolean initStickyHeaderInLayoutWhenComponentTreeIsNull = false;
    public static boolean isAnimationDisabled = false;
    public static boolean isEndToEndTestRun = false;
    public static boolean isEventHandlerRebindLoggingEnabled = false;
    public static boolean isYogaFlexBasisFixEnabled = true;
    public static boolean isZeroAlphaLoggingEnabled = false;
    public static boolean keepLayoutResults = false;
    public static int overlappingRenderingViewSizeLimit = Integer.MAX_VALUE;
    public static int partialAlphaWarningSizeThresold = Integer.MAX_VALUE;
    public static AbstractC72472XeO perfBoosterFactory = null;
    public static int recyclerBinderStrategy = 0;
    public static boolean reduceMemorySpikeDataDiffSection = false;
    public static boolean reduceMemorySpikeGetUri = false;
    public static boolean reduceMemorySpikeUserSession = false;
    public static boolean runLooperPrepareForLayoutThreadFactory = true;
    public static boolean shouldCompareCommonPropsInIsEquivalentTo;
    public static boolean shouldCompareRootCommonPropsInSingleComponentSection;
    public static boolean shouldOverrideHasTransientState;
    public static boolean useOneShotPreDrawListener;
    public static boolean usePrimitiveImage;
    public static boolean useSafeSpanEndInTextInputSpec;
    public boolean A00;
    public final C2V8 A01;
    public final C2VF A02;
    public final C2V6 A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final InterfaceC16660sJ A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
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
    public static final C2V4 Companion = new Object();
    public static C2V3 defaultInstance = new C2V3(C2V7.A00, null, C2V5.A00, null, C05F.A01, C05F.A00, null, null, true, false, false, false, false, false, true, true, false, false, false, false, false, false, false, true, true, true, false, false, false, true, false, false, false, false);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2V4, java.lang.Object] */
    static {
        boolean z = false;
        if (System.getProperty("IS_TESTING") != null) {
            z = true;
        }
        isEndToEndTestRun = z;
        isAnimationDisabled = "true".equals(System.getProperty("litho.animation.disabled"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2V3) {
                C2V3 c2v3 = (C2V3) obj;
                if (this.A0B != c2v3.A0B || this.A0P != c2v3.A0P || this.A0T != c2v3.A0T || this.A0U != c2v3.A0U || this.A0Y != c2v3.A0Y || !C14360o3.A0K(this.A02, c2v3.A02) || this.A09 != c2v3.A09 || this.A0M != c2v3.A0M || !C14360o3.A0K(this.A03, c2v3.A03) || this.A0X != c2v3.A0X || !C14360o3.A0K(this.A01, c2v3.A01) || !C14360o3.A0K(this.A07, c2v3.A07) || this.A05 != c2v3.A05 || this.A00 != c2v3.A00 || this.A0J != c2v3.A0J || this.A0C != c2v3.A0C || this.A0A != c2v3.A0A || this.A0L != c2v3.A0L || this.A0S != c2v3.A0S || this.A06 != c2v3.A06 || this.A0E != c2v3.A0E || this.A0G != c2v3.A0G || !C14360o3.A0K(this.A08, c2v3.A08) || this.A0W != c2v3.A0W || this.A0O != c2v3.A0O || this.A0I != c2v3.A0I || this.A0F != c2v3.A0F || this.A0H != c2v3.A0H || this.A0R != c2v3.A0R || this.A04 != c2v3.A04 || this.A0N != c2v3.A0N || this.A0K != c2v3.A0K || this.A0D != c2v3.A0D || this.A0V != c2v3.A0V) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str;
        int hashCode3;
        String str2;
        String str3;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A0P) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0T) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0U) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0Y) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        C2VF c2vf = this.A02;
        int i11 = 0;
        if (c2vf == null) {
            hashCode = 0;
        } else {
            hashCode = c2vf.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        int i13 = 1237;
        if (this.A09) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0M) {
            i15 = 1231;
        }
        int hashCode4 = (((i14 + i15) * 31) + this.A03.hashCode()) * 31;
        int i16 = 1237;
        if (this.A0X) {
            i16 = 1231;
        }
        int hashCode5 = (((hashCode4 + i16) * 31) + this.A01.hashCode()) * 31 * 31;
        String str4 = this.A07;
        if (str4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str4.hashCode();
        }
        int i17 = (hashCode5 + hashCode2) * 31;
        Integer num = this.A05;
        if (num == null) {
            hashCode3 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "LOG";
            } else {
                str = "CRASH";
            }
            hashCode3 = str.hashCode() + intValue;
        }
        int i18 = (i17 + hashCode3) * 31 * 31;
        int i19 = 1237;
        if (this.A00) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0J) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        int i23 = 1237;
        if (this.A0C) {
            i23 = 1231;
        }
        int i24 = (i22 + i23) * 31;
        int i25 = 1237;
        if (this.A0A) {
            i25 = 1231;
        }
        int i26 = (i24 + i25) * 31;
        int i27 = 1237;
        if (this.A0L) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0S) {
            i29 = 1231;
        }
        int i30 = (i28 + i29) * 31;
        int intValue2 = this.A06.intValue();
        if (1 != intValue2) {
            str2 = "SPLIT_BINDERS";
        } else {
            str2 = "DEFAULT";
        }
        int hashCode6 = (i30 + str2.hashCode() + intValue2) * 31;
        int i31 = 1237;
        if (this.A0E) {
            i31 = 1231;
        }
        int i32 = (hashCode6 + i31) * 31;
        int i33 = 1237;
        if (this.A0G) {
            i33 = 1231;
        }
        int i34 = (i32 + i33) * 31 * 31;
        InterfaceC16660sJ interfaceC16660sJ = this.A08;
        if (interfaceC16660sJ != null) {
            i11 = interfaceC16660sJ.hashCode();
        }
        int i35 = (i34 + i11) * 31;
        int i36 = 1237;
        if (this.A0W) {
            i36 = 1231;
        }
        int i37 = (i35 + i36) * 31;
        int i38 = 1237;
        if (this.A0O) {
            i38 = 1231;
        }
        int i39 = (i37 + i38) * 31;
        int i40 = 1237;
        if (this.A0I) {
            i40 = 1231;
        }
        int i41 = (i39 + i40) * 31;
        int i42 = 1237;
        if (this.A0F) {
            i42 = 1231;
        }
        int i43 = (i41 + i42) * 31;
        int i44 = 1237;
        if (this.A0H) {
            i44 = 1231;
        }
        int i45 = (i43 + i44) * 31;
        int i46 = 1237;
        if (this.A0R) {
            i46 = 1231;
        }
        int i47 = (i45 + i46) * 31;
        int intValue3 = this.A04.intValue();
        switch (intValue3) {
            case 1:
                str3 = "LAYOUT_SPECS";
                break;
            case 2:
                str3 = "SPECS";
                break;
            default:
                str3 = "DEFAULT";
                break;
        }
        int hashCode7 = (i47 + str3.hashCode() + intValue3) * 31;
        int i48 = 1237;
        if (this.A0N) {
            i48 = 1231;
        }
        int i49 = (hashCode7 + i48) * 31;
        int i50 = 1237;
        if (this.A0K) {
            i50 = 1231;
        }
        int i51 = (i49 + i50) * 31;
        int i52 = 1237;
        if (this.A0D) {
            i52 = 1231;
        }
        int i53 = (i51 + i52) * 31;
        int i54 = 1237;
        if (this.A0V) {
            i54 = 1231;
        }
        return i53 + i54;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentsConfiguration(disableNestedTreeCaching=");
        sb.append(this.A0B);
        sb.append(", shouldAddHostViewForRootComponent=");
        sb.append(this.A0P);
        sb.append(", useIncrementalMountGapWorker=");
        sb.append(this.A0T);
        sb.append(", useNonRebindingEventHandlers=");
        sb.append(this.A0U);
        sb.append(", shouldDisableBgFgOutputs=");
        sb.append(this.A0Y);
        sb.append(", preAllocationHandler=");
        sb.append(this.A02);
        sb.append(", avoidRedundantPreAllocations=");
        sb.append(this.A09);
        sb.append(", incrementalMountEnabled=");
        sb.append(this.A0M);
        sb.append(", componentHostPoolingPolicy=");
        sb.append(this.A03);
        sb.append(", visibilityProcessingEnabled=");
        sb.append(this.A0X);
        sb.append(", errorEventHandler=");
        sb.append(this.A01);
        sb.append(", componentsLogger=");
        sb.append((Object) null);
        sb.append(", logTag=");
        sb.append(this.A07);
        sb.append(", componentHostInvalidModificationPolicy=");
        Integer num = this.A05;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "LOG";
            } else {
                str = "CRASH";
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", debugEventListener=");
        sb.append((Object) null);
        sb.append(", enablePreAllocationSameThreadCheck=");
        sb.append(this.A00);
        sb.append(", enableSetLifecycleOwnerTreePropViaDefaultLifecycleOwner=");
        sb.append(this.A0J);
        sb.append(", enableDefaultLifecycleOwnerAsFragmentOrActivity=");
        sb.append(this.A0C);
        sb.append(", cloneStateListAnimators=");
        sb.append(this.A0A);
        sb.append(", enableVisibilityFixForNestedLithoView=");
        sb.append(this.A0L);
        sb.append(", useDefaultItemAnimatorInLazyCollections=");
        sb.append(this.A0S);
        sb.append(", primitiveRecyclerBinderStrategy=");
        if (1 - this.A06.intValue() != 0) {
            str2 = "SPLIT_BINDERS";
        } else {
            str2 = "DEFAULT";
        }
        sb.append(str2);
        sb.append(", enableFixForIM=");
        sb.append(this.A0E);
        sb.append(", enableLifecycleOwnerWrapper=");
        sb.append(this.A0G);
        sb.append(", visibilityBoundsTransformer=");
        sb.append((Object) null);
        sb.append(", sectionsRecyclerViewOnCreateHandler=");
        sb.append(this.A08);
        sb.append(", useStableIdsInRecyclerBinder=");
        sb.append(this.A0W);
        sb.append(", performExactSameSpecsCheck=");
        sb.append(this.A0O);
        sb.append(", enableResolveWithoutSizeSpec=");
        sb.append(this.A0I);
        sb.append(", enableHostWillNotDraw=");
        sb.append(this.A0F);
        sb.append(", enableLoggingForRenderInFlight=");
        sb.append(this.A0H);
        sb.append(", useComponentTreePropContainerAsSourceOfTruth=");
        sb.append(this.A0R);
        sb.append(", componentEqualityMode=");
        switch (this.A04.intValue()) {
            case 1:
                str3 = "LAYOUT_SPECS";
                break;
            case 2:
                str3 = "SPECS";
                break;
            default:
                str3 = "DEFAULT";
                break;
        }
        sb.append(str3);
        sb.append(", isHostViewAttributesCleanUpEnabled=");
        sb.append(this.A0N);
        sb.append(", enableSingleRunnableToReleaseTree=");
        sb.append(this.A0K);
        sb.append(", enableFixForCachedNestedTree=");
        sb.append(this.A0D);
        sb.append(", usePrimitiveVerticalScroll=");
        sb.append(this.A0V);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0072, code lost:
    
        if (r14 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2V3(X.C2V8 r2, X.C2VF r3, X.C2V6 r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, X.InterfaceC16660sJ r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            r1 = this;
            r1.<init>()
            r1.A0B = r10
            r1.A0P = r11
            r1.A0T = r12
            r1.A0U = r13
            r1.A0Y = r14
            r1.A02 = r3
            r1.A09 = r15
            r0 = r16
            r1.A0M = r0
            r1.A03 = r4
            r0 = r17
            r1.A0X = r0
            r1.A01 = r2
            r1.A07 = r8
            r1.A05 = r5
            r0 = r18
            r1.A00 = r0
            r0 = r19
            r1.A0J = r0
            r0 = r20
            r1.A0C = r0
            r0 = r21
            r1.A0A = r0
            r0 = r22
            r1.A0L = r0
            r0 = r23
            r1.A0S = r0
            r1.A06 = r6
            r0 = r24
            r1.A0E = r0
            r0 = r25
            r1.A0G = r0
            r1.A08 = r9
            r0 = r26
            r1.A0W = r0
            r0 = r27
            r1.A0O = r0
            r0 = r28
            r1.A0I = r0
            r0 = r29
            r1.A0F = r0
            r0 = r30
            r1.A0H = r0
            r0 = r31
            r1.A0R = r0
            r1.A04 = r7
            r0 = r32
            r1.A0N = r0
            r0 = r33
            r1.A0K = r0
            r0 = r34
            r1.A0D = r0
            r0 = r35
            r1.A0V = r0
            if (r11 != 0) goto L74
            r0 = 0
            if (r14 == 0) goto L75
        L74:
            r0 = 1
        L75:
            r1.A0Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2V3.<init>(X.2V8, X.2VF, X.2V6, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, X.0sJ, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static /* synthetic */ C2V3 A00(C2V8 c2v8, C2V3 c2v3, C2VF c2vf, C2V6 c2v6, Integer num, Integer num2, String str, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
        boolean z22 = z7;
        C2VF c2vf2 = c2vf;
        Integer num3 = num;
        boolean z23 = z14;
        String str2 = str;
        C2V6 c2v62 = c2v6;
        boolean z24 = z5;
        C2V8 c2v82 = c2v8;
        boolean z25 = z20;
        boolean z26 = z10;
        boolean z27 = z4;
        boolean z28 = z6;
        boolean z29 = z3;
        boolean z30 = z2;
        boolean z31 = z;
        boolean z32 = z9;
        boolean z33 = z11;
        boolean z34 = z12;
        boolean z35 = z8;
        Integer num4 = num2;
        InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
        boolean z36 = z15;
        boolean z37 = z16;
        boolean z38 = z17;
        boolean z39 = z18;
        boolean z40 = z13;
        boolean z41 = z19;
        boolean z42 = z21;
        boolean z43 = (i & 1) != 0 ? c2v3.A0B : false;
        if ((i & 2) != 0) {
            z31 = c2v3.A0P;
        }
        if ((i & 4) != 0) {
            z30 = c2v3.A0T;
        }
        boolean z44 = (i & 8) != 0 ? c2v3.A0U : false;
        if ((i & 16) != 0) {
            z29 = c2v3.A0Y;
        }
        if ((i & 32) != 0) {
            c2vf2 = c2v3.A02;
        }
        if ((i & 64) != 0) {
            z27 = c2v3.A09;
        }
        if ((i & 128) != 0) {
            z24 = c2v3.A0M;
        }
        if ((i & 256) != 0) {
            c2v62 = c2v3.A03;
        }
        if ((i & 512) != 0) {
            z28 = c2v3.A0X;
        }
        if ((i & 1024) != 0) {
            c2v82 = c2v3.A01;
        }
        if ((i & 4096) != 0) {
            str2 = c2v3.A07;
        }
        if ((i & 8192) != 0) {
            num3 = c2v3.A05;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z22 = c2v3.A00;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z35 = c2v3.A0J;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z32 = c2v3.A0C;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z26 = c2v3.A0A;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z33 = c2v3.A0L;
        }
        if ((i & 1048576) != 0) {
            z34 = c2v3.A0S;
        }
        if ((i & 2097152) != 0) {
            num4 = c2v3.A06;
        }
        if ((i & 4194304) != 0) {
            z40 = c2v3.A0E;
        }
        if ((i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            z23 = c2v3.A0G;
        }
        if ((i & 33554432) != 0) {
            interfaceC16660sJ2 = c2v3.A08;
        }
        if ((i & 67108864) != 0) {
            z36 = c2v3.A0W;
        }
        boolean z45 = (i & 134217728) != 0 ? c2v3.A0O : false;
        if ((i & 268435456) != 0) {
            z37 = c2v3.A0I;
        }
        if ((i & 536870912) != 0) {
            z38 = c2v3.A0F;
        }
        if ((i & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0) {
            z39 = c2v3.A0H;
        }
        boolean z46 = (i & Integer.MIN_VALUE) != 0 ? c2v3.A0R : false;
        Integer num5 = (i2 & 1) != 0 ? c2v3.A04 : null;
        if ((i2 & 2) != 0) {
            z41 = c2v3.A0N;
        }
        boolean z47 = (i2 & 4) != 0 ? c2v3.A0K : false;
        if ((i2 & 8) != 0) {
            z25 = c2v3.A0D;
        }
        if ((i2 & 16) != 0) {
            z42 = c2v3.A0V;
        }
        C14360o3.A0B(c2v62, 8);
        C14360o3.A0B(c2v82, 10);
        C14360o3.A0B(num4, 21);
        C14360o3.A0B(num5, 32);
        return new C2V3(c2v82, c2vf2, c2v62, num3, num4, num5, str2, interfaceC16660sJ2, z43, z31, z30, z44, z29, z27, z24, z28, z22, z35, z32, z26, z33, z34, z40, z23, z36, z45, z37, z38, z39, z46, z41, z47, z25, z42);
    }

    public C2V3() {
        this(C2V7.A00, null, C2V5.A00, null, C05F.A01, C05F.A00, null, null, true, false, false, false, false, false, true, true, false, false, false, false, false, false, false, true, true, true, false, false, false, true, false, false, false, false);
    }
}
