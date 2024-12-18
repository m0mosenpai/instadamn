package com.facebook.common.dextricks.classid;

import X.C09170dP;
import android.os.Build;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ClassId {
    public static Field javaLangClass_dexCache;
    public static Field javaLangClass_dexClassDefIndex;
    public static Method javaLangClass_getDexClassDefIndex;
    public static Field javaLangDexCache_dexFile;
    public static final ConcurrentHashMap sDexKeyToDexSignature;
    public static final boolean sInitialized;

    static {
        boolean z;
        boolean z2 = false;
        try {
            C09170dP.A0C("classid");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        sDexKeyToDexSignature = new ConcurrentHashMap(0, 0.9f);
        if (z) {
            synchronized (ClassId.class) {
                try {
                    Field declaredField = Class.class.getDeclaredField("dexClassDefIndex");
                    Field declaredField2 = Class.class.getDeclaredField("dexCache");
                    Class<?> cls = Class.forName("java.lang.DexCache");
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    javaLangClass_dexClassDefIndex = declaredField;
                    javaLangClass_dexCache = declaredField2;
                    Field declaredField3 = cls.getDeclaredField("dexFile");
                    declaredField3.setAccessible(true);
                    javaLangDexCache_dexFile = declaredField3;
                    getClassDef(ClassId.class);
                    if (getDexSignature(ClassId.class) == 0) {
                        throw new UnsupportedOperationException();
                    }
                } catch (Exception unused2) {
                }
            }
            z2 = true;
        }
        sInitialized = z2;
    }

    public static native int getSignatureFromDexFile_10_0_0(long j);

    public static native int getSignatureFromDexFile_11_0_0(long j);

    public static native int getSignatureFromDexFile_8_0_0(long j);

    public static native int getSignatureFromDexFile_8_1_0(long j);

    public static native int getSignatureFromDexFile_9_0_0(long j);

    public static int getClassDef(Class cls) {
        try {
            Field field = javaLangClass_dexClassDefIndex;
            if (field != null) {
                return ((Integer) field.get(cls)).intValue();
            }
            Method method = javaLangClass_getDexClassDefIndex;
            if (method != null) {
                return ((Integer) method.invoke(cls, new Object[0])).intValue();
            }
            throw new IllegalStateException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long getClassId(Class cls) {
        if (!sInitialized) {
            return -1L;
        }
        return (getDexSignature(cls) & 4294967295L) | (getClassDef(cls) << 32);
    }

    public static int getDexSignature(Class cls) {
        int signatureFromDexFile_9_0_0;
        try {
            if (javaLangDexCache_dexFile != null) {
                Object obj = javaLangClass_dexCache.get(cls);
                if (obj == null) {
                    return 0;
                }
                ConcurrentHashMap concurrentHashMap = sDexKeyToDexSignature;
                Number number = (Number) concurrentHashMap.get(obj);
                if (number == null) {
                    long j = javaLangDexCache_dexFile.getLong(obj);
                    switch (Build.VERSION.SDK_INT) {
                        case 28:
                            signatureFromDexFile_9_0_0 = getSignatureFromDexFile_9_0_0(j);
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                            signatureFromDexFile_9_0_0 = getSignatureFromDexFile_10_0_0(j);
                            break;
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            signatureFromDexFile_9_0_0 = getSignatureFromDexFile_11_0_0(j);
                            break;
                        default:
                            signatureFromDexFile_9_0_0 = 0;
                            break;
                    }
                    number = Integer.valueOf(signatureFromDexFile_9_0_0);
                    concurrentHashMap.put(obj, number);
                }
                return number.intValue();
            }
            throw new IllegalStateException();
        } catch (IOException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
