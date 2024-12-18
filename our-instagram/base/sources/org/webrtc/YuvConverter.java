package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.GlUtil;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* loaded from: classes11.dex */
public final class YuvConverter {
    public static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    public static final String TAG = "YuvConverter";
    public final GlGenericDrawer drawer;
    public final GlTextureFrameBuffer i420TextureFrameBuffer;
    public final ShaderCallbacks shaderCallbacks;
    public final ThreadUtils.ThreadChecker threadChecker;
    public final VideoFrameDrawer videoFrameDrawer;

    /* loaded from: classes11.dex */
    public class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public float[] coeffs;
        public int coeffsLoc;
        public float stepSize;
        public int xUnitLoc;
        public static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        public static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        public static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        public /* synthetic */ ShaderCallbacks(AnonymousClass1 anonymousClass1) {
        }

        public ShaderCallbacks() {
        }
    }

    private VideoFrame.I420Buffer convertInternal(VideoFrame.TextureBuffer textureBuffer) {
        textureBuffer.getWidth();
        textureBuffer.getHeight();
        textureBuffer.retain();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = height + i2;
        try {
            final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i * i3);
            int i4 = i / 4;
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            this.i420TextureFrameBuffer.setSize(i4, i3);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.frameBufferId);
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i4, height);
            this.shaderCallbacks.setPlaneU();
            int i5 = i4 / 2;
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i5, i2);
            this.shaderCallbacks.setPlaneV();
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i5, height, i5, i2);
            GlTextureFrameBuffer glTextureFrameBuffer = this.i420TextureFrameBuffer;
            GLES20.glReadPixels(0, 0, glTextureFrameBuffer.width, glTextureFrameBuffer.height, 6408, 5121, nativeAllocateByteBuffer);
            GlUtil.checkNoGLES2Error("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
            int i6 = i * height;
            int i7 = i / 2;
            int i8 = i6 + i7;
            nativeAllocateByteBuffer.position(0);
            nativeAllocateByteBuffer.limit(i6);
            ByteBuffer slice = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i6);
            int i9 = ((i2 - 1) * i) + i7;
            nativeAllocateByteBuffer.limit(i6 + i9);
            ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i8);
            nativeAllocateByteBuffer.limit(i8 + i9);
            ByteBuffer slice3 = nativeAllocateByteBuffer.slice();
            textureBuffer.release();
            return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, slice3, i, new Runnable() { // from class: org.webrtc.YuvConverter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                }
            });
        } catch (UnsatisfiedLinkError e) {
            RuntimeException runtimeException = new RuntimeException(e);
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        String str;
        String str2;
        try {
            return convertInternal(textureBuffer);
        } catch (GLException e) {
            e = e;
            str2 = "Generic exception in YuvConverter.convert. Failed to convert TextureBuffer";
            Logging.w(TAG, str2, e);
            return null;
        } catch (Error e2) {
            e = e2;
            str = "Java Error in YuvConverter.convert. Rethrowing";
            Logging.e(TAG, str, e);
            throw e;
        } catch (GlUtil.GlOutOfMemoryException e3) {
            e = e3;
            str2 = "OOM exception in YuvConverter.convert. Failed to convert TextureBuffer ";
            Logging.w(TAG, str2, e);
            return null;
        } catch (Exception e4) {
            e = e4;
            str = "Generic exception in YuvConverter.convert. Rethrowing";
            Logging.e(TAG, str, e);
            throw e;
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.videoFrameDrawer.release();
        this.threadChecker.detachThread();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.webrtc.GlGenericDrawer$ShaderCallbacks, java.lang.Object, org.webrtc.YuvConverter$ShaderCallbacks] */
    public YuvConverter(VideoFrameDrawer videoFrameDrawer) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ?? obj = new Object();
        this.shaderCallbacks = obj;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, obj);
        this.videoFrameDrawer = videoFrameDrawer;
        threadChecker.detachThread();
    }

    public YuvConverter() {
        this(new VideoFrameDrawer());
    }
}
