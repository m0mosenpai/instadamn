package com.facebook.react.views.text;

import X.AbstractC05810Sj;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC65702TsY;
import X.AbstractC68322VMi;
import X.AbstractC78533fL;
import X.C05F;
import X.C0I2;
import X.C63490So4;
import X.C66330U9e;
import X.C66333U9k;
import X.C69787VvS;
import X.C78633fV;
import X.InterfaceC71842X7a;
import X.Q45;
import X.R3C;
import X.R3N;
import X.U9Z;
import X.U9l;
import X.VDK;
import X.VGR;
import X.W4I;
import X.WF1;
import X.WF2;
import X.WXU;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C69787VvS A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public VGR A0G;
    public VDK A0H;
    public InterfaceC71842X7a A0I;
    public String A0J;
    public String A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r13 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder A00(X.C63389Sj5 r13, com.facebook.react.views.text.ReactBaseTextShadowNode r14, java.lang.String r15, boolean r16) {
        /*
            r11 = 0
            r5 = 1
            r12 = r16
            if (r16 == 0) goto L9
            r1 = 0
            if (r13 == 0) goto La
        L9:
            r1 = 1
        La:
            java.lang.String r0 = "nativeViewHierarchyOptimizer is required when inline views are supported"
            X.AbstractC05810Sj.A03(r1, r0)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r16 == 0) goto L7a
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L20:
            r7 = r14
            if (r15 == 0) goto L2e
            X.VvS r0 = r14.A04
            java.lang.Integer r0 = r0.A05
            java.lang.String r0 = X.AbstractC68322VMi.A00(r0, r15)
            r6.append(r0)
        L2e:
            r8 = 0
            A01(r6, r7, r8, r9, r10, r11, r12)
            r14.A0L = r10
            r3 = 2143289344(0x7fc00000, float:NaN)
        L36:
            int r0 = r9.size()
            if (r11 >= r0) goto L7c
            int r0 = r9.size()
            int r0 = r0 - r11
            int r0 = r0 - r5
            java.lang.Object r4 = r9.get(r0)
            X.W4I r4 = (X.W4I) r4
            X.X7b r1 = r4.A00
            boolean r0 = r1 instanceof X.Q45
            if (r0 == 0) goto L74
            X.Q45 r1 = (X.Q45) r1
            int r2 = r1.A00
            int r0 = r1.A01
            java.lang.Object r1 = X.AbstractC58319PtB.A0n(r10, r0)
            com.facebook.react.uimanager.ReactShadowNode r1 = (com.facebook.react.uimanager.ReactShadowNode) r1
            r0 = r1
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0
            boolean r0 = r0.A0H
            if (r0 == 0) goto L64
            X.C63389Sj5.A02(r13, r1, r8)
        L64:
            com.facebook.react.uimanager.ReactShadowNodeImpl r1 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r1
            r1.A07 = r14
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L73
            float r0 = (float) r2
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L74
        L73:
            float r3 = (float) r2
        L74:
            r4.A01(r6, r11)
            int r11 = r11 + 1
            goto L36
        L7a:
            r10 = 0
            goto L20
        L7c:
            X.VvS r0 = r14.A04
            r0.A01 = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactBaseTextShadowNode.A00(X.Sj5, com.facebook.react.views.text.ReactBaseTextShadowNode, java.lang.String, boolean):android.text.SpannableStringBuilder");
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        int i = 1;
        if (str != null && !"highQuality".equals(str)) {
            if ("simple".equals(str)) {
                i = 0;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                AbstractC65702TsY.A1U("Invalid textBreakStrategy: ", str);
            }
        }
        this.A03 = i;
        A07();
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.A0P = false;
        this.A0O = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.A0P = true;
                } else if ("line-through".equals(str2)) {
                    this.A0O = true;
                }
            }
        }
        A07();
    }

    @ReactProp(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.A07 = 0.0f;
        this.A08 = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey(IgReactMediaPickerNativeModule.WIDTH) && !readableMap.isNull(IgReactMediaPickerNativeModule.WIDTH)) {
                this.A07 = WF1.A01((float) readableMap.getDouble(IgReactMediaPickerNativeModule.WIDTH));
            }
            if (readableMap.hasKey(IgReactMediaPickerNativeModule.HEIGHT) && !readableMap.isNull(IgReactMediaPickerNativeModule.HEIGHT)) {
                this.A08 = WF1.A01((float) readableMap.getDouble(IgReactMediaPickerNativeModule.HEIGHT));
            }
        }
        A07();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.X7b, android.text.style.StrikethroughSpan] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.X7b, android.text.style.UnderlineSpan] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.X7b, android.text.style.BackgroundColorSpan] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.X7b, android.text.style.ForegroundColorSpan] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.X7b, android.text.style.AbsoluteSizeSpan] */
    public static void A01(SpannableStringBuilder spannableStringBuilder, ReactBaseTextShadowNode reactBaseTextShadowNode, C69787VvS c69787VvS, List list, Map map, int i, boolean z) {
        Enum r0;
        float f;
        float f2;
        C69787VvS c69787VvS2 = reactBaseTextShadowNode.A04;
        if (c69787VvS != null) {
            C69787VvS c69787VvS3 = new C69787VvS();
            c69787VvS3.A06 = c69787VvS.A06;
            float f3 = c69787VvS2.A00;
            if (Float.isNaN(f3)) {
                f3 = c69787VvS.A00;
            }
            c69787VvS3.A00 = f3;
            float f4 = c69787VvS2.A03;
            if (Float.isNaN(f4)) {
                f4 = c69787VvS.A03;
            }
            c69787VvS3.A03 = f4;
            float f5 = c69787VvS2.A02;
            if (Float.isNaN(f5)) {
                f5 = c69787VvS.A02;
            }
            c69787VvS3.A02 = f5;
            float f6 = c69787VvS2.A04;
            if (Float.isNaN(f6)) {
                f6 = c69787VvS.A04;
            }
            c69787VvS3.A04 = f6;
            float f7 = c69787VvS2.A01;
            if (Float.isNaN(f7)) {
                f7 = c69787VvS.A01;
            }
            c69787VvS3.A01 = f7;
            Integer num = c69787VvS2.A05;
            if (num == C05F.A0Y) {
                num = c69787VvS.A05;
            }
            c69787VvS3.A05 = num;
            c69787VvS2 = c69787VvS3;
        }
        int AnZ = reactBaseTextShadowNode.AnZ();
        for (int i2 = 0; i2 < AnZ; i2++) {
            ReactShadowNodeImpl A06 = reactBaseTextShadowNode.A06(i2);
            if (A06 instanceof ReactRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) AbstractC68322VMi.A00(c69787VvS2.A05, ((ReactRawTextShadowNode) A06).A00));
            } else if (A06 instanceof ReactBaseTextShadowNode) {
                A01(spannableStringBuilder, (ReactBaseTextShadowNode) A06, c69787VvS2, list, map, spannableStringBuilder.length(), z);
            } else if (z) {
                int i3 = A06.A00;
                YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) A06.A0B;
                C78633fV valueFromLong = YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer));
                C78633fV valueFromLong2 = YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer));
                Integer num2 = valueFromLong.A01;
                Integer num3 = C05F.A01;
                if (num2 == num3 && valueFromLong2.A01 == num3) {
                    f = valueFromLong.A00;
                    f2 = valueFromLong2.A00;
                } else {
                    AbstractC78533fL abstractC78533fL = A06.A0B;
                    abstractC78533fL.calculateLayout(Float.NaN, Float.NaN);
                    float[] fArr = ((YogaNodeJNIBase) abstractC78533fL).arr;
                    if (fArr != null) {
                        f = fArr[1];
                    } else {
                        f = 0.0f;
                    }
                    float[] fArr2 = ((YogaNodeJNIBase) A06.A0B).arr;
                    if (fArr2 != null) {
                        f2 = fArr2[2];
                    } else {
                        f2 = 0.0f;
                    }
                }
                spannableStringBuilder.append("0");
                W4I.A00(new Q45(i3, (int) f, (int) f2), list, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                AbstractC25227BEk.A1O(A06, map, i3);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected view type nested under a <Text> or <TextInput> node: ");
                throw new R3C(AbstractC166997dE.A0v(A06.getClass(), sb));
            }
            A06.CnK();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (reactBaseTextShadowNode.A0N) {
                W4I.A00(new ForegroundColorSpan(reactBaseTextShadowNode.A0B), list, i, length);
            }
            if (reactBaseTextShadowNode.A0M) {
                W4I.A00(new BackgroundColorSpan(reactBaseTextShadowNode.A0A), list, i, length);
            }
            Enum r7 = reactBaseTextShadowNode.A0H;
            if (r7 != null) {
                r0 = VDK.A0O;
            } else {
                r7 = reactBaseTextShadowNode.A0G;
                r0 = VGR.A0F;
            }
            if (r7 == r0) {
                W4I.A00(new C66330U9e(((ReactShadowNodeImpl) reactBaseTextShadowNode).A00), list, i, length);
            }
            float A00 = c69787VvS2.A00();
            if (!Float.isNaN(A00) && (c69787VvS == null || c69787VvS.A00() != A00)) {
                W4I.A00(new C66333U9k(A00), list, i, length);
            }
            int A02 = c69787VvS2.A02();
            if (c69787VvS == null || c69787VvS.A02() != A02) {
                W4I.A00(new AbsoluteSizeSpan(A02), list, i, length);
            }
            int i4 = reactBaseTextShadowNode.A0C;
            if (i4 != -1 || reactBaseTextShadowNode.A0D != -1 || reactBaseTextShadowNode.A0J != null) {
                int i5 = reactBaseTextShadowNode.A0D;
                String str = reactBaseTextShadowNode.A0K;
                String str2 = reactBaseTextShadowNode.A0J;
                R3N r3n = ((ReactShadowNodeImpl) reactBaseTextShadowNode).A0A;
                AbstractC05810Sj.A00(r3n);
                W4I.A00(new U9l(r3n.getAssets(), str, str2, i4, i5), list, i, length);
            }
            if (reactBaseTextShadowNode.A0P) {
                W4I.A00(new UnderlineSpan(), list, i, length);
            }
            if (reactBaseTextShadowNode.A0O) {
                W4I.A00(new StrikethroughSpan(), list, i, length);
            }
            if ((reactBaseTextShadowNode.A07 != 0.0f || reactBaseTextShadowNode.A08 != 0.0f || reactBaseTextShadowNode.A09 != 0.0f) && Color.alpha(reactBaseTextShadowNode.A0F) != 0) {
                W4I.A00(new U9Z(reactBaseTextShadowNode.A07, reactBaseTextShadowNode.A08, reactBaseTextShadowNode.A09, reactBaseTextShadowNode.A0F), list, i, length);
            }
            float A01 = c69787VvS2.A01();
            if (!Float.isNaN(A01) && (c69787VvS == null || c69787VvS.A01() != A01)) {
                W4I.A00(new C63490So4(A01), list, i, length);
            }
            W4I.A00(new WXU(((ReactShadowNodeImpl) reactBaseTextShadowNode).A00), list, i, length);
        }
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.A05) {
            this.A05 = z;
            A07();
        }
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        C69787VvS c69787VvS = this.A04;
        if (z != c69787VvS.A06) {
            c69787VvS.A06 = z;
            A07();
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(String str) {
        this.A0J = str;
        A07();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.A04.A00 = f;
        A07();
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.A04.A02 = f;
        A07();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.A04.A03 = f;
        A07();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        C69787VvS c69787VvS = this.A04;
        if (f != c69787VvS.A04) {
            if (f != 0.0f && f < 1.0f) {
                C0I2.A04("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
                f = Float.NaN;
            }
            c69787VvS.A04 = f;
            A07();
        }
    }

    @ReactProp(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A07();
        }
    }

    @ReactProp(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.A01 = i;
        A07();
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            this.A0E = 1;
        } else {
            int i = 0;
            this.A0E = 0;
            if (str != null && !"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        i = 5;
                    } else {
                        if ("center".equals(str)) {
                            this.A02 = 1;
                            A07();
                        }
                        AbstractC65702TsY.A1U("Invalid textAlign: ", str);
                    }
                }
            }
            this.A02 = i;
            A07();
        }
        this.A02 = 3;
        A07();
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.A0F) {
            this.A0F = i;
            A07();
        }
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.A09) {
            this.A09 = f;
            A07();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(String str) {
        C69787VvS c69787VvS;
        Integer num;
        if (str == null) {
            c69787VvS = this.A04;
            num = C05F.A0Y;
        } else if (NetInfoModule.CONNECTION_TYPE_NONE.equals(str)) {
            c69787VvS = this.A04;
            num = C05F.A00;
        } else if ("uppercase".equals(str)) {
            c69787VvS = this.A04;
            num = C05F.A01;
        } else if ("lowercase".equals(str)) {
            c69787VvS = this.A04;
            num = C05F.A0C;
        } else if ("capitalize".equals(str)) {
            c69787VvS = this.A04;
            num = C05F.A0N;
        } else {
            AbstractC65702TsY.A1U("Invalid textTransform: ", str);
            c69787VvS = this.A04;
            num = C05F.A0Y;
        }
        c69787VvS.A05 = num;
        A07();
    }

    public ReactBaseTextShadowNode(InterfaceC71842X7a interfaceC71842X7a) {
        this.A0N = false;
        this.A0M = false;
        this.A0G = null;
        this.A0H = null;
        this.A01 = -1;
        this.A02 = 0;
        this.A03 = 1;
        this.A0E = 0;
        this.A07 = 0.0f;
        this.A08 = 0.0f;
        this.A09 = 0.0f;
        this.A0F = 1426063360;
        this.A0P = false;
        this.A0O = false;
        this.A06 = true;
        this.A05 = false;
        this.A00 = 0.0f;
        this.A0C = -1;
        this.A0D = -1;
        this.A0J = null;
        this.A0K = null;
        this.A04 = new C69787VvS();
        this.A0I = interfaceC71842X7a;
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (Cfz()) {
            this.A0G = VGR.A01(str);
            A07();
        }
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (Cfz()) {
            boolean A1W = AbstractC167007dF.A1W(num);
            this.A0M = A1W;
            if (A1W) {
                this.A0A = num.intValue();
            }
            A07();
        }
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean A1W = AbstractC167007dF.A1W(num);
        this.A0N = A1W;
        if (A1W) {
            this.A0B = num.intValue();
        }
        A07();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(String str) {
        int A00 = WF2.A00(str);
        if (A00 != this.A0C) {
            this.A0C = A00;
            A07();
        }
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String A03 = WF2.A03(readableArray);
        if (!TextUtils.equals(A03, this.A0K)) {
            this.A0K = A03;
            A07();
        }
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(String str) {
        int A01 = WF2.A01(str);
        if (A01 != this.A0D) {
            this.A0D = A01;
            A07();
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.A06 = z;
    }

    @ReactProp(name = "role")
    public void setRole(String str) {
        VDK vdk;
        if (Cfz()) {
            VDK[] values = VDK.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    vdk = values[i];
                    if (vdk.name().equalsIgnoreCase(str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    vdk = null;
                    break;
                }
            }
            this.A0H = vdk;
            A07();
        }
    }

    public ReactBaseTextShadowNode() {
        this(null);
    }
}
