package com.facebook.catalyst.views.art;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.AnonymousClass001;
import X.C0I2;
import X.InterfaceC65542TmH;
import X.R3N;
import X.R5c;
import X.SZN;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes10.dex */
public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements TextureView.SurfaceTextureListener, InterfaceC65542TmH {
    public Surface A00;
    public Integer A01;

    private void A01(ReactShadowNode reactShadowNode) {
        for (int i = 0; i < reactShadowNode.AnZ(); i++) {
            ReactShadowNodeImpl A06 = ((ReactShadowNodeImpl) reactShadowNode).A06(i);
            A06.CnK();
            A01(A06);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final void A08(SZN szn) {
        A00(this, false);
        szn.A0F.add(new R5c(szn, this, ((ReactShadowNodeImpl) this).A00));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final boolean A0B() {
        return true;
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
        A00(this, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public static void A00(ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode, boolean z) {
        Surface surface = aRTSurfaceViewShadowNode.A00;
        if (surface != null && surface.isValid()) {
            try {
                Canvas lockCanvas = aRTSurfaceViewShadowNode.A00.lockCanvas(null);
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Integer num = aRTSurfaceViewShadowNode.A01;
                if (num != null) {
                    lockCanvas.drawColor(num.intValue());
                }
                Paint A0R = AbstractC166987dD.A0R();
                for (int i = 0; i < aRTSurfaceViewShadowNode.AnZ(); i++) {
                    ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) aRTSurfaceViewShadowNode.A06(i);
                    aRTVirtualNode.A0E(lockCanvas, A0R, 1.0f);
                    if (z) {
                        aRTVirtualNode.A07();
                    } else {
                        aRTVirtualNode.CnK();
                    }
                }
                Surface surface2 = aRTSurfaceViewShadowNode.A00;
                if (surface2 != null) {
                    surface2.unlockCanvasAndPost(lockCanvas);
                    return;
                }
                return;
            } catch (IllegalArgumentException | IllegalStateException e) {
                C0I2.A03("ReactNative", AnonymousClass001.A0R(AbstractC31173DnH.A0q(e), " in Surface.unlockCanvasAndPost"));
                return;
            }
        }
        aRTSurfaceViewShadowNode.A01(aRTSurfaceViewShadowNode);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void Eff(R3N r3n) {
        this.A0A = r3n;
        r3n.A0A(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = new Surface(surfaceTexture);
        A00(this, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.release();
        this.A00 = null;
        return true;
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.A01 = num;
        A07();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void dispose() {
        super.dispose();
        R3N r3n = this.A0A;
        AbstractC05810Sj.A00(r3n);
        r3n.A0B(this);
    }
}
