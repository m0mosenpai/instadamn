package com.meta.arfx.engine.instagram;

import X.AbstractC16830sb;
import X.AbstractServiceC201348vN;
import X.C0f9;
import X.C1RQ;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class InstagramAREngineService extends AbstractServiceC201348vN {
    public static final HashSet A00;

    static {
        String[] strArr = new String[73];
        System.arraycopy(new String[]{"fonts", "text", "textExtrusion", "dynamicTextDate", "dynamicText", "instruction", "syncDomApis", "javaScriptScripting", "blocks", "variadicMath", "composedMaterial", "renderPasses", "sharpWarp", "shaderCode", "visualShaders", "visualShadersSdf", "nativeUIControl", "nativeUIControlPicker", "nativeUIControlSlider", "nativeUIControlSliderTypeColor", "nativeUIControlEditableTextExitCB", "nativeUIControlEditableText", "nativeUIControlRawTextInput", "componentEvaluation", "imageBasedLighting", "pbrMaterial", "exposeFaceTracker96"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"faceTracker", "faceTracker3D", "faceWarp", "sceneScriptingModule", "diagnosticsScriptingModule", "reactiveScriptingModule", "locale", "hapticFeedback", "deviceMotion", "galleryPicker", "externalFonts", "networking", "persistence", "platformEvents", "rotateGestures", "pinchGestures", "rawTouchGestures", "panGestures", "tapGestures", "longPressGestures", "touchGestures", "skinSmoothing", "customFont", "javascriptToVisualProgrammingBridging", "texturesScriptingModule", "unifiedTargetTracking", "timeScriptingModule"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"deltaTime", "animationScriptingModule", "previewCaptureOutput", "staticTargetTracking", "genericML", "faceExpressionFitting", "faceExpression52Blendshapes", "irisTracking", "supportedOrientations", "animationPlaybackController", "handTracker", "boundingBoxUtilities", "hairSegmentation", "segmentation", "cameraInfoScriptingModule", "bodyTracking2DKeyPoints", "bodyTracking", "generativeAI", "graphQL"}, 0, strArr, 54, 19);
        A00 = AbstractC16830sb.A05(strArr);
    }

    @Override // X.AbstractServiceC201348vN, android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(391577100);
        super.onCreate();
        C1RQ.A03 = new C1RQ(this);
        C0f9.A0B(-1294061227, A04);
    }
}
