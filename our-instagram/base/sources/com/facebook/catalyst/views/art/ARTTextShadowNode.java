package com.facebook.catalyst.views.art;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes10.dex */
public class ARTTextShadowNode extends ARTShapeShadowNode {
    public int A00 = 0;
    public ReadableMap A01;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if ("bold".equals(r4.getString("fontWeight")) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if ("italic".equals(r4.getString("fontStyle")) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.graphics.Paint r5, com.facebook.catalyst.views.art.ARTTextShadowNode r6) {
        /*
            int r1 = r6.A00
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L7f
            if (r1 == r0) goto L7c
            if (r1 != r3) goto Lf
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
        Lc:
            r5.setTextAlign(r0)
        Lf:
            com.facebook.react.bridge.ReadableMap r0 = r6.A01
            if (r0 == 0) goto L77
            java.lang.String r1 = "font"
            boolean r0 = r0.hasKey(r1)
            if (r0 == 0) goto L77
            com.facebook.react.bridge.ReadableMap r0 = r6.A01
            com.facebook.react.bridge.ReadableMap r4 = r0.getMap(r1)
            if (r4 == 0) goto L77
            r2 = 1094713344(0x41400000, float:12.0)
            java.lang.String r1 = "fontSize"
            boolean r0 = r4.hasKey(r1)
            if (r0 == 0) goto L32
            double r0 = r4.getDouble(r1)
            float r2 = (float) r0
        L32:
            float r0 = r6.A02
            float r2 = r2 * r0
            r5.setTextSize(r2)
            java.lang.String r1 = "fontWeight"
            boolean r0 = r4.hasKey(r1)
            if (r0 == 0) goto L4d
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r0 = "bold"
            boolean r0 = r0.equals(r1)
            r2 = 1
            if (r0 != 0) goto L4e
        L4d:
            r2 = 0
        L4e:
            java.lang.String r1 = "fontStyle"
            boolean r0 = r4.hasKey(r1)
            if (r0 == 0) goto L63
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r0 = "italic"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L64
        L63:
            r0 = 0
        L64:
            if (r2 == 0) goto L78
            r3 = 1
            if (r0 == 0) goto L6a
            r3 = 3
        L6a:
            java.lang.String r0 = "fontFamily"
            java.lang.String r0 = r4.getString(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            r5.setTypeface(r0)
        L77:
            return
        L78:
            if (r0 != 0) goto L6a
            r3 = 0
            goto L6a
        L7c:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.RIGHT
            goto Lc
        L7f:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.art.ARTTextShadowNode.A00(android.graphics.Paint, com.facebook.catalyst.views.art.ARTTextShadowNode):void");
    }

    @ReactProp(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.A00 = i;
    }

    @ReactProp(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.A01 = readableMap;
    }
}
