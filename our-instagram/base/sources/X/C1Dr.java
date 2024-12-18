package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: X.1Dr, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Dr implements InterfaceC23621Ds, InterfaceC23631Dt, Serializable {
    public final InterfaceC23621Ds completion;

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        InterfaceC23621Ds interfaceC23621Ds = this;
        while (true) {
            C1Dr c1Dr = (C1Dr) interfaceC23621Ds;
            InterfaceC23621Ds interfaceC23621Ds2 = c1Dr.completion;
            C14360o3.A0A(interfaceC23621Ds2);
            try {
                obj = c1Dr.invokeSuspend(obj);
                if (obj == C1JX.A02) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C09540e5(th);
            }
            c1Dr.releaseIntercepted();
            if (interfaceC23621Ds2 instanceof C1Dr) {
                interfaceC23621Ds = interfaceC23621Ds2;
            } else {
                interfaceC23621Ds2.resumeWith(obj);
                return;
            }
        }
    }

    public InterfaceC23631Dt getCallerFrame() {
        InterfaceC23621Ds interfaceC23621Ds = this.completion;
        if (interfaceC23621Ds instanceof InterfaceC23631Dt) {
            return (InterfaceC23631Dt) interfaceC23621Ds;
        }
        return null;
    }

    public final InterfaceC23621Ds getCompletion() {
        return this.completion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C1Dr(InterfaceC23621Ds interfaceC23621Ds) {
        this.completion = interfaceC23621Ds;
    }

    public InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        int i2;
        String A0T;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        int i3;
        Integer num;
        Class<?> cls = getClass();
        DebugMetadata debugMetadata = (DebugMetadata) cls.getAnnotation(DebugMetadata.class);
        if (debugMetadata == null) {
            return null;
        }
        int v = debugMetadata.v();
        if (v <= 1) {
            try {
                Field declaredField = cls.getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                i = i3 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 0) {
                i2 = -1;
            } else {
                i2 = debugMetadata.l()[i];
            }
            C72773Xmq c72773Xmq = XkU.A00;
            if (c72773Xmq == null) {
                try {
                    c72773Xmq = new C72773Xmq(Class.class.getDeclaredMethod("getModule", new Class[0]), cls.getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), cls.getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new Class[0]));
                    XkU.A00 = c72773Xmq;
                } catch (Exception unused2) {
                    c72773Xmq = XkU.A01;
                    XkU.A00 = c72773Xmq;
                }
            }
            String str = null;
            if (c72773Xmq != XkU.A01 && (method = c72773Xmq.A01) != null && (invoke = method.invoke(cls, new Object[0])) != null && (method2 = c72773Xmq.A00) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
                Method method3 = c72773Xmq.A02;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                }
            }
            if (str == null) {
                A0T = debugMetadata.c();
            } else {
                A0T = AnonymousClass001.A0T(str, debugMetadata.c(), '/');
            }
            return new StackTraceElement(A0T, debugMetadata.m(), debugMetadata.f(), i2);
        }
        throw new IllegalStateException(AnonymousClass001.A0n("Debug metadata version mismatch. Expected: ", ", got ", ". Please update the Kotlin standard library.", 1, v));
    }

    public InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
