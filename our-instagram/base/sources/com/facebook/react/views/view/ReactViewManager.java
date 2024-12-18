package com.facebook.react.views.view;

import X.AbstractC002300n;
import X.AbstractC166997dE;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import X.C05F;
import X.C0I2;
import X.C0fQ;
import X.C14360o3;
import X.C62797SRr;
import X.C63011Saa;
import X.C63234Sfm;
import X.C63403SjY;
import X.C69829VwF;
import X.EnumC61190Rgq;
import X.Q2N;
import X.Q4W;
import X.R3N;
import X.SBR;
import X.VDC;
import X.W8L;
import X.WF1;
import X.WNV;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.ArrayList;
import java.util.Map;

@ReactModule(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class ReactViewManager extends ReactClippingViewManager {
    public static final int CMD_HOTSPOT_UPDATE = 1;
    public static final int CMD_SET_PRESSED = 2;
    public static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    public ReactViewManager() {
        super(null);
        setupViewRecycling();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getCommandsMap() {
        return AbstractC65702TsY.A0m(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(Q4W q4w, int i, Dynamic dynamic) {
        StringBuilder sb;
        C14360o3.A0B(dynamic, 0);
        int ordinal = dynamic.getType().ordinal();
        C63011Saa c63011Saa = null;
        if (ordinal != 2) {
            if (ordinal != 3) {
                sb = new StringBuilder();
                sb.append("Unsupported type for radius property: ");
                sb.append(dynamic.getType());
            } else {
                String asString = dynamic.asString();
                if (AbstractC002300n.A0f(asString, "%", false)) {
                    try {
                        float parseFloat = Float.parseFloat(AbstractC25227BEk.A0w(asString, 0, asString.length() - 1));
                        if (parseFloat >= 0.0f) {
                            c63011Saa = new C63011Saa(C05F.A01, parseFloat);
                        }
                    } catch (NumberFormatException unused) {
                        C0I2.A04("ReactNative", AnonymousClass001.A0R("Invalid percentage format: ", asString));
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Invalid string value: ");
                    sb.append(asString);
                }
            }
            C0I2.A04("ReactNative", sb.toString());
        } else {
            double asDouble = dynamic.asDouble();
            if (asDouble >= 0.0d) {
                c63011Saa = new C63011Saa(C05F.A00, (float) asDouble);
            }
        }
        if (C62797SRr.A00(q4w) != 2 && c63011Saa != null && c63011Saa.A00 == C05F.A01) {
            c63011Saa = null;
        }
        C63403SjY.A08(q4w, c63011Saa, VDC.values()[i]);
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(Q4W q4w, boolean z) {
    }

    @ReactProp(name = "collapsableChildren")
    public void setCollapsableChildren(Q4W q4w, boolean z) {
    }

    private void handleHotspotUpdate(Q4W q4w, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 2) {
            q4w.drawableHotspotChanged(WF1.A01((float) readableArray.getDouble(0)), WF1.A01((float) readableArray.getDouble(1)));
            return;
        }
        throw new RuntimeException("Illegal number of arguments for 'updateHotspot' command");
    }

    private void handleSetPressed(Q4W q4w, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 1) {
            q4w.setPressed(readableArray.getBoolean(0));
            return;
        }
        throw new RuntimeException("Illegal number of arguments for 'setPressed' command");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Q4W createViewInstance(R3N r3n) {
        return new Q4W(r3n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(Q4W q4w, String str, ReadableArray readableArray) {
        if (!str.equals("setPressed")) {
            if (str.equals(HOTSPOT_UPDATE_KEY)) {
                handleHotspotUpdate(q4w, readableArray);
                return;
            }
            return;
        }
        handleSetPressed(q4w, readableArray);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(Q4W q4w, int i, Integer num) {
        int i2 = SPACING_TYPES[i];
        EnumC61190Rgq enumC61190Rgq = EnumC61190Rgq.A02;
        switch (i2) {
            case 0:
                enumC61190Rgq = EnumC61190Rgq.A09;
                break;
            case 1:
                enumC61190Rgq = EnumC61190Rgq.A0C;
                break;
            case 2:
                enumC61190Rgq = EnumC61190Rgq.A0A;
                break;
            case 3:
                enumC61190Rgq = EnumC61190Rgq.A06;
                break;
            case 4:
                enumC61190Rgq = EnumC61190Rgq.A0B;
                break;
            case 5:
                enumC61190Rgq = EnumC61190Rgq.A07;
                break;
            case 6:
                enumC61190Rgq = EnumC61190Rgq.A08;
                break;
            case 7:
                enumC61190Rgq = EnumC61190Rgq.A0D;
                break;
            case 8:
                break;
            case 9:
                enumC61190Rgq = EnumC61190Rgq.A03;
                break;
            case 10:
                enumC61190Rgq = EnumC61190Rgq.A04;
                break;
            case 11:
                enumC61190Rgq = EnumC61190Rgq.A05;
                break;
            default:
                throw AbstractC25230BEn.A0n("Unknown spacing type: ", i2);
        }
        C63403SjY.A0A(q4w, enumC61190Rgq, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(Q4W q4w, String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(q4w, A00);
    }

    @ReactProp(name = "focusable")
    public void setFocusable(Q4W q4w, boolean z) {
        if (z) {
            C0fQ.A00(new WNV(3, this, q4w), q4w);
            q4w.setFocusable(true);
        } else {
            q4w.setOnClickListener(null);
            q4w.setClickable(false);
        }
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(Q4W q4w, ReadableMap readableMap) {
        Drawable drawable;
        if (readableMap != null) {
            drawable = W8L.A00(q4w.getContext(), readableMap);
        } else {
            drawable = null;
        }
        C63403SjY.A04(drawable, q4w);
    }

    @ReactProp(name = "nativeForegroundAndroid")
    public void setNativeForeground(Q4W q4w, ReadableMap readableMap) {
        Drawable A00;
        if (readableMap == null) {
            A00 = null;
        } else {
            A00 = W8L.A00(q4w.getContext(), readableMap);
        }
        q4w.setForeground(A00);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
        ((Q4W) view).setOpacityIfPossible(f);
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(Q4W q4w, boolean z) {
        if (z) {
            q4w.setFocusable(true);
            q4w.setFocusableInTouchMode(true);
            q4w.requestFocus();
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(Q4W q4w, int i) {
        q4w.setNextFocusDownId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(Q4W q4w, int i) {
        q4w.setNextFocusForwardId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(Q4W q4w, int i) {
        q4w.setNextFocusLeftId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(Q4W q4w, int i) {
        q4w.setNextFocusRightId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(Q4W q4w, int i) {
        q4w.setNextFocusUpId(i);
    }

    public Q4W prepareToRecycleView(R3N r3n, Q4W q4w) {
        super.prepareToRecycleView(r3n, (View) q4w);
        if (q4w != null) {
            q4w.A06();
        }
        return q4w;
    }

    @ReactProp(name = "accessible")
    public void setAccessible(Q4W q4w, boolean z) {
        q4w.setFocusable(z);
    }

    @ReactProp(name = "backfaceVisibility")
    public void setBackfaceVisibility(Q4W q4w, String str) {
        q4w.setBackfaceVisibility(str);
    }

    @ReactProp(customType = "BackgroundImage", name = "experimental_backgroundImage")
    public void setBackgroundImage(Q4W q4w, ReadableArray readableArray) {
        ArrayList arrayList;
        if (C62797SRr.A00(q4w) == 2) {
            if (readableArray != null && readableArray.size() > 0) {
                arrayList = new ArrayList(readableArray.size());
                for (int i = 0; i < readableArray.size(); i++) {
                    arrayList.add(new SBR(q4w.getContext(), readableArray.getMap(i)));
                }
            } else {
                arrayList = null;
            }
            C14360o3.A0B(q4w, 0);
            Q2N A00 = C63403SjY.A00(q4w);
            A00.A0G = arrayList;
            A00.invalidateSelf();
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(Q4W q4w, int i, float f) {
        C63403SjY.A09(q4w, EnumC61190Rgq.values()[i], Float.valueOf(f));
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(Q4W q4w, ReadableArray readableArray) {
        C63403SjY.A07(q4w, readableArray);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(Q4W q4w, Dynamic dynamic) {
        int i;
        int i2;
        int i3;
        Rect rect;
        int ordinal = dynamic.getType().ordinal();
        if (ordinal != 4) {
            if (ordinal != 2) {
                if (ordinal != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid type for 'hitSlop' value ");
                    C0I2.A04("ReactNative", AbstractC166997dE.A0v(dynamic.getType(), sb));
                }
                rect = null;
            } else {
                int A01 = (int) WF1.A01((float) dynamic.asDouble());
                rect = new Rect(A01, A01, A01, A01);
            }
        } else {
            ReadableMap asMap = dynamic.asMap();
            int i4 = 0;
            if (asMap.hasKey("left")) {
                i = (int) WF1.A01((float) asMap.getDouble("left"));
            } else {
                i = 0;
            }
            if (asMap.hasKey("top")) {
                i2 = (int) WF1.A01((float) asMap.getDouble("top"));
            } else {
                i2 = 0;
            }
            if (asMap.hasKey("right")) {
                i3 = (int) WF1.A01((float) asMap.getDouble("right"));
            } else {
                i3 = 0;
            }
            if (asMap.hasKey("bottom")) {
                i4 = (int) WF1.A01((float) asMap.getDouble("bottom"));
            }
            rect = new Rect(i, i2, i3, i4);
        }
        q4w.A02 = rect;
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(Q4W q4w, boolean z) {
        q4w.A06 = z;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(Q4W q4w, String str) {
        q4w.setOverflow(str);
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(Q4W q4w, String str) {
        q4w.A04 = C63234Sfm.A00(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(Q4W q4w, ReadableArray readableArray, ReadableArray readableArray2) {
        super.setTransformProperty((View) q4w, readableArray, readableArray2);
        q4w.A07();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        return new Q4W(r3n);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View prepareToRecycleView(R3N r3n, View view) {
        Q4W q4w = (Q4W) view;
        prepareToRecycleView(r3n, q4w);
        return q4w;
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(Q4W q4w, int i, float f) {
        AbstractC65702TsY.A1J(q4w, this, Float.valueOf(f), i);
    }

    public void setOpacity(Q4W q4w, float f) {
        q4w.setOpacityIfPossible(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(Q4W q4w, int i, ReadableArray readableArray) {
        if (i != 1) {
            if (i == 2) {
                handleSetPressed(q4w, readableArray);
                return;
            }
            return;
        }
        handleHotspotUpdate(q4w, readableArray);
    }
}
