package com.instagram.common.ui.widget.textureview;

import X.AbstractC111324zv;
import X.C0w9;
import X.C14360o3;
import X.C97764aF;
import X.InterfaceC97704a7;
import X.TextureViewSurfaceTextureListenerC97714a8;
import X.W4S;
import X.X1v;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class MultiListenerTextureView extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC97704a7 {
    public TextureViewSurfaceTextureListenerC97714a8 A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiListenerTextureView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A02(TextureView.SurfaceTextureListener surfaceTextureListener) {
        C14360o3.A0B(surfaceTextureListener, 0);
        this.A00.A00.add(surfaceTextureListener);
    }

    public final void setDelegate(TextureViewSurfaceTextureListenerC97714a8 textureViewSurfaceTextureListenerC97714a8) {
        C14360o3.A0B(textureViewSurfaceTextureListenerC97714a8, 0);
        this.A00 = textureViewSurfaceTextureListenerC97714a8;
    }

    public final void A01() {
        if (this instanceof GLDrawingView) {
            GLDrawingView gLDrawingView = (GLDrawingView) this;
            gLDrawingView.A03();
            X1v x1v = gLDrawingView.A05;
            if (x1v != null) {
                W4S w4s = GLDrawingView.A0I;
                synchronized (w4s) {
                    x1v.A08 = false;
                    x1v.A09 = true;
                    x1v.A07 = false;
                    w4s.notifyAll();
                    while (!x1v.A01 && x1v.A06 && !x1v.A07) {
                        try {
                            w4s.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            gLDrawingView.A0E.A09 = false;
            gLDrawingView.A07 = false;
            return;
        }
        TextureViewSurfaceTextureListenerC97714a8 textureViewSurfaceTextureListenerC97714a8 = this.A00;
        if (textureViewSurfaceTextureListenerC97714a8 instanceof C97764aF) {
            C97764aF c97764aF = (C97764aF) textureViewSurfaceTextureListenerC97714a8;
            SurfaceTexture surfaceTexture = c97764aF.A00;
            if (c97764aF.A01 && surfaceTexture != null) {
                InterfaceC97704a7 interfaceC97704a7 = c97764aF.A02;
                if (interfaceC97704a7.getSurfaceTexture() == null) {
                    interfaceC97704a7.setSurfaceTexture(surfaceTexture);
                } else {
                    C0w9.A03("SurfaceTextureManagedMultiListenerDelegate", "trying to set a surface texture when we have already set one");
                }
            }
        }
    }

    public final TextureViewSurfaceTextureListenerC97714a8 getDelegate() {
        return this.A00;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Activity activity;
        if (this instanceof GLDrawingView) {
            C14360o3.A0B(surfaceTexture, 0);
            X1v x1v = ((GLDrawingView) this).A05;
            if (x1v != null) {
                W4S w4s = GLDrawingView.A0I;
                synchronized (w4s) {
                    x1v.A03 = true;
                    x1v.A02 = false;
                    w4s.notifyAll();
                    while (x1v.A0B && !x1v.A02 && !x1v.A01) {
                        try {
                            w4s.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                return;
            }
            return;
        }
        C14360o3.A0B(surfaceTexture, 0);
        try {
            this.A00.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        } catch (RuntimeException e) {
            Context context = getContext();
            Boolean bool = null;
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                bool = Boolean.valueOf(activity.isFinishing());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append(", width: ");
            sb.append(i);
            sb.append(AbstractC111324zv.A00(1418));
            sb.append(i2);
            sb.append(", activity is finishing: ");
            sb.append(bool);
            C0w9.A06("MultiListenerTextureView_onSurfaceTextureAvailable()", sb.toString(), e);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this instanceof GLDrawingView) {
            C14360o3.A0B(surfaceTexture, 0);
            X1v x1v = ((GLDrawingView) this).A05;
            if (x1v != null) {
                W4S w4s = GLDrawingView.A0I;
                synchronized (w4s) {
                    x1v.A03 = false;
                    w4s.notifyAll();
                    while (!x1v.A0B && !x1v.A01) {
                        try {
                            w4s.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                return true;
            }
            return true;
        }
        C14360o3.A0B(surfaceTexture, 0);
        return this.A00.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this instanceof GLDrawingView) {
            C14360o3.A0B(surfaceTexture, 0);
            X1v x1v = ((GLDrawingView) this).A05;
            if (x1v != null) {
                x1v.A06(i, i2);
                return;
            }
            return;
        }
        C14360o3.A0B(surfaceTexture, 0);
        this.A00.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (!(this instanceof GLDrawingView)) {
            C14360o3.A0B(surfaceTexture, 0);
            this.A00.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Use addSurfaceTextureListener instead. If you only have one listener, you shouldn't be using this custom view.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiListenerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = new TextureViewSurfaceTextureListenerC97714a8(null);
        super.setSurfaceTextureListener(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiListenerTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ MultiListenerTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
