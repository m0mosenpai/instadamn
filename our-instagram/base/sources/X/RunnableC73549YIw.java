package X;

import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.MotionEvent;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.YIw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73549YIw implements Runnable, GLSurfaceView.Renderer {
    public int A00;
    public long A02;
    public C8PW A03;
    public YN2 A04;
    public YQ3 A05;
    public YRN A06;
    public C73480YFd A07;
    public C73480YFd A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC97754aE A0E;
    public final C22978ABc A0F;
    public final BlockingQueue A0K = new LinkedBlockingQueue();
    public final float[] A0L = new float[16];
    public final java.util.Set A0J = AbstractC166987dD.A1H();
    public final Point A0C = new Point(0, 0);
    public final List A0H = Collections.synchronizedList(AbstractC166987dD.A1E());
    public final List A0G = AbstractC166987dD.A1E();
    public final Handler A0D = AbstractC167007dF.A0J();
    public final List A0I = AbstractC166987dD.A1E();
    public int A01 = -1;

    public final void A03(W92 w92) {
        synchronized (this) {
            YQ3 yq3 = this.A05;
            if (yq3 != null && yq3.isValid()) {
                yq3.EQD(this.A0C);
                yq3.EYc(this.A0L);
                this.A0J.add(yq3);
                YRN AMV = yq3.AMV();
                this.A06 = AMV;
                if (AMV != null) {
                    this.A0H.add(AMV);
                    AMV.EoH(w92);
                    this.A02 = w92.A03;
                }
                A00(w92, C05F.A00, yq3, yq3.Aia(), this.A0G);
            }
        }
        this.A0A = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        XO2 xo2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        InterfaceC97754aE interfaceC97754aE = this.A0E;
        C22978ABc c22978ABc = this.A0F;
        GLDrawingView gLDrawingView = (GLDrawingView) interfaceC97754aE;
        gLDrawingView.A08 = true;
        C8PY c8py = gLDrawingView.A06;
        if (c8py != null) {
            c8py.DIn(gLDrawingView.A05, c22978ABc);
        }
        XO3 A01 = AHg.A01(c22978ABc, R.raw.vertex_position, R.raw.fragment);
        C72284Xah.A02 = A01;
        AbstractC72243XZy A09 = AbstractC72046XLm.A09("uColor", A01.A03);
        if (A09 instanceof XO2) {
            xo2 = (XO2) A09;
        } else {
            xo2 = null;
        }
        C72284Xah.A03 = xo2;
        C72867Xpa c72867Xpa = new C72867Xpa(C72284Xah.A02, 8);
        C72284Xah.A05 = c72867Xpa;
        c72867Xpa.A02(2, 5126, "aPosition", false, 0);
        float[] fArr = C72284Xah.A06;
        ByteBuffer A0j = AbstractC65702TsY.A0j(32);
        A0j.asFloatBuffer().put(fArr);
        A0j.rewind();
        C72284Xah.A04 = new VBE(c22978ABc, A0j);
        GLES20.glEnable(3042);
        GLES20.glDisable(2929);
        C17280tP A012 = C17280tP.A01(c22978ABc.A00);
        InterfaceC16530ry interfaceC16530ry = A012.A2G;
        C0YR[] c0yrArr = C17280tP.A4G;
        if (((String) AbstractC31171DnF.A0Y(A012, interfaceC16530ry, c0yrArr, 56)).isEmpty()) {
            try {
                String glGetString = gl10.glGetString(7936);
                String glGetString2 = gl10.glGetString(7937);
                C14360o3.A0B(glGetString2, 0);
                A012.A2F.Egi(A012, glGetString2, c0yrArr[57]);
                C14360o3.A0B(glGetString, 0);
                interfaceC16530ry.Egi(A012, glGetString, c0yrArr[56]);
            } catch (Exception unused) {
                C0w9.A03("AbstractDrawingRenderer", "prepareOpenGLInfo() failed when getting the GPU info");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XnD, java.lang.Object] */
    public static void A00(W92 w92, Integer num, Object obj, String str, List list) {
        AbstractC73478YFb abstractC73478YFb = (AbstractC73478YFb) obj;
        int i = abstractC73478YFb.A03;
        float f = abstractC73478YFb.A00;
        ?? obj2 = new Object();
        obj2.A03 = num;
        obj2.A04 = str;
        obj2.A01 = i;
        obj2.A00 = f;
        obj2.A02 = w92;
        list.add(obj2);
    }

    public final void A01() {
        this.A0G.clear();
        this.A0H.clear();
        C73480YFd c73480YFd = this.A07;
        if (c73480YFd != null) {
            c73480YFd.A02();
        }
        C73480YFd c73480YFd2 = this.A08;
        if (c73480YFd2 != null) {
            c73480YFd2.A02();
        }
        this.A01 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r8 = this;
            java.util.List r4 = r8.A0G
            int r3 = r4.size()
        L6:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L1f
            java.lang.Object r2 = r4.remove(r3)
            r2.getClass()
            X.XnD r2 = (X.C72792XnD) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L1f
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L6
        L1f:
            java.util.List r7 = r8.A0H
            boolean r0 = r7.isEmpty()
            r3 = 1
            if (r0 != 0) goto L30
            int r0 = r7.size()
            int r0 = r0 - r3
            r7.remove(r0)
        L30:
            X.YFd r6 = r8.A07
            if (r6 == 0) goto L90
            r6.A02()
            int r0 = r8.A01
            r5 = 0
            r2 = -1
            if (r0 == r2) goto L84
            int r1 = r7.size()
            int r1 = r1 - r3
            int r0 = r8.A01
            if (r1 <= r0) goto L84
            r4 = 1
            int r5 = r0 + 1
            X.YFd r0 = r8.A08
            r0.getClass()
            r6.A03(r0)
        L51:
            int r3 = X.AbstractC25226BEj.A05(r7)
            r2 = 10
            int r3 = r3 - r2
        L58:
            int r0 = r7.size()
            if (r5 >= r0) goto L90
            java.lang.Object r1 = r7.get(r5)
            X.YRN r1 = (X.YRN) r1
            r1.E5O()
            r6.A03(r1)
            if (r4 != 0) goto L81
            if (r5 > r3) goto L81
            int r0 = r7.size()
            if (r0 <= r2) goto L81
            r1.E5O()
            X.YFd r0 = r8.A08
            r0.getClass()
            r0.A03(r1)
            r8.A01 = r5
        L81:
            int r5 = r5 + 1
            goto L58
        L84:
            r4 = 0
            r8.A01 = r2
            X.YFd r0 = r8.A08
            r0.getClass()
            r0.A02()
            goto L51
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC73549YIw.A02():void");
    }

    public final void A04(W92 w92) {
        YRN yrn = this.A06;
        if (yrn != null && w92.A03 > this.A02) {
            if (w92.A02 != -1) {
                this.A0I.add(w92.A04);
            }
            yrn.AJw(w92);
            this.A02 = w92.A03;
            List list = this.A0G;
            Integer num = C05F.A01;
            YQ3 yq3 = this.A05;
            yq3.getClass();
            A00(w92, num, this.A05, yq3.Aia(), list);
        }
    }

    public final void A05(W92 w92) {
        YRN yrn = this.A06;
        if (yrn != null && w92 != null) {
            List list = this.A0I;
            yrn.ANd(w92, list);
            w92.A03 = Math.max(w92.A03, this.A02 + 1);
            yrn.ASf(w92);
            List list2 = this.A0G;
            Integer num = C05F.A0C;
            YQ3 yq3 = this.A05;
            yq3.getClass();
            A00(w92, num, this.A05, yq3.Aia(), list2);
            list.clear();
        }
        this.A0A = true;
        if (this.A0B && this.A05 != null) {
            A02();
            AbstractC73479YFc abstractC73479YFc = new AbstractC73479YFc();
            abstractC73479YFc.A01(this.A05);
            this.A06 = abstractC73479YFc;
            this.A0H.add(abstractC73479YFc);
            List list3 = this.A0G;
            Integer num2 = C05F.A0N;
            YQ3 yq32 = this.A05;
            yq32.getClass();
            A00(w92, num2, this.A05, yq32.Aia(), list3);
            this.A0B = false;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        YRN yrn = this.A06;
        if (yrn != null) {
            yrn.E5r();
            if (this.A0A) {
                this.A0A = false;
                C73480YFd c73480YFd = this.A07;
                c73480YFd.getClass();
                c73480YFd.A03(this.A06);
                this.A06 = null;
                List list = this.A0H;
                int A05 = AbstractC25226BEj.A05(list) - 10;
                if (A05 >= 0 && this.A01 != A05) {
                    this.A01 = A05;
                    YRN yrn2 = (YRN) list.get(A05);
                    yrn2.E5O();
                    C73480YFd c73480YFd2 = this.A08;
                    c73480YFd2.getClass();
                    c73480YFd2.A03(yrn2);
                }
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        C73480YFd c73480YFd3 = this.A07;
        c73480YFd3.getClass();
        c73480YFd3.AQO();
        YRN yrn3 = this.A06;
        if (yrn3 != null) {
            yrn3.AQO();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r14 == r1.A01) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r14 == r1.A01) goto L20;
     */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r12, int r13, int r14) {
        /*
            r11 = this;
            android.graphics.Point r2 = r11.A0C
            r2.set(r13, r14)
            r4 = 0
            r12.glViewport(r4, r4, r13, r14)
            float[] r3 = r11.A0L
            float r6 = (float) r13
            float r7 = (float) r14
            r5 = 0
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r8 = r5
            android.opengl.Matrix.orthoM(r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.Set r0 = r11.A0J
            java.util.Iterator r1 = r0.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r1.next()
            X.YQ3 r0 = (X.YQ3) r0
            r0.EYc(r3)
            r0.EQD(r2)
            goto L1c
        L2f:
            X.YFd r2 = r11.A07
            if (r2 == 0) goto L3d
            X.XOI r1 = r2.A05
            int r0 = r1.A03
            if (r13 != r0) goto L3d
            int r0 = r1.A01
            if (r14 == r0) goto L47
        L3d:
            X.ABc r0 = r11.A0F
            X.YFd r2 = new X.YFd
            r2.<init>(r0, r13, r14)
            r2.A02()
        L47:
            r11.A07 = r2
            X.YFd r2 = r11.A08
            if (r2 == 0) goto L57
            X.XOI r1 = r2.A05
            int r0 = r1.A03
            if (r13 != r0) goto L57
            int r0 = r1.A01
            if (r14 == r0) goto L61
        L57:
            X.ABc r0 = r11.A0F
            X.YFd r2 = new X.YFd
            r2.<init>(r0, r13, r14)
            r2.A02()
        L61:
            r11.A08 = r2
            r0 = -1
            r11.A01 = r0
            r2 = 0
        L67:
            java.util.List r1 = r11.A0H
            int r0 = r1.size()
            if (r2 >= r0) goto L80
            java.lang.Object r1 = r1.get(r2)
            X.YRN r1 = (X.YRN) r1
            r1.E5O()
            X.YFd r0 = r11.A07
            r0.A03(r1)
            int r2 = r2 + 1
            goto L67
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC73549YIw.onSurfaceChanged(javax.microedition.khronos.opengles.GL10, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.W92, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Runnable runnableC73503YGh;
        C22978ABc c22978ABc = this.A0F;
        while (true) {
            Queue queue = c22978ABc.A02;
            if (queue.isEmpty()) {
                break;
            }
            Runnable runnable = (Runnable) queue.remove();
            if (runnable != null) {
                runnable.run();
            }
        }
        while (!this.A09) {
            BlockingQueue blockingQueue = this.A0K;
            if (!blockingQueue.isEmpty()) {
                Object poll = blockingQueue.poll();
                poll.getClass();
                MotionEvent motionEvent = (MotionEvent) poll;
                if (this.A0B) {
                    motionEvent.setAction(3);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3 && actionMasked != 6) {
                            }
                        } else if (this.A00 == motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8)) {
                            int historySize = motionEvent.getHistorySize();
                            for (int i = 0; i < historySize; i++) {
                                ?? obj = new Object();
                                PointF pointF = new PointF(0.0f, 0.0f);
                                obj.A04 = pointF;
                                obj.A02 = -1;
                                pointF.set(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i));
                                obj.A03 = motionEvent.getHistoricalEventTime(i);
                                obj.A01 = motionEvent.getHistoricalSize(i);
                                obj.A00 = motionEvent.getHistoricalPressure(i);
                                obj.A02 = i;
                                A04(obj);
                            }
                            A04(new W92(motionEvent));
                        }
                        motionEvent.recycle();
                    }
                    if (this.A00 == motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8)) {
                        A05(new W92(motionEvent));
                    }
                    if (motionEvent.getPointerCount() != 1) {
                        motionEvent.recycle();
                    } else {
                        handler = this.A0D;
                        runnableC73503YGh = new RunnableC73504YGi(this);
                    }
                } else {
                    this.A00 = motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
                    A03(new W92(motionEvent));
                    handler = this.A0D;
                    runnableC73503YGh = new RunnableC73503YGh(this);
                }
                handler.post(runnableC73503YGh);
                motionEvent.recycle();
            } else {
                return;
            }
        }
    }

    public RunnableC73549YIw(InterfaceC97754aE interfaceC97754aE, C22978ABc c22978ABc) {
        this.A0F = c22978ABc;
        this.A0E = interfaceC97754aE;
    }
}
