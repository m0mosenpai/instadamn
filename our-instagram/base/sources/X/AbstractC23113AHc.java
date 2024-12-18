package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.BlurDetectionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AHc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23113AHc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final FilterModel A01(UserSession userSession, C1125256f c1125256f) {
        FilterModel filterChain;
        FilterModel filterModel;
        C14360o3.A0B(c1125256f, 0);
        String str = c1125256f.A0L;
        if (str != null) {
            FilterModel filterModel2 = null;
            switch (str.hashCode()) {
                case -1833923782:
                    if (str.equals("filter_chain")) {
                        HashMap hashMap = c1125256f.A0P;
                        if (hashMap != null) {
                            filterChain = new FilterChain(A00(userSession, hashMap), new SparseArray(), c1125256f.A0H, c1125256f.A00(), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), c1125256f.A0X);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case -1829917960:
                    if (str.equals("filter_group")) {
                        HashMap hashMap2 = c1125256f.A0P;
                        if (hashMap2 != null) {
                            filterChain = new FilterGroup(A00(userSession, hashMap2), new SparseArray(), c1125256f.A0H, c1125256f.A00(), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), c1125256f.A0X);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case -199019139:
                    if (str.equals("gainmap")) {
                        filterChain = new GainmapFilter(c1125256f.A0H, c1125256f.A00(), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), c1125256f.A0B, c1125256f.A0X);
                        break;
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case -179908303:
                    if (str.equals("split_screen")) {
                        C1125256f c1125256f2 = c1125256f.A0I;
                        C1125256f c1125256f3 = c1125256f.A0J;
                        float f = c1125256f.A0A;
                        if (c1125256f2 != null) {
                            filterModel = A01(userSession, c1125256f2);
                        } else {
                            filterModel = null;
                        }
                        if (c1125256f3 != null) {
                            filterModel2 = A01(userSession, c1125256f3);
                        }
                        filterChain = new SplitScreenFilter(filterModel, filterModel2, c1125256f.A0H, c1125256f.A00(), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), f, c1125256f.A0X);
                        break;
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case -109262157:
                    if (str.equals(AbstractC111324zv.A00(5552))) {
                        String A00 = c1125256f.A00();
                        float[] A0w = AbstractC001800i.A0w(c1125256f.A0S);
                        float[] A0w2 = AbstractC001800i.A0w(c1125256f.A0R);
                        boolean z = c1125256f.A0X;
                        TransformMatrixParams transformMatrixParams = new TransformMatrixParams(c1125256f.A0H);
                        TypedParameterMap typedParameterMap = c1125256f.A0G;
                        if (typedParameterMap != null) {
                            TypedParameterMap A002 = typedParameterMap.A00();
                            AbstractC167017dG.A1P(A0w, A0w2);
                            C14360o3.A0B(A002, 5);
                            filterChain = new ValueMapFilterModel(A002, transformMatrixParams, A00, A0w, A0w2, z);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("IgSerializableFilterModel representing ValueMapFilterModel MUST have non-null TypedParameterMap");
                        }
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case -34594531:
                    if (str.equals("gradient_transform")) {
                        List list = c1125256f.A0V;
                        if (list != null) {
                            float[] A0w3 = AbstractC001800i.A0w(list);
                            List list2 = c1125256f.A0Q;
                            if (list2 != null) {
                                filterChain = new GradientTransformFilter(null, c1125256f.A0H, c1125256f.A00(), A0w3, AbstractC001800i.A0w(list2), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), c1125256f.A06, c1125256f.A05, c1125256f.A02, false, false, c1125256f.A0X);
                                break;
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case 537596042:
                    if (str.equals(AbstractC111324zv.A00(4414))) {
                        String str2 = c1125256f.A0K;
                        if (str2 != null) {
                            filterChain = new ExternalRenderFilterModel(c1125256f.A0H, str2, c1125256f.A00(), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), c1125256f.A0X);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case 543088813:
                    if (str.equals("blur_detection")) {
                        filterChain = new BlurDetectionFilter("blur_detection");
                        break;
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case 1377318199:
                    if (str.equals("defect_detection")) {
                        filterChain = new DefectDetectorFilter("defect_detection");
                        break;
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                case 2034439124:
                    if (str.equals(AbstractC111324zv.A00(4127))) {
                        filterChain = new ColorFilter(c1125256f.A0H, c1125256f.A00(), AbstractC001800i.A0w(c1125256f.A0S), AbstractC001800i.A0w(c1125256f.A0R), c1125256f.A0B, c1125256f.A0W, c1125256f.A0Y, c1125256f.A0X);
                        break;
                    }
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
                default:
                    throw AbstractC167007dF.A0c("Unknown filter model class: ", str);
            }
            FilterModel filterModel3 = filterChain;
            C0f5 AEp = C18950wb.A01.AEp(c1125256f.A00(), 817895413);
            AEp.ABW("restoredFilter", filterModel3.getFilterName());
            AEp.ABX("isValueMapFilter", filterModel3 instanceof ValueMapFilterModel);
            AEp.ABW("navChain", String.valueOf(C1QM.A00.A02.A00));
            AEp.report();
            return filterModel3;
        }
        C14360o3.A0F("filterModelClass");
        throw C00O.createAndThrow();
    }

    public static final void A02(FilterChain filterChain, String str, float[] fArr) {
        float[] textureTransform;
        C14360o3.A0B(fArr, 1);
        Integer A00 = AbstractC199768sS.A00(filterChain);
        if (A00 != null) {
            FilterModel A0g = AbstractC166987dD.A0g(filterChain.A01, A00.intValue());
            if (A0g != null && (textureTransform = A0g.getTextureTransform()) != null && !Arrays.equals(textureTransform, fArr)) {
                String arrays = Arrays.toString(textureTransform);
                C14360o3.A07(arrays);
                String arrays2 = Arrays.toString(fArr);
                C14360o3.A07(arrays2);
                String A0v = AnonymousClass001.A0v("previous filterChain transform matrix: ", arrays, "\ntranscoding transform matrix: ", arrays2, '\n');
                C0f5 AEp = C18950wb.A01.AEp(str, 817897553);
                AEp.ABX("error_01_percent", AbstractC199768sS.A03(textureTransform, fArr));
                AEp.ABW("navChain", String.valueOf(C1QM.A00.A02.A00));
                AEp.ABW("debugMessage", A0v);
                AEp.report();
            }
        }
    }

    public static final SparseArray A00(UserSession userSession, HashMap hashMap) {
        SparseArray sparseArray = new SparseArray(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) AbstractC166997dE.A0l(A14);
            Object key = entry.getKey();
            C14360o3.A07(key);
            int parseInt = Integer.parseInt((String) key);
            Object value = entry.getValue();
            C14360o3.A07(value);
            sparseArray.put(parseInt, A01(userSession, (C1125256f) value));
        }
        return sparseArray;
    }
}
