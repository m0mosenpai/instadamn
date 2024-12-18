package com.facebook.react.bridge;

import X.AbstractC05810Sj;
import X.AbstractC09720ep;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC62632SJp;
import X.AnonymousClass001;
import X.C0fY;
import X.C63280Sgf;
import X.InterfaceC65353Tih;
import X.R3F;
import X.RhX;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.systrace.SystraceMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class JavaModuleWrapper {
    public final InterfaceC65353Tih mJSInstance;
    public final ModuleHolder mModuleHolder;
    public final ArrayList mMethods = AbstractC166987dD.A1E();
    public final ArrayList mDescs = AbstractC166987dD.A1E();

    /* loaded from: classes10.dex */
    public class MethodDescriptor {
        public Method method;
        public String name;
        public String signature;
        public String type;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.facebook.react.bridge.JavaModuleWrapper$MethodDescriptor, java.lang.Object] */
    private void findMethods() {
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "findMethods", -165039546);
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                ?? obj = new Object();
                C63280Sgf c63280Sgf = new C63280Sgf(this, method, reactMethod.isBlockingSynchronousMethod());
                obj.name = name;
                String str = c63280Sgf.A02;
                obj.type = str;
                if (BaseJavaModule.METHOD_TYPE_SYNC.equals(str)) {
                    if (!c63280Sgf.A03) {
                        C63280Sgf.A01(c63280Sgf);
                    }
                    String str2 = c63280Sgf.A01;
                    AbstractC05810Sj.A00(str2);
                    obj.signature = str2;
                    obj.method = method;
                }
                this.mMethods.add(c63280Sgf);
                this.mDescs.add(obj);
            }
        }
        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 960541033);
    }

    public NativeMap getConstants() {
        String str = this.mModuleHolder.mName;
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "JavaModuleWrapper.getConstants", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A00(str, "moduleName");
        A00.A02();
        ReactMarker.logMarker(RhX.A0o, str, 0);
        BaseJavaModule module = getModule();
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "module.getConstants", -359872348);
        Map constants = module.getConstants();
        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1074781008);
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "create WritableNativeMap", -2004406670);
        ReactMarker.logMarker(RhX.A0D, str, 0);
        try {
            WritableNativeMap makeNativeMap = Arguments.makeNativeMap(constants);
            ReactMarker.logMarker(RhX.A0C, str, 0);
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1010462300);
            ReactMarker.logMarker(RhX.A0n, str, 0);
            AbstractC58322PtE.A15();
            return makeNativeMap;
        } catch (Throwable th) {
            ReactMarker.logMarker(RhX.A0C, str, 0);
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -600930734);
            ReactMarker.logMarker(RhX.A0n, str, 0);
            AbstractC58322PtE.A15();
            throw th;
        }
    }

    public List getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    public String getName() {
        return this.mModuleHolder.mName;
    }

    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        char c;
        StringBuilder A11;
        int i2;
        ArrayList arrayList = this.mMethods;
        if (i < arrayList.size()) {
            C63280Sgf c63280Sgf = (C63280Sgf) arrayList.get(i);
            InterfaceC65353Tih interfaceC65353Tih = this.mJSInstance;
            JavaModuleWrapper javaModuleWrapper = c63280Sgf.A06;
            String str = javaModuleWrapper.mModuleHolder.mName;
            Method method = c63280Sgf.A07;
            String A0g = AnonymousClass001.A0g(str, ".", method.getName());
            AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "callJavaModuleMethod", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
            A00.A00(A0g, "method");
            A00.A02();
            int i3 = 0;
            try {
                if (!c63280Sgf.A03) {
                    C63280Sgf.A01(c63280Sgf);
                }
                if (c63280Sgf.A05 != null && c63280Sgf.A04 != null) {
                    if (c63280Sgf.A00 == readableNativeArray.size()) {
                        int i4 = 0;
                        while (true) {
                            try {
                                AbstractC62632SJp[] abstractC62632SJpArr = c63280Sgf.A04;
                                if (i3 < abstractC62632SJpArr.length) {
                                    c63280Sgf.A05[i3] = abstractC62632SJpArr[i3].A00(interfaceC65353Tih, readableNativeArray, i4);
                                    if (((R3F) c63280Sgf.A04[i3]).A00 != 0) {
                                        i2 = 1;
                                    } else {
                                        i2 = 2;
                                    }
                                    i4 += i2;
                                    i3++;
                                } else {
                                    try {
                                        try {
                                            method.invoke(javaModuleWrapper.getModule(), c63280Sgf.A05);
                                            return;
                                        } catch (IllegalAccessException | IllegalArgumentException e) {
                                            throw AbstractC58318PtA.A0e(AnonymousClass001.A0R("Could not invoke ", A0g), e);
                                        }
                                    } catch (InvocationTargetException e2) {
                                        if (e2.getCause() instanceof RuntimeException) {
                                            throw ((RuntimeException) e2.getCause());
                                        }
                                        throw AbstractC58318PtA.A0e(AnonymousClass001.A0R("Could not invoke ", A0g), e2);
                                    }
                                }
                            } catch (UnexpectedNativeTypeException | NullPointerException e3) {
                                String message = e3.getMessage();
                                if (((R3F) c63280Sgf.A04[i3]).A00 != 0) {
                                    c = 1;
                                } else {
                                    c = 2;
                                }
                                if (c > 1) {
                                    A11 = AbstractC166997dE.A11("");
                                    A11.append(i4);
                                    A11.append("-");
                                    A11.append((i4 + 2) - 1);
                                } else {
                                    A11 = AbstractC166997dE.A11("");
                                    A11.append(i4);
                                }
                                throw new RuntimeException(AnonymousClass001.A13(message, " (constructing arguments for ", A0g, " at argument index ", A11.toString(), ")"), e3);
                            }
                        }
                    }
                }
            } finally {
                AbstractC58322PtE.A15();
            }
        }
    }

    public JavaModuleWrapper(InterfaceC65353Tih interfaceC65353Tih, ModuleHolder moduleHolder) {
        this.mJSInstance = interfaceC65353Tih;
        this.mModuleHolder = moduleHolder;
    }
}
