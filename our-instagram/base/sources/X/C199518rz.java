package X;

import android.graphics.Point;
import android.opengl.Matrix;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluExternalRenderDelegateHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluExternalRenderDelegateWrapper;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;

/* renamed from: X.8rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199518rz {
    public final InstagramFilterFactoryProvider A00;
    public final boolean A01;

    public final InterfaceC199548s4 A00(FilterModel filterModel) {
        InterfaceC199548s4 aw7;
        C14360o3.A0B(filterModel, 0);
        if (filterModel instanceof BlurTransitionFilter) {
            BlurTransitionFilter blurTransitionFilter = (BlurTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider = this.A00;
            C14360o3.A0B(blurTransitionFilter, 1);
            C14360o3.A0B(instagramFilterFactoryProvider, 2);
            aw7 = new C9XI(instagramFilterFactoryProvider, blurTransitionFilter);
        } else if (filterModel instanceof ColorFilter) {
            aw7 = new C199838sn(this.A00, (ColorFilter) filterModel);
        } else if (filterModel instanceof FilterChain) {
            final FilterChain filterChain = (FilterChain) filterModel;
            final boolean z = this.A01;
            aw7 = new InterfaceC199548s4(this, filterChain, z) { // from class: X.8s3
                public final SparseArray A00 = new SparseArray();
                public final C199518rz A01;
                public final FilterChain A02;
                public final boolean A03;

                @Override // X.InterfaceC199548s4
                public final void AC1(FilterManagerImpl filterManagerImpl, AnonymousClass810 anonymousClass810, String str) {
                    SparseArray sparseArray = this.A00;
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        int keyAt = sparseArray.keyAt(i);
                        InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.valueAt(i);
                        if (interfaceC199548s4 != null) {
                            interfaceC199548s4.AC1(filterManagerImpl.getSubFilterManager(keyAt), anonymousClass810, str);
                        }
                    }
                }

                @Override // X.InterfaceC199548s4
                public final void AC6(FilterManagerImpl filterManagerImpl) {
                    FilterChain filterChain2 = this.A02;
                    if (filterManagerImpl.mCachedModel != filterChain2) {
                        filterManagerImpl.mCachedModel = filterChain2;
                        filterManagerImpl.createFilterChain();
                    }
                    SparseArray sparseArray = this.A00;
                    SparseArray sparseArray2 = filterChain2.A01;
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        int keyAt = sparseArray2.keyAt(i);
                        if (sparseArray2.get(keyAt) == null) {
                            filterManagerImpl.unsetFilterChainPosition(keyAt);
                        }
                        sparseArray.put(keyAt, null);
                    }
                    int size2 = sparseArray2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        int keyAt2 = sparseArray2.keyAt(i2);
                        FilterModel filterModel2 = (FilterModel) sparseArray2.get(keyAt2);
                        if (filterModel2 != null) {
                            InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.get(keyAt2);
                            if (interfaceC199548s4 == null || interfaceC199548s4.B6R() != filterModel2) {
                                interfaceC199548s4 = this.A01.A00(filterModel2);
                                sparseArray.put(keyAt2, interfaceC199548s4);
                            }
                            interfaceC199548s4.AC6(filterManagerImpl.getSubFilterManager(keyAt2));
                            filterManagerImpl.syncFilterChainPosition(keyAt2);
                            Object obj = sparseArray2.get(keyAt2);
                            obj.getClass();
                            filterManagerImpl.setFilterChainPositionEnabled(keyAt2, ((FilterModel) obj).isEnabled());
                            Point point = (Point) filterChain2.A02.get(keyAt2);
                            if (point != null) {
                                filterManagerImpl.setFilterChainOutputSize(keyAt2, point.x, point.y);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC199548s4
                public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
                    if (this.A03) {
                        SparseArray sparseArray = this.A00;
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            int keyAt = sparseArray.keyAt(i);
                            InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.get(keyAt);
                            if (interfaceC199548s4 != null) {
                                FilterManagerImpl subFilterManager = filterManagerImpl.getSubFilterManager(keyAt);
                                float[] fArr3 = AbstractC199498rs.A01;
                                interfaceC199548s4.ACI(subFilterManager, fArr3, fArr3);
                            }
                        }
                        return;
                    }
                    SparseArray sparseArray2 = this.A00;
                    int size2 = sparseArray2.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        int keyAt2 = sparseArray2.keyAt(i2);
                        InterfaceC199548s4 interfaceC199548s42 = (InterfaceC199548s4) sparseArray2.get(keyAt2);
                        if (interfaceC199548s42 != null) {
                            if (!z2 && interfaceC199548s42.B6R().isEnabled()) {
                                interfaceC199548s42.ACI(filterManagerImpl.getSubFilterManager(keyAt2), fArr, fArr2);
                                z2 = true;
                            } else {
                                FilterManagerImpl subFilterManager2 = filterManagerImpl.getSubFilterManager(keyAt2);
                                float[] fArr4 = AbstractC199498rs.A01;
                                interfaceC199548s42.ACI(subFilterManager2, fArr4, fArr4);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC199548s4
                public final void ACJ(FilterManagerImpl filterManagerImpl) {
                    SparseArray sparseArray = this.A00;
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        int keyAt = sparseArray.keyAt(i);
                        InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.valueAt(i);
                        if (interfaceC199548s4 != null) {
                            interfaceC199548s4.ACJ(filterManagerImpl.getSubFilterManager(keyAt));
                        }
                    }
                }

                @Override // X.InterfaceC199548s4
                public final FilterModel B6R() {
                    return this.A02;
                }

                {
                    this.A02 = filterChain;
                    this.A01 = this;
                    this.A03 = z;
                }
            };
        } else if (filterModel instanceof FilterGroup) {
            aw7 = new AW8(this, (FilterGroup) filterModel);
        } else if (filterModel instanceof FlareTransitionFilter) {
            FlareTransitionFilter flareTransitionFilter = (FlareTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider2 = this.A00;
            C14360o3.A0B(flareTransitionFilter, 1);
            C14360o3.A0B(instagramFilterFactoryProvider2, 2);
            aw7 = new C9XI(instagramFilterFactoryProvider2, flareTransitionFilter);
        } else if (filterModel instanceof GainmapFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider3 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider3, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider3, filterModel);
        } else if (filterModel instanceof GainmapAlphaFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider4 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider4, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider4, filterModel);
        } else if (filterModel instanceof GlitchTransitionFilter) {
            GlitchTransitionFilter glitchTransitionFilter = (GlitchTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider5 = this.A00;
            C14360o3.A0B(glitchTransitionFilter, 1);
            C14360o3.A0B(instagramFilterFactoryProvider5, 2);
            aw7 = new C9XI(instagramFilterFactoryProvider5, glitchTransitionFilter);
        } else if (filterModel instanceof GradientTransformFilter) {
            final GradientTransformFilter gradientTransformFilter = (GradientTransformFilter) filterModel;
            final InstagramFilterFactoryProvider instagramFilterFactoryProvider6 = this.A00;
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider6, gradientTransformFilter) { // from class: X.8sh
                public final float[] A00 = new float[16];

                @Override // X.InterfaceC199548s4
                public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
                    GradientTransformFilter gradientTransformFilter2 = (GradientTransformFilter) super.A00;
                    float[] fArr3 = this.A00;
                    Matrix.multiplyMM(fArr3, 0, fArr, 0, gradientTransformFilter2.A0C, 0);
                    filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
                }

                @Override // X.InterfaceC199548s4
                public final void ACJ(FilterManagerImpl filterManagerImpl) {
                    GradientTransformFilter gradientTransformFilter2 = (GradientTransformFilter) super.A00;
                    filterManagerImpl.setFloatArrayParameter("u_topColor", gradientTransformFilter2.A08);
                    filterManagerImpl.setFloatArrayParameter("u_bottomColor", gradientTransformFilter2.A07);
                    filterManagerImpl.setBoolParameter("u_isGainmapEnabled", gradientTransformFilter2.A05);
                    filterManagerImpl.setBoolParameter("u_isInputSamplingDisabled", gradientTransformFilter2.A06);
                    filterManagerImpl.setFloatParameter("u_inputWidth", gradientTransformFilter2.A02);
                    filterManagerImpl.setFloatParameter("u_inputHeight", gradientTransformFilter2.A01);
                    filterManagerImpl.setFloatParameter("u_cornerRadius", gradientTransformFilter2.A00);
                }
            };
        } else if (filterModel instanceof PanFilter) {
            final PanFilter panFilter = (PanFilter) filterModel;
            final InstagramFilterFactoryProvider instagramFilterFactoryProvider7 = this.A00;
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider7, panFilter) { // from class: X.9XA
                public final float[] A00;

                /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
                
                    if (r1 == 3) goto L10;
                 */
                @Override // X.InterfaceC199548s4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void ACI(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl r7, float[] r8, float[] r9) {
                    /*
                        r6 = this;
                        r0 = 0
                        X.C14360o3.A0B(r7, r0)
                        com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = r6.A00
                        com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter r5 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter) r5
                        int r1 = r5.A01
                        r4 = 12
                        r3 = 1077936128(0x40400000, float:3.0)
                        r2 = 1082130432(0x40800000, float:4.0)
                        if (r1 == 0) goto L3b
                        r0 = 1
                        if (r1 == r0) goto L1d
                        r0 = 2
                        r4 = 13
                        if (r1 == r0) goto L3b
                        r0 = 3
                        if (r1 != r0) goto L26
                    L1d:
                        float[] r1 = r5.A06
                        float r0 = r5.A00
                        float r0 = r0 * r2
                        float r0 = r0 - r3
                        float r0 = -r0
                    L24:
                        r1[r4] = r0
                    L26:
                        float[] r2 = r5.A06
                        float[] r1 = r6.A00
                        int r0 = r2.length
                        X.AbstractC06960Yn.A0T(r2, r1, r0)
                        java.lang.String r0 = "texture_transform"
                        r7.setFloatArrayParameter(r0, r1)
                        float[] r1 = r5.A05
                        java.lang.String r0 = "content_transform"
                        r7.setFloatArrayParameter(r0, r1)
                        return
                    L3b:
                        float[] r1 = r5.A06
                        float r0 = r5.A00
                        float r0 = r0 * r2
                        float r0 = r0 - r3
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9XA.ACI(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl, float[], float[]):void");
                }

                @Override // X.InterfaceC199548s4
                public final void ACJ(FilterManagerImpl filterManagerImpl) {
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(instagramFilterFactoryProvider7, panFilter);
                    AbstractC167017dG.A1P(panFilter, instagramFilterFactoryProvider7);
                    this.A00 = new float[16];
                }
            };
        } else if (filterModel instanceof SpinTransitionFilter) {
            SpinTransitionFilter spinTransitionFilter = (SpinTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider8 = this.A00;
            C14360o3.A0B(spinTransitionFilter, 1);
            C14360o3.A0B(instagramFilterFactoryProvider8, 2);
            aw7 = new C9XI(instagramFilterFactoryProvider8, spinTransitionFilter);
        } else if (filterModel instanceof SplitScreenFilter) {
            final SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
            aw7 = new InterfaceC199548s4(this, splitScreenFilter) { // from class: X.8sm
                public InterfaceC199548s4 A00;
                public InterfaceC199548s4 A01;
                public final C199518rz A02;
                public final SplitScreenFilter A03;
                public final float[] A04;

                {
                    C14360o3.A0B(splitScreenFilter, 1);
                    this.A03 = splitScreenFilter;
                    this.A02 = this;
                    this.A04 = new float[16];
                }

                @Override // X.InterfaceC199548s4
                public final void AC1(FilterManagerImpl filterManagerImpl, AnonymousClass810 anonymousClass810, String str) {
                }

                @Override // X.InterfaceC199548s4
                public final void AC6(FilterManagerImpl filterManagerImpl) {
                    C14360o3.A0B(filterManagerImpl, 0);
                    SplitScreenFilter splitScreenFilter2 = this.A03;
                    if (filterManagerImpl.mCachedModel != splitScreenFilter2) {
                        filterManagerImpl.mCachedModel = splitScreenFilter2;
                        filterManagerImpl.createSplitScreenFilter();
                    }
                    FilterModel filterModel2 = splitScreenFilter2.A01;
                    FilterModel filterModel3 = splitScreenFilter2.A03;
                    if (filterModel2 == null && filterModel3 == null) {
                        throw new RuntimeException("SplitScreenFilter requires at least one filter.");
                    }
                    if (filterModel2 == null) {
                        this.A00 = null;
                        filterManagerImpl.unsetSplitScreenFilterPosition(0);
                    } else {
                        InterfaceC199548s4 interfaceC199548s4 = this.A00;
                        if (interfaceC199548s4 == null || interfaceC199548s4.B6R() != filterModel2) {
                            this.A00 = this.A02.A00(filterModel2);
                        }
                    }
                    if (filterModel3 == null) {
                        this.A01 = null;
                        filterManagerImpl.unsetSplitScreenFilterPosition(1);
                    } else {
                        InterfaceC199548s4 interfaceC199548s42 = this.A01;
                        if (interfaceC199548s42 == null || interfaceC199548s42.B6R() != filterModel3) {
                            this.A01 = this.A02.A00(filterModel3);
                        }
                    }
                    InterfaceC199548s4 interfaceC199548s43 = this.A00;
                    if (interfaceC199548s43 != null) {
                        interfaceC199548s43.AC6(filterManagerImpl.getSubFilterManager(0));
                        filterManagerImpl.syncSplitScreenFilterPosition(0);
                    }
                    InterfaceC199548s4 interfaceC199548s44 = this.A01;
                    if (interfaceC199548s44 != null) {
                        interfaceC199548s44.AC6(filterManagerImpl.getSubFilterManager(1));
                        filterManagerImpl.syncSplitScreenFilterPosition(1);
                    }
                }

                @Override // X.InterfaceC199548s4
                public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
                    C14360o3.A0B(filterManagerImpl, 0);
                    C14360o3.A0B(fArr, 1);
                    float[] fArr3 = this.A04;
                    SplitScreenFilter splitScreenFilter2 = this.A03;
                    Matrix.multiplyMM(fArr3, 0, fArr, 0, splitScreenFilter2.A09, 0);
                    filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
                    filterManagerImpl.setFloatArrayParameter("content_transform", splitScreenFilter2.A08);
                }

                @Override // X.InterfaceC199548s4
                public final void ACJ(FilterManagerImpl filterManagerImpl) {
                    C14360o3.A0B(filterManagerImpl, 0);
                    filterManagerImpl.setSplitScreenValue(this.A03.A00);
                    InterfaceC199548s4 interfaceC199548s4 = this.A00;
                    if (interfaceC199548s4 != null) {
                        interfaceC199548s4.ACJ(filterManagerImpl.getSubFilterManager(0));
                    }
                    InterfaceC199548s4 interfaceC199548s42 = this.A01;
                    if (interfaceC199548s42 != null) {
                        interfaceC199548s42.ACJ(filterManagerImpl.getSubFilterManager(1));
                    }
                }

                @Override // X.InterfaceC199548s4
                public final FilterModel B6R() {
                    return this.A03;
                }
            };
        } else if (filterModel instanceof SurfaceCropFilterModel) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider9 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider9, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider9, filterModel);
        } else if (filterModel instanceof TiltShiftFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider10 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider10, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider10, filterModel);
        } else if (filterModel instanceof TiltShiftOverlayFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider11 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider11, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider11, filterModel);
        } else if (filterModel instanceof WarpTransitionFilter) {
            WarpTransitionFilter warpTransitionFilter = (WarpTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider12 = this.A00;
            C14360o3.A0B(warpTransitionFilter, 1);
            C14360o3.A0B(instagramFilterFactoryProvider12, 2);
            aw7 = new C9XI(instagramFilterFactoryProvider12, warpTransitionFilter);
        } else if (filterModel instanceof ZoomTransitionFilter) {
            ZoomTransitionFilter zoomTransitionFilter = (ZoomTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider13 = this.A00;
            C14360o3.A0B(zoomTransitionFilter, 1);
            C14360o3.A0B(instagramFilterFactoryProvider13, 2);
            aw7 = new C9XI(instagramFilterFactoryProvider13, zoomTransitionFilter);
        } else if (filterModel instanceof ExternalRenderFilterModel) {
            final ExternalRenderFilterModel externalRenderFilterModel = (ExternalRenderFilterModel) filterModel;
            final InstagramFilterFactoryProvider instagramFilterFactoryProvider14 = this.A00;
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider14, externalRenderFilterModel) { // from class: X.9XB
                public IgluExternalRenderDelegateHolder A00;
                public final IgluExternalRenderDelegateWrapper A01;

                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluExternalRenderDelegateHolder] */
                @Override // X.AbstractC199818si, X.InterfaceC199548s4
                public final void AC6(FilterManagerImpl filterManagerImpl) {
                    C14360o3.A0B(filterManagerImpl, 0);
                    super.AC6(filterManagerImpl);
                    FilterWeakPtr filterWeakPtr = filterManagerImpl.getFilterWeakPtr();
                    IgluExternalRenderDelegateWrapper igluExternalRenderDelegateWrapper = this.A01;
                    igluExternalRenderDelegateWrapper.key = ((ExternalRenderFilterModel) super.A00).A02;
                    C224619vm c224619vm = IgluExternalRenderDelegateHolder.Companion;
                    C14360o3.A0A(filterWeakPtr);
                    C14360o3.A0B(filterWeakPtr, 1);
                    ?? obj = new Object();
                    obj.mHybridData = IgluExternalRenderDelegateHolder.initHybrid(filterWeakPtr, igluExternalRenderDelegateWrapper);
                    this.A00 = obj;
                }

                @Override // X.InterfaceC199548s4
                public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
                }

                @Override // X.InterfaceC199548s4
                public final void ACJ(FilterManagerImpl filterManagerImpl) {
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(instagramFilterFactoryProvider14, externalRenderFilterModel);
                    AbstractC167017dG.A1P(externalRenderFilterModel, instagramFilterFactoryProvider14);
                    this.A01 = new IgluExternalRenderDelegateWrapper();
                }
            };
        } else if (filterModel instanceof DataDrivenFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider15 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider15, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider15, filterModel);
        } else if (filterModel instanceof DataDrivenGraphFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider16 = this.A00;
            C14360o3.A0B(instagramFilterFactoryProvider16, 2);
            aw7 = new AbstractC199818si(instagramFilterFactoryProvider16, filterModel);
        } else if (filterModel instanceof ValueMapFilterModel) {
            aw7 = new AW9(this.A00, (ValueMapFilterModel) filterModel);
        } else if (filterModel instanceof DetectionFilterModel) {
            aw7 = new AW7(this.A00, (DetectionFilterModel) filterModel);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No FilterUpdater for ");
            sb.append(new C0YZ(filterModel.getClass()));
            throw new IllegalArgumentException(sb.toString());
        }
        return aw7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    public C199518rz(boolean z) {
        this.A01 = z;
        this.A00 = new Object();
    }

    public C199518rz() {
        this(false);
    }
}
