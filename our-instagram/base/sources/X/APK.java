package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes4.dex */
public final class APK implements GLSurfaceView.Renderer {
    public static final float[] A0B = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public InterfaceC16820sZ A00;
    public final C214139eD A01;
    public final C179877yd A08;
    public final boolean A0A;
    public final AtomicInteger A07 = new AtomicInteger(0);
    public final Map A05 = AbstractC166987dD.A1G();
    public final ArrayList A09 = AbstractC166987dD.A1E();
    public final Semaphore A06 = new Semaphore(1);
    public final C22984ABj A04 = new C22984ABj();
    public final AMk A02 = new AMk();
    public final AG5 A03 = new AG5(new C57746PjZ(this, 26));

    /* JADX WARN: Type inference failed for: r1v2, types: [X.8q7, java.lang.Object] */
    public APK(Context context, boolean z) {
        this.A0A = z;
        this.A08 = new C179877yd(context.getResources());
        this.A01 = new C214139eD(new Object(), C198548q3.A00(context.getApplicationContext(), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x008f, code lost:
    
        if (r4.size() != r3) goto L73;
     */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.8vB, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APK.A00():void");
    }

    public final synchronized Bitmap A02(Object obj) {
        Bitmap bitmap;
        Map map = this.A05;
        bitmap = null;
        if (map.containsKey(obj)) {
            C22946A9q c22946A9q = (C22946A9q) map.get(obj);
            if (c22946A9q != null) {
                synchronized (c22946A9q) {
                    bitmap = (Bitmap) c22946A9q.A01.peek();
                }
            }
            AG5 ag5 = this.A03;
            if (bitmap != null) {
                ag5.A00.put(bitmap, Integer.valueOf(AG5.A00(bitmap, ag5) | 1));
            }
        }
        return bitmap;
    }

    public final synchronized void A04(Bitmap bitmap) {
        AG5 ag5 = this.A03;
        Integer valueOf = Integer.valueOf(AG5.A00(bitmap, ag5) & (-2));
        HashMap hashMap = ag5.A00;
        hashMap.put(bitmap, valueOf);
        if (AG5.A00(bitmap, ag5) == 2) {
            ag5.A01.invoke(bitmap);
            hashMap.remove(bitmap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        if (r2 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A05(android.graphics.Bitmap r7, java.lang.Object r8, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.AMk r0 = r6.A02     // Catch: java.lang.Throwable -> La5
            java.util.Map r0 = r0.A00     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r5 = X.AbstractC166997dE.A16(r0)     // Catch: java.lang.Throwable -> La5
        L9:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> La5
            X.8s4 r0 = (X.InterfaceC199548s4) r0     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = r0.B6R()     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L9
            java.lang.String r3 = r4.getFilterName()     // Catch: java.lang.Throwable -> La5
            if (r3 == 0) goto L9
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> La5
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            java.lang.String r1 = "renderFrameTimeSeconds"
            switch(r0) {
                case -2103499532: goto L3c;
                case -2011710186: goto L39;
                case -1570040721: goto L36;
                case -1037749848: goto L33;
                case -208149521: goto L30;
                default: goto L2f;
            }     // Catch: java.lang.Throwable -> La5
        L2f:
            goto L9
        L30:
            java.lang.String r0 = "text_shimmer"
            goto L3e
        L33:
            java.lang.String r0 = "text_neon"
            goto L3e
        L36:
            java.lang.String r0 = "text_haunted"
            goto L3e
        L39:
            java.lang.String r0 = "sparkle"
            goto L3e
        L3c:
            java.lang.String r0 = "text_pixel"
        L3e:
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r4     // Catch: java.lang.Throwable -> La5
            float r0 = (float) r9     // Catch: java.lang.Throwable -> La5
            float r0 = r0 / r2
            r4.A00(r1, r0)     // Catch: java.lang.Throwable -> La5
            goto L9
        L4c:
            java.util.Map r3 = r6.A05     // Catch: java.lang.Throwable -> La5
            boolean r0 = r3.containsKey(r8)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r3.get(r8)     // Catch: java.lang.Throwable -> La5
            X.A9q r2 = (X.C22946A9q) r2     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L9e
        L5c:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> La5
            goto L7d
        L5e:
            r0 = 27
            X.PjZ r2 = new X.PjZ     // Catch: java.lang.Throwable -> La5
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> La5
            r0 = 28
            X.PjZ r1 = new X.PjZ     // Catch: java.lang.Throwable -> La5
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> La5
            X.A9q r0 = new X.A9q     // Catch: java.lang.Throwable -> La5
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> La5
            r3.put(r8, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r2 = r3.get(r8)     // Catch: java.lang.Throwable -> La5
            X.A9q r2 = (X.C22946A9q) r2     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L9e
            goto L5c
        L7d:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A02     // Catch: java.lang.Throwable -> L9a
            int r1 = r0.get()     // Catch: java.lang.Throwable -> L9a
            r0 = -1
            if (r1 == r0) goto L94
            java.util.Queue r0 = r2.A00     // Catch: java.lang.Throwable -> L9a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9a
            if (r0 < r1) goto L94
            X.0sJ r0 = r2.A04     // Catch: java.lang.Throwable -> L9a
            r0.invoke(r7)     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L94:
            java.util.Queue r0 = r2.A00     // Catch: java.lang.Throwable -> L9a
            r0.add(r7)     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L9a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        L9d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
        L9e:
            java.util.concurrent.Semaphore r0 = r6.A06     // Catch: java.lang.Throwable -> La5
            r0.release()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r6)
            return
        La5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APK.A05(android.graphics.Bitmap, java.lang.Object, long):void");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glClear(16640);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendEquationSeparate(32774, 32774);
        GLES20.glBlendFuncSeparate(770, 771, 1, 0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        C214139eD c214139eD = this.A01;
        c214139eD.Dr7(this.A08);
        c214139eD.A00(AMk.A02(this.A02, "VintageFilter", AbstractC166987dD.A1G()), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C0K8.A0C("IgluRenderer-ui", AnonymousClass001.A0g("onSurfaceCreated", ": glError ", GLUtils.getEGLErrorString(glGetError)));
            } else {
                return;
            }
        }
    }

    private final void A01() {
        int i;
        C23081AFn c23081AFn = C23081AFn.A00;
        synchronized (c23081AFn) {
        }
        ArrayList arrayList = this.A09;
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) AbstractC166997dE.A0l(A13);
            Object obj = c09530e4.A00;
            C200688uB c200688uB = (C200688uB) c09530e4.A01;
            C22984ABj c22984ABj = this.A04;
            C14360o3.A0B(c200688uB, 0);
            c22984ABj.A03.incrementAndGet();
            int i2 = c200688uB.A02;
            int i3 = c200688uB.A01;
            c22984ABj.A04.addAndGet(i2 * i3);
            C22887A7h[] c22887A7hArr = c22984ABj.A05;
            c22887A7hArr[1].A00.incrementAndGet();
            Bitmap A0F = AbstractC167007dF.A0F(i2, i3);
            AbstractC1808580n.A03("ig4a ui IgluRenderer glReadPixels");
            AnonymousClass810 anonymousClass810 = c200688uB.A03;
            AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
            int i4 = anonymousClass812.A02;
            int i5 = anonymousClass810.A01;
            if (i5 != 36197) {
                if (i4 == 0) {
                    i4 = 6408;
                }
                if (i4 != 6406) {
                    i = 3;
                    if (i4 != 6407) {
                        i = 4;
                    }
                } else {
                    i = 1;
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * i3);
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                GLES20.glGetIntegerv(36006, iArr, 0);
                GLES20.glGenFramebuffers(1, iArr2, 0);
                GLES20.glBindFramebuffer(36160, iArr2[0]);
                int i6 = anonymousClass810.A00;
                GLES20.glBindTexture(i5, i6);
                GLES20.glTexImage2D(i5, 0, i4, anonymousClass812.A01, anonymousClass812.A00, 0, i4, 5121, null);
                GLES20.glFramebufferTexture2D(36160, 36064, i5, i6, 0);
                GLES20.glReadPixels(0, 0, i2, i3, i4, 5121, allocateDirect);
                GLES20.glBindFramebuffer(36160, iArr[0]);
                GLES20.glDeleteFramebuffers(1, iArr2, 0);
                AbstractC180237zD.A02("Texture::getByteBuffer", new Object[0]);
                while (true) {
                    int glGetError = GLES20.glGetError();
                    if (glGetError == 0) {
                        break;
                    } else {
                        C0K8.A0C("ImageManager", AnonymousClass001.A0g("glReadPixels", ": glError ", GLUtils.getEGLErrorString(glGetError)));
                    }
                }
                if (allocateDirect != null) {
                    AbstractC1808580n.A01();
                    A0F.copyPixelsFromBuffer(allocateDirect);
                    synchronized (this) {
                        Map map = this.A05;
                        if (map.containsKey(obj)) {
                            C22946A9q c22946A9q = (C22946A9q) map.get(obj);
                            if (c22946A9q != null) {
                                synchronized (c22946A9q) {
                                    int i7 = c22946A9q.A03.get();
                                    Queue queue = c22946A9q.A01;
                                    int size = queue.size();
                                    if (size > 0) {
                                        InterfaceC16660sJ interfaceC16660sJ = c22946A9q.A05;
                                        Object remove = queue.remove();
                                        C14360o3.A07(remove);
                                        interfaceC16660sJ.invoke(remove);
                                    }
                                    if (i7 == -1 || size < i7) {
                                        queue.add(A0F);
                                    }
                                }
                            }
                        } else {
                            A0F.recycle();
                        }
                    }
                    c22887A7hArr[3].A01.incrementAndGet();
                    c200688uB.A01();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw new GLException(1280, "You can't use getByteBuffer()/getDebugBitmap() on the texture if the texture target is GL_TEXTURE_EXTERNAL_OES. This kind of texture can't be attached to a frame buffer. You must instead copy render this texture to another texture with target GL_TEXTURE_2D. If this is coming from a SurfaceTexture, SurfaceTextureReader can help.");
            }
        }
        arrayList.clear();
        synchronized (c23081AFn) {
        }
    }

    public final void A03() {
        C22984ABj c22984ABj = this.A04;
        if (!c22984ABj.A02.getAndSet(true)) {
            c22984ABj.A00.A00();
            c22984ABj.A01.A00();
        }
        this.A01.DrA();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        InterfaceC16820sZ interfaceC16820sZ;
        if (this.A0A) {
            try {
                A01();
                interfaceC16820sZ = this.A00;
            } catch (RuntimeException e) {
                C0w9.A07("IgluColorFilterRenderer Async render exception:", e);
            }
            if (interfaceC16820sZ == null) {
                this.A06.acquire();
                A00();
                GLES20.glBindTexture(3553, 0);
                return;
            }
            while (!AbstractC166987dD.A1a(interfaceC16820sZ.invoke()) && !this.A06.tryAcquire(2L, TimeUnit.MILLISECONDS)) {
            }
            A00();
            GLES20.glBindTexture(3553, 0);
            return;
        }
        try {
            A00();
            GLES20.glFinish();
            A01();
        } catch (RuntimeException e2) {
            C0w9.A07("IgluColorFilterRenderer Sync render exception:", e2);
        }
    }
}
