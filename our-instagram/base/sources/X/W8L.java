package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes11.dex */
public final class W8L {
    public static final TypedValue A00 = new TypedValue();

    public static Drawable A00(Context context, ReadableMap readableMap) {
        int color;
        ColorDrawable colorDrawable;
        Drawable rippleDrawable;
        String str;
        boolean hasKey;
        int identifier;
        String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            if (string2 != null) {
                if ("selectableItemBackground".equals(string2)) {
                    identifier = R.attr.selectableItemBackground;
                } else if ("selectableItemBackgroundBorderless".equals(string2)) {
                    identifier = R.attr.selectableItemBackgroundBorderless;
                } else {
                    identifier = context.getResources().getIdentifier(string2, "attr", "android");
                }
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = A00;
                if (theme.resolveAttribute(identifier, typedValue, true)) {
                    rippleDrawable = context.getResources().getDrawable(typedValue.resourceId, context.getTheme());
                    str = "rippleRadius";
                    if (readableMap.hasKey("rippleRadius")) {
                        hasKey = rippleDrawable instanceof RippleDrawable;
                    }
                    return rippleDrawable;
                }
                throw new RuntimeException(AnonymousClass001.A09(identifier, "Attribute ", string2, " with id ", " couldn't be resolved into a drawable"));
            }
            throw new RuntimeException("JS description missing 'attribute' field");
        }
        if ("RippleAndroid".equals(string)) {
            if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                color = readableMap.getInt("color");
            } else {
                Resources.Theme theme2 = context.getTheme();
                TypedValue typedValue2 = A00;
                if (theme2.resolveAttribute(R.attr.colorControlHighlight, typedValue2, true)) {
                    color = context.getResources().getColor(typedValue2.resourceId);
                } else {
                    throw new RuntimeException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
            }
            if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) {
                colorDrawable = null;
            } else {
                colorDrawable = new ColorDrawable(-1);
            }
            rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, colorDrawable);
            str = "rippleRadius";
            hasKey = readableMap.hasKey("rippleRadius");
        } else {
            throw new RuntimeException(AnonymousClass001.A0R("Invalid type for android drawable: ", string));
        }
        if (hasKey) {
            ((RippleDrawable) rippleDrawable).setRadius((int) WF1.A01((float) readableMap.getDouble(str)));
        }
        return rippleDrawable;
    }
}
