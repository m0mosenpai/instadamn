package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.Map;

/* renamed from: X.8o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197358o6 {
    public static boolean A05(FilterGroupModel filterGroupModel) {
        TiltShiftFilter A00;
        if (filterGroupModel == null) {
            C14360o3.A0B("filterGroupModel is null", 1);
            AbstractC12120kG.A0C("FilterGroupUtil_hasUserChanges", "filterGroupModel is null", null);
        } else {
            if (!filterGroupModel.CUm(9) && ((A00 = OXu.A00(filterGroupModel)) == null || A00.A05 == C05F.A00)) {
                SurfaceCropFilter A002 = A0R.A00(filterGroupModel, "FilterGroupUtil_hasUserChanges()");
                if (A002 != null) {
                    SurfaceCropFilterModel.FullTransform fullTransform = A002.A00.A06;
                    if (fullTransform.A03 != 0.0f || fullTransform.A04 != 0.0f || fullTransform.A05 != 0.0f) {
                        return true;
                    }
                }
                if (!OXt.A02(OXt.A00(filterGroupModel)) && !OXt.A01(OXt.A00(filterGroupModel))) {
                    PhotoFilter A003 = A0P.A00(filterGroupModel, "FilterGroupUtil_hasUserChanges()");
                    if (A003 != null && A003.A08 != 0 && ((int) (A003.A03.A00 * 100.0f)) != 0) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean A06(FilterGroupModel filterGroupModel, FilterGroupModel filterGroupModel2) {
        if (filterGroupModel2 == null) {
            C14360o3.A0B("Tried to compare filter group with null other filter group.", 1);
            AbstractC12120kG.A0C("FilterGroupUtil", "Tried to compare filter group with null other filter group.", null);
        } else {
            FilterModel filterModel = (FilterModel) ((FilterGroupModelImpl) filterGroupModel).A02.A01.get(9);
            FilterModel filterModel2 = (FilterModel) ((FilterGroupModelImpl) filterGroupModel2).A02.A01.get(9);
            boolean z = false;
            if (filterModel != null && filterModel2 != null && ((ColorFilter) filterModel).A00 != ((ColorFilter) filterModel2).A00) {
                z = true;
            }
            if (!z) {
                C14360o3.A0B(filterGroupModel, 0);
                TiltShiftFilter A00 = OXu.A00(filterGroupModel);
                TiltShiftFilter A002 = OXu.A00(filterGroupModel2);
                if (A00 == null || A002 == null || (A00.A05 == A002.A05 && A00.A00 == A002.A00 && A00.A01 == A002.A01 && C14360o3.A0K(A00.A00(), A002.A00()))) {
                    SurfaceCropFilter A003 = A0R.A00(filterGroupModel, "FilterGroupUtil_hasUnsavedChanges()_mainFilter");
                    SurfaceCropFilter A004 = A0R.A00(filterGroupModel2, "FilterGroupUtil_hasUnsavedChanges()_otherFilter");
                    if (A003 != null && A004 != null) {
                        SurfaceCropFilterModel.FullTransform fullTransform = A003.A00.A06;
                        float f = fullTransform.A03;
                        SurfaceCropFilterModel.FullTransform fullTransform2 = A004.A00.A06;
                        if (f != fullTransform2.A03 || fullTransform.A04 != fullTransform2.A04 || fullTransform.A05 != fullTransform2.A05 || fullTransform.A06 != fullTransform2.A06 || fullTransform.A01 != fullTransform2.A01 || fullTransform.A02 != fullTransform2.A02 || fullTransform.A07 != fullTransform2.A07 || Math.abs(fullTransform.A00 - fullTransform2.A00) > 0.001f) {
                            return true;
                        }
                    }
                    ValueMapFilterModel A005 = OXt.A00(filterGroupModel);
                    ValueMapFilterModel A006 = OXt.A00(filterGroupModel2);
                    if (A005 != null && A006 != null && (!A005.equals(A006))) {
                        return true;
                    }
                    ValueMapFilterModel A007 = OXt.A00(filterGroupModel);
                    ValueMapFilterModel A008 = OXt.A00(filterGroupModel2);
                    if (A007 != null && A008 != null) {
                        TypedParameterMap typedParameterMap = A007.A01;
                        TypedParameterMap typedParameterMap2 = A008.A01;
                        Map map = typedParameterMap.A02;
                        Float f2 = (Float) map.get("highlights");
                        Map map2 = typedParameterMap2.A02;
                        if (!C14360o3.A0J(f2, (Float) map2.get("highlights")) || !C14360o3.A0J((Float) map.get("shadows"), (Float) map2.get("shadows")) || !C14360o3.A0J((Float) map.get("sharpen"), (Float) map2.get("sharpen"))) {
                            return true;
                        }
                    }
                    PhotoFilter A009 = A0P.A00(filterGroupModel, "FilterGroupUtil_hasUnsavedChanges()_mainFilter");
                    PhotoFilter A0010 = A0P.A00(filterGroupModel2, "FilterGroupUtil_hasUnsavedChanges()_otherFilter");
                    if (A009 != null && A0010 != null && (A009.A08 != A0010.A08 || A009.A03.A00 != A0010.A03.A00)) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static FilterGroupModelImpl A00() {
        FilterGroupModelImpl filterGroupModelImpl = new FilterGroupModelImpl(new FilterChain(), null, C05F.A01, -1, true);
        FilterChain filterChain = filterGroupModelImpl.A02;
        SplitScreenFilter splitScreenFilter = new SplitScreenFilter();
        ColorFilter colorFilter = new ColorFilter(AbstractC199508rx.A01(0), true);
        splitScreenFilter.A01 = colorFilter;
        splitScreenFilter.A02 = colorFilter;
        splitScreenFilter.A00 = 1.0f;
        filterChain.A01(splitScreenFilter, 17);
        return filterGroupModelImpl;
    }

    public static FilterGroupModelImpl A01(UserSession userSession, boolean z) {
        boolean z2 = C2J9.A00;
        Integer num = C05F.A00;
        PhotoFilter photoFilter = new PhotoFilter(userSession, ((C8M5) C8M4.A00(userSession)).A02, num);
        FilterGroupModelImpl filterGroupModelImpl = new FilterGroupModelImpl(new FilterChain(), null, num, -1, z2);
        ColorFilter colorFilter = new ColorFilter("star_light");
        colorFilter.A00 = -1.0f;
        filterGroupModelImpl.EUT(colorFilter, 9);
        filterGroupModelImpl.EUV(9, false);
        if (C2J9.A06(userSession) || C2J9.A03(userSession)) {
            filterGroupModelImpl.EUT(new GainmapFilter(null, null, null, 0.0f, 63), 28);
            filterGroupModelImpl.EUV(28, false);
        }
        filterGroupModelImpl.EUT(new TiltShiftOverlayFilter(new PointF(0.5f, 0.5f), new PointF(0.5f, 0.5f), new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), num, MSV.A00(1660), AbstractC199498rs.A00(), AbstractC199498rs.A00(), 0.0f, 0.5f, 0.5f, 0.0f, true), 21);
        filterGroupModelImpl.EUV(21, false);
        filterGroupModelImpl.EUT(new TiltShiftFilter(new PointF(0.5f, 0.5f), new PointF(0.5f, 0.5f), new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), num, "tilt_shift", AbstractC199498rs.A00(), AbstractC199498rs.A00(), 0.5f, 0.5f, 0.0f, true), 19);
        filterGroupModelImpl.EUV(19, false);
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
        surfaceCropFilter.A0P(z);
        filterGroupModelImpl.EUU(surfaceCropFilter, 3);
        ColorFilter colorFilter2 = new ColorFilter(MSV.A00(1390));
        colorFilter2.A00 = 0.0f;
        filterGroupModelImpl.EUT(colorFilter2, 10);
        filterGroupModelImpl.EUV(10, false);
        filterGroupModelImpl.EUT(AbstractC53930Nt3.A00(), 13);
        filterGroupModelImpl.EUV(13, false);
        filterGroupModelImpl.EUU(photoFilter, 17);
        filterGroupModelImpl.EUV(3, true);
        return filterGroupModelImpl;
    }

    public static void A02(Rect rect, FilterGroupModel filterGroupModel, int i, int i2, int i3) {
        SurfaceCropFilter A00 = A0R.A00(filterGroupModel, "FilterGroupUtil_initialiseRestoredFilterGroup()");
        if (A00 != null && A00.A00.A0F) {
            A00.A0K(rect, i, i2, i3, false);
        }
        filterGroupModel.EUV(3, true);
    }

    public static void A04(FilterGroupModel filterGroupModel, String str, float f, boolean z, boolean z2, boolean z3) {
        if (f != 0.5625f) {
            String A0N = AnonymousClass001.A0N("Overlay aspect ratio=", f);
            C14360o3.A0B(A0N, 1);
            AbstractC12120kG.A0C("FilterGroupUtil_overlay_aspect_ratio_not_9_16", A0N, null);
        }
        if (str != null) {
            if ((!z && !z2) || z3) {
                SparseArray sparseArray = ((FilterGroupModelImpl) filterGroupModel).A02.A01;
                FilterModel filterModel = (FilterModel) sparseArray.get(17);
                filterModel.getClass();
                SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
                FilterGroup filterGroup = new FilterGroup();
                FilterModel filterModel2 = (FilterModel) sparseArray.get(8);
                if (filterModel2 != null) {
                    String filterName = filterModel2.getFilterName();
                    if ((filterName.equals("multi_color_gradient_v2") || filterName.equals("multi_color_gradient")) && !splitScreenFilter.A05) {
                        filterGroup.A00(filterModel2, 8);
                        filterGroupModel.EUT(null, 8);
                        filterGroup.A00(AHL.A01(str), 22);
                        filterGroupModel.EUT(filterGroup, 17);
                    }
                }
                filterGroup.A00(splitScreenFilter, 17);
                filterGroup.A00(AHL.A01(str), 22);
                filterGroupModel.EUT(filterGroup, 17);
            }
        }
    }

    public static void A03(UserSession userSession, FilterGroupModel filterGroupModel, String str) {
        FilterGroup filterGroup;
        int i;
        if (AbstractC50722MaN.A00(userSession)) {
            boolean z = C2J9.A00;
            FilterModel A01 = AHL.A01(str);
            ColorFilter colorFilter = new ColorFilter(AbstractC199508rx.A01(0));
            if (z) {
                filterGroup = new FilterGroup();
                filterGroup.A00(colorFilter, 17);
                filterGroup.A00(A01, 22);
                i = 26;
            } else if (C2J9.A03(userSession)) {
                filterGroup = new FilterGroup();
                filterGroup.A00(colorFilter, 17);
                i = 26;
                filterGroup.A00(A01, 26);
            } else {
                filterGroupModel.EUT(A01, 26);
                return;
            }
            filterGroupModel.EUT(filterGroup, i);
        }
    }
}
