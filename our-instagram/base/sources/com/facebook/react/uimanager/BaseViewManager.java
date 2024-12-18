package com.facebook.react.uimanager;

import X.AbstractC05810Sj;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31174DnI;
import X.AbstractC43593JPy;
import X.AbstractC58317Pt9;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AnonymousClass001;
import X.C0I2;
import X.C14360o3;
import X.C2I7;
import X.C62794SRo;
import X.C62797SRr;
import X.C63356SiD;
import X.C63403SjY;
import X.C66375UEj;
import X.C69273Vkh;
import X.C69826VwC;
import X.EnumC61078Res;
import X.InterfaceC65495TlJ;
import X.R3M;
import X.R3N;
import X.VDK;
import X.VGR;
import X.W8b;
import X.WED;
import X.WF1;
import X.WGP;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.messaging.caa.common.ui.MaaMessengerBrandingBackgroundDrawable;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class BaseViewManager extends ViewManager implements View.OnLayoutChangeListener {
    public static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    public static final String STATE_BUSY = "busy";
    public static final String STATE_CHECKED = "checked";
    public static final String STATE_EXPANDED = "expanded";
    public static final String STATE_MIXED = "mixed";
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    public static final C69273Vkh sMatrixDecompositionContext = new C69273Vkh();
    public static final double[] sTransformDecompositionArray = new double[16];

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7 - i5;
        int i10 = i3 - i;
        if (i4 - i2 != i8 - i6 || i10 != i9) {
            ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
            ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
            if (readableArray2 != null || readableArray != null) {
                setTransformProperty(view, readableArray2, readableArray);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View prepareToRecycleView(R3N r3n, View view) {
        view.setTag(null);
        view.setTag(R.id.pointer_events, null);
        view.setTag(R.id.react_test_id, null);
        view.setTag(R.id.view_tag_native_id, null);
        view.setTag(R.id.labelled_by, null);
        view.setTag(R.id.accessibility_label, null);
        view.setTag(R.id.accessibility_hint, null);
        view.setTag(R.id.accessibility_role, null);
        view.setTag(R.id.accessibility_state, null);
        view.setTag(R.id.accessibility_actions, null);
        view.setTag(R.id.accessibility_value, null);
        view.setTag(R.id.accessibility_state_expanded, null);
        setTransformProperty(view, null, null);
        view.resetPivot();
        view.setTop(0);
        view.setBottom(0);
        view.setLeft(0);
        view.setRight(0);
        view.setElevation(0.0f);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setAnimationMatrix(null);
        }
        view.setTag(R.id.transform, null);
        view.setTag(R.id.transform_origin, null);
        view.setTag(R.id.invalidate_transform, null);
        view.removeOnLayoutChangeListener(this);
        view.setTag(R.id.use_hardware_layer, null);
        view.setTag(R.id.filter, null);
        view.setTag(R.id.mix_blend_mode, null);
        C62794SRo.A00(view, null, null);
        view.setOutlineAmbientShadowColor(-16777216);
        view.setOutlineSpotShadowColor(-16777216);
        view.setNextFocusDownId(-1);
        view.setNextFocusForwardId(-1);
        view.setNextFocusRightId(-1);
        view.setNextFocusUpId(-1);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        view.setElevation(0.0f);
        view.setAlpha(1.0f);
        setPadding(view, 0, 0, 0, 0);
        view.setForeground(null);
        return view;
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(View view, boolean z) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(View view, boolean z) {
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(View view, boolean z) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(View view, boolean z) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(View view, boolean z) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(View view, boolean z) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(View view, boolean z) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(View view, boolean z) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(View view, boolean z) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(View view, boolean z) {
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(View view, boolean z) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(View view, boolean z) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(View view, boolean z) {
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(View view, boolean z) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(View view, boolean z) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(View view, boolean z) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(View view, boolean z) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(AbstractC58317Pt9.A00(1008), AbstractC31174DnI.A12("phasedRegistrationNames", AbstractC65702TsY.A0m("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture")));
        hashMap2.put(AbstractC58317Pt9.A00(1009), AbstractC65703TsZ.A1B("onPointerDown", "onPointerDownCapture"));
        HashMap A0m = AbstractC65702TsY.A0m("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture");
        A0m.put("skipBubbling", true);
        hashMap2.put(AbstractC58317Pt9.A00(1010), AbstractC31174DnI.A12("phasedRegistrationNames", A0m));
        HashMap A0m2 = AbstractC65702TsY.A0m("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture");
        A0m2.put("skipBubbling", true);
        hashMap2.put(AbstractC58317Pt9.A00(1011), AbstractC31174DnI.A12("phasedRegistrationNames", A0m2));
        hashMap2.put(AbstractC58317Pt9.A00(1012), AbstractC65703TsZ.A1B("onPointerMove", "onPointerMoveCapture"));
        hashMap2.put(AbstractC58317Pt9.A00(1015), AbstractC65703TsZ.A1B("onPointerUp", "onPointerUpCapture"));
        hashMap2.put(AbstractC58317Pt9.A00(1013), AbstractC65703TsZ.A1B("onPointerOut", "onPointerOutCapture"));
        hashMap2.put(AbstractC58317Pt9.A00(1014), AbstractC65703TsZ.A1B("onPointerOver", "onPointerOverCapture"));
        hashMap2.put("topClick", AbstractC65703TsZ.A1B("onClick", "onClickCapture"));
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("topAccessibilityAction", AbstractC31174DnI.A12("registrationName", "onAccessibilityAction"));
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    @ReactProp(name = "accessibilityActions")
    public void setAccessibilityActions(View view, ReadableArray readableArray) {
        if (readableArray != null) {
            view.setTag(R.id.accessibility_actions, readableArray);
        }
    }

    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(View view, String str) {
        int i;
        if (str != null && !str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            if (str.equals("polite")) {
                i = 1;
            } else if (!str.equals("assertive")) {
                return;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        view.setAccessibilityLiveRegion(i);
    }

    public void setBorderBottomLeftRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @ReactProp(name = "onClick")
    public void setClick(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.CLICK, z);
    }

    @ReactProp(name = "onClickCapture")
    public void setClickCapture(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.CLICK_CAPTURE, z);
    }

    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(View view, String str) {
        int i;
        if (str != null && !str.equals("auto")) {
            if (str.equals("yes")) {
                i = 1;
            } else if (str.equals("no")) {
                i = 2;
            } else if (!str.equals("no-hide-descendants")) {
                return;
            } else {
                i = 4;
            }
        } else {
            i = 0;
        }
        view.setImportantForAccessibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "outlineStyle")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOutlineStyle(android.view.View r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L5f
            java.lang.String r2 = X.AbstractC167007dF.A0h(r6)
            int r1 = r2.hashCode()
            r0 = -1338941519(0xffffffffb0315fb1, float:-6.452821E-10)
            if (r1 == r0) goto L54
            r0 = -1325970902(0xffffffffb0f74a2a, float:-1.7992694E-9)
            if (r1 == r0) goto L49
            r0 = 109618859(0x688a6ab, float:5.140241E-35)
            if (r1 != r0) goto L5f
            java.lang.String r0 = "solid"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C05F.A00
        L23:
            r1 = 0
            X.C14360o3.A0B(r5, r1)
            int r2 = X.C62797SRr.A00(r5)
            r1 = 2
            if (r2 != r1) goto L48
            X.Q2M r3 = X.C63403SjY.A02(r5)
            if (r0 == 0) goto L48
            java.lang.Integer r1 = r3.A04
            if (r0 == r1) goto L48
            r3.A04 = r0
            android.graphics.Paint r2 = r3.A06
            float r1 = r3.A00
            android.graphics.DashPathEffect r0 = X.Q2M.A01(r0, r1)
            r2.setPathEffect(r0)
            r3.invalidateSelf()
        L48:
            return
        L49:
            java.lang.String r0 = "dotted"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C05F.A0C
            goto L23
        L54:
            java.lang.String r0 = "dashed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C05F.A01
            goto L23
        L5f:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.BaseViewManager.setOutlineStyle(android.view.View, java.lang.String):void");
    }

    @ReactProp(name = "onPointerEnter")
    public void setPointerEnter(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.ENTER, z);
    }

    @ReactProp(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.ENTER_CAPTURE, z);
    }

    @ReactProp(name = "onPointerLeave")
    public void setPointerLeave(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.LEAVE, z);
    }

    @ReactProp(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.LEAVE_CAPTURE, z);
    }

    @ReactProp(name = "onPointerMove")
    public void setPointerMove(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.MOVE, z);
    }

    @ReactProp(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.MOVE_CAPTURE, z);
    }

    @ReactProp(name = "onPointerOut")
    public void setPointerOut(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.OUT, z);
    }

    @ReactProp(name = "onPointerOutCapture")
    public void setPointerOutCapture(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.OUT_CAPTURE, z);
    }

    @ReactProp(name = "onPointerOver")
    public void setPointerOver(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.OVER, z);
    }

    @ReactProp(name = "onPointerOverCapture")
    public void setPointerOverCapture(View view, boolean z) {
        setPointerEventsFlag(view, EnumC61078Res.OVER_CAPTURE, z);
    }

    @ReactProp(name = "accessibilityState")
    public void setViewState(View view, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey(STATE_EXPANDED)) {
                view.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
            }
            if (readableMap.hasKey("selected")) {
                boolean isSelected = view.isSelected();
                boolean z = readableMap.getBoolean("selected");
                view.setSelected(z);
                if (view.isAccessibilityFocused() && isSelected && !z) {
                    view.announceForAccessibility(view.getContext().getString(2131974391));
                }
            } else {
                view.setSelected(false);
            }
            view.setTag(R.id.accessibility_state, readableMap);
            if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
                view.setEnabled(true);
            }
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.CLQ()) {
                String Csu = keySetIterator.Csu();
                if (Csu.equals(STATE_BUSY) || Csu.equals(STATE_EXPANDED) || (Csu.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                    updateViewContentDescription(view);
                    return;
                } else if (view.isAccessibilityFocused()) {
                    view.sendAccessibilityEvent(1);
                }
            }
        }
    }

    public BaseViewManager(R3M r3m) {
        super(r3m);
    }

    private void logUnsupportedPropertyWarning(String str) {
        C0I2.A09("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    public static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        throw new IllegalStateException(AnonymousClass001.A0N("Invalid float property value: ", f));
    }

    public static void setPointerEventsFlag(View view, EnumC61078Res enumC61078Res, boolean z) {
        int A0K = AbstractC167017dG.A0K((Number) view.getTag(R.id.pointer_events));
        int ordinal = 1 << enumC61078Res.ordinal();
        int i = ordinal | A0K;
        if (!z) {
            i = (ordinal ^ (-1)) & A0K;
        }
        view.setTag(R.id.pointer_events, Integer.valueOf(i));
    }

    private void updateViewAccessibility(View view) {
        C66375UEj.A02(view, view.getImportantForAccessibility(), view.isFocusable());
    }

    private void updateViewContentDescription(View view) {
        Dynamic dynamic;
        Context context;
        int i;
        Object tag = view.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (tag != null) {
            arrayList.add(tag);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.CLQ()) {
                String Csu = keySetIterator.Csu();
                Dynamic dynamic2 = readableMap.getDynamic(Csu);
                if (Csu.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    context = view.getContext();
                    i = 2131974388;
                } else if (Csu.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    context = view.getContext();
                    i = 2131974386;
                }
                arrayList.add(context.getString(i));
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            view.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(View view) {
        updateViewAccessibility(view);
        Boolean bool = (Boolean) view.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            view.addOnLayoutChangeListener(this);
            setTransformProperty(view, (ReadableArray) view.getTag(R.id.transform), (ReadableArray) view.getTag(R.id.transform_origin));
            view.setTag(R.id.invalidate_transform, AbstractC166997dE.A0a());
        }
        C62794SRo.A00(view, (ReadableArray) view.getTag(R.id.filter), (Boolean) view.getTag(R.id.use_hardware_layer));
    }

    @ReactProp(name = "accessibilityCollection")
    public void setAccessibilityCollection(View view, ReadableMap readableMap) {
        view.setTag(R.id.accessibility_collection, readableMap);
    }

    @ReactProp(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(View view, ReadableMap readableMap) {
        view.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(View view, String str) {
        view.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(view);
    }

    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(View view, String str) {
        view.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(view);
    }

    @ReactProp(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(View view, Dynamic dynamic) {
        int i;
        String string;
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.String) {
                i = R.id.labelled_by;
                string = dynamic.asString();
            } else {
                if (dynamic.getType() != ReadableType.Array) {
                    return;
                }
                i = R.id.labelled_by;
                string = dynamic.asArray().getString(0);
            }
            view.setTag(i, string);
        }
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(View view, String str) {
        VGR A01;
        if (str == null) {
            A01 = null;
        } else {
            A01 = VGR.A01(str);
        }
        view.setTag(R.id.accessibility_role, A01);
    }

    @ReactProp(name = "accessibilityValue")
    public void setAccessibilityValue(View view, ReadableMap readableMap) {
        if (readableMap == null) {
            view.setTag(R.id.accessibility_value, null);
            view.setContentDescription(null);
        } else {
            view.setTag(R.id.accessibility_value, readableMap);
            if (!readableMap.hasKey("text")) {
                return;
            }
            updateViewContentDescription(view);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(View view, int i) {
        C63403SjY.A0B(view, Integer.valueOf(i));
    }

    @ReactProp(name = "elevation")
    public void setElevation(View view, float f) {
        view.setElevation(WF1.A01(f));
    }

    @ReactProp(customType = "Filter", name = "filter")
    public void setFilter(View view, ReadableArray readableArray) {
        if (C62797SRr.A00(view) == 2) {
            view.setTag(R.id.filter, readableArray);
        }
    }

    @ReactProp(name = "mixBlendMode")
    public void setMixBlendMode(View view, String str) {
        if (C62797SRr.A00(view) == 2) {
            view.setTag(R.id.mix_blend_mode, C69826VwC.A00(str));
            if (view.getParent() instanceof View) {
                ((View) view.getParent()).invalidate();
            }
        }
    }

    @ReactProp(name = "nativeID")
    public void setNativeId(View view, String str) {
        view.setTag(R.id.view_tag_native_id, str);
        Object tag = view.getTag(R.id.view_tag_native_id);
        if ((tag instanceof String) && tag != null) {
            Iterator it = W8b.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("getNativeId");
            }
            Iterator A15 = AbstractC166997dE.A15(W8b.A01);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                Set set = (Set) entry.getValue();
                if (set != null && set.contains(tag)) {
                    entry.getKey();
                    throw new NullPointerException("onViewFound");
                }
            }
        }
    }

    @ReactProp(defaultFloat = MaaMessengerBrandingBackgroundDrawable.POSITION_4, name = "opacity")
    public void setOpacity(View view, float f) {
        view.setAlpha(f);
    }

    @ReactProp(customType = "Color", name = "outlineColor")
    public void setOutlineColor(View view, Integer num) {
        C63403SjY.A0D(view, num);
    }

    @ReactProp(name = "outlineOffset")
    public void setOutlineOffset(View view, float f) {
        C63403SjY.A05(view, f);
    }

    @ReactProp(name = "outlineWidth")
    public void setOutlineWidth(View view, float f) {
        C63403SjY.A06(view, f);
    }

    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(View view, boolean z) {
        view.setTag(R.id.use_hardware_layer, Boolean.valueOf(z));
    }

    @ReactProp(name = "role")
    public void setRole(View view, String str) {
        VDK vdk;
        if (str != null) {
            VDK[] values = VDK.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                vdk = values[i];
                if (vdk.name().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        vdk = null;
        view.setTag(R.id.role, vdk);
    }

    @ReactProp(name = "rotation")
    @Deprecated
    public void setRotation(View view, float f) {
        view.setRotation(f);
    }

    @ReactProp(defaultFloat = MaaMessengerBrandingBackgroundDrawable.POSITION_4, name = "scaleX")
    @Deprecated
    public void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    @ReactProp(defaultFloat = MaaMessengerBrandingBackgroundDrawable.POSITION_4, name = "scaleY")
    @Deprecated
    public void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    @ReactProp(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
        view.setOutlineSpotShadowColor(i);
    }

    @ReactProp(name = "testID")
    public void setTestId(View view, String str) {
        view.setTag(R.id.react_test_id, str);
        view.setTag(str);
    }

    @ReactProp(name = "transform")
    public void setTransform(View view, ReadableArray readableArray) {
        if (!C2I7.A00(view.getTag(R.id.transform), readableArray)) {
            view.setTag(R.id.transform, readableArray);
            view.setTag(R.id.invalidate_transform, true);
        }
    }

    @ReactProp(name = "transformOrigin")
    public void setTransformOrigin(View view, ReadableArray readableArray) {
        if (!C2I7.A00(view.getTag(R.id.transform_origin), readableArray)) {
            view.setTag(R.id.transform_origin, readableArray);
            view.setTag(R.id.invalidate_transform, true);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(View view, float f) {
        view.setTranslationX(WF1.A01(f));
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(View view, float f) {
        view.setTranslationY(WF1.A01(f));
    }

    @ReactProp(name = "zIndex")
    public void setZIndex(View view, float f) {
        ViewGroupManager.setViewZIndex(view, Math.round(f));
        ViewParent parent = view.getParent();
        if (parent instanceof InterfaceC65495TlJ) {
            ((InterfaceC65495TlJ) parent).FAq();
        }
    }

    public void setTransformProperty(View view, ReadableArray readableArray, ReadableArray readableArray2) {
        float[] fArr;
        double cos;
        char c;
        double d;
        double d2;
        double d3;
        double sin;
        char c2;
        float sanitizeFloatPropertyValue;
        double d4;
        float f;
        if (readableArray == null) {
            view.setTranslationX(WF1.A01(0.0f));
            view.setTranslationY(WF1.A01(0.0f));
            sanitizeFloatPropertyValue = 0.0f;
            view.setRotation(0.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            AbstractC43593JPy.A1A(view);
        } else {
            boolean A1P = AbstractC167007dF.A1P(C62797SRr.A00(view), 2);
            C69273Vkh c69273Vkh = sMatrixDecompositionContext;
            double[] dArr = c69273Vkh.A00;
            int i = 0;
            do {
                dArr[i] = 0.0d;
                i++;
            } while (i < 4);
            double[] dArr2 = c69273Vkh.A02;
            int i2 = 0;
            do {
                dArr2[i2] = 0.0d;
                i2++;
            } while (i2 < 3);
            double[] dArr3 = c69273Vkh.A03;
            int i3 = 0;
            do {
                dArr3[i3] = 0.0d;
                i3++;
            } while (i3 < 3);
            double[] dArr4 = c69273Vkh.A04;
            int i4 = 0;
            do {
                dArr4[i4] = 0.0d;
                i4++;
            } while (i4 < 3);
            double[] dArr5 = c69273Vkh.A01;
            int i5 = 0;
            do {
                dArr5[i5] = 0.0d;
                i5++;
            } while (i5 < 3);
            double[] dArr6 = sTransformDecompositionArray;
            float A00 = WF1.A00(view.getWidth());
            float A002 = WF1.A00(view.getHeight());
            double[] dArr7 = (double[]) WED.A00.get();
            WGP.A03(dArr6);
            if (readableArray2 == null || (A002 == 0.0f && A00 == 0.0f)) {
                fArr = null;
            } else {
                float f2 = A00 / 2.0f;
                float f3 = A002 / 2.0f;
                float[] fArr2 = new float[3];
                fArr2[0] = f2;
                fArr2[1] = f3;
                fArr2[2] = 0.0f;
                for (int i6 = 0; i6 < readableArray2.size() && i6 < 3; i6++) {
                    int ordinal = readableArray2.getType(i6).ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 3 && A1P) {
                            String string = readableArray2.getString(i6);
                            if (string.endsWith("%")) {
                                float parseFloat = Float.parseFloat(string.substring(0, string.length() - 1));
                                float f4 = A002;
                                if (i6 == 0) {
                                    f4 = A00;
                                }
                                f = (f4 * parseFloat) / 100.0f;
                            }
                        }
                    } else {
                        f = (float) readableArray2.getDouble(i6);
                    }
                    fArr2[i6] = f;
                }
                fArr = new float[]{(-f2) + fArr2[0], (-f3) + fArr2[1], fArr2[2]};
                WGP.A03(dArr7);
                double d5 = fArr[0];
                double d6 = fArr[1];
                double d7 = fArr[2];
                C14360o3.A0B(dArr7, 0);
                dArr7[12] = d5;
                dArr7[13] = d6;
                dArr7[14] = d7;
                WGP.A04(dArr6, dArr6, dArr7);
            }
            if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
                WGP.A03(dArr7);
                for (int i7 = 0; i7 < readableArray.size(); i7++) {
                    dArr7[i7] = readableArray.getDouble(i7);
                }
                WGP.A04(dArr6, dArr6, dArr7);
            } else {
                int size = readableArray.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ReadableMap map = readableArray.getMap(i8);
                    String Csu = map.keySetIterator().Csu();
                    WGP.A03(dArr7);
                    if ("matrix".equals(Csu)) {
                        ReadableArray array = map.getArray(Csu);
                        int i9 = 0;
                        do {
                            dArr7[i9] = array.getDouble(i9);
                            i9++;
                        } while (i9 < 16);
                    } else {
                        if ("perspective".equals(Csu)) {
                            double d8 = map.getDouble(Csu);
                            C14360o3.A0B(dArr7, 0);
                            cos = (-1.0d) / d8;
                            c = 11;
                        } else {
                            if ("rotateX".equals(Csu)) {
                                double A003 = WED.A00(map, Csu);
                                C14360o3.A0B(dArr7, 0);
                                cos = Math.cos(A003);
                                dArr7[5] = cos;
                                double sin2 = Math.sin(A003);
                                dArr7[6] = sin2;
                                sin = -sin2;
                                c2 = '\t';
                            } else if ("rotateY".equals(Csu)) {
                                double A004 = WED.A00(map, Csu);
                                C14360o3.A0B(dArr7, 0);
                                cos = Math.cos(A004);
                                dArr7[0] = cos;
                                sin = Math.sin(A004);
                                dArr7[2] = -sin;
                                c2 = '\b';
                            } else {
                                if (!"rotate".equals(Csu) && !"rotateZ".equals(Csu)) {
                                    if ("scale".equals(Csu)) {
                                        cos = map.getDouble(Csu);
                                        C14360o3.A0B(dArr7, 0);
                                        dArr7[0] = cos;
                                    } else if ("scaleX".equals(Csu)) {
                                        double d9 = map.getDouble(Csu);
                                        C14360o3.A0B(dArr7, 0);
                                        dArr7[0] = d9;
                                    } else if ("scaleY".equals(Csu)) {
                                        cos = map.getDouble(Csu);
                                    } else if ("translate".equals(Csu)) {
                                        ReadableArray array2 = map.getArray(Csu);
                                        ReadableType type = array2.getType(0);
                                        ReadableType readableType = ReadableType.String;
                                        if (type == readableType && A1P) {
                                            d2 = WED.A01(array2.getString(0), A00);
                                        } else {
                                            d2 = array2.getDouble(0);
                                        }
                                        if (array2.getType(1) == readableType && A1P) {
                                            d3 = WED.A01(array2.getString(1), A002);
                                        } else {
                                            d3 = array2.getDouble(1);
                                        }
                                        cos = array2.size() > 2 ? array2.getDouble(2) : 0.0d;
                                        C14360o3.A0B(dArr7, 0);
                                        dArr7[12] = d2;
                                        dArr7[13] = d3;
                                        c = 14;
                                    } else {
                                        if ("translateX".equals(Csu)) {
                                            if (map.getType(Csu) == ReadableType.String && A1P) {
                                                d = WED.A01(map.getString(Csu), A00);
                                            } else {
                                                d = map.getDouble(Csu);
                                            }
                                            cos = 0.0d;
                                        } else if ("translateY".equals(Csu)) {
                                            if (map.getType(Csu) == ReadableType.String && A1P) {
                                                cos = WED.A01(map.getString(Csu), A002);
                                            } else {
                                                cos = map.getDouble(Csu);
                                            }
                                            d = 0.0d;
                                        } else if ("skewX".equals(Csu)) {
                                            double A005 = WED.A00(map, Csu);
                                            C14360o3.A0B(dArr7, 0);
                                            cos = Math.tan(A005);
                                            c = 4;
                                        } else if ("skewY".equals(Csu)) {
                                            double A006 = WED.A00(map, Csu);
                                            C14360o3.A0B(dArr7, 0);
                                            dArr7[1] = Math.tan(A006);
                                        } else {
                                            AbstractC65702TsY.A1U("Unsupported transform type: ", Csu);
                                        }
                                        C14360o3.A0B(dArr7, 0);
                                        dArr7[12] = d;
                                        c = '\r';
                                    }
                                    C14360o3.A0B(dArr7, 0);
                                } else {
                                    double A007 = WED.A00(map, Csu);
                                    C14360o3.A0B(dArr7, 0);
                                    cos = Math.cos(A007);
                                    dArr7[0] = cos;
                                    double sin3 = Math.sin(A007);
                                    dArr7[1] = sin3;
                                    dArr7[4] = -sin3;
                                }
                                c = 5;
                            }
                            dArr7[c2] = sin;
                            c = '\n';
                        }
                        dArr7[c] = cos;
                    }
                    WGP.A04(dArr6, dArr6, dArr7);
                }
            }
            if (fArr != null) {
                WGP.A03(dArr7);
                double d10 = -fArr[0];
                double d11 = -fArr[1];
                double d12 = -fArr[2];
                C14360o3.A0B(dArr7, 0);
                dArr7[12] = d10;
                dArr7[13] = d11;
                dArr7[14] = d12;
                WGP.A04(dArr6, dArr6, dArr7);
            }
            C14360o3.A0B(dArr6, 0);
            AbstractC05810Sj.A02(AbstractC167007dF.A1P(dArr6.length, 16));
            double[] dArr8 = c69273Vkh.A00;
            double[] dArr9 = c69273Vkh.A02;
            double[] dArr10 = c69273Vkh.A03;
            double[] dArr11 = c69273Vkh.A04;
            double[] dArr12 = c69273Vkh.A01;
            if (!WGP.A05(dArr6[15])) {
                double[][] dArr13 = new double[4];
                int i10 = 0;
                do {
                    dArr13[i10] = new double[4];
                    i10++;
                } while (i10 < 4);
                double[] dArr14 = new double[16];
                int i11 = 0;
                do {
                    int i12 = 0;
                    do {
                        int i13 = (i11 * 4) + i12;
                        double d13 = dArr6[i13] / dArr6[15];
                        dArr13[i11][i12] = d13;
                        if (i12 == 3) {
                            d13 = 0.0d;
                        }
                        dArr14[i13] = d13;
                        i12++;
                    } while (i12 < 4);
                    i11++;
                } while (i11 < 4);
                dArr14[15] = 1.0d;
                if (!WGP.A05(WGP.A00(dArr14))) {
                    double d14 = dArr13[0][3];
                    if (WGP.A05(d14) && WGP.A05(dArr13[1][3]) && WGP.A05(dArr13[2][3])) {
                        dArr8[2] = 0.0d;
                        dArr8[1] = 0.0d;
                        dArr8[0] = 0.0d;
                        d4 = 1.0d;
                    } else {
                        double[] dArr15 = {d14, dArr13[1][3], dArr13[2][3], dArr13[3][3]};
                        double A008 = WGP.A00(dArr14);
                        if (!WGP.A05(A008)) {
                            double d15 = dArr14[0];
                            double d16 = dArr14[1];
                            double d17 = dArr14[2];
                            double d18 = dArr14[3];
                            double d19 = dArr14[4];
                            double d20 = dArr14[5];
                            double d21 = dArr14[6];
                            double d22 = dArr14[7];
                            double d23 = dArr14[8];
                            double d24 = dArr14[9];
                            double d25 = dArr14[10];
                            double d26 = dArr14[11];
                            double d27 = dArr14[12];
                            double d28 = dArr14[13];
                            double d29 = dArr14[14];
                            double d30 = dArr14[15];
                            double d31 = d21 * d26;
                            double d32 = d22 * d25;
                            double d33 = d22 * d24;
                            double d34 = d20 * d26;
                            double d35 = d21 * d24;
                            double d36 = d20 * d25;
                            double d37 = d18 * d25;
                            double d38 = d17 * d26;
                            double d39 = d18 * d24;
                            double d40 = d16 * d26;
                            double d41 = d17 * d24;
                            double d42 = d16 * d25;
                            double d43 = d17 * d22;
                            double d44 = d18 * d21;
                            double d45 = d18 * d20;
                            double d46 = d16 * d22;
                            double d47 = d17 * d20;
                            double d48 = d16 * d21;
                            double d49 = d22 * d23;
                            double d50 = ((d32 * d27) - (d31 * d27)) - (d49 * d29);
                            double d51 = d19 * d26;
                            double d52 = d21 * d23;
                            double d53 = d19 * d25;
                            double d54 = d18 * d23;
                            double d55 = ((d38 * d27) - (d37 * d27)) + (d54 * d29);
                            double d56 = d15 * d26;
                            double d57 = d17 * d23;
                            double d58 = d15 * d25;
                            double d59 = d18 * d19;
                            double d60 = d22 * d15;
                            double d61 = d17 * d19;
                            double d62 = d21 * d15;
                            double d63 = (((d34 * d27) - (d33 * d27)) + (d49 * d28)) - (d51 * d28);
                            double d64 = d20 * d23;
                            double d65 = d19 * d24;
                            double d66 = (((d39 * d27) - (d40 * d27)) - (d54 * d28)) + (d56 * d28);
                            double d67 = d16 * d23;
                            double d68 = d15 * d24;
                            double d69 = d16 * d19;
                            double d70 = d15 * d20;
                            dArr14 = new double[]{((((((d31 * d28) - (d32 * d28)) + (d33 * d29)) - (d34 * d29)) - (d35 * d30)) + (d36 * d30)) / A008, ((((((d37 * d28) - (d38 * d28)) - (d39 * d29)) + (d40 * d29)) + (d41 * d30)) - (d42 * d30)) / A008, ((((((d43 * d28) - (d44 * d28)) + (d45 * d29)) - (d46 * d29)) - (d47 * d30)) + (d48 * d30)) / A008, ((((((d44 * d24) - (d43 * d24)) - (d45 * d25)) + (d46 * d25)) + (d47 * d26)) - (d48 * d26)) / A008, (((d50 + (d51 * d29)) + (d52 * d30)) - (d53 * d30)) / A008, (((d55 - (d56 * d29)) - (d57 * d30)) + (d58 * d30)) / A008, ((((((d44 * d27) - (d43 * d27)) - (d59 * d29)) + (d60 * d29)) + (d61 * d30)) - (d62 * d30)) / A008, ((((((d43 * d23) - (d44 * d23)) + (d59 * d25)) - (d60 * d25)) - (d61 * d26)) + (d62 * d26)) / A008, ((d63 - (d64 * d30)) + (d65 * d30)) / A008, ((d66 + (d67 * d30)) - (d68 * d30)) / A008, ((((((d46 * d27) - (d45 * d27)) + (d59 * d28)) - (d60 * d28)) - (d69 * d30)) + (d30 * d70)) / A008, ((((((d45 * d23) - (d46 * d23)) - (d59 * d24)) + (d60 * d24)) + (d69 * d26)) - (d26 * d70)) / A008, ((((((d35 * d27) - (d36 * d27)) - (d52 * d28)) + (d53 * d28)) + (d64 * d29)) - (d65 * d29)) / A008, ((((((d42 * d27) - (d41 * d27)) + (d57 * d28)) - (d58 * d28)) - (d67 * d29)) + (d68 * d29)) / A008, ((((((d47 * d27) - (d27 * d48)) - (d61 * d28)) + (d28 * d62)) + (d69 * d29)) - (d29 * d70)) / A008, ((((((d48 * d23) - (d47 * d23)) + (d61 * d24)) - (d62 * d24)) - (d69 * d25)) + (d70 * d25)) / A008};
                        }
                        double[] dArr16 = {dArr14[0], dArr14[4], dArr14[8], dArr14[12], dArr14[1], dArr14[5], dArr14[9], dArr14[13], dArr14[2], dArr14[6], dArr14[10], dArr14[14], dArr14[3], dArr14[7], dArr14[11], dArr14[15]};
                        C14360o3.A0B(dArr8, 2);
                        double d71 = dArr15[0];
                        double d72 = dArr15[1];
                        double d73 = dArr15[2];
                        double d74 = dArr15[3];
                        dArr8[0] = (dArr16[0] * d71) + (dArr16[4] * d72) + (dArr16[8] * d73) + (dArr16[12] * d74);
                        dArr8[1] = (dArr16[1] * d71) + (dArr16[5] * d72) + (dArr16[9] * d73) + (dArr16[13] * d74);
                        dArr8[2] = (dArr16[2] * d71) + (dArr16[6] * d72) + (dArr16[10] * d73) + (dArr16[14] * d74);
                        d4 = (d71 * dArr16[3]) + (d72 * dArr16[7]) + (d73 * dArr16[11]) + (d74 * dArr16[15]);
                    }
                    dArr8[3] = d4;
                    int i14 = 0;
                    do {
                        dArr11[i14] = dArr13[3][i14];
                        i14++;
                    } while (i14 < 3);
                    double[][] dArr17 = new double[3];
                    int i15 = 0;
                    do {
                        dArr17[i15] = new double[3];
                        i15++;
                    } while (i15 < 3);
                    int i16 = 0;
                    do {
                        double[] dArr18 = dArr17[i16];
                        double[] dArr19 = dArr13[i16];
                        dArr18[0] = dArr19[0];
                        dArr18[1] = dArr19[1];
                        dArr18[2] = dArr19[2];
                        i16++;
                    } while (i16 < 3);
                    double A01 = WGP.A01(dArr17[0]);
                    dArr9[0] = A01;
                    double[] A06 = WGP.A06(dArr17[0], A01);
                    dArr17[0] = A06;
                    double A02 = WGP.A02(A06, dArr17[1]);
                    dArr10[0] = A02;
                    double[] A07 = WGP.A07(dArr17[1], dArr17[0], -A02);
                    dArr17[1] = A07;
                    double A012 = WGP.A01(A07);
                    dArr9[1] = A012;
                    dArr17[1] = WGP.A06(dArr17[1], A012);
                    dArr10[0] = dArr10[0] / dArr9[1];
                    double A022 = WGP.A02(dArr17[0], dArr17[2]);
                    dArr10[1] = A022;
                    double[] A072 = WGP.A07(dArr17[2], dArr17[0], -A022);
                    dArr17[2] = A072;
                    double A023 = WGP.A02(dArr17[1], A072);
                    dArr10[2] = A023;
                    double[] A073 = WGP.A07(dArr17[2], dArr17[1], -A023);
                    dArr17[2] = A073;
                    double A013 = WGP.A01(A073);
                    dArr9[2] = A013;
                    double[] A062 = WGP.A06(dArr17[2], A013);
                    dArr17[2] = A062;
                    double d75 = dArr10[1];
                    double d76 = dArr9[2];
                    dArr10[1] = d75 / d76;
                    dArr10[2] = dArr10[2] / d76;
                    double[] dArr20 = dArr17[1];
                    C14360o3.A0B(dArr20, 0);
                    double d77 = dArr20[1];
                    double d78 = A062[2];
                    double d79 = dArr20[2];
                    double d80 = A062[0];
                    double d81 = dArr20[0];
                    if (WGP.A02(dArr17[0], new double[]{(d77 * d78) - (A062[1] * d79), (d79 * d80) - (d78 * d81), (d81 * A062[1]) - (dArr20[1] * d80)}) < 0.0d) {
                        int i17 = 0;
                        do {
                            dArr9[i17] = dArr9[i17] * (-1.0d);
                            double[] dArr21 = dArr17[i17];
                            dArr21[0] = dArr21[0] * (-1.0d);
                            dArr21[1] = dArr21[1] * (-1.0d);
                            dArr21[2] = dArr21[2] * (-1.0d);
                            i17++;
                        } while (i17 < 3);
                    }
                    double[] dArr22 = dArr17[2];
                    dArr12[0] = Math.round((-Math.atan2(dArr22[1], dArr22[2])) * 57.29577951308232d * 1000.0d) * 0.001d;
                    double d82 = -dArr22[0];
                    double d83 = dArr22[1];
                    double d84 = dArr22[2];
                    dArr12[1] = Math.round((-Math.atan2(d82, Math.sqrt((d83 * d83) + (d84 * d84)))) * 57.29577951308232d * 1000.0d) * 0.001d;
                    dArr12[2] = Math.round((-Math.atan2(dArr17[1][0], dArr17[0][0])) * 57.29577951308232d * 1000.0d) * 0.001d;
                }
            }
            view.setTranslationX(WF1.A01(sanitizeFloatPropertyValue((float) dArr11[0])));
            view.setTranslationY(WF1.A01(sanitizeFloatPropertyValue((float) dArr11[1])));
            view.setRotation(sanitizeFloatPropertyValue((float) dArr12[2]));
            view.setRotationX(sanitizeFloatPropertyValue((float) dArr12[0]));
            view.setRotationY(sanitizeFloatPropertyValue((float) dArr12[1]));
            view.setScaleX(sanitizeFloatPropertyValue((float) dArr9[0]));
            view.setScaleY(sanitizeFloatPropertyValue((float) dArr9[1]));
            float f5 = (float) dArr8[2];
            if (f5 == 0.0f) {
                f5 = 7.8125E-4f;
            }
            float f6 = (-1.0f) / f5;
            DisplayMetrics displayMetrics = C63356SiD.A00;
            if (displayMetrics != null) {
                float f7 = displayMetrics.density;
                sanitizeFloatPropertyValue = sanitizeFloatPropertyValue(f7 * f7 * f6 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                throw new IllegalStateException(AbstractC58317Pt9.A00(549));
            }
        }
        view.setCameraDistance(sanitizeFloatPropertyValue);
    }

    public BaseViewManager() {
        super(null);
    }
}
