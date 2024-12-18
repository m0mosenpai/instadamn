package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.GLES20;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import java.nio.ByteBuffer;

/* renamed from: X.8rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199468rn {
    public boolean A00;
    public final C9OW A01;
    public final C9OU A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.8q7, java.lang.Object] */
    public C199468rn(Context context, C9OU c9ou, boolean z) {
        C14360o3.A0B(context, 1);
        this.A02 = c9ou;
        AssetManager assets = context.getAssets();
        C14360o3.A07(assets);
        this.A01 = new C9OW(new Object(), new C198548q3(assets, true), new C199518rz(false), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    public final void A00(AnonymousClass810 anonymousClass810) {
        C09530e4 c09530e4;
        if (!this.A00) {
            try {
                C9OW c9ow = this.A01;
                IgluConfigHolder createIgAssetConfig = NativeConfigFactory.createIgAssetConfig(c9ow.A01.A00, true);
                C14360o3.A07(createIgAssetConfig);
                IgluFilterNativeGraph igluFilterNativeGraph = new IgluFilterNativeGraph();
                igluFilterNativeGraph.attach(createIgAssetConfig);
                InterfaceC198588q7 interfaceC198588q7 = c9ow.A00;
                interfaceC198588q7.attach(createIgAssetConfig);
                createIgAssetConfig.release();
                FilterManagerImpl filterManagerImpl = new FilterManagerImpl(interfaceC198588q7, null);
                C200688uB c200688uB = new C200688uB(8, 8);
                try {
                    InterfaceC199548s4 A00 = c9ow.A02.A00(new ColorFilter(AbstractC199508rx.A01(0)));
                    A00.AC6(filterManagerImpl);
                    A00.ACJ(filterManagerImpl);
                    A00.ACI(filterManagerImpl, AbstractC199498rs.A00(), AbstractC199498rs.A00());
                    igluFilterNativeGraph.updateFilter(filterManagerImpl.getFilterWeakPtr());
                    int i = anonymousClass810.A00;
                    int i2 = anonymousClass810.A01;
                    AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
                    igluFilterNativeGraph.setInputTexture(i, i2, anonymousClass812.A01, anonymousClass812.A00);
                    GLES20.glBindFramebuffer(36160, c200688uB.A00);
                    AnonymousClass810 anonymousClass8102 = c200688uB.A03;
                    int i3 = anonymousClass8102.A00;
                    int i4 = anonymousClass8102.A01;
                    int i5 = c200688uB.A02;
                    int i6 = c200688uB.A01;
                    ?? obj = new Object();
                    obj.mHybridData = IgluIODescriptor.initHybrid(i3, i4, i5, i6, 0, 14);
                    igluFilterNativeGraph.setOutputTexture(obj);
                    igluFilterNativeGraph.setClearFramebuffer(true);
                    igluFilterNativeGraph.render(AnonymousClass001.A0J("[GradientColorsExtractor] outputSize=", 'x', 8, 8));
                    ByteBuffer A01 = AbstractC209679Pd.A01(8, 8);
                    int capacity = A01.capacity() / 4;
                    A01.position(0);
                    int i7 = ((A01.get() & 255) << 24) | ((A01.get() & 255) << 16) | ((A01.get() & 255) << 8) | (A01.get() & 255);
                    A01.position((capacity - 1) * 4);
                    c09530e4 = new C09530e4(Integer.valueOf(i7), Integer.valueOf(((A01.get() & 255) << 24) | ((A01.get() & 255) << 16) | ((A01.get() & 255) << 8) | (A01.get() & 255)));
                    GLES20.glBindFramebuffer(36160, 0);
                    c200688uB.A01();
                    filterManagerImpl.release();
                    interfaceC198588q7.detach();
                    igluFilterNativeGraph.detach();
                } catch (Throwable th) {
                    c200688uB.A01();
                    filterManagerImpl.release();
                    interfaceC198588q7.detach();
                    igluFilterNativeGraph.detach();
                    throw th;
                }
            } catch (Exception e) {
                C0f5 AEp = C18950wb.A01.AEp(e.getMessage(), 817903816);
                AEp.ERI(e);
                AEp.report();
                c09530e4 = new C09530e4(-16777216, -16777216);
            }
            C9OU c9ou = this.A02;
            int intValue = ((Number) c09530e4.A00).intValue();
            int intValue2 = ((Number) c09530e4.A01).intValue();
            FilterModel filterModel = c9ou.A00;
            if (filterModel instanceof GradientTransformFilter) {
                GradientTransformFilter gradientTransformFilter = (GradientTransformFilter) filterModel;
                gradientTransformFilter.A08 = AbstractC199558s5.A00(intValue);
                gradientTransformFilter.A07 = AbstractC199558s5.A00(intValue2);
            } else {
                C14360o3.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel");
                ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterModel;
                valueMapFilterModel.A03("u_topColor", AbstractC224629vn.A00(intValue));
                valueMapFilterModel.A03("u_bottomColor", AbstractC224629vn.A00(intValue2));
            }
            this.A00 = true;
        }
    }
}
