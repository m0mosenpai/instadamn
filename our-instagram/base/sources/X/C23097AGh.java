package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AGh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23097AGh {
    public static final C23097AGh A00 = new Object();
    public static final ImmutableList A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.AGh, java.lang.Object] */
    static {
        ImmutableList of = ImmutableList.of((Object) "blur_transition", (Object) "flare_transition", (Object) "glitch_transition", (Object) "spin_transition", (Object) "warp_transition", (Object) "zoom_transition");
        C14360o3.A07(of);
        A01 = of;
    }

    public final C23001ACa A00(C198548q3 c198548q3, C199518rz c199518rz, Float f, Float f2, Integer num, String str, int i, int i2, long j, long j2, boolean z) {
        Integer num2;
        TransitionFilter flareTransitionFilter;
        float f3;
        float f4;
        long j3 = j;
        long j4 = j2;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -936195220:
                if (!str.equals("warp_transition")) {
                    return null;
                }
                float[] A002 = AbstractC199498rs.A00();
                float[] A003 = AbstractC199498rs.A00();
                num2 = C05F.A00;
                flareTransitionFilter = new WarpTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A002, A003, 0.0f, true);
                break;
            case -123266003:
                if (!str.equals("blur_transition")) {
                    return null;
                }
                if (f != null && f2 != null) {
                    float floatValue = f.floatValue();
                    float floatValue2 = f2.floatValue();
                    float[] A004 = AbstractC199498rs.A00();
                    float[] A005 = AbstractC199498rs.A00();
                    num2 = C05F.A00;
                    flareTransitionFilter = new BlurTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A004, A005, 0.0f, floatValue, floatValue2, true);
                    break;
                } else {
                    float[] A006 = AbstractC199498rs.A00();
                    float[] A007 = AbstractC199498rs.A00();
                    num2 = C05F.A00;
                    flareTransitionFilter = new BlurTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A006, A007, 0.0f, 24.0f, 1.0f, true);
                    break;
                }
            case 139481759:
                if (!str.equals("glitch_transition")) {
                    return null;
                }
                float[] A008 = AbstractC199498rs.A00();
                float[] A009 = AbstractC199498rs.A00();
                num2 = C05F.A00;
                flareTransitionFilter = new GlitchTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A008, A009, 0.0f, true);
                break;
            case 717581682:
                if (!str.equals("spin_transition")) {
                    return null;
                }
                float[] A0010 = AbstractC199498rs.A00();
                float[] A0011 = AbstractC199498rs.A00();
                num2 = C05F.A00;
                flareTransitionFilter = new SpinTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A0010, A0011, 0.0f, true);
                break;
            case 1296567617:
                if (!str.equals("zoom_transition")) {
                    return null;
                }
                float[] A0012 = AbstractC199498rs.A00();
                float[] A0013 = AbstractC199498rs.A00();
                num2 = C05F.A00;
                flareTransitionFilter = new ZoomTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A0012, A0013, 0.0f, 16.0f, 1.0f, true);
                break;
            case 2000782950:
                if (!str.equals("flare_transition")) {
                    return null;
                }
                float[] A0014 = AbstractC199498rs.A00();
                float[] A0015 = AbstractC199498rs.A00();
                num2 = C05F.A00;
                flareTransitionFilter = new FlareTransitionFilter(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), A0014, A0015, 0.0f, true);
                break;
            default:
                return null;
        }
        TransitionFilter transitionFilter = flareTransitionFilter;
        if (transitionFilter == null) {
            return null;
        }
        if (num == num2) {
            j4 = j + i;
        } else {
            j3 = j2 - i2;
        }
        C198658qF c198658qF = new C198658qF(null, c198548q3, null, null, -1, false, z, false, true, false);
        c198658qF.A03 = c199518rz.A00(transitionFilter);
        C198688qJ c198688qJ = c198658qF.A06;
        int intValue = num.intValue();
        if (intValue != 0) {
            f3 = 0.0f;
            if (1 - intValue == 0) {
                f4 = 0.5f;
                c198688qJ.A00.add(new AAC(transitionFilter, f3, f4, j3, j4, AbstractC167007dF.A1X(num, C05F.A0C)));
                return new C23001ACa(c198658qF, new C1125456i(TimeUnit.MILLISECONDS, j3, j4));
            }
        } else {
            f3 = 0.5f;
        }
        f4 = 1.0f;
        c198688qJ.A00.add(new AAC(transitionFilter, f3, f4, j3, j4, AbstractC167007dF.A1X(num, C05F.A0C)));
        return new C23001ACa(c198658qF, new C1125456i(TimeUnit.MILLISECONDS, j3, j4));
    }
}
