package com.facebook.dalvikdistract;

import X.C09170dP;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class DalvikDistract {
    public final ArrayList mTransaction = new ArrayList();

    /* loaded from: classes.dex */
    public final class GenericCall {
        public static Object[] gcSave;

        public static native boolean getBoolean(int i, int i2);

        public static native byte getByte(int i, int i2);

        public static native char getChar(int i, int i2);

        public static native double getDouble(int i, int i2);

        public static native float getFloat(int i, int i2);

        public static native int getInt(int i, int i2);

        public static native long getLong(int i, int i2);

        public static native Object getObject(int i, int i2);

        public static native short getShort(int i, int i2);

        public static native void invokeOriginal(int i);

        public static void saveReturnValue(int i, Object obj) {
            setObject(i, -1, obj);
        }

        public static native void setBoolean(int i, int i2, boolean z);

        public static native void setByte(int i, int i2, byte b);

        public static native void setChar(int i, int i2, char c);

        public static native void setDouble(int i, int i2, double d);

        public static native void setFloat(int i, int i2, float f);

        public static native void setInt(int i, int i2, int i3);

        public static native void setLong(int i, int i2, long j);

        public static native void setObject(int i, int i2, Object obj);

        public static native void setShort(int i, int i2, short s);

        public static void enlargeGcSave() {
            Object[] objArr;
            Object[] objArr2 = gcSave;
            if (objArr2 != null) {
                objArr = Arrays.copyOf(objArr2, objArr2.length * 2);
            } else {
                objArr = new Object[16];
            }
            gcSave = objArr;
        }
    }

    /* loaded from: classes.dex */
    public interface GenericCallHandler {
        void handleCall(Object obj, int i);
    }

    /* loaded from: classes.dex */
    public final class Unsafe {
        public final Object wrapped;

        public Unsafe(Object obj) {
            this.wrapped = obj;
        }
    }

    public static native void nativeCleanupMm(int i);

    public static native synchronized void nativeCommit(Object[] objArr);

    static {
        C09170dP.A0C("c++_shared");
        C09170dP.A0C("sigmux");
        C09170dP.A0C("distract");
        C09170dP.A0C("dalvikdistract");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[LOOP:0: B:13:0x002c->B:14:0x002e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class[] extractSignature(java.lang.Object r8) {
        /*
            boolean r0 = r8 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L38
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class r7 = r8.getReturnType()
            int r0 = r8.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L3c
            r1 = 0
        L15:
            java.lang.Class[] r6 = r8.getParameterTypes()
            r5 = 0
            r4 = 1
            r0 = 1
            if (r1 != 0) goto L1f
            r0 = 0
        L1f:
            int r0 = r0 + 1
            int r3 = r6.length
            int r0 = r0 + r3
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r2[r5] = r7
            if (r1 == 0) goto L2c
            r2[r4] = r1
            r4 = 2
        L2c:
            if (r5 >= r3) goto L41
            int r1 = r4 + 1
            r0 = r6[r5]
            r2[r4] = r0
            int r5 = r5 + 1
            r4 = r1
            goto L2c
        L38:
            java.lang.reflect.Executable r8 = (java.lang.reflect.Executable) r8
            java.lang.Class r7 = java.lang.Void.TYPE
        L3c:
            java.lang.Class r1 = r8.getDeclaringClass()
            goto L15
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dalvikdistract.DalvikDistract.extractSignature(java.lang.Object):java.lang.Class[]");
    }

    public static Unsafe unsafe(Object obj) {
        return new Unsafe(obj);
    }

    public DalvikDistract hook(Object obj, Object obj2) {
        boolean z;
        boolean z2 = true;
        if (obj instanceof Unsafe) {
            obj = ((Unsafe) obj).wrapped;
            z = true;
        } else {
            z = false;
        }
        if (obj2 instanceof Unsafe) {
            obj2 = ((Unsafe) obj2).wrapped;
        } else {
            z2 = z;
        }
        if (obj2 instanceof GenericCallHandler) {
            if (obj == null || (!(obj instanceof Constructor) && !(obj instanceof Method))) {
                throw new IllegalArgumentException("can hook only methods or constructors");
            }
        } else {
            checkSignatureCompatibility(obj, obj2, z2);
        }
        ArrayList arrayList = this.mTransaction;
        arrayList.add(obj);
        arrayList.add(obj2);
        return this;
    }

    public DalvikDistract unhook(Constructor constructor) {
        ArrayList arrayList = this.mTransaction;
        arrayList.add(constructor);
        arrayList.add(null);
        return this;
    }

    public static void checkSignatureCompatibility(Object obj, Object obj2, boolean z) {
        Class<?>[] extractSignature = extractSignature(obj);
        Class[] extractSignature2 = extractSignature(obj2);
        Class cls = extractSignature[0];
        extractSignature[0] = extractSignature2[0];
        extractSignature2[0] = cls;
        int length = extractSignature2.length;
        int length2 = extractSignature.length;
        if (length <= length2) {
            for (int i = 0; i < length; i++) {
                if (!extractSignature2[i].isAssignableFrom(extractSignature[i]) && (!z || extractSignature[i] != Object.class || extractSignature2[i].isPrimitive())) {
                    throw new RuntimeException(String.format("%s cannot substitute for %s", extractSignature[i], extractSignature2[i]));
                }
            }
            return;
        }
        throw new RuntimeException(String.format("Argument length mismatch: hook may not accept more arguments than the original method.  Hook (%s) accepts %s arguments; original (%s) accepts %s", obj2, Integer.valueOf(length - 1), obj, Integer.valueOf(length2 - 1)));
    }

    public void commit() {
        String property = System.getProperty("java.vm.version");
        if (property != null && !property.startsWith("0.") && !property.startsWith("1.")) {
            throw new UnsupportedOperationException("DalvikDistract does not yet support ART");
        }
        nativeCommit(this.mTransaction.toArray());
        this.mTransaction.clear();
    }

    /* loaded from: classes.dex */
    public class IncompatibleSignatureError extends RuntimeException {
        public IncompatibleSignatureError(String str) {
            super(str);
        }
    }

    public static Object cleanupMm(int i, Object obj) {
        nativeCleanupMm(i);
        return obj;
    }

    public DalvikDistract hook(Object obj, Object obj2, Object obj3) {
        hook(obj, obj2);
        hook(obj3, obj);
        return this;
    }

    public DalvikDistract unhook(Method method) {
        ArrayList arrayList = this.mTransaction;
        arrayList.add(method);
        arrayList.add(null);
        return this;
    }
}
