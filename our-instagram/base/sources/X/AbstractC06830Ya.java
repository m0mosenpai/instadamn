package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06830Ya implements InterfaceC16520rx, Serializable {
    public static final Object NO_RECEIVER = C13210m7.A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient InterfaceC16520rx reflected;
    public final String signature;

    public abstract InterfaceC16520rx computeReflected();

    public InterfaceC16520rx compute() {
        InterfaceC16520rx interfaceC16520rx = this.reflected;
        if (interfaceC16520rx == null) {
            this.reflected = this;
            return this;
        }
        return interfaceC16520rx;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C0s5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return new C0YX(cls);
        }
        return new C0YZ(cls);
    }

    public String getSignature() {
        return this.signature;
    }

    public AbstractC06830Ya(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // X.InterfaceC16520rx
    public Object call(Object... objArr) {
        getReflected().call(objArr);
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public Object callBy(Map map) {
        getReflected().callBy(map);
        throw null;
    }

    @Override // X.InterfaceC16340rf
    public List getAnnotations() {
        getReflected().getAnnotations();
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public List getParameters() {
        getReflected().getParameters();
        throw null;
    }

    public InterfaceC16520rx getReflected() {
        InterfaceC16520rx compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new RjA();
    }

    @Override // X.InterfaceC16520rx
    public InterfaceC16500rv getReturnType() {
        getReflected().getReturnType();
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public List getTypeParameters() {
        getReflected().getTypeParameters();
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public EnumC39542HdE getVisibility() {
        getReflected().getVisibility();
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public boolean isAbstract() {
        getReflected().isAbstract();
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public boolean isFinal() {
        getReflected().isFinal();
        throw null;
    }

    @Override // X.InterfaceC16520rx
    public boolean isOpen() {
        getReflected().isOpen();
        throw null;
    }

    @Override // X.InterfaceC16520rx, X.C0YS
    public boolean isSuspend() {
        getReflected().isSuspend();
        throw null;
    }
}
