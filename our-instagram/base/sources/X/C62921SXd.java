package X;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.HardwareBufferRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.os.Build;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.SXd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62921SXd {
    public static final C62921SXd A00 = new Object();
    public static final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, C65008TbX.A00);

    public final boolean A00() {
        try {
            if (Build.VERSION.SDK_INT != 34) {
                return false;
            }
            HardwareBuffer create = HardwareBuffer.create(32, 32, 1, 1, 768L);
            C14360o3.A07(create);
            HardwareBufferRenderer hardwareBufferRenderer = new HardwareBufferRenderer(create);
            RenderNode renderNode = new RenderNode("test");
            renderNode.setPosition(0, 0, 32, 32);
            RecordingCanvas beginRecording = renderNode.beginRecording();
            C14360o3.A07(beginRecording);
            Paint A0R = AbstractC166987dD.A0R();
            A0R.setTextSize(32.0f);
            beginRecording.drawColor(-65536);
            beginRecording.drawText("⬜", 0.0f, 32.0f, A0R);
            renderNode.endRecording();
            hardwareBufferRenderer.setContentRoot(renderNode);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HardwareBufferRenderer.RenderRequest obtainRenderRequest = hardwareBufferRenderer.obtainRenderRequest();
            ColorSpace.Named named = ColorSpace.Named.BT2020_PQ;
            obtainRenderRequest.setColorSpace(ColorSpace.get(named)).draw(ExecutorC64801TUp.A00, new TVL(countDownLatch));
            if (countDownLatch.await(5L, TimeUnit.SECONDS)) {
                Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(create, ColorSpace.get(named));
                C14360o3.A0A(wrapHardwareBuffer);
                C14360o3.A07(wrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false).getColor(16, 16).convert(ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)));
                if (r6.red() <= 1.0d && r6.green() <= 1.0d && r6.blue() <= 1.0d) {
                    return false;
                }
                return true;
            }
            throw new TimeoutException();
        } catch (Exception e) {
            C0f5 AEp = C18950wb.A01.AEp("emoji_bug_detection_error", 245701013);
            AEp.ERI(e);
            AEp.report();
            C0K8.A0G("EmojiHdrBugUtil", "emoji bug detection error", e);
            return true;
        }
    }
}
