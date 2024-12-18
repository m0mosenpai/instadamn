package X;

import java.lang.reflect.Method;

/* renamed from: X.BqM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26679BqM extends C3L1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Method A01;

    public C26679BqM(Method method, int i) {
        this.A01 = method;
        this.A00 = i;
    }

    @Override // X.C3L1
    public final Object A01(Class cls) {
        C3L1.A00(cls);
        return this.A01.invoke(null, AbstractC25228BEl.A1Z(cls, this.A00));
    }
}
