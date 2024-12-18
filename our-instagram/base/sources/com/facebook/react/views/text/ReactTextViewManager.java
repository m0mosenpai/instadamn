package com.facebook.react.views.text;

import X.AbstractC010103p;
import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.C00O;
import X.C05F;
import X.C0fY;
import X.C3WF;
import X.C66330U9e;
import X.C66365UDi;
import X.C66375UEj;
import X.C68688VaO;
import X.C69418Vn3;
import X.EnumC78643fW;
import X.InterfaceC65225TgH;
import X.InterfaceC65358Tim;
import X.InterfaceC71842X7a;
import X.InterfaceC72045XLb;
import X.R3N;
import X.SKS;
import X.WGL;
import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

@ReactModule(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager implements InterfaceC65358Tim {
    public static final String REACT_CLASS = "RCTText";
    public static final String TAG = "ReactTextViewManager";
    public static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    public static final short TX_STATE_KEY_HASH = 2;
    public static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    public static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    public InterfaceC71842X7a mReactTextViewManagerCallback;

    public ReactTextViewManager(InterfaceC71842X7a interfaceC71842X7a) {
        super(null);
        this.mReactTextViewManagerCallback = interfaceC71842X7a;
        setupViewRecycling();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r1 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        r13 = 5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object getReactTextUpdate(X.C66365UDi r17, X.SKS r18, X.InterfaceC72045XLb r19) {
        /*
            r16 = this;
            r3 = 0
            r1 = r19
            X.XLb r5 = r1.getMapBuffer(r3)
            r0 = 1
            X.XLb r4 = r1.getMapBuffer(r0)
            r6 = r17
            android.content.Context r0 = r6.getContext()
            android.text.Spannable r7 = X.WGL.A03(r0, r5)
            r6.setSpanned(r7)
            r0 = 6
            double r1 = r4.getDouble(r0)     // Catch: java.lang.IllegalArgumentException -> L7c
            float r0 = (float) r1     // Catch: java.lang.IllegalArgumentException -> L7c
            r6.setMinimumFontSize(r0)     // Catch: java.lang.IllegalArgumentException -> L7c
            r0 = 2
            java.lang.String r0 = r4.getString(r0)
            int r14 = X.W6Q.A01(r0)
            int r15 = r6.getJustificationMode()
            int r13 = r6.getGravityHorizontal()
            android.text.Layout$Alignment r2 = X.WGL.A01(r7, r5)
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r0 = r7.length()
            boolean r1 = r1.isRtl(r7, r3, r0)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r2 != r0) goto L6e
            if (r1 == 0) goto L74
        L47:
            r13 = 5
        L48:
            java.lang.String r2 = "textAlign"
            r0 = r18
            com.facebook.react.bridge.ReadableMap r1 = r0.A00
            boolean r0 = r1.hasKey(r2)
            if (r0 == 0) goto L62
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r1)
            boolean r15 = X.AbstractC167007dF.A1M(r0)
        L62:
            r12 = -1
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.Vn3 r6 = new X.Vn3
            r9 = r8
            r10 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L6e:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r2 != r0) goto L76
            if (r1 == 0) goto L47
        L74:
            r13 = 3
            goto L48
        L76:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r2 != r0) goto L48
            r13 = 1
            goto L48
        L7c:
            r3 = move-exception
            if (r4 == 0) goto L8f
            java.lang.String r0 = r4.toString()
        L83:
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ReactTextViewManager"
            java.lang.String r0 = "Paragraph Attributes: %s"
            X.C0I2.A08(r1, r0, r2)
            throw r3
        L8f:
            java.lang.String r0 = "<empty>"
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.getReactTextUpdate(X.UDi, X.SKS, X.XLb):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3WF, X.UDi] */
    @Override // com.facebook.react.uimanager.ViewManager
    public C66365UDi createViewInstance(R3N r3n) {
        ?? c3wf = new C3WF(r3n, null);
        c3wf.A04 = C05F.A00;
        C66365UDi.A02(c3wf);
        return c3wf;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, InterfaceC72045XLb interfaceC72045XLb, InterfaceC72045XLb interfaceC72045XLb2, InterfaceC72045XLb interfaceC72045XLb3, float f, EnumC78643fW enumC78643fW, float f2, EnumC78643fW enumC78643fW2, float[] fArr) {
        return WGL.A00(context, interfaceC72045XLb, interfaceC72045XLb2, enumC78643fW, enumC78643fW2, fArr, f, f2);
    }

    @Override // X.InterfaceC65358Tim
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public ReactTextShadowNode createShadowNodeInstance(InterfaceC71842X7a interfaceC71842X7a) {
        return new ReactTextShadowNode(interfaceC71842X7a);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactTextShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C66365UDi c66365UDi, Object obj) {
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactTextViewManager.updateExtraData", 1653250206);
        try {
            C69418Vn3 c69418Vn3 = (C69418Vn3) obj;
            Spannable spannable = c69418Vn3.A08;
            c66365UDi.setText(c69418Vn3);
            C66330U9e[] c66330U9eArr = (C66330U9e[]) spannable.getSpans(0, spannable.length(), C66330U9e.class);
            if (c66330U9eArr.length > 0) {
                c66365UDi.setTag(R.id.accessibility_links, new C68688VaO(spannable, c66330U9eArr));
                AbstractC010103p.A0B(c66365UDi, new C66375UEj(c66365UDi, c66365UDi.getImportantForAccessibility(), c66365UDi.isFocusable()));
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
        } catch (Throwable th) {
            try {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public Object updateState(C66365UDi c66365UDi, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactTextViewManager.updateState", 1653250206);
        try {
            throw new NullPointerException("getStateDataMapBuffer");
        } catch (Throwable th) {
            try {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.putAll(AbstractC65702TsY.A0m("topTextLayout", AbstractC31174DnI.A12("registrationName", "onTextLayout"), "topInlineViewLayout", AbstractC31174DnI.A12("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C66365UDi c66365UDi) {
        TextUtils.TruncateAt truncateAt;
        super.onAfterUpdateTransaction((View) c66365UDi);
        if (c66365UDi.A01 != Integer.MAX_VALUE && !c66365UDi.A05) {
            truncateAt = c66365UDi.A03;
        } else {
            truncateAt = null;
        }
        c66365UDi.setEllipsize(truncateAt);
    }

    public C66365UDi prepareToRecycleView(R3N r3n, C66365UDi c66365UDi) {
        super.prepareToRecycleView(r3n, (View) c66365UDi);
        if (c66365UDi != null) {
            c66365UDi.A03();
            setSelectionColor(c66365UDi, null);
        }
        return c66365UDi;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(C66365UDi c66365UDi, String str) {
        c66365UDi.setOverflow(str);
    }

    public void setPadding(C66365UDi c66365UDi, int i, int i2, int i3, int i4) {
        c66365UDi.setPadding(i, i2, i3, i4);
    }

    public ReactTextViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ReactTextShadowNode(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3WF, android.view.View, X.UDi] */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        ?? c3wf = new C3WF(r3n, null);
        c3wf.A04 = C05F.A00;
        C66365UDi.A02(c3wf);
        return c3wf;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View prepareToRecycleView(R3N r3n, View view) {
        C66365UDi c66365UDi = (C66365UDi) view;
        prepareToRecycleView(r3n, c66365UDi);
        return c66365UDi;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void setPadding(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        updateState((C66365UDi) view, sks, interfaceC65225TgH);
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactTextShadowNode createShadowNodeInstance() {
        return new ReactTextShadowNode(null);
    }
}
