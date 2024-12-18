package com.facebook.common.hiddenapis2;

import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodType;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public interface Structs {

    /* loaded from: classes.dex */
    public class AccessibleObject {
        public boolean override;
    }

    /* loaded from: classes.dex */
    public final class Class {
        public transient int accessFlags;
        public transient int classFlags;
        public transient ClassLoader classLoader;
        public transient int classSize;
        public transient int clinitThreadId;
        public transient java.lang.Class componentType;
        public transient short copiedMethodsOffset;
        public transient Object dexCache;
        public transient int dexClassDefIndex;
        public volatile transient int dexTypeIndex;
        public transient Object extData;
        public transient long iFields;
        public transient Object[] ifTable;
        public transient long methods;
        public transient String name;
        public transient int numReferenceInstanceFields;
        public transient int numReferenceStaticFields;
        public transient int objectSize;
        public transient int objectSizeAllocFastPath;
        public transient int primitiveType;
        public transient int referenceInstanceOffsets;
        public transient long sFields;
        public transient int status;
        public transient java.lang.Class superClass;
        public transient short virtualMethodsOffset;
        public transient Object vtable;
    }

    /* loaded from: classes.dex */
    public final class Executable extends AccessibleObject {
        public int accessFlags;
        public long artMethod;
        public Class declaringClass;
        public Class declaringClassOfOverriddenMethod;
        public Object[] parameters;
    }

    /* loaded from: classes.dex */
    public final class HandleInfo {
        public final Member member = null;
        public final MethodHandle handle = null;
    }

    /* loaded from: classes.dex */
    public class InvokeStub {
        public static Object invoke(Object... objArr) {
            throw new IllegalStateException("This is a stub, can not call invoke");
        }

        public InvokeStub(Object... objArr) {
            throw new IllegalStateException("This is a stub, can not call ctor");
        }
    }

    /* loaded from: classes.dex */
    public class MethodHandle {
        public MethodHandle cachedSpreadInvoker;
        public MethodType nominalType;
        public final MethodType type = null;
        public final int handleKind = 0;
        public final long artFieldOrMethod = 0;
    }

    /* loaded from: classes.dex */
    public final class MethodHandleImpl extends MethodHandle {
        public final MethodHandleInfo info = null;
    }

    /* loaded from: classes.dex */
    public class Stub {
        public static int S;
        public static int T;
        public int a;
        public int b;

        public static void f1() {
        }

        public static void f2() {
        }
    }
}
