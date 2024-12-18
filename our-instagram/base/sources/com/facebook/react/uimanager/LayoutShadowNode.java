package com.facebook.react.uimanager;

import X.AbstractC05810Sj;
import X.AbstractC65702TsY;
import X.AbstractC72048XLo;
import X.C3e2;
import X.C69543Vr7;
import X.C73283XzT;
import X.EnumC72344Xbg;
import X.EnumC77763e0;
import X.EnumC77933eL;
import X.R3N;
import X.WF1;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* loaded from: classes12.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    public final C69543Vr7 A00 = new Object();

    @ReactProp(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z) {
    }

    @ReactProp(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i, Dynamic dynamic) {
    }

    @ReactProp(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @ReactPropGroup(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i, Dynamic dynamic) {
    }

    @ReactProp(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z) {
    }

    @ReactProp(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z) {
    }

    @ReactProp(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z) {
    }

    private int A05(int i) {
        I18nUtil i18nUtil = I18nUtil.A00;
        R3N r3n = this.A0A;
        AbstractC05810Sj.A00(r3n);
        if (i18nUtil.A00(r3n)) {
            if (i != 0) {
                if (i == 2) {
                    return 5;
                }
                return i;
            }
            return 4;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r4.equals("flex-start") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "alignContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlignContent(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L81
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L76;
                case -1720785339: goto L6b;
                case -1364013995: goto L60;
                case -46581362: goto L57;
                case 3005871: goto L4c;
                case 441309761: goto L41;
                case 1742952711: goto L36;
                case 1937124468: goto L2b;
                case 2055030478: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for alignContent: "
            X.AbstractC65702TsY.A1U(r0, r4)
            X.3ds r0 = X.EnumC77683ds.FLEX_START
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignContentJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "space-evenly"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_EVENLY
            goto L16
        L2b:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_AROUND
            goto L16
        L36:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.FLEX_END
            goto L16
        L41:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_BETWEEN
            goto L16
        L4c:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.AUTO
            goto L16
        L57:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L81
            goto Lf
        L60:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.CENTER
            goto L16
        L6b:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.BASELINE
            goto L16
        L76:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.STRETCH
            goto L16
        L81:
            X.3ds r0 = X.EnumC77683ds.FLEX_START
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setAlignContent(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r4.equals("stretch") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "alignItems")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlignItems(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L76
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L6d;
                case -1720785339: goto L62;
                case -1364013995: goto L57;
                case -46581362: goto L4c;
                case 3005871: goto L41;
                case 441309761: goto L36;
                case 1742952711: goto L2b;
                case 1937124468: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for alignItems: "
            X.AbstractC65702TsY.A1U(r0, r4)
            X.3ds r0 = X.EnumC77683ds.STRETCH
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignItemsJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_AROUND
            goto L16
        L2b:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.FLEX_END
            goto L16
        L36:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_BETWEEN
            goto L16
        L41:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.AUTO
            goto L16
        L4c:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.FLEX_START
            goto L16
        L57:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.CENTER
            goto L16
        L62:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.BASELINE
            goto L16
        L6d:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L76
            goto Lf
        L76:
            X.3ds r0 = X.EnumC77683ds.STRETCH
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setAlignItems(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r4.equals("auto") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "alignSelf")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlignSelf(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L76
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L6b;
                case -1720785339: goto L60;
                case -1364013995: goto L55;
                case -46581362: goto L4a;
                case 3005871: goto L41;
                case 441309761: goto L36;
                case 1742952711: goto L2b;
                case 1937124468: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for alignSelf: "
            X.AbstractC65702TsY.A1U(r0, r4)
            X.3ds r0 = X.EnumC77683ds.AUTO
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignSelfJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_AROUND
            goto L16
        L2b:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.FLEX_END
            goto L16
        L36:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.SPACE_BETWEEN
            goto L16
        L41:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L76
            goto Lf
        L4a:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.FLEX_START
            goto L16
        L55:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.CENTER
            goto L16
        L60:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.BASELINE
            goto L16
        L6b:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3ds r0 = X.EnumC77683ds.STRETCH
            goto L16
        L76:
            X.3ds r0 = X.EnumC77683ds.AUTO
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setAlignSelf(java.lang.String):void");
    }

    @ReactProp(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(AbstractC72048XLo.A02(this), f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (!Cfz()) {
            int A05 = A05(C73283XzT.A01[i]);
            YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, EnumC77763e0.A00(A05).A00, WF1.A01(f));
        }
    }

    @ReactProp(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0 && A01 != 3) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetGapPercentJNI(AbstractC72048XLo.A02(this), 0, c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetGapJNI(AbstractC72048XLo.A02(this), 0, c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "display")
    public void setDisplay(String str) {
        EnumC72344Xbg enumC72344Xbg;
        if (!Cfz()) {
            if (str != null && !str.equals("flex")) {
                if (!str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                    AbstractC65702TsY.A1U("invalid value for display: ", str);
                } else {
                    enumC72344Xbg = EnumC72344Xbg.A02;
                    YogaNative.jni_YGNodeStyleSetDisplayJNI(AbstractC72048XLo.A02(this), enumC72344Xbg.A00);
                }
            }
            enumC72344Xbg = EnumC72344Xbg.A01;
            YogaNative.jni_YGNodeStyleSetDisplayJNI(AbstractC72048XLo.A02(this), enumC72344Xbg.A00);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (!Cfz()) {
            YogaNative.jni_YGNodeStyleSetFlexJNI(AbstractC72048XLo.A02(this), f);
        }
    }

    @ReactProp(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 != 3) {
                    if (A01 == 2) {
                        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                    }
                } else {
                    YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(AbstractC72048XLo.A02(this));
                }
            } else {
                YogaNative.jni_YGNodeStyleSetFlexBasisJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r4.equals("column") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "flexDirection")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFlexDirection(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L4a
            int r0 = r4.hashCode()
            switch(r0) {
                case -1448970769: goto L3f;
                case -1354837162: goto L36;
                case 113114: goto L2b;
                case 1272730475: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for flexDirection: "
            X.AbstractC65702TsY.A1U(r0, r4)
            X.3cm r0 = X.EnumC77003cm.COLUMN
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "column-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3cm r0 = X.EnumC77003cm.COLUMN_REVERSE
            goto L16
        L2b:
            java.lang.String r0 = "row"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3cm r0 = X.EnumC77003cm.ROW
            goto L16
        L36:
            java.lang.String r0 = "column"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4a
            goto Lf
        L3f:
            java.lang.String r0 = "row-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3cm r0 = X.EnumC77003cm.ROW_REVERSE
            goto L16
        L4a:
            X.3cm r0 = X.EnumC77003cm.COLUMN
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setFlexDirection(java.lang.String):void");
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (!Cfz()) {
            YogaNative.jni_YGNodeStyleSetFlexGrowJNI(AbstractC72048XLo.A02(this), f);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (!Cfz()) {
            YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(AbstractC72048XLo.A02(this), f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r4.equals("nowrap") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "flexWrap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFlexWrap(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L14
            int r0 = r4.hashCode()
            switch(r0) {
                case -1039592053: goto L36;
                case -749527969: goto L2b;
                case 3657802: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for flexWrap: "
            X.AbstractC65702TsY.A1U(r0, r4)
        L14:
            X.5Mk r0 = X.EnumC115945Mk.NO_WRAP
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexWrapJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "wrap"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.5Mk r0 = X.EnumC115945Mk.WRAP
            goto L16
        L2b:
            java.lang.String r0 = "wrap-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.5Mk r0 = X.EnumC115945Mk.WRAP_REVERSE
            goto L16
        L36:
            java.lang.String r0 = "nowrap"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L14
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setFlexWrap(java.lang.String):void");
    }

    @ReactProp(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 == 1 || A01 == 0 || A01 == 3 || A01 == 2) {
                YogaNative.jni_YGNodeStyleSetGapJNI(AbstractC72048XLo.A02(this), 2, c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = IgReactMediaPickerNativeModule.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 != 3) {
                    if (A01 == 2) {
                        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                    }
                } else {
                    YogaNative.jni_YGNodeStyleSetHeightAutoJNI(AbstractC72048XLo.A02(this));
                }
            } else {
                YogaNative.jni_YGNodeStyleSetHeightJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r4.equals("flex-start") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "justifyContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setJustifyContent(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L60
            int r0 = r4.hashCode()
            switch(r0) {
                case -1364013995: goto L55;
                case -46581362: goto L4c;
                case 441309761: goto L41;
                case 1742952711: goto L36;
                case 1937124468: goto L2b;
                case 2055030478: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for justifyContent: "
            X.AbstractC65702TsY.A1U(r0, r4)
            X.3e8 r0 = X.C3e8.FLEX_START
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetJustifyContentJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "space-evenly"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3e8 r0 = X.C3e8.SPACE_EVENLY
            goto L16
        L2b:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3e8 r0 = X.C3e8.SPACE_AROUND
            goto L16
        L36:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3e8 r0 = X.C3e8.FLEX_END
            goto L16
        L41:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3e8 r0 = X.C3e8.SPACE_BETWEEN
            goto L16
        L4c:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L60
            goto Lf
        L55:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.3e8 r0 = X.C3e8.CENTER
            goto L16
        L60:
            X.3e8 r0 = X.C3e8.FLEX_START
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setJustifyContent(java.lang.String):void");
    }

    @ReactPropGroup(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (!Cfz()) {
            int A05 = A05(C73283XzT.A02[i]);
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 != 3) {
                    if (A01 == 2) {
                        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, EnumC77763e0.A00(A05).A00, c69543Vr7.A00);
                    }
                } else {
                    YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, EnumC77763e0.A00(A05).A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, EnumC77763e0.A00(A05).A00, c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetMinHeightJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetMinWidthJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r4.equals("visible") == false) goto L7;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "overflow")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOverflow(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cfz()
            if (r0 != 0) goto L1f
            if (r4 == 0) goto L14
            int r0 = r4.hashCode()
            switch(r0) {
                case -1217487446: goto L34;
                case -907680051: goto L29;
                case 466743410: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "invalid value for overflow: "
            X.AbstractC65702TsY.A1U(r0, r4)
        L14:
            X.Xbh r0 = X.EnumC72345Xbh.A03
        L16:
            long r1 = X.AbstractC72048XLo.A02(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetOverflowJNI(r1, r0)
        L1f:
            return
        L20:
            java.lang.String r0 = "visible"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L14
            goto Lf
        L29:
            java.lang.String r0 = "scroll"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.Xbh r0 = X.EnumC72345Xbh.A02
            goto L16
        L34:
            java.lang.String r0 = "hidden"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.Xbh r0 = X.EnumC72345Xbh.A01
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setOverflow(java.lang.String):void");
    }

    @ReactPropGroup(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (!Cfz()) {
            int A05 = A05(C73283XzT.A02[i]);
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 == 2) {
                    this.A0L[A05] = c69543Vr7.A00;
                    this.A0M[A05] = !C3e2.A00(r2);
                    ReactShadowNodeImpl.A03(this);
                }
            } else {
                EaQ(A05, c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "position")
    public void setPosition(String str) {
        EnumC77933eL enumC77933eL;
        if (!Cfz()) {
            if (str != null && !str.equals("relative")) {
                if (!str.equals("absolute")) {
                    AbstractC65702TsY.A1U("invalid value for position: ", str);
                } else {
                    enumC77933eL = EnumC77933eL.ABSOLUTE;
                    YogaNative.jni_YGNodeStyleSetPositionTypeJNI(AbstractC72048XLo.A02(this), enumC77933eL.A00);
                }
            }
            enumC77933eL = EnumC77933eL.RELATIVE;
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(AbstractC72048XLo.A02(this), enumC77933eL.A00);
        }
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (!Cfz()) {
            int A05 = A05(new int[]{4, 5, 0, 2, 1, 3}[i]);
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, EnumC77763e0.A00(A05).A00, c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, EnumC77763e0.A00(A05).A00, c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0 && A01 != 3) {
                if (A01 == 2) {
                    YogaNative.jni_YGNodeStyleSetGapPercentJNI(AbstractC72048XLo.A02(this), 1, c69543Vr7.A00);
                }
            } else {
                YogaNative.jni_YGNodeStyleSetGapJNI(AbstractC72048XLo.A02(this), 1, c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = IgReactMediaPickerNativeModule.WIDTH)
    public void setWidth(Dynamic dynamic) {
        if (!Cfz()) {
            C69543Vr7 c69543Vr7 = this.A00;
            int A01 = AbstractC72048XLo.A01(dynamic, c69543Vr7);
            if (A01 != 1 && A01 != 0) {
                if (A01 != 3) {
                    if (A01 == 2) {
                        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
                    }
                } else {
                    YogaNative.jni_YGNodeStyleSetWidthAutoJNI(AbstractC72048XLo.A02(this));
                }
            } else {
                YogaNative.jni_YGNodeStyleSetWidthJNI(AbstractC72048XLo.A02(this), c69543Vr7.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(boolean z) {
    }

    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        this.A0J = z;
    }
}
