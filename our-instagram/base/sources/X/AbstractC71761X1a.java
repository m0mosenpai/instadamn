package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.webrtc.RendererCommon;

/* renamed from: X.X1a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71761X1a implements RendererCommon.GlDrawer {
    public static final FloatBuffer A0H;
    public static final FloatBuffer A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public float[] A04 = {0.0f, 0.0f};
    public float[] A05 = {1.0f, 1.0f};
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public C68260VJx A0D;
    public Integer A0E;
    public final float A0F;
    public final C68325VMl A0G;

    public AbstractC71761X1a(C68325VMl c68325VMl, float f) {
        this.A0G = c68325VMl;
        this.A0F = f;
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public final void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        C14360o3.A0B(fArr, 1);
        A00(C05F.A00, fArr, i2, i3, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public final void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        C14360o3.A0B(fArr, 1);
        A00(C05F.A01, fArr, i2, i3, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public final void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        AbstractC167007dF.A1K(iArr, fArr);
        A00(C05F.A0C, fArr, i, i2, i5, i6);
        for (int i7 = 0; i7 < 3; i7++) {
            GLES20.glActiveTexture(33984 + i7);
            GLES20.glBindTexture(3553, iArr[i7]);
        }
        GLES20.glViewport(i3, i4, i5, i6);
        GLES20.glDrawArrays(5, 0, 4);
        int i8 = 0;
        do {
            GLES20.glActiveTexture(i8 + 33984);
            GLES20.glBindTexture(3553, 0);
            i8++;
        } while (i8 < 3);
    }

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        C14360o3.A07(allocateDirect);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        C14360o3.A07(asFloatBuffer);
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        A0H = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        C14360o3.A07(allocateDirect2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        C14360o3.A07(asFloatBuffer2);
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        A0I = asFloatBuffer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.VJx, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(java.lang.Integer r19, float[] r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71761X1a.A00(java.lang.Integer, float[], int, int, int, int):void");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public final void release() {
        C68260VJx c68260VJx = this.A0D;
        if (c68260VJx != null) {
            int i = c68260VJx.A00;
            if (i != -1) {
                GLES20.glDeleteProgram(i);
                c68260VJx.A00 = -1;
            }
            this.A0D = null;
            this.A0E = null;
        }
    }
}
