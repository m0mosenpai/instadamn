package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.TRv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64737TRv implements InvocationHandler {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16510rw A01;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean A1R = AbstractC167007dF.A1R(0, obj, method);
        boolean z = true;
        if (!C14360o3.A0K(method.getName(), "accept") || objArr == null || objArr.length != A1R) {
            z = false;
        }
        Object obj2 = null;
        boolean z2 = false;
        if (z) {
            InterfaceC16510rw interfaceC16510rw = this.A01;
            if (objArr != null) {
                obj2 = objArr[0];
            }
            C14360o3.A0B(interfaceC16510rw, 0);
            Class cls = ((C0YZ) interfaceC16510rw).A00;
            if (AbstractC13230m9.A02(cls, obj2)) {
                C14360o3.A0C(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                C14360o3.A0B(obj2, 0);
                this.A00.invoke(obj2);
                return C0eB.A00;
            }
            throw new ClassCastException(AnonymousClass001.A0R("Value cannot be cast to ", AbstractC13230m9.A00(cls)));
        }
        if (C14360o3.A0K(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == A1R) {
            if (obj == objArr[0]) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        if (C14360o3.A0K(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.A00.hashCode());
        }
        if (C14360o3.A0K(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.A00.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Unexpected method call object:");
        A1C.append(obj);
        A1C.append(", method: ");
        A1C.append(method);
        throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(objArr, ", args: ", A1C));
    }

    public C64737TRv(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16510rw interfaceC16510rw) {
        this.A01 = interfaceC16510rw;
        this.A00 = interfaceC16660sJ;
    }
}
