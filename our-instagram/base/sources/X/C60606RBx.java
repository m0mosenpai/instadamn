package X;

import java.lang.reflect.Method;

/* renamed from: X.RBx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60606RBx extends RC7 {
    @Override // X.RC7
    public final void A04(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Object invoke;
        if (((RC7) this).A01 == null) {
            Method method = this.A0E;
            if (method == null) {
                invoke = this.A0D.get(obj);
            } else {
                invoke = method.invoke(obj, null);
            }
            if (invoke == null || C4JK.A00.equals(invoke)) {
                return;
            }
        }
        super.A04(anonymousClass182, abstractC913345m, obj);
    }
}
