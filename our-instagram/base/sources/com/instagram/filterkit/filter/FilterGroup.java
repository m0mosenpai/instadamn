package com.instagram.filterkit.filter;

import X.AbstractC166987dD;
import X.AbstractC37304Gc5;
import X.AbstractC55027OXe;
import X.AbstractC55164OdS;
import X.C05F;
import X.C14360o3;
import X.EnumC53258Ngw;
import X.LNL;
import X.MSX;
import X.MSY;
import X.YPq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.filterkit.filter.intf.IgFilter;
import com.instagram.unifiedfilter.UnifiedFilterManager;
import java.util.Map;

/* loaded from: classes9.dex */
public class FilterGroup implements IgFilter {
    public static final Parcelable.Creator CREATOR = new LNL(75);
    public UnifiedFilterManager A00;
    public boolean A01;
    public final FilterChain A02;
    public final UnifiedFilterParamCallback A03;
    public final int[] A04;

    /* loaded from: classes9.dex */
    public interface UnifiedFilterParamCallback extends Parcelable {
    }

    @Override // X.BCA
    public final void AHR(YPq yPq) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private void A00(FilterModel filterModel, YPq yPq, int i) {
        float[] fArr;
        Object obj;
        float A09;
        float f;
        int i2 = i;
        C14360o3.A0B(yPq, 0);
        UnifiedFilterManager CCZ = yPq.CCZ();
        if (filterModel instanceof ColorFilter) {
            CCZ.setParameter(i2, "strength", new float[]{((ColorFilter) filterModel).A00}, 1);
            return;
        }
        String str = "angle";
        if (filterModel instanceof TiltShiftOverlayFilter) {
            TiltShiftOverlayFilter tiltShiftOverlayFilter = (TiltShiftOverlayFilter) filterModel;
            Integer num = tiltShiftOverlayFilter.A06;
            CCZ.setParameter(i2, DatePickerDialogModule.ARG_MODE, AbstractC55027OXe.A01(num));
            CCZ.setParameter(i2, "blendWithInput", 1);
            CCZ.setParameter(i2, "overlayOpacity", new float[]{tiltShiftOverlayFilter.A00}, 1);
            if (num == C05F.A01) {
                float[] fArr2 = new float[2];
                MSX.A0y(tiltShiftOverlayFilter.A05, fArr2);
                CCZ.setParameter(i2, "center", fArr2, 2);
                CCZ.setParameter(i2, "radius", new float[]{tiltShiftOverlayFilter.A01}, 1);
                return;
            }
            if (num != C05F.A0C) {
                return;
            }
            float[] fArr3 = new float[2];
            MSX.A0y(tiltShiftOverlayFilter.A04, fArr3);
            CCZ.setParameter(i2, "center", fArr3, 2);
            CCZ.setParameter(i2, "radius", new float[]{tiltShiftOverlayFilter.A03}, 1);
            fArr = new float[1];
            A09 = -tiltShiftOverlayFilter.A02;
        } else {
            if (filterModel instanceof TiltShiftFilter) {
                TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterModel;
                Integer num2 = tiltShiftFilter.A05;
                CCZ.setParameter(19, DatePickerDialogModule.ARG_MODE, AbstractC55027OXe.A01(num2));
                if (num2 == C05F.A01) {
                    float[] fArr4 = new float[2];
                    MSX.A0y(tiltShiftFilter.A04, fArr4);
                    CCZ.setParameter(19, "center", fArr4, 2);
                    CCZ.setParameter(19, "radius", new float[]{tiltShiftFilter.A00}, 1);
                    return;
                }
                if (num2 != C05F.A0C) {
                    return;
                }
                float[] fArr5 = new float[2];
                MSX.A0y(tiltShiftFilter.A03, fArr5);
                CCZ.setParameter(19, "center", fArr5, 2);
                CCZ.setParameter(19, "radius", new float[]{tiltShiftFilter.A02}, 1);
                CCZ.setParameter(19, "angle", new float[]{-tiltShiftFilter.A01}, 1);
                return;
            }
            if (filterModel instanceof SurfaceCropFilterModel) {
                float[] fArr6 = ((SurfaceCropFilterModel) filterModel).A0O;
                CCZ.setParameter(i2, "content_transform", fArr6, fArr6.length);
                return;
            }
            if (!(filterModel instanceof ValueMapFilterModel)) {
                return;
            }
            ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterModel;
            String str2 = valueMapFilterModel.A03;
            int hashCode = str2.hashCode();
            if (hashCode != -1726412436) {
                if (hashCode != -1392607189) {
                    if (hashCode != 1651896512 || !str2.equals("basic_adjust")) {
                        return;
                    }
                    float[] fArr7 = new float[1];
                    TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
                    Map map = typedParameterMap.A02;
                    Object obj2 = map.get("brightness");
                    if (obj2 != null) {
                        MSY.A1O(obj2, fArr7, 0);
                        CCZ.setParameter(i2, "brightness", fArr7, 1);
                        float[] fArr8 = new float[1];
                        Object obj3 = map.get("contrast");
                        if (obj3 != null) {
                            MSY.A1O(obj3, fArr8, 0);
                            CCZ.setParameter(i2, "contrast", fArr8, 1);
                            float[] fArr9 = new float[1];
                            Object obj4 = map.get("saturation");
                            if (obj4 != null) {
                                MSY.A1O(obj4, fArr9, 0);
                                CCZ.setParameter(i2, "saturation", fArr9, 1);
                                float[] fArr10 = new float[1];
                                Object obj5 = map.get("temperature");
                                if (obj5 != null) {
                                    MSY.A1O(obj5, fArr10, 0);
                                    CCZ.setParameter(i2, "temperature", fArr10, 1);
                                    float[] fArr11 = new float[1];
                                    Object obj6 = map.get("fade");
                                    if (obj6 != null) {
                                        MSY.A1O(obj6, fArr11, 0);
                                        CCZ.setParameter(i2, "fade", fArr11, 1);
                                        float[] fArr12 = new float[1];
                                        Object obj7 = map.get("vignette");
                                        if (obj7 != null) {
                                            MSY.A1O(obj7, fArr12, 0);
                                            CCZ.setParameter(i2, "vignette", fArr12, 1);
                                            Map map2 = typedParameterMap.A01;
                                            Object obj8 = map2.get("tint_shadows_color");
                                            if (obj8 != null) {
                                                EnumC53258Ngw A01 = AbstractC55164OdS.A01((float[]) obj8);
                                                float[] fArr13 = new float[1];
                                                EnumC53258Ngw enumC53258Ngw = EnumC53258Ngw.A06;
                                                float f2 = 0.0f;
                                                if (A01 != enumC53258Ngw) {
                                                    Object obj9 = map.get("tint_shadows_intensity");
                                                    if (obj9 != null) {
                                                        f = AbstractC166987dD.A09(obj9);
                                                    } else {
                                                        throw AbstractC166987dD.A14("Required value was null.");
                                                    }
                                                } else {
                                                    f = 0.0f;
                                                }
                                                fArr13[0] = f;
                                                CCZ.setParameter(i2, "tint_shadows_intensity", fArr13, 1);
                                                float[] fArr14 = A01.A00;
                                                C14360o3.A07(fArr14);
                                                CCZ.setParameter(i2, "tint_shadows_color", fArr14, 3);
                                                Object obj10 = map2.get("tint_highlights_color");
                                                if (obj10 != null) {
                                                    EnumC53258Ngw A02 = AbstractC55164OdS.A02((float[]) obj10);
                                                    float[] fArr15 = new float[1];
                                                    if (A02 != enumC53258Ngw) {
                                                        Object obj11 = map.get("tint_highlights_intensity");
                                                        if (obj11 != null) {
                                                            f2 = AbstractC166987dD.A09(obj11);
                                                        } else {
                                                            throw AbstractC166987dD.A14("Required value was null.");
                                                        }
                                                    }
                                                    fArr15[0] = f2;
                                                    CCZ.setParameter(i2, "tint_highlights_intensity", fArr15, 1);
                                                    float[] fArr16 = A02.A00;
                                                    C14360o3.A07(fArr16);
                                                    CCZ.setParameter(i2, "tint_highlights_color", fArr16, 3);
                                                    i2 = 13;
                                                    float[] fArr17 = new float[1];
                                                    Object obj12 = map.get("highlights");
                                                    if (obj12 != null) {
                                                        MSY.A1O(obj12, fArr17, 0);
                                                        CCZ.setParameter(13, "highlights", fArr17, 1);
                                                        float[] fArr18 = new float[1];
                                                        Object obj13 = map.get("shadows");
                                                        if (obj13 != null) {
                                                            MSY.A1O(obj13, fArr18, 0);
                                                            CCZ.setParameter(13, "shadows", fArr18, 1);
                                                            fArr = new float[1];
                                                            str = "sharpen";
                                                            obj = map.get("sharpen");
                                                            if (obj == null) {
                                                                throw AbstractC166987dD.A14("Required value was null.");
                                                            }
                                                        } else {
                                                            throw AbstractC166987dD.A14("Required value was null.");
                                                        }
                                                    } else {
                                                        throw AbstractC166987dD.A14("Required value was null.");
                                                    }
                                                } else {
                                                    throw AbstractC166987dD.A14("Required value was null.");
                                                }
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    if (!str2.equals("gaussian_blur")) {
                        return;
                    }
                    float[] fArr19 = new float[1];
                    Map map3 = valueMapFilterModel.A01.A02;
                    Object obj14 = map3.get("sigma");
                    if (obj14 != null) {
                        MSY.A1O(obj14, fArr19, 0);
                        CCZ.setParameter(i2, "sigma", fArr19, 1);
                        fArr = new float[1];
                        str = "kernel_size";
                        obj = map3.get("kernel_size");
                        if (obj == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                A09 = AbstractC166987dD.A09(obj);
            } else {
                if (!str2.equals("image_overlay")) {
                    return;
                }
                Object obj15 = valueMapFilterModel.A01.A05.get("overlay");
                if (obj15 != null) {
                    CCZ.addOverlay(i2, (String) obj15, false, valueMapFilterModel.A05, 12);
                    CCZ.setFilter(26, null);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        fArr[0] = A09;
        CCZ.setParameter(i2, str, fArr, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        if (r2 == false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Xn3, java.lang.Object] */
    @Override // com.instagram.filterkit.filter.intf.IgFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void EGY(X.YPq r20, X.InterfaceC197718oi r21, X.YRL r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.filterkit.filter.FilterGroup.EGY(X.YPq, X.8oi, X.YRL):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public FilterGroup(Parcel parcel) {
        this.A04 = new int[2];
        this.A01 = false;
        Parcelable A04 = AbstractC37304Gc5.A04(parcel, FilterChain.class);
        A04.getClass();
        this.A02 = (FilterChain) A04;
        Parcelable A042 = AbstractC37304Gc5.A04(parcel, UnifiedFilterParamCallback.class);
        A042.getClass();
        this.A03 = (UnifiedFilterParamCallback) A042;
    }

    public FilterGroup(FilterChain filterChain, UnifiedFilterParamCallback unifiedFilterParamCallback) {
        this.A04 = new int[2];
        this.A01 = false;
        this.A02 = filterChain;
        this.A03 = unifiedFilterParamCallback;
    }
}
