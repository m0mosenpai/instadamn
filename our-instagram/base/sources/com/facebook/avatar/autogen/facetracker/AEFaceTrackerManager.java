package com.facebook.avatar.autogen.facetracker;

import X.AbstractC25231BEo;
import X.AbstractC53656No2;
import X.AbstractC58317Pt9;
import X.AbstractC72563Xgp;
import X.AnonymousClass194;
import X.BBN;
import X.C09170dP;
import X.C0K8;
import X.C12P;
import X.C14360o3;
import X.C53663NoE;
import X.C54498O6a;
import X.C55601Omh;
import X.C72816Xnf;
import X.EnumC53239Ngc;
import X.InterfaceC57791PkI;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.net.Uri;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AEFaceTrackerManager implements BBN {
    public static final C53663NoE Companion = new Object();
    public static C55601Omh delegate;
    public static AEFaceTrackerManager faceTrackerManager;
    public final Context context;
    public final FaceTrackerModelsProvider faceTrackerModelsProvider;
    public boolean isFrameProcessorReady;
    public HybridData mHybridData;
    public Map paths;

    private final native boolean checkImageValid(byte[] bArr, byte[] bArr2, int i, int i2);

    private final native HybridData initHybrid(Map map);

    private final native AEFaceTrackerResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8);

    public final boolean checkImage(String str) {
        C14360o3.A0B(str, 0);
        if (this.isFrameProcessorReady) {
            InputStream openInputStream = this.context.getContentResolver().openInputStream(Uri.parse(str));
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            C14360o3.A07(ByteBuffer.allocateDirect(0));
            if (decodeStream != null) {
                decodeStream.copyPixelsToBuffer(ByteBuffer.allocateDirect(decodeStream.getByteCount()));
                int width = decodeStream.getWidth();
                int height = decodeStream.getHeight();
                int i = width * height;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i / 2);
                allocateDirect.rewind();
                allocateDirect2.rewind();
                byte[] array = allocateDirect.array();
                C14360o3.A07(array);
                byte[] array2 = allocateDirect2.array();
                C14360o3.A07(array2);
                return checkImageValid(array, array2, width, height);
            }
        }
        return false;
    }

    @Override // X.BBN
    public void onPreviewFrame(C72816Xnf c72816Xnf) {
        C55601Omh c55601Omh;
        EnumC53239Ngc enumC53239Ngc;
        if (this.isFrameProcessorReady) {
            byte[] bArr = AbstractC72563Xgp.A00(c72816Xnf).A0A;
            int i = c72816Xnf.A01;
            Integer valueOf = Integer.valueOf(i);
            if (bArr != null && valueOf != null) {
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i) / 8;
                int i2 = c72816Xnf.A03;
                int i3 = c72816Xnf.A00;
                AEFaceTrackerResult processImageBuffer = processImageBuffer(bArr, i2, i3, 1.0f, 0, 0, i2, i3, bitsPerPixel, (360 - c72816Xnf.A02) % 360);
                if (processImageBuffer != null && (c55601Omh = delegate) != null && !c55601Omh.A02) {
                    if (processImageBuffer.isAutogenReady && processImageBuffer.isFace && processImageBuffer.data.length != 0) {
                        enumC53239Ngc = EnumC53239Ngc.A03;
                    } else if (processImageBuffer.isFace) {
                        if (Math.abs(processImageBuffer.pitch) > Math.abs(processImageBuffer.yaw)) {
                            enumC53239Ngc = EnumC53239Ngc.A09;
                        } else if (processImageBuffer.isEyesClosed) {
                            enumC53239Ngc = EnumC53239Ngc.A06;
                        } else {
                            enumC53239Ngc = EnumC53239Ngc.A07;
                        }
                    } else {
                        enumC53239Ngc = EnumC53239Ngc.A08;
                    }
                    if (c55601Omh.A00 != enumC53239Ngc) {
                        c55601Omh.A06.Egh(enumC53239Ngc);
                    }
                    c55601Omh.A00 = enumC53239Ngc;
                    return;
                }
                return;
            }
            C55601Omh c55601Omh2 = delegate;
            if (c55601Omh2 != null) {
                C54498O6a c54498O6a = c55601Omh2.A05.A06;
                AbstractC53656No2.A00(c54498O6a.A00, c54498O6a.A01, "unsupported_preview_format", 36);
            }
            this.isFrameProcessorReady = false;
        }
    }

    public static final /* synthetic */ void access$createFaceTracker(AEFaceTrackerManager aEFaceTrackerManager) {
        try {
            C09170dP.A0D(AbstractC58317Pt9.A00(765), 16);
            C09170dP.A0D(AbstractC58317Pt9.A00(1016), 16);
            C09170dP.A0C("autogen_frameprocessor");
            Map map = aEFaceTrackerManager.paths;
            if (map != null) {
                aEFaceTrackerManager.mHybridData = aEFaceTrackerManager.initHybrid(map);
                aEFaceTrackerManager.isFrameProcessorReady = true;
            }
        } catch (UnsatisfiedLinkError e) {
            C0K8.A0F("AEFaceTrackerManager", "Failed to load autogen_frameprocessor", e);
            C55601Omh c55601Omh = delegate;
            if (c55601Omh != null) {
                C54498O6a c54498O6a = c55601Omh.A05.A06;
                AbstractC53656No2.A00(c54498O6a.A00, c54498O6a.A01, "library_load_failed", 36);
            }
            faceTrackerManager = null;
        }
    }

    public AEFaceTrackerManager(Context context, FaceTrackerModelsProvider faceTrackerModelsProvider, InterfaceC57791PkI interfaceC57791PkI) {
        this.context = context;
        this.faceTrackerModelsProvider = faceTrackerModelsProvider;
        AbstractC25231BEo.A1I(this, AnonymousClass194.A02(C12P.A01), 24);
    }
}
