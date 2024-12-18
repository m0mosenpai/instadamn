package com.facebook.catalyst.views.art;

import X.AbstractC58323PtF;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

/* loaded from: classes10.dex */
public class ARTShapeShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$Settable
    public final void Bir(Map map) {
        map.put("d", "Array");
        map.put("fill", "Array");
        AbstractC58323PtF.A1V(map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void Ebo(com.facebook.react.uimanager.ReactShadowNode r5, java.lang.Object r6, java.lang.String r7) {
        /*
            r4 = this;
            com.facebook.catalyst.views.art.ARTShapeShadowNode r5 = (com.facebook.catalyst.views.art.ARTShapeShadowNode) r5
            int r0 = r7.hashCode()
            r3 = 1
            switch(r0) {
                case -1267206133: goto L4c;
                case -891980232: goto L41;
                case -631243286: goto L36;
                case -631051390: goto L71;
                case -20363654: goto L67;
                case 100: goto L2c;
                case 3143043: goto L22;
                case 1052666732: goto L17;
                case 1924065902: goto Lb;
                default: goto La;
            }
        La:
            return
        Lb:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 8
            goto L55
        L17:
            java.lang.String r0 = "transform"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 7
            goto L55
        L22:
            java.lang.String r0 = "fill"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 6
            goto L55
        L2c:
            java.lang.String r0 = "d"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 5
            goto L55
        L36:
            java.lang.String r0 = "strokeDash"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 2
            goto L55
        L41:
            java.lang.String r0 = "stroke"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 1
            goto L55
        L4c:
            java.lang.String r0 = "opacity"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 0
        L55:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            switch(r0) {
                case 0: goto Lca;
                case 1: goto Lbf;
                case 2: goto Lb4;
                case 3: goto La8;
                case 4: goto L9c;
                case 5: goto L91;
                case 6: goto L86;
                case 7: goto L7b;
                default: goto L5b;
            }
        L5b:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L63
            float r2 = X.AbstractC166987dD.A09(r6)
        L63:
            r5.setStrokeWidth(r2)
            return
        L67:
            java.lang.String r0 = "strokeCap"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L9c
            return
        L71:
            java.lang.String r0 = "strokeJoin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto La8
            return
        L7b:
            boolean r0 = r6 instanceof com.facebook.react.bridge.ReadableArray
            if (r0 == 0) goto L82
            r1 = r6
            com.facebook.react.bridge.ReadableArray r1 = (com.facebook.react.bridge.ReadableArray) r1
        L82:
            r5.setTransform(r1)
            return
        L86:
            boolean r0 = r6 instanceof com.facebook.react.bridge.ReadableArray
            if (r0 == 0) goto L8d
            r1 = r6
            com.facebook.react.bridge.ReadableArray r1 = (com.facebook.react.bridge.ReadableArray) r1
        L8d:
            r5.setFill(r1)
            return
        L91:
            boolean r0 = r6 instanceof com.facebook.react.bridge.ReadableArray
            if (r0 == 0) goto L98
            r1 = r6
            com.facebook.react.bridge.ReadableArray r1 = (com.facebook.react.bridge.ReadableArray) r1
        L98:
            r5.setShapePath(r1)
            return
        L9c:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto La4
            int r3 = X.AbstractC166987dD.A0H(r6)
        La4:
            r5.setStrokeCap(r3)
            return
        La8:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto Lb0
            int r3 = X.AbstractC166987dD.A0H(r6)
        Lb0:
            r5.setStrokeJoin(r3)
            return
        Lb4:
            boolean r0 = r6 instanceof com.facebook.react.bridge.ReadableArray
            if (r0 == 0) goto Lbb
            r1 = r6
            com.facebook.react.bridge.ReadableArray r1 = (com.facebook.react.bridge.ReadableArray) r1
        Lbb:
            r5.setStrokeDash(r1)
            return
        Lbf:
            boolean r0 = r6 instanceof com.facebook.react.bridge.ReadableArray
            if (r0 == 0) goto Lc6
            r1 = r6
            com.facebook.react.bridge.ReadableArray r1 = (com.facebook.react.bridge.ReadableArray) r1
        Lc6:
            r5.setStroke(r1)
            return
        Lca:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto Ld2
            float r2 = X.AbstractC166987dD.A09(r6)
        Ld2:
            r5.setOpacity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.art.ARTShapeShadowNode$$PropsSetter.Ebo(com.facebook.react.uimanager.ReactShadowNode, java.lang.Object, java.lang.String):void");
    }
}
