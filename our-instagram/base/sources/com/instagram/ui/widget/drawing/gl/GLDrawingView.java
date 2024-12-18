package com.instagram.ui.widget.drawing.gl;

import X.C0f9;
import X.C14360o3;
import X.C22978ABc;
import X.C68005V5x;
import X.C68006V5y;
import X.C68735VbE;
import X.C8PW;
import X.C8PY;
import X.C8Q1;
import X.InterfaceC187098Rc;
import X.InterfaceC97754aE;
import X.MSV;
import X.RunnableC24494AtD;
import X.RunnableC24707Awo;
import X.RunnableC73549YIw;
import X.VSM;
import X.W4S;
import X.X1v;
import X.X8G;
import X.YN2;
import X.YQ3;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewParent;
import com.google.common.collect.ImmutableList;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class GLDrawingView extends MultiListenerTextureView implements TextureView.SurfaceTextureListener, InterfaceC97754aE {
    public static int A0H;
    public static final W4S A0I = new Object();
    public int A00;
    public GLSurfaceView.Renderer A01;
    public C68735VbE A02;
    public VSM A03;
    public X8G A04;
    public X1v A05;
    public C8PY A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public boolean A0B;
    public boolean A0C;
    public final GestureDetector A0D;
    public final RunnableC73549YIw A0E;
    public final WeakReference A0F;
    public final C22978ABc A0G;

    public GLDrawingView(Context context) {
        this(context, null);
    }

    public View getView() {
        return this;
    }

    public final void A03() {
        X1v x1v = this.A05;
        if (x1v != null) {
            W4S w4s = A0I;
            synchronized (w4s) {
                x1v.A09 = true;
                w4s.notifyAll();
            }
        }
    }

    public final void A04(final InterfaceC187098Rc interfaceC187098Rc, final C8Q1 c8q1) {
        Runnable runnable;
        if (c8q1 == null) {
            runnable = new RunnableC24707Awo(this, new RunnableC24494AtD(interfaceC187098Rc));
        } else {
            runnable = new Runnable() { // from class: X.YIS
                @Override // java.lang.Runnable
                public final void run() {
                    float f;
                    int i;
                    GLDrawingView gLDrawingView = GLDrawingView.this;
                    C8Q1 c8q12 = c8q1;
                    InterfaceC187098Rc interfaceC187098Rc2 = interfaceC187098Rc;
                    RunnableC73549YIw runnableC73549YIw = gLDrawingView.A0E;
                    List<C72792XnD> list = c8q12.A00;
                    runnableC73549YIw.A01();
                    YQ3 yq3 = runnableC73549YIw.A05;
                    if (yq3 != null) {
                        AbstractC73478YFb abstractC73478YFb = (AbstractC73478YFb) yq3;
                        f = abstractC73478YFb.A00;
                        i = abstractC73478YFb.A03;
                    } else {
                        f = 0.0f;
                        i = 0;
                    }
                    for (C72792XnD c72792XnD : list) {
                        C8PW c8pw = runnableC73549YIw.A03;
                        c8pw.getClass();
                        YQ3 yq32 = (YQ3) c8pw.A01.get(c72792XnD.A04);
                        runnableC73549YIw.A05 = yq32;
                        if (yq32 == null) {
                            runnableC73549YIw.A05 = new AbstractC73478YFb("FAIL_SAFE");
                        } else {
                            yq32.EeR(c72792XnD.A00);
                            runnableC73549YIw.A05.ERe(c72792XnD.A01);
                            int intValue = c72792XnD.A03.intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        if (intValue == 3) {
                                            runnableC73549YIw.A03(c72792XnD.A02);
                                            runnableC73549YIw.A0B = true;
                                        }
                                    }
                                    runnableC73549YIw.A05(c72792XnD.A02);
                                } else {
                                    runnableC73549YIw.A04(c72792XnD.A02);
                                }
                            } else {
                                runnableC73549YIw.A03(c72792XnD.A02);
                            }
                        }
                    }
                    runnableC73549YIw.A05 = yq3;
                    if (yq3 != null) {
                        yq3.EeR(f);
                        yq3.ERe(i);
                    }
                    List list2 = runnableC73549YIw.A0H;
                    int A05 = AbstractC25226BEj.A05(list2) - 10;
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        YRN yrn = (YRN) list2.get(i2);
                        yrn.E5O();
                        C73480YFd c73480YFd = runnableC73549YIw.A07;
                        c73480YFd.getClass();
                        c73480YFd.A03(yrn);
                        if (i2 <= A05 && list2.size() > 10) {
                            yrn.E5O();
                            C73480YFd c73480YFd2 = runnableC73549YIw.A08;
                            c73480YFd2.getClass();
                            c73480YFd2.A03(yrn);
                            runnableC73549YIw.A01 = i2;
                        }
                    }
                    gLDrawingView.A03();
                    interfaceC187098Rc2.DCR();
                }
            };
        }
        X1v x1v = this.A05;
        if (x1v != null) {
            x1v.A07(runnable);
        }
    }

    public final void finalize() {
        X1v x1v = this.A05;
        if (x1v != null) {
            x1v.A04();
        }
    }

    public YQ3 getBrush() {
        YQ3 yq3;
        RunnableC73549YIw runnableC73549YIw = this.A0E;
        synchronized (runnableC73549YIw) {
            yq3 = runnableC73549YIw.A05;
        }
        return yq3;
    }

    public List getBrushStrokes() {
        return this.A0E.A0G;
    }

    public final X1v getGLThread() {
        return this.A05;
    }

    public List getMarks() {
        return ImmutableList.copyOf((Collection) this.A0E.A0H);
    }

    public void setBrush(YQ3 yq3) {
        RunnableC73549YIw runnableC73549YIw = this.A0E;
        synchronized (runnableC73549YIw) {
            runnableC73549YIw.A05 = yq3;
        }
    }

    public void setBrushList(C8PW c8pw) {
        this.A0E.A03 = c8pw;
    }

    public void setBrushSize(float f) {
        YQ3 yq3;
        if (this.A0C) {
            this.A0A = f;
            return;
        }
        this.A0A = -1.0f;
        RunnableC73549YIw runnableC73549YIw = this.A0E;
        synchronized (runnableC73549YIw) {
            yq3 = runnableC73549YIw.A05;
        }
        if (yq3 == null) {
            return;
        }
        yq3.EeR(f);
    }

    public final void setEGLConfigChooser(X8G x8g) {
        if (this.A05 == null) {
            this.A04 = x8g;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public final void setEGLContextClientVersion(int i) {
        if (this.A05 == null) {
            this.A00 = i;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public void setGLThreadListener(C8PY c8py) {
        this.A06 = c8py;
        if (this.A08 && c8py != null) {
            c8py.DIn(this.A05, this.A0G);
        }
    }

    public void setOnDrawListener(YN2 yn2) {
        this.A0E.A04 = yn2;
    }

    public final void setRenderMode(int i) {
        X1v x1v = this.A05;
        if (x1v != null) {
            x1v.A05(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.VSM, java.lang.Object] */
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        if (this.A05 == null) {
            if (this.A04 == null) {
                this.A04 = new C68005V5x(this);
            }
            if (this.A02 == null) {
                this.A02 = new C68735VbE(this);
            }
            if (this.A03 == null) {
                this.A03 = new Object();
            }
            this.A01 = renderer;
            X1v x1v = new X1v(this.A0F);
            x1v.start();
            this.A05 = x1v;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i;
        int A06 = C0f9.A06(1018381375);
        super.onAttachedToWindow();
        if (this.A0B && this.A01 != null) {
            X1v x1v = this.A05;
            if (x1v != null) {
                synchronized (A0I) {
                    i = x1v.A00;
                }
            } else {
                i = 1;
            }
            X1v x1v2 = new X1v(this.A0F);
            if (i != 1) {
                x1v2.A05(i);
            }
            x1v2.start();
            this.A05 = x1v2;
        }
        this.A0B = false;
        C0f9.A0D(-1149544843, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(837464685);
        X1v x1v = this.A05;
        if (x1v != null) {
            x1v.A04();
        }
        this.A0B = true;
        super.onDetachedFromWindow();
        C0f9.A0D(2071669339, A06);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1453115188);
        super.onSizeChanged(i, i2, i3, i4);
        getSurfaceTexture();
        X1v x1v = this.A05;
        if (x1v != null) {
            x1v.A06(i, i2);
        }
        C0f9.A0D(-287971557, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1525605555);
        boolean isEnabled = isEnabled();
        if (isEnabled) {
            this.A0D.onTouchEvent(motionEvent);
            RunnableC73549YIw runnableC73549YIw = this.A0E;
            runnableC73549YIw.A0K.offer(MotionEvent.obtain(motionEvent));
            X1v x1v = this.A05;
            if (x1v != null) {
                x1v.A07(runnableC73549YIw);
            }
            A03();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = true;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    z = false;
                }
            } else {
                float f = this.A0A;
                if (f != -1.0f) {
                    setBrushSize(f);
                }
            }
            this.A0C = z;
            ViewParent parent = getParent();
            parent.getClass();
            parent.requestDisallowInterceptTouchEvent(z);
        }
        C0f9.A0C(-1857207591, A05);
        return isEnabled;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.A07) {
            A01();
        }
    }

    public final void setPreserveEGLContextOnPause(boolean z) {
        this.A09 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        this.A0F = new WeakReference(this);
        Object systemService = context.getSystemService("activity");
        C14360o3.A0C(systemService, MSV.A00(236));
        A0H = ((ActivityManager) systemService).getDeviceConfigurationInfo().reqGlEsVersion;
        A02(this);
        this.A0A = -1.0f;
        this.A0D = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.9TF
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                GLDrawingView gLDrawingView = GLDrawingView.this;
                gLDrawingView.A0E.A0B = true;
                gLDrawingView.A03();
            }
        });
        C22978ABc c22978ABc = new C22978ABc(context);
        this.A0G = c22978ABc;
        setOpaque(false);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new C68006V5y(this, 8, 0));
        this.A09 = true;
        RunnableC73549YIw runnableC73549YIw = new RunnableC73549YIw(this, c22978ABc);
        this.A0E = runnableC73549YIw;
        setRenderer(runnableC73549YIw);
        setRenderMode(0);
        RunnableC24707Awo runnableC24707Awo = new RunnableC24707Awo(this, null);
        X1v x1v = this.A05;
        if (x1v != null) {
            x1v.A07(runnableC24707Awo);
        }
    }
}
