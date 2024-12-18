package X;

import android.graphics.drawable.Drawable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;

/* renamed from: X.AMn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23131AMn {
    public static final int A00(CameraAREffect cameraAREffect, UserSession userSession, java.util.Set set, double d) {
        int i;
        long j;
        int i2;
        int i3 = (int) d;
        Iterator it = set.iterator();
        boolean z = false;
        while (true) {
            i = 15000;
            if (!it.hasNext()) {
                break;
            }
            Drawable A0Z = AbstractC166987dD.A0Z(it);
            C74T A00 = AbstractC209069Mo.A00(A0Z);
            if (A00 != null) {
                j = A00.Azf();
            } else {
                C5RQ A02 = AbstractC209069Mo.A02(A0Z);
                if (A02 != null) {
                    i2 = A02.getDurationInMs();
                } else {
                    C210399Se A01 = AbstractC209069Mo.A01(A0Z);
                    if (A01 != null) {
                        i2 = A01.A08;
                    } else if (AbstractC209069Mo.A03(A0Z)) {
                        j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                    } else {
                        j = 0;
                    }
                }
                j = i2;
            }
            int i4 = (int) j;
            i3 = Math.max(i3, i4);
            C210399Se A012 = AbstractC209069Mo.A01(A0Z);
            if (A012 != null) {
                i3 = Math.min(A012.A08, Integer.MAX_VALUE);
            }
            if ((A0Z instanceof C202658xj) && i4 > 15000) {
                z = true;
            }
        }
        if (cameraAREffect != null && cameraAREffect.A0L()) {
            i3 = Math.max(i3, 5000);
        }
        if (z) {
            i = C1LE.A00(userSession);
        }
        return Math.min(Integer.MAX_VALUE, Math.min(i3, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (X.C18U.A06(r2, r15, r0) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.LinkedHashSet A02(com.instagram.common.session.UserSession r15, java.util.Map r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23131AMn.A02(com.instagram.common.session.UserSession, java.util.Map, boolean, boolean):java.util.LinkedHashSet");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(com.instagram.common.session.UserSession r6, X.C47Z r7) {
        /*
            r5 = 0
            r4 = 1
            boolean r0 = r7.A5r
            r3 = 1
            if (r0 == 0) goto L21
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323165487705139(0x810bba00032c33, double:3.034254343847817E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L20
            r0 = 36320953579611154(0x8109b700042412, double:3.0328555242625416E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L20
            r3 = 0
        L20:
            return r3
        L21:
            boolean r0 = X.AbstractC210079Qv.A07(r7)
            if (r0 == 0) goto L65
            java.util.Set r0 = r7.A4t
            java.util.Iterator r3 = r0.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r3.next()
            X.AGS r0 = (X.AGS) r0
            java.lang.String r1 = r0.A0K
            X.9sx r0 = X.EnumC223189sx.A05
            java.lang.String r0 = r0.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L66
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323165487705139(0x810bba00032c33, double:3.034254343847817E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L2d
            r0 = 36320953579611154(0x8109b700042412, double:3.0328555242625416E-306)
        L57:
            boolean r0 = X.C18U.A06(r2, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2d
        L65:
            return r5
        L66:
            X.9sx r0 = X.EnumC223189sx.A04
            java.lang.String r0 = r0.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323165487770676(0x810bba00042c34, double:3.0342543438892626E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L2d
            r0 = 36320953579676691(0x8109b700052413, double:3.0328555243039875E-306)
            goto L57
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23131AMn.A07(com.instagram.common.session.UserSession, X.47Z):boolean");
    }

    public static final void A03(FilterModel filterModel, C47Z c47z, boolean z) {
        c47z.A1K = new C1125256f(filterModel);
        c47z.A60 = z;
        if (!z) {
            AbstractC12120kG.A07("PhotoToVideoUtil", "useOcTranscode is false", null);
        }
    }

    public static final void A04(FilterChain filterChain) {
        FilterModel A0g = AbstractC166987dD.A0g(filterChain.A01, 17);
        if (A0g != null) {
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) A0g;
            FilterModel A00 = splitScreenFilter.A00();
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter");
            ColorFilter colorFilter = (ColorFilter) A00;
            if (!C14360o3.A0K(colorFilter.A04, "normal")) {
                float[] fArr = colorFilter.A07;
                float[] fArr2 = colorFilter.A06;
                float f = colorFilter.A00;
                boolean z = colorFilter.A01;
                boolean z2 = colorFilter.A02;
                Integer num = C05F.A00;
                ColorFilter colorFilter2 = new ColorFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "normal", fArr, fArr2, f, z, z2, true);
                splitScreenFilter.A00 = 1.0f;
                splitScreenFilter.A01 = colorFilter2;
                splitScreenFilter.A02 = colorFilter2;
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (X.C14360o3.A0K(r1, "multi_color_gradient_v2") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r9) {
        /*
            r4 = 8
            android.util.SparseArray r6 = r9.A01
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = X.AbstractC166987dD.A0g(r6, r4)
            r3 = 0
            if (r5 == 0) goto L5f
            java.lang.String r1 = r5.getFilterName()
        Lf:
            java.lang.String r0 = "multi_color_gradient"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            java.lang.String r2 = "Required value was null."
            if (r0 != 0) goto L27
            if (r5 == 0) goto L5d
            java.lang.String r1 = r5.getFilterName()
        L1f:
            java.lang.String r0 = "multi_color_gradient_v2"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L33
        L27:
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = X.AbstractC166987dD.A0g(r6, r0)
            if (r1 == 0) goto L6c
            r0 = 1
            r1.setEnabled(r0)
        L33:
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = X.AbstractC166987dD.A0g(r6, r0)
            if (r0 == 0) goto L67
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L61
            r9.A01(r3, r4)
            A04(r9)
            float[] r0 = A09()
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            java.lang.Integer r2 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.AbstractC199768sS.A01(r9, r1, r0)
            return
        L5d:
            r1 = r3
            goto L1f
        L5f:
            r1 = r3
            goto Lf
        L61:
            X.B4T r0 = new X.B4T
            r0.<init>()
            throw r0
        L67:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        L6c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23131AMn.A05(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain):void");
    }

    public static final void A06(TransformMatrixConfig transformMatrixConfig, C22925A8v c22925A8v, C47Z c47z, C183978Ee c183978Ee, int i) {
        MYQ myq = new MYQ(c47z);
        C915647m c915647m = new C915647m();
        c915647m.A01 = i;
        C47Z c47z2 = myq.A01;
        c47z2.A1i = c915647m;
        if (transformMatrixConfig != null) {
            c47z.A16 = transformMatrixConfig;
        }
        BackgroundGradientColors A00 = AbstractC14620oa.A00(c183978Ee.A0I);
        if (A00 != null) {
            BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(A00.A01, A00.A00);
            int i2 = c183978Ee.A07;
            if (i2 == 180 || i2 == 270) {
                int i3 = backgroundGradientColors.A01;
                backgroundGradientColors.A01 = backgroundGradientColors.A00;
                backgroundGradientColors.A00 = i3;
            }
            c47z.A14 = backgroundGradientColors;
        }
        ClipInfo clipInfo = new ClipInfo(null, 16777215);
        int i4 = c22925A8v.A01;
        int i5 = c22925A8v.A00;
        clipInfo.A09 = i4;
        clipInfo.A06 = i5;
        clipInfo.A00 = i4 / i5;
        c47z2.A1N = clipInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (X.C14360o3.A0K(r1, X.EnumC138556Pl.A0F.A02) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(com.instagram.common.session.UserSession r5, X.C47Z r6) {
        /*
            X.1tc r1 = r6.A1G
            X.1tc r0 = X.EnumC40111tc.A0Q
            r4 = 0
            if (r1 != r0) goto L2a
            com.instagram.camera.effect.models.CameraAREffect r0 = r6.A10
            if (r0 != 0) goto L2a
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r6.A14(r0)
            if (r0 == 0) goto L2a
            boolean r0 = r6.A5q
            if (r0 == 0) goto L2b
            java.util.List r0 = r6.A4P
            if (r0 != 0) goto L2b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323161192606763(0x810bb900012c2b, double:3.034251627610309E-306)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0c(r2, r5, r0)
        L26:
            boolean r4 = r0.booleanValue()
        L2a:
            return r4
        L2b:
            boolean r0 = r6.A57
            if (r0 != 0) goto L56
            java.util.List r1 = r6.A4b
            X.3a5 r0 = X.EnumC75383a5.A0s
            X.3qW r0 = X.C48r.A00(r0, r1)
            if (r0 == 0) goto L54
            java.lang.String r1 = r0.A1h
        L3b:
            X.6Pl r0 = X.EnumC138556Pl.A0D
            java.lang.String r0 = r0.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L56
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323165487574066(0x810bba00012c32, double:3.0342543437649256E-306)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0c(r2, r5, r0)
            X.C14360o3.A0A(r0)
            goto L26
        L54:
            r1 = 0
            goto L3b
        L56:
            java.util.List r1 = r6.A4b
            X.3a5 r0 = X.EnumC75383a5.A0s
            X.3qW r3 = X.C48r.A00(r0, r1)
            r1 = 0
            if (r3 == 0) goto L99
            java.lang.String r2 = r3.A1h
        L63:
            X.6Pl r0 = X.EnumC138556Pl.A0E
            java.lang.String r0 = r0.A02
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L7b
            if (r3 == 0) goto L71
            java.lang.String r1 = r3.A1h
        L71:
            X.6Pl r0 = X.EnumC138556Pl.A0F
            java.lang.String r0 = r0.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L9b
        L7b:
            boolean r0 = r6.A57
            if (r0 != 0) goto L9b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323165487508529(0x810bba00002c31, double:3.03425434372348E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L97
            r0 = 36320953579545617(0x8109b700032411, double:3.032855524221096E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L2a
        L97:
            r4 = 1
            return r4
        L99:
            r2 = r1
            goto L63
        L9b:
            boolean r0 = X.AbstractC210079Qv.A07(r6)
            if (r0 == 0) goto L2a
            boolean r4 = A07(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23131AMn.A08(com.instagram.common.session.UserSession, X.47Z):boolean");
    }

    public static final float[] A09() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final int A01(C47Z c47z) {
        Integer num;
        if (!AbstractC210079Qv.A05(c47z) && !AbstractC210079Qv.A06(c47z)) {
            int i = c47z.A0F;
            MusicOverlayStickerModel A02 = AbstractC50710Ma7.A00.A02(c47z.A4b);
            if (A02 != null) {
                num = A02.A0O;
            } else {
                num = null;
            }
            boolean A1W = AbstractC167007dF.A1W(c47z.A10);
            boolean A0l = c47z.A0l();
            if (num != null) {
                i = num.intValue();
            }
            if (A0l) {
                return i;
            }
            if (A1W) {
                return Math.max(i, 5000);
            }
            return i;
        }
        ClipInfo clipInfo = c47z.A1N;
        return clipInfo.A05 - clipInfo.A07;
    }
}
