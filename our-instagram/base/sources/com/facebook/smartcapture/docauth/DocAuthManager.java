package com.facebook.smartcapture.docauth;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25233BEq;
import X.AbstractC58318PtA;
import X.AbstractC63111SdF;
import X.C09170dP;
import X.C14360o3;
import X.EnumC61137Rfr;
import X.EnumC61146Rg7;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.diagnostic.DiagnosticInfo;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes10.dex */
public final class DocAuthManager {
    public float alignmentScaleX;
    public int bytesPerPixel;
    public final Context context;
    public WeakReference delegate;
    public final IdCaptureConfig idCaptureConfig;
    public boolean isImageProcessingRunning;
    public boolean isNativeLibraryLoaded;
    public final IdCaptureLogger logger;
    public HybridData mHybridData;
    public int previewHeight;
    public Rect previewRegionOfInterest;
    public int previewWidth;

    public DocAuthManager(Context context, IdCaptureConfig idCaptureConfig, IdCaptureLogger idCaptureLogger) {
        AbstractC25233BEq.A0v(1, context, idCaptureConfig, idCaptureLogger);
        this.context = context;
        this.idCaptureConfig = idCaptureConfig;
        this.logger = idCaptureLogger;
        this.isImageProcessingRunning = true;
    }

    private final native void initCreditCardScanner(String str, String str2, String str3);

    private final native void initCreditCardScanner(String str, String str2, String str3, int i, float f, boolean z);

    private final native HybridData initHybrid(IdCaptureLogger idCaptureLogger, boolean z, boolean z2, boolean z3, String str);

    private final native DocAuthResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7);

    public final synchronized void cleanupJNI() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
        this.mHybridData = null;
    }

    public final synchronized void initJNI(boolean z, boolean z2, Map map) {
        C14360o3.A0B(map, 2);
        try {
            if (this.idCaptureConfig.A0I) {
                C09170dP.A0D("dynamic_pytorch_impl", 16);
                C09170dP.A0D("torch-code-gen", 16);
                C09170dP.A0C("smartcapture_id_pt_cc");
            } else if (z2) {
                C09170dP.A0D("dynamic_pytorch_impl", 16);
                C09170dP.A0D("torch-code-gen", 16);
                C09170dP.A0C("smartcapture_id_pt");
            } else {
                C09170dP.A0C("smartcapture_id");
            }
            this.isNativeLibraryLoaded = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        cleanupJNI();
        if (shouldRunNativeProcessing()) {
            this.mHybridData = initHybrid(this.logger, this.idCaptureConfig.A0J, z, z2, AbstractC58318PtA.A0i(EnumC61137Rfr.A04, map));
            if (this.idCaptureConfig.A0I) {
                String A0i = AbstractC58318PtA.A0i(EnumC61137Rfr.A05, map);
                String A0i2 = AbstractC58318PtA.A0i(EnumC61137Rfr.A06, map);
                String A0i3 = AbstractC58318PtA.A0i(EnumC61137Rfr.A07, map);
                if (A0i != null && A0i2 != null && A0i3 != null) {
                    initCreditCardScanner(A0i, A0i2, A0i3, 1, 0.8f, false);
                }
            }
        } else {
            this.mHybridData = null;
        }
    }

    public synchronized void onPreviewFrame(byte[] bArr) {
        DiagnosticInfo diagnosticInfo;
        C14360o3.A0B(bArr, 0);
        if (shouldRunNativeProcessing() && this.isImageProcessingRunning && this.mHybridData != null) {
            int i = this.previewWidth;
            int i2 = this.previewHeight;
            float f = this.alignmentScaleX;
            Rect rect = this.previewRegionOfInterest;
            C14360o3.A0A(rect);
            int i3 = rect.left;
            Rect rect2 = this.previewRegionOfInterest;
            C14360o3.A0A(rect2);
            int i4 = rect2.top;
            Rect rect3 = this.previewRegionOfInterest;
            C14360o3.A0A(rect3);
            int i5 = rect3.right;
            Rect rect4 = this.previewRegionOfInterest;
            C14360o3.A0A(rect4);
            int i6 = i5 - rect4.left;
            Rect rect5 = this.previewRegionOfInterest;
            C14360o3.A0A(rect5);
            int i7 = rect5.bottom;
            Rect rect6 = this.previewRegionOfInterest;
            C14360o3.A0A(rect6);
            DocAuthResult processImageBuffer = processImageBuffer(bArr, i, i2, f, i3, i4, i6, i7 - rect6.top, this.bytesPerPixel);
            Rect rect7 = this.previewRegionOfInterest;
            C14360o3.A0A(rect7);
            int i8 = rect7.bottom;
            Rect rect8 = this.previewRegionOfInterest;
            C14360o3.A0A(rect8);
            int i9 = i8 - rect8.top;
            WeakReference weakReference = this.delegate;
            C14360o3.A0A(weakReference);
            DocAuthManagerDelegate docAuthManagerDelegate = (DocAuthManagerDelegate) weakReference.get();
            if (processImageBuffer != null && docAuthManagerDelegate != null) {
                docAuthManagerDelegate.onDocAuthResultAvailable(processImageBuffer, i9);
            }
            if (this.idCaptureConfig.A0J && processImageBuffer != null && (diagnosticInfo = processImageBuffer.diagnosticInfo) != null) {
                Rect rect9 = this.previewRegionOfInterest;
                C14360o3.A0A(rect9);
                int i10 = rect9.right;
                Rect rect10 = this.previewRegionOfInterest;
                C14360o3.A0A(rect10);
                diagnosticInfo.previewWidth = i10 - rect10.left;
                diagnosticInfo.previewHeight = i9;
                if (docAuthManagerDelegate != null) {
                    docAuthManagerDelegate.onDiagnosticInfoAvailable(diagnosticInfo);
                }
            }
        }
    }

    public final void setDelegate(DocAuthManagerDelegate docAuthManagerDelegate) {
        C14360o3.A0B(docAuthManagerDelegate, 0);
        this.delegate = AbstractC25225BEi.A16(docAuthManagerDelegate);
    }

    private final boolean shouldRunNativeProcessing() {
        if (this.isNativeLibraryLoaded && this.idCaptureConfig.A01() != EnumC61146Rg7.A03) {
            return true;
        }
        return false;
    }

    public final Context getContext() {
        return this.context;
    }

    public void onPreviewSizeChanged(int i, int i2, int i3, int i4) {
        this.previewWidth = i;
        this.previewHeight = i2;
        Rect A0U = AbstractC166987dD.A0U();
        AbstractC63111SdF.A01(A0U, i3, i4, i, i2);
        this.previewRegionOfInterest = A0U;
        this.alignmentScaleX = 1.0f - (((16.0f * AbstractC167007dF.A0K(this.context).density) * 2.0f) / i3);
    }

    public void onPreviewBytesPerPixelChanged(int i) {
        this.bytesPerPixel = i;
    }

    public final void setImageProcessingRunning(boolean z) {
        this.isImageProcessingRunning = z;
    }
}
