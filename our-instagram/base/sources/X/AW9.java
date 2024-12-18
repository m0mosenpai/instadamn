package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AW9 implements InterfaceC199548s4 {
    public final ValueMapFilterModel A00;
    public final InstagramFilterFactoryProvider A01;
    public final float[] A02;
    public final float[] A03;

    @Override // X.InterfaceC199548s4
    public final void AC1(FilterManagerImpl filterManagerImpl, AnonymousClass810 anonymousClass810, String str) {
    }

    @Override // X.InterfaceC199548s4
    public final void AC6(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        ValueMapFilterModel valueMapFilterModel = this.A00;
        if (filterManagerImpl.mCachedModel != valueMapFilterModel) {
            filterManagerImpl.mCachedModel = valueMapFilterModel;
            filterManagerImpl.createFilter(this.A01.createFilterFactory(valueMapFilterModel.A03));
        }
    }

    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        ValueMapFilterModel valueMapFilterModel = this.A00;
        TypedParameterMap A00 = valueMapFilterModel.A01.A00();
        Iterator A15 = AbstractC166997dE.A15(A00.A02);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String str = (String) A1K.getKey();
            try {
                filterManagerImpl.setFloatParameter(str, AbstractC166987dD.A09(A1K.getValue()));
            } catch (Exception e) {
                throw A00(valueMapFilterModel, "setFloatParameter() failed! Filter: ", str, e);
            }
        }
        Iterator A152 = AbstractC166997dE.A15(A00.A01);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            String str2 = (String) A1K2.getKey();
            try {
                filterManagerImpl.setFloatArrayParameter(str2, (float[]) A1K2.getValue());
            } catch (Exception e2) {
                throw A00(valueMapFilterModel, "setFloatArrayParameter() failed! Filter: ", str2, e2);
            }
        }
        Iterator A153 = AbstractC166997dE.A15(A00.A03);
        while (A153.hasNext()) {
            Map.Entry A1K3 = AbstractC166987dD.A1K(A153);
            String str3 = (String) A1K3.getKey();
            try {
                filterManagerImpl.setIntParameter(str3, AbstractC166987dD.A0H(A1K3.getValue()));
            } catch (Exception e3) {
                throw A00(valueMapFilterModel, "setIntParameter() failed! Filter: ", str3, e3);
            }
        }
        Iterator A154 = AbstractC166997dE.A15(A00.A00);
        while (A154.hasNext()) {
            Map.Entry A1K4 = AbstractC166987dD.A1K(A154);
            String str4 = (String) A1K4.getKey();
            try {
                filterManagerImpl.setBoolParameter(str4, AbstractC166987dD.A1a(A1K4.getValue()));
            } catch (Exception e4) {
                throw A00(valueMapFilterModel, "setBoolParameter() failed! Filter: ", str4, e4);
            }
        }
        Iterator A155 = AbstractC166997dE.A15(A00.A04);
        while (A155.hasNext()) {
            Map.Entry A1K5 = AbstractC166987dD.A1K(A155);
            String str5 = (String) A1K5.getKey();
            try {
                filterManagerImpl.setStringParameter(str5, (String) A1K5.getValue());
            } catch (Exception e5) {
                throw A00(valueMapFilterModel, "setStringParameter() failed! Filter: ", str5, e5);
            }
        }
        Iterator A156 = AbstractC166997dE.A15(A00.A05);
        while (A156.hasNext()) {
            Map.Entry A1K6 = AbstractC166987dD.A1K(A156);
            String str6 = (String) A1K6.getKey();
            try {
                filterManagerImpl.setTextureInputPath(str6, (String) A1K6.getValue());
            } catch (Exception e6) {
                throw A00(valueMapFilterModel, "setTextureInputPath() failed! Filter: ", str6, e6);
            }
        }
    }

    public static RuntimeException A00(ValueMapFilterModel valueMapFilterModel, String str, String str2, Throwable th) {
        return new RuntimeException(AnonymousClass001.A0u(str, valueMapFilterModel.A03, " Key: ", str2), th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r8 != null) goto L10;
     */
    @Override // X.InterfaceC199548s4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ACI(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl r19, float[] r20, float[] r21) {
        /*
            r18 = this;
            r14 = r21
            r10 = r20
            r9 = 0
            r3 = r19
            boolean r5 = X.AbstractC167007dF.A1R(r9, r3, r10)
            r4 = 2
            X.C14360o3.A0B(r14, r4)
            r6 = r18
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r2 = r6.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = r2.A02
            java.lang.Integer r0 = r7.A06
            int r0 = r0.intValue()
            r1 = 3
            if (r0 == r9) goto L35
            if (r0 == r5) goto L30
            if (r0 == r4) goto L5c
            if (r0 != r1) goto L64
            float[] r8 = r6.A03
            float[] r12 = r2.A05
            r11 = r9
            r13 = r9
            android.opengl.Matrix.multiplyMM(r8, r9, r10, r11, r12, r13)
        L2d:
            r10 = r8
            if (r8 == 0) goto L35
        L30:
            java.lang.String r0 = "texture_transform"
            r3.setFloatArrayParameter(r0, r10)
        L35:
            java.lang.Integer r0 = r7.A05
            int r0 = r0.intValue()
            if (r0 == r9) goto L58
            if (r0 == r5) goto L53
            if (r0 == r4) goto L59
            if (r0 != r1) goto L5f
            float[] r12 = r6.A02
            float[] r0 = r2.A04
            r13 = r9
            r15 = r9
            r17 = r9
            r16 = r0
            android.opengl.Matrix.multiplyMM(r12, r13, r14, r15, r16, r17)
        L50:
            r14 = r12
            if (r12 == 0) goto L58
        L53:
            java.lang.String r0 = "content_transform"
            r3.setFloatArrayParameter(r0, r14)
        L58:
            return
        L59:
            float[] r12 = r2.A04
            goto L50
        L5c:
            float[] r8 = r2.A05
            goto L2d
        L5f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L64:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW9.ACI(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl, float[], float[]):void");
    }

    @Override // X.InterfaceC199548s4
    public final FilterModel B6R() {
        return this.A00;
    }

    public AW9(InstagramFilterFactoryProvider instagramFilterFactoryProvider, ValueMapFilterModel valueMapFilterModel) {
        AbstractC167017dG.A1P(valueMapFilterModel, instagramFilterFactoryProvider);
        this.A00 = valueMapFilterModel;
        this.A01 = instagramFilterFactoryProvider;
        this.A03 = new float[16];
        this.A02 = new float[16];
    }
}
