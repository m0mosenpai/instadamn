package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51152Wl implements C2Wm {
    public final int A00;
    public final C12550kz A01;
    public final String A02;
    public final AtomicInteger A03;

    public C51152Wl(Object obj, int i) {
        Class cls;
        String name;
        C14360o3.A0B(obj, 1);
        this.A00 = i;
        this.A01 = new C12550kz(i);
        this.A02 = (!(obj instanceof Class) || (cls = (Class) obj) == null || (name = cls.getName()) == null) ? obj.toString() : name;
        this.A03 = new AtomicInteger(0);
    }

    @Override // X.C2Wm
    public final boolean EE6(Object obj) {
        C14360o3.A0B(obj, 0);
        try {
            boolean EE6 = this.A01.EE6(obj);
            if (EE6) {
                this.A03.incrementAndGet();
            }
            return EE6;
        } catch (IllegalStateException e) {
            throw new IllegalStateException(AnonymousClass001.A0R("Failed to release item to DefaultContentPool: ", this.A02), e);
        }
    }

    @Override // X.C2Wm
    public final Object A7I(InterfaceC50822Vd interfaceC50822Vd) {
        Object A7H = this.A01.A7H();
        if (A7H != null) {
            this.A03.decrementAndGet();
        }
        return A7H;
    }

    @Override // X.C2Wm
    public final boolean CoK(Context context, InterfaceC50822Vd interfaceC50822Vd) {
        if (this.A03.get() < this.A00) {
            return EE6(interfaceC50822Vd.ALq(context));
        }
        return false;
    }
}
