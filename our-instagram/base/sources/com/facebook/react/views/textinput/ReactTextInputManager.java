package com.facebook.react.views.textinput;

import X.AbstractC167007dF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.C00O;
import X.C05F;
import X.C0I2;
import X.C14360o3;
import X.C63011Saa;
import X.C63403SjY;
import X.C64907TZh;
import X.C69418Vn3;
import X.C69829VwF;
import X.EnumC61190Rgq;
import X.InterfaceC65225TgH;
import X.InterfaceC71842X7a;
import X.Q21;
import X.R3N;
import X.SKS;
import X.SXn;
import X.Sb5;
import X.UDV;
import X.VDC;
import X.WF2;
import X.WKf;
import X.WNZ;
import X.WPE;
import X.WXV;
import X.WXW;
import X.WXX;
import X.X9J;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class ReactTextInputManager extends BaseViewManager {
    public static final int AUTOCAPITALIZE_FLAGS = 28672;
    public static final int BLUR_TEXT_INPUT = 2;
    public static final int FOCUS_TEXT_INPUT = 1;
    public static final int IME_ACTION_ID = 1648;
    public static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    public static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    public static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    public static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    public static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    public static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    public static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    public static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    public static final String KEYBOARD_TYPE_URI = "url";
    public static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    public static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    public static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    public static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    public static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    public static final short TX_STATE_KEY_HASH = 2;
    public static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    public static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    public static final int UNSET = -1;
    public InterfaceC71842X7a mReactTextViewManagerCallback;
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final Map REACT_PROPS_AUTOFILL_HINTS_MAP = new C64907TZh(0);
    public static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    public static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    public static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    public ReactTextInputManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getCommandsMap() {
        return AbstractC65702TsY.A0m("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        Integer valueOf = Integer.valueOf(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        HashMap A0m = AbstractC65702TsY.A0m(NetInfoModule.CONNECTION_TYPE_NONE, 0, "characters", 4096);
        A0m.put("words", 8192);
        A0m.put("sentences", valueOf);
        return AbstractC31174DnI.A12("AutoCapitalizationType", A0m);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(UDV udv, boolean z) {
        int i = 0;
        int i2 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (z) {
            i2 = 0;
            i = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        updateStagedInputTypeFlag(udv, i2, i);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(UDV udv, String str) {
        int i = 0;
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                i = 48;
            } else if ("bottom".equals(str)) {
                i = 80;
            } else if ("center".equals(str)) {
                i = 16;
            } else {
                AbstractC65702TsY.A1U("Invalid textAlignVertical: ", str);
            }
        }
        udv.setGravityVertical(i);
    }

    public static void checkPasswordType(UDV udv) {
        int i = udv.A03;
        if ((i & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (i & 128) != 0) {
            updateStagedInputTypeFlag(udv, 128, 16);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Usm, X.Sb5] */
    public static /* synthetic */ void lambda$addEventEmitters$0(R3N r3n, UDV udv, View view, boolean z) {
        Sb5 sb5;
        int i = r3n.A00;
        X9J A05 = UIManagerHelper.A05(r3n, udv.getId());
        int id = udv.getId();
        if (z) {
            sb5 = new Sb5(i, id);
        } else {
            A05.APn(new Sb5(i, id));
            int id2 = udv.getId();
            String A0g = AbstractC167007dF.A0g(udv);
            ?? sb52 = new Sb5(i, id2);
            sb52.A00 = A0g;
            sb5 = sb52;
        }
        A05.APn(sb5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.Uso, X.Sb5] */
    public static /* synthetic */ boolean lambda$addEventEmitters$1(UDV udv, R3N r3n, TextView textView, int i, KeyEvent keyEvent) {
        boolean equals;
        if ((i & 255) != 0 || i == 0) {
            boolean A06 = udv.A06();
            String str = udv.A0B;
            boolean z = false;
            if (str != null ? str.equals("submit") || str.equals("blurAndSubmit") : !udv.A06()) {
                z = true;
            }
            String str2 = udv.A0B;
            if (str2 == null) {
                equals = AbstractC167007dF.A1N(udv.A06() ? 1 : 0);
            } else {
                equals = str2.equals("blurAndSubmit");
            }
            if (z) {
                X9J A05 = UIManagerHelper.A05(r3n, udv.getId());
                int i2 = r3n.A00;
                int id = udv.getId();
                String A0g = AbstractC167007dF.A0g(udv);
                ?? sb5 = new Sb5(i2, id);
                sb5.A00 = A0g;
                A05.APn(sb5);
            }
            if (equals) {
                udv.clearFocus();
            } else if (!z && A06 && i != 5 && i != 7) {
                return false;
            }
        }
        return true;
    }

    public static boolean shouldHideCursorForEmailTextInput() {
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
        if (Build.VERSION.SDK_INT == 29 && lowerCase.contains("xiaomi")) {
            return true;
        }
        return false;
    }

    public static void updateStagedInputTypeFlag(UDV udv, int i, int i2) {
        udv.A03 = ((i ^ (-1)) & udv.A03) | i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2Vi, com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.views.text.ReactBaseTextShadowNode, com.facebook.react.views.textinput.ReactTextInputShadowNode] */
    public ReactBaseTextShadowNode createShadowNodeInstance(InterfaceC71842X7a interfaceC71842X7a) {
        ?? reactBaseTextShadowNode = new ReactBaseTextShadowNode(interfaceC71842X7a);
        reactBaseTextShadowNode.A00 = -1;
        reactBaseTextShadowNode.A02 = null;
        reactBaseTextShadowNode.A01 = null;
        reactBaseTextShadowNode.A03 = 1;
        reactBaseTextShadowNode.A09(reactBaseTextShadowNode);
        return reactBaseTextShadowNode;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public UDV createViewInstance(R3N r3n) {
        UDV udv = new UDV(r3n);
        udv.setInputType(udv.getInputType() & (-131073));
        udv.setReturnKeyType("done");
        udv.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return udv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r5 != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getReactTextUpdate(X.UDV r16, X.SKS r17, X.InterfaceC72045XLb r18) {
        /*
            r15 = this;
            r3 = r18
            int r0 = r3.getCount()
            if (r0 != 0) goto La
            r5 = 0
            return r5
        La:
            r0 = 0
            X.XLb r2 = r3.getMapBuffer(r0)
            r0 = 1
            X.XLb r1 = r3.getMapBuffer(r0)
            android.content.Context r0 = r16.getContext()
            android.text.Spannable r6 = X.WGL.A03(r0, r2)
            r0 = 2
            java.lang.String r0 = r1.getString(r0)
            int r13 = X.W6Q.A01(r0)
            int r14 = r16.getJustificationMode()
            r0 = 3
            int r11 = r3.getInt(r0)
            boolean r5 = X.WGL.A05(r2)
            int r12 = r16.getGravityHorizontal()
            java.lang.String r3 = "textAlign"
            r0 = r17
            com.facebook.react.bridge.ReadableMap r2 = r0.A00
            boolean r0 = r2.hasKey(r3)
            if (r0 == 0) goto L66
            java.lang.String r1 = r2.getString(r3)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r1)
            r4 = 3
            if (r0 != 0) goto L65
            r12 = 0
            if (r1 == 0) goto L66
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66
            java.lang.String r0 = "left"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L85
            if (r5 == 0) goto L65
        L64:
            r4 = 5
        L65:
            r12 = r4
        L66:
            boolean r0 = r2.hasKey(r3)
            if (r0 == 0) goto L7a
            java.lang.String r1 = r2.getString(r3)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r1)
            boolean r14 = X.AbstractC167007dF.A1M(r0)
        L7a:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.Vn3 r5 = new X.Vn3
            r8 = r7
            r9 = r7
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L85:
            java.lang.String r0 = "right"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L90
            if (r5 == 0) goto L64
            goto L65
        L90:
            java.lang.String r0 = "center"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9a
            r4 = 1
            goto L65
        L9a:
            java.lang.String r0 = "Invalid textAlign: "
            X.AbstractC65702TsY.A1U(r0, r1)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.getReactTextUpdate(X.UDV, X.SKS, X.XLb):java.lang.Object");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(name = "autoCorrect")
    public void setAutoCorrect(UDV udv, Boolean bool) {
        int i;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            i = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (booleanValue) {
                i = Constants.LOAD_RESULT_PGO;
            }
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(udv, 557056, i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(UDV udv, int i, Integer num) {
        C63403SjY.A0A(udv, EnumC61190Rgq.A02, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(UDV udv, String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(udv, A00);
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(UDV udv, boolean z) {
        if (udv.A03 == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        udv.setCursorVisible(!z);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(UDV udv, Integer num) {
        if (num == null) {
            Context context = udv.getContext();
            C14360o3.A0B(context, 0);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColor});
            C14360o3.A07(obtainStyledAttributes);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                udv.setTextColor(colorStateList);
                return;
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, AbstractC31175DnJ.A0V("Could not get default text color from View Context: ", context.getClass().getCanonicalName()));
                return;
            }
        }
        udv.setTextColor(num.intValue());
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public void setCursorColor(UDV udv, Integer num) {
        Drawable textCursorDrawable;
        if (Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = udv.getTextCursorDrawable()) != null) {
            if (num != null) {
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
            } else {
                textCursorDrawable.clearColorFilter();
            }
            udv.setTextCursorDrawable(textCursorDrawable);
        }
    }

    @ReactProp(name = "importantForAutofill")
    public void setImportantForAutofill(UDV udv, String str) {
        int i;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else {
            i = 0;
            if ("yesExcludeDescendants".equals(str)) {
                i = 4;
            }
        }
        udv.setImportantForAutofill(i);
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(UDV udv, String str) {
        udv.setCompoundDrawablesWithIntrinsicBounds(SXn.A01.A00(udv.getContext(), str), 0, 0, 0);
    }

    @ReactProp(name = "keyboardType")
    public void setKeyboardType(UDV udv, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
            if (shouldHideCursorForEmailTextInput()) {
                udv.setCursorVisible(false);
            }
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i = 144;
        } else {
            i = 1;
            if ("url".equalsIgnoreCase(str)) {
                i = 16;
            }
        }
        updateStagedInputTypeFlag(udv, 15, i);
        checkPasswordType(udv);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(UDV udv, boolean z) {
        WXV wxv;
        if (z) {
            wxv = new WXV(udv);
        } else {
            wxv = null;
        }
        udv.A07 = wxv;
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(UDV udv, boolean z) {
        WXW wxw;
        if (z) {
            wxw = new WXW(udv);
        } else {
            wxw = null;
        }
        udv.A08 = wxw;
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(UDV udv, boolean z) {
        WXX wxx;
        if (z) {
            wxx = new WXX(udv);
        } else {
            wxx = null;
        }
        udv.A09 = wxx;
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(UDV udv, Integer num) {
        if (num == null) {
            Context context = udv.getContext();
            C14360o3.A0B(context, 0);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHint});
            C14360o3.A07(obtainStyledAttributes);
            udv.setHintTextColor(obtainStyledAttributes.getColorStateList(0));
            return;
        }
        udv.setHintTextColor(num.intValue());
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(UDV udv, String str) {
        udv.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(UDV udv, boolean z) {
        int i = 0;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(udv, 144, i);
        checkPasswordType(udv);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(UDV udv, Integer num) {
        int intValue;
        if (num == null) {
            Context context = udv.getContext();
            C14360o3.A0B(context, 0);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHighlight});
            C14360o3.A07(obtainStyledAttributes);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                intValue = colorStateList.getDefaultColor();
            } else {
                intValue = 0;
            }
        } else {
            intValue = num.intValue();
        }
        udv.setHighlightColor(intValue);
    }

    @ReactProp(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(UDV udv, Integer num) {
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable mutate = udv.getTextSelectHandle().mutate();
            Drawable mutate2 = udv.getTextSelectHandleLeft().mutate();
            Drawable mutate3 = udv.getTextSelectHandleRight().mutate();
            if (num != null) {
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN);
                mutate.setColorFilter(blendModeColorFilter);
                mutate2.setColorFilter(blendModeColorFilter);
                mutate3.setColorFilter(blendModeColorFilter);
            } else {
                mutate.clearColorFilter();
                mutate2.clearColorFilter();
                mutate3.clearColorFilter();
            }
            udv.setTextSelectHandle(mutate);
            udv.setTextSelectHandleLeft(mutate2);
            udv.setTextSelectHandleRight(mutate3);
        }
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(UDV udv, String str) {
        if ("justify".equals(str)) {
            udv.setJustificationMode(1);
        } else {
            int i = 0;
            udv.setJustificationMode(0);
            if (str != null && !"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        i = 5;
                    } else {
                        if ("center".equals(str)) {
                            udv.setGravityHorizontal(1);
                            return;
                        }
                        AbstractC65702TsY.A1U("Invalid textAlign: ", str);
                    }
                }
            }
            udv.setGravityHorizontal(i);
            return;
        }
        udv.setGravityHorizontal(3);
    }

    @ReactProp(name = "autoComplete")
    public void setTextContentType(UDV udv, String str) {
        if (str != null && !"off".equals(str)) {
            Map map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                udv.setAutofillHints((String) map.get(str));
                return;
            }
            AbstractC65702TsY.A1U("Invalid autoComplete: ", str);
        }
        udv.setImportantForAutofill(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateExtraData(X.UDV r6, java.lang.Object r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C69418Vn3
            if (r0 == 0) goto L61
            X.Vn3 r7 = (X.C69418Vn3) r7
            float r0 = r7.A01
            int r4 = (int) r0
            float r0 = r7.A03
            int r3 = (int) r0
            float r0 = r7.A02
            int r2 = (int) r0
            float r0 = r7.A00
            int r0 = (int) r0
            r1 = -1
            if (r4 != r1) goto L1f
            if (r3 != r1) goto L1b
            if (r2 != r1) goto L1b
            if (r0 == r1) goto L34
        L1b:
            int r4 = r6.getPaddingLeft()
        L1f:
            if (r3 != r1) goto L25
            int r3 = r6.getPaddingTop()
        L25:
            if (r2 != r1) goto L2b
            int r2 = r6.getPaddingRight()
        L2b:
            if (r0 != r1) goto L31
            int r0 = r6.getPaddingBottom()
        L31:
            r6.setPadding(r4, r3, r2, r0)
        L34:
            int r3 = r6.getSelectionStart()
            int r0 = r6.getSelectionEnd()
            r2 = 0
            if (r3 != r0) goto L59
            android.text.Editable r0 = r6.getText()
            if (r0 == 0) goto L4d
            android.text.Editable r0 = r6.getText()
            int r2 = r0.length()
        L4d:
            int r0 = r6.getSelectionStart()
            int r2 = r2 - r0
            android.text.Spannable r0 = r7.A08
            int r1 = r0.length()
            int r1 = r1 - r2
        L59:
            r6.A05(r7)
            int r0 = r7.A04
            r6.A04(r0, r1, r1)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.updateExtraData(X.UDV, java.lang.Object):void");
    }

    public Object updateState(UDV udv, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        KeyListener keyListener = UDV.A0V;
        udv.setPadding(0, 0, 0, 0);
        udv.A04 = interfaceC65225TgH;
        throw new NullPointerException("getStateDataMapBuffer");
    }

    public static X9J getEventDispatcher(Q21 q21, UDV udv) {
        return UIManagerHelper.A05(q21, udv.getId());
    }

    private void setAutofillHints(UDV udv, String... strArr) {
        udv.setAutofillHints(strArr);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(R3N r3n, UDV udv) {
        udv.A05 = UIManagerHelper.A05(r3n, udv.getId());
        udv.addTextChangedListener(new WKf(r3n, udv, this));
        udv.setOnFocusChangeListener(new WNZ(0, udv, r3n));
        udv.setOnEditorActionListener(new WPE(0, r3n, udv));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Map exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topSubmitEditing", AbstractC31174DnI.A12("phasedRegistrationNames", AbstractC65702TsY.A0m("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
        hashMap.put("topEndEditing", AbstractC65703TsZ.A1B("onEndEditing", "onEndEditingCapture"));
        hashMap.put("topFocus", AbstractC65703TsZ.A1B("onFocus", "onFocusCapture"));
        hashMap.put("topBlur", AbstractC65703TsZ.A1B("onBlur", "onBlurCapture"));
        hashMap.put("topKeyPress", AbstractC65703TsZ.A1B("onKeyPress", "onKeyPressCapture"));
        exportedCustomBubblingEventTypeConstants.putAll(hashMap);
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        HashMap hashMap = new HashMap();
        C14360o3.A0B(C05F.A0C, 0);
        hashMap.put("topScroll", AbstractC31174DnI.A12("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.putAll(hashMap);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(UDV udv) {
        int paintFlags;
        super.onAfterUpdateTransaction((View) udv);
        if (udv.A0I) {
            udv.A0I = false;
            Typeface typeface = udv.getTypeface();
            int i = udv.A00;
            int i2 = udv.A01;
            udv.setTypeface(WF2.A02(udv.getContext().getAssets(), typeface, udv.A0A, i, i2));
            if (udv.A00 == -1 && udv.A01 == -1 && udv.A0A == null && udv.getFontFeatureSettings() == null) {
                paintFlags = udv.getPaintFlags() & (-129);
            } else {
                paintFlags = udv.getPaintFlags() | 128;
            }
            udv.setPaintFlags(paintFlags);
        }
        if (udv.getInputType() != udv.A03) {
            int selectionStart = udv.getSelectionStart();
            int selectionEnd = udv.getSelectionEnd();
            udv.setInputType(udv.A03);
            udv.setSelection(selectionStart, selectionEnd);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiveCommand(X.UDV r9, java.lang.String r10, com.facebook.react.bridge.ReadableArray r11) {
        /*
            r8 = this;
            int r0 = r10.hashCode()
            r7 = 3
            r1 = 2
            r6 = 0
            r5 = 1
            r4 = -1
            switch(r0) {
                case -1699362314: goto L51;
                case 3027047: goto L4e;
                case 97604824: goto L42;
                case 1427010500: goto L10;
                case 1690703013: goto Ld;
                default: goto Lc;
            }
        Lc:
            return
        Ld:
            java.lang.String r0 = "focusTextInput"
            goto L44
        L10:
            java.lang.String r0 = "setTextAndSelection"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto Lc
            int r3 = r11.getInt(r6)
            if (r3 == r4) goto Lc
            int r2 = r11.getInt(r1)
            int r1 = r11.getInt(r7)
            if (r1 != r4) goto L29
            r1 = r2
        L29:
            boolean r0 = r11.isNull(r5)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r11.getString(r5)
            X.Vn3 r0 = r8.getReactTextUpdate(r0, r3)
            r9.A0G = r5
            r9.A05(r0)
            r9.A0G = r6
        L3e:
            r9.A04(r3, r2, r1)
            return
        L42:
            java.lang.String r0 = "focus"
        L44:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto Lc
            X.UDV.A02(r9)
            return
        L4e:
            java.lang.String r0 = "blur"
            goto L53
        L51:
            java.lang.String r0 = "blurTextInput"
        L53:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto Lc
            r9.clearFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.receiveCommand(X.UDV, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(UDV udv, boolean z) {
        udv.setAllowFontScaling(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r0 == false) goto L11;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAutoCapitalize(X.UDV r4, com.facebook.react.bridge.Dynamic r5) {
        /*
            r3 = this;
            com.facebook.react.bridge.ReadableType r1 = r5.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            r2 = 0
            if (r1 != r0) goto L13
            int r2 = r5.asInt()
        Ld:
            r0 = 28672(0x7000, float:4.0178E-41)
            updateStagedInputTypeFlag(r4, r0, r2)
            return
        L13:
            com.facebook.react.bridge.ReadableType r1 = r5.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.String
            if (r1 != r0) goto L26
            java.lang.String r1 = r5.asString()
            int r0 = r1.hashCode()
            switch(r0) {
                case 3387192: goto L32;
                case 113318569: goto L39;
                case 1245424234: goto L29;
                default: goto L26;
            }
        L26:
            r2 = 16384(0x4000, float:2.2959E-41)
            goto Ld
        L29:
            java.lang.String r0 = "characters"
            boolean r0 = r1.equals(r0)
            r2 = 4096(0x1000, float:5.74E-42)
            goto L41
        L32:
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            goto L41
        L39:
            java.lang.String r0 = "words"
            boolean r0 = r1.equals(r0)
            r2 = 8192(0x2000, float:1.148E-41)
        L41:
            if (r0 != 0) goto Ld
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setAutoCapitalize(X.UDV, com.facebook.react.bridge.Dynamic):void");
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(UDV udv, boolean z) {
        udv.A0D = z;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(UDV udv, int i, float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, f);
        }
        C63403SjY.A08(udv, c63011Saa, VDC.values()[i]);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(UDV udv, int i, float f) {
        C63403SjY.A09(udv, EnumC61190Rgq.values()[i], Float.valueOf(f));
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(UDV udv, ReadableArray readableArray) {
        C63403SjY.A07(udv, readableArray);
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(UDV udv, boolean z) {
        udv.A0E = z;
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(UDV udv, boolean z) {
        udv.setDisableFullscreenUI(z);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(UDV udv, boolean z) {
        udv.setEnabled(z);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(UDV udv, String str) {
        udv.setFontFamily(str);
    }

    @ReactProp(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(UDV udv, float f) {
        udv.setFontSize(f);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(UDV udv, String str) {
        udv.setFontStyle(str);
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(UDV udv, ReadableArray readableArray) {
        udv.setFontFeatureSettings(WF2.A03(readableArray));
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(UDV udv, String str) {
        udv.setFontWeight(str);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(UDV udv, boolean z) {
        udv.setIncludeFontPadding(z);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(UDV udv, int i) {
        udv.setCompoundDrawablePadding(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(UDV udv, float f) {
        udv.setLetterSpacingPt(f);
    }

    @ReactProp(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(UDV udv, int i) {
        udv.setLineHeight(i);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(UDV udv, float f) {
        udv.setMaxFontSizeMultiplier(f);
    }

    @ReactProp(name = "maxLength")
    public void setMaxLength(UDV udv, Integer num) {
        InputFilter[] filters = udv.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        int i = 0;
        if (num == null) {
            int length = filters.length;
            if (length > 0) {
                LinkedList linkedList = new LinkedList();
                do {
                    InputFilter inputFilter = filters[i];
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                    i++;
                } while (i < length);
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else {
            int length2 = filters.length;
            if (length2 > 0) {
                int i2 = 0;
                boolean z = false;
                do {
                    if (filters[i2] instanceof InputFilter.LengthFilter) {
                        filters[i2] = new InputFilter.LengthFilter(num.intValue());
                        z = true;
                    }
                    i2++;
                } while (i2 < length2);
                if (!z) {
                    InputFilter[] inputFilterArr2 = new InputFilter[length2 + 1];
                    System.arraycopy(filters, 0, inputFilterArr2, 0, length2);
                    filters[length2] = new InputFilter.LengthFilter(num.intValue());
                    filters = inputFilterArr2;
                }
                inputFilterArr = filters;
            } else {
                inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
            }
        }
        udv.setFilters(inputFilterArr);
    }

    @ReactProp(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(UDV udv, int i) {
        udv.setLines(i);
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(UDV udv, boolean z) {
        udv.A0H = z;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(UDV udv, String str) {
        udv.setOverflow(str);
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(UDV udv, String str) {
        udv.setPlaceholder(str);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(UDV udv, String str) {
        udv.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(UDV udv, boolean z) {
        udv.setSelectTextOnFocus(z);
    }

    @ReactProp(name = "submitBehavior")
    public void setSubmitBehavior(UDV udv, String str) {
        udv.A0B = str;
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(UDV udv, String str) {
        int paintFlags;
        udv.setPaintFlags(udv.getPaintFlags() & (-25));
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if (str2.equals("underline")) {
                    paintFlags = udv.getPaintFlags() | 8;
                } else if (str2.equals("line-through")) {
                    paintFlags = udv.getPaintFlags() | 16;
                }
                udv.setPaintFlags(paintFlags);
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(UDV udv, Integer num) {
        Drawable background = udv.getBackground();
        if (background != null) {
            if (background.getConstantState() != null) {
                try {
                    background = background.mutate();
                } catch (NullPointerException e) {
                    C0I2.A05(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e);
                }
            }
            if (num == null) {
                background.clearColorFilter();
            } else {
                background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(UDV udv, boolean z) {
        udv.setShowSoftInputOnFocus(z);
    }

    public void setPadding(UDV udv, int i, int i2, int i3, int i4) {
        udv.setPadding(i, i2, i3, i4);
    }

    private C69418Vn3 getReactTextUpdate(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null) {
            str = null;
        }
        spannableStringBuilder.append((CharSequence) str);
        return new C69418Vn3(spannableStringBuilder, 0.0f, 0.0f, 0.0f, 0.0f, i, 0, 0, 0);
    }

    private void setImportantForAutofill(UDV udv, int i) {
        udv.setImportantForAutofill(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void setPadding(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        updateState((UDV) view, sks, interfaceC65225TgH);
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(UDV udv, int i, ReadableArray readableArray) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    str = "setTextAndSelection";
                } else {
                    return;
                }
            } else {
                str = "blur";
            }
        } else {
            str = "focus";
        }
        receiveCommand(udv, str, readableArray);
    }
}
