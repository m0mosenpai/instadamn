package com.facebook.react.views.text;

import X.AbstractC05810Sj;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC78533fL;
import X.C63389Sj5;
import X.C69418Vn3;
import X.C70506WZn;
import X.C70507WZo;
import X.EnumC77763e0;
import X.EnumC78563fO;
import X.InterfaceC50872Vi;
import X.InterfaceC65378TjB;
import X.InterfaceC71842X7a;
import X.Q45;
import X.R5c;
import X.SZN;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    public static final TextPaint A04 = new TextPaint(1);
    public Spannable A00;
    public boolean A01;
    public final InterfaceC65378TjB A02;
    public final InterfaceC50872Vi A03;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final boolean A0A() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void CzE(C63389Sj5 c63389Sj5) {
        this.A00 = ReactBaseTextShadowNode.A00(c63389Sj5, this, null, true);
        A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r12 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r12 == 5) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r21 < 0.0f) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout A01(android.text.Spannable r18, com.facebook.react.views.text.ReactTextShadowNode r19, X.EnumC78643fW r20, float r21) {
        /*
            r8 = r21
            android.text.TextPaint r15 = com.facebook.react.views.text.ReactTextShadowNode.A04
            r6 = r19
            X.VvS r0 = r6.A04
            int r0 = r0.A02()
            float r0 = (float) r0
            r15.setTextSize(r0)
            r14 = r18
            android.text.BoringLayout$Metrics r1 = android.text.BoringLayout.isBoring(r14, r15)
            if (r1 != 0) goto Lde
            float r10 = android.text.Layout.getDesiredWidth(r14, r15)
        L1c:
            X.3fW r0 = X.EnumC78643fW.UNDEFINED
            r5 = 0
            r7 = 0
            r4 = 1
            r2 = r20
            if (r2 == r0) goto L2a
            int r0 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            r13 = 0
            if (r0 >= 0) goto L2b
        L2a:
            r13 = 1
        L2b:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r12 = r6.A02
            X.3fL r0 = r6.A0B
            X.3fO r11 = r0.getLayoutDirection()
            X.3fO r9 = X.EnumC78563fO.RTL
            r2 = 3
            r0 = 5
            if (r11 != r9) goto Ld2
            if (r12 == r0) goto L41
            if (r12 != r2) goto Ld2
        L3f:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L41:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L84
            if (r13 != 0) goto L51
            boolean r0 = X.C3e2.A00(r10)
            if (r0 != 0) goto La4
            int r0 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r0 > 0) goto La4
        L51:
            double r0 = (double) r10
            double r0 = java.lang.Math.ceil(r0)
            int r8 = (int) r0
            int r0 = r14.length()
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r14, r7, r0, r15, r8)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r3)
            android.text.StaticLayout$Builder r1 = r0.setLineSpacing(r5, r2)
            boolean r0 = r6.A06
            android.text.StaticLayout$Builder r1 = r1.setIncludePad(r0)
            int r0 = r6.A03
            android.text.StaticLayout$Builder r0 = r1.setBreakStrategy(r0)
            android.text.StaticLayout$Builder r1 = r0.setHyphenationFrequency(r7)
            int r0 = r6.A0E
            r1.setJustificationMode(r0)
        L7c:
            r1.setUseLineSpacingFromFallbacks(r4)
            android.text.StaticLayout r0 = r1.build()
            return r0
        L84:
            if (r13 != 0) goto L8d
            int r0 = r1.width
            float r0 = (float) r0
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 > 0) goto La4
        L8d:
            int r0 = r1.width
            int r16 = java.lang.Math.max(r0, r7)
            boolean r0 = r6.A06
            r21 = r0
            r19 = r5
            r20 = r1
            r17 = r3
            r18 = r2
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        La4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 <= r0) goto Lb0
            double r0 = (double) r8
            double r0 = java.lang.Math.ceil(r0)
            float r8 = (float) r0
        Lb0:
            int r1 = r14.length()
            int r0 = (int) r8
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r14, r7, r1, r15, r0)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r3)
            android.text.StaticLayout$Builder r1 = r0.setLineSpacing(r5, r2)
            boolean r0 = r6.A06
            android.text.StaticLayout$Builder r1 = r1.setIncludePad(r0)
            int r0 = r6.A03
            android.text.StaticLayout$Builder r0 = r1.setBreakStrategy(r0)
            android.text.StaticLayout$Builder r1 = r0.setHyphenationFrequency(r7)
            goto L7c
        Ld2:
            if (r12 == r4) goto Lda
            if (r12 == r2) goto L41
            if (r12 == r0) goto L3f
            goto L41
        Lda:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L41
        Lde:
            r10 = 2143289344(0x7fc00000, float:NaN)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextShadowNode.A01(android.text.Spannable, com.facebook.react.views.text.ReactTextShadowNode, X.3fW, float):android.text.Layout");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final void A08(SZN szn) {
        Spannable spannable = this.A00;
        if (spannable != null) {
            AbstractC78533fL abstractC78533fL = ((ReactShadowNodeImpl) this).A0B;
            float layoutPadding = abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(4));
            float layoutPadding2 = abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(1));
            float layoutPadding3 = abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(5));
            float layoutPadding4 = abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(3));
            int i = ((ReactBaseTextShadowNode) this).A02;
            if (abstractC78533fL.getLayoutDirection() == EnumC78563fO.RTL) {
                if (i == 5) {
                    i = 3;
                } else if (i == 3) {
                    i = 5;
                }
            }
            szn.A0F.add(new R5c(szn, new C69418Vn3(spannable, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, -1, i, ((ReactBaseTextShadowNode) this).A03, ((ReactBaseTextShadowNode) this).A0E), ((ReactShadowNodeImpl) this).A00));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final Iterable AFA() {
        Map map = ((ReactBaseTextShadowNode) this).A0L;
        if (map != null && !map.isEmpty()) {
            Spannable spannable = this.A00;
            AbstractC05810Sj.A01(spannable, "Spannable element has not been prepared in onBeforeLayout");
            Q45[] q45Arr = (Q45[]) spannable.getSpans(0, spannable.length(), Q45.class);
            ArrayList arrayList = new ArrayList(q45Arr.length);
            for (Q45 q45 : q45Arr) {
                ReactShadowNode reactShadowNode = (ReactShadowNode) AbstractC166997dE.A0m(((ReactBaseTextShadowNode) this).A0L, q45.A01);
                ((ReactShadowNodeImpl) reactShadowNode).A0B.calculateLayout(Float.NaN, Float.NaN);
                arrayList.add(reactShadowNode);
            }
            return arrayList;
        }
        return null;
    }

    public ReactTextShadowNode(InterfaceC71842X7a interfaceC71842X7a) {
        super(interfaceC71842X7a);
        C70507WZo c70507WZo = new C70507WZo(this);
        this.A03 = c70507WZo;
        this.A02 = new C70506WZn(this);
        if (!Cfz()) {
            A09(c70507WZo);
            InterfaceC65378TjB interfaceC65378TjB = this.A02;
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ((ReactShadowNodeImpl) this).A0B;
            yogaNodeJNIBase.mBaselineFunction = interfaceC65378TjB;
            YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.mNativePointer, AbstractC167007dF.A1W(interfaceC65378TjB));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final void A07() {
        super.A07();
        APL();
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.A01 = z;
    }

    public ReactTextShadowNode() {
        this(null);
    }
}
