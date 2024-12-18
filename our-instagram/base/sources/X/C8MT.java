package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.LinkedHashSet;

/* renamed from: X.8MT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MT implements InterfaceC185708Lp, InterfaceC185718Lq {
    public float A00;
    public float A01;
    public FilterModel A02;
    public C224089ur A03;
    public C199388rf A04;
    public TransformMatrixConfig A05;
    public C8DL A06;
    public InterfaceC16820sZ A07;
    public InterfaceC16600sD A08;
    public boolean A09;
    public long A0A;
    public final ViewGroup A0B;
    public final UserSession A0C;
    public final TargetViewSizeProvider A0D;
    public final AnonymousClass840 A0E;
    public final C8MU A0F;
    public final java.util.Set A0G;
    public final C131405wV A0H;

    public C8MT(ViewGroup viewGroup, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(viewGroup, 3);
        C14360o3.A0B(targetViewSizeProvider, 4);
        this.A0E = anonymousClass840;
        this.A0C = userSession;
        this.A0B = viewGroup;
        this.A0D = targetViewSizeProvider;
        this.A0G = new LinkedHashSet();
        this.A0F = new C8MU();
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        this.A0H = new C131405wV(context);
        this.A00 = 1.0f;
        this.A01 = 1.0f;
    }

    public static final float A01(C8MT c8mt, int i, int i2, int i3) {
        EnumC171727l2 enumC171727l2;
        C55U c55u;
        int i4 = i2;
        C1815483h c1815483h = c8mt.A0E.A02.A01;
        AbstractC172157lk abstractC172157lk = c1815483h.A06;
        if (abstractC172157lk instanceof C172147lj) {
            enumC171727l2 = ((C172147lj) abstractC172157lk).A00;
        } else {
            enumC171727l2 = null;
        }
        if (enumC171727l2 != null) {
            boolean z = false;
            if (i3 % 180 != 0) {
                z = true;
            }
            C1810981l c1810981l = c1815483h.A0Y;
            if (c1810981l != null) {
                c55u = (C55U) c1810981l.A08.A00;
            } else {
                c55u = null;
            }
            C1816283r c1816283r = c1815483h.A0i;
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8mt.A0D).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            int i5 = i;
            if (z) {
                i5 = i2;
                i4 = i;
            }
            return A03.A00(c55u, c1816283r, enumC171727l2, width, height, i5, i4, true);
        }
        C38321qM c38321qM = c1815483h.A08;
        if (c38321qM != null && c38321qM.A63()) {
            if (!C18U.A06(C06090Tz.A05, c8mt.A0C, 36327653728533249L)) {
                return 0.7f;
            }
        }
        if (c1815483h.A04 != null) {
            UserSession userSession = c8mt.A0C;
            if (!AbstractC25351Lp.A03(userSession)) {
                if (!AbstractC23021Ah.A00(userSession).A21()) {
                    return 0.7f;
                }
                return 1.0f;
            }
        }
        if (c1815483h.A0A != null) {
            return 0.5f;
        }
        C1815983m c1815983m = c1815483h.A0Z;
        if (c1815983m != null) {
            float f = 0.67f;
            if (c1815983m.A08) {
                f = 1.0f;
            }
            return f * 0.8f;
        }
        if (c1815483h.A0g != null) {
            return 0.67f;
        }
        if (c1815483h.A0s) {
            InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) c8mt.A0D).A0K;
            int width2 = interfaceC1812882f2.getWidth();
            int height2 = interfaceC1812882f2.getHeight();
            int i6 = i2;
            if (i3 % 180 != 0) {
                i6 = i;
                i = i2;
            }
            float f2 = i / i6;
            if (f2 <= width2 / height2) {
                return 1.0f;
            }
            return Math.max(f2, 1.0f);
        }
        return 1.0f;
    }

    @Override // X.InterfaceC185708Lp
    public final void DiI(float f) {
        String str;
        A02();
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (A04() && transformMatrixConfig != null) {
            float A00 = A00(f);
            if (A05(transformMatrixConfig, Float.valueOf(A00), null, null, null)) {
                if (this.A09) {
                    C22C A01 = AnonymousClass229.A01(this.A0C);
                    boolean z = false;
                    if (transformMatrixConfig.A08.A01 > A00) {
                        z = true;
                    }
                    C448124l c448124l = A01.A09;
                    C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                    if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
                        if (z) {
                            str = "ZOOM_IN";
                        } else {
                            str = "ZOOM_OUT";
                        }
                        A08.A0s("IG_CAMERA_ENTITY_TAP");
                        A08.A0q(str);
                        C448124l.A00(A08, c448124l);
                        A08.A0a(c448124l.A0J());
                        C22M c22m = c448124l.A04;
                        A08.A0b(c22m.A09);
                        A08.A0T();
                        A08.A0U();
                        A08.A0m(C22F.A08.getModuleName());
                        A08.A0c(c22m.A0A);
                        A08.A0t(C1QM.A00.A02.A00);
                        A08.A0O("is_timeline", true);
                        A08.Cht();
                    }
                }
                AnonymousClass229.A01(this.A0C).A29(this.A09);
                transformMatrixConfig.A08.A01 = A00;
                A03(this);
            }
        }
    }

    @Override // X.InterfaceC185708Lp
    public final void Dim(float f, float f2) {
        A02();
        if (A04()) {
            TransformMatrixConfig transformMatrixConfig = this.A05;
            if (transformMatrixConfig != null) {
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                float f3 = transformMatrixParams.A02 * transformMatrixConfig.A07;
                float f4 = this.A00;
                if (A05(transformMatrixConfig, null, null, Float.valueOf(f3 + (f4 * f)), Float.valueOf((transformMatrixParams.A03 * transformMatrixConfig.A06) + (f4 * f2)))) {
                    TransformMatrixParams transformMatrixParams2 = transformMatrixConfig.A08;
                    float f5 = transformMatrixParams2.A02 * transformMatrixConfig.A07;
                    float f6 = this.A00;
                    transformMatrixConfig.A04(f5 + (f * f6));
                    transformMatrixConfig.A05((transformMatrixParams2.A03 * transformMatrixConfig.A06) + (f2 * f6));
                    AnonymousClass229.A01(this.A0C).A29(this.A09);
                    A03(this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final float A00(float f) {
        float f2 = this.A01;
        float f3 = 5.0f / f2;
        float f4 = 0.3f / f2;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            return Math.min(f3, Math.max(f4, f * transformMatrixConfig.A08.A01));
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02() {
        C8DL c8dl = this.A06;
        if (c8dl != null) {
            if (A08() == C8DM.A09 || A08() == C8DM.A0A) {
                c8dl.A02.Egh(C8DM.A0B);
            }
        }
    }

    public static final void A03(C8MT c8mt) {
        TransformMatrixConfig transformMatrixConfig = c8mt.A05;
        if (transformMatrixConfig != null) {
            transformMatrixConfig.A03();
            FilterModel filterModel = c8mt.A02;
            if (filterModel != null) {
                AbstractC199788sU.A01(filterModel, transformMatrixConfig.C6v());
            }
            for (InterfaceC1830389y interfaceC1830389y : c8mt.A0G) {
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                interfaceC1830389y.DvK(transformMatrixParams.A01, transformMatrixParams.A00, transformMatrixParams.A02 * transformMatrixConfig.A07, transformMatrixParams.A03 * transformMatrixConfig.A06);
            }
        }
    }

    private final boolean A04() {
        C199388rf c199388rf = this.A04;
        boolean z = true;
        if (c199388rf == null || !c199388rf.A00) {
            z = false;
        }
        if (z && this.A0E.A02.A01.A04() != null) {
            if (this.A05 == null) {
                String A0R = AnonymousClass001.A0R("FreeTransformVideoController", "_transform_matrix_is_null");
                String obj = this.A0F.A01.toString();
                C14360o3.A07(obj);
                AbstractC12120kG.A07(A0R, obj, null);
            } else {
                return true;
            }
        }
        return false;
    }

    private final boolean A05(TransformMatrixConfig transformMatrixConfig, Float f, Float f2, Float f3, Float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f != null) {
            f5 = f.floatValue();
        } else {
            f5 = transformMatrixConfig.A08.A01;
        }
        if (f2 != null) {
            f6 = f2.floatValue();
        } else {
            f6 = transformMatrixConfig.A08.A00;
        }
        if (f3 != null) {
            f7 = f3.floatValue() / transformMatrixConfig.A07;
        } else {
            f7 = transformMatrixConfig.A08.A02;
        }
        if (f4 != null) {
            f8 = f4.floatValue() / transformMatrixConfig.A06;
        } else {
            f8 = transformMatrixConfig.A08.A03;
        }
        InterfaceC16600sD interfaceC16600sD = this.A08;
        if (interfaceC16600sD != null) {
            return ((Boolean) interfaceC16600sD.invoke(Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8))).booleanValue();
        }
        return true;
    }

    public final TransformMatrixConfig A06(AGH agh, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        float f;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (z) {
            if (transformMatrixConfig == null) {
                return null;
            }
            Integer num = agh.A03;
            if (num != null) {
                i = num.intValue();
            } else {
                i = transformMatrixConfig.A05;
            }
            Integer num2 = agh.A02;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = transformMatrixConfig.A03;
            }
            int i5 = transformMatrixConfig.A04;
            Integer num3 = agh.A05;
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = transformMatrixConfig.A07;
            }
            Integer num4 = agh.A04;
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = transformMatrixConfig.A06;
            }
            Boolean bool = agh.A00;
            if (bool != null) {
                z4 = bool.booleanValue();
            } else {
                z4 = transformMatrixConfig.A08.A04;
            }
            Integer num5 = C05F.A00;
            TransformMatrixConfig transformMatrixConfig2 = new TransformMatrixConfig(new TransformMatrixParams(num5, num5, 1.0f, 0.0f, 0.0f, 0.0f, z4), transformMatrixConfig.A09, i, i2, i5, i3, i4, transformMatrixConfig.A0A, transformMatrixConfig.A0F, transformMatrixConfig.A0C, transformMatrixConfig.A0G, transformMatrixConfig.A0D, transformMatrixConfig.A0E);
            transformMatrixConfig2.A08.A00(transformMatrixConfig.A08);
            Float f2 = agh.A01;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = transformMatrixConfig.A08.A01;
            }
            transformMatrixConfig2.A08.A01 = f;
            transformMatrixConfig2.A03();
            return transformMatrixConfig2;
        }
        return AbstractC197458oG.A01(transformMatrixConfig, agh, !z2, z3, false);
    }

    public final C198988qy A07() {
        TransformMatrixParams transformMatrixParams;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            transformMatrixParams = transformMatrixConfig.A08;
        } else {
            Integer num = C05F.A00;
            transformMatrixParams = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        }
        C198988qy c198988qy = new C198988qy(true, new C203428yz(transformMatrixParams));
        C14360o3.A0A(c198988qy);
        return c198988qy;
    }

    public final C8DM A08() {
        C8DL c8dl = this.A06;
        if (c8dl != null) {
            return (C8DM) c8dl.A00.A02();
        }
        return null;
    }

    public final void A09(float f, float f2, float f3, float f4) {
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            A02();
            transformMatrixConfig.A04(f3 * transformMatrixConfig.A07);
            transformMatrixConfig.A05(f4 * transformMatrixConfig.A06);
            TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
            transformMatrixParams.A01 = f;
            transformMatrixParams.A00 = f2;
            A03(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1.A0S != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(int r26, int r27, int r28, boolean r29) {
        /*
            r25 = this;
            r2 = r25
            X.840 r0 = r2.A0E
            X.83z r0 = r0.A02
            X.83h r1 = r0.A01
            boolean r0 = r1.A0T
            if (r0 != 0) goto L15
            boolean r0 = r1.A0U
            if (r0 != 0) goto L15
            boolean r0 = r1.A0S
            r5 = 0
            if (r0 == 0) goto L16
        L15:
            r5 = 1
        L16:
            android.view.ViewGroup r0 = r2.A0B
            android.content.Context r4 = r0.getContext()
            X.C14360o3.A07(r4)
            com.instagram.common.session.UserSession r3 = r2.A0C
            r9 = r26
            r10 = r27
            if (r5 == 0) goto La9
            r12 = r9
            r13 = r10
        L29:
            r11 = r28
            float r0 = A01(r2, r9, r10, r11)
            X.C6PX.A01(r3)
            r15 = 0
            r16 = 1
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            java.lang.Integer r18 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r17 = r7
            r19 = r18
            r22 = r21
            r23 = r21
            r24 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r8 = "video"
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r6 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig
            r14 = r29
            r17 = r15
            r18 = r16
            r19 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r3 = r6.A08
            r3.A01 = r0
            X.8MU r3 = r2.A0F
            java.lang.String r0 = "setupInitialTransformScale initialized"
            r3.A00(r0)
            boolean r0 = r1.A0K
            if (r0 == 0) goto L77
            android.content.res.Resources r3 = r4.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r3.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r6.A05(r0)
        L77:
            X.7lk r1 = r1.A06
            boolean r0 = r1 instanceof X.C172147lj
            if (r0 == 0) goto L9c
            X.7lj r1 = (X.C172147lj) r1
            X.7l2 r5 = r1.A00
            if (r5 == 0) goto L9c
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r2.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.82f r0 = r0.A0K
            int r4 = r0.getWidth()
            int r3 = r0.getHeight()
            X.7l2 r0 = X.EnumC171727l2.A04
            r1 = 1082130432(0x40800000, float:4.0)
            if (r0 != r5) goto L9f
            float r0 = (float) r4
            float r0 = r0 / r1
            r6.A04(r0)
        L9c:
            r2.A05 = r6
            return
        L9f:
            X.7l2 r0 = X.EnumC171727l2.A05
            if (r0 != r5) goto L9c
            float r0 = (float) r3
            float r0 = r0 / r1
            r6.A05(r0)
            goto L9c
        La9:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r2.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.82f r0 = r0.A0K
            int r12 = r0.getWidth()
            int r13 = r0.getHeight()
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8MT.A0A(int, int, int, boolean):void");
    }

    public final void A0B(C8DL c8dl) {
        int i;
        int i2;
        Object obj;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            this.A06 = c8dl;
            if (transformMatrixConfig.A04 % 180 == 0) {
                i = transformMatrixConfig.A05;
                i2 = transformMatrixConfig.A03;
            } else {
                i = transformMatrixConfig.A03;
                i2 = transformMatrixConfig.A05;
            }
            float f = 1.0f;
            float f2 = (i * 1.0f) / i2;
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A0D).A0K;
            float width = (interfaceC1812882f.getWidth() * 1.0f) / interfaceC1812882f.getHeight();
            if (f2 >= 0.01f + width) {
                C8DL c8dl2 = this.A06;
                if (c8dl2 != null) {
                    obj = c8dl2.A00.A02();
                } else {
                    obj = null;
                }
                if (obj == C8DM.A02) {
                    f = f2 / width;
                }
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                if (transformMatrixParams.A01 != f) {
                    transformMatrixParams.A01 = Math.min(5.0f, Math.max(0.3f, f));
                    A03(this);
                }
            }
        }
    }

    @Override // X.InterfaceC185718Lq
    public final TransformMatrixConfig CAZ() {
        return this.A05;
    }

    @Override // X.InterfaceC185708Lp
    public final void DhU(float f) {
        A02();
        if (A04()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f2 = -f;
            float f3 = f2 / ((float) (elapsedRealtime - this.A0A));
            C131405wV c131405wV = this.A0H;
            if (!c131405wV.A0I) {
                ViewGroup viewGroup = this.A0B;
                Rect rect = new Rect();
                rect.set(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
                c131405wV.A07(rect);
            }
            TransformMatrixConfig transformMatrixConfig = this.A05;
            if (transformMatrixConfig != null) {
                if (c131405wV.A0I) {
                    Rect rect2 = c131405wV.A0P;
                    float centerX = (transformMatrixConfig.A08.A02 * transformMatrixConfig.A07) + rect2.centerX();
                    if (c131405wV.A0I) {
                        float centerY = rect2.centerY();
                        TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                        float A05 = c131405wV.A05(centerX, (transformMatrixParams.A03 * transformMatrixConfig.A06) + centerY, f3, transformMatrixParams.A00, f2);
                        if (A05(transformMatrixConfig, null, Float.valueOf(A05), null, null)) {
                            transformMatrixConfig.A08.A00 = A05;
                            if (this.A09) {
                                C448124l c448124l = AnonymousClass229.A01(this.A0C).A09;
                                C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                                if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
                                    A08.A0s("IG_CAMERA_ENTITY_TAP");
                                    A08.A0q("ROTATE");
                                    C448124l.A00(A08, c448124l);
                                    A08.A0a(c448124l.A0J());
                                    C22M c22m = c448124l.A04;
                                    A08.A0b(c22m.A09);
                                    A08.A0T();
                                    A08.A0U();
                                    A08.A0m(C22F.A08.getModuleName());
                                    A08.A0c(c22m.A0A);
                                    A08.A0t(C1QM.A00.A02.A00);
                                    A08.A0O("is_timeline", true);
                                    A08.Cht();
                                }
                            }
                            AnonymousClass229.A01(this.A0C).A29(this.A09);
                            this.A0A = elapsedRealtime;
                            A03(this);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Cannot get bounds which have not been set yet");
                }
                throw new IllegalStateException("Cannot get bounds which have not been set yet");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC185708Lp
    public final void DiO(float f) {
        if (A04()) {
            float A00 = A00(f);
            C1815783k c1815783k = this.A0E.A02.A01.A04;
            if (c1815783k != null) {
                if (C18U.A06(C06090Tz.A05, this.A0C, 36322924969339629L)) {
                    if (A00 >= 0.8f) {
                        c1815783k.A00();
                    } else if (C14360o3.A0K(c1815783k.A05.A02(), true)) {
                        c1815783k.A01();
                    }
                }
            }
            InterfaceC16820sZ interfaceC16820sZ = this.A07;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        }
    }
}
