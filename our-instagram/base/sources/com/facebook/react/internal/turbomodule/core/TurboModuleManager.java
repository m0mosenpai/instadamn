package com.facebook.react.internal.turbomodule.core;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C00O;
import X.InterfaceC65622ToD;
import X.InterfaceC65656Tqi;
import X.InterfaceC65657Tqj;
import X.TXY;
import X.Y3M;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class TurboModuleManager {
    public final HybridData mHybridData;

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, NativeMethodCallInvokerHolderImpl nativeMethodCallInvokerHolderImpl, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings(boolean z);

    static {
        Y3M.A00();
    }

    private CxxModuleWrapper getLegacyCxxModule(String str) {
        throw C00O.createAndThrow();
    }

    private NativeModule getLegacyJavaModule(String str) {
        throw C00O.createAndThrow();
    }

    public static List getMethodDescriptorsFromModule(NativeModule nativeModule) {
        String A0E;
        final String str;
        String A0E2;
        Class<?> cls = nativeModule.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList A1E = AbstractC166987dD.A1E();
        HashSet A1H = AbstractC166987dD.A1H();
        for (Method method : declaredMethods) {
            Annotation annotation = method.getAnnotation(ReactMethod.class);
            String name = nativeModule.getName();
            final String name2 = method.getName();
            if (annotation != null || "getConstants".equals(name2)) {
                if (!A1H.contains(name2)) {
                    A1H.add(name2);
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    StringBuilder A0s = AbstractC58318PtA.A0s("(");
                    final int length = parameterTypes.length;
                    for (Class<?> cls2 : parameterTypes) {
                        if (cls2 == Boolean.TYPE) {
                            A0E2 = "Z";
                        } else if (cls2 == Integer.TYPE) {
                            A0E2 = "I";
                        } else if (cls2 == Double.TYPE) {
                            A0E2 = "D";
                        } else if (cls2 == Float.TYPE) {
                            A0E2 = "F";
                        } else {
                            if (cls2 != Boolean.class && cls2 != Integer.class && cls2 != Double.class && cls2 != Float.class && cls2 != String.class && cls2 != Callback.class && cls2 != InterfaceC65622ToD.class && cls2 != ReadableMap.class && cls2 != ReadableArray.class && cls2 != Dynamic.class) {
                                throw new TXY(name, name2, AnonymousClass001.A0R("Unable to parse JNI signature. Detected unsupported parameter class: ", cls2.getCanonicalName()));
                            }
                            A0E2 = AnonymousClass001.A0E(cls2.getCanonicalName().replace('.', '/'), 'L', ';');
                        }
                        A0s.append(A0E2);
                    }
                    A0s.append(")");
                    if (returnType == Boolean.TYPE) {
                        A0E = "Z";
                    } else if (returnType == Integer.TYPE) {
                        A0E = "I";
                    } else if (returnType == Double.TYPE) {
                        A0E = "D";
                    } else if (returnType == Float.TYPE) {
                        A0E = "F";
                    } else if (returnType == Void.TYPE) {
                        A0E = "V";
                    } else {
                        if (returnType != Boolean.class && returnType != Integer.class && returnType != Double.class && returnType != Float.class && returnType != String.class && returnType != InterfaceC65657Tqj.class && returnType != InterfaceC65656Tqi.class && returnType != Map.class) {
                            throw new TXY(name, name2, AnonymousClass001.A0R("Unable to parse JNI signature. Detected unsupported return class: ", returnType.getCanonicalName()));
                        }
                        A0E = AnonymousClass001.A0E(returnType.getCanonicalName().replace('.', '/'), 'L', ';');
                    }
                    final String A0x = AbstractC166997dE.A0x(A0E, A0s);
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (parameterTypes[i] == InterfaceC65622ToD.class) {
                                if (i == length - 1) {
                                    str = "PromiseKind";
                                } else {
                                    throw new TXY(name, name2, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
                                }
                            } else {
                                i++;
                            }
                        } else if (returnType != Boolean.TYPE && returnType != Boolean.class) {
                            if (returnType != Double.TYPE && returnType != Double.class && returnType != Float.TYPE && returnType != Float.class && returnType != Integer.TYPE && returnType != Integer.class) {
                                if (returnType == String.class) {
                                    str = "StringKind";
                                } else if (returnType == Void.TYPE) {
                                    str = "VoidKind";
                                } else if (returnType != InterfaceC65657Tqj.class && returnType != Map.class) {
                                    if (returnType == InterfaceC65656Tqi.class) {
                                        str = "ArrayKind";
                                    } else {
                                        throw new TXY(name, name2, AnonymousClass001.A0R("Unable to parse JSI return kind. Detected unsupported return class: ", returnType.getCanonicalName()));
                                    }
                                } else {
                                    str = "ObjectKind";
                                }
                            } else {
                                str = "NumberKind";
                            }
                        } else {
                            str = "BooleanKind";
                        }
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (parameterTypes[i2] == InterfaceC65622ToD.class) {
                            length--;
                            if (i2 != length) {
                                throw new TXY(name, name2, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
                            }
                        } else {
                            i2++;
                        }
                    }
                    A1E.add(new Object(name2, A0x, str, length) { // from class: com.facebook.react.internal.turbomodule.core.TurboModuleInteropUtils$MethodDescriptor
                        public final String jniSignature;
                        public final int jsArgCount;
                        public final String jsiReturnKind;
                        public final String methodName;

                        {
                            this.methodName = name2;
                            this.jniSignature = A0x;
                            this.jsiReturnKind = str;
                            this.jsArgCount = length;
                        }
                    });
                } else {
                    throw new RuntimeException(AnonymousClass001.A0u("Unable to parse @ReactMethod annotations from native module: ", name, ". Details: ", AnonymousClass001.A0R("Module exports two methods to JavaScript with the same name: \"", name2)));
                }
            }
        }
        return A1E;
    }

    private TurboModule getTurboJavaModule(String str) {
        throw C00O.createAndThrow();
    }

    private CxxModuleWrapper getTurboLegacyCxxModule(String str) {
        throw C00O.createAndThrow();
    }
}
