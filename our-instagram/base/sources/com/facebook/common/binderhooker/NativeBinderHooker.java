package com.facebook.common.binderhooker;

import X.C03720In;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class NativeBinderHooker {
    public static final Field FIELD_Parcel_mNativePtr;
    public static final C03720In ML;
    public static final boolean PLATFORM_SUPPORTED;

    public static long fromNativeWriteBinderToParcelAndReturnParcelPtr(Object obj) {
        String str;
        Object[] objArr = new Object[1];
        if (obj != null) {
            str = obj.toString();
        } else {
            str = "<null binder>";
        }
        objArr[0] = str;
        try {
            Parcel obtain = Parcel.obtain();
            obtain.setDataPosition(0);
            obtain.writeStrongBinder((IBinder) obj);
            obtain.setDataPosition(0);
            return getParcelNativePtr(obtain);
        } catch (ClassCastException | IllegalAccessException e) {
            ML.A0C(e, "Failed to write binder to parcel and return", new Object[0]);
            return -1L;
        }
    }

    public static native int nativeCallOriginalBinderOnTransact(long j, int i, long j2, long j3, int i2);

    public static native long nativeHookBinder(Object obj, Object obj2);

    public static native boolean nativeSetupBinderHooker();

    public static native boolean nativeUnhookBinder(long j);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "NativeBinderHooker"
            X.0In r2 = new X.0In
            r2.<init>(r0)
            com.facebook.common.binderhooker.NativeBinderHooker.ML = r2
            boolean r0 = X.AbstractC03320Dr.A00
            r5 = 1
            if (r0 == 0) goto L1e
            java.lang.String r0 = "binderhookerjni"
            X.C09170dP.A0C(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L15
            r4 = 1
            goto L2e
        L15:
            r2 = move-exception
            X.0In r1 = com.facebook.common.binderhooker.NativeBinderHooker.ML
            java.lang.String r0 = "Can't load Binder hooker lib"
            r1.A04(r0, r2)
            goto L2d
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Binder hooking is not currently supported on Android %d."
            r2.A08(r0, r1)
        L2d:
            r4 = 0
        L2e:
            r3 = 0
            if (r4 == 0) goto L49
            java.lang.Class<android.os.Parcel> r1 = android.os.Parcel.class
            java.lang.String r0 = "mNativePtr"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L3f
            r0.setAccessible(r5)     // Catch: java.lang.NoSuchFieldException -> L3f
            r3 = r0
            goto L48
        L3f:
            r2 = move-exception
            X.0In r1 = com.facebook.common.binderhooker.NativeBinderHooker.ML
            java.lang.String r0 = "Can't find Parcel mNativePtr"
            r1.A04(r0, r2)
            r5 = 0
        L48:
            r4 = r4 & r5
        L49:
            com.facebook.common.binderhooker.NativeBinderHooker.FIELD_Parcel_mNativePtr = r3
            com.facebook.common.binderhooker.NativeBinderHooker.PLATFORM_SUPPORTED = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.binderhooker.NativeBinderHooker.<clinit>():void");
    }

    public static long getParcelNativePtr(Parcel parcel) {
        Field field = FIELD_Parcel_mNativePtr;
        if (field != null) {
            if (parcel == null) {
                return 0L;
            }
            return field.getLong(parcel);
        }
        throw new IllegalAccessException();
    }
}
