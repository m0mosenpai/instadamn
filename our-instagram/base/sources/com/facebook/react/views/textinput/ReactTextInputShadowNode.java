package com.facebook.react.views.textinput;

import X.AbstractC05810Sj;
import X.AbstractC65702TsY;
import X.AbstractC78533fL;
import X.C52182aJ;
import X.C63191Set;
import X.C69376VmM;
import X.C69418Vn3;
import X.EnumC77763e0;
import X.InterfaceC50872Vi;
import X.R3N;
import X.R5c;
import X.SZN;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;

/* loaded from: classes11.dex */
public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements InterfaceC50872Vi {
    public int A00;
    public String A01;
    public String A02;
    public EditText A03;
    public C69376VmM A04;

    public ReactTextInputShadowNode() {
        super(null);
        this.A00 = -1;
        this.A02 = null;
        this.A01 = null;
        ((ReactBaseTextShadowNode) this).A03 = 1;
        A09(this);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final boolean A0B() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final boolean A0C() {
        return true;
    }

    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    public final void setTextBreakStrategy(String str) {
        int i = 0;
        if (str != null && !"simple".equals(str)) {
            if ("highQuality".equals(str)) {
                i = 1;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                AbstractC65702TsY.A1U("Invalid textBreakStrategy: ", str);
            }
        }
        ((ReactBaseTextShadowNode) this).A03 = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final void A08(SZN szn) {
        if (this.A00 != -1) {
            SpannableStringBuilder A00 = ReactBaseTextShadowNode.A00(null, this, this.A02, false);
            int i = this.A00;
            AbstractC78533fL abstractC78533fL = ((ReactShadowNodeImpl) this).A0B;
            szn.A0F.add(new R5c(szn, new C69418Vn3(A00, abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(0)), abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(1)), abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(2)), abstractC78533fL.getLayoutPadding(EnumC77763e0.A00(3)), i, ((ReactBaseTextShadowNode) this).A02, ((ReactBaseTextShadowNode) this).A03, ((ReactBaseTextShadowNode) this).A0E), ((ReactShadowNodeImpl) this).A00));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r0 != r1) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    @Override // X.InterfaceC50872Vi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long CpA(X.EnumC78643fW r5, X.EnumC78643fW r6, X.AbstractC78533fL r7, float r8, float r9) {
        /*
            r4 = this;
            android.widget.EditText r2 = r4.A03
            X.AbstractC05810Sj.A00(r2)
            X.VmM r3 = r4.A04
            if (r3 == 0) goto L78
            android.text.SpannableStringBuilder r0 = r3.A05
            r2.setText(r0)
            float r1 = r3.A00
            r0 = 0
            r2.setTextSize(r0, r1)
            int r0 = r3.A04
            r2.setMinLines(r0)
            int r0 = r3.A03
            r2.setMaxLines(r0)
            int r0 = r3.A02
            r2.setInputType(r0)
            java.lang.CharSequence r0 = r3.A06
            r2.setHint(r0)
            int r1 = r3.A01
        L2a:
            r2.setBreakStrategy(r1)
        L2d:
            java.lang.String r0 = r4.A01
            r2.setHint(r0)
            r0 = 1
            int r1 = X.AbstractC25227BEk.A05(r5, r0)
            if (r1 == r0) goto L6c
            r0 = 2
            if (r1 == r0) goto L70
            r0 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
        L41:
            r0 = 1
            int r1 = X.AbstractC25227BEk.A05(r6, r0)
            if (r1 == r0) goto L60
            r0 = 2
            if (r1 == r0) goto L64
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
        L50:
            r2.measure(r3, r0)
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            long r0 = X.AbstractC78733ff.A00(r1, r0)
            return r0
        L60:
            int r1 = (int) r9
            r0 = 1073741824(0x40000000, float:2.0)
            goto L67
        L64:
            int r1 = (int) r9
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L67:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L50
        L6c:
            int r1 = (int) r8
            r0 = 1073741824(0x40000000, float:2.0)
            goto L73
        L70:
            int r1 = (int) r8
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L73:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L41
        L78:
            r1 = 0
            X.VvS r0 = r4.A04
            int r0 = r0.A02()
            float r0 = (float) r0
            r2.setTextSize(r1, r0)
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L8b
            r2.setLines(r1)
        L8b:
            int r0 = r2.getBreakStrategy()
            int r1 = r4.A03
            if (r0 == r1) goto L2d
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputShadowNode.CpA(X.3fW, X.3fW, X.3fL, float, float):long");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void EYU(Object obj) {
        AbstractC05810Sj.A02(obj instanceof C69376VmM);
        this.A04 = (C69376VmM) obj;
        APL();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void Eff(R3N r3n) {
        ((ReactShadowNodeImpl) this).A0A = r3n;
        AbstractC05810Sj.A00(r3n);
        EditText editText = new EditText(new C52182aJ(r3n, R.style.Theme_ReactNative_TextInput_DefaultBackground));
        float paddingStart = editText.getPaddingStart();
        C63191Set c63191Set = ((ReactShadowNodeImpl) this).A0K;
        c63191Set.A01(paddingStart, 4);
        ReactShadowNodeImpl.A03(this);
        c63191Set.A01(editText.getPaddingTop(), 1);
        ReactShadowNodeImpl.A03(this);
        c63191Set.A01(editText.getPaddingEnd(), 5);
        ReactShadowNodeImpl.A03(this);
        c63191Set.A01(editText.getPaddingBottom(), 3);
        ReactShadowNodeImpl.A03(this);
        this.A03 = editText;
        editText.setPadding(0, 0, 0, 0);
        this.A03.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(String str) {
        this.A01 = str;
        A07();
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.A02 = str;
        A07();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void EaQ(int i, float f) {
        super.EaQ(i, f);
        A07();
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.A00 = i;
    }
}
