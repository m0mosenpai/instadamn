package com.facebook.catalyst.views.art;

import X.AbstractC166987dD;
import X.InterfaceC50872Vi;
import X.InterfaceC65225TgH;
import X.Q21;
import X.QFL;
import X.R3N;
import X.SKS;
import X.T2H;
import X.UAC;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;

@ReactModule(name = ARTSurfaceViewManager.REACT_CLASS)
/* loaded from: classes10.dex */
public class ARTSurfaceViewManager extends BaseViewManager {
    public static final InterfaceC50872Vi MEASURE_FUNCTION = new T2H();
    public static final String REACT_CLASS = "ARTSurfaceView";

    public ARTSurfaceViewManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.react.uimanager.LayoutShadowNode, com.facebook.catalyst.views.art.ARTSurfaceViewShadowNode, com.facebook.react.uimanager.ReactShadowNodeImpl] */
    @Override // com.facebook.react.uimanager.ViewManager
    public ARTSurfaceViewShadowNode createShadowNodeInstance() {
        ?? layoutShadowNode = new LayoutShadowNode();
        layoutShadowNode.A09(MEASURE_FUNCTION);
        return layoutShadowNode;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.TextureView, X.UAC] */
    @Override // com.facebook.react.uimanager.ViewManager
    public UAC createViewInstance(R3N r3n) {
        ?? textureView = new TextureView(r3n);
        textureView.setOpaque(false);
        return textureView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ARTSurfaceViewShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(UAC uac, int i) {
        if (uac instanceof QFL) {
            uac.setBackgroundColor(i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        TextureView textureView = (TextureView) view;
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) obj;
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        textureView.setSurfaceTextureListener(aRTSurfaceViewShadowNode);
        if (surfaceTexture != null && aRTSurfaceViewShadowNode.A00 == null) {
            aRTSurfaceViewShadowNode.A00 = new Surface(surfaceTexture);
            ARTSurfaceViewShadowNode.A00(aRTSurfaceViewShadowNode, true);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(UAC uac, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        if (!(uac instanceof QFL) || interfaceC65225TgH == null) {
            return null;
        }
        throw AbstractC166987dD.A15("getStateData");
    }

    public static boolean isFabric(UAC uac) {
        return uac instanceof QFL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.TmH, android.view.View, android.view.TextureView] */
    @Override // com.facebook.react.uimanager.ViewManager
    public UAC createViewInstance(int i, R3N r3n, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        UAC uac;
        if (i % 2 == 0) {
            ?? textureView = new TextureView(r3n);
            textureView.setOpaque(false);
            Context context = textureView.getContext();
            uac = textureView;
            if (context instanceof R3N) {
                ((Q21) context).A0A(textureView);
                uac = textureView;
            }
        } else {
            TextureView textureView2 = new TextureView(r3n);
            textureView2.setOpaque(false);
            uac = textureView2;
        }
        uac.setId(i);
        if (sks != null) {
            updateProperties(uac, sks);
        }
        if (interfaceC65225TgH != null && sks != null) {
            updateState(uac, sks, interfaceC65225TgH);
        }
        return uac;
    }

    public void updateExtraData(UAC uac, Object obj) {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) obj;
        SurfaceTexture surfaceTexture = uac.getSurfaceTexture();
        uac.setSurfaceTextureListener(aRTSurfaceViewShadowNode);
        if (surfaceTexture != null && aRTSurfaceViewShadowNode.A00 == null) {
            aRTSurfaceViewShadowNode.A00 = new Surface(surfaceTexture);
            ARTSurfaceViewShadowNode.A00(aRTSurfaceViewShadowNode, true);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        TextureView textureView = new TextureView(r3n);
        textureView.setOpaque(false);
        return textureView;
    }
}
