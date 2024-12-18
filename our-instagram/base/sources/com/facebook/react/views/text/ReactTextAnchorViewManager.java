package com.facebook.react.views.text;

import X.AbstractC65702TsY;
import X.C05F;
import X.C14360o3;
import X.C63011Saa;
import X.C63403SjY;
import X.C66365UDi;
import X.C69829VwF;
import X.EnumC61190Rgq;
import X.VDC;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

/* loaded from: classes11.dex */
public abstract class ReactTextAnchorViewManager extends BaseViewManager {
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    public static final String TAG = "ReactTextAnchorViewManager";

    public ReactTextAnchorViewManager() {
        super(null);
    }

    @ReactProp(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(C66365UDi c66365UDi, String str) {
        int i = 0;
        if (str != null && !str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            if (str.equals("full")) {
                i = 2;
            } else if (str.equals("normal")) {
                i = 1;
            } else {
                AbstractC65702TsY.A1U("Invalid android_hyphenationFrequency: ", str);
            }
        }
        c66365UDi.setHyphenationFrequency(i);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(C66365UDi c66365UDi, String str) {
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
        c66365UDi.setGravityVertical(i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C66365UDi c66365UDi, int i, Integer num) {
        C63403SjY.A0A(c66365UDi, EnumC61190Rgq.A02, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(C66365UDi c66365UDi, String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(c66365UDi, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r0 != false) goto L6;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "dataDetectorType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDataDetectorType(X.C66365UDi r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L9
            int r0 = r4.hashCode()
            switch(r0) {
                case -1192969641: goto L26;
                case 96673: goto L1d;
                case 3321850: goto L15;
                case 96619420: goto Ld;
                default: goto L9;
            }
        L9:
            r1 = 0
        La:
            r3.A00 = r1
            return
        Ld:
            java.lang.String r0 = "email"
            boolean r0 = r4.equals(r0)
            r1 = 2
            goto L2d
        L15:
            java.lang.String r0 = "link"
            boolean r0 = r4.equals(r0)
            r1 = 1
            goto L2d
        L1d:
            java.lang.String r0 = "all"
            boolean r0 = r4.equals(r0)
            r1 = 15
            goto L2d
        L26:
            java.lang.String r0 = "phoneNumber"
            boolean r0 = r4.equals(r0)
            r1 = 4
        L2d:
            if (r0 != 0) goto La
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setDataDetectorType(X.UDi, java.lang.String):void");
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(C66365UDi c66365UDi, boolean z) {
        c66365UDi.setEnabled(!z);
    }

    @ReactProp(name = "ellipsizeMode")
    public void setEllipsizeMode(C66365UDi c66365UDi, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str != null && !str.equals("tail")) {
            if (str.equals("head")) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (str.equals("middle")) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (str.equals("clip")) {
                truncateAt = null;
            } else {
                AbstractC65702TsY.A1U("Invalid ellipsizeMode: ", str);
                truncateAt = TextUtils.TruncateAt.END;
            }
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        c66365UDi.A03 = truncateAt;
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C66365UDi c66365UDi, Integer num) {
        int intValue;
        if (num == null) {
            Context context = c66365UDi.getContext();
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
        c66365UDi.setHighlightColor(intValue);
    }

    @ReactProp(name = "accessible")
    public void setAccessible(C66365UDi c66365UDi, boolean z) {
        c66365UDi.setFocusable(z);
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(C66365UDi c66365UDi, boolean z) {
        c66365UDi.A05 = z;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C66365UDi c66365UDi, int i, float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, f);
        }
        C63403SjY.A08(c66365UDi, c63011Saa, VDC.values()[i]);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(C66365UDi c66365UDi, int i, float f) {
        C63403SjY.A09(c66365UDi, EnumC61190Rgq.values()[i], Float.valueOf(f));
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(C66365UDi c66365UDi, ReadableArray readableArray) {
        C63403SjY.A07(c66365UDi, readableArray);
    }

    @ReactProp(name = "fontSize")
    public void setFontSize(C66365UDi c66365UDi, float f) {
        c66365UDi.setFontSize(f);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C66365UDi c66365UDi, boolean z) {
        c66365UDi.setIncludeFontPadding(z);
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C66365UDi c66365UDi, float f) {
        c66365UDi.setLetterSpacing(f);
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(C66365UDi c66365UDi, boolean z) {
        c66365UDi.A06 = z;
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(C66365UDi c66365UDi, int i) {
        c66365UDi.setNumberOfLines(i);
    }

    @ReactProp(name = "selectable")
    public void setSelectable(C66365UDi c66365UDi, boolean z) {
        c66365UDi.setTextIsSelectable(z);
    }
}
