package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8MV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MV {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final MultiListenerTextureView A03;
    public final C8LJ A04;
    public final AnonymousClass840 A05;
    public final C1816783z A06;
    public final C8MW A07;
    public final C8LT A08;
    public final C150286pc A09;
    public final C8M1 A0A;
    public final String A0B;
    public final Handler A0C;
    public final TargetViewSizeProvider A0D;
    public final InterfaceC1810081c A0E;
    public final AnonymousClass856 A0F;
    public final boolean A0G;

    public C8MV(Context context, C22P c22p, UserSession userSession, MultiListenerTextureView multiListenerTextureView, C8LJ c8lj, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, InterfaceC1810081c interfaceC1810081c, AnonymousClass856 anonymousClass856, C8LT c8lt, C150286pc c150286pc, C8M1 c8m1, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(multiListenerTextureView, 7);
        C14360o3.A0B(c22p, 12);
        C14360o3.A0B(targetViewSizeProvider, 14);
        C14360o3.A0B(c8m1, 15);
        this.A02 = userSession;
        this.A01 = context;
        this.A05 = anonymousClass840;
        this.A08 = c8lt;
        this.A0F = anonymousClass856;
        this.A0E = interfaceC1810081c;
        this.A03 = multiListenerTextureView;
        this.A04 = c8lj;
        this.A09 = c150286pc;
        this.A0B = str;
        this.A0G = z;
        this.A0D = targetViewSizeProvider;
        this.A0A = c8m1;
        this.A0C = new Handler(C1CG.A00());
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0A(applicationContext);
        this.A07 = new C8MW(applicationContext, c22p, userSession, null, targetViewSizeProvider, anonymousClass840, str2);
        this.A06 = anonymousClass840.A02;
    }

    public static final C195868lW A01(C8MV c8mv, C187028Qv c187028Qv) {
        if (c187028Qv != null) {
            boolean A04 = A04(c187028Qv);
            boolean A03 = A03(c187028Qv);
            C210399Se A00 = A00(c187028Qv);
            if ((A04 || A03) && A00 != null) {
                C195868lW c195868lW = new C195868lW(A00.A0B, A00.getIntrinsicWidth(), A00.getIntrinsicHeight(), 0);
                int i = 4;
                if (A03) {
                    i = 5;
                }
                c195868lW.A0F = i;
                c195868lW.A1C = A04;
                return c195868lW;
            }
        }
        return c8mv.A06.A01.A04();
    }

    public static final C210399Se A00(C187028Qv c187028Qv) {
        Drawable drawable;
        java.util.Set keySet;
        Object obj;
        LinkedHashMap linkedHashMap = c187028Qv.A09;
        if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null) {
            Iterator it = keySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof C210399Se) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            drawable = (Drawable) obj;
        } else {
            drawable = null;
        }
        if (!(drawable instanceof C210399Se)) {
            return null;
        }
        return (C210399Se) drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [float[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void A02(C8MV c8mv, C8r2 c8r2) {
        C210399Se A00;
        FilterModel gradientTransformFilter;
        Object obj;
        float f;
        float f2;
        float f3;
        float f4;
        C203428yz c203428yz;
        Map map;
        LinkedHashMap linkedHashMap;
        java.util.Set keySet;
        C18160v1 c18160v1;
        List list;
        LinkedHashMap linkedHashMap2;
        C187028Qv c187028Qv = c8r2.A05;
        C202278x7 c202278x7 = 0;
        c202278x7 = 0;
        if (c187028Qv != null && (A00 = A00(c187028Qv)) != null) {
            C187028Qv c187028Qv2 = c8r2.A05;
            if (c187028Qv2 != null && (linkedHashMap2 = c187028Qv2.A09) != null) {
                linkedHashMap2.remove(A00);
            }
            float f5 = A00.A03.A02;
            boolean A06 = C18U.A06(C06090Tz.A05, c8mv.A02, 36324179100512209L);
            float intrinsicHeight = A00.getIntrinsicHeight();
            int intrinsicWidth = A00.getIntrinsicWidth();
            if (A06) {
                gradientTransformFilter = AHL.A00(C05F.A0N, C05F.A00, AbstractC224629vn.A00(-16777216), AbstractC224629vn.A00(-16777216), intrinsicWidth, intrinsicHeight, f5, false);
            } else {
                gradientTransformFilter = new GradientTransformFilter(c202278x7, c202278x7, intrinsicWidth, intrinsicHeight, f5, 8079);
            }
            FilterModel filterModel = gradientTransformFilter;
            C183978Ee A03 = c8mv.A05.A02.A01.A03();
            if (A03 != null && (c18160v1 = A03.A0I) != null && (list = c18160v1.A02) != null) {
                if (filterModel instanceof GradientTransformFilter) {
                    GradientTransformFilter gradientTransformFilter2 = (GradientTransformFilter) filterModel;
                    gradientTransformFilter2.A08 = AbstractC199558s5.A00(((Number) list.get(0)).intValue());
                    gradientTransformFilter2.A07 = AbstractC199558s5.A00(((Number) list.get(1)).intValue());
                } else {
                    C14360o3.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel");
                    ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterModel;
                    valueMapFilterModel.A03("u_topColor", AbstractC224629vn.A00(((Number) list.get(0)).intValue()));
                    valueMapFilterModel.A03("u_bottomColor", AbstractC224629vn.A00(((Number) list.get(1)).intValue()));
                }
            }
            C14360o3.A0B(filterModel, 0);
            c8r2.A06 = C9OA.A01(filterModel);
            C187028Qv c187028Qv3 = c8r2.A05;
            if (c187028Qv3 != null && (linkedHashMap = c187028Qv3.A09) != null && (keySet = linkedHashMap.keySet()) != null) {
                Iterator it = keySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if ((obj instanceof C202658xj) || (obj instanceof C216259hi)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
            } else {
                obj = null;
            }
            C187028Qv c187028Qv4 = c8r2.A05;
            if (c187028Qv4 != null && (map = c187028Qv4.A0K) != null) {
                c202278x7 = (C202278x7) map.get(obj);
            }
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8mv.A0D).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            if (c202278x7 != 0) {
                f = c202278x7.A05;
                f2 = c202278x7.A06;
                f3 = c202278x7.A01;
                f4 = c202278x7.A02;
            } else {
                f = 0.0f;
                f2 = 0.7f;
                f3 = 0.0f;
                f4 = 0.0f;
            }
            FilterGroupModel filterGroupModel = c8r2.A06;
            if (filterGroupModel != null) {
                TransformMatrixParams transformMatrixParams = ((FilterGroupModelImpl) filterGroupModel).A02.A03;
                transformMatrixParams.A00 = f;
                transformMatrixParams.A01 = f2;
                transformMatrixParams.A02 = f3 / width;
                transformMatrixParams.A03 = f4 / height;
            }
            int intrinsicWidth2 = A00.getIntrinsicWidth();
            int intrinsicHeight2 = A00.getIntrinsicHeight();
            Integer num = C05F.A00;
            TransformMatrixConfig transformMatrixConfig = new TransformMatrixConfig(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "VideoSendingController", intrinsicWidth2, intrinsicHeight2, 0, width, height, false, false, true, false, true, false);
            TransformMatrixParams transformMatrixParams2 = transformMatrixConfig.A08;
            transformMatrixParams2.A01 = f2;
            transformMatrixParams2.A00 = f;
            transformMatrixConfig.A04(f3);
            transformMatrixConfig.A05(f4);
            transformMatrixConfig.A03();
            AbstractC06960Yn.A0T(transformMatrixConfig.C6v(), filterModel.getTextureTransform(), 16);
            C198988qy c198988qy = c8r2.A04;
            if (c198988qy != null && (c203428yz = (C203428yz) c198988qy.A00()) != null) {
                TransformMatrixParams transformMatrixParams3 = c203428yz.A00;
                transformMatrixParams3.A00 = f;
                transformMatrixParams3.A01 = f2;
                transformMatrixParams3.A02 = f3 / width;
                transformMatrixParams3.A03 = f4 / height;
            }
        }
    }

    public static final boolean A03(C187028Qv c187028Qv) {
        java.util.Set keySet;
        LinkedHashMap linkedHashMap = c187028Qv.A09;
        if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null) {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C216259hi) {
                    if (next == null) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A04(C187028Qv c187028Qv) {
        java.util.Set keySet;
        LinkedHashMap linkedHashMap = c187028Qv.A09;
        if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null) {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C202658xj) {
                    if (next == null) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void A05(Bitmap bitmap, InterfaceC11380iw interfaceC11380iw, IngestSessionShim ingestSessionShim, A5Y a5y, AH3 ah3, Integer num, boolean z) {
        A5Y a5y2 = a5y;
        C14360o3.A0B(num, 4);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A02);
        A00.A4u.Egi(A00, true, C23031Ai.A8c[127]);
        this.A0F.A00().A00();
        C8LT c8lt = this.A08;
        if (a5y == null) {
            if (ingestSessionShim != null) {
                a5y2 = new A5Y((String) ingestSessionShim.A00.get(0));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c8lt.A03(interfaceC11380iw, a5y2, ah3, num, AbstractC09440dt.A01(new C9FY(2, ah3, this, num, bitmap)), z, this.A0G);
        if (z) {
            this.A0E.E4u(new Object());
        }
    }

    public final void A06(InterfaceC11380iw interfaceC11380iw, C8r2 c8r2, ACA aca, C187028Qv c187028Qv, C9ZH c9zh, FilterGroupModel filterGroupModel, DirectCameraViewModel directCameraViewModel, C211689Zc c211689Zc, A96 a96, C188538Ws c188538Ws, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        AbstractC24481Hr abstractC24481Hr;
        String str6 = str5;
        if (str5 == null) {
            str6 = AbstractC68470VSb.A00();
        }
        this.A00 = true;
        C195868lW A01 = A01(this, c8r2.A05);
        if (A01 == null) {
            this.A0A.A01.A02(str6, "Captured video is null");
            return;
        }
        if (A04(c187028Qv) || A03(c187028Qv)) {
            A02(this, c8r2);
        }
        A01.A0V = A01.A0V;
        C9B8 c9b8 = new C9B8(0, 0, 7, 0, false);
        if (A01.A1G && A01.A07 > 60000) {
            A01.A0H = A01.A0J;
            A01.A06 = A01.A0I;
        }
        String str7 = i == 2 ? "share_sheet" : "post_capture";
        Bitmap A02 = ((C8LK) this.A04.A00.A00()).A02(false, false);
        if (z) {
            UserSession userSession = this.A02;
            Context context = this.A01;
            Bitmap A022 = ((C8LK) this.A09.get()).A02(false, false);
            AbstractC167017dG.A1N(userSession, context);
            if (A022 != null) {
                abstractC24481Hr = AHW.A01(context, A022, userSession, false);
                this.A0C.post(new B0A(A02, c9b8, interfaceC11380iw, abstractC24481Hr, this, c8r2, aca, c187028Qv, c9zh, filterGroupModel, directCameraViewModel, c211689Zc, a96, c188538Ws, A01, bool, num, str, str7, str2, str3, str4, str6, list, list2, z2, z3));
            }
        }
        abstractC24481Hr = null;
        this.A0C.post(new B0A(A02, c9b8, interfaceC11380iw, abstractC24481Hr, this, c8r2, aca, c187028Qv, c9zh, filterGroupModel, directCameraViewModel, c211689Zc, a96, c188538Ws, A01, bool, num, str, str7, str2, str3, str4, str6, list, list2, z2, z3));
    }
}
