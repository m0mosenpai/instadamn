package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185698Lo implements InterfaceC185708Lp, InterfaceC185718Lq {
    public C199388rf A00;
    public TransformMatrixConfig A01;
    public TransformMatrixConfig A02;
    public C8MA A03;
    public long A04;
    public C8DL A05;
    public final int A06;
    public final int A07;
    public final UserSession A08;
    public final AnonymousClass840 A09;
    public final List A0A = new ArrayList();
    public final ViewGroup A0B;
    public final TargetViewSizeProvider A0C;
    public final C131405wV A0D;

    private float A00(float f) {
        TransformMatrixConfig transformMatrixConfig = this.A01;
        if (transformMatrixConfig != null) {
            return Math.min(5.0f, Math.max(0.3f, f * Float.valueOf(transformMatrixConfig.A08.A01).floatValue()));
        }
        return 1.0f;
    }

    public static void A02(C185698Lo c185698Lo) {
        C199388rf c199388rf = c185698Lo.A00;
        if (c199388rf != null && c199388rf.A00) {
            C1815483h c1815483h = c185698Lo.A09.A02.A01;
            if (c1815483h.A03() != null) {
                if (c1815483h.A02() == null || c1815483h.A02().A0D) {
                    c185698Lo.A06();
                    C8MA c8ma = c185698Lo.A03;
                    c8ma.getClass();
                    c8ma.EGV();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03() {
        /*
            r3 = this;
            X.8rf r0 = r3.A00
            if (r0 == 0) goto L9
            boolean r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto La
        L9:
            r0 = 0
        La:
            r2 = 0
            if (r0 == 0) goto L24
            X.840 r0 = r3.A09
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            X.8Ee r0 = r0.A03()
            if (r0 == 0) goto L24
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r3.A01
            if (r0 != 0) goto L25
            java.lang.String r1 = "FreeTransformPhotoController"
            java.lang.String r0 = "mTransformMatrixConfig is null"
            X.AbstractC12120kG.A01(r1, r0)
        L24:
            return r2
        L25:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185698Lo.A03():boolean");
    }

    public final Rect A04() {
        int i;
        int i2;
        TransformMatrixConfig transformMatrixConfig = this.A01;
        if (transformMatrixConfig != null && Math.abs(transformMatrixConfig.A08.A00) < 0.1f) {
            if (transformMatrixConfig.A04 % 180 == 0) {
                i = transformMatrixConfig.A05;
                i2 = transformMatrixConfig.A03;
            } else {
                i = transformMatrixConfig.A03;
                i2 = transformMatrixConfig.A05;
            }
            Rect rect = new Rect();
            float f = i;
            float f2 = (this.A07 * 1.0f) / f;
            TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
            float f3 = transformMatrixParams.A01;
            float f4 = (0.5f - (0.5f / f3)) * f;
            float f5 = ((transformMatrixParams.A02 * transformMatrixConfig.A07) / f2) / f3;
            rect.left = Math.round(Math.min(f, Math.max(0.0f, f4 - f5)));
            rect.right = Math.round(Math.max(0.0f, Math.min(f, (f - f4) - f5)));
            float f6 = i2;
            float f7 = (0.5f - (0.5f / (((f6 * f2) / this.A06) * f3))) * f6;
            float f8 = ((transformMatrixParams.A03 * transformMatrixConfig.A06) / f2) / f3;
            rect.top = Math.round(Math.min(f6, Math.max(0.0f, f7 - f8)));
            rect.bottom = Math.round(Math.max(0.0f, Math.min(f6, (f6 - f7) - f8)));
            return rect;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36327653728533249L) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (X.AbstractC23021Ah.A00(r1).A21() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig A05(X.C183978Ee r13) {
        /*
            r12 = this;
            int r7 = r12.A07
            int r8 = r12.A06
            boolean r0 = r13.A0y
            if (r0 == 0) goto Lc
            boolean r0 = r13.A1A
            if (r0 != 0) goto L13
        Lc:
            X.840 r0 = r12.A09
            X.83z r0 = r0.A02
            r0.A0G()
        L13:
            X.840 r0 = r12.A09
            X.83z r0 = r0.A02
            X.83h r5 = r0.A01
            X.7lk r1 = r5.A06
            boolean r0 = r1 instanceof X.C172147lj
            if (r0 == 0) goto L99
            X.7lj r1 = (X.C172147lj) r1
            X.7l2 r6 = r1.A00
        L23:
            r3 = 1060320051(0x3f333333, float:0.7)
            if (r6 == 0) goto L61
            int r0 = r13.A07
            int r0 = r0 % 180
            r3 = 0
            if (r0 == 0) goto L30
            r3 = 1
        L30:
            android.graphics.Rect r1 = r13.A00()
            int r0 = r13.A06
            int r2 = X.AbstractC197468oH.A00(r0, r1)
            android.graphics.Rect r1 = r13.A00()
            int r0 = r13.A09
            int r10 = X.AbstractC197468oH.A01(r0, r1)
            X.81l r0 = r5.A0Y
            if (r0 == 0) goto L5f
            X.81v r0 = r0.A08
            java.lang.Object r4 = r0.A00
            X.55U r4 = (X.C55U) r4
        L4e:
            X.83r r5 = r5.A0i
            r9 = r2
            if (r3 != 0) goto L55
            r9 = r10
            r10 = r2
        L55:
            r11 = 0
            float r3 = X.A03.A00(r4, r5, r6, r7, r8, r9, r10, r11)
        L5a:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = X.AbstractC197458oG.A02(r13, r3, r7, r8)
            return r0
        L5f:
            r4 = 0
            goto L4e
        L61:
            X.1qM r0 = r5.A08
            if (r0 == 0) goto L7f
            boolean r0 = r0.A63()
            if (r0 == 0) goto L7f
            com.instagram.common.session.UserSession r4 = r12.A08
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327653728533249(0x810fcf00033b01, double:3.037092725420209E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L7f
            goto L5a
        L7f:
            X.83k r0 = r5.A04
            if (r0 == 0) goto L96
            com.instagram.common.session.UserSession r1 = r12.A08
            boolean r0 = X.AbstractC25351Lp.A03(r1)
            if (r0 != 0) goto L96
            X.1Ai r0 = X.AbstractC23021Ah.A00(r1)
            boolean r0 = r0.A21()
            if (r0 != 0) goto L96
            goto L5a
        L96:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L5a
        L99:
            r6 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185698Lo.A05(X.8Ee):com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig");
    }

    public final void A06() {
        TransformMatrixConfig transformMatrixConfig = this.A01;
        if (transformMatrixConfig != null) {
            transformMatrixConfig.A03();
            for (InterfaceC1830389y interfaceC1830389y : this.A0A) {
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                interfaceC1830389y.DvK(transformMatrixParams.A01, transformMatrixParams.A00, transformMatrixParams.A02 * transformMatrixConfig.A07, transformMatrixParams.A03 * transformMatrixConfig.A06);
            }
        }
    }

    public final void A07(Rect rect) {
        C8DL c8dl;
        Object A02;
        int i;
        int i2;
        float f;
        if (this.A01 != null && this.A02 != null && (c8dl = this.A05) != null && (A02 = c8dl.A00.A02()) != null) {
            if ((A02 == C8DM.A04 || A02 == C8DM.A05 || A02 == C8DM.A02) && rect != null) {
                this.A02.A08.A00(this.A01.A08);
                TransformMatrixConfig transformMatrixConfig = this.A01;
                if (transformMatrixConfig.A04 % 180 == 0) {
                    i = transformMatrixConfig.A05;
                    i2 = transformMatrixConfig.A03;
                } else {
                    i = transformMatrixConfig.A03;
                    i2 = transformMatrixConfig.A05;
                }
                float f2 = i;
                float f3 = i2;
                float f4 = (f2 * 1.0f) / f3;
                float f5 = this.A07;
                float f6 = f5 * 1.0f;
                float f7 = this.A06;
                float f8 = f6 / f7;
                float f9 = f6 / f2;
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                transformMatrixParams.A00 = 0.0f;
                if (f4 >= f8) {
                    f = f4 / f8;
                } else {
                    f = 1.0f;
                }
                if (f4 >= f8) {
                    float f10 = (f5 * (f - 1.0f)) / 2.0f;
                    transformMatrixConfig.A04(Math.max(Math.min((((i - rect.left) - rect.right) / 2.0f) * f9 * f, f10), -f10));
                    transformMatrixConfig.A05(0.0f);
                } else {
                    float f11 = ((f3 * f9) - f7) / 2.0f;
                    float max = Math.max(Math.min((((i2 - rect.top) - rect.bottom) / 2.0f) * f9, f11), -f11);
                    transformMatrixConfig.A04(0.0f);
                    transformMatrixConfig.A05(max);
                }
                if (transformMatrixParams.A01 != f) {
                    transformMatrixParams.A01 = Math.min(5.0f, Math.max(0.3f, f));
                    A06();
                }
            } else if (A02 == C8DM.A08 || A02 == C8DM.A06) {
                this.A01.A08.A00(this.A02.A08);
                A06();
            }
            A02(this);
        }
    }

    public final void A08(C198988qy c198988qy) {
        C199388rf c199388rf;
        if (c198988qy.A00 && (c199388rf = this.A00) != null && c199388rf.A00) {
            C203428yz c203428yz = (C203428yz) c198988qy.A00();
            TransformMatrixConfig transformMatrixConfig = this.A01;
            transformMatrixConfig.getClass();
            transformMatrixConfig.A08.A00(c203428yz.A00);
            A02(this);
        }
    }

    @Override // X.InterfaceC185718Lq
    public final TransformMatrixConfig CAZ() {
        return this.A01;
    }

    public C185698Lo(ViewGroup viewGroup, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8DL c8dl) {
        this.A09 = anonymousClass840;
        this.A08 = userSession;
        this.A0B = viewGroup;
        this.A0C = targetViewSizeProvider;
        this.A0D = new C131405wV(viewGroup.getContext());
        this.A05 = c8dl;
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        this.A07 = interfaceC1812882f.getWidth();
        this.A06 = interfaceC1812882f.getHeight();
    }

    public static TransformMatrixConfig A01(C185698Lo c185698Lo, C183978Ee c183978Ee) {
        EnumC171727l2 enumC171727l2;
        TransformMatrixConfig A05 = c185698Lo.A05(c183978Ee);
        C1815483h c1815483h = c185698Lo.A09.A02.A01;
        if (c1815483h.A0K) {
            A05.A05(c185698Lo.A0B.getContext().getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        }
        AbstractC172157lk abstractC172157lk = c1815483h.A06;
        if ((abstractC172157lk instanceof C172147lj) && (enumC171727l2 = ((C172147lj) abstractC172157lk).A00) != null) {
            int i = c185698Lo.A07;
            int i2 = c185698Lo.A06;
            if (EnumC171727l2.A04 == enumC171727l2) {
                A05.A04(i / 4.0f);
            } else if (EnumC171727l2.A05 == enumC171727l2) {
                A05.A05(i2 / 4.0f);
                return A05;
            }
        }
        return A05;
    }

    @Override // X.InterfaceC185708Lp
    public final void DhU(float f) {
        if (A03()) {
            C8DL c8dl = this.A05;
            if (c8dl != null) {
                Object A02 = c8dl.A00.A02();
                C8DM c8dm = C8DM.A07;
                if (A02 != c8dm) {
                    c8dl.A02.Egh(c8dm);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f2 = -f;
            float f3 = f2 / ((float) (elapsedRealtime - this.A04));
            C131405wV c131405wV = this.A0D;
            if (!c131405wV.A0I) {
                ViewGroup viewGroup = this.A0B;
                Rect rect = new Rect();
                rect.set(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
                c131405wV.A07(rect);
            }
            if (c131405wV.A0I) {
                Rect rect2 = c131405wV.A0P;
                float centerX = rect2.centerX();
                TransformMatrixConfig transformMatrixConfig = this.A01;
                transformMatrixConfig.getClass();
                float f4 = centerX + (transformMatrixConfig.A08.A02 * transformMatrixConfig.A07);
                if (c131405wV.A0I) {
                    float centerY = rect2.centerY();
                    TransformMatrixParams transformMatrixParams = this.A01.A08;
                    this.A01.A08.A00 = c131405wV.A05(f4, centerY + (transformMatrixParams.A03 * r2.A06), f3, transformMatrixParams.A00, f2);
                    this.A04 = elapsedRealtime;
                    A02(this);
                    return;
                }
                throw new IllegalStateException("Cannot get bounds which have not been set yet");
            }
            throw new IllegalStateException("Cannot get bounds which have not been set yet");
        }
    }

    @Override // X.InterfaceC185708Lp
    public final void DiI(float f) {
        if (A03()) {
            C8DL c8dl = this.A05;
            if (c8dl != null) {
                Object A02 = c8dl.A00.A02();
                C8DM c8dm = C8DM.A07;
                if (A02 != c8dm) {
                    c8dl.A02.Egh(c8dm);
                }
            }
            float A00 = A00(f);
            TransformMatrixConfig transformMatrixConfig = this.A01;
            if (transformMatrixConfig != null) {
                transformMatrixConfig.A08.A01 = A00;
            }
            A02(this);
        }
    }

    @Override // X.InterfaceC185708Lp
    public final void DiO(float f) {
        if (A03()) {
            float A00 = A00(f);
            C1815483h c1815483h = this.A09.A02.A01;
            if (c1815483h.A04 != null) {
                if (C18U.A06(C06090Tz.A05, this.A08, 36322924969339629L)) {
                    C1815783k c1815783k = c1815483h.A04;
                    if (A00 >= 0.8f) {
                        c1815783k.A00();
                        return;
                    }
                    Object A02 = c1815783k.A05.A02();
                    A02.getClass();
                    if (!((Boolean) A02).booleanValue()) {
                        return;
                    }
                    c1815783k.A01();
                }
            }
        }
    }

    @Override // X.InterfaceC185708Lp
    public final void Dim(float f, float f2) {
        if (A03()) {
            C8DL c8dl = this.A05;
            if (c8dl != null) {
                Object A02 = c8dl.A00.A02();
                C8DM c8dm = C8DM.A07;
                if (A02 != c8dm) {
                    c8dl.A02.Egh(c8dm);
                }
            }
            TransformMatrixConfig transformMatrixConfig = this.A01;
            transformMatrixConfig.getClass();
            TransformMatrixConfig transformMatrixConfig2 = this.A01;
            TransformMatrixParams transformMatrixParams = transformMatrixConfig2.A08;
            transformMatrixConfig.A04((transformMatrixParams.A02 * transformMatrixConfig2.A07) + f);
            transformMatrixConfig2.A05((transformMatrixParams.A03 * transformMatrixConfig2.A06) + f2);
            A02(this);
        }
    }
}
