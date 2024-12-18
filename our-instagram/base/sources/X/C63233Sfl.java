package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.util.TypedValue;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.Sfl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63233Sfl {
    public static Integer A02(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            boolean startsWith = str.startsWith("@");
            boolean startsWith2 = str.startsWith("?");
            String substring = str.substring(1);
            try {
                if (startsWith) {
                    String[] split = substring.split(":");
                    String packageName = context.getPackageName();
                    if (split.length > 1) {
                        packageName = split[0];
                        substring = split[1];
                    }
                    String[] split2 = substring.split("/");
                    String str2 = split2[0];
                    return Integer.valueOf(context.getResources().getColor(context.getResources().getIdentifier(split2[1], str2, packageName), context.getTheme()));
                }
                if (startsWith2) {
                    String replaceAll = substring.replaceAll("attr/", "");
                    String[] split3 = replaceAll.split(":");
                    String packageName2 = context.getPackageName();
                    if (split3.length > 1) {
                        packageName2 = split3[0];
                        replaceAll = split3[1];
                    }
                    int identifier = context.getResources().getIdentifier(replaceAll, "attr", packageName2);
                    if (identifier == 0) {
                        identifier = context.getResources().getIdentifier(replaceAll, "attr", "android");
                    }
                    TypedValue typedValue = new TypedValue();
                    if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
                        return Integer.valueOf(typedValue.data);
                    }
                    throw new Resources.NotFoundException();
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static Integer A00(Context context, Object obj) {
        int intValue;
        ColorSpace.Named named;
        Color valueOf;
        int argb;
        if (obj == null) {
            valueOf = null;
        } else {
            try {
                if (obj instanceof Double) {
                    intValue = AbstractC166987dD.A0H(obj);
                } else if (context != null) {
                    if (obj instanceof ReadableMap) {
                        ReadableMap readableMap = (ReadableMap) obj;
                        if (readableMap.hasKey("space")) {
                            String string = readableMap.getString("space");
                            if (string != null && string.equals("display-p3")) {
                                named = ColorSpace.Named.DISPLAY_P3;
                            } else {
                                named = ColorSpace.Named.SRGB;
                            }
                            valueOf = Color.valueOf(Color.pack((float) readableMap.getDouble("r"), (float) readableMap.getDouble("g"), (float) readableMap.getDouble("b"), (float) readableMap.getDouble("a"), ColorSpace.get(named)));
                        } else {
                            ReadableArray array = readableMap.getArray("resource_paths");
                            if (array != null) {
                                for (int i = 0; i < array.size(); i++) {
                                    Integer A02 = A02(context, array.getString(i));
                                    if (A02 != null) {
                                        intValue = A02.intValue();
                                    }
                                }
                                throw new RuntimeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
                            }
                            throw new RuntimeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
                        }
                    } else {
                        throw new RuntimeException("ColorValue: the value must be a number or Object.");
                    }
                } else {
                    throw AbstractC166987dD.A18("Context may not be null.");
                }
                valueOf = Color.valueOf(intValue);
            } catch (TXV e) {
                Object[] A1b = AbstractC58318PtA.A1b();
                C0I3 c0i3 = C0I2.A00;
                if (c0i3.isLoggable(5)) {
                    c0i3.w("ReactNative", AbstractC58318PtA.A0k("Error extracting color from WideGamut", A1b), e);
                }
            }
        }
        if (valueOf != null) {
            return Integer.valueOf(valueOf.toArgb());
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            argb = AbstractC166987dD.A0H(obj);
        } else if (context != null) {
            if (obj instanceof ReadableMap) {
                ReadableMap readableMap2 = (ReadableMap) obj;
                if (readableMap2.hasKey("space")) {
                    argb = Color.argb((int) (((float) readableMap2.getDouble("a")) * 255.0f), (int) (((float) readableMap2.getDouble("r")) * 255.0f), (int) (((float) readableMap2.getDouble("g")) * 255.0f), (int) (((float) readableMap2.getDouble("b")) * 255.0f));
                } else {
                    ReadableArray array2 = readableMap2.getArray("resource_paths");
                    if (array2 != null) {
                        for (int i2 = 0; i2 < array2.size(); i2++) {
                            Integer A022 = A02(context, array2.getString(i2));
                            if (A022 != null) {
                                return A022;
                            }
                        }
                        throw new RuntimeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
                    }
                    throw new RuntimeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
                }
            } else {
                throw new RuntimeException("ColorValue: the value must be a number or Object.");
            }
        } else {
            throw AbstractC166987dD.A18("Context may not be null.");
        }
        return Integer.valueOf(argb);
    }

    public static Integer A01(Context context, Object obj, int i) {
        try {
            return A00(context, obj);
        } catch (TXV e) {
            Object[] A1b = AbstractC58318PtA.A1b();
            C0I3 c0i3 = C0I2.A00;
            if (c0i3.isLoggable(5)) {
                c0i3.w("ReactNative", AbstractC58318PtA.A0k("Error converting ColorValue", A1b), e);
            }
            return Integer.valueOf(i);
        }
    }
}
