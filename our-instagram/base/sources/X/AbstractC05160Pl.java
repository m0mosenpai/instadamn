package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.0Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05160Pl {
    public static final C003701c A00;
    public static final C0MA A01;

    static {
        C0MA c0ma;
        if (Build.VERSION.SDK_INT >= 29) {
            c0ma = new C0MA() { // from class: X.0Pk
                @Override // X.C0MA
                public final Typeface A01(Context context, Resources resources, C72659Xka c72659Xka, int i) {
                    try {
                        FontFamily.Builder builder = null;
                        for (C72795XnI c72795XnI : c72659Xka.A00) {
                            try {
                                Font.Builder weight = new Font.Builder(resources, c72795XnI.A00).setWeight(c72795XnI.A02);
                                int i2 = 0;
                                if (c72795XnI.A05) {
                                    i2 = 1;
                                }
                                Font build = weight.setSlant(i2).setTtcIndex(c72795XnI.A01).setFontVariationSettings(c72795XnI.A04).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(build);
                                } else {
                                    builder.addFont(build);
                                }
                            } catch (IOException unused) {
                            }
                        }
                        if (builder == null) {
                            return null;
                        }
                        FontFamily build2 = builder.build();
                        return new Typeface.CustomFallbackBuilder(build2).setStyle(A00(build2, i).getStyle()).build();
                    } catch (Exception unused2) {
                        return null;
                    }
                }

                @Override // X.C0MA
                public final Typeface A03(Context context, CancellationSignal cancellationSignal, C54162eO[] c54162eOArr, int i) {
                    ContentResolver contentResolver = context.getContentResolver();
                    try {
                        FontFamily.Builder builder = null;
                        for (C54162eO c54162eO : c54162eOArr) {
                            try {
                                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(c54162eO.A03, "r", null);
                                if (openFileDescriptor != null) {
                                    try {
                                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c54162eO.A02);
                                        int i2 = 0;
                                        if (c54162eO.A04) {
                                            i2 = 1;
                                        }
                                        Font build = weight.setSlant(i2).setTtcIndex(c54162eO.A01).build();
                                        if (builder == null) {
                                            builder = new FontFamily.Builder(build);
                                        } else {
                                            builder.addFont(build);
                                        }
                                        openFileDescriptor.close();
                                    } catch (Throwable th) {
                                        try {
                                            openFileDescriptor.close();
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        }
                                        throw th;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (IOException unused) {
                            }
                        }
                        if (builder == null) {
                            return null;
                        }
                        FontFamily build2 = builder.build();
                        return new Typeface.CustomFallbackBuilder(build2).setStyle(A00(build2, i).getStyle()).build();
                    } catch (Exception unused2) {
                        return null;
                    }
                }

                public static Font A00(FontFamily fontFamily, int i) {
                    int i2 = i & 1;
                    int i3 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                    if (i2 != 0) {
                        i3 = 700;
                    }
                    int i4 = 0;
                    if ((i & 2) != 0) {
                        i4 = 1;
                    }
                    FontStyle fontStyle = new FontStyle(i3, i4);
                    Font font = fontFamily.getFont(0);
                    FontStyle style = font.getStyle();
                    int abs = Math.abs(fontStyle.getWeight() - style.getWeight()) / 100;
                    int i5 = 2;
                    if (fontStyle.getSlant() == style.getSlant()) {
                        i5 = 0;
                    }
                    int i6 = abs + i5;
                    for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
                        Font font2 = fontFamily.getFont(i7);
                        FontStyle style2 = font2.getStyle();
                        int abs2 = Math.abs(fontStyle.getWeight() - style2.getWeight()) / 100;
                        int i8 = 2;
                        if (fontStyle.getSlant() == style2.getSlant()) {
                            i8 = 0;
                        }
                        int i9 = abs2 + i8;
                        if (i9 < i6) {
                            font = font2;
                            i6 = i9;
                        }
                    }
                    return font;
                }

                @Override // X.C0MA
                public final Typeface A02(Context context, Resources resources, String str, int i, int i2) {
                    try {
                        Font build = new Font.Builder(resources, i).build();
                        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // X.C0MA
                public final C54162eO A04(C54162eO[] c54162eOArr, int i) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }
            };
        } else {
            c0ma = new AbstractC106634rL() { // from class: X.4rK
                public final Class A00;
                public final Constructor A01;
                public final Method A02;
                public final Method A03;
                public final Method A04;
                public final Method A05;
                public final Method A06;

                @Override // X.C0MA
                public final Typeface A03(Context context, CancellationSignal cancellationSignal, C54162eO[] c54162eOArr, int i) {
                    Object obj;
                    Object obj2;
                    boolean z;
                    Typeface A05;
                    boolean z2;
                    int length = c54162eOArr.length;
                    if (length >= 1) {
                        Method method = this.A04;
                        if (method == null) {
                            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                        }
                        boolean z3 = false;
                        if (method != null) {
                            z3 = true;
                        }
                        if (!z3) {
                            C54162eO A04 = A04(c54162eOArr, i);
                            try {
                                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A04.A03, "r", null);
                                if (openFileDescriptor != null) {
                                    try {
                                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A04.A02).setItalic(A04.A04).build();
                                        openFileDescriptor.close();
                                        return build;
                                    } finally {
                                    }
                                }
                            } catch (IOException | IllegalAccessException | InvocationTargetException unused) {
                            }
                        } else {
                            HashMap hashMap = new HashMap();
                            for (C54162eO c54162eO : c54162eOArr) {
                                if (c54162eO.A00 == 0) {
                                    android.net.Uri uri = c54162eO.A03;
                                    if (!hashMap.containsKey(uri)) {
                                        hashMap.put(uri, AbstractC15460q1.A01(context, uri));
                                    }
                                }
                            }
                            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                            try {
                                obj = this.A01.newInstance(new Object[0]);
                                obj2 = obj;
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                                obj = null;
                                obj2 = null;
                            }
                            if (obj != null) {
                                boolean z4 = false;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        C54162eO c54162eO2 = c54162eOArr[i2];
                                        Object obj3 = unmodifiableMap.get(c54162eO2.A03);
                                        if (obj3 != null) {
                                            try {
                                                z2 = ((Boolean) this.A05.invoke(obj2, obj3, Integer.valueOf(c54162eO2.A01), null, Integer.valueOf(c54162eO2.A02), Integer.valueOf(c54162eO2.A04 ? 1 : 0))).booleanValue();
                                            } catch (IllegalAccessException | InvocationTargetException unused3) {
                                                z2 = false;
                                            }
                                            if (!z2) {
                                                break;
                                            }
                                            z4 = true;
                                        }
                                        i2++;
                                    } else if (z4) {
                                        try {
                                            z = ((Boolean) this.A06.invoke(obj2, new Object[0])).booleanValue();
                                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                                            z = false;
                                        }
                                        if (z && (A05 = A05(obj2)) != null) {
                                            return Typeface.create(A05, i);
                                        }
                                    }
                                }
                                this.A03.invoke(obj2, new Object[0]);
                            }
                        }
                    }
                    return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    Method method;
                    Constructor constructor;
                    Method method2;
                    Method method3;
                    Method method4;
                    Method method5;
                    Class cls = null;
                    try {
                        Class<?> cls2 = Class.forName("android.graphics.FontFamily");
                        Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
                        Class cls3 = Integer.TYPE;
                        method2 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
                        method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
                        method4 = cls2.getMethod("freeze", new Class[0]);
                        method5 = cls2.getMethod("abortCreation", new Class[0]);
                        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass(), String.class, cls3, cls3);
                        declaredMethod.setAccessible(true);
                        cls = cls2;
                        method = declaredMethod;
                        constructor = constructor2;
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
                        android.util.Log.e("TypefaceCompatApi26Impl", AnonymousClass001.A0R("Unable to collect necessary methods for class ", e.getClass().getName()), e);
                        method = cls;
                        constructor = cls;
                        method2 = cls;
                        method3 = cls;
                        method4 = cls;
                        method5 = cls;
                    }
                    this.A00 = cls;
                    this.A01 = constructor;
                    this.A04 = method2;
                    this.A05 = method3;
                    this.A06 = method4;
                    this.A03 = method5;
                    this.A02 = method;
                }

                @Override // X.AbstractC106634rL, X.C0MA
                public final Typeface A01(Context context, Resources resources, C72659Xka c72659Xka, int i) {
                    Object obj;
                    boolean z;
                    boolean z2;
                    Method method = this.A04;
                    if (method == null) {
                        android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                    }
                    boolean z3 = false;
                    if (method != null) {
                        z3 = true;
                    }
                    if (!z3) {
                        return super.A01(context, resources, c72659Xka, i);
                    }
                    try {
                        obj = this.A01.newInstance(new Object[0]);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        C72795XnI[] c72795XnIArr = c72659Xka.A00;
                        int length = c72795XnIArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                C72795XnI c72795XnI = c72795XnIArr[i2];
                                String str = c72795XnI.A03;
                                int i3 = c72795XnI.A01;
                                int i4 = c72795XnI.A02;
                                boolean z4 = c72795XnI.A05;
                                try {
                                    z2 = ((Boolean) method.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(z4 ? 1 : 0), FontVariationAxis.fromFontVariationSettings(c72795XnI.A04))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    z2 = false;
                                }
                                if (z2) {
                                    i2++;
                                } else {
                                    try {
                                        this.A03.invoke(obj, new Object[0]);
                                        break;
                                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    }
                                }
                            } else {
                                try {
                                    z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    z = false;
                                }
                                if (z) {
                                    return A05(obj);
                                }
                            }
                        }
                    }
                    return null;
                }

                @Override // X.C0MA
                public final Typeface A02(Context context, Resources resources, String str, int i, int i2) {
                    Object obj;
                    boolean z;
                    boolean z2;
                    Method method = this.A04;
                    if (method == null) {
                        android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                    }
                    boolean z3 = false;
                    if (method != null) {
                        z3 = true;
                    }
                    if (!z3) {
                        return super.A02(context, resources, str, i, i2);
                    }
                    try {
                        obj = this.A01.newInstance(new Object[0]);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj == null) {
                        return null;
                    }
                    try {
                        z = ((Boolean) method.invoke(obj, context.getAssets(), str, 0, false, 0, -1, -1, null)).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            this.A03.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            return null;
                        }
                    }
                    try {
                        z2 = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z2 = false;
                    }
                    if (!z2) {
                        return null;
                    }
                    return A05(obj);
                }

                public final Typeface A05(Object obj) {
                    try {
                        Object newInstance = Array.newInstance((Class<?>) this.A00, 1);
                        Array.set(newInstance, 0, obj);
                        return (Typeface) this.A02.invoke(null, newInstance, "sans-serif", -1, -1);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        }
        A01 = c0ma;
        A00 = new C003701c(16);
    }

    public static String A00(Resources resources, String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i3);
        return sb.toString();
    }
}
